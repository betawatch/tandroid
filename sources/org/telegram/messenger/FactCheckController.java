package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class FactCheckController {
    private static org.telegram.ui.ActionBar.b2 currentDialog;
    private boolean clearedExpiredInDatabase;
    public final int currentAccount;
    private static volatile FactCheckController[] Instance = new FactCheckController[4];
    private static final Object[] lockObjects = new Object[4];
    private final LongSparseArray<TLRPC.TL_factCheck> localCache = new LongSparseArray<>();
    private final LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> toload = new LongSparseArray<>();
    private final ArrayList<Key> loading = new ArrayList<>();
    private final Runnable loadMissingRunnable = new d1(this, 19);

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class Key {
        public final long dialogId;
        public final long hash;
        public final int messageId;

        private Key(long j3, int i10, long j10) {
            this.dialogId = j3;
            this.messageId = i10;
            this.hash = j10;
        }

        public static Key of(MessageObject messageObject) {
            TLRPC.Message message;
            if (messageObject == null || (message = messageObject.messageOwner) == null || message.factcheck == null) {
                return null;
            }
            return new Key(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner.factcheck.hash);
        }

        public int hashCode() {
            long j3 = this.hash;
            return (int) (j3 ^ (j3 >>> 32));
        }
    }

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
    }

    private FactCheckController(int i10) {
        this.currentAccount = i10;
    }

    private void clearExpiredInDatabase() {
        if (this.clearedExpiredInDatabase) {
            return;
        }
        this.clearedExpiredInDatabase = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new e2(messagesStorage, 0));
    }

    private void getFromDatabase(ArrayList<Key> arrayList, Utilities.Callback<ArrayList<TLRPC.TL_factCheck>> callback) {
        if (callback == null) {
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            callback.run(new ArrayList<>());
        } else {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new f0((BaseController) messagesStorage, (ArrayList) arrayList, (Object) callback, 19));
        }
    }

    public static FactCheckController getInstance(int i10) {
        FactCheckController factCheckController;
        FactCheckController factCheckController2 = Instance[i10];
        if (factCheckController2 != null) {
            return factCheckController2;
        }
        synchronized (lockObjects[i10]) {
            try {
                factCheckController = Instance[i10];
                if (factCheckController == null) {
                    FactCheckController[] factCheckControllerArr = Instance;
                    FactCheckController factCheckController3 = new FactCheckController(i10);
                    factCheckControllerArr[i10] = factCheckController3;
                    factCheckController = factCheckController3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return factCheckController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyFactCheck$14(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$applyFactCheck$15(TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        if (tLObject instanceof TLRPC.Updates) {
            Utilities.stageQueue.postRunnable(new b2(1, this, (TLRPC.Updates) tLObject));
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                boolean z11 = tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text);
                if (z11 || !z10) {
                    w1.o(z11 ? R.string.FactCheckDeleted : R.string.FactCheckEdited, org.telegram.ui.Components.yc.a0(U), z11 ? R.raw.ic_delete : R.raw.contact_check, 36);
                }
            }
        }
        b2Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyFactCheck$16(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new di.u1(this, tLObject, tL_textWithEntities, z10, b2Var, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearExpiredInDatabase$7(MessagesStorage messagesStorage) {
        try {
            messagesStorage.getDatabase().executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getFactCheck$0(Key key, MessageObject messageObject, TLRPC.TL_factCheck tL_factCheck) {
        this.localCache.put(key.hash, tL_factCheck);
        messageObject.messageOwner.factcheck = tL_factCheck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getFromDatabase$5(MessagesStorage messagesStorage, ArrayList arrayList, Utilities.Callback callback) {
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    arrayList3.add(Long.valueOf(((Key) obj).hash));
                    arrayList2.add(null);
                }
                sQLiteCursor = database.queryFinalized("SELECT data FROM fact_checks WHERE hash IN (" + TextUtils.join(", ", arrayList3) + ")", new Object[0]);
                while (true) {
                    if (!sQLiteCursor.next()) {
                        break;
                    }
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    TLRPC.TL_factCheck TLdeserialize = TLRPC.TL_factCheck.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        int i11 = -1;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            if (TLdeserialize.hash == ((Key) arrayList.get(i12)).hash) {
                                i11 = i12;
                            }
                        }
                        if (i11 >= 0 && i11 < arrayList2.size()) {
                            arrayList2.set(i11, TLdeserialize);
                        }
                    }
                }
                sQLiteCursor.dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new d2(callback, arrayList2, 0));
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMissing$1(TLObject tLObject, TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap) {
        ArrayList arrayList2 = new ArrayList();
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                if (arrayList3.get(i10) instanceof TLRPC.TL_factCheck) {
                    arrayList2.add((TLRPC.TL_factCheck) arrayList3.get(i10));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (int i11 = 0; i11 < Math.min(tL_getFactCheck.msg_id.size(), arrayList2.size()); i11++) {
            Integer num = tL_getFactCheck.msg_id.get(i11);
            num.intValue();
            hashMap2.put(num, (TLRPC.TL_factCheck) arrayList2.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < tL_getFactCheck.msg_id.size(); i13++) {
            Key key = (Key) arrayList.get(i13);
            Integer num2 = tL_getFactCheck.msg_id.get(i13);
            num2.intValue();
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) hashMap2.get(num2);
            Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
            if (tL_factCheck != null && !tL_factCheck.need_check && callback != null) {
                callback.run(tL_factCheck);
                i12++;
                this.loading.remove(key);
            }
        }
        if (i12 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMissing$2(TLRPC.TL_getFactCheck tL_getFactCheck, ArrayList arrayList, HashMap hashMap, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new b5(this, tLObject, tL_getFactCheck, arrayList, hashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMissing$3(long j3, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
        tL_getFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            Key key = (Key) arrayList.get(i11);
            TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i11);
            if (tL_factCheck == null) {
                arrayList3.add(key);
                tL_getFactCheck.msg_id.add(Integer.valueOf(key.messageId));
            } else {
                this.loading.remove(key);
                Utilities.Callback callback = (Utilities.Callback) hashMap.get(key);
                if (callback != null) {
                    callback.run(tL_factCheck);
                    i10++;
                }
            }
        }
        if (i10 > 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.factCheckLoaded, new Object[0]);
        }
        if (tL_getFactCheck.msg_id.isEmpty()) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_getFactCheck, new h2(this, tL_getFactCheck, arrayList3, hashMap, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openFactCheckEditor$10(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        view.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openFactCheckEditor$11(zt ztVar, DialogInterface dialogInterface) {
        ztVar.requestFocus();
        AndroidUtilities.showKeyboard(ztVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openFactCheckEditor$13(zt ztVar, DialogInterface dialogInterface) {
        ztVar.requestFocus();
        AndroidUtilities.showKeyboard(ztVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openFactCheckEditor$8(zt ztVar, int i10, MessageObject messageObject, boolean z10, org.telegram.ui.ActionBar.b2 b2Var, int i11) {
        if (ztVar.getText().toString().length() > i10) {
            AndroidUtilities.shakeView(ztVar);
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {ztVar.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        applyFactCheck(messageObject, tL_textWithEntities, z10);
        b2Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveToDatabase$6(MessagesStorage messagesStorage, TLRPC.TL_factCheck tL_factCheck) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO fact_checks VALUES(?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, tL_factCheck.hash);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_factCheck.getObjectSize());
                tL_factCheck.serializeToStream(nativeByteBuffer);
                sQLitePreparedStatement.bindByteBuffer(2, nativeByteBuffer);
                sQLitePreparedStatement.bindLong(3, System.currentTimeMillis() + 889032704);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMissing() {
        while (this.toload.size() > 0) {
            long keyAt = this.toload.keyAt(0);
            HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> valueAt = this.toload.valueAt(0);
            this.toload.removeAt(0);
            ArrayList<Key> arrayList = new ArrayList<>(valueAt.keySet());
            this.loading.addAll(arrayList);
            getFromDatabase(arrayList, new f2(this, keyAt, arrayList, valueAt, 0));
        }
        this.toload.clear();
    }

    private void saveToDatabase(TLRPC.TL_factCheck tL_factCheck) {
        if (tL_factCheck == null) {
            return;
        }
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new b2(2, messagesStorage, tL_factCheck));
        clearExpiredInDatabase();
    }

    private void scheduleLoadMissing() {
        AndroidUtilities.cancelRunOnUIThread(this.loadMissingRunnable);
        AndroidUtilities.runOnUIThread(this.loadMissingRunnable, 80L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyFactCheck(MessageObject messageObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10) {
        TLRPC.TL_deleteFactCheck tL_deleteFactCheck;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck = new TLRPC.TL_editFactCheck();
            tL_editFactCheck.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_editFactCheck.msg_id = messageObject.getId();
            tL_editFactCheck.text = tL_textWithEntities;
            tL_deleteFactCheck = tL_editFactCheck;
        } else {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck2 = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
            tL_deleteFactCheck2.msg_id = messageObject.getId();
            tL_deleteFactCheck = tL_deleteFactCheck2;
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        b2Var.q(320L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_deleteFactCheck, new RequestDelegate() { // from class: org.telegram.messenger.i2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FactCheckController.this.lambda$applyFactCheck$16(tL_textWithEntities, z10, b2Var, tLObject, tL_error);
            }
        });
    }

    public TLRPC.TL_factCheck getFactCheck(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.TL_factCheck tL_factCheck;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_factCheck = message.factcheck) == null) {
            return null;
        }
        if (!tL_factCheck.need_check) {
            if (this.localCache.get(tL_factCheck.hash) == null) {
                LongSparseArray<TLRPC.TL_factCheck> longSparseArray = this.localCache;
                TLRPC.TL_factCheck tL_factCheck2 = messageObject.messageOwner.factcheck;
                longSparseArray.put(tL_factCheck2.hash, tL_factCheck2);
                saveToDatabase(messageObject.messageOwner.factcheck);
            }
            return messageObject.messageOwner.factcheck;
        }
        Key of2 = Key.of(messageObject);
        if (of2 == null || of2.messageId < 0) {
            return null;
        }
        TLRPC.TL_factCheck tL_factCheck3 = this.localCache.get(of2.hash);
        if (tL_factCheck3 != null) {
            messageObject.messageOwner.factcheck = tL_factCheck3;
            return tL_factCheck3;
        }
        if (this.loading.contains(of2)) {
            return messageObject.messageOwner.factcheck;
        }
        HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> hashMap = this.toload.get(of2.dialogId);
        if (hashMap == null) {
            LongSparseArray<HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>>> longSparseArray2 = this.toload;
            long j3 = of2.dialogId;
            HashMap<Key, Utilities.Callback<TLRPC.TL_factCheck>> hashMap2 = new HashMap<>();
            longSparseArray2.put(j3, hashMap2);
            hashMap = hashMap2;
        }
        if (!hashMap.containsKey(of2)) {
            hashMap.put(of2, new g2(this, of2, messageObject, 0));
            scheduleLoadMissing();
        }
        return messageObject.messageOwner.factcheck;
    }

    public void openFactCheckEditor(Context context, final org.telegram.ui.ActionBar.f6 f6Var, final MessageObject messageObject, boolean z10) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z11 = R != null && (R.getFragmentView() instanceof ov0) && ((ov0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f) && !z10;
        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder e2Var = z11 ? new org.telegram.ui.ActionBar.e2(context, 0, f6Var) : new AlertDialog$Builder(context, 0, f6Var);
        final TextView[] textViewArr = new TextView[1];
        boolean z12 = messageObject == null || (message = messageObject.messageOwner) == null || message.factcheck == null;
        String string = LocaleController.getString(R.string.FactCheckDialog);
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = string;
        final int i10 = MessagesController.getInstance(this.currentAccount).factcheckLengthLimit;
        final zt ztVar = new zt(context, f6Var) { // from class: org.telegram.messenger.FactCheckController.1
            org.telegram.ui.Components.p6 limit;
            org.telegram.ui.Components.h5 limitColor = new org.telegram.ui.Components.h5(this);
            private int limitCount;

            {
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
                this.limit = p6Var;
                p6Var.k(0.2f, 160L, pr.h);
                this.limit.t(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.b = 5;
            }

            @Override // android.view.View
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.r(this.limitColor.a(org.telegram.ui.ActionBar.j6.v0(this.limitCount < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, f6Var), false));
                this.limit.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                this.limit.draw(canvas);
            }

            @Override // org.telegram.ui.Components.EditTextBoldCursor
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                if (menu.findItem(R.id.menu_bold) != null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    menu.removeItem(android.R.id.shareText);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                spannableStringBuilder2.setSpan(new e51(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
                menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, LocaleController.getString(R.string.CreateLink));
                menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
            }

            @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bu, android.widget.TextView
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                super.onTextChanged(charSequence, i11, i12, i13);
                if (this.limit != null) {
                    this.limitCount = i10 - charSequence.length();
                    this.limit.b();
                    org.telegram.ui.Components.p6 p6Var = this.limit;
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    p6Var.q(str, true, true);
                }
            }

            @Override // android.widget.TextView, android.view.View
            public boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }
        };
        ztVar.lineYFix = true;
        final boolean z13 = z12;
        ztVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.messenger.FactCheckController.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                if (i11 != 6) {
                    return false;
                }
                if (ztVar.getText().toString().length() > i10) {
                    AndroidUtilities.shakeView(ztVar);
                    return true;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                CharSequence[] charSequenceArr = {ztVar.getText()};
                tL_textWithEntities2.entities = MediaDataController.getInstance(FactCheckController.this.currentAccount).getEntities(charSequenceArr, true);
                CharSequence charSequence = charSequenceArr[0];
                tL_textWithEntities2.text = charSequence == null ? "" : charSequence.toString();
                FactCheckController.this.applyFactCheck(messageObject, tL_textWithEntities2, z13);
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                if (b2VarArr[0] == FactCheckController.currentDialog) {
                    org.telegram.ui.ActionBar.b2 unused = FactCheckController.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        ztVar.setTextSize(1, 18.0f);
        ztVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, f6Var));
        ztVar.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        ztVar.setHintText(LocaleController.getString(R.string.FactCheckPlaceholder));
        ztVar.setFocusable(true);
        ztVar.setInputType(147457);
        ztVar.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
        ztVar.setImeOptions(6);
        ztVar.setBackgroundDrawable(null);
        ztVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        final TLRPC.TL_factCheck factCheck = messageObject.getFactCheck();
        if (factCheck != null && (tL_textWithEntities = factCheck.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(valueOf, factCheck.text.entities, false, true, false, false);
            ztVar.setText(valueOf);
        }
        ztVar.addTextChangedListener(new TextWatcher() { // from class: org.telegram.messenger.FactCheckController.3
            boolean ignoreTextChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (this.ignoreTextChange) {
                    return;
                }
                int length = editable.length();
                int i11 = i10;
                boolean z14 = true;
                if (length > i11) {
                    this.ignoreTextChange = true;
                    editable.delete(i11, editable.length());
                    AndroidUtilities.shakeView(ztVar);
                    try {
                        ztVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.ignoreTextChange = false;
                }
                if (textViewArr[0] != null) {
                    if (editable.length() <= 0 && factCheck != null) {
                        z14 = false;
                    }
                    textViewArr[0].setText(LocaleController.getString(z14 ? R.string.Done : R.string.Remove));
                    textViewArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z14 ? org.telegram.ui.ActionBar.j6.H5 : org.telegram.ui.ActionBar.j6.q7, false));
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(ztVar, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.c();
        e2Var.n(linearLayout);
        b2Var.a = AndroidUtilities.dp(292.0f);
        e2Var.k(LocaleController.getString(R.string.Done), new j2(this, ztVar, i10, messageObject, z13));
        e2Var.h(LocaleController.getString("Cancel", R.string.Cancel), new b(9));
        if (z11) {
            currentDialog = b2Var;
            b2VarArr[0] = b2Var;
            final int i11 = 0;
            b2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.k2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(currentFocus, dialogInterface);
                            break;
                        default:
                            AndroidUtilities.hideKeyboard((zt) currentFocus);
                            break;
                    }
                }
            });
            final int i12 = 0;
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.l2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(ztVar, dialogInterface);
                            break;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(ztVar, dialogInterface);
                            break;
                    }
                }
            });
            currentDialog.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            final int i13 = 1;
            b2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.k2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$10(ztVar, dialogInterface);
                            break;
                        default:
                            AndroidUtilities.hideKeyboard((zt) ztVar);
                            break;
                    }
                }
            });
            final int i14 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.l2
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i14) {
                        case 0:
                            FactCheckController.lambda$openFactCheckEditor$11(ztVar, dialogInterface);
                            break;
                        default:
                            FactCheckController.lambda$openFactCheckEditor$13(ztVar, dialogInterface);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
        b2Var2.h0 = false;
        View d = b2Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        ztVar.setSelection(ztVar.getText().length());
    }
}
