package k2;

import ai.n8;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import b2.s0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.b2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e2;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bc1;
import org.telegram.ui.l9;
import org.telegram.ui.t9;
import org.telegram.ui.ts0;
import org.telegram.ui.web.d1;
import pg.a1;
import pg.c1;
import pg.z0;
import s4.h1;
import s4.p0;
import w7.x8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class u implements n, e2, y2.h, le.d, l.i, l2.h, k1.f, eo0, le.f, lg.o, d71, b2, t9, com.google.android.gms.common.api.internal.s, h1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // l.i
    public boolean A(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).P;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((a4.m) kVar2).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.c0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // le.d
    public void C(float f7, int i10) {
        ((le.j) this.b).i(f7);
    }

    @Override // le.d
    public void D(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.b).i(f7);
    }

    @Override // le.f
    public void E() {
        ((k9) this.b).a.invalidate();
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // m.e2
    public void G(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // l2.h
    public boolean H() {
        return true;
    }

    @Override // s4.h1
    public View I(int i10) {
        return ((s4.o0) this.b).q(i10);
    }

    @Override // k2.n
    public void J() {
        x2.p pVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            pVar = ffmpegAudioRenderer.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // org.telegram.ui.t9
    public String J0() {
        return ((d1) this.b).i0;
    }

    @Override // org.telegram.ui.t9
    public void K(String str) {
        d1 d1Var = (d1) this.b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // lg.o
    public void L(boolean z10) {
        ((ue0) this.b).c.setAspectLock(z10);
    }

    @Override // l2.h
    public long M() {
        return 0L;
    }

    @Override // s4.h1
    public int N(View view) {
        return s4.o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override // gg.b2
    public boolean O(int i10) {
        return i10 == ((dq0) this.b).r;
    }

    @Override // l2.h
    public long P(long j3) {
        return 1L;
    }

    @Override // k2.n
    public void R(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 1));
        }
    }

    @Override // l2.h
    public long S(long j3, long j10) {
        return 1L;
    }

    @Override // k1.f
    public Object T(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.b).T(new n1.c(pVar, null, 0), cVar);
    }

    @Override // k2.n
    public void U() {
        ((FfmpegAudioRenderer) this.b).Z = true;
    }

    @Override // y2.h
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
        ((l2.g) this.b).w((y2.p) jVar, j10);
    }

    public void W() {
        a1 a1Var = ((c1) this.b).d;
        if (a1Var != null) {
            z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            z0 z0Var2 = new z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        bc1 bc1Var = (bc1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (i6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        i6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = bc1Var.e.e;
            vk0 vk0Var = (vk0) themeActivity.b.K(themeActivity.f0);
            if (vk0Var != null) {
                ((e9) vk0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (i6.q * 100.0f))));
            }
            i6.E(true);
        }
    }

    @Override // k2.n
    public void Y(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 0));
        }
    }

    public s0.c Z(int i10) {
        return null;
    }

    public s0.c a0(int i10) {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 21:
                g8.e eVar = (g8.e) this.b;
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, eVar);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                break;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar2 = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar2.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, aVar);
                eVar2.J0(I0, 1);
                break;
        }
    }

    @Override // l2.h
    public long b(long j3) {
        return 0L;
    }

    public void b0(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public boolean c0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // s4.h1
    public int d(View view) {
        return s4.o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    public void d0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + f0());
    }

    @Override // k2.n
    public void e(long j3) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    public void e0(long j3) {
        long f02 = f0();
        if (f02 != j3) {
            if (f02 != -1) {
                if (f02 != -2) {
                    return;
                } else {
                    f02 = -2;
                }
            }
            StringBuilder u10 = a4.a.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(f02);
            throw new IOException(u10.toString());
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // l2.h
    public long f(long j3, long j10) {
        return 0L;
    }

    public long f0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // lg.o
    public void g0(boolean z10) {
        ue0 ue0Var = (ue0) this.b;
        ue0Var.getClass();
        te0 te0Var = ue0Var.a;
        if (te0Var != null) {
            ((ts0) te0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // k1.f
    public ce.b getData() {
        return ((k1.a0) this.b).c;
    }

    @Override // gg.b2
    public void h(int i10) {
        dq0 dq0Var = (dq0) this.b;
        hq0 hq0Var = dq0Var.K;
        dq0Var.s = i10;
        if (dq0Var.v != i10) {
            dq0Var.d.clear();
        }
        int i11 = dq0Var.J;
        if (dq0Var.h() != 0 || dq0Var.e.e() || dq0Var.I) {
            hq0Var.x0.b(i11);
        } else {
            hq0Var.Q.e(false, true);
        }
        dq0Var.l();
        int i12 = hq0.a1;
        hq0Var.K0(true);
    }

    @Override // le.f
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // l2.h
    public long j(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // le.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // lg.o
    public void k0() {
        te0 te0Var = ((ue0) this.b).a;
        if (te0Var != null) {
            PhotoViewer photoViewer = ((ts0) te0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override // k2.n
    public void l0(k kVar) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new h(yVar, kVar, 1));
        }
    }

    @Override // l2.h
    public m2.j m(long j3) {
        return (m2.j) this.b;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int m0() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = pVar.c;
        gVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.l)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.m.f : new k4.d(0, j11, false);
            gVar.q.r(tVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        gVar.q.r(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // y2.h
    public void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        if (i10 == 0) {
            long j11 = pVar.a;
            tVar = new u2.t(pVar.b);
        } else {
            long j12 = pVar.a;
            Uri uri = pVar.d.c;
            tVar = new u2.t(j10);
        }
        gVar.q.s(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new n8(yVar, i10, 11));
        }
    }

    @Override // org.telegram.ui.t9
    public void onDismiss() {
        d1 d1Var = (d1) this.b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        gk0 gk0Var = (gk0) this.b;
        if (z10 && gk0Var.n.n() >= 0) {
            gk0Var.w = true;
        }
        fg0 fg0Var = gk0Var.f;
        bc0 bc0Var = gk0Var.x;
        fg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(bc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(bc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // k2.n
    public void p() {
        ((FfmpegAudioRenderer) this.b).f0 = true;
    }

    @Override // y2.h
    public void q(y2.j jVar, long j3, long j10) {
        int i10;
        long j11;
        y2.p pVar = (y2.p) jVar;
        l2.g gVar = (l2.g) this.b;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        gVar.m.getClass();
        gVar.q.p(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) pVar.f;
        m2.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && gVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                    }
                } else {
                    i10 = i11;
                }
                gVar.M = 0;
            }
            int i12 = gVar.M;
            gVar.M = i12 + 1;
            if (i12 < gVar.m.L3(pVar.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new b5();
                return;
            }
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j3 - j10;
        gVar.K = j3;
        gVar.O += i10;
        synchronized (gVar.t) {
            try {
                if (pVar.b.a.equals(gVar.F)) {
                    Uri uri2 = gVar.H.k;
                    if (uri2 == null) {
                        uri2 = x8.a(pVar.d.c);
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = gVar.H;
        if (!cVar3.d || gVar.L != j11) {
            gVar.y(true);
            return;
        }
        lf.g gVar2 = cVar3.i;
        if (gVar2 == null) {
            gVar.v();
            return;
        }
        String str = gVar2.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = e2.d0.T(gVar2.c) - gVar.K;
                gVar.y(true);
                return;
            } catch (s0 e) {
                gVar.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            gVar.z(gVar2, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            gVar.z(gVar2, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.v();
        } else {
            gVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // m.e2
    public void s(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // l.i
    public void t(l.k kVar) {
        ka.c cVar = ((ActionMenuView) this.b).K;
        if (cVar != null) {
            cVar.t(kVar);
        }
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // s4.h1
    public int u() {
        return ((s4.o0) this.b).D();
    }

    @Override // l2.h
    public long v(long j3, long j10) {
        return 0L;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // s4.h1
    public int x() {
        s4.o0 o0Var = (s4.o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // k2.n
    public void y(int i10, long j3, long j10) {
        n4.y yVar = ((FfmpegAudioRenderer) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new i(yVar, i10, j3, j10, 0));
        }
    }

    @Override // lg.o
    public void z() {
        te0 te0Var = ((ue0) this.b).a;
        if (te0Var != null) {
            ((ts0) te0Var).a.e0.invalidate();
        }
    }

    public /* synthetic */ u(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public u(int i10) {
        this.a = i10;
        switch (i10) {
            case 23:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new zg0(this);
                    break;
                }
            case 27:
                break;
            case 29:
                this.b = new CopyOnWriteArrayList();
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public u(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 20;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public u(Context context, n4.y yVar) {
        this.a = 7;
        n4.x xVar = ((n4.r) yVar.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, xVar);
        } else {
            this.b = new n4.j(context, xVar);
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // k2.n
    public /* synthetic */ void h0() {
    }

    @Override // le.f
    public /* synthetic */ void l() {
    }

    @Override // k2.n
    public /* synthetic */ void r() {
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // le.f
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // l2.h
    public long c(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
