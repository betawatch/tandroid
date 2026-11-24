// default package

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n58 extends i49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n58(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        a aVar;
        byte b = this.a;
        pi8 pi8Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gl.t1(((u58) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                gf8 gf8Var = (gf8) obj;
                af8 af8Var = gf8Var.l1;
                if (i == 0) {
                    int L = gl.L(13.0f);
                    int i2 = gf8Var.y1;
                    int i3 = gf8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && af8Var.canScrollVertically(1) && (y29Var = (y29) af8Var.K(0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > gl.L(7.0f)) {
                            af8Var.x0(0, view.getTop() - gl.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                if (i == 0) {
                    aVar = ((d) premiumPreviewFragment).actionBar;
                    int L2 = gl.L(16.0f) + aVar.getBottom();
                    float f = premiumPreviewFragment.g0;
                    o39 o39Var = premiumPreviewFragment.a;
                    if (f > 0.5f) {
                        o39Var.x0(0, premiumPreviewFragment.d0 - L2, null);
                        break;
                    } else {
                        View m = o39Var.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m != null && m.getTop() < 0) {
                            premiumPreviewFragment.a.x0(0, m.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                dh8 dh8Var = (dh8) obj;
                if (i == 1) {
                    dh8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i4 = 0; i4 < recyclerView.getChildCount(); i4++) {
                        pi8 pi8Var2 = (pi8) dh8Var.getChildAt(i4);
                        if (pi8Var == null || pi8Var2.a > pi8Var.a) {
                            pi8Var = pi8Var2;
                        }
                    }
                    if (pi8Var != null) {
                        dh8Var.z1(pi8Var, true);
                        dh8Var.l3 = false;
                        dh8Var.x0(0, pi8Var.getTop() - ((dh8Var.getMeasuredHeight() - pi8Var.getMeasuredHeight()) / 2), gl.H);
                    }
                    dh8Var.A1();
                    break;
                } else {
                    gl.r(dh8Var.m3);
                    break;
                }
                break;
            case 7:
                if (i == 0) {
                    ((ew8) obj).w = false;
                    break;
                }
                break;
            case 9:
                o39 o39Var2 = (o39) obj;
                boolean z = o39Var2.u2;
                if (i == 0) {
                    if (z) {
                        o39Var2.u2 = false;
                        kk7.e().k(99, 512);
                    }
                } else if (!z && o39Var2.w1) {
                    o39Var2.u2 = true;
                    kk7.e().k(98, 512);
                }
                if (i != 0 && o39Var2.M1 != null) {
                    yq4 yq4Var = o39Var2.d1;
                    if (yq4Var != null) {
                        gl.r(yq4Var);
                        o39Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        o39Var2.L1.X(obtain);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    o39Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = o39Var2.M1;
                    o39Var2.k1(view2, 0.0f, 0.0f, false);
                    o39Var2.M1 = null;
                    o39Var2.n1(view2, null);
                    o39Var2.O1 = false;
                }
                i49 i49Var = o39Var2.Z0;
                if (i49Var != null) {
                    i49Var.a(recyclerView, i);
                }
                boolean z2 = i == 1 || i == 2;
                o39Var2.J1 = z2;
                if (z2) {
                    o39Var2.K1 = true;
                    break;
                }
                break;
            case 13:
                if (i == 1) {
                    gl.t1(((qa9) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 14:
                hs9 hs9Var = (hs9) obj;
                if (i == 1) {
                    gl.t1(hs9Var.G.getCurrentFocus());
                }
                hs9Var.a();
                break;
            case 15:
                if (i == 0) {
                    yx9 yx9Var = (yx9) obj;
                    if (yx9Var.d2) {
                        yx9Var.d2 = false;
                        break;
                    }
                }
                break;
            case 18:
                if (i == 1) {
                    gl.t1(((zy9) obj).T1.getEditText());
                    break;
                }
                break;
            case 19:
                g0a g0aVar = (g0a) obj;
                if (i == 0) {
                    g0aVar.W = true;
                    g0aVar.invalidate();
                }
                if (i == 1) {
                    g0aVar.W = false;
                    kp kpVar = g0aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kpVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kpVar.c).cancel();
                        kpVar.c = null;
                    }
                    gl.t1(g0aVar);
                    break;
                }
                break;
            case 20:
                if (i == 0) {
                    d8a d8aVar = (d8a) obj;
                    if (d8aVar.F != null) {
                        xha xhaVar = d8aVar.d;
                        if (xhaVar == null || !xhaVar.x()) {
                            float f2 = d8aVar.Y;
                            if (f2 > 0.0f && f2 < 1.0f) {
                                q5c q5cVar = d8aVar.c;
                                if (f2 >= 0.5f) {
                                    q5cVar.x0(0, (int) (-(d8aVar.a0 - d8aVar.Z)), s33.h);
                                    break;
                                } else {
                                    q5cVar.x0(0, (int) Math.ceil(d8aVar.Z - d8aVar.b0), s33.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r10.x() != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    @Override // i49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ke5 ke5Var;
        cq3 cq3Var;
        v29 v29Var;
        float f;
        Object[] objArr;
        float y;
        int measuredHeight;
        pha phaVar;
        byte b = this.a;
        boolean z = false;
        boolean z2 = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                u58 u58Var = (u58) obj;
                if (u58Var.K == null) {
                    int K0 = u58Var.N.K0();
                    int abs = K0 == -1 ? 0 : Math.abs(u58Var.N.M0() - K0) + 1;
                    if (abs > 0 && K0 + abs > u58Var.N.A() - 2 && !u58Var.r && !u58Var.s) {
                        u58Var.h0(u58Var.w, u58Var.x, u58Var.a, true);
                        break;
                    }
                }
                break;
            case 1:
                ie8 ie8Var = (ie8) obj;
                if (i2 != 0 && (ke5Var = ie8Var.h) != null) {
                    ke5Var.a();
                }
                dbb dbbVar = ie8Var.R;
                if (dbbVar != null && dbbVar.s) {
                    bbb delegate = dbbVar.getDelegate();
                    if (delegate instanceof le8) {
                        rkb rkbVar = ie8Var.c;
                        View F = rkbVar.F((le8) delegate);
                        s49 T = F != null ? rkbVar.T(F) : null;
                        if (T != null) {
                            View view = T.a;
                            int direction = ie8Var.R.getDirection();
                            dbb dbbVar2 = ie8Var.R;
                            if (direction == 0) {
                                dbbVar2.setTranslationY((view.getY() - gl.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                dbbVar2.setTranslationY(view.getY());
                            }
                            t26 t26Var = ie8Var.d;
                            if (!t26Var.c.G(view) || !t26Var.d.G(view)) {
                                ie8Var.R.e();
                                break;
                            }
                        } else {
                            ie8Var.R.e();
                            break;
                        }
                    } else {
                        ie8Var.R.e();
                        break;
                    }
                }
                break;
            case 2:
                gf8 gf8Var = (gf8) obj;
                if (gf8Var.l1.getChildCount() > 0) {
                    gf8Var.G0();
                    break;
                }
                break;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (cq3Var = premiumPreviewFragment.x0) != null) {
                    cq3Var.f(i, i2);
                    premiumPreviewFragment.m0();
                    break;
                }
                break;
            case 4:
                dh8 dh8Var = (dh8) obj;
                if (recyclerView.getScrollState() == 1) {
                    dh8Var.z1(null, true);
                }
                dh8Var.invalidate();
                break;
            case 5:
                ((PrivacyControlActivity) obj).O0();
                break;
            case 6:
                gk8 gk8Var = (gk8) obj;
                if (!gk8Var.getMessagesController().z0) {
                    int abs2 = Math.abs(gk8Var.b.M0() - gk8Var.b.K0()) + 1;
                    int b2 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && gk8Var.b.M0() >= b2 - 10) {
                        gk8Var.getMessagesController().D0(false);
                        break;
                    }
                }
                break;
            case 7:
                ew8 ew8Var = (ew8) obj;
                if (!ew8Var.w) {
                    ew8Var.h.a(ew8Var.f(ew8Var.c()), true);
                    break;
                }
                break;
            case 8:
                t09 t09Var = (t09) obj;
                fu fuVar = t09Var.b;
                int[] iArr = t09Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i3, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    if (childAt instanceof r09) {
                        ((r09) childAt).h = min;
                    } else {
                        childAt.setScaleX(min);
                        childAt.setScaleY(min);
                    }
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i3) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    if (childAt2 instanceof r09) {
                        ((r09) childAt2).h = min2;
                    } else {
                        childAt2.setScaleX(min2);
                        childAt2.setScaleY(min2);
                    }
                }
                for (int i4 = 1; i4 < fuVar.getChildCount() - 1; i4++) {
                    View childAt3 = fuVar.getChildAt(i4);
                    if (childAt3 instanceof r09) {
                        ((r09) childAt3).h = 1.0f;
                    } else {
                        childAt3.setScaleX(1.0f);
                        childAt3.setScaleY(1.0f);
                    }
                }
                t09Var.invalidate();
                break;
            case 9:
                o39 o39Var = (o39) obj;
                Rect rect = o39Var.F1;
                i49 i49Var = o39Var.Z0;
                if (i49Var != null) {
                    i49Var.b(recyclerView, i, i2);
                }
                if (o39Var.D1 != -1) {
                    rect.offset(-i, -i2);
                    ff0 ff0Var = o39Var.C1;
                    if (ff0Var != null) {
                        ff0Var.setBounds(rect);
                    }
                    o39Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                o39Var.M0(false);
                if (i2 != 0 && (v29Var = o39Var.e1) != null) {
                    v29Var.c();
                }
                z29 z29Var = o39Var.T1;
                if (z29Var != null) {
                    o39Var.f1(z29Var, 700, false);
                    break;
                }
                break;
            case 10:
                a89 a89Var = (a89) obj;
                a89Var.e.invalidate();
                b89 b89Var = a89Var.w;
                int i5 = b89.v1;
                b89Var.b.invalidate();
                break;
            case 11:
                z99 z99Var = (z99) obj;
                for (int i6 = 0; i6 < z99Var.f.getChildCount(); i6++) {
                    if (z99Var.f.getChildAt(i6) instanceof pi4) {
                        z99Var.d.l(false);
                        break;
                    }
                }
                break;
            case 12:
                ((y99) obj).Y0();
                break;
            case 15:
                yx9 yx9Var = (yx9) obj;
                yx9Var.e1();
                if (yx9Var.n1.J1 && !yx9Var.d2) {
                    gl.t1(yx9Var.b);
                    break;
                }
                break;
            case 16:
                ny9 ny9Var = (ny9) obj;
                if (ny9Var.Z0()) {
                    ny9Var.T1.a();
                    break;
                }
                break;
            case 17:
                ((qy9) obj).Y0();
                break;
            case 19:
                g0a g0aVar = (g0a) obj;
                g0aVar.a();
                g0aVar.invalidate();
                break;
            case 20:
                d8a d8aVar = (d8a) obj;
                d8aVar.n0(false, true);
                d8aVar.o0();
                if (d8aVar.c.J1) {
                    gl.t1(d8aVar.fragmentView);
                    break;
                }
                break;
            case 21:
                ((kga) obj).E0();
                break;
            case 22:
                dha dhaVar = (dha) obj;
                if (recyclerView == dhaVar.H) {
                    dhaVar.S += i2;
                }
                if (dhaVar.Q == null && dhaVar.R == 0) {
                    dhaVar.C();
                    break;
                }
                break;
            case 23:
                ((zma) obj).S1.W();
                break;
            case 24:
                kna knaVar = (kna) obj;
                View view2 = knaVar.l2;
                FrameLayout frameLayout = knaVar.g2;
                o39 o39Var2 = knaVar.n1;
                for (int childCount = o39Var2.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt4 = o39Var2.getChildAt(childCount);
                    int R = RecyclerView.R(childAt4);
                    if (R >= 0) {
                        if (R == 2) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f = childAt4.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f;
                            if (objArr != false && height >= 0.0f) {
                                z2 = false;
                            }
                            if (knaVar.q2 != z2) {
                                knaVar.q2 = z2;
                                if (z2) {
                                    view2.setVisibility(0);
                                }
                                view2.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new k08((byte) 17, (Object) knaVar, z2)).start();
                            }
                            knaVar.E1 = f <= 0.0f ? 0 : gl.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f);
                            break;
                        } else if (R == 0) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f = y - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f;
                        if (objArr != false) {
                            z2 = false;
                        }
                        if (knaVar.q2 != z2) {
                        }
                        knaVar.E1 = f <= 0.0f ? 0 : gl.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f);
                    }
                }
                f = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f;
                if (objArr != false) {
                }
                if (knaVar.q2 != z2) {
                }
                knaVar.E1 = f <= 0.0f ? 0 : gl.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f);
            case 25:
                ((vqa) obj).T1.h();
                break;
            case 26:
                jva jvaVar = (jva) obj;
                fm0 fm0Var = jvaVar.Y;
                if (!jvaVar.c.canScrollVertically(-1)) {
                    phaVar = ((d) jvaVar).simpleActionBar;
                    break;
                }
                z = true;
                fm0Var.a(z, true);
                break;
            case 27:
                gva gvaVar = (gva) obj;
                q5c q5cVar = gvaVar.a;
                if (q5cVar.canScrollVertically(1)) {
                    for (int i7 = 0; i7 < q5cVar.getChildCount(); i7++) {
                        if (!(q5cVar.getChildAt(i7) instanceof pi4)) {
                        }
                    }
                    break;
                }
                gvaVar.h.run();
                break;
            case 28:
                uxa uxaVar = (uxa) obj;
                if (uxaVar.v0.size() != uxaVar.w0.size() && !uxaVar.A0 && uxaVar.U.M0() > uxaVar.X.d0 - 20) {
                    uxaVar.j0();
                    break;
                }
                break;
            case 29:
                ((u0b) obj).U0();
                break;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }
}
