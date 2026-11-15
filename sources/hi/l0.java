package hi;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.du;
import org.telegram.messenger.eu;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.iv;
import org.telegram.messenger.ns;
import org.telegram.messenger.t10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l0 implements og.n, tg.c, s51, OnCompleteListener, com.google.android.gms.common.api.internal.q, ii, c4.m, li.j0, l.i, n2.v, o0.a, b3.j, mm0, org.telegram.ui.Components.r4, oi.g0, org.telegram.messenger.za, ue.a, pm0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ l0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public boolean A() {
        return ((org.telegram.messenger.h0) this.b).c;
    }

    public m1.e1 B() {
        ce.w wVar = (ce.w) this.b;
        wVar.getClass();
        Object obj = ce.w.e.get(wVar);
        if (obj == de.g.a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
        int i7 = this.a;
    }

    @Override // oi.g0
    public org.telegram.ui.Cells.h9 E() {
        oi.j3 j3Var = ((oi.p4) this.b).O;
        if (j3Var != null) {
            return j3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // ue.a
    public void E0() {
        eu euVar = (eu) this.b;
        eu.j0(euVar, null);
        euVar.b0 = null;
    }

    @Override // og.n
    public void F() {
        ((n0) this.b).e.invalidate();
    }

    @Override // n2.v
    public void G() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // li.j0
    public void I() {
        li.r rVar = (li.r) this.b;
        te.a aVar = rVar.a;
        li.k0 k0Var = rVar.w;
        aVar.a(k0Var.n && k0Var.l == 0, true);
        rVar.d.g3.O(true);
    }

    @Override // oi.g0
    public void J(CharSequence charSequence) {
        oi.j3 j3Var = ((oi.p4) this.b).O;
        if (j3Var != null) {
            j3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            j3Var.a.w4(charSequence.toString());
        }
    }

    @Override // c4.m
    public void K(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        g2.b a10;
        h2.x xVar = (h2.x) this.b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            a8.ja.e("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                g2.a aVar = null;
                while (i11 > 0) {
                    a8.ja.e("Incomplete vtt cue box header found.", i11 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i13 = xVar.b;
                    String str = h2.l0.a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    xVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        l4.g gVar = new l4.g();
                        l4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = l4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = l4.h.a;
                    l4.g gVar2 = new l4.g();
                    gVar2.c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        ((oi.z1) this.b).x0(i7, i10, z10);
    }

    @Override // oi.g0
    public org.telegram.ui.Cells.g9 N() {
        return (oi.p4) this.b;
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        iv ivVar;
        org.telegram.ui.Cells.l1 l1Var;
        eu euVar = (eu) this.b;
        du duVar = euVar.b0;
        if (duVar == null || (l1Var = (ivVar = euVar.a).F) == null) {
            return;
        }
        l1Var.k1(ivVar.E, duVar.c);
    }

    @Override // oi.g0
    public oi.a P() {
        return ((oi.p4) this.b).a;
    }

    @Override // c4.m
    public int Q() {
        return 2;
    }

    @Override // ue.a
    public boolean Q0(float f10, float f11) {
        eu euVar = (eu) this.b;
        du i02 = eu.i0(euVar, f10, f11);
        if (i02 == null || i02.b) {
            i02 = null;
        }
        euVar.b0 = i02;
        return i02 != null;
    }

    @Override // oi.g0
    public boolean R() {
        oi.p4 p4Var = (oi.p4) this.b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var == null) {
            return false;
        }
        oi.a aVar = p4Var.a;
        return j3Var.a.V4();
    }

    @Override // n2.v
    public void T(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    public JSONObject U() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(aa.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        aa.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    aa.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // oi.g0
    public void V(int i7, int i10) {
        oi.p4 p4Var = (oi.p4) this.b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.a;
            oi.d2 d2Var = j3Var.a.R3;
            if (d2Var != null) {
                d2Var.f(i7, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // n2.v
    public void W() {
        ((FfmpegAudioRenderer) this.b).a0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.a > r3.a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(m1.e1 newState) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        ce.w wVar = (ce.w) this.b;
        do {
            wVar.getClass();
            Object obj3 = ce.w.e.get(wVar);
            obj = de.g.a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            m1.e1 e1Var = (m1.e1) obj2;
            if (!(e1Var instanceof m1.w0 ? true : kotlin.jvm.internal.j.a(e1Var, m1.f1.b))) {
                if (!(e1Var instanceof m1.c)) {
                    if (!(e1Var instanceof m1.l0)) {
                        throw new androidx.car.app.j();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (e1Var != null) {
                    obj = e1Var;
                }
            }
            e1Var = newState;
            if (obj2 == null) {
            }
            if (e1Var != null) {
            }
        } while (!wVar.c(obj2, obj));
    }

    @Override // ue.a
    public boolean Z0(View view, float f10, float f11) {
        eu euVar = (eu) this.b;
        if (euVar.b0 == null) {
            return false;
        }
        du i02 = eu.i0(euVar, f10, f11);
        du duVar = euVar.b0;
        if (i02 != duVar) {
            return false;
        }
        iv ivVar = euVar.a;
        org.telegram.ui.Cells.l1 l1Var = ivVar.F;
        if (l1Var == null) {
            return true;
        }
        l1Var.I1(ivVar.E, duVar.c);
        return true;
    }

    @Override // n2.v
    public void a(int i7) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ai.v0(aVar, i7, 15));
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
        k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
        k7.d dVar = (k7.d) ((k7.e) obj).n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
        gVar.c = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = t7.a.a;
        obtain.writeStrongBinder(fVar);
        t7.a.b(obtain, getCredentialRequest);
        t7.a.b(obtain, gVar);
        ((k7.b) dVar).h1(obtain, 1);
    }

    @Override // n2.v
    public void b(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.h0 = true;
        k8.a aVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new di.x2(aVar, j3, 13));
        }
    }

    @Override // n2.v
    public void c(boolean z10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ai.q(13, aVar, z10));
        }
    }

    @Override // oi.g0
    public void c0() {
        oi.p4 p4Var = (oi.p4) this.b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.a;
            oi.q3 q3Var = j3Var.a;
            oi.d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.p3.onContentChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // li.j0, o0.a
    public void close() {
        switch (this.a) {
            case 9:
                ((li.r) this.b).finishFragment();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            com.google.android.gms.internal.cast.f4.e((ExecutorService) contentProviderClient);
                            break;
                        }
                    } else {
                        contentProviderClient.close();
                        break;
                    }
                }
                break;
        }
    }

    @Override // oi.g0, oi.d1
    public void d(oi.e1 e1Var) {
        oi.j3 j3Var = ((oi.p4) this.b).O;
        if (j3Var != null) {
            oi.q3 q3Var = j3Var.a;
            oi.q3.Q1(q3Var, e1Var);
            q3Var.p3.b(e1Var, true);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public void d0(vg vgVar) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.e2) ((kg.n) this.b)).currentAccount;
        ns.f(i7).d(vgVar);
    }

    @Override // org.telegram.ui.Components.mm0
    public void e(float f10) {
        oi.w wVar = (oi.w) this.b;
        gj gjVar = wVar.Q;
        if (gjVar == null) {
            return;
        }
        gjVar.b0 = f10;
        MediaController.B().i0(wVar.Q, f10);
    }

    @Override // n2.v
    public void f(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public void g(float f10) {
        gj gjVar = ((oi.w) this.b).Q;
        if (gjVar == null) {
            return;
        }
        gjVar.b0 = f10;
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.pm0
    public CharSequence getContentDescription() {
        t10 t10Var;
        switch (this.a) {
            case 27:
                return " ";
            case 28:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(s7Var.s)) {
                        sb2.append(s7Var.s);
                    }
                    org.telegram.ui.Cells.r7 r7Var = s7Var.r;
                    if (r7Var != null && (t10Var = r7Var.e) != null) {
                        CharSequence charSequence = (CharSequence) t10Var.d(0, Integer.valueOf(s7Var.f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) s7Var.r.e.d(-1, Integer.valueOf(s7Var.r.b()));
                        CharSequence charSequence3 = (CharSequence) s7Var.r.e.d(1, Integer.valueOf(s7Var.r.a()));
                        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence2);
                            sb2.append(" – ");
                            sb2.append(charSequence3);
                        }
                    }
                    if (sb2.length() > 0) {
                        return sb2.toString();
                    }
                    return null;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return s7Var.s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) this.b;
                sb3.append(hd.G(y7Var.x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(hd.G(y7Var.x2 % 60, "Seconds", new Object[0]));
                return hd.a0("AccDescrPlayerDuration", null, 2131754806, sb3.toString(), hd.G(y7Var.y2 / 60, "Minutes", new Object[0]) + ' ' + hd.G(y7Var.y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // oi.g0
    public void h() {
        oi.p4 p4Var = (oi.p4) this.b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.q3.T1(j3Var.a, p4Var.a);
        }
    }

    @Override // l.i
    public void i(l.k kVar) {
        switch (this.a) {
            case 10:
                l0 l0Var = ((ActionMenuView) this.b).L;
                if (l0Var != null) {
                    l0Var.i(kVar);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                m.h hVar = toolbar.a.K;
                if (hVar == null || !hVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.a0.c).iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.b0) it.next()).a.t();
                    }
                    break;
                }
                break;
        }
    }

    @Override // tg.c
    public void j() {
        u9 u9Var = (u9) this.b;
        u9Var.A0(null, true);
        if (u9Var.w0) {
            sa saVar = u9Var.k2;
            saVar.d1.f.d();
            saVar.k0(-1, false, true);
            u9Var.w0 = false;
        }
        u9Var.L0(false);
    }

    @Override // b3.j
    public b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        j2.b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        int i10 = rVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        b3.i iVar = min == -9223372036854775807L ? b3.o.f : new b3.i(0, min, false);
        hVar.q.q(tVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override // ue.a
    public /* synthetic */ boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        int round;
        switch (this.a) {
            case 27:
                y51 y51Var = (y51) ((org.telegram.ui.Cells.i0) this.b);
                int i7 = (int) (org.telegram.ui.ActionBar.j6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                org.telegram.ui.ActionBar.j6.q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = y51Var.f.e;
                    cj0 cj0Var = (cj0) themeActivity.b.K(themeActivity.g0);
                    if (cj0Var != null) {
                        ((org.telegram.ui.Cells.y8) cj0Var.a).setText(hd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.q * 100.0f))));
                    }
                    org.telegram.ui.ActionBar.j6.F(true);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                org.telegram.ui.Cells.r7 r7Var = s7Var.r;
                if (r7Var != null && s7Var.n != null) {
                    if (r7Var.c != null) {
                        double length = f10 * (r3.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), s7Var.r.c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), s7Var.r.c.length - 1, 0);
                        int[] iArr = s7Var.r.c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * s7Var.r.d) / s7Var.r.d, iArr[j3], iArr[j10]));
                    } else {
                        round = Math.round(((s7Var.r.a() - s7Var.r.b()) * f10) + r7Var.b());
                    }
                    int i11 = s7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = s7Var.f;
                    if (i12 != round) {
                        if (s7Var.c(i12) != s7Var.c(round)) {
                            org.telegram.messenger.g0.b4(s7Var.e);
                        }
                        s7Var.f = round;
                        s7Var.e(round, true);
                        z10 z10Var = s7Var.n;
                        if (z10Var != null) {
                            z10Var.a(Integer.valueOf(s7Var.f));
                            break;
                        }
                    }
                }
                break;
            default:
                if (z10) {
                    MediaController.B().i0(MediaController.B().v0, f10);
                }
                gj gjVar = MediaController.B().v0;
                if (gjVar != null && gjVar.I3()) {
                    ((org.telegram.ui.Components.y7) this.b).b1(gjVar, false);
                    break;
                }
                break;
        }
    }

    @Override // ue.a
    public boolean l1() {
        return true;
    }

    @Override // b3.j
    public void m(b3.l lVar, long j3, long j10, boolean z10) {
        ((o2.h) this.b).x((b3.r) lVar, j3, j10);
    }

    @Override // l.i
    public boolean o(l.k kVar, MenuItem menuItem) {
        switch (this.a) {
            case 10:
                m.k kVar2 = ((ActionMenuView) this.b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ia.d) kVar2).b).a0.c).iterator();
                    while (it.hasNext()) {
                        if (((androidx.fragment.app.b0) it.next()).a.p()) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ((Toolbar) this.b).getClass();
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zd.m mVar = (zd.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(af.b.b(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onStateChanged(boolean z10, int i7) {
        x5 x5Var = (x5) this.b;
        v5 v5Var = x5Var.N;
        u51 u51Var = x5Var.y;
        if (u51Var == null) {
            return;
        }
        if (u51Var.d0()) {
            org.telegram.messenger.g0.h3(v5Var);
        } else {
            org.telegram.messenger.g0.r(v5Var);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        tg.r1 r1Var = ((x5) this.b).x;
        if (r1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(r1Var.z0 - f11) >= 1.0E-4f) {
                r1Var.z0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    @Override // o0.a
    public Cursor p(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public int p0() {
        switch (this.a) {
            case 27:
                return 0;
            case 28:
                org.telegram.ui.Cells.r7 r7Var = ((org.telegram.ui.Cells.s7) this.b).r;
                if (r7Var == null) {
                    return 0;
                }
                if (r7Var.c == null) {
                    return r7Var.a() - r7Var.b();
                }
                return r7Var.d * (r1.length - 1);
            default:
                return 0;
        }
    }

    @Override // n2.v
    public void q() {
        ((FfmpegAudioRenderer) this.b).g0 = true;
    }

    @Override // b3.j
    public void r(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        if (i7 == 0) {
            long j11 = rVar.a;
            tVar = new x2.t(rVar.b, j3);
        } else {
            long j12 = rVar.a;
            j2.m mVar = rVar.b;
            j2.b0 b0Var = rVar.d;
            tVar = new x2.t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        hVar.q.s(tVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override // ue.a
    public void s(float f10, float f11) {
        eu euVar = (eu) this.b;
        du i02 = eu.i0(euVar, f10, f11);
        du duVar = euVar.b0;
        if (i02 != duVar) {
            duVar = null;
        }
        eu.j0(euVar, duVar);
    }

    @Override // ue.a
    public void s0() {
        eu euVar = (eu) this.b;
        eu.j0(euVar, euVar.b0);
    }

    @Override // n2.v
    public void u(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override // oi.g0
    public void u0() {
        oi.p4 p4Var = (oi.p4) this.b;
        oi.j3 j3Var = p4Var.O;
        if (j3Var != null) {
            oi.a aVar = p4Var.a;
            oi.q3.S1(j3Var.a);
        }
    }

    @Override // b3.j
    public void w(b3.l lVar, long j3, long j10) {
        long j11;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.b;
        long j12 = rVar.a;
        j2.m mVar = rVar.b;
        j2.b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        hVar.m.getClass();
        hVar.q.o(tVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) rVar.f;
        p2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    hVar.L = 0;
                } else {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.m.R4(rVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            } else {
                hVar.C = new androidx.datastore.preferences.protobuf.l();
                return;
            }
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.t) {
            try {
                if (rVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = a8.g7.a(rVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j11) {
            hVar.z(true);
            return;
        }
        f5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.w();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = h2.l0.V(aVar.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (e2.t0 e10) {
                hVar.y(e10);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(aVar, new o2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(aVar, new nb.a(16));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // n2.v
    public void w0(long j3, int i7, long j10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override // c4.m
    public /* synthetic */ c4.d x(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    @Override // li.j0
    public void y(long j3) {
        ((li.r) this.b).presentFragment(an.ua(j3));
    }

    @Override // tg.c
    public tg.j z() {
        return ((u9) this.b).t0;
    }

    public l0(ga.d dVar) {
        this.a = 3;
        this.b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame() {
    }

    public l0(int i7) {
        this.a = i7;
        switch (i7) {
            case 12:
                this.b = new ce.w(m1.f1.b);
                break;
            case 24:
                break;
            default:
                this.b = new h2.x();
                break;
        }
    }

    public l0(String str, long j3) {
        this.a = 22;
        this.b = new org.telegram.messenger.l0(str, j3);
    }

    public l0(String str, Set set) {
        this.a = 23;
        this.b = new org.telegram.messenger.o0(str, set);
    }

    public l0(Context context, Uri uri) {
        this.a = 15;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public l0(String str, boolean z10) {
        this.a = 21;
        this.b = new org.telegram.messenger.h0(str, z10);
    }

    @Override // og.n
    public void M(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // og.n
    public void m0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private final void D() {
    }

    private final /* synthetic */ void H() {
    }

    private final void S() {
    }

    @Override // og.n
    public void D0() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void K0() {
    }

    @Override // n2.v
    public /* synthetic */ void n0() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    @Override // n2.v
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.s51
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override // ue.a
    public /* synthetic */ void e1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void n(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void v(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.ii
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
