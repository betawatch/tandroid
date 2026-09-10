package fg;

import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import di.b5;
import gg.j2;
import gg.k2;
import hi.c5;
import hi.d5;
import hi.g6;
import hi.q3;
import hi.r5;
import hi.u5;
import hi.z3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        of.b bVar = (of.b) this.b;
        String str = (String) this.c;
        k2.j jVar = (k2.j) bVar.c;
        String str2 = e2.d0.a;
        j2.e eVar = ((i2.b0) jVar).a.s;
        j2.a p5 = eVar.p();
        eVar.q(p5, 1012, new j2.d(p5, str, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        ki.k kVar = (ki.k) this.b;
        ki.j jVar = (ki.j) this.c;
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = jVar.b.getInputStream();
            while (true) {
                synchronized (kVar.a) {
                    while (!kVar.p && kVar.k.get(Integer.valueOf(jVar.a)) == jVar && (!kVar.o || !jVar.e || jVar.c == 0)) {
                        try {
                            kVar.a.wait();
                        } finally {
                        }
                    }
                    if (kVar.p || kVar.k.get(Integer.valueOf(jVar.a)) != jVar) {
                        break;
                    }
                    int read = inputStream.read(bArr, 0, (int) Math.min(65536L, jVar.c));
                    if (read < 0) {
                        kVar.c(jVar, true);
                        return;
                    }
                    if (read != 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        synchronized (kVar.a) {
                            try {
                                if (kVar.p || kVar.k.get(Integer.valueOf(jVar.a)) != jVar || !kVar.o) {
                                    break;
                                }
                                jVar.c -= read;
                                kVar.j(2, jVar.a, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            kVar.c(jVar, true);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:302|(2:303|304)|(3:351|352|(10:354|355|(2:346|347)|308|(1:310)|311|312|313|(1:(1:316))(7:318|319|320|321|322|323|324)|317))|306|(0)|308|(0)|311|312|313|(0)(0)|317) */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0569, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x05bc, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x056b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0527 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019f A[LOOP:0: B:4:0x0013->B:35:0x019f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        View y12;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                String str3 = (String) this.c;
                w1Var.I = str3;
                if (w1Var.r) {
                    w1Var.f.g(str3, true, false, w1Var.s, w1Var.v, w1Var.x, w1Var.w, -1, 1);
                }
                int i11 = UserConfig.selectedAccount;
                ArrayList arrayList = new ArrayList(ContactsController.getInstance(i11).contacts);
                w1Var.y = true;
                int i12 = w1Var.F;
                w1Var.F = i12 + 1;
                w1Var.E = i12;
                w1Var.l();
                Utilities.searchQueue.postRunnable(new b5(w1Var, str3, i12, arrayList, i11, 1));
                return;
            case 1:
                d2 d2Var = (d2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                int i13 = d2Var.m;
                try {
                    MessagesStorage.getInstance(i13).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i13).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size() && i14 != 100) {
                            b2 b2Var = (b2) arrayList2.get(i14);
                            executeFast.requery();
                            executeFast.bindString(1, b2Var.a);
                            executeFast.bindInteger(2, b2Var.b);
                            executeFast.step();
                            i14++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList2.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i13).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList2.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((b2) arrayList2.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i13).getDatabase().commitTransaction();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                gg.f fVar = (gg.f) this.b;
                TLObject tLObject = (TLObject) this.c;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(fVar.a).putUsers(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                return;
            case 3:
                gg.p0.R((gg.p0) this.b, (zd) this.c);
                return;
            case 4:
                MessagesController.getInstance(((gg.y0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 5:
                gg.m1 m1Var = (gg.m1) this.b;
                v51 v51Var = (v51) this.c;
                m1Var.getClass();
                m1Var.X(v51Var.d);
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                j2 j2Var = (j2) this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, j2Var.a);
                        sQLitePreparedStatement.bindString(2, j2Var.b);
                        sQLitePreparedStatement.bindInteger(3, j2Var.c);
                        sQLitePreparedStatement.bindInteger(4, j2Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 7:
                k2 k2Var = (k2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList3 = k2Var.b;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            j2 j2Var2 = (j2) arrayList3.get(i15);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, j2Var2.a);
                            sQLitePreparedStatement2.bindString(2, j2Var2.b);
                            sQLitePreparedStatement2.bindInteger(3, j2Var2.c);
                            sQLitePreparedStatement2.bindInteger(4, j2Var2.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 8:
                k2 k2Var2 = (k2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = k2Var2.b;
                int i16 = k2Var2.a;
                ArrayList arrayList5 = null;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    MessagesController.getInstance(i16).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i16).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList6 = new ArrayList();
                    for (int i17 = 0; i17 < tL_messages_quickReplies.quick_replies.size(); i17++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i17);
                        j2 j2Var3 = new j2();
                        j2Var3.a = tL_quickReply.shortcut_id;
                        j2Var3.b = tL_quickReply.shortcut;
                        j2Var3.f = tL_quickReply.count;
                        j2Var3.d = tL_quickReply.top_message;
                        j2Var3.c = i17;
                        int i18 = 0;
                        while (true) {
                            if (i18 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i18);
                                if (message.id != tL_quickReply.top_message) {
                                    i18++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i16, message, false, true);
                            j2Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            j2Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList6.add(j2Var3);
                    }
                    arrayList5 = arrayList6;
                }
                k2Var2.e = false;
                if (arrayList5 != null) {
                    arrayList4.clear();
                    arrayList4.addAll(arrayList5);
                }
                k2Var2.f = true;
                k2Var2.l();
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 9:
                ((e2.a0) this.b).e((Typeface) this.c);
                return;
            case 10:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                boolean z10 = false;
                hi.t a2 = hi.t.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = hi.t.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z10 = true;
                }
                AndroidUtilities.runOnUIThread(new bi.c1(callback2, a2 != null ? a2.a : null, z10, 4));
                return;
            case 11:
                hi.y yVar = (hi.y) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                yVar.g0 = false;
                yVar.h0 = 0;
                bi.d dVar = yVar.f0;
                dVar.setLoading(false);
                if (!(tLObject3 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject3).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                yVar.i0 = richMessage;
                yVar.c0.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                yVar.P();
                j61 j61Var = yVar.Z;
                if (j61Var != null) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 12:
                z3 z3Var = (z3) this.b;
                Uri uri = (Uri) this.c;
                String str4 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e11) {
                    FileLog.e(e11);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !w.f.o(str)) {
                    try {
                        query = z3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e12) {
                        e = e12;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = z3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str4;
                        if (TextUtils.isEmpty(str)) {
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e13) {
                                        e = e13;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = z3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str4;
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + SharedConfig.getLastLocalId();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = z3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str4 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str4;
                            }
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = z3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str4;
                }
                if (TextUtils.isEmpty(str) || !w.f.o(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new s1(13, z3Var, str));
                return;
            case 13:
                ((z3) this.b).b2((String) this.c);
                return;
            case 14:
                z3 z3Var2 = (z3) this.b;
                hi.h2 h2Var = (hi.h2) this.c;
                z3Var2.getClass();
                long j3 = h2Var.a;
                int i19 = h2Var.d;
                int i20 = h2Var.c;
                ArrayList arrayList7 = z3Var2.l3;
                int i21 = 0;
                while (true) {
                    if (i21 >= arrayList7.size()) {
                        i21 = -1;
                    } else if (((hi.a) arrayList7.get(i21)).a != j3) {
                        i21++;
                    }
                }
                if (i21 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = z3Var2.X2.m(i21);
                if (m10 instanceof g6) {
                    g6 g6Var = (g6) m10;
                    g6Var.B();
                    hi.k1 editText = g6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i20, length)), Math.max(0, Math.min(i19, length)));
                    return;
                }
                if (!(m10 instanceof r5)) {
                    if (m10 instanceof hi.n0) {
                        hi.k1 captionEditText = ((hi.n0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i20, length2)), Math.max(0, Math.min(i19, length2)));
                        return;
                    }
                    return;
                }
                r5 r5Var = (r5) m10;
                hi.k1 l4 = r5Var.l(h2Var.b);
                if (l4 == null) {
                    l4 = r5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i20, length3)), Math.max(0, Math.min(i19, length3)));
                return;
            case 15:
                q3 q3Var = (q3) this.b;
                hi.a aVar = (hi.a) this.c;
                if (aVar == null) {
                    q3Var.getClass();
                    y12 = null;
                } else {
                    y12 = q3Var.e.y1(aVar);
                }
                if (y12 instanceof g6) {
                    g6 g6Var2 = (g6) y12;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(g6Var2.getEditText().length());
                    return;
                }
                return;
            case 16:
                d5 d5Var = (d5) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                boolean z11 = d5Var.e;
                boolean z12 = d5Var.d;
                c5 c5Var = d5Var.s;
                if (d5Var.w) {
                    return;
                }
                d5Var.y = 0;
                if (d5Var.c || z12 || z11) {
                    if ((tLObject4 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject4).document) != null) {
                        if (!z11) {
                            if (z12) {
                                d5Var.x = true;
                                d5Var.e();
                                c5Var.e(document);
                                return;
                            } else {
                                d5Var.x = true;
                                d5Var.e();
                                c5Var.c(document);
                                return;
                            }
                        }
                        int i22 = d5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            d5Var.x = true;
                            d5Var.e();
                            c5Var.onError();
                            return;
                        }
                        d5Var.x = true;
                        d5Var.e();
                        if (!TextUtils.isEmpty(d5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i22).setLocalPathTo(closestPhotoSizeWithSize, d5Var.F);
                            AndroidUtilities.copyFileSafe(new File(d5Var.F), FileLoader.getInstance(i22).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        c5Var.d(document);
                        return;
                    }
                } else if ((tLObject4 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject4).photo) != null) {
                    d5Var.x = true;
                    d5Var.e();
                    c5Var.b(photo);
                    return;
                }
                d5Var.x = true;
                d5Var.e();
                c5Var.onError();
                return;
            case 17:
                d5 d5Var2 = (d5) this.b;
                String str5 = (String) this.c;
                if (d5Var2.w || d5Var2.x) {
                    return;
                }
                d5Var2.a(str5);
                return;
            case 18:
                u5 m11 = ((r5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                hi.k1 k1Var = m11.a;
                k1Var.r();
                k1Var.setSelection(k1Var.length());
                return;
            case 19:
                i2.e0 e0Var = (i2.e0) this.b;
                i2.k0 k0Var = (i2.k0) this.c;
                int i23 = e0Var.H - k0Var.b;
                e0Var.H = i23;
                boolean z13 = true;
                if (k0Var.d) {
                    e0Var.I = k0Var.e;
                    e0Var.J = true;
                }
                if (i23 == 0) {
                    b2.k1 k1Var2 = ((i2.f1) k0Var.f).a;
                    if (!e0Var.j0.a.p() && k1Var2.p()) {
                        e0Var.k0 = -1;
                        e0Var.l0 = 0L;
                    }
                    if (!k1Var2.p()) {
                        List asList = Arrays.asList(((i2.k1) k1Var2).l);
                        e2.d.g(asList.size() == e0Var.p.size());
                        for (int i24 = 0; i24 < asList.size(); i24++) {
                            ((i2.d0) e0Var.p.get(i24)).c = (b2.k1) asList.get(i24);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (e0Var.J) {
                        if (((i2.f1) k0Var.f).b.equals(e0Var.j0.b) && ((i2.f1) k0Var.f).d == e0Var.j0.s) {
                            z13 = false;
                        }
                        if (z13) {
                            if (k1Var2.p() || ((i2.f1) k0Var.f).b.b()) {
                                j10 = ((i2.f1) k0Var.f).d;
                            } else {
                                i2.f1 f1Var = (i2.f1) k0Var.f;
                                u2.g0 g0Var = f1Var.b;
                                long j11 = f1Var.d;
                                Object obj = g0Var.a;
                                b2.h1 h1Var = e0Var.o;
                                k1Var2.g(obj, h1Var);
                                j10 = j11 + h1Var.e;
                            }
                        }
                    } else {
                        z13 = false;
                    }
                    e0Var.J = false;
                    e0Var.z1((i2.f1) k0Var.f, 1, z13, e0Var.I, j10, -1, false);
                    return;
                }
                return;
            case 20:
                i2.b0 b0Var = (i2.b0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList8 = b0Var.a.n0;
                int size = arrayList8.size();
                int i25 = 0;
                while (i25 < size) {
                    Object obj2 = arrayList8.get(i25);
                    i25++;
                    ((t71) ((b2.w1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 21:
                ((j2.i) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 22:
                ((j2.i) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 23:
                ((j2.i) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 24:
                ((j2.i) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 25:
                ((j2.i) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 26:
                a();
                return;
            case 27:
                ((k2.n) this.b).Z((k2.k) this.c);
                return;
            case 28:
                b();
                return;
            default:
                ki.k kVar = (ki.k) this.b;
                byte[] bArr = (byte[]) this.c;
                int i26 = 0;
                int i27 = 0;
                while (i27 < bArr.length) {
                    if (bArr.length - i27 < 8) {
                        kVar.f();
                        return;
                    }
                    int i28 = bArr[i27] & 255;
                    int i29 = ((bArr[i27 + 1] & 255) << 16) | ((bArr[i27 + 2] & 255) << 8) | (bArr[i27 + 3] & 255);
                    long j12 = ((bArr[i27 + 4] & 255) << 24) | ((bArr[i27 + 5] & 255) << 16) | ((bArr[i27 + 6] & 255) << 8) | (255 & bArr[i27 + 7]);
                    int i30 = i27 + 8;
                    long j13 = i30 + j12;
                    if (j12 > 1048576 || j13 > bArr.length) {
                        kVar.f();
                        return;
                    }
                    int i31 = (int) j12;
                    byte[] bArr2 = new byte[i31];
                    System.arraycopy(bArr, i30, bArr2, i26, i31);
                    boolean z14 = true;
                    if (i29 != 0) {
                        synchronized (kVar.a) {
                            try {
                                ki.j jVar = (ki.j) kVar.k.get(Integer.valueOf(i29));
                                if (jVar == null) {
                                    if (i28 != 2 && i28 != 4 && i28 != 3) {
                                        z14 = false;
                                    }
                                } else if (i28 == 2) {
                                    if (i31 != 0) {
                                        synchronized (kVar.a) {
                                            try {
                                                long j14 = jVar.d;
                                                long j15 = i31;
                                                if (j14 >= j15) {
                                                    jVar.d = j14 - j15;
                                                    try {
                                                        jVar.b.getOutputStream().write(bArr2);
                                                        synchronized (kVar.a) {
                                                            try {
                                                                if (kVar.k.get(Integer.valueOf(jVar.a)) == jVar) {
                                                                    jVar.d += j15;
                                                                    kVar.j(4, jVar.a, ByteBuffer.allocate(4).putInt(i31).array());
                                                                }
                                                            } catch (Throwable th6) {
                                                                throw th6;
                                                                break;
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                        kVar.c(jVar, true);
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                } else if (i28 == 4 && i31 == 4) {
                                    long j16 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                                    if (j16 != 0) {
                                        synchronized (kVar.a) {
                                            try {
                                                long j17 = jVar.c;
                                                if (j17 <= 4294967295L - j16) {
                                                    jVar.c = j17 + j16;
                                                    kVar.a.notifyAll();
                                                    z14 = true;
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                } else {
                                    if (i28 == 3 && i31 == 0) {
                                        kVar.c(jVar, false);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                    }
                                }
                            } finally {
                            }
                        }
                        if (!z14) {
                        }
                    } else if (i28 == 17 && i31 == 0) {
                        synchronized (kVar.a) {
                            try {
                                if (!kVar.p && !kVar.o) {
                                    kVar.o = true;
                                    ArrayList arrayList9 = new ArrayList(kVar.k.values());
                                    int size2 = arrayList9.size();
                                    int i32 = 0;
                                    while (i32 < size2) {
                                        Object obj3 = arrayList9.get(i32);
                                        i32++;
                                        ki.j jVar2 = (ki.j) obj3;
                                        jVar2.e = true;
                                        kVar.j(1, jVar2.a, null);
                                    }
                                    ki.d dVar2 = kVar.s;
                                    kVar.a.notifyAll();
                                    if (dVar2 != null) {
                                        AndroidUtilities.runOnUIThread(new gg.v1(dVar2, 18));
                                    }
                                }
                            } finally {
                            }
                        }
                        if (!z14) {
                        }
                    } else if (i28 == 5 && i31 <= 64) {
                        kVar.j(6, i26, bArr2);
                        if (!z14) {
                            kVar.f();
                            return;
                        } else {
                            i27 = (int) j13;
                            i26 = 0;
                        }
                    }
                    z14 = false;
                    if (!z14) {
                    }
                }
                return;
        }
    }
}
