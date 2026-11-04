package m2;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import b8.zb;
import ci.v6;
import ci.w9;
import g9.s1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import mi.b6;
import mi.d2;
import mi.h1;
import mi.k3;
import mi.n5;
import mi.q5;
import mi.t3;
import mi.y4;
import mi.z4;
import o4.l1;
import o4.r1;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.f41;
import org.telegram.ui.iy0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:230|(2:231|232)|233|(1:235)|245|(2:246|247)|(3:294|295|(12:297|298|(2:289|290)|251|(1:253)|254|255|256|(1:(1:259))(7:261|262|263|264|265|266|267)|260|237|(1:243)(2:241|242)))|249|(0)|251|(0)|254|255|256|(0)(0)|260|237|(2:239|243)(1:244)) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03d0, code lost:
    
        if (r6 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x044a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x049c, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x044c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0408 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e eVar;
        String str;
        String str2;
        String str3;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        r1 r1Var;
        mi.h0 h0Var;
        mi.h0 h0Var2;
        int i3 = -1;
        int i10 = 4;
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                k2.c cVar = (k2.c) this.c;
                u uVar = (u) tVar.c;
                String str4 = g2.n0.a;
                p4.q.d(((k2.c0) uVar).a.F, cVar);
                return;
            case 1:
                d0.a((d0) this.b, (AudioRouting) this.c);
                return;
            case 2:
                d0 d0Var = (d0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (d0Var.d == null || (eVar = ((j0) d0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                d2.f fVar = eVar.j;
                List a10 = eVar.a();
                s1 s1Var = b.e;
                eVar.b(b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo, a10));
                return;
            case 3:
                String[] strArr = (String[]) this.b;
                n10 n10Var = (n10) this.c;
                mi.q a11 = mi.q.a(strArr[0], org.telegram.messenger.g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = mi.q.a(bd.M0(2131754007, null), org.telegram.messenger.g0.L(26.0f), false);
                } else {
                    z10 = false;
                }
                org.telegram.messenger.g0.h3(new v6(n10Var, a11 != null ? a11.a : null, z10, 7));
                return;
            case 4:
                mi.v vVar = (mi.v) this.b;
                TLObject tLObject = (TLObject) this.c;
                vVar.Z1 = false;
                vVar.a2 = 0;
                gi.d dVar = vVar.Y1;
                dVar.setLoading(false);
                if (!(tLObject instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.g0.G3(4.0f, dVar, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject).result;
                if (richMessage == null) {
                    org.telegram.messenger.g0.G3(4.0f, dVar, null);
                    return;
                }
                vVar.b2 = richMessage;
                vVar.V1.set(richMessage);
                dVar.i(bd.M0(2131754061, null), true, true);
                vVar.d1();
                f41 f41Var = vVar.S1;
                if (f41Var != null) {
                    f41Var.O(true);
                    return;
                }
                return;
            case 5:
                t3 t3Var = (t3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = org.telegram.messenger.g0.T0(uri);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    boolean p10 = t4.c.p(str);
                    str3 = str;
                    break;
                }
                try {
                    query = t3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                } catch (Exception e11) {
                    e = e11;
                    str2 = null;
                    a8.g(e, true);
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str3 = r4;
                    if (TextUtils.isEmpty(str3)) {
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
                                    a8.g(e, true);
                                    if (TextUtils.isEmpty(str2)) {
                                    }
                                    String replace2 = str2.replace('/', '_').replace('\\', '_');
                                    openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                                    if (openInputStream == null) {
                                    }
                                    str3 = r4;
                                    if (TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "document_" + az.p();
                            }
                            String replace22 = str2.replace('/', '_').replace('\\', '_');
                            openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                            if (openInputStream == null) {
                                try {
                                    File file = new File(w7.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        org.telegram.messenger.g0.D(openInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        String absolutePath = file.getAbsolutePath();
                                        openInputStream.close();
                                        r4 = absolutePath;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else if (openInputStream != null) {
                                openInputStream.close();
                            }
                            str3 = r4;
                            if (TextUtils.isEmpty(str3) && t4.c.p(str3)) {
                                org.telegram.messenger.g0.h3(new s(6, t3Var, str3));
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        try {
                            query.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                str2 = null;
                if (query != null) {
                }
                if (TextUtils.isEmpty(str2)) {
                }
                String replace222 = str2.replace('/', '_').replace('\\', '_');
                openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                str3 = r4;
                if (TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    return;
                }
            case 6:
                ((t3) this.b).f2((String) this.c);
                return;
            case 7:
                t3 t3Var2 = (t3) this.b;
                d2 d2Var = (d2) this.c;
                t3Var2.getClass();
                long j10 = d2Var.a;
                int i12 = d2Var.d;
                int i13 = d2Var.c;
                ArrayList arrayList = t3Var2.t3;
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList.size()) {
                        if (((mi.a) arrayList.get(i14)).a == j10) {
                            i3 = i14;
                        } else {
                            i14++;
                        }
                    }
                }
                if (i3 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = t3Var2.f3.m(i3);
                if (m10 instanceof b6) {
                    b6 b6Var = (b6) m10;
                    b6Var.B();
                    h1 editText = b6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i13, length)), Math.max(0, Math.min(i12, length)));
                    return;
                }
                if (!(m10 instanceof n5)) {
                    if (m10 instanceof mi.l0) {
                        h1 captionEditText = ((mi.l0) m10).getCaptionEditText();
                        captionEditText.N();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i13, length2)), Math.max(0, Math.min(i12, length2)));
                        return;
                    }
                    return;
                }
                n5 n5Var = (n5) m10;
                h1 m11 = n5Var.m(d2Var.b);
                if (m11 == null) {
                    m11 = n5Var.m(0);
                }
                if (m11 == null) {
                    return;
                }
                m11.N();
                int length3 = m11.length();
                m11.setSelection(Math.max(0, Math.min(i13, length3)), Math.max(0, Math.min(i12, length3)));
                return;
            case 8:
                k3 k3Var = (k3) this.b;
                mi.a aVar = (mi.a) this.c;
                if (aVar == null) {
                    k3Var.getClass();
                } else {
                    r4 = k3Var.e.C1(aVar);
                }
                if (r4 instanceof b6) {
                    b6 b6Var2 = (b6) r4;
                    b6Var2.B();
                    b6Var2.getEditText().setSelection(b6Var2.getEditText().length());
                    return;
                }
                return;
            case 9:
                z4 z4Var = (z4) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                boolean z14 = z4Var.e;
                boolean z15 = z4Var.d;
                y4 y4Var = z4Var.s;
                if (z4Var.x) {
                    return;
                }
                z4Var.E = 0;
                if (z4Var.c || z15 || z14) {
                    if ((tLObject2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject2).document) != null) {
                        if (!z14) {
                            if (z15) {
                                z4Var.y = true;
                                z4Var.e();
                                y4Var.f(document);
                                return;
                            } else {
                                z4Var.y = true;
                                z4Var.e();
                                y4Var.d(document);
                                return;
                            }
                        }
                        int i15 = z4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            z4Var.y = true;
                            z4Var.e();
                            y4Var.a();
                            return;
                        }
                        z4Var.y = true;
                        z4Var.e();
                        if (!TextUtils.isEmpty(z4Var.G) && zi.X2(document) && (w10 = w7.w(document.thumbs, hs.r5, false, null, false)) != null) {
                            w7.G(i15).f0(z4Var.G, w10);
                            File file2 = new File(z4Var.G);
                            w7.G(i15);
                            org.telegram.messenger.g0.F(file2, w7.K(w10, null, true, true));
                        }
                        y4Var.e(document);
                        return;
                    }
                } else if ((tLObject2 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo) != null) {
                    z4Var.y = true;
                    z4Var.e();
                    y4Var.c(photo);
                    return;
                }
                z4Var.y = true;
                z4Var.e();
                y4Var.a();
                return;
            case 10:
                z4 z4Var2 = (z4) this.b;
                String str5 = (String) this.c;
                if (z4Var2.x || z4Var2.y) {
                    return;
                }
                z4Var2.a(str5);
                return;
            case 11:
                q5 m12 = ((n5) this.b).w.m((TL_iv.pageTableCell) this.c);
                if (m12 == null) {
                    return;
                }
                h1 h1Var = m12.a;
                h1Var.N();
                h1Var.setSelection(h1Var.length());
                return;
            case 12:
                ((o4.e0) this.b).u(null, (l1) this.c);
                return;
            case 13:
                o4.e0 e0Var = (o4.e0) this.b;
                Runnable runnable = (Runnable) this.c;
                e0Var.getClass();
                runnable.run();
                return;
            case 14:
                ((c0.i) this.c).a(Boolean.valueOf(((o4.e0) this.b).o()));
                return;
            case 15:
                l9.w wVar = (l9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    r1Var = (r1) wVar.a;
                    zb.k(r1Var, "SessionResult must not be null");
                } catch (InterruptedException e13) {
                    e = e13;
                    g2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                } catch (CancellationException e14) {
                    g2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e14);
                    r1Var = new r1(1);
                } catch (ExecutionException e15) {
                    e = e15;
                    g2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    r1Var = new r1(-1);
                }
                resultReceiver.send(r1Var.a, r1Var.b);
                return;
            case 16:
                o4.h1 h1Var2 = (o4.h1) this.b;
                o4.l lVar = (o4.l) this.c;
                ui.f fVar2 = h1Var2.b;
                o4.v o10 = fVar2.o(lVar.asBinder());
                if (o10 != null) {
                    fVar2.K(o10);
                    return;
                }
                return;
            case 17:
                ((o4.h1) this.b).b.k((o4.v) this.c);
                return;
            case 18:
                ((w9) this.b).a((SpannableString) this.c);
                return;
            case 19:
                oi.q qVar = (oi.q) this.b;
                oi.o oVar = (oi.o) this.c;
                synchronized (qVar.a) {
                    try {
                        if (qVar.s) {
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) qVar.n.get(oVar);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList2.get(i16);
                                i16++;
                                if (((oi.p) obj).a != null) {
                                    oi.m mVar = (oi.m) qVar.h.get(oVar);
                                    if (mVar != null) {
                                        h0Var2 = mVar.a;
                                    } else {
                                        if (qVar.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c2 = qVar.w.a.c(oVar.a, oVar.b);
                                                c2.b();
                                                h0Var = new mi.h0(c2, r4, z12 ? 1 : 0, i10);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e16) {
                                                if (qVar.c != null) {
                                                    try {
                                                        a8.g(e16, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                h0Var = new mi.h0(r4, e16, z11 ? 1 : 0, i10);
                                            }
                                            synchronized (qVar.a) {
                                                try {
                                                    if (qVar.s) {
                                                        return;
                                                    }
                                                    if (mVar == null && ((Throwable) h0Var.c) == null) {
                                                        qVar.c(oVar, h0Var);
                                                    }
                                                    ArrayList arrayList3 = (ArrayList) qVar.n.remove(oVar);
                                                    if (arrayList3 == null) {
                                                        return;
                                                    }
                                                    int size2 = arrayList3.size();
                                                    while (i11 < size2) {
                                                        Object obj2 = arrayList3.get(i11);
                                                        i11++;
                                                        oi.p pVar = (oi.p) obj2;
                                                        try {
                                                            oi.n nVar = pVar.a;
                                                            pVar.a = null;
                                                            if (nVar != null) {
                                                                nVar.e(h0Var);
                                                            }
                                                        } catch (LinkageError | RuntimeException e17) {
                                                            if (qVar.c != null) {
                                                                try {
                                                                    a8.g(e17, true);
                                                                } catch (LinkageError | RuntimeException unused2) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                } finally {
                                                }
                                            }
                                        }
                                        h0Var2 = new mi.h0(r4, qVar.x, z13 ? 1 : 0, i10);
                                    }
                                    h0Var = h0Var2;
                                    synchronized (qVar.a) {
                                    }
                                }
                            }
                        }
                        qVar.n.remove(oVar);
                        return;
                    } finally {
                    }
                }
            case 20:
                ((VideoAds) this.b).lambda$showPremium$19((vg.v0) this.c);
                return;
            case 21:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 22:
                ((VideoAds) this.b).lambda$show$16((u10) this.c);
                return;
            case 23:
                iy0.d1((Context) this.b, null, false, (ei.k0) this.c, null);
                return;
            case 24:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 26:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 27:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 28:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.c);
                return;
        }
    }

    public /* synthetic */ s(o4.e0 e0Var, o4.v vVar, Runnable runnable) {
        this.a = 13;
        this.b = e0Var;
        this.c = runnable;
    }
}
