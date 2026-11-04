package m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.yd;
import com.google.android.gms.tasks.TaskCompletionSource;
import gi.v5;
import gi.w5;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mi.b6;
import mi.h1;
import mi.h3;
import mi.i4;
import mi.q3;
import mi.r3;
import mi.s3;
import mi.t3;
import mi.y3;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.yv;
import org.telegram.messenger.z9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xs;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hj0;
import org.telegram.ui.j5;
import org.telegram.ui.jw;
import org.telegram.ui.ng0;
import org.telegram.ui.nj0;
import org.telegram.ui.sg0;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.vq0;
import org.telegram.ui.yj0;
import u4.d1;
import u4.j1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements r3, com.google.android.gms.common.api.internal.p, g2.e, p5.b, om0, vs, l1, ij0, nj0, si.a, qe.d, r2.t, qe.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ t(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    public void A(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(f1.r(str, "=", valueOf, new StringBuilder(length + 1 + valueOf.length())));
    }

    public void C0(long j10, File file) {
        synchronized (((e0.g) this.c).f) {
            ((HashMap) ((e0.g) this.c).g).put(Long.valueOf(j10), file);
        }
    }

    @Override // mi.r3
    public f60 D1(View view) {
        mi.p pVar = (mi.p) this.c;
        f60 f60Var = new f60(pVar, (e6) this.b, view, false, false, true);
        pVar.I = f60Var;
        return f60Var;
    }

    @Override // mi.r3
    public void E(h1 h1Var, boolean z10) {
        ((mi.p) this.c).b.h1(h1Var, z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // qe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(float f10, int i3) {
        boolean z10;
        sh.h hVar = (sh.h) this.c;
        boolean z11 = true;
        if ((hVar.c() == 0.0f && hVar.s == 2) || hVar.s == 3) {
            hVar.s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i10 = hVar.x;
            int i11 = hVar.w;
            if (i10 != i11) {
                hVar.x = i11;
                if (z11) {
                    ((Runnable) this.b).run();
                }
                hVar.a();
            }
        }
        z11 = z10;
        if (z11) {
        }
        hVar.a();
    }

    public d2.t0 F0(d1 d1Var, int i3) {
        j1 j1Var;
        d2.t0 t0Var;
        a0.f fVar = (a0.f) this.b;
        int d = fVar.d(d1Var);
        if (d >= 0 && (j1Var = (j1) fVar.i(d)) != null) {
            int i10 = j1Var.a;
            if ((i10 & i3) != 0) {
                int i11 = i10 & (~i3);
                j1Var.a = i11;
                if (i3 == 4) {
                    t0Var = j1Var.b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    t0Var = j1Var.c;
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    j1Var.a = 0;
                    j1Var.b = null;
                    j1Var.c = null;
                    j1.d.q(j1Var);
                }
                return t0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(q1 q1Var) {
        return null;
    }

    public void H0(int i3) {
        yv[] yvVarArr = (yv[]) this.b;
        yv yvVar = yvVarArr[i3];
        Integer num = yvVar.c;
        if (num != null) {
            int i10 = i3 * 2;
            g0(yvVarArr[i10], num.intValue());
            g0(yvVarArr[i10 + 1], yvVar.c.intValue());
            yvVar.c = null;
        }
    }

    public long I0(int i3, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return M0(1, i3, i10);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j10 = Long.MIN_VALUE;
        while (i3 <= i10) {
            long j11 = jArr[i3];
            if (j11 > j10) {
                j10 = j11;
            }
            i3++;
        }
        return j10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean J0(long j10) {
        return ((dy0) this.c).w;
    }

    @Override // g2.e
    public l9.y L(d2.q0 q0Var) {
        l9.y L = ((g2.e) this.b).L(q0Var);
        if (L == null) {
            return null;
        }
        return yd.c(L, new l5.b(this, 21));
    }

    public void M(d1 d1Var, d2.t0 t0Var) {
        a0.f fVar = (a0.f) this.b;
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var == null) {
            j1Var = j1.a();
            fVar.put(d1Var, j1Var);
        }
        j1Var.c = t0Var;
        j1Var.a |= 8;
    }

    public long M0(int i3, int i10, int i11) {
        yv yvVar = ((yv[]) this.b)[i3];
        if (yvVar.c != null) {
            int i12 = yvVar.d;
            int i13 = yvVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = yvVar.d;
        int i15 = yvVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return yvVar.a;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 0L;
        }
        H0(i3);
        int i16 = i3 * 2;
        return Math.max(M0(i16, i10, i11), M0(i16 + 1, i10, i11));
    }

    @Override // mi.r3
    public void O(int i3) {
        mi.p.S((mi.p) this.c, 74, i3);
    }

    public long O0(int i3, int i10) {
        long[] jArr = (long[]) this.c;
        if (jArr.length >= 30) {
            return T0(1, i3, i10);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i10 > jArr.length - 1) {
            i10 = jArr.length - 1;
        }
        long j10 = Long.MAX_VALUE;
        while (i3 <= i10) {
            long j11 = jArr[i3];
            if (j11 < j10) {
                j10 = j11;
            }
            i3++;
        }
        return j10;
    }

    @Override // mi.r3
    public void O1() {
        mi.p pVar = (mi.p) this.c;
        pVar.c0();
        pVar.d0();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // mi.r3
    public void R0() {
        mi.p pVar = (mi.p) this.c;
        if (pVar.getCurrentItemTop() != pVar.J) {
            pVar.b.M1(pVar, 0);
        }
        pVar.f0();
        mi.p.O(pVar);
    }

    @Override // r2.t
    public a3.s R1() {
        return new ua.b(2, ((r2.t) this.b).R1(), (List) this.c);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    public long T0(int i3, int i10, int i11) {
        yv yvVar = ((yv[]) this.b)[i3];
        if (yvVar.c != null) {
            int i12 = yvVar.d;
            int i13 = yvVar.e;
            if (i10 >= i12 && i11 <= i13) {
                return r1.intValue();
            }
        }
        int i14 = yvVar.d;
        int i15 = yvVar.e;
        if (i14 >= i10 && i15 <= i11) {
            return yvVar.b;
        }
        if ((i10 > i14 || i11 < i14) && (i10 < i14 || i10 > i15)) {
            return 2147483647L;
        }
        H0(i3);
        int i16 = i3 * 2;
        return Math.min(T0(i16, i10, i11), T0(i16 + 1, i10, i11));
    }

    @Override // mi.r3
    public void T1(q3 q3Var, View view) {
        mi.p pVar = (mi.p) this.c;
        f60 f60Var = new f60(pVar, (e6) this.b, view, false, false, true);
        f60Var.Q = true;
        pVar.I = i4.c(f60Var, pVar.b.X1, pVar.getContext(), (e6) this.b, q3Var, true);
    }

    public void U0() {
        l8.a aVar = (l8.a) this.b;
        try {
            u7.f fVar = (u7.f) aVar.a;
            fVar.T0(fVar.P0(), 1);
            ((z9) this.c).c.remove(aVar);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public void V0(d1 d1Var) {
        j1 j1Var = (j1) ((a0.f) this.b).get(d1Var);
        if (j1Var == null) {
            return;
        }
        j1Var.a &= -2;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean V1(long j10) {
        return ((dy0) this.c).s;
    }

    @Override // mi.r3
    public void W(s3 s3Var, View view) {
        mi.p pVar = (mi.p) this.c;
        f60 f60Var = new f60(pVar, (e6) this.b, view, false, false, true);
        f60Var.Q = true;
        d2 d2Var = pVar.b.X1;
        pVar.getContext();
        pVar.I = i4.b(f60Var, d2Var, s3Var, true);
    }

    public void W0(d1 d1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            }
            if (d1Var == hVar.n(m10)) {
                Object[] objArr = hVar.c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.a = true;
                }
            } else {
                m10--;
            }
        }
        j1 j1Var = (j1) fVar.get(d1Var);
        if (j1Var != null) {
            fVar.remove(d1Var);
            j1Var.a = 0;
            j1Var.b = null;
            j1Var.c = null;
            j1.d.q(j1Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        sh.h hVar = (sh.h) this.c;
        hVar.c.a(f10);
        hVar.d.a(f10);
        hVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    @Override // mi.r3
    public void Y0(int i3) {
        mi.p pVar = (mi.p) this.c;
        pVar.b.M1(pVar, i3);
        pVar.f0();
        mi.p.O(pVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        return null;
    }

    @Override // mi.r3
    public void Z0(b6 b6Var, String str) {
        mi.p pVar = (mi.p) this.c;
        if (pVar.w == null) {
            e6 e6Var = (e6) this.b;
            pVar.w = new fa.f(new ai.n(28, this, e6Var), e6Var);
        }
        pVar.w.k(b6Var, str);
    }

    @Override // qe.d
    public void a() {
        ((qe.i) this.b).a();
    }

    @Override // mi.r3
    public void a0() {
        mi.p pVar = (mi.p) this.c;
        t3 t3Var = pVar.r;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            h3 h3Var = t3Var.v3;
            int i3 = (h3Var != null && h3Var.x() && t3Var.F4()) ? 1 : 0;
            if (y3Var.b0 == 2) {
                y3Var.c0 = i3;
            } else {
                y3Var.g(i3, true);
            }
            if (i3 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public void a1(int i3) {
        try {
            u7.f fVar = (u7.f) ((l8.a) this.b).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i3);
            fVar.T0(P0, 11);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        int i3;
        switch (this.a) {
            case 2:
                n7.d dVar = (n7.d) this.b;
                n7.b bVar = (n7.b) obj;
                d7.b bVar2 = new d7.b(dVar, (TaskCompletionSource) obj2);
                Context context = dVar.a;
                try {
                    i3 = y6.b.a(context).d(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i3 = 0;
                }
                l6.b bVar3 = (l6.b) this.c;
                bVar3.f = i3;
                n7.c cVar = (n7.c) bVar.m();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), true);
                gVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i10 = n7.a.a;
                obtain.writeStrongBinder(bVar2);
                obtain.writeInt(1);
                bVar3.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    cVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                u6.d dVar2 = new u6.d((u6.e) this.b, (TaskCompletionSource) obj2, 1);
                u6.c cVar2 = (u6.c) ((u6.f) obj).m();
                u6.a aVar = (u6.a) this.c;
                Parcel J0 = cVar2.J0();
                m7.a.c(J0, dVar2);
                m7.a.b(J0, aVar);
                J0.writeStrongBinder(null);
                cVar2.K0(J0, 2);
                return;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        uw uwVar = (uw) this.c;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            if (t2Var.o2) {
                uwVar.Z4(t2Var.getDialogId(), view);
                return true;
            }
        }
        jw jwVar = uwVar.A0;
        if (jwVar != null && jwVar.getVisibility() == 0 && uwVar.A0.n) {
            return false;
        }
        return uwVar.A4(view, i3, f10, ((tw) this.b).d);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var) {
        return false;
    }

    @Override // mi.r3
    public void b1(mi.a aVar) {
        mi.p pVar = (mi.p) this.c;
        bi biVar = pVar.b;
        d2 d2Var = biVar.X1;
        if (d2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(d2Var)) {
            bi biVar2 = new bi(pVar.getContext(), biVar.X1, false, false, false, null);
            biVar2.U3 = new kb.a(15);
            biVar2.H1 = true;
            biVar2.s3.setVisibility(8);
            biVar2.r4 = new aa.a(pVar, aVar, biVar2, 11);
            biVar2.e1();
            biVar2.show();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return false;
    }

    public void c0(int i3, int i10, int i11) {
        yv[] yvVarArr = (yv[]) this.b;
        yv yvVar = new yv();
        yvVar.c = null;
        yvVarArr[i3] = yvVar;
        yvVar.d = i10;
        yvVar.e = (i10 + i11) - 1;
        if (i11 == 1) {
            long j10 = ((long[]) this.c)[i10];
            yvVar.a = j10;
            yvVar.b = j10;
            return;
        }
        int i12 = i3 * 2;
        int i13 = i11 / 2;
        c0(i12, i10, i13);
        int i14 = i12 + 1;
        c0(i14, i10 + i13, i11 - i13);
        yv yvVar2 = yvVarArr[i3];
        yv yvVar3 = yvVarArr[i12];
        yvVar3.getClass();
        yv yvVar4 = yvVarArr[i14];
        yvVar4.getClass();
        yvVar2.getClass();
        yvVar2.a = Math.max(yvVar3.a, yvVar4.a);
        yvVarArr[i3].b = Math.min(yvVarArr[i12].b, yvVarArr[i14].b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // mi.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(float f10) {
        boolean z10;
        y3 y3Var = ((mi.p) this.c).s;
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

    public void e1(double d) {
        l8.a aVar = (l8.a) this.b;
        aVar.getClass();
        try {
            u7.f fVar = (u7.f) aVar.a;
            Parcel P0 = fVar.P0();
            P0.writeDouble(d);
            fVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.nj0
    public void f(String str, String str2) {
        yj0 yj0Var = ((hj0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            yj0Var.S1(true, str2, (sg0) this.b, this, yj0Var.C1);
        } else {
            yj0Var.R1(true, false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(q1 q1Var) {
        return null;
    }

    public void g0(yv yvVar, int i3) {
        yvVar.c = Integer.valueOf(i3);
        int i10 = yvVar.d;
        long j10 = i3;
        yvVar.a = j10;
        yvVar.b = j10;
        ((long[]) this.c)[i10] = j10;
    }

    public void g1(int i3) {
        try {
            u7.f fVar = (u7.f) ((l8.a) this.b).a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i3);
            fVar.T0(P0, 9);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // cd.a
    public Object get() {
        return new o5.d((Context) ((c9.o) this.b).a, (k4.j) ((v5) this.c).get());
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public void h() {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((uw) this.c).finishPreviewFragment();
        }
    }

    public int h1(Context context, com.google.android.gms.common.api.c cVar) {
        p6.m.g(context);
        p6.m.g(cVar);
        int i3 = 0;
        if (!cVar.b()) {
            return 0;
        }
        int d = cVar.d();
        int j12 = j1(d);
        if (j12 != -1) {
            return j12;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray.size()) {
                        i3 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i10);
                    if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i3 == -1) {
                i3 = ((m6.e) this.c).d(context, d);
            }
            sparseIntArray.put(d, i3);
        }
        return i3;
    }

    public void i0(k2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new q(this, dVar, 0));
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(q1 q1Var) {
        return 0;
    }

    public int j1(int i3) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i3, -1);
        }
        return i10;
    }

    @Override // r2.t
    public a3.s j2(r2.p pVar, r2.m mVar) {
        return new ua.b(2, ((r2.t) this.b).j2(pVar, mVar), (List) this.c);
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        j5.k1 = f10;
        ((TextView) this.b).setText("Saturation " + (f10 * 5.0f));
        qt0 qt0Var = ((j5) this.c).j1;
        qt0Var.M();
        qt0Var.L();
    }

    @Override // si.a
    public void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        vg.x0 x0Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(k6.a7));
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            x0Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
            canvas.drawRect(f10, f11, f12, f13, x0Var.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList l0() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        i9 i9Var = (i9) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) i9Var.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new t9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.vs
    public void m() {
        ((org.telegram.ui.Cells.h3) this.c).b(((xs) this.b).getText());
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(p5 p5Var) {
        return false;
    }

    @Override // mi.r3
    public void onContentChanged() {
        mi.p pVar = (mi.p) this.c;
        y3 y3Var = pVar.s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        mi.d dVar = pVar.Q;
        org.telegram.messenger.g0.r(dVar);
        org.telegram.messenger.g0.i3(dVar, 1000L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public void r(float f10) {
        Point point = org.telegram.messenger.g0.q;
        if (point.x > point.y) {
            ((uw) this.c).movePreviewFragment(f10);
        }
    }

    public ng0 r0(int i3, long j10, boolean z10) {
        if (i3 > 0) {
            i3 = ((SparseIntArray) this.c).get(i3, 0);
        }
        if (i3 == 0) {
            return null;
        }
        long j11 = i3;
        LongSparseArray U = ((w5) this.b).U(j10, 0L);
        ng0 ng0Var = (ng0) (U != null ? U.get(j11) : null);
        if (ng0Var != null || !z10) {
            return ng0Var;
        }
        ng0 ng0Var2 = new ng0();
        ((w5) this.b).Y(j10, 0L, j11, ng0Var2);
        return ng0Var2;
    }

    @Override // qe.d
    public void s1() {
        ((qe.i) this.b).b((qe.j) this.c);
    }

    @Override // qe.d
    public boolean t() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 20:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb2.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // g2.e
    public l9.y u(byte[] bArr) {
        return yd.c(((g2.e) this.b).u(bArr), new l5.b(this, 21));
    }

    @Override // mi.r3
    public void u0() {
        y3 y3Var = ((mi.p) this.c).s;
        if (y3Var != null) {
            int i3 = y3Var.b0;
            if (i3 == 2) {
                i3 = 0;
            }
            y3Var.c0 = i3;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    public boolean v0() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.c;
        return w5Var.J0 > 0.0f || w5Var.A0();
    }

    @Override // mi.r3
    public void v1() {
        y3 y3Var = ((mi.p) this.c).s;
        if (y3Var != null) {
            y3Var.e(false, true);
            int i3 = y3Var.c0;
            y3Var.g(i3 != 2 ? i3 : 0, true);
        }
    }

    public boolean w0(p4.t tVar, String str) {
        Context context = (Context) this.b;
        int i3 = tVar.b;
        return i3 < 0 ? context.getPackageManager().checkPermission(str, tVar.a) == 0 : context.checkPermission(str, i3, tVar.c) == 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // qe.d
    public boolean x(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public String z(long j10) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (((dy0) this.c).s || !TextUtils.isEmpty(trim)) {
            return trim;
        }
        return null;
    }

    public /* synthetic */ t(int i3, boolean z10) {
        this.a = i3;
    }

    public /* synthetic */ t(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ t(Object obj) {
        this.a = 20;
        this.c = obj;
        this.b = new ArrayList();
    }

    public t(m6.e eVar) {
        this.a = 21;
        this.b = new SparseIntArray();
        p6.m.g(eVar);
        this.c = eVar;
    }

    public t(long[] jArr) {
        this.a = 8;
        this.c = jArr;
        if (jArr.length < 30) {
            return;
        }
        this.b = new yv[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / Math.log(2.0d)) + 1.0d)) * 2.0d)];
        c0(1, 0, jArr.length);
    }

    public t(byte[] bArr) {
        this.a = 18;
        this.b = bArr;
    }

    public t(Handler handler, u uVar) {
        this.a = 0;
        if (uVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = uVar;
    }

    public t(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = 16;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    public t(int i3) {
        this.a = i3;
        switch (i3) {
            case 28:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            default:
                this.b = new w5(23);
                this.c = new SparseIntArray();
                break;
        }
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // qe.d
    public void G() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // qe.d
    public void o(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
