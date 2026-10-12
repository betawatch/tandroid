package org.telegram.messenger.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import bi.g1;
import di.d4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.gt0;
import org.telegram.ui.iv0;
import org.telegram.ui.jr;
import org.telegram.ui.kr;
import org.telegram.ui.tq;
import org.telegram.ui.yr;
import yh.p1;
import yh.q1;
import zh.e7;
import zh.f5;
import zh.h8;
import zh.l5;
import zh.m5;
import zh.n5;
import zh.q7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x055d, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ct(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0566, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x055a, code lost:
    
        if (r5 == null) goto L163;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String formatString;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str2;
        int i10 = 3;
        int i11 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.c, (TLRPC.TL_error) this.e, (Runnable) this.f);
                return;
            case 1:
                yr yrVar = (yr) this.d;
                long j10 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str3 = (String) this.f;
                TLObject tLObject = (TLObject) this.c;
                tq tqVar = new tq(j10, yrVar.N, null, yrVar.E, tL_chatBannedRights, str3, 1, true, false, null);
                tqVar.X0 = new jr(yrVar, tLObject);
                yrVar.presentFragment(tqVar);
                return;
            case 2:
                yr yrVar2 = (yr) this.d;
                long j11 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                tq tqVar2 = new tq(j11, yrVar2.N, tL_chatAdminRights, null, null, str4, 0, true, false, null);
                tqVar2.X0 = new kr(yrVar2, tLObject2);
                yrVar2.presentFragment(tqVar2);
                return;
            case 3:
                dt dtVar = (dt) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                long j12 = this.b;
                String str5 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i14)).longValue());
                            sQLitePreparedStatement.bindLong(2, j12);
                            sQLitePreparedStatement.bindString(3, str5);
                            sQLitePreparedStatement.bindInteger(4, i14);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
            case 4:
                dt dtVar2 = (dt) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.c;
                long j13 = this.b;
                String str6 = (String) this.e;
                ct ctVar = (ct) this.f;
                MessagesController.getInstance(dtVar2.a).putUsers(arrayList2, true);
                dtVar2.h.addAll(arrayList2);
                dtVar2.f = j13;
                dtVar2.g = str6;
                dtVar2.e = TextUtils.isEmpty(str6);
                dtVar2.d = true;
                ctVar.run();
                return;
            case 5:
                a2 a2Var = (a2) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j14 = this.b;
                AccountInstance accountInstance = (AccountInstance) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject3 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject3;
                    w80.G = joinaspeers.peers;
                    w80.I = j14;
                    w80.H = SystemClock.elapsedRealtime();
                    w80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    booleanCallback.run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                long j15 = this.b;
                String str7 = (String) this.e;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry.coverSavedPosition = j15;
                photoEntry.coverPath = str7;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.q5.b.setLoading(false);
                iv0 iv0Var = photoViewer.d;
                if (iv0Var != null) {
                    iv0Var.W(photoViewer.P4);
                }
                gt0 gt0Var = photoViewer.g1;
                if (gt0Var != null) {
                    gt0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.N0;
                if (checkBox.x) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                long j16 = this.b;
                zArr[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity.x5);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((TL_stories.StoryItem) arrayList3.get(i15)).pinned = zArr2[i15];
                }
                profileActivity.getMessagesController().getStoriesController().n0(j16, arrayList3, false);
                return;
            case 8:
                p1 p1Var = (p1) this.d;
                f5 f5Var = (f5) this.c;
                long j17 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                Context context = (Context) this.f;
                yh.v0 v0Var = p1Var.l0;
                int i16 = 0;
                while (i16 < i11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i16 == i12) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i17 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i12];
                        objArr[i13] = p1Var.e0;
                        formatString = LocaleController.formatString(i17, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str8 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i18 = i13;
                    while (i13 < f5Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f5Var.l.get(i13);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str8;
                        } else {
                            str = str8;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i13++;
                        str8 = str;
                        i10 = 3;
                    }
                    String str9 = str8;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i19 = R.string.Gift2StarsInfoProfileLink;
                        Object[] objArr2 = new Object[1];
                        objArr2[i18] = DialogObject.getShortName(j17);
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(i19, objArr2).replaceAll(str9, " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new b6(document2, v0Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new ri.e(p1Var, callback, j17, 2)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new ei.a(context, 5)), true));
                    }
                    TextView textView = i16 == 0 ? v0Var : p1Var.m0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(d4.a(textView.getText(), textView.getPaint()));
                    i16++;
                    i13 = i18;
                    i10 = 3;
                    i11 = 2;
                    i12 = 1;
                }
                return;
            case 9:
                zh.p pVar = (zh.p) this.d;
                a2 a2Var2 = (a2) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                long j18 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                pVar.getClass();
                a2Var2.dismiss();
                if (tLObject4 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject4;
                    MessagesController.getInstance(pVar.a).putUsers(connectedstarrefbots.users, false);
                    while (i13 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i13).bot_id == j18 && !connectedstarrefbots.connected_bots.get(i13).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i13));
                            return;
                        }
                        i13++;
                    }
                }
                callback2.run(null);
                return;
            case 10:
                n5 n5Var = (n5) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                MessageObject messageObject = (MessageObject) this.e;
                long j19 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i20 = n5Var.a;
                if (!(tLObject5 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject5;
                MessagesController.getInstance(i20).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i20).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    n5Var.l0(messageObject, j19, runnable, true);
                    return;
                }
            case 11:
                n5 n5Var2 = (n5) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j20 = this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (n5Var2.e) {
                    n5Var2.g(j20, tLObject6, tL_textWithEntities, callback22);
                    return;
                } else {
                    n5.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 12:
                n5 n5Var3 = (n5) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j21 = this.b;
                if (n5Var3.e) {
                    n5Var3.h(tL_payments_paymentFormStarGift, starGift2, j21, null, true, callback23);
                    return;
                } else {
                    n5.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.c;
                CharSequence charSequence = (CharSequence) this.e;
                long j22 = this.b;
                String str10 = (String) this.f;
                AndroidUtilities.runOnUIThread(new q1(profileActivity2, i11), 200L);
                zc a02 = zc.a0(profileActivity2);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j22, str10));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 14:
                m5 m5Var = (m5) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                long j23 = this.b;
                m5Var.getClass();
                if (tLObject7 != null) {
                    Utilities.stageQueue.postRunnable(new zh.m(15, messagesController, tLObject7));
                    return;
                }
                if (tL_error != null) {
                    m5Var.b.addPaidReactions((int) (-m5Var.h), m5Var.g, m5Var.c());
                    NotificationCenter.getInstance(m5Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(m5Var.b.getDialogId()), Integer.valueOf(m5Var.b.getId()), m5Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (m5Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(m5Var.c.getMessagesController().getUser(Long.valueOf(m5Var.a.a)));
                        } else {
                            TLRPC.Chat chat = m5Var.c.getMessagesController().getChat(Long.valueOf(-m5Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str11 = str2;
                        Context parentActivity = m5Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.G1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new e7(parentActivity, m5Var.c.getResourceProvider(), j23, 5, str11, new l5(m5Var, j23, i12), 0L).show();
                    }
                    m5Var.q.T(false);
                    m5Var.q.P();
                    return;
                }
                return;
            default:
                h8 h8Var = (h8) this.d;
                long j24 = this.b;
                n5 n5Var4 = (n5) this.c;
                MessageObject messageObject2 = (MessageObject) this.e;
                fo foVar = (fo) this.f;
                a1.c cVar = h8Var.Q;
                if (cVar == null) {
                    m5 d02 = n5Var4.d0(messageObject2, foVar, j24, false, true, Long.valueOf(h8Var.E));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new zh.m(17, h8Var, d02));
                    return;
                }
                int intValue = g1.a((g1) cVar.b, Long.valueOf(j24)).intValue();
                h8Var.P = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    h8Var.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new q7(h8Var, i13));
                    return;
                }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = j10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j10;
    }

    public /* synthetic */ f(yr yrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = yrVar;
        this.b = j10;
        this.e = tLObject;
        this.f = str;
        this.c = tLObject2;
    }

    public /* synthetic */ f(zh.p pVar, a2 a2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.a = 9;
        this.d = pVar;
        this.e = a2Var;
        this.c = tLObject;
        this.b = j10;
        this.f = callback;
    }

    public /* synthetic */ f(m5 m5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.a = 14;
        this.d = m5Var;
        this.c = tLObject;
        this.f = messagesController;
        this.e = tL_error;
        this.b = j10;
    }

    public /* synthetic */ f(n5 n5Var, Utilities.Callback2 callback2, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 11;
        this.d = n5Var;
        this.e = callback2;
        this.b = j10;
        this.c = tLObject;
        this.f = tL_textWithEntities;
    }
}
