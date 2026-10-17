package hi;

import ai.x7;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import b2.l1;
import b2.o1;
import b2.z1;
import i2.i1;
import i2.n1;
import ig.d1;
import ig.x1;
import ig.y1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ki.a5;
import ki.c6;
import ki.h1;
import ki.n3;
import ki.o5;
import ki.r5;
import ki.w3;
import ki.z4;
import m4.m1;
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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.e2;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.sn;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:116|(2:117|118)|(3:165|166|(10:168|169|(2:160|161)|122|(1:124)|125|126|127|(1:(1:130))(7:132|133|134|135|136|137|138)|131))|120|(0)|122|(0)|125|126|127|(0)(0)|131) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x028e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e0, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        long j10;
        boolean z10;
        TLRPC.Message message;
        k2.e eVar;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        int i11 = -1;
        View A1 = null;
        r8 = null;
        r8 = null;
        String str3 = null;
        ArrayList arrayList = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r8 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                ((k0) this.b).s.presentFragment(sn.W9(((ii.e) this.c).b.id));
                return;
            case 1:
                i2.g0 g0Var = (i2.g0) this.b;
                i2.m0 m0Var = (i2.m0) this.c;
                int i13 = g0Var.J - m0Var.b;
                g0Var.J = i13;
                if (m0Var.d) {
                    g0Var.K = m0Var.e;
                    g0Var.L = true;
                }
                if (i13 == 0) {
                    o1 o1Var = ((i1) m0Var.f).a;
                    if (!g0Var.p0.a.p() && o1Var.p()) {
                        g0Var.q0 = -1;
                        g0Var.r0 = 0L;
                    }
                    if (!o1Var.p()) {
                        List asList = Arrays.asList(((n1) o1Var).l);
                        u6.p(asList.size() == g0Var.p.size());
                        for (int i14 = 0; i14 < asList.size(); i14++) {
                            ((i2.c0) g0Var.p.get(i14)).c = (o1) asList.get(i14);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (g0Var.L) {
                        Object[] objArr = ((i1) m0Var.f).a.p() && g0Var.p0.a.p();
                        boolean equals = ((i1) m0Var.f).b.equals(g0Var.p0.b);
                        Object[] objArr2 = ((i1) m0Var.f).d == g0Var.p0.s;
                        if (objArr != false || (equals && objArr2 != false)) {
                            z12 = false;
                        }
                        if (z12) {
                            i11 = g0Var.n0();
                            if (o1Var.p() || ((i1) m0Var.f).b.b()) {
                                j11 = ((i1) m0Var.f).d;
                            } else {
                                i1 i1Var = (i1) m0Var.f;
                                u2.g0 g0Var2 = i1Var.b;
                                long j12 = i1Var.d;
                                Object obj = g0Var2.a;
                                l1 l1Var = g0Var.o;
                                o1Var.g(obj, l1Var);
                                j11 = j12 + l1Var.e;
                            }
                        }
                        i10 = i11;
                        j10 = j11;
                        z10 = z12;
                    } else {
                        i10 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    g0Var.L = false;
                    g0Var.D1((i1) m0Var.f, 1, z10, g0Var.K, j10, i10, false);
                    return;
                }
                return;
            case 2:
                i2.a0 a0Var = (i2.a0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList2 = a0Var.a.t0;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((a81) ((z1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 3:
                ig.f fVar = (ig.f) this.b;
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
            case 4:
                ig.k0.S((ig.k0) this.b, (e2) this.c);
                return;
            case 5:
                MessagesController.getInstance(((ig.r0) this.b).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 6:
                d1 d1Var = (d1) this.b;
                f61 f61Var = (f61) this.c;
                d1Var.getClass();
                d1Var.X(f61Var.d);
                return;
            case 7:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                x1 x1Var = (x1) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, x1Var.a);
                        sQLitePreparedStatement2.bindString(2, x1Var.b);
                        sQLitePreparedStatement2.bindInteger(3, x1Var.c);
                        sQLitePreparedStatement2.bindInteger(4, x1Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e) {
                        FileLog.e(e);
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
            case 8:
                y1 y1Var = (y1) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList3 = y1Var.b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            x1 x1Var2 = (x1) arrayList3.get(i15);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, x1Var2.a);
                            sQLitePreparedStatement.bindString(2, x1Var2.b);
                            sQLitePreparedStatement.bindInteger(3, x1Var2.c);
                            sQLitePreparedStatement.bindInteger(4, x1Var2.f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
            case 9:
                y1 y1Var2 = (y1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = y1Var2.b;
                int i16 = y1Var2.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    MessagesController.getInstance(i16).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i16).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList5 = new ArrayList();
                    for (int i17 = 0; i17 < tL_messages_quickReplies.quick_replies.size(); i17++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i17);
                        x1 x1Var3 = new x1();
                        x1Var3.a = tL_quickReply.shortcut_id;
                        x1Var3.b = tL_quickReply.shortcut;
                        x1Var3.f = tL_quickReply.count;
                        x1Var3.d = tL_quickReply.top_message;
                        x1Var3.c = i17;
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
                            x1Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            x1Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList5.add(x1Var3);
                    }
                    arrayList = arrayList5;
                }
                y1Var2.e = false;
                if (arrayList != null) {
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                }
                y1Var2.f = true;
                y1Var2.l();
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 10:
                ((j2.i) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 11:
                ((j2.i) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 12:
                ((j2.i) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 13:
                ((j2.i) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 14:
                ((j2.i) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 15:
                qf.b bVar = (qf.b) this.b;
                String str4 = (String) this.c;
                k2.u uVar = (k2.u) bVar.c;
                String str5 = e2.m0.a;
                j2.f fVar2 = ((i2.a0) uVar).a.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1012, new j2.e(p5, str4, 12));
                return;
            case 16:
                qf.b bVar2 = (qf.b) this.b;
                i2.c cVar = (i2.c) this.c;
                k2.u uVar2 = (k2.u) bVar2.c;
                String str6 = e2.m0.a;
                n4.s.i(((i2.a0) uVar2).a.F, cVar);
                return;
            case 17:
                k2.d0.a((k2.d0) this.b, (AudioRouting) this.c);
                return;
            case 18:
                k2.d0 d0Var = (k2.d0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (d0Var.d == null || (eVar = ((k2.k0) d0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                b2.f fVar3 = eVar.j;
                List a2 = eVar.a();
                e9.x1 x1Var4 = k2.b.e;
                eVar.b(k2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar3, audioDeviceInfo, a2));
                return;
            case 19:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                ki.r a10 = ki.r.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a10 == null) {
                    a10 = ki.r.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z11 = true;
                }
                AndroidUtilities.runOnUIThread(new x7(callback2, a10 != null ? a10.a : null, z11, 7));
                return;
            case 20:
                ki.x xVar = (ki.x) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                xVar.g0 = false;
                xVar.h0 = 0;
                ei.d dVar = xVar.f0;
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
                xVar.Q();
                s61 s61Var = xVar.Z;
                if (s61Var != null) {
                    s61Var.N(true);
                    return;
                }
                return;
            case 21:
                w3 w3Var = (w3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !r.c.t(str)) {
                    try {
                        query = w3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e11) {
                        e = e11;
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
                                    } catch (Exception e12) {
                                        e = e12;
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
                if (TextUtils.isEmpty(str) || !r.c.t(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new t(22, w3Var, str));
                return;
            case 22:
                ((w3) this.b).d2((String) this.c);
                return;
            case 23:
                w3 w3Var2 = (w3) this.b;
                ki.e2 e2Var = (ki.e2) this.c;
                w3Var2.getClass();
                long j13 = e2Var.a;
                int i19 = e2Var.d;
                int i20 = e2Var.c;
                ArrayList arrayList6 = w3Var2.j3;
                int i21 = 0;
                while (true) {
                    if (i21 < arrayList6.size()) {
                        if (((ki.a) arrayList6.get(i21)).a == j13) {
                            i11 = i21;
                        } else {
                            i21++;
                        }
                    }
                }
                if (i11 < 0) {
                    return;
                }
                View m10 = w3Var2.V2.m(i11);
                if (m10 instanceof c6) {
                    c6 c6Var = (c6) m10;
                    c6Var.B();
                    h1 editText = c6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i20, length)), Math.max(0, Math.min(i19, length)));
                    return;
                }
                if (!(m10 instanceof o5)) {
                    if (m10 instanceof ki.l0) {
                        h1 captionEditText = ((ki.l0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i20, length2)), Math.max(0, Math.min(i19, length2)));
                        return;
                    }
                    return;
                }
                o5 o5Var = (o5) m10;
                h1 l4 = o5Var.l(e2Var.b);
                if (l4 == null) {
                    l4 = o5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i20, length3)), Math.max(0, Math.min(i19, length3)));
                return;
            case 24:
                n3 n3Var = (n3) this.b;
                ki.a aVar = (ki.a) this.c;
                if (aVar == null) {
                    n3Var.getClass();
                } else {
                    A1 = n3Var.e.A1(aVar);
                }
                if (A1 instanceof c6) {
                    c6 c6Var2 = (c6) A1;
                    c6Var2.B();
                    c6Var2.getEditText().setSelection(c6Var2.getEditText().length());
                    return;
                }
                return;
            case 25:
                a5 a5Var = (a5) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                boolean z13 = a5Var.e;
                boolean z14 = a5Var.d;
                z4 z4Var = a5Var.s;
                if (a5Var.w) {
                    return;
                }
                a5Var.y = 0;
                if (a5Var.c || z14 || z13) {
                    if ((tLObject4 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject4).document) != null) {
                        if (!z13) {
                            if (z14) {
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
                        int i22 = a5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            a5Var.x = true;
                            a5Var.e();
                            z4Var.onError();
                            return;
                        }
                        a5Var.x = true;
                        a5Var.e();
                        if (!TextUtils.isEmpty(a5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i22).setLocalPathTo(closestPhotoSizeWithSize, a5Var.F);
                            AndroidUtilities.copyFileSafe(new File(a5Var.F), FileLoader.getInstance(i22).getPathToAttach(closestPhotoSizeWithSize, true));
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
            case 26:
                a5 a5Var2 = (a5) this.b;
                String str7 = (String) this.c;
                if (a5Var2.w || a5Var2.x) {
                    return;
                }
                a5Var2.a(str7);
                return;
            case 27:
                r5 m11 = ((o5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                h1 h1Var = m11.a;
                h1Var.r();
                h1Var.setSelection(h1Var.length());
                return;
            case 28:
                ((m4.f0) this.b).u(null, (m1) this.c);
                return;
            default:
                m4.f0 f0Var = (m4.f0) this.b;
                Runnable runnable = (Runnable) this.c;
                f0Var.getClass();
                runnable.run();
                return;
        }
    }

    public /* synthetic */ t(m4.f0 f0Var, m4.v vVar, Runnable runnable) {
        this.a = 29;
        this.b = f0Var;
        this.c = runnable;
    }
}
