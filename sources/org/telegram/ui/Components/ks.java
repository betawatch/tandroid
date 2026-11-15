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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class ks extends v4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final uj0 C;
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
    public org.telegram.ui.Cells.t2 z;

    public ks(uj0 uj0Var) {
        this.m = false;
        this.C = uj0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, v4.e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            is isVar = (is) arrayList.get(size);
            if (C(isVar, e1Var) && isVar.a == null && isVar.b == null) {
                arrayList.remove(isVar);
            }
        }
    }

    public final boolean C(is isVar, v4.e1 e1Var) {
        if (isVar.b == e1Var) {
            isVar.b = null;
        } else {
            if (isVar.a != e1Var) {
                return false;
            }
            isVar.a = null;
        }
        View view = e1Var.a;
        View view2 = e1Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(v4.e1 e1Var) {
        e1Var.a.animate().setInterpolator(D);
        f(e1Var);
    }

    @Override // v4.m0
    public final boolean c(v4.e1 e1Var, List list) {
        return e1Var.a instanceof org.telegram.ui.Cells.z2;
    }

    @Override // v4.m0
    public final void f(v4.e1 e1Var) {
        View view = e1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((js) arrayList.get(size)).a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, e1Var);
        if (this.o.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(e1Var);
        }
        if (this.p.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(e1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, e1Var);
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
                if (((js) arrayList5.get(size4)).a == e1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(e1Var);
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
            if (arrayList7.remove(e1Var)) {
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(e1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(e1Var);
        this.v.remove(e1Var);
        this.y.remove(e1Var);
        this.w.remove(e1Var);
        A();
    }

    @Override // v4.m0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            js jsVar = (js) arrayList.get(size);
            View view = jsVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jsVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            v4.e1 e1Var = (v4.e1) arrayList2.get(size2);
            View view2 = e1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(e1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            v4.e1 e1Var2 = (v4.e1) arrayList3.get(size3);
            View view3 = e1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(e1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            is isVar = (is) arrayList4.get(size4);
            v4.e1 e1Var3 = isVar.a;
            if (e1Var3 != null) {
                C(isVar, e1Var3);
            }
            v4.e1 e1Var4 = isVar.b;
            if (e1Var4 != null) {
                C(isVar, e1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    js jsVar2 = (js) arrayList6.get(size6);
                    View view4 = jsVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(jsVar2.a);
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
                    v4.e1 e1Var5 = (v4.e1) arrayList8.get(size8);
                    View view5 = e1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(e1Var5);
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
                    is isVar2 = (is) arrayList10.get(size10);
                    v4.e1 e1Var6 = isVar2.a;
                    if (e1Var6 != null) {
                        C(isVar2, e1Var6);
                    }
                    v4.e1 e1Var7 = isVar2.b;
                    if (e1Var7 != null) {
                        C(isVar2, e1Var7);
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

    @Override // v4.m0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // v4.m0
    public final void m() {
        final int i7;
        int i10;
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
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            v4.e1 e1Var = (v4.e1) obj;
            View view = e1Var.a;
            int i12 = 0;
            this.x.add(e1Var);
            if (view instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                org.telegram.ui.Cells.t2 t2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == t2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = t2Var2.getMeasuredHeight();
                        int i13 = this.A;
                        this.B = measuredHeight - i13;
                        this.z.setTopClip(i13);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = t2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    t2Var.setElevation(-1.0f);
                    t2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(t2Var, k6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new fs(this, e1Var, t2Var, i12));
                    duration.start();
                    arrayList = arrayList2;
                    i10 = size;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, (Property<org.telegram.ui.Cells.t2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new fs(this, e1Var, t2Var, 1));
                    duration2.start();
                }
            } else {
                i10 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new gs(this, e1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i10;
        }
        arrayList2.clear();
        if (isEmpty2) {
            i7 = 0;
        } else {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            i7 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.es
                public final /* synthetic */ ks b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i7;
                    long j3 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i14) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i15 = 0;
                            while (true) {
                                ks ksVar = this.b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    ksVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    js jsVar = (js) obj2;
                                    v4.e1 e1Var2 = jsVar.a;
                                    int i16 = jsVar.b;
                                    int i17 = jsVar.c;
                                    int i18 = jsVar.d;
                                    int i19 = jsVar.e;
                                    View view2 = e1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        ksVar.B = i17 - i19;
                                    } else {
                                        ksVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = ksVar.z;
                                    if (t2Var3 != null) {
                                        if (ksVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i22 = ksVar.A;
                                            ksVar.B = measuredHeight3 - i22;
                                            ksVar.z.setTopClip(i22);
                                            ksVar.z.setBottomClip(ksVar.B);
                                        } else if (ksVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - ksVar.B;
                                            ksVar.A = measuredHeight4;
                                            ksVar.z.setTopClip(measuredHeight4);
                                            ksVar.z.setBottomClip(ksVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ksVar.w.add(e1Var2);
                                    animate2.setDuration(180L).setListener(new hs(ksVar, e1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i23 = 0;
                            while (true) {
                                ks ksVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList7.clear();
                                    ksVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i23);
                                    i23++;
                                    is isVar = (is) obj3;
                                    ArrayList arrayList8 = ksVar2.y;
                                    v4.e1 e1Var3 = isVar.a;
                                    v4.e1 e1Var4 = isVar.b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j3);
                                        View view3 = e1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(e1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(isVar.a);
                                        arrayList8.add(isVar.b);
                                        animatorSet.addListener(new jg.j0(ksVar2, isVar, e1Var3, animatorSet));
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
            final int i14 = 1;
            new Runnable(this) { // from class: org.telegram.ui.Components.es
                public final /* synthetic */ ks b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i142 = i14;
                    long j3 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i142) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i15 = 0;
                            while (true) {
                                ks ksVar = this.b;
                                if (i15 >= size2) {
                                    arrayList72.clear();
                                    ksVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i15);
                                    i15++;
                                    js jsVar = (js) obj2;
                                    v4.e1 e1Var2 = jsVar.a;
                                    int i16 = jsVar.b;
                                    int i17 = jsVar.c;
                                    int i18 = jsVar.d;
                                    int i19 = jsVar.e;
                                    View view2 = e1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        ksVar.B = i17 - i19;
                                    } else {
                                        ksVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = ksVar.z;
                                    if (t2Var3 != null) {
                                        if (ksVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i22 = ksVar.A;
                                            ksVar.B = measuredHeight3 - i22;
                                            ksVar.z.setTopClip(i22);
                                            ksVar.z.setBottomClip(ksVar.B);
                                        } else if (ksVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - ksVar.B;
                                            ksVar.A = measuredHeight4;
                                            ksVar.z.setTopClip(measuredHeight4);
                                            ksVar.z.setBottomClip(ksVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ksVar.w.add(e1Var2);
                                    animate2.setDuration(180L).setListener(new hs(ksVar, e1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i23 = 0;
                            while (true) {
                                ks ksVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList72.clear();
                                    ksVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i23);
                                    i23++;
                                    is isVar = (is) obj3;
                                    ArrayList arrayList8 = ksVar2.y;
                                    v4.e1 e1Var3 = isVar.a;
                                    v4.e1 e1Var4 = isVar.b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j3);
                                        View view3 = e1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(e1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(isVar.a);
                                        arrayList8.add(isVar.b);
                                        animatorSet.addListener(new jg.j0(ksVar2, isVar, e1Var3, animatorSet));
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
        int i15 = i7;
        while (i15 < size2) {
            Object obj2 = arrayList8.get(i15);
            i15++;
            v4.e1 e1Var2 = (v4.e1) obj2;
            View view2 = e1Var2.a;
            this.v.add(e1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new gs(this, e1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // v4.g1
    public final void p(v4.e1 e1Var) {
        E(e1Var);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(e1Var);
        if (arrayList.size() > 2) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((v4.e1) arrayList.get(i7)).a.setAlpha(0.0f);
                if (((v4.e1) arrayList.get(i7)).a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((v4.e1) arrayList.get(i7)).a).setMoving(true);
                }
            }
        }
    }

    @Override // v4.g1
    public final boolean q(v4.e1 e1Var, v4.e1 e1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return false;
        }
        E(e1Var);
        E(e1Var2);
        View view2 = e1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        is isVar = new is();
        isVar.a = e1Var;
        isVar.b = e1Var2;
        isVar.c = i7;
        isVar.d = i10;
        isVar.e = i11;
        isVar.f = i12;
        this.r.add(isVar);
        return true;
    }

    @Override // v4.g1
    public final boolean r(v4.e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        View view = e1Var.a;
        int translationX = i7 + ((int) view.getTranslationX());
        View view2 = e1Var.a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(e1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(e1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        if (view2 instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view2).setMoving(true);
        } else if (view2 instanceof jg.l) {
            ((jg.l) view2).a = true;
        }
        js jsVar = new js();
        jsVar.a = e1Var;
        jsVar.b = translationX;
        jsVar.c = translationY;
        jsVar.d = i11;
        jsVar.e = i12;
        this.q.add(jsVar);
        return true;
    }

    @Override // v4.g1
    public final void s(v4.e1 e1Var, e2.r0 r0Var) {
        E(e1Var);
        this.o.add(e1Var);
        org.telegram.ui.Cells.t2 t2Var = null;
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.C;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                t2Var = (org.telegram.ui.Cells.t2) childAt;
            }
            i7++;
        }
        if (e1Var.a == t2Var) {
            this.z = t2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((v4.e1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
