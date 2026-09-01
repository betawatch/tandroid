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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class l extends p1 {
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
        boolean z4 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final j jVar) {
        l lVar;
        final j jVar2;
        m1 m1Var = jVar.a;
        View view = m1Var == null ? null : m1Var.a;
        m1 m1Var2 = jVar.b;
        View view2 = m1Var2 != null ? m1Var2.a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(jVar.a);
            startDelay.translationX(jVar.e - jVar.c);
            startDelay.translationY(jVar.f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            final int i10 = 0;
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f2.e
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            m1 m1Var3 = jVar.a;
                            this.b.O();
                            break;
                        default:
                            m1 m1Var4 = jVar.b;
                            this.b.O();
                            break;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            arrayList.add(jVar2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f).setStartDelay(i() - lVar.f).setInterpolator(lVar.k).alpha(1.0f);
            if (A(view2) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            final int i11 = 1;
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f2.e
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            m1 m1Var3 = jVar2.a;
                            this.b.O();
                            break;
                        default:
                            m1 m1Var4 = jVar2.b;
                            this.b.O();
                            break;
                    }
                }
            });
            animate.setListener(new i(lVar, jVar2, animate, view2, 1)).start();
        }
    }

    public void C(m1 m1Var, k kVar) {
        int i10 = kVar.b;
        int i11 = kVar.c;
        int i12 = kVar.d;
        int i13 = kVar.e;
        View view = m1Var.a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(m1Var);
        animate.setUpdateListener(new bg.a(2, this, m1Var));
        Interpolator interpolator = this.o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new h(this, m1Var, i14, view, i15, animate, 0)).start();
    }

    public void D(m1 m1Var) {
        View view = m1Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(m1Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new d(this, m1Var, 0));
        animate.setListener(new g(this, m1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((m1) arrayList.get(size)).a.animate().cancel();
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

    public final void H(ArrayList arrayList, m1 m1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, m1Var) && jVar.a == null && jVar.b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        m1 m1Var = jVar.a;
        if (m1Var != null) {
            J(jVar, m1Var);
        }
        m1 m1Var2 = jVar.b;
        if (m1Var2 != null) {
            J(jVar, m1Var2);
        }
    }

    public boolean J(j jVar, m1 m1Var) {
        if (jVar.b == m1Var) {
            jVar.b = null;
        } else {
            if (jVar.a != m1Var) {
                return false;
            }
            jVar.a = null;
        }
        View view = m1Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(m1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(m1 m1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        m1Var.a.animate().setInterpolator(E);
        f(m1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override // f2.u0
    public final boolean c(m1 m1Var, List list) {
        return !list.isEmpty() || t(m1Var);
    }

    @Override // f2.u0
    public void f(m1 m1Var) {
        View view = m1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((k) arrayList.get(size)).a == m1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(m1Var);
                arrayList.remove(size);
            }
        }
        H(this.s, m1Var);
        if (this.p.remove(m1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(m1Var);
        }
        if (this.q.remove(m1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(m1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, m1Var);
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
                if (((k) arrayList5.get(size4)).a == m1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(m1Var);
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
            if (arrayList7.remove(m1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(m1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(m1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.y.remove(m1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(m1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.z.remove(m1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override // f2.u0
    public void g() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((m1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            m1 m1Var = (m1) arrayList3.get(size3);
            View view2 = m1Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(m1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.u;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    k kVar2 = (k) arrayList6.get(size6);
                    View view3 = kVar2.a.a;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    v(kVar2.a);
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
                    m1 m1Var2 = (m1) arrayList8.get(size8);
                    View view4 = m1Var2.a;
                    view4.setAlpha(1.0f);
                    if (A(view4) > 0.0f) {
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                    }
                    u(m1Var2);
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
                    I((j) arrayList10.get(size10));
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

    @Override // f2.u0
    public final boolean k() {
        return (this.q.isEmpty() && this.s.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.z.isEmpty() && this.A.isEmpty() && this.y.isEmpty() && this.B.isEmpty() && this.u.isEmpty() && this.t.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    @Override // f2.u0
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            D((m1) obj);
        }
        arrayList.clear();
        if (!isEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.u.add(arrayList5);
            arrayList2.clear();
            f fVar = new f(this, arrayList5, i10);
            if (!this.C || isEmpty) {
                fVar.run();
            } else {
                View view = ((k) arrayList5.get(0)).a.a;
                long L = L();
                WeakHashMap weakHashMap = r0.j0.a;
                view.postOnAnimationDelayed(fVar, L);
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.v.add(arrayList6);
            arrayList3.clear();
            f fVar2 = new f(this, arrayList6, 1);
            if (!this.C || isEmpty) {
                fVar2.run();
            } else {
                View view2 = ((j) arrayList6.get(0)).a.a;
                long j10 = this.d;
                WeakHashMap weakHashMap2 = r0.j0.a;
                view2.postOnAnimationDelayed(fVar2, j10);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.t.add(arrayList7);
        arrayList4.clear();
        f fVar3 = new f(this, arrayList7, 2);
        if (!this.C || (isEmpty && isEmpty2 && isEmpty3)) {
            fVar3.run();
            return;
        }
        long K = K(!isEmpty ? this.d : 0L, !isEmpty2 ? j() : 0L, isEmpty3 ? 0L : i());
        View view3 = ((m1) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = r0.j0.a;
        view3.postOnAnimationDelayed(fVar3, K);
    }

    @Override // f2.p1
    public void p(m1 m1Var) {
        R(m1Var);
        View view = m1Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(m1Var);
        F();
    }

    @Override // f2.p1
    public boolean q(m1 m1Var, m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        if (m1Var == m1Var2) {
            return r(m1Var, eVar, i10, i11, i12, i13);
        }
        View view = m1Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(m1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = m1Var2.a;
        R(m1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new j(m1Var, m1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override // f2.p1
    public boolean r(m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = m1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) m1Var.a.getTranslationY());
        R(m1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(m1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new k(m1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override // f2.p1
    public void s(m1 m1Var, c5.e eVar) {
        R(m1Var);
        this.p.add(m1Var);
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

    public void P(m1 m1Var) {
    }

    public void z(m1 m1Var) {
    }
}
