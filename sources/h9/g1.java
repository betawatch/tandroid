package h9;

import a8.g7;
import a8.la;
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
import bi.c4;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.s5;
import hi.sa;
import hi.t5;
import hi.u9;
import hi.v5;
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
import oi.m3;
import oi.s4;
import oi.t3;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bu;
import org.telegram.messenger.cu;
import org.telegram.messenger.fv;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.s10;
import org.telegram.messenger.y10;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class g1 implements h1, og.n, tg.c, g61, com.google.android.gms.common.api.internal.q, si, c4.m, li.j0, l.i, n2.v, o0.a, b3.k, xm0, a5, oi.h0, za, ue.a, an0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // li.j0
    public void A(long j3) {
        ((li.s) this.b).presentFragment(bn.ua(j3));
    }

    @Override // tg.c
    public tg.j B() {
        return ((u9) this.b).t0;
    }

    @Override // org.telegram.ui.Components.an0
    public void C() {
        int i7 = this.a;
    }

    public m1.e1 E() {
        ce.w wVar = (ce.w) this.b;
        wVar.getClass();
        Object obj = ce.w.e.get(wVar);
        if (obj == de.g.a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override // ue.a
    public void E0() {
        cu cuVar = (cu) this.b;
        cu.j0(cuVar, null);
        cuVar.b0 = null;
    }

    @Override // li.j0
    public void F() {
        li.s sVar = (li.s) this.b;
        te.a aVar = sVar.a;
        li.k0 k0Var = sVar.w;
        aVar.a(k0Var.n && k0Var.l == 0, true);
        sVar.d.g3.O(true);
    }

    public JSONObject K() {
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.a > r3.a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(m1.e1 newState) {
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
    public void M(float f10, float f11) {
        fv fvVar;
        org.telegram.ui.Cells.m1 m1Var;
        cu cuVar = (cu) this.b;
        bu buVar = cuVar.b0;
        if (buVar == null || (m1Var = (fvVar = cuVar.a).F) == null) {
            return;
        }
        m1Var.k1(fvVar.E, buVar.c);
    }

    @Override // n2.v
    public void M0() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            sVar = ffmpegAudioRenderer.I;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 18:
                ((oi.b2) this.b).x0(i7, i10, z10);
                break;
            default:
                ((hd) this.b).a(Boolean.valueOf(z10), Integer.valueOf(i7), Integer.valueOf(i10));
                break;
        }
    }

    @Override // oi.h0
    public j9 P0() {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            return m3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // n2.v
    public void Q() {
        ((FfmpegAudioRenderer) this.b).g0 = true;
    }

    @Override // ue.a
    public boolean Q0(float f10, float f11) {
        cu cuVar = (cu) this.b;
        bu i02 = cu.i0(cuVar, f10, f11);
        if (i02 == null || i02.b) {
            i02 = null;
        }
        cuVar.b0 = i02;
        return i02 != null;
    }

    @Override // oi.h0
    public void S0(CharSequence charSequence) {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // n2.v
    public void W1(long j3, int i7, long j10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new b3.b(aVar, i7, j3, j10, 1));
        }
    }

    @Override // n2.v
    public void Y0(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.p(aVar, exc, 1));
        }
    }

    @Override // ue.a
    public boolean Z0(View view, float f10, float f11) {
        cu cuVar = (cu) this.b;
        if (cuVar.b0 == null) {
            return false;
        }
        bu i02 = cu.i0(cuVar, f10, f11);
        bu buVar = cuVar.b0;
        if (i02 != buVar) {
            return false;
        }
        fv fvVar = cuVar.a;
        org.telegram.ui.Cells.m1 m1Var = fvVar.F;
        if (m1Var == null) {
            return true;
        }
        m1Var.I1(fvVar.E, buVar.c);
        return true;
    }

    @Override // org.telegram.ui.Components.xm0
    public void a(float f10) {
        oi.x xVar = (oi.x) this.b;
        gj gjVar = xVar.Q;
        if (gjVar == null) {
            return;
        }
        gjVar.b0 = f10;
        MediaController.B().i0(xVar.Q, f10);
    }

    @Override // oi.h0
    public i9 a1() {
        return (s4) this.b;
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

    @Override // l.i
    public void b(l.k kVar) {
        switch (this.a) {
            case 10:
                g1 g1Var = ((ActionMenuView) this.b).L;
                if (g1Var != null) {
                    g1Var.b(kVar);
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

    @Override // n2.v
    public void b0(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 1));
        }
    }

    @Override // o0.a
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // oi.h0
    public oi.a c1() {
        return ((s4) this.b).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // li.j0, o0.a
    public void close() {
        switch (this.a) {
            case 9:
                ((li.s) this.b).finishFragment();
                break;
            default:
                ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            f4.e((ExecutorService) contentProviderClient);
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

    @Override // n2.v
    public void d(int i7) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ai.c1(aVar, i7, 18));
        }
    }

    @Override // oi.h0
    public void e(oi.f1 f1Var) {
        m3 m3Var = ((s4) this.b).O;
        if (m3Var != null) {
            t3 t3Var = m3Var.a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.k(f1Var, true);
        }
    }

    @Override // n2.v
    public void f(boolean z10) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new ch.k(12, aVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.si
    public void f0(gh ghVar) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.g2) ((kg.n) this.b)).currentAccount;
        ls.f(i7).d(ghVar);
    }

    @Override // org.telegram.ui.Components.xm0
    public void g(float f10) {
        gj gjVar = ((oi.x) this.b).Q;
        if (gjVar == null) {
            return;
        }
        gjVar.b0 = f10;
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // oi.h0
    public boolean g1() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var == null) {
            return false;
        }
        oi.a aVar = s4Var.a;
        return m3Var.a.V4();
    }

    @Override // org.telegram.ui.Components.an0
    public CharSequence getContentDescription() {
        s10 s10Var;
        switch (this.a) {
            case 26:
                return " ";
            case 27:
                u7 u7Var = (u7) this.b;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(u7Var.s)) {
                        sb2.append(u7Var.s);
                    }
                    t7 t7Var = u7Var.r;
                    if (t7Var != null && (s10Var = t7Var.e) != null) {
                        CharSequence charSequence = (CharSequence) s10Var.g(0, Integer.valueOf(u7Var.f));
                        if (!TextUtils.isEmpty(charSequence)) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(charSequence);
                        }
                        CharSequence charSequence2 = (CharSequence) u7Var.r.e.g(-1, Integer.valueOf(u7Var.r.b()));
                        CharSequence charSequence3 = (CharSequence) u7Var.r.e.g(1, Integer.valueOf(u7Var.r.a()));
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
                    a8.g(th2, true);
                    return u7Var.s;
                }
            default:
                StringBuilder sb3 = new StringBuilder();
                f8 f8Var = (f8) this.b;
                sb3.append(org.telegram.messenger.hd.G(f8Var.x2 / 60, "Minutes", new Object[0]));
                sb3.append(' ');
                sb3.append(org.telegram.messenger.hd.G(f8Var.x2 % 60, "Seconds", new Object[0]));
                return org.telegram.messenger.hd.a0("AccDescrPlayerDuration", null, 2131754805, sb3.toString(), org.telegram.messenger.hd.G(f8Var.y2 / 60, "Minutes", new Object[0]) + ' ' + org.telegram.messenger.hd.G(f8Var.y2 % 60, "Seconds", new Object[0]));
        }
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // l.i
    public boolean h(l.k kVar, MenuItem menuItem) {
        switch (this.a) {
            case 10:
                m.k kVar2 = ((ActionMenuView) this.b).Q;
                if (kVar2 != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((t5) kVar2).b).a0.c).iterator();
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

    @Override // tg.c
    public void i() {
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

    @Override // n2.v
    public void j(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.h0 = true;
        k8.a aVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new c4(aVar, j3, 14));
        }
    }

    @Override // n2.v
    public void k(n2.s0 s0Var) {
        k8.a aVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new n2.r(aVar, s0Var, 0));
        }
    }

    @Override // oi.h0
    public void k2() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            t3.S1(m3Var.a);
        }
    }

    @Override // b3.k
    public b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        int i10 = sVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        b3.i iVar = min == -9223372036854775807L ? b3.p.f : new b3.i(0, min, false);
        hVar.q.r(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override // oi.h0
    public void l1(int i7, int i10) {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            oi.g2 g2Var = m3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i7, i10);
            }
        }
    }

    @Override // h9.h1
    public Object m(Object obj, Object obj2) {
        return ((g9.k) this.b).apply(obj2);
    }

    @Override // ue.a
    public /* synthetic */ boolean m0() {
        return true;
    }

    @Override // ue.a
    public boolean m1() {
        return true;
    }

    @Override // org.telegram.ui.Components.an0
    public void n(boolean z10, float f10) {
        int round;
        switch (this.a) {
            case 26:
                c61 c61Var = (c61) ((org.telegram.ui.Cells.j0) this.b);
                int i7 = (int) (m6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                m6.q = f10;
                if (i7 != i10) {
                    ThemeActivity themeActivity = c61Var.f.e;
                    mj0 mj0Var = (mj0) themeActivity.b.K(themeActivity.g0);
                    if (mj0Var != null) {
                        ((a9) mj0Var.a).setText(org.telegram.messenger.hd.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (m6.q * 100.0f))));
                    }
                    m6.F(true);
                    break;
                }
                break;
            case 27:
                u7 u7Var = (u7) this.b;
                t7 t7Var = u7Var.r;
                if (t7Var != null && u7Var.n != null) {
                    if (t7Var.c != null) {
                        double length = f10 * (r3.length - 1);
                        int j3 = Utilities.j((int) Math.floor(length), u7Var.r.c.length - 1, 0);
                        int j10 = Utilities.j((int) Math.ceil(length), u7Var.r.c.length - 1, 0);
                        int[] iArr = u7Var.r.c;
                        round = Math.round(org.telegram.messenger.g0.W1(Math.round(((float) (length - Math.floor(length))) * u7Var.r.d) / u7Var.r.d, iArr[j3], iArr[j10]));
                    } else {
                        round = Math.round(((u7Var.r.a() - u7Var.r.b()) * f10) + t7Var.b());
                    }
                    int i11 = u7Var.h;
                    if (i11 != Integer.MIN_VALUE) {
                        round = Math.max(round, i11);
                    }
                    int i12 = u7Var.f;
                    if (i12 != round) {
                        if (u7Var.c(i12) != u7Var.c(round)) {
                            org.telegram.messenger.g0.a4(u7Var.e);
                        }
                        u7Var.f = round;
                        u7Var.e(round, true);
                        y10 y10Var = u7Var.n;
                        if (y10Var != null) {
                            y10Var.a(Integer.valueOf(u7Var.f));
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
                    ((f8) this.b).c1(gjVar, false);
                    break;
                }
                break;
        }
    }

    @Override // n2.v
    public void o1() {
        ((FfmpegAudioRenderer) this.b).a0 = true;
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onStateChanged(boolean z10, int i7) {
        v5 v5Var = (v5) this.b;
        s5 s5Var = v5Var.N;
        i61 i61Var = v5Var.y;
        if (i61Var == null) {
            return;
        }
        if (i61Var.d0()) {
            org.telegram.messenger.g0.g3(s5Var);
        } else {
            org.telegram.messenger.g0.r(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g61
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        tg.t1 t1Var = ((v5) this.b).x;
        if (t1Var != null) {
            float f11 = i7 / i10;
            if (Math.abs(t1Var.z0 - f11) >= 1.0E-4f) {
                t1Var.z0 = f11;
                t1Var.requestLayout();
            }
        }
    }

    @Override // b3.k
    public void p(b3.m mVar, long j3, long j10, boolean z10) {
        ((o2.h) this.b).x((b3.s) mVar, j3, j10);
    }

    @Override // c4.m
    public /* synthetic */ c4.d q(int i7, int i10, byte[] bArr) {
        return a8.p0.a(this, bArr, i10);
    }

    @Override // og.n
    public void r() {
        ((hi.o0) this.b).e.invalidate();
    }

    @Override // org.telegram.ui.Components.an0
    public int r0() {
        switch (this.a) {
            case 26:
                return 0;
            case 27:
                t7 t7Var = ((u7) this.b).r;
                if (t7Var == null) {
                    return 0;
                }
                if (t7Var.c == null) {
                    return t7Var.a() - t7Var.b();
                }
                return t7Var.d * (r1.length - 1);
            default:
                return 0;
        }
    }

    @Override // b3.k
    public void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        if (i7 == 0) {
            long j11 = sVar.a;
            uVar = new x2.u(sVar.b, j3);
        } else {
            long j12 = sVar.a;
            j2.m mVar2 = sVar.b;
            j2.b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        hVar.q.u(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override // ue.a
    public void t(float f10, float f11) {
        cu cuVar = (cu) this.b;
        bu i02 = cu.i0(cuVar, f10, f11);
        bu buVar = cuVar.b0;
        if (i02 != buVar) {
            buVar = null;
        }
        cu.j0(cuVar, buVar);
    }

    @Override // ue.a
    public void t0() {
        cu cuVar = (cu) this.b;
        cu.j0(cuVar, cuVar.b0);
    }

    @Override // oi.h0
    public void u() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            t3.T1(m3Var.a, s4Var.a);
        }
    }

    @Override // oi.h0
    public void u1() {
        s4 s4Var = (s4) this.b;
        m3 m3Var = s4Var.O;
        if (m3Var != null) {
            oi.a aVar = s4Var.a;
            t3 t3Var = m3Var.a;
            oi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    @Override // c4.m
    public void v(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        g2.b a10;
        h2.x xVar = (h2.x) this.b;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            la.e("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                g2.a aVar = null;
                while (i11 > 0) {
                    la.e("Incomplete vtt cue box header found.", i11 >= 8);
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

    @Override // c4.m
    public int y() {
        return 2;
    }

    @Override // b3.k
    public void z(b3.m mVar, long j3, long j10) {
        long j11;
        b3.s sVar = (b3.s) mVar;
        o2.h hVar = (o2.h) this.b;
        long j12 = sVar.a;
        j2.m mVar2 = sVar.b;
        j2.b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        hVar.m.getClass();
        hVar.q.p(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) sVar.f;
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
            if (i10 < hVar.m.R4(sVar.c)) {
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
                if (sVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = g7.a(sVar.d.c);
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

    public g1(ga.d dVar) {
        this.a = 4;
        this.b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    @Override // org.telegram.ui.Components.g61
    public void onRenderedFirstFrame() {
    }

    public g1(int i7) {
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

    public g1(String str, long j3) {
        this.a = 22;
        this.b = new org.telegram.messenger.l0(str, j3);
    }

    public g1(Context context, Uri uri) {
        this.a = 15;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g1(String str, Set set) {
        this.a = 23;
        this.b = new org.telegram.messenger.o0(str, set);
    }

    public g1(String str, boolean z10) {
        this.a = 21;
        this.b = new org.telegram.messenger.h0(str, z10);
    }

    private final void H() {
    }

    private final /* synthetic */ void I() {
    }

    private final void J() {
    }

    @Override // n2.v
    public /* synthetic */ void D1() {
    }

    @Override // og.n
    public void G() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void K0() {
    }

    @Override // n2.v
    public /* synthetic */ void a0() {
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void v0() {
    }

    @Override // og.n
    public void D(boolean z10) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // og.n
    public void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.g61
    public void onError(i61 i61Var, Exception exc) {
    }

    @Override // ue.a
    public /* synthetic */ void e1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void o(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void x(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.si
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
