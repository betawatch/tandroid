package gg;

import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import ii.b5;
import ii.c5;
import ii.f6;
import ii.o3;
import ii.q5;
import ii.t5;
import ii.x3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:154|155|156|(3:203|204|(10:206|207|(2:198|199)|160|(1:162)|163|164|165|(1:(1:168))(7:170|171|172|173|174|175|176)|169))|158|(0)|160|(0)|163|164|165|(0)(0)|169) */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03a5, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0355 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.Message message;
        long j3;
        boolean z10;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        int i11 = -1;
        int i12 = 4;
        View A1 = null;
        r8 = null;
        r8 = null;
        String str3 = null;
        ArrayList arrayList = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                c2 c2Var = (c2) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                int i15 = c2Var.m;
                try {
                    MessagesStorage.getInstance(i15).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i15).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i13 < arrayList2.size() && i13 != 100) {
                            a2 a2Var = (a2) arrayList2.get(i13);
                            executeFast.requery();
                            executeFast.bindString(1, a2Var.a);
                            executeFast.bindInteger(2, a2Var.b);
                            executeFast.step();
                            i13++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList2.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i15).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList2.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((a2) arrayList2.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i15).getDatabase().commitTransaction();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                ((e2.a0) this.b).e((Typeface) this.c);
                return;
            case 2:
                hg.g gVar = (hg.g) this.b;
                TLObject tLObject = (TLObject) this.c;
                gVar.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                gVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(gVar.a).putUsers(gVar.c.users, false);
                }
                gVar.b = System.currentTimeMillis();
                gVar.f = true;
                gVar.d();
                return;
            case 3:
                hg.l0.P((hg.l0) this.b, (ld) this.c);
                return;
            case 4:
                MessagesController.getInstance(((hg.u0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 5:
                hg.g1 g1Var = (hg.g1) this.b;
                h61 h61Var = (h61) this.c;
                g1Var.getClass();
                g1Var.W(h61Var.d);
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                hg.a2 a2Var2 = (hg.a2) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, a2Var2.a);
                        sQLitePreparedStatement2.bindString(2, a2Var2.b);
                        sQLitePreparedStatement2.bindInteger(3, a2Var2.c);
                        sQLitePreparedStatement2.bindInteger(4, a2Var2.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th2;
                }
            case 7:
                hg.b2 b2Var = (hg.b2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList3 = b2Var.b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            hg.a2 a2Var3 = (hg.a2) arrayList3.get(i16);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, a2Var3.a);
                            sQLitePreparedStatement.bindString(2, a2Var3.b);
                            sQLitePreparedStatement.bindInteger(3, a2Var3.c);
                            sQLitePreparedStatement.bindInteger(4, a2Var3.f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th3;
                }
            case 8:
                hg.b2 b2Var2 = (hg.b2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = b2Var2.b;
                int i17 = b2Var2.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i17).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i17).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList5 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_quickReplies.quick_replies.size(); i18++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i18);
                        hg.a2 a2Var4 = new hg.a2();
                        a2Var4.a = tL_quickReply.shortcut_id;
                        a2Var4.b = tL_quickReply.shortcut;
                        a2Var4.f = tL_quickReply.count;
                        a2Var4.d = tL_quickReply.top_message;
                        a2Var4.c = i18;
                        int i19 = 0;
                        while (true) {
                            if (i19 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i19);
                                if (message.id != tL_quickReply.top_message) {
                                    i19++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i17, message, false, true);
                            a2Var4.e = messageObject;
                            messageObject.generateThumbs(false);
                            a2Var4.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList5.add(a2Var4);
                    }
                    arrayList = arrayList5;
                }
                b2Var2.e = false;
                if (arrayList != null) {
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                }
                b2Var2.f = true;
                b2Var2.l();
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 9:
                i2.f0 f0Var = (i2.f0) this.b;
                i2.m0 m0Var = (i2.m0) this.c;
                int i20 = f0Var.H - m0Var.b;
                f0Var.H = i20;
                if (m0Var.d) {
                    f0Var.I = m0Var.e;
                    f0Var.J = true;
                }
                if (i20 == 0) {
                    b2.k1 k1Var = ((i2.h1) m0Var.f).a;
                    if (!f0Var.j0.a.p() && k1Var.p()) {
                        f0Var.k0 = -1;
                        f0Var.l0 = 0L;
                    }
                    if (!k1Var.p()) {
                        List asList = Arrays.asList(((i2.m1) k1Var).l);
                        e2.d.g(asList.size() == f0Var.p.size());
                        for (int i21 = 0; i21 < asList.size(); i21++) {
                            ((i2.e0) f0Var.p.get(i21)).c = (b2.k1) asList.get(i21);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (f0Var.J) {
                        if (((i2.h1) m0Var.f).b.equals(f0Var.j0.b) && ((i2.h1) m0Var.f).d == f0Var.j0.s) {
                            z12 = false;
                        }
                        if (z12) {
                            if (k1Var.p() || ((i2.h1) m0Var.f).b.b()) {
                                j10 = ((i2.h1) m0Var.f).d;
                            } else {
                                i2.h1 h1Var = (i2.h1) m0Var.f;
                                u2.f0 f0Var2 = h1Var.b;
                                long j11 = h1Var.d;
                                Object obj = f0Var2.a;
                                b2.h1 h1Var2 = f0Var.o;
                                k1Var.g(obj, h1Var2);
                                j10 = j11 + h1Var2.e;
                            }
                        }
                        j3 = j10;
                        z10 = z12;
                    } else {
                        j3 = -9223372036854775807L;
                        z10 = false;
                    }
                    f0Var.J = false;
                    f0Var.z1((i2.h1) m0Var.f, 1, z10, f0Var.I, j3, -1, false);
                    return;
                }
                return;
            case 10:
                i2.c0 c0Var = (i2.c0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList6 = c0Var.a.n0;
                int size = arrayList6.size();
                while (i14 < size) {
                    Object obj2 = arrayList6.get(i14);
                    i14++;
                    ((e81) ((b2.w1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 11:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                ii.s a2 = ii.s.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = ii.s.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z11 = true;
                }
                AndroidUtilities.runOnUIThread(new ci.y0(callback2, a2 != null ? a2.a : null, z11, i12));
                return;
            case 12:
                ii.x xVar = (ii.x) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                xVar.g0 = false;
                xVar.h0 = 0;
                ci.d dVar = xVar.f0;
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
                xVar.i0 = richMessage;
                xVar.c0.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                xVar.N();
                w61 w61Var = xVar.Z;
                if (w61Var != null) {
                    w61Var.N(true);
                    return;
                }
                return;
            case 13:
                x3 x3Var = (x3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e12) {
                    FileLog.e(e12);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !sa.e.u(str)) {
                    try {
                        query = x3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e14) {
                                        e = e14;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + SharedConfig.getLastLocalId();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
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
                    openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !sa.e.u(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new x1(14, x3Var, str));
                return;
            case 14:
                ((x3) this.b).d2((String) this.c);
                return;
            case 15:
                x3 x3Var2 = (x3) this.b;
                ii.f2 f2Var = (ii.f2) this.c;
                x3Var2.getClass();
                long j12 = f2Var.a;
                int i22 = f2Var.d;
                int i23 = f2Var.c;
                ArrayList arrayList7 = x3Var2.s3;
                int i24 = 0;
                while (true) {
                    if (i24 < arrayList7.size()) {
                        if (((ii.a) arrayList7.get(i24)).a == j12) {
                            i11 = i24;
                        } else {
                            i24++;
                        }
                    }
                }
                if (i11 < 0) {
                    return;
                }
                View m10 = x3Var2.e3.m(i11);
                if (m10 instanceof f6) {
                    f6 f6Var = (f6) m10;
                    f6Var.B();
                    ii.i1 editText = f6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i23, length)), Math.max(0, Math.min(i22, length)));
                    return;
                }
                if (!(m10 instanceof q5)) {
                    if (m10 instanceof ii.m0) {
                        ii.i1 captionEditText = ((ii.m0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i23, length2)), Math.max(0, Math.min(i22, length2)));
                        return;
                    }
                    return;
                }
                q5 q5Var = (q5) m10;
                ii.i1 l4 = q5Var.l(f2Var.b);
                if (l4 == null) {
                    l4 = q5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i23, length3)), Math.max(0, Math.min(i22, length3)));
                return;
            case 16:
                o3 o3Var = (o3) this.b;
                ii.a aVar = (ii.a) this.c;
                if (aVar == null) {
                    o3Var.getClass();
                } else {
                    A1 = o3Var.e.A1(aVar);
                }
                if (A1 instanceof f6) {
                    f6 f6Var2 = (f6) A1;
                    f6Var2.B();
                    f6Var2.getEditText().setSelection(f6Var2.getEditText().length());
                    return;
                }
                return;
            case 17:
                c5 c5Var = (c5) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                boolean z13 = c5Var.e;
                boolean z14 = c5Var.d;
                b5 b5Var = c5Var.s;
                if (c5Var.w) {
                    return;
                }
                c5Var.y = 0;
                if (c5Var.c || z14 || z13) {
                    if ((tLObject4 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject4).document) != null) {
                        if (!z13) {
                            if (z14) {
                                c5Var.x = true;
                                c5Var.e();
                                b5Var.e(document);
                                return;
                            } else {
                                c5Var.x = true;
                                c5Var.e();
                                b5Var.c(document);
                                return;
                            }
                        }
                        int i25 = c5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            c5Var.x = true;
                            c5Var.e();
                            b5Var.onError();
                            return;
                        }
                        c5Var.x = true;
                        c5Var.e();
                        if (!TextUtils.isEmpty(c5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i25).setLocalPathTo(closestPhotoSizeWithSize, c5Var.F);
                            AndroidUtilities.copyFileSafe(new File(c5Var.F), FileLoader.getInstance(i25).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        b5Var.d(document);
                        return;
                    }
                } else if ((tLObject4 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject4).photo) != null) {
                    c5Var.x = true;
                    c5Var.e();
                    b5Var.b(photo);
                    return;
                }
                c5Var.x = true;
                c5Var.e();
                b5Var.onError();
                return;
            case 18:
                c5 c5Var2 = (c5) this.b;
                String str4 = (String) this.c;
                if (c5Var2.w || c5Var2.x) {
                    return;
                }
                c5Var2.a(str4);
                return;
            case 19:
                t5 m11 = ((q5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                ii.i1 i1Var = m11.a;
                i1Var.r();
                i1Var.setSelection(i1Var.length());
                return;
            case 20:
                ((j2.i) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 21:
                ((j2.i) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 22:
                ((j2.i) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 23:
                ((j2.i) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 24:
                ((j2.i) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 25:
                n4.y yVar = (n4.y) this.b;
                String str5 = (String) this.c;
                k2.k kVar = (k2.k) yVar.c;
                String str6 = e2.d0.a;
                j2.f fVar = ((i2.c0) kVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.c(p5, str5, 27));
                return;
            case 26:
                ((k2.o) this.b).A((k2.l) this.c);
                return;
            case 27:
                ((ki.i) this.b).F((ki.l0) this.c);
                return;
            case 28:
                ki.i iVar = (ki.i) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                iVar.d();
                ki.l lVar = iVar.w;
                if (lVar != null) {
                    long l10 = lVar.l();
                    ki.q qVar = iVar.v;
                    if (qVar != null && l10 != Long.MAX_VALUE) {
                        qVar.i = Math.max(0L, l10) * 1000;
                        Handler handler = qVar.m;
                        if (handler != null) {
                            handler.removeCallbacks(qVar.e0);
                        }
                    }
                }
                iVar.h();
                ki.l lVar2 = iVar.w;
                if (lVar2 != null) {
                    lVar2.q();
                    iVar.w = null;
                }
                handlerThread.quitSafely();
                return;
            default:
                ki.q qVar2 = (ki.q) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                qVar2.getClass();
                try {
                    try {
                        qVar2.e();
                        qVar2.Z = true;
                    } catch (RuntimeException e15) {
                        qVar2.d0 = e15;
                        qVar2.f();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
