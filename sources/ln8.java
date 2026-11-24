// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ln8 implements y60, vcc, rb9, we9, lc9, l74, ebc, yr9, zu9, ll5, OnCompleteListener, ms4, e9, c38, f69, OnSuccessListener {
    public final /* synthetic */ byte a;
    public Object b;

    public ln8(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new HashSet();
                break;
            default:
                this.b = new l69((byte) 26);
                break;
        }
    }

    @Override // lc9
    public final boolean A(mc9 mc9Var) {
        return false;
    }

    @Override // we9
    public final void B(xe9 xe9Var, View view) {
        hd9 hd9Var = (hd9) this.b;
        cs5 I = cs5.I(hd9Var, view);
        I.T = true;
        hd9Var.getParentActivity();
        hd9Var.getResourceProvider();
        hd9Var.y0 = lf9.b(I, hd9Var, xe9Var, false);
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        boolean[] zArr = (boolean[]) this.b;
        if (!z || (y = imageReceiver.y()) == null) {
            return;
        }
        byte b = 0;
        if (zArr[0]) {
            return;
        }
        y.I(0, false, false);
        gl.c3(new pk1(y, b));
        zArr[0] = true;
    }

    @Override // vcc
    public final int D() {
        return ((d49) this.b).F();
    }

    @Override // rb9
    public final void E1() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    se9Var.a.W3();
                    break;
                }
                break;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    re9Var.a.W3();
                    break;
                }
                break;
        }
    }

    public final void F(vk9 vk9Var) {
        eq2 eq2Var = (eq2) this.b;
        eq2Var.a = vk9Var;
        Iterator it = ((LinkedList) eq2Var.b).iterator();
        while (it.hasNext()) {
            ((d2d) it.next()).b();
        }
        ((LinkedList) eq2Var.b).clear();
    }

    @Override // we9
    public final void G() {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.y0(false, true);
        int i = hd9Var.J0;
        hd9Var.B0(i != 2 ? i : 0, true);
    }

    @Override // rb9
    public final eib G0() {
        switch (this.a) {
            case 6:
                return (ib9) this.b;
            default:
                return (vf9) this.b;
        }
    }

    @Override // lc9
    public final boolean H(mc9 mc9Var) {
        return false;
    }

    @Override // rb9
    public final lk0 I0() {
        switch (this.a) {
            case 6:
                return ((ib9) this.b).a;
            default:
                return ((vf9) this.b).a;
        }
    }

    @Override // we9
    public final cs5 J(View view) {
        return cs5.I((hd9) this.b, view);
    }

    public final void K(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // we9
    public final void L() {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.D0();
        jh3 jh3Var = hd9Var.z0;
        if (jh3Var == null) {
            return;
        }
        jh3Var.setLocked(hd9Var.i0());
    }

    @Override // vcc
    public final int M() {
        d49 d49Var = (d49) this.b;
        return d49Var.n - d49Var.B();
    }

    @Override // y60
    public final void N() {
        ((ProfileActivity) this.b).presentFragment(new v60());
        dismiss();
    }

    @Override // lc9
    public final void O(CharSequence charSequence) {
        ge9 ge9Var = ((ii9) this.b).F;
        if (ge9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        ge9Var.a.u4(charSequence.toString());
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // we9
    public final void P(ve9 ve9Var, View view) {
        hd9 hd9Var = (hd9) this.b;
        cs5 I = cs5.I(hd9Var, view);
        I.T = true;
        hd9Var.y0 = lf9.c(I, hd9Var, hd9Var.getParentActivity(), hd9Var.getResourceProvider(), ve9Var, false);
    }

    @Override // rb9
    public final boolean P0() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null && se9Var.a.V4()) {
                    break;
                }
                break;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null && re9Var.a.V4()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // l74
    public final wxb S(int i, int i2) {
        wxb S = ((l74) this.b).S(i, i2);
        return i2 != 1 ? S : new vn9(S);
    }

    @Override // lc9
    public final void U(Editable editable) {
        ii9 ii9Var = (ii9) this.b;
        lk0 lk0Var = ii9Var.a;
        if (lk0Var != null) {
            lk0Var.s = true;
            lk0Var.r = ii9Var.r.q2;
        }
        ii9Var.w();
        ge9 ge9Var = ii9Var.F;
        if (ge9Var == null || ii9Var.a == null) {
            return;
        }
        ge9Var.a();
    }

    @Override // rb9
    public final void U0(int i, int i2) {
        ld9 ld9Var;
        ld9 ld9Var2;
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null && (ld9Var = se9Var.a.R3) != null) {
                    ld9Var.f(i, i2);
                    break;
                }
                break;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null && (ld9Var2 = re9Var.a.R3) != null) {
                    ld9Var2.f(i, i2);
                    break;
                }
                break;
        }
    }

    @Override // yr9
    public final boolean U1(int i) {
        return i == ((qaa) this.b).r;
    }

    @Override // vcc
    public final View Z(int i) {
        return ((d49) this.b).q(i);
    }

    @Override // we9
    public final boolean a(float f) {
        hd9 hd9Var = (hd9) this.b;
        FrameLayout frameLayout = hd9Var.w0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f >= r3[1]) {
                z = true;
            }
        }
        hd9Var.y0(z, true);
        return z;
    }

    @Override // zu9
    public final int a0() {
        hja hjaVar = ((ija) this.b).r;
        if (hjaVar == null) {
            return 0;
        }
        return hjaVar.c != null ? (r0.length - 1) * hjaVar.d : hjaVar.a() - hjaVar.b();
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        o3d o3dVar = new o3d((TaskCompletionSource) obj2);
        l4d l4dVar = (l4d) ((r3d) obj).k();
        hh0 hh0Var = (hh0) this.b;
        Parcel e = l4dVar.e();
        int i = w3d.a;
        e.writeStrongBinder(o3dVar);
        w3d.c(e, hh0Var);
        l4dVar.f(e, 1);
    }

    @Override // we9
    public final void b(wi9 wi9Var, String str) {
        hd9 hd9Var = (hd9) this.b;
        eq2 eq2Var = hd9Var.A0;
        if (eq2Var == null) {
            eq2Var = new eq2(new k88((Object) this, (byte) 25), hd9Var.getResourceProvider());
            hd9Var.A0 = eq2Var;
        }
        eq2Var.z(wi9Var, str);
    }

    @Override // we9
    public final void c(int i) {
        ((hd9) this.b).p0(74, i);
    }

    @Override // lc9
    public final boolean c0(boolean z) {
        return false;
    }

    @Override // rb9, lc9
    public final void d(mc9 mc9Var) {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    ye9 ye9Var = se9Var.a;
                    ye9Var.i4(mc9Var);
                    ye9Var.p3.g(mc9Var, true);
                    break;
                }
                break;
            case 7:
            default:
                ge9 ge9Var = ((ii9) this.b).F;
                if (ge9Var != null) {
                    ye9 ye9Var2 = ge9Var.a;
                    ye9Var2.i4(mc9Var);
                    ye9Var2.p3.g(mc9Var, true);
                    break;
                }
                break;
            case 8:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    ye9 ye9Var3 = re9Var.a;
                    ye9Var3.i4(mc9Var);
                    ye9Var3.p3.g(mc9Var, true);
                    break;
                }
                break;
        }
    }

    @Override // vcc
    public final int d0(View view) {
        return d49.v(view) + ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).bottomMargin;
    }

    @Override // rb9
    public final void d1() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    ye9 ye9Var = se9Var.a;
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.g();
                    }
                    ye9Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    ye9 ye9Var2 = re9Var.a;
                    ld9 ld9Var2 = ye9Var2.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.g();
                    }
                    ye9Var2.p3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // y60
    public final void dismiss() {
        ((ProfileActivity) this.b).T0.U(null, null);
    }

    @Override // we9
    public final void e() {
        hd9 hd9Var = (hd9) this.b;
        me9 me9Var = hd9Var.Q.v3;
        hd9Var.B0((me9Var != null && me9Var.w() && hd9Var.Q.E4()) ? 1 : 0, true);
        hd9Var.C0();
        hd9Var.A0();
    }

    @Override // we9
    public final void f() {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.J0 = hd9Var.L0;
        hd9Var.y0(false, false);
        hd9Var.B0(2, true);
    }

    @Override // l74
    public final void g0(fv9 fv9Var) {
        ((l74) this.b).g0(fv9Var);
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        j8c j8cVar;
        ija ijaVar = (ija) this.b;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(ijaVar.s)) {
                sb.append(ijaVar.s);
            }
            hja hjaVar = ijaVar.r;
            if (hjaVar != null && (j8cVar = hjaVar.e) != null) {
                CharSequence charSequence = (CharSequence) j8cVar.g(0, Integer.valueOf(ijaVar.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) ijaVar.r.e.g(-1, Integer.valueOf(ijaVar.r.b()));
                CharSequence charSequence3 = (CharSequence) ijaVar.r.e.g(1, Integer.valueOf(ijaVar.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence2);
                    sb.append(" – ");
                    sb.append(charSequence3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            fa4.g(th, true);
            return ijaVar.s;
        }
    }

    @Override // lc9
    public final boolean i() {
        ii9 ii9Var = (ii9) this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var == null || ii9Var.a == null) {
            return false;
        }
        return ge9Var.a.V4();
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        int round;
        ija ijaVar = (ija) this.b;
        hja hjaVar = ijaVar.r;
        if (hjaVar == null || ijaVar.n == null) {
            return;
        }
        if (hjaVar.c != null) {
            double length = f * (r0.length - 1);
            int j = Utilities.j((int) Math.floor(length), ijaVar.r.c.length - 1, 0);
            int j2 = Utilities.j((int) Math.ceil(length), ijaVar.r.c.length - 1, 0);
            int[] iArr = ijaVar.r.c;
            round = Math.round(gl.U1(Math.round(((float) (length - Math.floor(length))) * ijaVar.r.d) / ijaVar.r.d, iArr[j], iArr[j2]));
        } else {
            round = Math.round(((ijaVar.r.a() - ijaVar.r.b()) * f) + hjaVar.b());
        }
        int i = ijaVar.h;
        if (i != Integer.MIN_VALUE) {
            round = Math.max(round, i);
        }
        int i2 = ijaVar.f;
        if (i2 != round) {
            if (ijaVar.c(i2) != ijaVar.c(round)) {
                gl.W3(ijaVar.e);
            }
            ijaVar.f = round;
            ijaVar.e(round, true);
            p8c p8cVar = ijaVar.n;
            if (p8cVar != null) {
                p8cVar.a(Integer.valueOf(ijaVar.f));
            }
        }
    }

    @Override // ebc
    public final boolean k() {
        return ((qu9) this.b).W.i != null;
    }

    @Override // lc9
    public final void l(int i, int i2) {
        ld9 ld9Var;
        ii9 ii9Var = (ii9) this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var == null || ii9Var.a == null || (ld9Var = ge9Var.a.R3) == null) {
            return;
        }
        ld9Var.f(i, i2);
    }

    @Override // rb9
    public final void m() {
        switch (this.a) {
            case 6:
                ib9 ib9Var = (ib9) this.b;
                se9 se9Var = ib9Var.P;
                if (se9Var != null) {
                    se9Var.a.T3(ib9Var.a);
                    break;
                }
                break;
            default:
                vf9 vf9Var = (vf9) this.b;
                re9 re9Var = vf9Var.O;
                if (re9Var != null) {
                    re9Var.a.T3(vf9Var.a);
                    break;
                }
                break;
        }
    }

    @Override // y60
    public final void n(int i, int i2) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        long a = profileActivity.a();
        profileActivity.getMessagesController().N4(i, a);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User V1 = profileActivity.getMessagesController().V1(Long.valueOf(a));
        TLRPC.UserFull userFull = profileActivity.w2;
        undoView.k(a, i2, V1, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
    }

    @Override // c38
    public final Object n0(ua9 ua9Var) {
        bp9 bp9Var = (bp9) this.b;
        bp9Var.a = ua9Var;
        return bp9Var;
    }

    @Override // ebc
    public final void o(boolean z, float[] fArr) {
        ((qu9) this.b).W.d(z, fArr);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        na1 na1Var = (na1) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            na1Var.resumeWith(new sa9(exception));
        } else if (task.isCanceled()) {
            na1Var.m(null);
        } else {
            na1Var.resumeWith(task.getResult());
        }
    }

    @Override // we9
    public final void onContentChanged() {
        hd9 hd9Var = (hd9) this.b;
        if (hd9Var.z0 != null) {
            boolean i3 = hd9Var.Q.i3();
            hd9Var.M0 = i3;
            hd9Var.z0.h(i3);
            hd9Var.z0.invalidate();
        }
        jh3 jh3Var = hd9Var.z0;
        if (jh3Var != null) {
            jh3Var.setLocked(hd9Var.i0());
        }
        Runnable runnable = hd9Var.N0;
        gl.r(runnable);
        gl.d3(runnable, 1000L);
    }

    @Override // ms4
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = ((qmb) this.b).c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // ms4
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        qmb qmbVar = (qmb) this.b;
        Scroller scroller = qmbVar.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        qmbVar.c.fling((int) qmbVar.Z1, 0, Math.round(-f), Math.round(f2), 0, (int) qmbVar.Y1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        qmbVar.z0.postInvalidate();
        return true;
    }

    @Override // ms4
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        qmb qmbVar = (qmb) this.b;
        Scroller scroller = qmbVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qmbVar.Z1 = Utilities.i(qmbVar.Z1 + f, qmbVar.Y1, 0.0f);
        qmbVar.W0();
        qmbVar.z0.invalidate();
        return true;
    }

    @Override // ms4
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ydd yddVar = (ydd) this.b;
        yddVar.h = (p6a) obj;
        k91 k91Var = yddVar.g;
        if (k91Var != null) {
            k91Var.a();
        }
    }

    public final void p(w59 w59Var) {
        for (int i = 0; i < w59Var.d; i++) {
            ((HashSet) this.b).add(new p5a(((Integer) w59Var.get(i)).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c4 A[Catch: dg2 | gm4 -> 0x0655, TryCatch #3 {dg2 | gm4 -> 0x0655, blocks: (B:287:0x05aa, B:288:0x05c0, B:290:0x05c4, B:291:0x05c7, B:293:0x05cb, B:295:0x05d5, B:297:0x05db, B:302:0x05e0), top: B:286:0x05aa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xl3 q(tg2 tg2Var) {
        vf4 vf4Var;
        vf4 vf4Var2;
        vf4 vf4Var3;
        float f;
        float f2;
        kj kjVar;
        float f3;
        float f4;
        float f5;
        byte b;
        wa9[] wa9VarArr;
        dg2 dg2Var;
        qj0 qj0Var;
        int i;
        c93 c93Var;
        int i2;
        ize izeVar;
        xl3 xl3Var;
        ArrayList arrayList;
        String str;
        int i3;
        boolean z;
        double d;
        double abs;
        int i4;
        int i5;
        int i6;
        l69 l69Var = (l69) this.b;
        qj0 qj0Var2 = (qj0) tg2Var.c;
        if (qj0Var2 == null) {
            qj0Var2 = ((mv6) tg2Var.b).H();
            tg2Var.c = qj0Var2;
        }
        lj9 lj9Var = new lj9((Object) qj0Var2, (byte) 28);
        int i7 = 0;
        xf4 xf4Var = new xf4(qj0Var2, (byte) 0);
        ArrayList arrayList2 = (ArrayList) xf4Var.c;
        int i8 = qj0Var2.b;
        int i9 = qj0Var2.a;
        int i10 = (i8 * 3) / 388;
        int i11 = 3;
        if (i10 < 3) {
            i10 = 3;
        }
        char c = 5;
        int[] iArr = new int[5];
        int i12 = i10 - 1;
        boolean z2 = false;
        while (true) {
            int i13 = 4;
            char c2 = c;
            int i14 = 1;
            if (i12 >= i8 || z2) {
                break;
            }
            Arrays.fill(iArr, i7);
            int i15 = i11;
            int i16 = i7;
            while (i16 < i9) {
                int i17 = i7 & 1;
                if (qj0Var2.b(i16, i12)) {
                    if (i17 == i14) {
                        i7++;
                    }
                    iArr[i7] = iArr[i7] + i14;
                    i4 = i13;
                } else if (i17 != 0) {
                    i4 = i13;
                    iArr[i7] = iArr[i7] + 1;
                } else if (i7 == i13) {
                    if (!xf4.s(iArr)) {
                        i4 = i13;
                        int i18 = i14;
                        iArr[0] = iArr[2];
                        iArr[i18] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = i18;
                        iArr[i4] = 0;
                    } else if (xf4Var.w(i12, i16, iArr)) {
                        if (xf4Var.a) {
                            z2 = xf4Var.x();
                            i4 = i13;
                            i5 = 2;
                        } else {
                            if (arrayList2.size() > i14) {
                                int size = arrayList2.size();
                                int i19 = 0;
                                vf4 vf4Var4 = null;
                                while (true) {
                                    if (i19 >= size) {
                                        i4 = i13;
                                        i5 = 2;
                                        i6 = 0;
                                        break;
                                    }
                                    Object obj = arrayList2.get(i19);
                                    i19++;
                                    i4 = i13;
                                    vf4 vf4Var5 = (vf4) obj;
                                    int i20 = size;
                                    if (vf4Var5.d >= 2) {
                                        if (vf4Var4 != null) {
                                            xf4Var.a = true;
                                            i5 = 2;
                                            i6 = ((int) (Math.abs(vf4Var4.a - vf4Var5.a) - Math.abs(vf4Var4.b - vf4Var5.b))) / 2;
                                            break;
                                        }
                                        vf4Var4 = vf4Var5;
                                    }
                                    i13 = i4;
                                    size = i20;
                                }
                            } else {
                                i4 = i13;
                                i6 = 0;
                                i5 = 2;
                            }
                            if (i6 > iArr[i5]) {
                                i12 += (i6 - r8) - 2;
                                i16 = i9 - 1;
                            }
                        }
                        i7 = 0;
                        Arrays.fill(iArr, 0);
                        i10 = i5;
                    } else {
                        i4 = i13;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = 1;
                        iArr[i4] = 0;
                    }
                    i7 = i15;
                } else {
                    i4 = i13;
                    i7++;
                    iArr[i7] = iArr[i7] + 1;
                }
                i16++;
                i13 = i4;
                i14 = 1;
            }
            if (xf4.s(iArr) && xf4Var.w(i12, i9, iArr)) {
                int i21 = iArr[0];
                if (xf4Var.a) {
                    z2 = xf4Var.x();
                }
                i10 = i21;
            }
            i12 += i10;
            c = c2;
            i11 = i15;
            i7 = 0;
        }
        if (arrayList2.size() < i11) {
            throw uj7.a();
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((vf4) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList2, xf4.e);
        vf4[] vf4VarArr = new vf4[3];
        int i22 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i23 = 2; i22 < arrayList2.size() - i23; i23 = 2) {
            vf4 vf4Var6 = (vf4) arrayList2.get(i22);
            float f6 = vf4Var6.c;
            i22++;
            int i24 = i22;
            while (i24 < arrayList2.size() - 1) {
                vf4 vf4Var7 = (vf4) arrayList2.get(i24);
                double K = xf4.K(vf4Var6, vf4Var7);
                i24++;
                for (int i25 = i24; i25 < arrayList2.size(); i25++) {
                    vf4 vf4Var8 = (vf4) arrayList2.get(i25);
                    if (vf4Var8.c <= 1.4f * f6) {
                        double K2 = xf4.K(vf4Var7, vf4Var8);
                        double K3 = xf4.K(vf4Var6, vf4Var8);
                        if (K < K2) {
                            if (K2 <= K3) {
                                K3 = K2;
                                K2 = K3;
                            } else if (K >= K3) {
                                d = K3;
                                K3 = K;
                                abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                if (abs >= d2) {
                                    vf4VarArr[0] = vf4Var6;
                                    vf4VarArr[1] = vf4Var7;
                                    vf4VarArr[2] = vf4Var8;
                                    d2 = abs;
                                }
                            }
                            d = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (K2 < K3) {
                                d = K2;
                                if (K < K3) {
                                    K2 = K3;
                                    K3 = K;
                                    abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                    if (abs >= d2) {
                                    }
                                }
                            } else {
                                d = K3;
                                K3 = K2;
                            }
                            K2 = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 == Double.MAX_VALUE) {
            throw uj7.a();
        }
        float a = wa9.a(vf4VarArr[0], vf4VarArr[1]);
        float a2 = wa9.a(vf4VarArr[1], vf4VarArr[2]);
        float a3 = wa9.a(vf4VarArr[0], vf4VarArr[2]);
        if (a2 >= a && a2 >= a3) {
            vf4Var = vf4VarArr[0];
            vf4Var2 = vf4VarArr[1];
            vf4Var3 = vf4VarArr[2];
        } else if (a3 < a2 || a3 < a) {
            vf4Var = vf4VarArr[2];
            vf4Var2 = vf4VarArr[0];
            vf4Var3 = vf4VarArr[1];
        } else {
            vf4Var = vf4VarArr[1];
            vf4Var2 = vf4VarArr[0];
            vf4Var3 = vf4VarArr[2];
        }
        float f7 = vf4Var.a;
        float f8 = vf4Var.b;
        if (ls6.B(vf4Var2.a, f7, vf4Var3.b - f8, (vf4Var2.b - f8) * (vf4Var3.a - f7)) < 0.0f) {
            vf4 vf4Var9 = vf4Var3;
            vf4Var3 = vf4Var2;
            vf4Var2 = vf4Var9;
        }
        vf4VarArr[0] = vf4Var2;
        vf4VarArr[1] = vf4Var;
        vf4VarArr[2] = vf4Var3;
        float v = lj9Var.v(vf4Var, vf4Var3);
        float f9 = vf4Var.a;
        float f10 = vf4Var3.b;
        float f11 = vf4Var3.a;
        float v2 = lj9Var.v(vf4Var, vf4Var2);
        float f12 = vf4Var2.b;
        float f13 = vf4Var2.a;
        float f14 = (v2 + v) / 2.0f;
        if (f14 < 1.0f) {
            throw uj7.a();
        }
        float a4 = wa9.a(vf4Var, vf4Var3) / f14;
        int i26 = (int) (a4 + (a4 < 0.0f ? -0.5f : 0.5f));
        float a5 = wa9.a(vf4Var, vf4Var2) / f14;
        int i27 = (((int) (a5 + (a5 >= 0.0f ? 0.5f : -0.5f))) + i26) / 2;
        int i28 = i27 + 7;
        int i29 = i28 & 3;
        if (i29 == 0) {
            i28 = i27 + 8;
        } else if (i29 == 2) {
            i28 = i27 + 6;
        } else if (i29 == 3) {
            i28 = i27 + 5;
        }
        int i30 = i28;
        int[] iArr2 = x9c.e;
        if (i30 % 4 != 1) {
            throw gm4.a();
        }
        try {
            x9c c3 = x9c.c((i30 - 17) / 4);
            int i31 = (c3.a << 2) + 10;
            if (c3.b.length > 0) {
                float f15 = (f11 - f9) + f13;
                f2 = f11;
                float f16 = (f10 - f8) + f12;
                float f17 = 1.0f - (3.0f / i31);
                int A = (int) tb4.A(f15, f9, f17, f9);
                int A2 = (int) tb4.A(f16, f8, f17, f8);
                f = f9;
                for (int i32 = 4; i32 <= 16; i32 <<= 1) {
                    try {
                        kjVar = lj9Var.w(f14, i32, A, A2);
                        break;
                    } catch (uj7 unused) {
                    }
                }
            } else {
                f = f9;
                f2 = f11;
            }
            kjVar = null;
            float f18 = i30 - 3.5f;
            if (kjVar != null) {
                f3 = kjVar.a;
                f4 = kjVar.b;
                f5 = f18 - 3.0f;
            } else {
                f3 = (f2 - f) + f13;
                f4 = (f10 - f8) + f12;
                f5 = f18;
            }
            float f19 = f4;
            float f20 = vf4Var.a;
            float f21 = vf4Var.b;
            float f22 = vf4Var3.a;
            float f23 = vf4Var3.b;
            float f24 = vf4Var2.a;
            float f25 = vf4Var2.b;
            m38 a6 = m38.a(3.5f, 3.5f, f18, 3.5f, f5, f5, 3.5f, f18);
            kj kjVar2 = kjVar;
            float f26 = a6.e;
            float f27 = a6.i;
            float f28 = f26 * f27;
            float f29 = a6.f;
            float f30 = a6.h;
            float f31 = f28 - (f29 * f30);
            float f32 = a6.g;
            float f33 = f29 * f32;
            float f34 = a6.d;
            float f35 = f33 - (f34 * f27);
            float f36 = (f34 * f30) - (f26 * f32);
            float f37 = a6.c;
            float f38 = f37 * f30;
            float f39 = a6.b;
            float f40 = f38 - (f39 * f27);
            float f41 = a6.a;
            float f42 = (f27 * f41) - (f37 * f32);
            float f43 = (f32 * f39) - (f30 * f41);
            float f44 = (f39 * f29) - (f37 * f26);
            float f45 = (f37 * f34) - (f29 * f41);
            float f46 = (f41 * f26) - (f39 * f34);
            m38 a7 = m38.a(f20, f21, f22, f23, f3, f19, f24, f25);
            float f47 = a7.a;
            float f48 = a7.d;
            float f49 = a7.g;
            float f50 = (f49 * f44) + (f48 * f40) + (f47 * f31);
            float f51 = (f49 * f45) + (f48 * f42) + (f47 * f35);
            float f52 = (f49 * f46) + (f48 * f43) + (f47 * f36);
            float f53 = a7.b;
            float f54 = a7.e;
            float f55 = a7.h;
            float f56 = (f55 * f44) + (f54 * f40) + (f53 * f31);
            float f57 = (f55 * f45) + (f54 * f42) + (f53 * f35);
            float f58 = (f55 * f46) + (f54 * f43) + (f53 * f36);
            float f59 = a7.c;
            float f60 = a7.f;
            float f61 = a7.i;
            float f62 = (f44 * f61) + (f40 * f60) + (f31 * f59);
            float f63 = (f45 * f61) + (f42 * f60) + (f35 * f59);
            float f64 = (f61 * f46) + (f60 * f43) + (f59 * f36);
            if (i30 <= 0 || i30 <= 0) {
                throw uj7.a();
            }
            qj0 qj0Var3 = new qj0(i30, i30);
            int i33 = i30 << 1;
            vf4 vf4Var10 = vf4Var;
            float[] fArr = new float[i33];
            int i34 = 0;
            while (i34 < i30) {
                int i35 = i30;
                float f65 = i34 + 0.5f;
                int i36 = 0;
                while (i36 < i33) {
                    int i37 = i36;
                    fArr[i37] = (i37 / 2) + 0.5f;
                    fArr[i37 + 1] = f65;
                    i36 = i37 + 2;
                }
                int i38 = i33 - 1;
                vf4 vf4Var11 = vf4Var2;
                int i39 = 0;
                while (i39 < i38) {
                    float f66 = fArr[i39];
                    int i40 = i39 + 1;
                    int i41 = i39;
                    float f67 = fArr[i40];
                    vf4 vf4Var12 = vf4Var3;
                    float i42 = ir2.i(f63, f67, f62 * f66, f64);
                    fArr[i41] = (((f51 * f67) + (f50 * f66)) + f52) / i42;
                    fArr[i40] = (((f67 * f57) + (f66 * f56)) + f58) / i42;
                    i39 = i41 + 2;
                    vf4Var3 = vf4Var12;
                }
                vf4 vf4Var13 = vf4Var3;
                int i43 = qj0Var2.b;
                float f68 = f63;
                int i44 = 0;
                boolean z3 = true;
                while (i44 < i38 && z3) {
                    int i45 = (int) fArr[i44];
                    int i46 = i44 + 1;
                    int i47 = i38;
                    int i48 = (int) fArr[i46];
                    int i49 = i44;
                    if (i45 < -1 || i45 > i9 || i48 < -1 || i48 > i43) {
                        throw uj7.a();
                    }
                    if (i45 == -1) {
                        fArr[i49] = 0.0f;
                    } else if (i45 == i9) {
                        fArr[i49] = i9 - 1;
                    } else {
                        z = false;
                        if (i48 != -1) {
                            fArr[i46] = 0.0f;
                        } else if (i48 == i43) {
                            fArr[i46] = i43 - 1;
                        } else {
                            z3 = z;
                            i44 = i49 + 2;
                            i38 = i47;
                        }
                        z3 = true;
                        i44 = i49 + 2;
                        i38 = i47;
                    }
                    z = true;
                    if (i48 != -1) {
                    }
                    z3 = true;
                    i44 = i49 + 2;
                    i38 = i47;
                }
                int i50 = i33 - 2;
                boolean z4 = true;
                while (i50 >= 0 && z4) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i50;
                    int i54 = (int) fArr[i52];
                    if (i51 < -1 || i51 > i9 || i54 < -1 || i54 > i43) {
                        throw uj7.a();
                    }
                    if (i51 == -1) {
                        fArr[i53] = 0.0f;
                    } else if (i51 == i9) {
                        fArr[i53] = i9 - 1;
                    } else {
                        z4 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i43) {
                            fArr[i52] = i43 - 1;
                        } else {
                            i50 = i53 - 2;
                        }
                        z4 = true;
                        i50 = i53 - 2;
                    }
                    z4 = true;
                    if (i54 != -1) {
                    }
                    z4 = true;
                    i50 = i53 - 2;
                }
                for (int i55 = 0; i55 < i33; i55 += 2) {
                    try {
                        if (qj0Var2.b((int) fArr[i55], (int) fArr[i55 + 1])) {
                            qj0Var3.c(i55 / 2, i34);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw uj7.a();
                    }
                }
                i34++;
                i30 = i35;
                vf4Var2 = vf4Var11;
                f63 = f68;
                vf4Var3 = vf4Var13;
            }
            vf4 vf4Var14 = vf4Var2;
            vf4 vf4Var15 = vf4Var3;
            if (kjVar2 == null) {
                b = 3;
                wa9VarArr = new wa9[]{vf4Var14, vf4Var10, vf4Var15};
            } else {
                b = 3;
                wa9VarArr = new wa9[]{vf4Var14, vf4Var10, vf4Var15, kjVar2};
            }
            wa9[] wa9VarArr2 = wa9VarArr;
            xf4 xf4Var2 = new xf4(qj0Var3, b);
            try {
                c93Var = l69Var.v(xf4Var2);
            } catch (dg2 e) {
                dg2Var = e;
                e = null;
                try {
                    xf4Var2.E();
                    xf4Var2.c = null;
                    xf4Var2.d = null;
                    xf4Var2.a = true;
                    xf4Var2.D();
                    xf4Var2.C();
                    qj0Var = (qj0) xf4Var2.b;
                    i = 0;
                    while (i < qj0Var.a) {
                        int i56 = i + 1;
                        for (int i57 = i56; i57 < qj0Var.b; i57++) {
                            if (qj0Var.b(i, i57) != qj0Var.b(i57, i)) {
                                qj0Var.a(i57, i);
                                qj0Var.a(i, i57);
                            }
                        }
                        i = i56;
                    }
                    c93 v3 = l69Var.v(xf4Var2);
                    v3.e = new ize((byte) 24);
                    c93Var = v3;
                    i2 = c93Var.f;
                    izeVar = c93Var.e;
                    if (izeVar != null) {
                    }
                    xl3Var = new xl3(c93Var.a, wa9VarArr2);
                    arrayList = c93Var.b;
                    if (arrayList != null) {
                    }
                    str = c93Var.c;
                    if (str != null) {
                    }
                    if (i2 >= 0) {
                        xl3Var.E(va9.d, Integer.valueOf(i3));
                        xl3Var.E(va9.e, Integer.valueOf(i2));
                    }
                    xl3Var.E(va9.c, c93Var.d);
                    xl3Var.E(va9.f, "]Q" + ((int) c93Var.h));
                    return xl3Var;
                } catch (dg2 | gm4 unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw dg2Var;
                }
            } catch (gm4 e2) {
                e = e2;
                dg2Var = null;
                xf4Var2.E();
                xf4Var2.c = null;
                xf4Var2.d = null;
                xf4Var2.a = true;
                xf4Var2.D();
                xf4Var2.C();
                qj0Var = (qj0) xf4Var2.b;
                i = 0;
                while (i < qj0Var.a) {
                }
                c93 v32 = l69Var.v(xf4Var2);
                v32.e = new ize((byte) 24);
                c93Var = v32;
                i2 = c93Var.f;
                izeVar = c93Var.e;
                if (izeVar != null) {
                }
                xl3Var = new xl3(c93Var.a, wa9VarArr2);
                arrayList = c93Var.b;
                if (arrayList != null) {
                }
                str = c93Var.c;
                if (str != null) {
                }
                if (i2 >= 0) {
                }
                xl3Var.E(va9.c, c93Var.d);
                xl3Var.E(va9.f, "]Q" + ((int) c93Var.h));
                return xl3Var;
            }
            i2 = c93Var.f;
            izeVar = c93Var.e;
            if (izeVar != null) {
                izeVar.getClass();
                if (wa9VarArr2.length >= 3) {
                    wa9 wa9Var = wa9VarArr2[0];
                    wa9VarArr2[0] = wa9VarArr2[2];
                    wa9VarArr2[2] = wa9Var;
                }
            }
            xl3Var = new xl3(c93Var.a, wa9VarArr2);
            arrayList = c93Var.b;
            if (arrayList != null) {
                xl3Var.E(va9.a, arrayList);
            }
            str = c93Var.c;
            if (str != null) {
                xl3Var.E(va9.b, str);
            }
            if (i2 >= 0 && (i3 = c93Var.g) >= 0) {
                xl3Var.E(va9.d, Integer.valueOf(i3));
                xl3Var.E(va9.e, Integer.valueOf(i2));
            }
            xl3Var.E(va9.c, c93Var.d);
            xl3Var.E(va9.f, "]Q" + ((int) c93Var.h));
            return xl3Var;
        } catch (IllegalArgumentException unused4) {
            throw gm4.a();
        }
    }

    @Override // rb9
    public final fib q0() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    return se9Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    return re9Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // yr9
    public final void r(int i) {
        qaa qaaVar = (qaa) this.b;
        taa taaVar = qaaVar.L;
        qaaVar.s = i;
        if (qaaVar.w != i) {
            qaaVar.d.clear();
        }
        int i2 = qaaVar.K;
        if (qaaVar.b() != 0 || qaaVar.e.e() || qaaVar.J) {
            taaVar.s2.b(i2);
        } else {
            taaVar.L1.e(false, true);
        }
        qaaVar.f();
        int i3 = taa.T2;
        taaVar.D0(true);
    }

    @Override // lc9
    public final void t(mc9 mc9Var, int i, int i2) {
        ge9 ge9Var;
        fib textSelectionHelper;
        ii9 ii9Var = (ii9) this.b;
        if (ii9Var.H || i == i2 || (ge9Var = ii9Var.F) == null || (textSelectionHelper = ge9Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.w() && textSelectionHelper.W == ii9Var) {
            return;
        }
        ii9Var.post(new zy0((Object) this, (Object) mc9Var, i2, (Object) textSelectionHelper, i, (byte) 5));
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // vcc
    public final int u(View view) {
        return d49.y(view) - ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).topMargin;
    }

    @Override // we9
    public final void w(lk0 lk0Var) {
        hd9 hd9Var = (hd9) this.b;
        if (lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockMap) && gl.H1(hd9Var)) {
            x02 x02Var = new x02(hd9Var.getParentActivity(), hd9Var, false, false, false, hd9Var.getResourceProvider());
            x02Var.W3 = new cff((byte) 24);
            x02Var.J1 = true;
            x02Var.u3.setVisibility(8);
            x02Var.t4 = new lt2((Object) hd9Var, (Object) lk0Var, (Object) x02Var, (byte) 27);
            x02Var.Z0();
            x02Var.show();
        }
    }

    @Override // rb9
    public final void y0(CharSequence charSequence) {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null && charSequence != null && charSequence.length() > 0) {
                    se9Var.a.u4(charSequence.toString());
                    break;
                }
                break;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null && charSequence != null && charSequence.length() > 0) {
                    re9Var.a.u4(charSequence.toString());
                    break;
                }
                break;
        }
    }

    @Override // l74
    public final void z() {
        ((l74) this.b).z();
    }

    @Override // lc9
    public final void I() {
    }

    @Override // ms4
    public final void h() {
    }

    @Override // we9
    public final void s() {
    }

    @Override // zu9
    public final void y() {
    }

    @Override // lc9
    public final void Y(mc9 mc9Var) {
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }

    @Override // ms4
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // we9
    public final void x(int i) {
    }

    public /* synthetic */ ln8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ ln8(q3d q3dVar, hh0 hh0Var) {
        this.a = (byte) 28;
        this.b = hh0Var;
    }

    public /* synthetic */ ln8(byte b, boolean z) {
        this.a = b;
    }

    public ln8(ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }

    @Override // we9
    public final void g(mc9 mc9Var, boolean z) {
    }
}
