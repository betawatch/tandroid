package f2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class n extends t1 {
    public static TimeInterpolator E;
    public Interpolator o;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final l lVar) {
        n nVar;
        final l lVar2;
        q1 q1Var = lVar.a;
        View view = q1Var == null ? null : q1Var.a;
        q1 q1Var2 = lVar.b;
        View view2 = q1Var2 != null ? q1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(lVar.a);
            startDelay.translationX(lVar.e - lVar.c);
            startDelay.translationY(lVar.f - lVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            final int i9 = 0;
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f2.f
                public final /* synthetic */ n b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i9) {
                        case 0:
                            q1 q1Var3 = lVar.a;
                            this.b.O();
                            break;
                        default:
                            q1 q1Var4 = lVar.b;
                            this.b.O();
                            break;
                    }
                }
            });
            nVar = this;
            lVar2 = lVar;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new k(nVar, lVar2, startDelay, view, 0)).start();
        } else {
            nVar = this;
            lVar2 = lVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(lVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(nVar.f).setStartDelay(i() - nVar.f).setInterpolator(nVar.k).alpha(1.0f);
            if (A(view2) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            final int i10 = 1;
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f2.f
                public final /* synthetic */ n b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            q1 q1Var3 = lVar2.a;
                            this.b.O();
                            break;
                        default:
                            q1 q1Var4 = lVar2.b;
                            this.b.O();
                            break;
                    }
                }
            });
            animate.setListener(new k(nVar, lVar2, animate, view2, 1)).start();
        }
    }

    public void C(q1 q1Var, m mVar) {
        int i9 = mVar.b;
        int i10 = mVar.c;
        int i11 = mVar.d;
        int i12 = mVar.e;
        View view = q1Var.a;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(q1Var);
        animate.setUpdateListener(new g(0, this, q1Var));
        Interpolator interpolator = this.o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new j(this, q1Var, i13, view, i14, animate, 0)).start();
    }

    public void D(q1 q1Var) {
        View view = q1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(q1Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new e(this, q1Var, 0));
        animate.setListener(new i(this, q1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((q1) arrayList.get(size)).a.animate().cancel();
        }
    }

    public final void G() {
        if (k()) {
            return;
        }
        e();
        N();
        this.w.clear();
        this.x.clear();
    }

    public final void H(ArrayList arrayList, q1 q1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (J(lVar, q1Var) && lVar.a == null && lVar.b == null) {
                arrayList.remove(lVar);
            }
        }
    }

    public final void I(l lVar) {
        q1 q1Var = lVar.a;
        if (q1Var != null) {
            J(lVar, q1Var);
        }
        q1 q1Var2 = lVar.b;
        if (q1Var2 != null) {
            J(lVar, q1Var2);
        }
    }

    public boolean J(l lVar, q1 q1Var) {
        if (lVar.b == q1Var) {
            lVar.b = null;
        } else {
            if (lVar.a != q1Var) {
                return false;
            }
            lVar.a = null;
        }
        View view = q1Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(q1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(q1 q1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        q1Var.a.animate().setInterpolator(E);
        f(q1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override // f2.w0
    public final boolean c(q1 q1Var, List list) {
        return !list.isEmpty() || t(q1Var);
    }

    @Override // f2.w0
    public void f(q1 q1Var) {
        View view = q1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((m) arrayList.get(size)).a == q1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(q1Var);
                arrayList.remove(size);
            }
        }
        H(this.s, q1Var);
        if (this.p.remove(q1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(q1Var);
        }
        if (this.q.remove(q1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(q1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, q1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((m) arrayList5.get(size4)).a == q1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(q1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(q1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(q1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.y.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.z.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override // f2.w0
    public void g() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m mVar = (m) arrayList.get(size);
            View view = mVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(mVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((q1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            q1 q1Var = (q1) arrayList3.get(size3);
            View view2 = q1Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(q1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((l) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.u;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    m mVar2 = (m) arrayList6.get(size6);
                    View view3 = mVar2.a.a;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    v(mVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.t;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    q1 q1Var2 = (q1) arrayList8.get(size8);
                    View view4 = q1Var2.a;
                    view4.setAlpha(1.0f);
                    if (A(view4) > 0.0f) {
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                    }
                    u(q1Var2);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.v;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    I((l) arrayList10.get(size10));
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            E(this.A);
            E(this.z);
            E(this.y);
            E(this.B);
            e();
        }
    }

    @Override // f2.w0
    public final boolean k() {
        return (this.q.isEmpty() && this.s.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.z.isEmpty() && this.A.isEmpty() && this.y.isEmpty() && this.B.isEmpty() && this.u.isEmpty() && this.t.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    @Override // f2.w0
    public void m() {
        ArrayList arrayList = this.p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            D((q1) obj);
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.u.add(arrayList5);
            arrayList2.clear();
            h hVar = new h(this, arrayList5, i9);
            if (!this.C || isEmpty) {
                hVar.run();
            } else {
                View view = ((m) arrayList5.get(0)).a.a;
                long L = L();
                WeakHashMap weakHashMap = r0.j0.a;
                view.postOnAnimationDelayed(hVar, L);
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.v.add(arrayList6);
            arrayList3.clear();
            h hVar2 = new h(this, arrayList6, 1);
            if (!this.C || isEmpty) {
                hVar2.run();
            } else {
                View view2 = ((l) arrayList6.get(0)).a.a;
                long j10 = this.d;
                WeakHashMap weakHashMap2 = r0.j0.a;
                view2.postOnAnimationDelayed(hVar2, j10);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.t.add(arrayList7);
        arrayList4.clear();
        h hVar3 = new h(this, arrayList7, 2);
        if (!this.C || (isEmpty && isEmpty2 && isEmpty3)) {
            hVar3.run();
            return;
        }
        long K = K(!isEmpty ? this.d : 0L, !isEmpty2 ? j() : 0L, isEmpty3 ? 0L : i());
        View view3 = ((q1) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = r0.j0.a;
        view3.postOnAnimationDelayed(hVar3, K);
    }

    @Override // f2.t1
    public void p(q1 q1Var) {
        R(q1Var);
        View view = q1Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(q1Var);
        F();
    }

    @Override // f2.t1
    public boolean q(q1 q1Var, q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12) {
        if (q1Var == q1Var2) {
            return r(q1Var, pVar, i9, i10, i11, i12);
        }
        View view = q1Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(q1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q1Var2.a;
        R(q1Var2);
        view2.setTranslationX(-((int) ((i11 - i9) - translationX)));
        view2.setTranslationY(-((int) ((i12 - i10) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new l(q1Var, q1Var2, i9, i10, i11, i12));
        F();
        return true;
    }

    @Override // f2.t1
    public boolean r(q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.a;
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) q1Var.a.getTranslationY());
        R(q1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(q1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.r.add(new m(q1Var, translationX, translationY, i11, i12));
        F();
        return true;
    }

    @Override // f2.t1
    public void s(q1 q1Var, d5.p pVar) {
        R(q1Var);
        this.p.add(q1Var);
        F();
    }

    public void F() {
    }

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public void P(q1 q1Var) {
    }

    public void z(q1 q1Var) {
    }
}
