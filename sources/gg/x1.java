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
import android.text.TextUtils;
import android.view.View;
import ii.a5;
import ii.d6;
import ii.n3;
import ii.o5;
import ii.r5;
import ii.w3;
import ii.z4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

    /* JADX WARN: Can't wrap try/catch for region: R(12:132|(2:133|134)|(3:181|182|(10:184|185|(2:176|177)|138|(1:140)|141|142|143|(1:(1:146))(7:148|149|150|151|152|153|154)|147))|136|(0)|138|(0)|141|142|143|(0)(0)|147) */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x030f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0361, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        View z12 = null;
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
        boolean z13 = true;
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
                } catch (Exception e) {
                    FileLog.e(e);
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
                hg.m0.R((hg.m0) this.b, (id) this.c);
                return;
            case 4:
                MessagesController.getInstance(((hg.v0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 5:
                hg.h1 h1Var = (hg.h1) this.b;
                i51 i51Var = (i51) this.c;
                h1Var.getClass();
                h1Var.X(i51Var.d);
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                hg.b2 b2Var = (hg.b2) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, b2Var.a);
                        sQLitePreparedStatement2.bindString(2, b2Var.b);
                        sQLitePreparedStatement2.bindInteger(3, b2Var.c);
                        sQLitePreparedStatement2.bindInteger(4, b2Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                hg.c2 c2Var2 = (hg.c2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList3 = c2Var2.b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            hg.b2 b2Var2 = (hg.b2) arrayList3.get(i16);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, b2Var2.a);
                            sQLitePreparedStatement.bindString(2, b2Var2.b);
                            sQLitePreparedStatement.bindInteger(3, b2Var2.c);
                            sQLitePreparedStatement.bindInteger(4, b2Var2.f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                hg.c2 c2Var3 = (hg.c2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = c2Var3.b;
                int i17 = c2Var3.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i17).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i17).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList5 = new ArrayList();
                    for (int i18 = 0; i18 < tL_messages_quickReplies.quick_replies.size(); i18++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i18);
                        hg.b2 b2Var3 = new hg.b2();
                        b2Var3.a = tL_quickReply.shortcut_id;
                        b2Var3.b = tL_quickReply.shortcut;
                        b2Var3.f = tL_quickReply.count;
                        b2Var3.d = tL_quickReply.top_message;
                        b2Var3.c = i18;
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
                            b2Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            b2Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList5.add(b2Var3);
                    }
                    arrayList = arrayList5;
                }
                c2Var3.e = false;
                if (arrayList != null) {
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                }
                c2Var3.f = true;
                c2Var3.l();
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 9:
                i2.e0 e0Var = (i2.e0) this.b;
                i2.l0 l0Var = (i2.l0) this.c;
                int i20 = e0Var.H - l0Var.b;
                e0Var.H = i20;
                if (l0Var.d) {
                    e0Var.I = l0Var.e;
                    e0Var.J = true;
                }
                if (i20 == 0) {
                    b2.k1 k1Var = ((i2.g1) l0Var.f).a;
                    if (!e0Var.j0.a.p() && k1Var.p()) {
                        e0Var.k0 = -1;
                        e0Var.l0 = 0L;
                    }
                    if (!k1Var.p()) {
                        List asList = Arrays.asList(((i2.l1) k1Var).l);
                        e2.d.g(asList.size() == e0Var.p.size());
                        for (int i21 = 0; i21 < asList.size(); i21++) {
                            ((i2.d0) e0Var.p.get(i21)).c = (b2.k1) asList.get(i21);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (e0Var.J) {
                        if (((i2.g1) l0Var.f).b.equals(e0Var.j0.b) && ((i2.g1) l0Var.f).d == e0Var.j0.s) {
                            z13 = false;
                        }
                        if (z13) {
                            if (k1Var.p() || ((i2.g1) l0Var.f).b.b()) {
                                j10 = ((i2.g1) l0Var.f).d;
                            } else {
                                i2.g1 g1Var = (i2.g1) l0Var.f;
                                u2.f0 f0Var = g1Var.b;
                                long j11 = g1Var.d;
                                Object obj = f0Var.a;
                                b2.h1 h1Var2 = e0Var.o;
                                k1Var.g(obj, h1Var2);
                                j10 = j11 + h1Var2.e;
                            }
                        }
                        j3 = j10;
                        z10 = z13;
                    } else {
                        j3 = -9223372036854775807L;
                        z10 = false;
                    }
                    e0Var.J = false;
                    e0Var.z1((i2.g1) l0Var.f, 1, z10, e0Var.I, j3, -1, false);
                    return;
                }
                return;
            case 10:
                i2.b0 b0Var = (i2.b0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList6 = b0Var.a.n0;
                int size = arrayList6.size();
                while (i14 < size) {
                    Object obj2 = arrayList6.get(i14);
                    i14++;
                    ((g71) ((b2.w1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
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
                xVar.P();
                w51 w51Var = xVar.Z;
                if (w51Var != null) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 13:
                w3 w3Var = (w3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e11) {
                    FileLog.e(e11);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !w.c.p(str)) {
                    try {
                        query = w3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e12) {
                        e = e12;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = w3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
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
                                        openInputStream = w3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
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
                                openInputStream = w3Var.getContext().getContentResolver().openInputStream(uri);
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
                        } finally {
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = w3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !w.c.p(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new x1(14, w3Var, str));
                return;
            case 14:
                ((w3) this.b).c2((String) this.c);
                return;
            case 15:
                w3 w3Var2 = (w3) this.b;
                ii.e2 e2Var = (ii.e2) this.c;
                w3Var2.getClass();
                long j12 = e2Var.a;
                int i22 = e2Var.d;
                int i23 = e2Var.c;
                ArrayList arrayList7 = w3Var2.l3;
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
                View m10 = w3Var2.X2.m(i11);
                if (m10 instanceof d6) {
                    d6 d6Var = (d6) m10;
                    d6Var.B();
                    ii.i1 editText = d6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i23, length)), Math.max(0, Math.min(i22, length)));
                    return;
                }
                if (!(m10 instanceof o5)) {
                    if (m10 instanceof ii.m0) {
                        ii.i1 captionEditText = ((ii.m0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i23, length2)), Math.max(0, Math.min(i22, length2)));
                        return;
                    }
                    return;
                }
                o5 o5Var = (o5) m10;
                ii.i1 l4 = o5Var.l(e2Var.b);
                if (l4 == null) {
                    l4 = o5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i23, length3)), Math.max(0, Math.min(i22, length3)));
                return;
            case 16:
                n3 n3Var = (n3) this.b;
                ii.a aVar = (ii.a) this.c;
                if (aVar == null) {
                    n3Var.getClass();
                } else {
                    z12 = n3Var.e.z1(aVar);
                }
                if (z12 instanceof d6) {
                    d6 d6Var2 = (d6) z12;
                    d6Var2.B();
                    d6Var2.getEditText().setSelection(d6Var2.getEditText().length());
                    return;
                }
                return;
            case 17:
                a5 a5Var = (a5) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                boolean z14 = a5Var.e;
                boolean z15 = a5Var.d;
                z4 z4Var = a5Var.s;
                if (a5Var.w) {
                    return;
                }
                a5Var.y = 0;
                if (a5Var.c || z15 || z14) {
                    if ((tLObject4 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject4).document) != null) {
                        if (!z14) {
                            if (z15) {
                                a5Var.x = true;
                                a5Var.e();
                                z4Var.e(document);
                                return;
                            } else {
                                a5Var.x = true;
                                a5Var.e();
                                z4Var.c(document);
                                return;
                            }
                        }
                        int i25 = a5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            a5Var.x = true;
                            a5Var.e();
                            z4Var.onError();
                            return;
                        }
                        a5Var.x = true;
                        a5Var.e();
                        if (!TextUtils.isEmpty(a5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i25).setLocalPathTo(closestPhotoSizeWithSize, a5Var.F);
                            AndroidUtilities.copyFileSafe(new File(a5Var.F), FileLoader.getInstance(i25).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        z4Var.d(document);
                        return;
                    }
                } else if ((tLObject4 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject4).photo) != null) {
                    a5Var.x = true;
                    a5Var.e();
                    z4Var.b(photo);
                    return;
                }
                a5Var.x = true;
                a5Var.e();
                z4Var.onError();
                return;
            case 18:
                a5 a5Var2 = (a5) this.b;
                String str4 = (String) this.c;
                if (a5Var2.w || a5Var2.x) {
                    return;
                }
                a5Var2.a(str4);
                return;
            case 19:
                r5 m11 = ((o5) this.b).v.m((TL_iv.pageTableCell) this.c);
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
                k2.j jVar = (k2.j) yVar.c;
                String str6 = e2.d0.a;
                j2.f fVar = ((i2.b0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1012, new j2.c(p5, str5, 26));
                return;
            case 26:
                ((k2.n) this.b).Y((k2.k) this.c);
                return;
            case 27:
                ((i9.c0) this.c).m(Boolean.valueOf(((m4.a0) this.b).o()));
                return;
            case 28:
                m4.a0 a0Var = (m4.a0) this.b;
                Runnable runnable = (Runnable) this.c;
                a0Var.getClass();
                runnable.run();
                return;
            default:
                ((m4.a0) this.b).u(null, (m4.k1) this.c);
                return;
        }
    }

    public /* synthetic */ x1(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.a = 28;
        this.b = a0Var;
        this.c = runnable;
    }
}
