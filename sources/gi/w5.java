package gi;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.os.Handler;
import android.os.Parcel;
import android.util.LongSparseArray;
import android.view.View;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.uy;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.om0;
import org.telegram.ui.pz;
import org.telegram.ui.ts;
import org.telegram.ui.vz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class w5 implements k51, h6.a, com.google.android.gms.common.api.internal.p, vz, OnCompleteListener, kg.u1, m.x0, m2.x, lm0, org.telegram.ui.Components.r4, mi.j0, n2.i, org.telegram.messenger.qa, org.telegram.messenger.ka, uy, hh.a, om0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w5(int i3, boolean z10) {
        this.a = i3;
    }

    public static void X(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // n2.i
    public boolean A() {
        return true;
    }

    @Override // org.telegram.messenger.uy
    public void B(Location location) {
        yy yyVar = (yy) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = yyVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            zi ziVar = (zi) ((Map.Entry) it.next()).getValue();
            yyVar.r0(wy.d(tL_messageMediaGeo, zi.B0(ziVar.k), ziVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // n2.i
    public long C() {
        return 0L;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // hh.a
    public int F() {
        hh.a P = P();
        hh.a S = S();
        int F = P != null ? P.F() : 0;
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.b).a, S.F(), F);
        }
        return F;
    }

    @Override // mi.j0
    public void F1() {
        mi.t4 t4Var = (mi.t4) this.b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.a;
            mi.t3 t3Var = m3Var.a;
            mi.g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
    }

    @Override // m2.x
    public void G() {
        z2.n nVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        synchronized (ffmpegAudioRenderer.a) {
            nVar = ffmpegAudioRenderer.I;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override // n2.i
    public long H(long j10) {
        return 1L;
    }

    @Override // org.telegram.ui.vz
    public boolean I() {
        return false;
    }

    @Override // m2.x
    public void J(m2.t0 t0Var) {
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 1));
        }
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // n2.i
    public long K(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 15:
                ((mi.c2) this.b).x0(i3, i10, z10);
                break;
            default:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                e0Var.q1(i3, i10, z10);
                e0Var.dismiss();
                break;
        }
    }

    @Override // hh.a
    public int M() {
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        hh.a P = P();
        int M = (P == null || !i5Var.d.b()) ? 0 : P.M();
        hh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.a, S.M(), M);
        }
        return M;
    }

    @Override // m2.x
    public void N(Exception exc) {
        g2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.p(tVar, exc, 1));
        }
    }

    @Override // hh.a
    public float O() {
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        hh.a P = P();
        hh.a S = S();
        float O = P != null ? P.O() : -1.0f;
        float O2 = S != null ? S.O() : O;
        return (O2 < 0.0f || O < 0.0f) ? i5Var.a < 0.5f ? O2 : O : org.telegram.messenger.g0.T1(O2, O, i5Var.a);
    }

    @Override // mi.j0
    public org.telegram.ui.Cells.h9 O0() {
        mi.m3 m3Var = ((mi.t4) this.b).O;
        if (m3Var != null) {
            return m3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    public hh.a P() {
        org.telegram.ui.ActionBar.s4 s4Var = ((org.telegram.ui.ActionBar.i5) this.b).d;
        if (s4Var != null) {
            return s4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override // m2.x
    public void Q() {
        ((FfmpegAudioRenderer) this.b).a0 = true;
    }

    public org.telegram.messenger.x9 R() {
        l8.d dVar = (l8.d) this.b;
        p6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        org.telegram.messenger.x9 x9Var = new org.telegram.messenger.x9();
        x9Var.a = latLngBounds;
        return x9Var;
    }

    public hh.a S() {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        if (i5Var.a >= 1.0f || (s4Var = i5Var.d) == null) {
            return null;
        }
        return s4Var.getButtonsGlassColorProvider();
    }

    public int T() {
        return ((org.telegram.messenger.j0) this.b).c;
    }

    public LongSparseArray U(long j10, long j11) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j10);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j11);
    }

    public w5 V(org.telegram.messenger.va vaVar) {
        l8.d dVar = (l8.d) this.b;
        LatLng latLng = new LatLng(vaVar.a, vaVar.b);
        dVar.getClass();
        double d = dVar.b;
        double d10 = latLng.a;
        dVar.b = Math.min(d, d10);
        dVar.c = Math.max(dVar.c, d10);
        boolean isNaN = Double.isNaN(dVar.d);
        double d11 = latLng.b;
        if (isNaN) {
            dVar.d = d11;
            dVar.e = d11;
            return this;
        }
        double d12 = dVar.d;
        double d13 = dVar.e;
        if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
            if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                dVar.d = d11;
                return this;
            }
            dVar.e = d11;
        }
        return this;
    }

    @Override // hh.a
    public float W() {
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        hh.a P = P();
        hh.a S = S();
        float W = P != null ? P.W() : -1.0f;
        float W2 = S != null ? S.W() : W;
        return (W2 < 0.0f || W < 0.0f) ? i5Var.a < 0.5f ? W2 : W : org.telegram.messenger.g0.T1(W2, W, i5Var.a);
    }

    @Override // mi.j0
    public void W0(CharSequence charSequence) {
        mi.m3 m3Var = ((mi.t4) this.b).O;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    public void Y(long j10, long j11, long j12, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j10, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j11);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
        }
        longSparseArray3.get(j12);
        longSparseArray3.put(j12, obj);
    }

    @Override // m2.x
    public void a(int i3) {
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new cg.l0(tVar, i3, 14));
        }
    }

    @Override // hh.a
    public float a0() {
        hh.a P = P();
        hh.a S = S();
        float a02 = P != null ? P.a0() : 0.0f;
        return S != null ? org.telegram.messenger.g0.T1(S.a0(), a02, ((org.telegram.ui.ActionBar.i5) this.b).a) : a02;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                i6.q qVar = new i6.q(2, (TaskCompletionSource) obj2);
                i6.i iVar = (i6.i) ((i6.s) obj).m();
                String[] strArr = (String[]) this.b;
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.u.d(P0, qVar);
                P0.writeStringArray(strArr);
                iVar.U0(P0, 7);
                break;
            default:
                c6.l lVar = new c6.l((TaskCompletionSource) obj2);
                k7.i iVar2 = (k7.i) ((k7.c) obj).m();
                z5.e eVar = (z5.e) this.b;
                Parcel L0 = iVar2.L0();
                int i3 = k7.f.a;
                L0.writeStrongBinder(lVar);
                k7.f.c(L0, eVar);
                iVar2.M0(L0, 1);
                break;
        }
    }

    @Override // n2.i
    public long b(long j10) {
        return 0L;
    }

    public Object b0(long j10, long j11, long j12) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j10);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j11)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j12);
        longSparseArray.remove(j12);
        return obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public void c(float f10) {
        mi.x xVar = (mi.x) this.b;
        zi ziVar = xVar.Q;
        if (ziVar == null) {
            return;
        }
        ziVar.b0 = f10;
        MediaController.B().i0(xVar.Q, f10);
    }

    @Override // hh.a
    public int c0() {
        hh.a P = P();
        hh.a S = S();
        int c02 = P != null ? P.c0() : 0;
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.b).a, S.c0(), c02);
        }
        return c02;
    }

    @Override // mi.j0
    public void c2() {
        mi.t4 t4Var = (mi.t4) this.b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.a;
            mi.t3.S1(m3Var.a);
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public void d(float f10) {
        zi ziVar = ((mi.x) this.b).Q;
        if (ziVar == null) {
            return;
        }
        ziVar.b0 = f10;
    }

    public void d0(ad.b bVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((oc.u) this.b).c) {
        }
        throw new oc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), bVar);
    }

    @Override // m2.x
    public void e(boolean z10) {
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new ci.e1(12, tVar, z10));
        }
    }

    @Override // m2.x
    public void e0(long j10, int i3, long j11) {
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new a3.b(tVar, i3, j10, j11, 1));
        }
    }

    @Override // mi.j0
    public org.telegram.ui.Cells.g9 e1() {
        return (mi.t4) this.b;
    }

    @Override // mi.j0, mi.g1
    public void f(mi.h1 h1Var) {
        mi.m3 m3Var = ((mi.t4) this.b).O;
        if (m3Var != null) {
            mi.t3 t3Var = m3Var.a;
            mi.t3.Q1(t3Var, h1Var);
            t3Var.p3.E(h1Var, true);
        }
    }

    @Override // m2.x
    public void g(long j10) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.h0 = true;
        m2.t tVar = ffmpegAudioRenderer.J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new ci.e3(tVar, j10, 13));
        }
    }

    @Override // org.telegram.ui.Components.om0
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ts tsVar = (ts) this.b;
        sb2.append((Object) tsVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) tsVar.b.getText());
        return sb2.toString();
    }

    @Override // n2.i
    public long j(long j10, long j11) {
        return 0L;
    }

    @Override // mi.j0
    public mi.a j1() {
        return ((mi.t4) this.b).a;
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        float A;
        int i3;
        ts tsVar = (ts) this.b;
        if (f10 <= 0.25f) {
            A = a1.g.A(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                A = a1.g.A(f11, 0.25f, 9437184.0f, TLObject.FLAG_20);
            } else {
                float f12 = f11 - 0.25f;
                A = f12 <= 0.25f ? a1.g.A(f12, 0.25f, 9.437184E7f, 10485760) : a1.g.A(f12 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
            }
        }
        int i10 = (int) A;
        long j10 = i10;
        tsVar.b.setText(bd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j10, false, false)));
        tsVar.d = j10;
        org.telegram.ui.Cells.q8[] q8VarArr = tsVar.h;
        AnimatorSet[] animatorSetArr = tsVar.n;
        int i11 = tsVar.e;
        i3 = tsVar.r.videosRow;
        if (i11 == i3) {
            tsVar.f.setText(bd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(j10, false, false)));
            boolean z11 = i10 > 2097152;
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new org.telegram.ui.Cells.w9(tsVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // n2.i
    public long l(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // mi.j0
    public boolean l1() {
        mi.t4 t4Var = (mi.t4) this.b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var == null) {
            return false;
        }
        mi.a aVar = t4Var.a;
        return m3Var.a.V4();
    }

    @Override // n2.i
    public o2.j m(long j10) {
        return (o2.j) this.b;
    }

    @Override // org.telegram.ui.vz
    public boolean n(pz pzVar) {
        return false;
    }

    @Override // org.telegram.ui.vz
    public void o(zi ziVar) {
        ji.b0 b0Var = (ji.b0) this.b;
        b0Var.r1.presentFragment(im0.M(b0Var.a, ziVar));
        b0Var.dismiss();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        y5 y5Var = (y5) this.b;
        u5 u5Var = y5Var.N;
        m51 m51Var = y5Var.y;
        if (m51Var == null) {
            return;
        }
        if (m51Var.d0()) {
            org.telegram.messenger.g0.h3(u5Var);
        } else {
            org.telegram.messenger.g0.r(u5Var);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        ug.r1 r1Var = ((y5) this.b).x;
        if (r1Var != null) {
            float f11 = i3 / i10;
            if (Math.abs(r1Var.z0 - f11) >= 1.0E-4f) {
                r1Var.z0 = f11;
                r1Var.requestLayout();
            }
        }
    }

    @Override // m2.x
    public void p() {
        ((FfmpegAudioRenderer) this.b).g0 = true;
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // mi.j0
    public void q1(int i3, int i10) {
        mi.t4 t4Var = (mi.t4) this.b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.a aVar = t4Var.a;
            mi.g2 g2Var = m3Var.a.R3;
            if (g2Var != null) {
                g2Var.f(i3, i10);
            }
        }
    }

    @Override // kg.u1
    public void r(int i3) {
        org.telegram.messenger.g0.h3(new lg.n(this, 2));
    }

    @Override // n2.i
    public long s(long j10, long j11) {
        return 0L;
    }

    @Override // mi.j0
    public void u() {
        mi.t4 t4Var = (mi.t4) this.b;
        mi.m3 m3Var = t4Var.O;
        if (m3Var != null) {
            mi.t3.T1(m3Var.a, t4Var.a);
        }
    }

    @Override // hh.a
    public int u0() {
        hh.a P = P();
        hh.a S = S();
        int u02 = P != null ? P.u0() : 0;
        if (S != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.i5) this.b).a, S.u0(), u02);
        }
        return u02;
    }

    @Override // m2.x
    public void v(m2.t0 t0Var) {
        m2.t tVar = ((FfmpegAudioRenderer) this.b).J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new m2.r(tVar, t0Var, 0));
        }
    }

    @Override // hh.a
    public int w0() {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        hh.a P = P();
        int w02 = P != null ? P.w0() : 0;
        return (i5Var.a >= 1.0f || (s4Var = i5Var.d) == null) ? w02 : i0.a.f(i5Var.a, s4Var.getButtonsGlassBackgroundColor(), w02);
    }

    @Override // hh.a
    public int x() {
        org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.b;
        hh.a P = P();
        int x10 = (P == null || !i5Var.d.b()) ? 0 : P.x();
        hh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.a, S.x(), x10);
        }
        return x10;
    }

    @Override // org.telegram.messenger.uy
    public void y() {
        yy yyVar = (yy) this.b;
        HashMap hashMap = yyVar.n;
        yyVar.getNotificationCenter().k(hs.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // h6.a
    public void z(Bitmap bitmap) {
        i6.b bVar = h6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int e10 = (int) a1.g.e(f10, 9.0f, 16.0f, 0.5f);
            float f11 = (e10 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f11, f10, height + f11);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, e10, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((h6.h) this.b).e(bitmap2, 0);
    }

    public /* synthetic */ w5(com.google.android.gms.common.api.j jVar, Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ w5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public w5(z6.a aVar) {
        this.a = 4;
        p6.m.g(aVar);
        this.b = aVar;
    }

    public w5(int i3) {
        this.a = i3;
        switch (i3) {
            case 18:
                this.b = new ConcurrentHashMap(16);
                break;
            case 23:
                this.b = new LongSparseArray();
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    public w5(String str, int i3) {
        this.a = 21;
        this.b = new org.telegram.messenger.j0(str, i3);
    }

    public w5(String str, String str2) {
        this.a = 22;
        this.b = new org.telegram.messenger.n0(str, str2);
    }

    @Override // m.x0
    public void E(int i3) {
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // m.x0
    public void t(int i3) {
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // m2.x
    public /* synthetic */ void Z() {
    }

    @Override // org.telegram.ui.vz
    public void h() {
    }

    @Override // m2.x
    public /* synthetic */ void q() {
    }

    @Override // n2.i
    public long i(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override // org.telegram.ui.vz
    public void w(zi ziVar, View view, int i3) {
    }
}
