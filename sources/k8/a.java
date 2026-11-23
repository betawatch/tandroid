package k8;

import a3.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.j;
import b3.r;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import e0.g;
import e2.o0;
import f3.i;
import h2.d;
import h2.k0;
import h2.l0;
import h2.x;
import h9.i0;
import hi.t5;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l8.e;
import li.d0;
import li.j0;
import m9.u;
import m9.y;
import n2.q;
import n2.s;
import o0.f;
import oi.a6;
import oi.f1;
import oi.h3;
import oi.h4;
import oi.o;
import oi.q3;
import oi.r3;
import oi.s3;
import oi.t3;
import oi.y3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bw;
import org.telegram.messenger.dj;
import org.telegram.messenger.ea;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.j10;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.m1;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.fr0;
import org.telegram.ui.h5;
import org.telegram.ui.hf0;
import org.telegram.ui.hk0;
import org.telegram.ui.md0;
import org.telegram.ui.qj0;
import org.telegram.ui.rw;
import org.telegram.ui.wj0;
import org.telegram.ui.yg0;
import s2.m;
import s2.p;
import s2.t;
import sg.h0;
import ug.a1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a implements j0, i, r3, an0, mt, m1, tj0, wj0, ui.a, d, t {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // li.j0
    public void A(long j3) {
        ((g2) this.b).presentFragment(bn.ua(j3));
        ((d0) this.c).dismiss();
    }

    @Override // oi.r3
    public void D(int i7) {
        o.T((o) this.c, 74, i7);
    }

    public yg0 D0(int i7, long j3, boolean z10) {
        if (i7 > 0) {
            i7 = ((SparseIntArray) this.c).get(i7, 0);
        }
        if (i7 == 0) {
            return null;
        }
        long j10 = i7;
        LongSparseArray p10 = ((t5) this.b).p(j3, 0L);
        yg0 yg0Var = (yg0) (p10 != null ? p10.get(j10) : null);
        if (yg0Var != null || !z10) {
            return yg0Var;
        }
        yg0 yg0Var2 = new yg0();
        ((t5) this.b).w(j3, 0L, j10, yg0Var2);
        return yg0Var2;
    }

    public String E0(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // li.j0
    public void F() {
        d0 d0Var = (d0) this.c;
        d0Var.w1.d.g3.O(true);
        d0Var.v1.d.g3.O(true);
    }

    @Override // oi.r3
    public void G() {
        o oVar = (o) this.c;
        t3 t3Var = oVar.r;
        y3 y3Var = oVar.s;
        if (y3Var != null) {
            h3 h3Var = t3Var.v3;
            int i7 = (h3Var != null && h3Var.x() && t3Var.F4()) ? 1 : 0;
            if (y3Var.b0 == 2) {
                y3Var.c0 = i7;
            } else {
                y3Var.g(i7, true);
            }
            if (i7 != 0) {
                oVar.b0();
            }
        }
        oVar.e0();
    }

    @Override // oi.r3
    public a70 G0(View view) {
        o oVar = (o) this.c;
        a70 a70Var = new a70(oVar, (h6) this.b, view, false, false, true);
        oVar.I = a70Var;
        return a70Var;
    }

    @Override // oi.r3
    public void H(oi.a aVar) {
        o oVar = (o) this.c;
        ui uiVar = oVar.b;
        g2 g2Var = uiVar.a2;
        if (g2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && g0.J1(g2Var)) {
            ui uiVar2 = new ui(oVar.getContext(), uiVar.a2, false, false, false, null);
            uiVar2.X3 = new qb.a(16);
            uiVar2.K1 = true;
            uiVar2.v3.setVisibility(8);
            uiVar2.u4 = new h(oVar, aVar, uiVar2, 15);
            uiVar2.f1();
            uiVar2.show();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // s2.t
    public r J(p pVar, m mVar) {
        return new h0(8, ((t) this.b).J(pVar, mVar), (List) this.c);
    }

    public boolean J0() {
        n6 n6Var = (n6) this.c;
        return n6Var.M0 > 0.0f || n6Var.D0();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    public void K0(long j3, File file) {
        synchronized (((g) this.c).f) {
            ((HashMap) ((g) this.c).g).put(Long.valueOf(j3), file);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean L0(long j3) {
        return ((py0) this.c).w;
    }

    public void M(bw bwVar, int i7) {
        bwVar.c = Integer.valueOf(i7);
        int i10 = bwVar.d;
        long j3 = i7;
        bwVar.a = j3;
        bwVar.b = j3;
        ((long[]) this.c)[i10] = j3;
    }

    public void M0(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        i0 q10 = i0.q(hashSet);
        hashSet.clear();
        h9.g0 listIterator = q10.listIterator(0);
        while (listIterator.hasNext()) {
            q2.b bVar = (q2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    @Override // h2.d
    public y O(o0 o0Var) {
        Uri uri;
        byte[] bArr;
        md0 md0Var = (md0) this.c;
        if (md0Var != null && (((uri = (Uri) md0Var.c) != null && uri.equals(o0Var.n)) || ((bArr = (byte[]) md0Var.b) != null && Arrays.equals(bArr, o0Var.k)))) {
            y yVar = (y) ((md0) this.c).d;
            yVar.getClass();
            return yVar;
        }
        y O = ((d) this.b).O(o0Var);
        if (O == null) {
            return null;
        }
        this.c = new md0(o0Var, O);
        return O;
    }

    public void P0(f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        t5 t5Var = (t5) this.b;
        int i7 = fVar.b;
        if (i7 != 0) {
            oVar.execute(new j6.o(t5Var, i7));
        } else {
            oVar.execute(new u(24, t5Var, fVar.a));
        }
    }

    @Override // oi.r3
    public void Q() {
        y3 y3Var = ((o) this.c).s;
        if (y3Var != null) {
            int i7 = y3Var.b0;
            if (i7 == 2) {
                i7 = 0;
            }
            y3Var.c0 = i7;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    public void Q0(int i7) {
        bw[] bwVarArr = (bw[]) this.b;
        bw bwVar = bwVarArr[i7];
        Integer num = bwVar.c;
        if (num != null) {
            int i10 = i7 * 2;
            M(bwVarArr[i10], num.intValue());
            M(bwVarArr[i10 + 1], bwVar.c.intValue());
            bwVar.c = null;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // oi.r3
    public void R0(s3 s3Var, View view) {
        o oVar = (o) this.c;
        a70 a70Var = new a70(oVar, (h6) this.b, view, false, false, true);
        a70Var.T = true;
        g2 g2Var = oVar.b.a2;
        oVar.getContext();
        oVar.I = h4.b(a70Var, g2Var, s3Var, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean S(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    public void S0(q2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((q2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        q2.p n10 = bVar.b.n();
        bVar.z = n10;
        android.support.v4.media.session.f fVar = bVar.s;
        String str = l0.a;
        n10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new q2.a(x2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean U(r1 r1Var) {
        return false;
    }

    public long U0(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return Y0(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MIN_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 > j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // oi.r3
    public void V() {
        o oVar = (o) this.c;
        if (oVar.getCurrentItemTop() != oVar.J) {
            oVar.b.N1(oVar, 0);
        }
        oVar.f0();
        o.P(oVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean V0(r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean W() {
        return false;
    }

    public long Y0(int i7, int i10, int i11) {
        bw bwVar = ((bw[]) this.b)[i7];
        if (bwVar.c != null) {
            int i12 = bwVar.d;
            int i13 = bwVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = bwVar.d;
        int i15 = bwVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return bwVar.a;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 0L;
        }
        Q0(i7);
        int i16 = i7 * 2;
        return Math.max(Y0(i16, i10, i11), Y0(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int Z() {
        return 0;
    }

    public long Z0(int i7, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return a1(1, i7, i10);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j3 = Long.MAX_VALUE;
        while (i7 <= i10) {
            long j10 = jArr[i7];
            if (j10 < j3) {
                j3 = j10;
            }
            i7++;
        }
        return j3;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z1(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // oi.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(float f10) {
        boolean z10;
        y3 y3Var = ((o) this.c).s;
        if (y3Var != null) {
            FrameLayout frameLayout = y3Var.I;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f10 >= r4[1]) {
                    z10 = true;
                    y3Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            y3Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // oi.r3
    public void a0(a6 a6Var, String str) {
        o oVar = (o) this.c;
        if (oVar.w == null) {
            h6 h6Var = (h6) this.b;
            oVar.w = new ga.d(new ab.g(29, this, h6Var), h6Var);
        }
        oVar.w.k(a6Var, str);
    }

    public long a1(int i7, int i10, int i11) {
        bw bwVar = ((bw[]) this.b)[i7];
        if (bwVar.c != null) {
            int i12 = bwVar.d;
            int i13 = bwVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = bwVar.d;
        int i15 = bwVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return bwVar.b;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 2147483647L;
        }
        Q0(i7);
        int i16 = i7 * 2;
        return Math.min(a1(i16, i10, i11), a1(i16 + 1, i10, i11));
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean b() {
        return false;
    }

    @Override // oi.r3
    public void b0(int i7) {
        o oVar = (o) this.c;
        oVar.b.N1(oVar, i7);
        oVar.f0();
        o.P(oVar);
    }

    public void b1() {
        m8.a aVar = (m8.a) this.b;
        try {
            v7.f fVar = (v7.f) aVar.a;
            fVar.t1(fVar.p1(), 1);
            ((ea) this.c).c.remove(aVar);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a c0() {
        return null;
    }

    public void c1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 11);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // li.j0, o0.a
    public void close() {
        ((d0) this.c).o1.A(0);
    }

    @Override // org.telegram.ui.wj0
    public void d(String str, String str2) {
        hk0 hk0Var = ((qj0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            hk0Var.S1(true, str2, (hf0) this.b, this, hk0Var.C1);
        } else {
            hk0Var.R1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean d0(r1 r1Var) {
        return false;
    }

    public void d1(int i7) {
        try {
            e eVar = (e) this.b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // f3.i
    public f3.h e(f3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.c;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
        int i7 = -1;
        int i10 = -1;
        long j10 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (k3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = m4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new f3.h(b10, -1, position) : new f3.h(-9223372036854775807L, 0, position + i10);
                    }
                    if (b10 + 100000 > j3) {
                        return new f3.h(-9223372036854775807L, 0, position + xVar.b);
                    }
                    j10 = b10;
                    i10 = xVar.b;
                }
                int i11 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (k3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i11);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a10 = k3.a.a(xVar.b, xVar.a);
                                if (a10 == 442 || a10 == 441 || (a10 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i11);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i11);
                        }
                    } else {
                        xVar.N(i11);
                    }
                } else {
                    xVar.N(i11);
                }
                i7 = xVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new f3.h(j10, -2, position + i7) : f3.h.d;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean e0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    public void e1(double d) {
        m8.a aVar = (m8.a) this.b;
        aVar.getClass();
        try {
            v7.f fVar = (v7.f) aVar.a;
            Parcel p12 = fVar.p1();
            p12.writeDouble(d);
            fVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean f(float f10, float f11, int i7, View view) {
        cx cxVar = (cx) this.c;
        if (view instanceof u2) {
            u2 u2Var = (u2) view;
            if (u2Var.o2) {
                cxVar.h5(u2Var.getDialogId(), view);
                return true;
            }
        }
        rw rwVar = cxVar.A0;
        if (rwVar != null && rwVar.getVisibility() == 0 && cxVar.A0.n) {
            return false;
        }
        return cxVar.F4(view, i7, f10, ((bx) this.b).d);
    }

    @Override // s2.t
    public r f0() {
        return new h0(8, ((t) this.b).f0(), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f1(gj gjVar) {
        return c0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean f2(long j3) {
        return ((py0) this.c).s;
    }

    @Override // org.telegram.ui.Components.mt
    public void g() {
        ((i3) this.c).b(((ot) this.b).getText());
    }

    public void g0() {
        this.b = null;
        this.c = null;
    }

    public void g1(int i7) {
        try {
            v7.f fVar = (v7.f) ((m8.a) this.b).a;
            Parcel p12 = fVar.p1();
            p12.writeInt(i7);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new j(e10);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean h2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String i(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void j() {
        Point point = g0.q;
        if (point.x > point.y) {
            ((cx) this.c).finishPreviewFragment();
        }
    }

    @Override // oi.r3
    public void j1() {
        o oVar = (o) this.c;
        oVar.c0();
        oVar.d0();
    }

    @Override // oi.r3
    public void k(f1 f1Var, boolean z10) {
        ((o) this.c).b.i1(f1Var, z10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int k0(r1 r1Var) {
        return 0;
    }

    @Override // oi.r3
    public void m0() {
        y3 y3Var = ((o) this.c).s;
        if (y3Var != null) {
            y3Var.e(false, true);
            int i7 = y3Var.c0;
            y3Var.g(i7 != 2 ? i7 : 0, true);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public void n(boolean z10, float f10) {
        h5.n1 = f10;
        ((TextView) this.b).setText("Saturation " + (f10 * 5.0f));
        du0 du0Var = ((h5) this.c).m1;
        du0Var.M();
        du0Var.K();
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean n0() {
        return false;
    }

    @Override // ui.a
    public void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        a1 a1Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(m6.a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            a1Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
            canvas.drawRect(f10, f11, f12, f13, a1Var.f);
        }
    }

    @Override // oi.r3
    public void onContentChanged() {
        o oVar = (o) this.c;
        y3 y3Var = oVar.s;
        if (y3Var != null) {
            y3Var.setSendLoading(oVar.r.p3());
        }
        oVar.a0(true);
        oVar.d0();
        oi.d dVar = oVar.Q;
        g0.r(dVar);
        g0.h3(dVar, 1000L);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p0(y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void r(float f10) {
        Point point = g0.q;
        if (point.x > point.y) {
            ((cx) this.c).movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.an0
    public /* synthetic */ int r0() {
        return 0;
    }

    public void s0(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override // f3.i
    public void t() {
        x xVar = (x) this.c;
        byte[] bArr = l0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override // h2.d
    public y t0(byte[] bArr) {
        byte[] bArr2;
        md0 md0Var = (md0) this.c;
        if (md0Var == null || (bArr2 = (byte[]) md0Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            y t02 = ((d) this.b).t0(bArr);
            this.c = new md0(bArr, t02);
            return t02;
        }
        y yVar = (y) ((md0) this.c).d;
        yVar.getClass();
        return yVar;
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(int i7, int i10, int i11) {
        bw[] bwVarArr = (bw[]) this.b;
        bw bwVar = new bw();
        bwVar.c = null;
        bwVarArr[i7] = bwVar;
        bwVar.d = i10;
        bwVar.e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j3 = ((long[]) this.c)[i10];
            bwVar.a = j3;
            bwVar.b = j3;
            return;
        }
        int i12 = i7 * 2;
        int i13 = i11 / 2;
        u(i12, i10, i13);
        int i14 = i12 + 1;
        u(i14, i10 + i13, i11 - i13);
        bw bwVar2 = bwVarArr[i7];
        bw bwVar3 = bwVarArr[i12];
        bwVar3.getClass();
        bw bwVar4 = bwVarArr[i14];
        bwVar4.getClass();
        bwVar2.getClass();
        bwVar2.a = Math.max(bwVar3.a, bwVar4.a);
        bwVarArr[i7].b = Math.min(bwVarArr[i12].b, bwVarArr[i14].b);
    }

    public byte[] v0(q3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // oi.r3
    public void x(q3 q3Var, View view) {
        o oVar = (o) this.c;
        a70 a70Var = new a70(oVar, (h6) this.b, view, false, false, true);
        a70Var.T = true;
        oVar.I = h4.c(a70Var, oVar.b.a2, oVar.getContext(), (h6) this.b, q3Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory x0(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y0(gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public String z(long j3) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((py0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(r1 r1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ k9 z2() {
        return null;
    }

    public /* synthetic */ a(int i7, boolean z10) {
        this.a = i7;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public a(IBinder iBinder) {
        this.a = 4;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new m6.g(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a(e eVar) {
        this.a = 0;
        new HashMap();
        q6.m.h(eVar);
        this.b = eVar;
    }

    public a(String str, String str2) {
        this.a = 25;
        q6.m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(long[] jArr) {
        this.a = 11;
        this.c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.b = new bw[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        u(1, 0, jArr.length);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.an0
    public void C() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x2() {
    }

    public a(d dVar) {
        this.a = 21;
        this.b = dVar;
    }

    public a(k0 k0Var) {
        this.a = 3;
        this.b = k0Var;
        this.c = new x();
    }

    public a(Context context, int i7) {
        this.a = i7;
        switch (i7) {
            case 26:
                q6.m.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.c = null;
                this.b = context;
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void E(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(dj djVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void h0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z0(r1 r1Var) {
    }

    public a(Handler handler, s sVar) {
        this.a = 5;
        if (sVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = sVar;
    }

    public a(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 19;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I(r1 r1Var, p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a2(r1 r1Var, j10 j10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(r1 r1Var, int i7) {
    }

    public a(int i7) {
        this.a = i7;
        switch (i7) {
            case 23:
                this.b = new HashSet();
                break;
            case 24:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new t5();
                this.c = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void B0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void H0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void T0(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void j0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void y2(r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void X(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
