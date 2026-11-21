package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class ts extends v4.h1 {
    public static final DecelerateInterpolator E = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final ek0 D;
    public final ArrayList o = new ArrayList();
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
    public org.telegram.ui.Cells.u2 z;

    public ts(ek0 ek0Var) {
        this.m = false;
        this.D = ek0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, v4.f1 f1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rs rsVar = (rs) arrayList.get(size);
            if (C(rsVar, f1Var) && rsVar.a == null && rsVar.b == null) {
                arrayList.remove(rsVar);
            }
        }
    }

    public final boolean C(rs rsVar, v4.f1 f1Var) {
        if (rsVar.b == f1Var) {
            rsVar.b = null;
        } else {
            if (rsVar.a != f1Var) {
                return false;
            }
            rsVar.a = null;
        }
        View view = f1Var.a;
        View view2 = f1Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(f1Var);
        return true;
    }

    public final void D() {
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.C = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
        this.A = false;
    }

    public final void E(v4.f1 f1Var) {
        f1Var.a.animate().setInterpolator(E);
        f(f1Var);
    }

    @Override // v4.n0
    public final boolean c(v4.f1 f1Var, List list) {
        return f1Var.a instanceof org.telegram.ui.Cells.a3;
    }

    @Override // v4.n0
    public final void f(v4.f1 f1Var) {
        View view = f1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ss) arrayList.get(size)).a == f1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, f1Var);
        if (this.o.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(f1Var);
        }
        if (this.p.remove(f1Var)) {
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(f1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, f1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((ss) arrayList5.get(size4)).a == f1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(f1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f1Var)) {
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(f1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(f1Var);
        this.v.remove(f1Var);
        this.y.remove(f1Var);
        this.w.remove(f1Var);
        A();
    }

    @Override // v4.n0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ss ssVar = (ss) arrayList.get(size);
            View view = ssVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ssVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.f1 f1Var = (v4.f1) arrayList2.get(size2);
            View view2 = f1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(f1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.f1 f1Var2 = (v4.f1) arrayList3.get(size3);
            View view3 = f1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(f1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            rs rsVar = (rs) arrayList4.get(size4);
            v4.f1 f1Var3 = rsVar.a;
            if (f1Var3 != null) {
                C(rsVar, f1Var3);
            }
            v4.f1 f1Var4 = rsVar.b;
            if (f1Var4 != null) {
                C(rsVar, f1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    ss ssVar2 = (ss) arrayList6.get(size6);
                    View view4 = ssVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(ssVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.s;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    v4.f1 f1Var5 = (v4.f1) arrayList8.get(size8);
                    View view5 = f1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.u2) {
                        ((org.telegram.ui.Cells.u2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(f1Var5);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.u;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    rs rsVar2 = (rs) arrayList10.get(size10);
                    v4.f1 f1Var6 = rsVar2.a;
                    if (f1Var6 != null) {
                        C(rsVar2, f1Var6);
                    }
                    v4.f1 f1Var7 = rsVar2.b;
                    if (f1Var7 != null) {
                        C(rsVar2, f1Var7);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            z(this.x);
            z(this.w);
            z(this.v);
            z(this.y);
            e();
        }
    }

    @Override // v4.n0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // v4.n0
    public final void m() {
        ArrayList arrayList;
        int i7;
        long j3;
        ArrayList arrayList2 = this.o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        long j10 = (!this.A || isEmpty) ? 0L : 180L;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            int i11 = 0;
            v4.f1 f1Var = (v4.f1) obj;
            View view = f1Var.a;
            this.x.add(f1Var);
            if (!(view instanceof org.telegram.ui.Cells.u2) || this.A) {
                arrayList = arrayList2;
                i7 = size;
                j3 = j10;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new ps(this, f1Var, animate, view)).start();
            } else {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                org.telegram.ui.Cells.u2 u2Var2 = this.z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = E;
                if (view == u2Var2) {
                    i7 = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = u2Var2.getMeasuredHeight();
                        int i12 = this.B;
                        this.C = measuredHeight - i12;
                        this.z.setTopClip(i12);
                        this.z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = u2Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.C);
                    }
                    u2Var.setElevation(-1.0f);
                    u2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(u2Var, r6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new os(this, f1Var, u2Var, i11));
                    duration.start();
                    j3 = j10;
                } else {
                    i7 = size;
                    j3 = j10;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(u2Var, (Property<org.telegram.ui.Cells.u2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new os(this, f1Var, u2Var, 1));
                    duration2.start();
                }
            }
            arrayList2 = arrayList;
            size = i7;
            j10 = j3;
        }
        long j11 = j10;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            final int i13 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.ns
                public final /* synthetic */ ts b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i13;
                    long j12 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i14) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i15 = 0;
                            while (true) {
                                ts tsVar = this.b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    tsVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    ss ssVar = (ss) obj2;
                                    v4.f1 f1Var2 = ssVar.a;
                                    int i16 = ssVar.b;
                                    int i17 = ssVar.c;
                                    int i18 = ssVar.d;
                                    int i19 = ssVar.e;
                                    View view2 = f1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        tsVar.C = i17 - i19;
                                    } else {
                                        tsVar.B = i21;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i22 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i22;
                                            tsVar.z.setTopClip(i22);
                                            tsVar.z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.z.setTopClip(measuredHeight4);
                                            tsVar.z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, f1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i23 = 0;
                            while (true) {
                                ts tsVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList7.clear();
                                    tsVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i23);
                                    i23++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.y;
                                    v4.f1 f1Var3 = rsVar.a;
                                    v4.f1 f1Var4 = rsVar.b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(f1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(rsVar.a);
                                        arrayList8.add(rsVar.b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.u.add(arrayList7);
            arrayList4.clear();
            final int i14 = 1;
            new Runnable(this) { // from class: org.telegram.ui.Components.ns
                public final /* synthetic */ ts b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i142 = i14;
                    long j12 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i142) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i15 = 0;
                            while (true) {
                                ts tsVar = this.b;
                                if (i15 >= size2) {
                                    arrayList72.clear();
                                    tsVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i15);
                                    i15++;
                                    ss ssVar = (ss) obj2;
                                    v4.f1 f1Var2 = ssVar.a;
                                    int i16 = ssVar.b;
                                    int i17 = ssVar.c;
                                    int i18 = ssVar.d;
                                    int i19 = ssVar.e;
                                    View view2 = f1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        tsVar.C = i17 - i19;
                                    } else {
                                        tsVar.B = i21;
                                    }
                                    org.telegram.ui.Cells.u2 u2Var3 = tsVar.z;
                                    if (u2Var3 != null) {
                                        if (tsVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = u2Var3.getMeasuredHeight();
                                            int i22 = tsVar.B;
                                            tsVar.C = measuredHeight3 - i22;
                                            tsVar.z.setTopClip(i22);
                                            tsVar.z.setBottomClip(tsVar.C);
                                        } else if (tsVar.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = u2Var3.getMeasuredHeight() - tsVar.C;
                                            tsVar.B = measuredHeight4;
                                            tsVar.z.setTopClip(measuredHeight4);
                                            tsVar.z.setBottomClip(tsVar.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    tsVar.w.add(f1Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new qs(tsVar, f1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i23 = 0;
                            while (true) {
                                ts tsVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList72.clear();
                                    tsVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i23);
                                    i23++;
                                    rs rsVar = (rs) obj3;
                                    ArrayList arrayList8 = tsVar2.y;
                                    v4.f1 f1Var3 = rsVar.a;
                                    v4.f1 f1Var4 = rsVar.b;
                                    if (f1Var3 != null && f1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j12);
                                        View view3 = f1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(f1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(rsVar.a);
                                        arrayList8.add(rsVar.b);
                                        animatorSet.addListener(new jg.j0(tsVar2, rsVar, f1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j12 = 180;
                                }
                            }
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            ArrayList arrayList8 = new ArrayList(arrayList5);
            ArrayList arrayList9 = this.s;
            arrayList9.add(arrayList8);
            arrayList5.clear();
            int size2 = arrayList8.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList8.get(i15);
                i15++;
                v4.f1 f1Var2 = (v4.f1) obj2;
                View view2 = f1Var2.a;
                this.v.add(f1Var2);
                ViewPropertyAnimator animate2 = view2.animate();
                animate2.alpha(1.0f).setDuration(180L).setStartDelay(j11).setListener(new ps(this, f1Var2, view2, animate2)).start();
            }
            arrayList8.clear();
            arrayList9.remove(arrayList8);
        }
        this.A = false;
    }

    @Override // v4.h1
    public final void p(v4.f1 f1Var) {
        E(f1Var);
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(f1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.f1) arrayList.get(i7)).a.setAlpha(0.0f);
                if (((v4.f1) arrayList.get(i7)).a instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) ((v4.f1) arrayList.get(i7)).a).setMoving(true);
                }
            }
        }
    }

    @Override // v4.h1
    public final boolean q(v4.f1 f1Var, v4.f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.u2)) {
            return false;
        }
        E(f1Var);
        E(f1Var2);
        View view2 = f1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        rs rsVar = new rs();
        rsVar.a = f1Var;
        rsVar.b = f1Var2;
        rsVar.c = i7;
        rsVar.d = i10;
        rsVar.e = i11;
        rsVar.f = i12;
        this.r.add(rsVar);
        return true;
    }

    @Override // v4.h1
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = f1Var.a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = f1Var.a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(f1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(f1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        if (view2 instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view2).setMoving(true);
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).a = true;
        }
        ss ssVar = new ss();
        ssVar.a = f1Var;
        ssVar.b = translationX;
        ssVar.c = translationY;
        ssVar.d = i11;
        ssVar.e = i12;
        this.q.add(ssVar);
        return true;
    }

    @Override // v4.h1
    public final void s(v4.f1 f1Var, e2.r0 r0Var) {
        E(f1Var);
        this.o.add(f1Var);
        if (this.A) {
            return;
        }
        org.telegram.ui.Cells.u2 u2Var = null;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.D;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.u2)) {
                u2Var = (org.telegram.ui.Cells.u2) childAt;
            }
            i7++;
        }
        if (f1Var.a == u2Var) {
            this.z = u2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.f1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
