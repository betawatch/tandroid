package g6;

import a8.p0;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bg.m0;
import bi.k1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.r0;
import gb.q0;
import h9.h1;
import hi.j4;
import ii.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import l2.l0;
import li.a3;
import li.a6;
import li.b2;
import li.f1;
import li.g1;
import li.g3;
import li.h4;
import li.i0;
import li.k4;
import li.m4;
import li.m5;
import li.o3;
import li.p3;
import li.q3;
import li.r3;
import li.s3;
import li.t3;
import li.x0;
import m.y0;
import n2.t0;
import org.telegram.messenger.cb;
import org.telegram.messenger.cz;
import org.telegram.messenger.da;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.j0;
import org.telegram.messenger.n0;
import org.telegram.messenger.qs;
import org.telegram.messenger.ra;
import org.telegram.messenger.xa;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.va;
import org.telegram.ui.vs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public /* synthetic */ class d0 implements OnCompleteListener, ib.b, j6.n, h1, i6.a, k0, com.google.android.gms.common.api.internal.p, bi, t4, i0, r3, f1, y0, n2.v, xa, ra, cz, gh.a, lm0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d0(int i7, boolean z9) {
        this.a = i7;
    }

    @Override // gh.a
    public int A() {
        i5 i5Var = (i5) this.b;
        gh.a Q = Q();
        int A = (Q == null || !i5Var.d.b()) ? 0 : Q.A();
        gh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.a, S.A(), A);
        }
        return A;
    }

    @Override // org.telegram.messenger.cz
    public void C() {
        gz gzVar = (gz) this.b;
        HashMap hashMap = gzVar.n;
        gzVar.getNotificationCenter().k(qs.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // gh.a
    public int C0() {
        gh.a Q = Q();
        gh.a S = S();
        int C0 = Q != null ? Q.C0() : 0;
        if (S != null) {
            return i0.a.f(((i5) this.b).a, S.C0(), C0);
        }
        return C0;
    }

    @Override // li.f1
    public /* synthetic */ boolean E(g1 g1Var) {
        return false;
    }

    @Override // li.r3
    public void G() {
        b2 b2Var = (b2) this.b;
        b2.e0(b2Var, false, true);
        int i7 = b2Var.I0;
        b2Var.C0(i7 != 2 ? i7 : 0, true);
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean G1() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // j6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        Iterator it;
        h6.o oVar = (h6.o) this.b;
        try {
            i10 = i7;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof j6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new h6.n(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                j6.b bVar = h6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i7;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, i10, j10, j11);
            i10 = i7;
        }
    }

    @Override // n2.v
    public void H0() {
        a3.s sVar;
        t0 t0Var = (t0) this.b;
        synchronized (t0Var.a) {
            sVar = t0Var.H;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override // n2.v
    public void I() {
        ((t0) this.b).l1 = true;
    }

    @Override // li.i0
    public void I0(CharSequence charSequence) {
        switch (this.a) {
            case 12:
                o3 o3Var = ((x0) this.b).S;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                k4 k4Var = ((m4) this.b).G;
                if (k4Var != null) {
                    p3 p3Var = (p3) k4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.a.w4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // li.r3
    public k60 J(View view) {
        return k60.H((b2) this.b, view);
    }

    @Override // org.telegram.messenger.cz
    public void K(Location location) {
        gz gzVar = (gz) this.b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = g0.b0(location.getLongitude());
        HashMap hashMap = gzVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ij ijVar = (ij) ((Map.Entry) it.next()).getValue();
            gzVar.r0(ez.d(tL_messageMediaGeo, ij.B0(ijVar.k), ijVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        ((li.p) this.b).L(z9, i7, i10, 0L, false);
        li.p pVar = (li.p) this.b;
        bg0 bg0Var = pVar.O;
        if (bg0Var != null) {
            bg0Var.h();
            pVar.O = null;
        }
    }

    @Override // li.i0
    public void L1() {
        switch (this.a) {
            case 12:
                x0 x0Var = (x0) this.b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.a;
                    t3.S1(o3Var.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.a;
                    t3.S1(((p3) k4Var).a);
                    break;
                }
                break;
        }
    }

    @Override // gh.a
    public int M() {
        gh.a Q = Q();
        gh.a S = S();
        int M = Q != null ? Q.M() : 0;
        if (S != null) {
            return i0.a.f(((i5) this.b).a, S.M(), M);
        }
        return M;
    }

    @Override // li.r3
    public void N() {
        b2 b2Var = (b2) this.b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override // gh.a
    public int O() {
        i5 i5Var = (i5) this.b;
        gh.a Q = Q();
        int O = (Q == null || !i5Var.d.b()) ? 0 : Q.O();
        gh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.a, S.O(), O);
        }
        return O;
    }

    @Override // n2.v
    public void O1(long j3, int i7, long j10) {
        j2.n nVar = ((t0) this.b).a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new b3.b(nVar, i7, j3, j10, 1));
        }
    }

    public gh.a Q() {
        s4 s4Var = ((i5) this.b).d;
        if (s4Var != null) {
            return s4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    public da R() {
        m8.d dVar = (m8.d) this.b;
        q6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.b, dVar.d), new LatLng(dVar.c, dVar.e));
        da daVar = new da();
        daVar.a = latLngBounds;
        return daVar;
    }

    @Override // gh.a
    public int R0() {
        gh.a Q = Q();
        gh.a S = S();
        int R0 = Q != null ? Q.R0() : 0;
        if (S != null) {
            return i0.a.f(((i5) this.b).a, S.R0(), R0);
        }
        return R0;
    }

    public gh.a S() {
        s4 s4Var;
        i5 i5Var = (i5) this.b;
        if (i5Var.a >= 1.0f || (s4Var = i5Var.d) == null) {
            return null;
        }
        return s4Var.getButtonsGlassColorProvider();
    }

    @Override // li.i0
    public h9 S0() {
        switch (this.a) {
            case 12:
                return (x0) this.b;
            default:
                return (m4) this.b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw bc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc.e T(ab.q qVar) {
        int f10;
        gc.d dVar;
        gc.b bVar;
        int i7;
        int i10;
        cc.d dVar2;
        int f11;
        gc.e v = qVar.v();
        gc.b bVar2 = qVar.u().a;
        gc.c u10 = qVar.u();
        gc.e v10 = qVar.v();
        int i11 = p1.g.d(8)[u10.b];
        cc.b bVar3 = (cc.b) qVar.b;
        int i12 = bVar3.b;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                if (com.google.android.recaptcha.internal.a.b(i11, i14, i15)) {
                    bVar3.a(i15, i14);
                }
            }
        }
        int i16 = v10.a * 4;
        int i17 = i16 + 17;
        int i18 = v10.d;
        cc.b bVar4 = new cc.b(i17, i17);
        bVar4.d(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar4.d(i19, 0, 8, 9);
        bVar4.d(0, i19, 9, 8);
        int[] iArr = v10.b;
        int length = iArr.length;
        int i20 = 0;
        while (i20 < length) {
            int i21 = iArr[i20] - 2;
            for (int i22 = i13; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar4.d(iArr[i22] - 2, i21, 5, 5);
                }
            }
            i20++;
            i13 = 0;
        }
        int i23 = 2;
        int i24 = 6;
        int i25 = 1;
        bVar4.d(6, 9, 1, i16);
        bVar4.d(9, 6, i16, 1);
        if (v10.a > 6) {
            int i26 = i16 + 6;
            bVar4.d(i26, 0, 3, 6);
            bVar4.d(0, i26, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i27 = i12 - 1;
        int i28 = i27;
        boolean z9 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i28 > 0) {
            if (i28 == i24) {
                i28--;
            }
            int i32 = 0;
            while (i32 < i12) {
                int i33 = z9 ? i27 - i32 : i32;
                int i34 = i25;
                int i35 = 0;
                for (int i36 = i23; i35 < i36; i36 = 2) {
                    int i37 = i28 - i35;
                    if (!bVar4.b(i37, i33)) {
                        i30++;
                        i31 <<= 1;
                        if (bVar3.b(i37, i33)) {
                            i31 |= 1;
                        }
                        if (i30 == 8) {
                            bArr[i29] = (byte) i31;
                            i29++;
                            i30 = 0;
                            i31 = 0;
                        }
                    }
                    i35++;
                }
                i32++;
                i25 = i34;
                i23 = 2;
            }
            z9 = !z9;
            i28 -= 2;
            i24 = 6;
            i23 = 2;
        }
        int i38 = i25;
        if (i29 != i18) {
            throw bc.c.a();
        }
        if (i18 != v.d) {
            throw new IllegalArgumentException();
        }
        f5.u uVar = v.c[bVar2.ordinal()];
        r0[] r0VarArr = (r0[]) uVar.c;
        int i39 = uVar.b;
        int i40 = 0;
        for (r0 r0Var : r0VarArr) {
            i40 += r0Var.a;
        }
        ca.n[] nVarArr = new ca.n[i40];
        int i41 = 0;
        for (r0 r0Var2 : r0VarArr) {
            int i42 = 0;
            while (i42 < r0Var2.a) {
                int i43 = r0Var2.b;
                nVarArr[i41] = new ca.n(i43, new byte[i39 + i43]);
                i42++;
                i41++;
            }
        }
        int length2 = nVarArr[0].b.length;
        int i44 = i40 - 1;
        while (i44 >= 0 && nVarArr[i44].b.length != length2) {
            i44--;
        }
        int i45 = i44 + 1;
        int i46 = length2 - i39;
        int i47 = 0;
        int i48 = 0;
        while (i47 < i46) {
            int i49 = i48;
            int i50 = 0;
            while (i50 < i41) {
                nVarArr[i50].b[i47] = bArr[i49];
                i50++;
                i49++;
            }
            i47++;
            i48 = i49;
        }
        int i51 = i45;
        while (i51 < i41) {
            nVarArr[i51].b[i46] = bArr[i48];
            i51++;
            i48++;
        }
        boolean z10 = false;
        int length3 = nVarArr[0].b.length;
        while (i46 < length3) {
            int i52 = i48;
            int i53 = 0;
            while (i53 < i41) {
                nVarArr[i53].b[i53 < i45 ? i46 : i46 + 1] = bArr[i52];
                i53++;
                i52++;
            }
            i46++;
            i48 = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i40; i55++) {
            i54 += nVarArr[i55].a;
        }
        byte[] bArr2 = new byte[i54];
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        while (i57 < i40) {
            ca.n nVar = nVarArr[i57];
            byte[] bArr3 = nVar.b;
            int i59 = nVar.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i60 = 0; i60 < length4; i60++) {
                iArr2[i60] = bArr3[i60] & 255;
            }
            try {
                int p10 = ((cb.c) this.b).p(iArr2, bArr3.length - i59);
                for (int i61 = 0; i61 < i59; i61++) {
                    bArr3[i61] = (byte) iArr2[i61];
                }
                i56 += p10;
                int i62 = i58;
                int i63 = 0;
                while (i63 < i59) {
                    bArr2[i62] = bArr3[i63];
                    i63++;
                    i62++;
                }
                i57++;
                i58 = i62;
            } catch (ec.c unused) {
                bc.a aVar = bc.a.c;
                if (bc.h.a) {
                    throw new bc.a();
                }
                throw bc.a.c;
            }
        }
        char[] cArr = gc.a.a;
        cc.c cVar = new cc.c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i38);
        int i64 = -1;
        int i65 = -1;
        boolean z11 = false;
        boolean z12 = false;
        cc.d dVar3 = null;
        while (true) {
            try {
                int d = cVar.d();
                gc.d dVar4 = gc.d.c;
                if (d < 4 || (f10 = cVar.f(4)) == 0) {
                    dVar = dVar4;
                } else if (f10 == 1) {
                    dVar = gc.d.d;
                } else if (f10 == 2) {
                    dVar = gc.d.e;
                } else if (f10 == 3) {
                    dVar = gc.d.f;
                } else if (f10 == 4) {
                    dVar = gc.d.h;
                } else if (f10 == 5) {
                    dVar = gc.d.s;
                } else if (f10 == 7) {
                    dVar = gc.d.n;
                } else if (f10 == 8) {
                    dVar = gc.d.r;
                } else if (f10 == 9) {
                    dVar = gc.d.w;
                } else {
                    if (f10 != 13) {
                        throw new IllegalArgumentException();
                    }
                    dVar = gc.d.x;
                }
                int ordinal = dVar.ordinal();
                if (ordinal != 0) {
                    bVar = bVar2;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i7 = i56;
                            i10 = 1;
                            int f12 = cVar.f(8);
                            if ((f12 & 128) == 0) {
                                f11 = f12 & qs.L1;
                            } else if ((f12 & qs.W2) == 128) {
                                f11 = ((f12 & 63) << 8) | cVar.f(8);
                            } else {
                                if ((f12 & qs.B3) != 192) {
                                    throw bc.c.a();
                                }
                                f11 = ((f12 & 31) << 16) | cVar.f(16);
                            }
                            HashMap hashMap = cc.d.c;
                            if (f11 < 0 || f11 >= 900) {
                                break;
                            }
                            cc.d dVar5 = (cc.d) cc.d.c.get(Integer.valueOf(f11));
                            if (dVar5 == null) {
                                throw bc.c.a();
                            }
                            dVar2 = dVar5;
                        } else if (ordinal == 7) {
                            i7 = i56;
                            i10 = 1;
                            dVar2 = dVar3;
                            z11 = true;
                            z10 = true;
                        } else if (ordinal == 8) {
                            i7 = i56;
                            i10 = 1;
                            dVar2 = dVar3;
                            z11 = true;
                            z12 = true;
                            int i66 = i64;
                            if (dVar != dVar4) {
                                if (dVar2 != null) {
                                    i10 = z10 ? 4 : z12 ? 6 : 2;
                                } else if (z10) {
                                    i10 = 3;
                                } else if (z12) {
                                    i10 = 5;
                                }
                                cc.e eVar = new cc.e(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, bVar.toString(), i66, i65, i10);
                                eVar.g = Integer.valueOf(i7);
                                return eVar;
                            }
                            i64 = i66;
                            bVar2 = bVar;
                            dVar3 = dVar2;
                            i56 = i7;
                        } else if (ordinal != 9) {
                            int f13 = cVar.f(dVar.a(v));
                            int ordinal2 = dVar.ordinal();
                            i7 = i56;
                            if (ordinal2 == 1) {
                                gc.a.e(cVar, sb2, f13);
                            } else if (ordinal2 == 2) {
                                gc.a.a(cVar, sb2, f13, z11);
                            } else if (ordinal2 == 4) {
                                gc.a.b(cVar, sb2, f13, dVar3, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw bc.c.a();
                                }
                                gc.a.d(cVar, sb2, f13);
                            }
                        } else {
                            i7 = i56;
                            int f14 = cVar.f(4);
                            int f15 = cVar.f(dVar.a(v));
                            i10 = 1;
                            if (f14 == 1) {
                                gc.a.c(cVar, sb2, f15);
                            }
                        }
                        int i662 = i64;
                        if (dVar != dVar4) {
                        }
                    } else {
                        i7 = i56;
                        i10 = 1;
                        if (cVar.d() < 16) {
                            throw bc.c.a();
                        }
                        i64 = cVar.f(8);
                        i65 = cVar.f(8);
                    }
                    dVar2 = dVar3;
                    int i6622 = i64;
                    if (dVar != dVar4) {
                    }
                } else {
                    bVar = bVar2;
                    i7 = i56;
                }
                i10 = 1;
                dVar2 = dVar3;
                int i66222 = i64;
                if (dVar != dVar4) {
                }
            } catch (IllegalArgumentException unused2) {
                throw bc.c.a();
            }
        }
    }

    @Override // li.f1
    public void T0(CharSequence charSequence) {
        a3 a3Var = ((m5) this.b).E;
        if (a3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        a3Var.a.w4(charSequence.toString());
    }

    public int U() {
        return ((j0) this.b).c;
    }

    @Override // n2.v
    public void U0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        j2.n nVar = ((t0) this.b).a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.p(nVar, exc, 1));
        }
    }

    public LongSparseArray V(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    @Override // li.i0
    public li.a V0() {
        switch (this.a) {
            case 12:
                return ((x0) this.b).a;
            default:
                return ((m4) this.b).a;
        }
    }

    @Override // n2.v
    public void W() {
        l0 l0Var = ((t0) this.b).Y;
        if (l0Var != null) {
            l0Var.a.i0 = true;
        }
    }

    public d0 X(cb cbVar) {
        m8.d dVar = (m8.d) this.b;
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        dVar.getClass();
        double d = dVar.b;
        double d2 = latLng.a;
        dVar.b = Math.min(d, d2);
        dVar.c = Math.max(dVar.c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.b;
        if (isNaN) {
            dVar.d = d10;
            dVar.e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.e = d10;
        }
        return this;
    }

    @Override // n2.v
    public void Y(n2.r0 r0Var) {
        j2.n nVar = ((t0) this.b).a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 1));
        }
    }

    public void Z(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j3, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j10);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
        }
        longSparseArray3.get(j11);
        longSparseArray3.put(j11, obj);
    }

    @Override // li.r3
    public boolean a(float f10) {
        boolean z9;
        b2 b2Var = (b2) this.b;
        FrameLayout frameLayout = b2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= r3[1]) {
                z9 = true;
                b2.e0(b2Var, z9, true);
                return z9;
            }
        }
        z9 = false;
        b2.e0(b2Var, z9, true);
        return z9;
    }

    public Object a0(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override // li.i0
    public boolean a1() {
        switch (this.a) {
            case 12:
                x0 x0Var = (x0) this.b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.a;
                    if (o3Var.a.V4()) {
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.a;
                    if (((p3) k4Var).a.V4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                j6.q qVar = new j6.q(0, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.s) obj).n();
                String[] strArr = (String[]) this.b;
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, qVar);
                p12.writeStringArray(strArr);
                iVar.u1(p12, 5);
                break;
            default:
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
                break;
        }
    }

    @Override // li.i0, li.f1
    public void b(g1 g1Var) {
        switch (this.a) {
            case 12:
                o3 o3Var = ((x0) this.b).S;
                if (o3Var != null) {
                    t3 t3Var = o3Var.a;
                    t3.Q1(t3Var, g1Var);
                    t3Var.o3.r(g1Var, true);
                    break;
                }
                break;
            case 13:
            default:
                a3 a3Var = ((m5) this.b).E;
                if (a3Var != null) {
                    t3 t3Var2 = a3Var.a;
                    t3.Q1(t3Var2, g1Var);
                    t3Var2.o3.r(g1Var, true);
                    break;
                }
                break;
            case 14:
                k4 k4Var = ((m4) this.b).G;
                if (k4Var != null) {
                    t3 t3Var3 = ((p3) k4Var).a;
                    t3.Q1(t3Var3, g1Var);
                    t3Var3.o3.r(g1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // n2.v
    public void c(int i7) {
        u2.j jVar;
        t0 t0Var = (t0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = t0Var.c1) != null) {
            jVar.d(i7);
        }
        j2.n nVar = t0Var.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new m0(nVar, i7, 15));
        }
    }

    @Override // org.telegram.ui.Components.bi
    public void c0(qg qgVar) {
        int i7;
        i7 = ((f2) ((kg.m) this.b)).currentAccount;
        qs.f(i7).d(qgVar);
    }

    @Override // n2.v
    public void c1() {
        ((t0) this.b).j1 = true;
    }

    @Override // ii.k0
    public void close() {
        ((ii.s) this.b).finishFragment();
    }

    @Override // li.r3
    public void d(s3 s3Var, View view) {
        b2 b2Var = (b2) this.b;
        k60 H = k60.H(b2Var, view);
        H.Q = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.x0 = h4.b(H, b2Var, s3Var, false);
    }

    @Override // li.i0
    public void d1(int i7, int i10) {
        switch (this.a) {
            case 12:
                x0 x0Var = (x0) this.b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.a;
                    li.f2 f2Var = o3Var.a.Q3;
                    if (f2Var != null) {
                        f2Var.f(i7, i10);
                        break;
                    }
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.a;
                    li.f2 f2Var2 = ((p3) k4Var).a.Q3;
                    if (f2Var2 != null) {
                        f2Var2.f(i7, i10);
                        break;
                    }
                }
                break;
        }
    }

    @Override // n2.v
    public void e(long j3) {
        t0 t0Var = (t0) this.b;
        t0Var.m1 = true;
        j2.n nVar = t0Var.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new bi.r3(nVar, j3, 15));
        }
    }

    @Override // gh.a
    public int e1() {
        s4 s4Var;
        i5 i5Var = (i5) this.b;
        gh.a Q = Q();
        int e12 = Q != null ? Q.e1() : 0;
        return (i5Var.a >= 1.0f || (s4Var = i5Var.d) == null) ? e12 : i0.a.f(i5Var.a, s4Var.getButtonsGlassBackgroundColor(), e12);
    }

    @Override // n2.v
    public void f(boolean z9) {
        j2.n nVar = ((t0) this.b).a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new k1(12, nVar, z9));
        }
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // li.f1
    public void f1(Editable editable) {
        m5 m5Var = (m5) this.b;
        li.a aVar = m5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = m5Var.r.k2;
        }
        m5Var.w();
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null) {
            return;
        }
        a3Var.a();
    }

    @Override // li.r3
    public void g(int i7) {
        ((b2) this.b).t0(74, i7);
    }

    @Override // fd.a
    public Object get() {
        o9.g firebaseApp = (o9.g) ((d9.o) this.b).a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        q0 q0Var = q0.a;
        return q0.a(firebaseApp);
    }

    @Override // org.telegram.ui.Components.lm0
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vs vsVar = (vs) this.b;
        sb2.append((Object) vsVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) vsVar.b.getText());
        return sb2.toString();
    }

    @Override // li.r3
    public void h() {
        b2 b2Var = (b2) this.b;
        g3 g3Var = b2Var.P.u3;
        b2Var.C0((g3Var != null && g3Var.x() && b2Var.P.F4()) ? 1 : 0, true);
        b2Var.D0();
        b2Var.B0();
    }

    @Override // n2.v
    public void i(n2.r0 r0Var) {
        j2.n nVar = ((t0) this.b).a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 0));
        }
    }

    @Override // li.i0
    public void i1() {
        switch (this.a) {
            case 12:
                x0 x0Var = (x0) this.b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.a;
                    t3 t3Var = o3Var.a;
                    li.f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.g();
                    }
                    t3Var.o3.onContentChanged();
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.a;
                    t3 t3Var2 = ((p3) k4Var).a;
                    li.f2 f2Var2 = t3Var2.Q3;
                    if (f2Var2 != null) {
                        f2Var2.g();
                    }
                    t3Var2.o3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // h9.h1
    public Object j(Object obj, Object obj2) {
        return ((g9.k) this.b).apply(obj2);
    }

    @Override // gh.a
    public float j0() {
        i5 i5Var = (i5) this.b;
        gh.a Q = Q();
        gh.a S = S();
        float j02 = Q != null ? Q.j0() : -1.0f;
        float j03 = S != null ? S.j0() : j02;
        return (j03 < 0.0f || j02 < 0.0f) ? i5Var.a < 0.5f ? j03 : j02 : g0.T1(j03, j02, i5Var.a);
    }

    @Override // ii.k0
    public void k(long j3) {
        ((ii.s) this.b).presentFragment(an.ra(j3));
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        float c10;
        int i7;
        vs vsVar = (vs) this.b;
        if (f10 <= 0.25f) {
            c10 = com.google.android.recaptcha.internal.a.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.recaptcha.internal.a.c(f11, 0.25f, 9437184.0f, TLObject.FLAG_20);
            } else {
                float f12 = f11 - 0.25f;
                c10 = f12 <= 0.25f ? com.google.android.recaptcha.internal.a.c(f12, 0.25f, 9.437184E7f, 10485760) : com.google.android.recaptcha.internal.a.c(f12 - 0.25f, 0.25f, 2097152000 - 104857600, 104857600);
            }
        }
        int i10 = (int) c10;
        long j3 = i10;
        vsVar.b.setText(id.a0("AutodownloadSizeLimitUpTo", null, 2131753772, g0.i0(j3, false, false)));
        vsVar.d = j3;
        r8[] r8VarArr = vsVar.h;
        AnimatorSet[] animatorSetArr = vsVar.n;
        int i11 = vsVar.e;
        i7 = vsVar.r.videosRow;
        if (i11 == i7) {
            vsVar.f.setText(id.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, g0.i0(j3, false, false)));
            boolean z10 = i10 > 2097152;
            if (z10 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z10);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new va(vsVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // li.f1
    public void l0(g1 g1Var, int i7, int i10) {
        a3 a3Var;
        i9 textSelectionHelper;
        m5 m5Var = (m5) this.b;
        if (m5Var.G || i7 == i10 || (a3Var = m5Var.E) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == m5Var) {
            return;
        }
        m5Var.post(new j4(this, g1Var, i10, textSelectionHelper, i7, 4));
    }

    @Override // li.f1
    public /* synthetic */ boolean l1(boolean z9) {
        return false;
    }

    @Override // li.f1
    public boolean m() {
        m5 m5Var = (m5) this.b;
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null) {
            return false;
        }
        return a3Var.a.V4();
    }

    @Override // li.r3
    public void n(li.a aVar) {
        b2 b2Var = (b2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && g0.J1(b2Var)) {
            di diVar = new di(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            diVar.T3 = new qb.a(13);
            diVar.G1 = true;
            diVar.r3.setVisibility(8);
            diVar.q4 = new a3.h(b2Var, aVar, diVar, 15);
            diVar.e1();
            diVar.show();
        }
    }

    @Override // li.r3
    public void o(a6 a6Var, String str) {
        b2 b2Var = (b2) this.b;
        if (b2Var.z0 == null) {
            b2Var.z0 = new ga.d(new l2.y(this, 6), b2Var.getResourceProvider());
        }
        b2Var.z0.k(a6Var, str);
    }

    @Override // gh.a
    public float o0() {
        i5 i5Var = (i5) this.b;
        gh.a Q = Q();
        gh.a S = S();
        float o02 = Q != null ? Q.o0() : -1.0f;
        float o03 = S != null ? S.o0() : o02;
        return (o03 < 0.0f || o02 < 0.0f) ? i5Var.a < 0.5f ? o03 : o02 : g0.T1(o03, o02, i5Var.a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 0:
                c.h((c) ((j) this.b).c, "joinApplication", task);
                break;
            default:
                ((CountDownLatch) this.b).countDown();
                break;
        }
    }

    @Override // li.r3
    public void onContentChanged() {
        b2 b2Var = (b2) this.b;
        if (b2Var.y0 != null) {
            boolean p32 = b2Var.P.p3();
            b2Var.L0 = p32;
            b2Var.y0.f(p32);
            b2Var.y0.invalidate();
        }
        b2Var.H0();
        Runnable runnable = b2Var.M0;
        g0.r(runnable);
        g0.i3(runnable, 1000L);
    }

    @Override // i6.a
    public void p(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) p0.f(f10, 9.0f, 16.0f, 0.5f);
            float f12 = (f11 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f12, f10, height + f12);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, f11, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((i6.h) this.b).e(0, bitmap2);
    }

    @Override // li.r3
    public void q() {
        b2 b2Var = (b2) this.b;
        b2Var.I0 = b2Var.K0;
        b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // li.f1
    public /* synthetic */ boolean s(g1 g1Var) {
        return false;
    }

    @Override // li.i0
    public void t() {
        switch (this.a) {
            case 12:
                x0 x0Var = (x0) this.b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    t3.T1(o3Var.a, x0Var.a);
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    t3.T1(((p3) k4Var).a, m4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // n2.v
    public void t1() {
        l0 l0Var = ((t0) this.b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override // ii.k0
    public void u() {
        ii.s sVar = (ii.s) this.b;
        te.a aVar = sVar.a;
        ii.l0 l0Var = sVar.w;
        aVar.a(l0Var.n && l0Var.l == 0, true);
        sVar.d.f3.O(true);
    }

    @Override // j6.n
    public void v(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.b;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override // gh.a
    public float v0() {
        gh.a Q = Q();
        gh.a S = S();
        float v02 = Q != null ? Q.v0() : 0.0f;
        return S != null ? g0.T1(S.v0(), v02, ((i5) this.b).a) : v02;
    }

    @Override // li.f1
    public void w(int i7, int i10) {
        li.f2 f2Var;
        m5 m5Var = (m5) this.b;
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null || (f2Var = a3Var.a.Q3) == null) {
            return;
        }
        f2Var.f(i7, i10);
    }

    @Override // li.i0
    public i9 w0() {
        switch (this.a) {
            case 12:
                o3 o3Var = ((x0) this.b).S;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.a.getTextSelectionHelper();
            default:
                k4 k4Var = ((m4) this.b).G;
                if (k4Var != null) {
                    return ((p3) k4Var).a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // li.r3
    public void z(q3 q3Var, View view) {
        b2 b2Var = (b2) this.b;
        k60 H = k60.H(b2Var, view);
        H.Q = true;
        b2Var.x0 = h4.c(H, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    public /* synthetic */ d0(j6.r rVar, String[] strArr) {
        this.a = 7;
        this.b = strArr;
    }

    public /* synthetic */ d0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public d0(int i7) {
        this.a = i7;
        switch (i7) {
            case 17:
                this.b = new AtomicInteger(0);
                break;
            case 24:
                this.b = new LongSparseArray();
                break;
            default:
                this.b = new cb.c(ec.a.h, 21);
                break;
        }
    }

    public d0(String str, int i7) {
        this.a = 22;
        this.b = new j0(str, i7);
    }

    public d0(String str, String str2) {
        this.a = 23;
        this.b = new n0(str, str2);
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void F0() {
    }

    @Override // li.f1
    public /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void t0() {
    }

    @Override // li.r3
    public void x() {
    }

    @Override // m.y0
    public void B(int i7) {
    }

    @Override // li.f1
    public /* synthetic */ void F(g1 g1Var) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // m.y0
    public void P(int i7) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // li.r3
    public void y(int i7) {
    }

    @Override // li.r3
    public void r(g1 g1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Components.bi
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
