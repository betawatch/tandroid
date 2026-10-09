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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class rt extends s4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final qm0 C;
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
    public org.telegram.ui.Cells.s2 z;

    public rt(qm0 qm0Var) {
        this.m = false;
        this.C = qm0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, s4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pt ptVar = (pt) arrayList.get(size);
            if (C(ptVar, d1Var) && ptVar.a == null && ptVar.b == null) {
                arrayList.remove(ptVar);
            }
        }
    }

    public final boolean C(pt ptVar, s4.d1 d1Var) {
        if (ptVar.b == d1Var) {
            ptVar.b = null;
        } else {
            if (ptVar.a != d1Var) {
                return false;
            }
            ptVar.a = null;
        }
        View view = d1Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(s4.d1 d1Var) {
        d1Var.a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override // s4.n0
    public final boolean c(s4.d1 d1Var, List list) {
        return d1Var.a instanceof org.telegram.ui.Cells.y2;
    }

    @Override // s4.n0
    public final void f(s4.d1 d1Var) {
        View view = d1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((qt) arrayList.get(size)).a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, d1Var);
        if (this.o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(d1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, d1Var);
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
                if (((qt) arrayList5.get(size4)).a == d1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(d1Var);
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
            if (arrayList7.remove(d1Var)) {
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(d1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(d1Var);
        this.v.remove(d1Var);
        this.y.remove(d1Var);
        this.w.remove(d1Var);
        A();
    }

    @Override // s4.n0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qt qtVar = (qt) arrayList.get(size);
            View view = qtVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(qtVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.d1 d1Var = (s4.d1) arrayList2.get(size2);
            View view2 = d1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(d1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s4.d1 d1Var2 = (s4.d1) arrayList3.get(size3);
            View view3 = d1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            pt ptVar = (pt) arrayList4.get(size4);
            s4.d1 d1Var3 = ptVar.a;
            if (d1Var3 != null) {
                C(ptVar, d1Var3);
            }
            s4.d1 d1Var4 = ptVar.b;
            if (d1Var4 != null) {
                C(ptVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    qt qtVar2 = (qt) arrayList6.get(size6);
                    View view4 = qtVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(qtVar2.a);
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
                    s4.d1 d1Var5 = (s4.d1) arrayList8.get(size8);
                    View view5 = d1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(d1Var5);
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
                    pt ptVar2 = (pt) arrayList10.get(size10);
                    s4.d1 d1Var6 = ptVar2.a;
                    if (d1Var6 != null) {
                        C(ptVar2, d1Var6);
                    }
                    s4.d1 d1Var7 = ptVar2.b;
                    if (d1Var7 != null) {
                        C(ptVar2, d1Var7);
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

    @Override // s4.n0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // s4.n0
    public final void m() {
        final int i10;
        int i11;
        ArrayList arrayList;
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
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            s4.d1 d1Var = (s4.d1) obj;
            View view = d1Var.a;
            int i13 = 0;
            this.x.add(d1Var);
            if (view instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                org.telegram.ui.Cells.s2 s2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == s2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = s2Var2.getMeasuredHeight();
                        int i14 = this.A;
                        this.B = measuredHeight - i14;
                        this.z.setTopClip(i14);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = s2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    s2Var.setElevation(-1.0f);
                    s2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(s2Var, u6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new mt(this, d1Var, s2Var, i13));
                    duration.start();
                    arrayList = arrayList2;
                    i11 = size;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(s2Var, (Property<org.telegram.ui.Cells.s2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new mt(this, d1Var, s2Var, 1));
                    duration2.start();
                }
            } else {
                i11 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new nt(this, d1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i11;
        }
        arrayList2.clear();
        if (isEmpty2) {
            i10 = 0;
        } else {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            i10 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.lt
                public final /* synthetic */ rt b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i10;
                    long j3 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i15) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i16 = 0;
                            while (true) {
                                rt rtVar = this.b;
                                if (i16 >= size2) {
                                    arrayList7.clear();
                                    rtVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i16);
                                    i16++;
                                    qt qtVar = (qt) obj2;
                                    s4.d1 d1Var2 = qtVar.a;
                                    int i17 = qtVar.b;
                                    int i18 = qtVar.c;
                                    int i19 = qtVar.d;
                                    int i20 = qtVar.e;
                                    View view2 = d1Var2.a;
                                    int i21 = i19 - i17;
                                    int i22 = i20 - i18;
                                    if (i21 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i22 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i18 > i20) {
                                        rtVar.B = i18 - i20;
                                    } else {
                                        rtVar.A = i22;
                                    }
                                    org.telegram.ui.Cells.s2 s2Var3 = rtVar.z;
                                    if (s2Var3 != null) {
                                        if (rtVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = s2Var3.getMeasuredHeight();
                                            int i23 = rtVar.A;
                                            rtVar.B = measuredHeight3 - i23;
                                            rtVar.z.setTopClip(i23);
                                            rtVar.z.setBottomClip(rtVar.B);
                                        } else if (rtVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = s2Var3.getMeasuredHeight() - rtVar.B;
                                            rtVar.A = measuredHeight4;
                                            rtVar.z.setTopClip(measuredHeight4);
                                            rtVar.z.setBottomClip(rtVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    rtVar.w.add(d1Var2);
                                    animate2.setDuration(180L).setListener(new ot(rtVar, d1Var2, i21, view2, i22, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i24 = 0;
                            while (true) {
                                rt rtVar2 = this.b;
                                if (i24 >= size3) {
                                    arrayList7.clear();
                                    rtVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i24);
                                    i24++;
                                    pt ptVar = (pt) obj3;
                                    ArrayList arrayList8 = rtVar2.y;
                                    s4.d1 d1Var3 = ptVar.a;
                                    s4.d1 d1Var4 = ptVar.b;
                                    if (d1Var3 != null && d1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j3);
                                        View view3 = d1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(d1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ptVar.a);
                                        arrayList8.add(ptVar.b);
                                        animatorSet.addListener(new gg.j0(rtVar2, ptVar, d1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j3 = 180;
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
            final int i15 = 1;
            new Runnable(this) { // from class: org.telegram.ui.Components.lt
                public final /* synthetic */ rt b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i152 = i15;
                    long j3 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i152) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i16 = 0;
                            while (true) {
                                rt rtVar = this.b;
                                if (i16 >= size2) {
                                    arrayList72.clear();
                                    rtVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i16);
                                    i16++;
                                    qt qtVar = (qt) obj2;
                                    s4.d1 d1Var2 = qtVar.a;
                                    int i17 = qtVar.b;
                                    int i18 = qtVar.c;
                                    int i19 = qtVar.d;
                                    int i20 = qtVar.e;
                                    View view2 = d1Var2.a;
                                    int i21 = i19 - i17;
                                    int i22 = i20 - i18;
                                    if (i21 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i22 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i18 > i20) {
                                        rtVar.B = i18 - i20;
                                    } else {
                                        rtVar.A = i22;
                                    }
                                    org.telegram.ui.Cells.s2 s2Var3 = rtVar.z;
                                    if (s2Var3 != null) {
                                        if (rtVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = s2Var3.getMeasuredHeight();
                                            int i23 = rtVar.A;
                                            rtVar.B = measuredHeight3 - i23;
                                            rtVar.z.setTopClip(i23);
                                            rtVar.z.setBottomClip(rtVar.B);
                                        } else if (rtVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = s2Var3.getMeasuredHeight() - rtVar.B;
                                            rtVar.A = measuredHeight4;
                                            rtVar.z.setTopClip(measuredHeight4);
                                            rtVar.z.setBottomClip(rtVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    rtVar.w.add(d1Var2);
                                    animate2.setDuration(180L).setListener(new ot(rtVar, d1Var2, i21, view2, i22, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i24 = 0;
                            while (true) {
                                rt rtVar2 = this.b;
                                if (i24 >= size3) {
                                    arrayList72.clear();
                                    rtVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i24);
                                    i24++;
                                    pt ptVar = (pt) obj3;
                                    ArrayList arrayList8 = rtVar2.y;
                                    s4.d1 d1Var3 = ptVar.a;
                                    s4.d1 d1Var4 = ptVar.b;
                                    if (d1Var3 != null && d1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j3);
                                        View view3 = d1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(d1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ptVar.a);
                                        arrayList8.add(ptVar.b);
                                        animatorSet.addListener(new gg.j0(rtVar2, ptVar, d1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j3 = 180;
                                }
                            }
                    }
                }
            }.run();
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList8 = new ArrayList(arrayList5);
        ArrayList arrayList9 = this.s;
        arrayList9.add(arrayList8);
        arrayList5.clear();
        int size2 = arrayList8.size();
        int i16 = i10;
        while (i16 < size2) {
            Object obj2 = arrayList8.get(i16);
            i16++;
            s4.d1 d1Var2 = (s4.d1) obj2;
            View view2 = d1Var2.a;
            this.v.add(d1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new nt(this, d1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // s4.g1
    public final void p(s4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.d1) arrayList.get(i10)).a.setAlpha(0.0f);
                if (((s4.d1) arrayList.get(i10)).a instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) ((s4.d1) arrayList.get(i10)).a).setMoving(true);
                }
            }
        }
    }

    @Override // s4.g1
    public final boolean q(s4.d1 d1Var, s4.d1 d1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return false;
        }
        E(d1Var);
        E(d1Var2);
        View view2 = d1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        pt ptVar = new pt();
        ptVar.a = d1Var;
        ptVar.b = d1Var2;
        ptVar.c = i10;
        ptVar.d = i11;
        ptVar.e = i12;
        ptVar.f = i13;
        this.r.add(ptVar);
        return true;
    }

    @Override // s4.g1
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        View view = d1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = d1Var.a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(d1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(d1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view2).setMoving(true);
        } else if (view2 instanceof gg.l) {
            ((gg.l) view2).a = true;
        }
        qt qtVar = new qt();
        qtVar.a = d1Var;
        qtVar.b = translationX;
        qtVar.c = translationY;
        qtVar.d = i12;
        qtVar.e = i13;
        this.q.add(qtVar);
        return true;
    }

    @Override // s4.g1
    public final void s(s4.d1 d1Var, b2.q0 q0Var) {
        E(d1Var);
        this.o.add(d1Var);
        org.telegram.ui.Cells.s2 s2Var = null;
        int i10 = 0;
        while (true) {
            qm0 qm0Var = this.C;
            if (i10 >= qm0Var.getChildCount()) {
                break;
            }
            View childAt = qm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.s2)) {
                s2Var = (org.telegram.ui.Cells.s2) childAt;
            }
            i10++;
        }
        if (d1Var.a == s2Var) {
            this.z = s2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.d1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
