package a1;

import a3.m0;
import ag.h2;
import ag.h3;
import ag.i3;
import ag.j0;
import ag.j1;
import ag.k;
import ag.t1;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b2;
import bi.c6;
import bi.d4;
import bi.k5;
import bi.l2;
import bi.l5;
import bi.n1;
import bi.o0;
import bi.q6;
import bi.u;
import bi.u3;
import bi.z;
import bi.z5;
import e2.l0;
import i2.b0;
import i2.c0;
import i2.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n4.q;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qq;
import org.webrtc.MediaStreamTrack;
import v0.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:120|(2:121|122)|(3:169|170|(10:172|173|(2:164|165)|126|(1:128)|129|130|131|(1:(1:134))(7:136|137|138|139|140|141|142)|135))|124|(0)|126|(0)|129|130|131|(0)(0)|135) */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e0, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize w9;
        TLRPC.Photo photo;
        int i10 = this.a;
        int i11 = 2;
        boolean z10 = false;
        View C1 = null;
        r6 = null;
        r6 = null;
        String str3 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((v0.h) obj2, (Exception) obj);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((v0.h) obj2, (p) obj);
                return;
            case 2:
                ((a3.f) ((q) obj2).b).h.d((b2) obj);
                return;
            case 3:
                m0 m0Var = (m0) ((hf.b) obj2).c;
                String str4 = l0.a;
                q.f(((c0) m0Var).a.G, (i2.c) obj);
                return;
            case 4:
                b2 b2Var = (b2) obj;
                m0 m0Var2 = (m0) ((hf.b) obj2).c;
                String str5 = l0.a;
                i0 i0Var = ((c0) m0Var2).a;
                i0Var.k0 = b2Var;
                i0Var.m.e(25, new b0(b2Var));
                return;
            case 5:
                m0 m0Var3 = (m0) ((hf.b) obj2).c;
                String str6 = l0.a;
                j2.g gVar = ((c0) m0Var3).a.s;
                j2.a U = gVar.U();
                gVar.V(U, 1030, new d2.c(U, (Exception) obj, 29));
                return;
            case 6:
                m0 m0Var4 = (m0) ((hf.b) obj2).c;
                String str7 = l0.a;
                j2.g gVar2 = ((c0) m0Var4).a.s;
                j2.a U2 = gVar2.U();
                gVar2.V(U2, 1019, new j2.c(U2, (String) obj, 6));
                return;
            case 7:
                k kVar = (k) obj2;
                TLObject tLObject = (TLObject) obj;
                kVar.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                kVar.c = connectedbots;
                if (connectedbots != null) {
                    vp.r1(kVar.a).V3(kVar.c.users, false);
                }
                kVar.b = System.currentTimeMillis();
                kVar.f = true;
                kVar.d();
                return;
            case 8:
                j1 j1Var = (j1) obj2;
                k.a(j1Var.a).b();
                ((qq) obj).run();
                j1Var.dismiss();
                return;
            case 9:
                vp.r1(((t1) obj2).currentAccount).L3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 10:
                h2 h2Var = (h2) obj2;
                h2Var.getClass();
                h2Var.b0(((a51) obj).d);
                return;
            case 11:
                h3 h3Var = (h3) obj;
                try {
                    try {
                        sQLitePreparedStatement2 = ((hs) obj2).b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, h3Var.a);
                        sQLitePreparedStatement2.bindString(2, h3Var.b);
                        sQLitePreparedStatement2.bindInteger(3, h3Var.c);
                        sQLitePreparedStatement2.bindInteger(4, h3Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e) {
                        f8.g(e, true);
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
            case 12:
                i3 i3Var = (i3) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList2 = i3Var.b;
                int i12 = i3Var.a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    vp.r1(i12).V3(tL_messages_quickReplies.users, false);
                    vp.r1(i12).P3(tL_messages_quickReplies.chats, false);
                    hs.a0(i12).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < tL_messages_quickReplies.quick_replies.size(); i13++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i13);
                        h3 h3Var2 = new h3();
                        h3Var2.a = tL_quickReply.shortcut_id;
                        h3Var2.b = tL_quickReply.shortcut;
                        h3Var2.f = tL_quickReply.count;
                        h3Var2.d = tL_quickReply.top_message;
                        h3Var2.c = i13;
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i14);
                                if (message.id != tL_quickReply.top_message) {
                                    i14++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            jj jjVar = new jj(i12, message, false, true);
                            h3Var2.e = jjVar;
                            jjVar.r0(false);
                            h3Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(h3Var2);
                    }
                    arrayList = arrayList3;
                }
                i3Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                i3Var.f = true;
                i3Var.l();
                zs.f(i12).k(zs.F1, new Object[0]);
                return;
            case 13:
                hs hsVar = (hs) obj;
                ArrayList arrayList4 = ((i3) obj2).b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                            h3 h3Var3 = (h3) arrayList4.get(i15);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, h3Var3.a);
                            sQLitePreparedStatement.bindString(2, h3Var3.b);
                            sQLitePreparedStatement.bindInteger(3, h3Var3.c);
                            sQLitePreparedStatement.bindInteger(4, h3Var3.f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th3;
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 14:
                ViewGroup container = (ViewGroup) obj2;
                i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 15:
                ((v0.h) obj2).g(obj);
                return;
            case 16:
                ((v0.h) obj2).onResult((n) obj);
                return;
            case 17:
                j20 j20Var = (j20) obj;
                u a2 = u.a(((String[]) obj2)[0], org.telegram.messenger.i0.L(26.0f), false);
                if (a2 == null) {
                    a2 = u.a(cd.L0(2131754007, null), org.telegram.messenger.i0.L(26.0f), false);
                    z10 = true;
                }
                org.telegram.messenger.i0.g3(new j0(j20Var, a2 != null ? a2.a : null, z10, i11));
                return;
            case 18:
                z zVar = (z) obj2;
                TLObject tLObject3 = (TLObject) obj;
                zVar.Y1 = false;
                zVar.Z1 = 0;
                vh.d dVar = zVar.X1;
                dVar.setLoading(false);
                if (!(tLObject3 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.i0.F3(4.0f, dVar, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject3).result;
                if (richMessage == null) {
                    org.telegram.messenger.i0.F3(4.0f, dVar, null);
                    return;
                }
                zVar.a2 = richMessage;
                zVar.U1.set(richMessage);
                dVar.i(cd.L0(2131754061, null), true, true);
                zVar.d1();
                p51 p51Var = zVar.R1;
                if (p51Var != null) {
                    p51Var.O(true);
                    return;
                }
                return;
            case 19:
                d4 d4Var = (d4) obj2;
                Uri uri = (Uri) obj;
                try {
                    str = org.telegram.messenger.i0.T0(uri);
                } catch (Exception e10) {
                    f8.g(e10, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !sc.e.x(str)) {
                    try {
                        query = d4Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e11) {
                        e = e11;
                        str2 = null;
                        f8.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = d4Var.getContext().getContentResolver().openInputStream(uri);
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
                                        f8.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = d4Var.getContext().getContentResolver().openInputStream(uri);
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
                                    str2 = "document_" + tz.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = d4Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(b8.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            org.telegram.messenger.i0.D(openInputStream, fileOutputStream);
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
                    openInputStream = d4Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !sc.e.x(str)) {
                    return;
                }
                org.telegram.messenger.i0.g3(new f(20, d4Var, str));
                return;
            case 20:
                ((d4) obj2).f2((String) obj);
                return;
            case 21:
                d4 d4Var2 = (d4) obj2;
                l2 l2Var = (l2) obj;
                d4Var2.getClass();
                long j10 = l2Var.a;
                int i16 = l2Var.d;
                int i17 = l2Var.c;
                ArrayList arrayList5 = d4Var2.s3;
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList5.size()) {
                        i18 = -1;
                    } else if (((bi.a) arrayList5.get(i18)).a != j10) {
                        i18++;
                    }
                }
                if (i18 < 0) {
                    return;
                }
                View m10 = d4Var2.e3.m(i18);
                if (m10 instanceof q6) {
                    q6 q6Var = (q6) m10;
                    q6Var.B();
                    n1 editText = q6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i17, length)), Math.max(0, Math.min(i16, length)));
                    return;
                }
                if (!(m10 instanceof z5)) {
                    if (m10 instanceof o0) {
                        n1 captionEditText = ((o0) m10).getCaptionEditText();
                        captionEditText.N();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i17, length2)), Math.max(0, Math.min(i16, length2)));
                        return;
                    }
                    return;
                }
                z5 z5Var = (z5) m10;
                n1 m11 = z5Var.m(l2Var.b);
                if (m11 == null) {
                    m11 = z5Var.m(0);
                }
                if (m11 == null) {
                    return;
                }
                m11.N();
                int length3 = m11.length();
                m11.setSelection(Math.max(0, Math.min(i17, length3)), Math.max(0, Math.min(i16, length3)));
                return;
            case 22:
                u3 u3Var = (u3) obj2;
                bi.a aVar = (bi.a) obj;
                if (aVar == null) {
                    u3Var.getClass();
                } else {
                    C1 = u3Var.e.C1(aVar);
                }
                if (C1 instanceof q6) {
                    q6 q6Var2 = (q6) C1;
                    q6Var2.B();
                    q6Var2.getEditText().setSelection(q6Var2.getEditText().length());
                    return;
                }
                return;
            case 23:
                l5 l5Var = (l5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                boolean z11 = l5Var.e;
                boolean z12 = l5Var.d;
                k5 k5Var = l5Var.s;
                if (l5Var.x) {
                    return;
                }
                l5Var.D = 0;
                if (l5Var.c || z12 || z11) {
                    if ((tLObject4 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject4).document) != null) {
                        if (!z11) {
                            if (z12) {
                                l5Var.y = true;
                                l5Var.e();
                                k5Var.f(document);
                                return;
                            } else {
                                l5Var.y = true;
                                l5Var.e();
                                k5Var.d(document);
                                return;
                            }
                        }
                        int i19 = l5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            l5Var.y = true;
                            l5Var.e();
                            k5Var.a();
                            return;
                        }
                        l5Var.y = true;
                        l5Var.e();
                        if (!TextUtils.isEmpty(l5Var.F) && jj.W2(document) && (w9 = b8.w(document.thumbs, zs.r5, false, null, false)) != null) {
                            b8.G(i19).f0(l5Var.F, w9);
                            File file2 = new File(l5Var.F);
                            b8.G(i19);
                            org.telegram.messenger.i0.F(file2, b8.K(w9, null, true, true));
                        }
                        k5Var.e(document);
                        return;
                    }
                } else if ((tLObject4 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject4).photo) != null) {
                    l5Var.y = true;
                    l5Var.e();
                    k5Var.c(photo);
                    return;
                }
                l5Var.y = true;
                l5Var.e();
                k5Var.a();
                return;
            case 24:
                l5 l5Var2 = (l5) obj2;
                String str8 = (String) obj;
                if (l5Var2.x || l5Var2.y) {
                    return;
                }
                l5Var2.a(str8);
                return;
            case 25:
                c6 m12 = ((z5) obj2).w.m((TL_iv.pageTableCell) obj);
                if (m12 == null) {
                    return;
                }
                n1 n1Var = m12.a;
                n1Var.N();
                n1Var.setSelection(n1Var.length());
                return;
            case 26:
                ((c1.d) obj2).e().g(((p) obj).a);
                return;
            case 27:
                ((c1.d) obj2).e().g((w0.h) obj);
                return;
            case 28:
                ((c1.d) obj2).e().onResult((n) obj);
                return;
            default:
                c2.h.a = (AudioManager) ((Context) obj2).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                ((e2.i) obj).e();
                return;
        }
    }
}
