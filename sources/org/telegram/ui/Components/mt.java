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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class mt extends s4.g1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final nm0 C;
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
    public org.telegram.ui.Cells.p2 z;

    public mt(nm0 nm0Var) {
        this.m = false;
        this.C = nm0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, s4.e1 e1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kt ktVar = (kt) arrayList.get(size);
            if (C(ktVar, e1Var) && ktVar.a == null && ktVar.b == null) {
                arrayList.remove(ktVar);
            }
        }
    }

    public final boolean C(kt ktVar, s4.e1 e1Var) {
        if (ktVar.b == e1Var) {
            ktVar.b = null;
        } else {
            if (ktVar.a != e1Var) {
                return false;
            }
            ktVar.a = null;
        }
        View view = e1Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(e1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(s4.e1 e1Var) {
        e1Var.a.animate().setInterpolator(D);
        f(e1Var);
    }

    @Override // s4.m0
    public final boolean c(s4.e1 e1Var, List list) {
        return e1Var.a instanceof org.telegram.ui.Cells.v2;
    }

    @Override // s4.m0
    public final void f(s4.e1 e1Var) {
        View view = e1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((lt) arrayList.get(size)).a == e1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(e1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, e1Var);
        if (this.o.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(e1Var);
        }
        if (this.p.remove(e1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
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
                if (((lt) arrayList5.get(size4)).a == e1Var) {
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
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setClipProgress(1.0f);
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

    @Override // s4.m0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lt ltVar = (lt) arrayList.get(size);
            View view = ltVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(ltVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            s4.e1 e1Var = (s4.e1) arrayList2.get(size2);
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
            s4.e1 e1Var2 = (s4.e1) arrayList3.get(size3);
            View view3 = e1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(e1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            kt ktVar = (kt) arrayList4.get(size4);
            s4.e1 e1Var3 = ktVar.a;
            if (e1Var3 != null) {
                C(ktVar, e1Var3);
            }
            s4.e1 e1Var4 = ktVar.b;
            if (e1Var4 != null) {
                C(ktVar, e1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    lt ltVar2 = (lt) arrayList6.get(size6);
                    View view4 = ltVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(ltVar2.a);
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
                    s4.e1 e1Var5 = (s4.e1) arrayList8.get(size8);
                    View view5 = e1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view5).setClipProgress(0.0f);
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
                    kt ktVar2 = (kt) arrayList10.get(size10);
                    s4.e1 e1Var6 = ktVar2.a;
                    if (e1Var6 != null) {
                        C(ktVar2, e1Var6);
                    }
                    s4.e1 e1Var7 = ktVar2.b;
                    if (e1Var7 != null) {
                        C(ktVar2, e1Var7);
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

    @Override // s4.m0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // s4.m0
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
            s4.e1 e1Var = (s4.e1) obj;
            View view = e1Var.a;
            int i13 = 0;
            this.x.add(e1Var);
            if (view instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                org.telegram.ui.Cells.p2 p2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == p2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = p2Var2.getMeasuredHeight();
                        int i14 = this.A;
                        this.B = measuredHeight - i14;
                        this.z.setTopClip(i14);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = p2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    p2Var.setElevation(-1.0f);
                    p2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(p2Var, v6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new gt(this, e1Var, p2Var, i13));
                    duration.start();
                    arrayList = arrayList2;
                    i11 = size;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(p2Var, (Property<org.telegram.ui.Cells.p2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new gt(this, e1Var, p2Var, 1));
                    duration2.start();
                }
            } else {
                i11 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new ht(this, e1Var, animate, view)).start();
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
            new Runnable(this) { // from class: org.telegram.ui.Components.ft
                public final /* synthetic */ mt b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i10;
                    long j10 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i15) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i16 = 0;
                            while (true) {
                                mt mtVar = this.b;
                                if (i16 >= size2) {
                                    arrayList7.clear();
                                    mtVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i16);
                                    i16++;
                                    lt ltVar = (lt) obj2;
                                    s4.e1 e1Var2 = ltVar.a;
                                    int i17 = ltVar.b;
                                    int i18 = ltVar.c;
                                    int i19 = ltVar.d;
                                    int i20 = ltVar.e;
                                    View view2 = e1Var2.a;
                                    int i21 = i19 - i17;
                                    int i22 = i20 - i18;
                                    if (i21 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i22 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i18 > i20) {
                                        mtVar.B = i18 - i20;
                                    } else {
                                        mtVar.A = i22;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = mtVar.z;
                                    if (p2Var3 != null) {
                                        if (mtVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i23 = mtVar.A;
                                            mtVar.B = measuredHeight3 - i23;
                                            mtVar.z.setTopClip(i23);
                                            mtVar.z.setBottomClip(mtVar.B);
                                        } else if (mtVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - mtVar.B;
                                            mtVar.A = measuredHeight4;
                                            mtVar.z.setTopClip(measuredHeight4);
                                            mtVar.z.setBottomClip(mtVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    mtVar.w.add(e1Var2);
                                    animate2.setDuration(180L).setListener(new jt(mtVar, e1Var2, i21, view2, i22, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i24 = 0;
                            while (true) {
                                mt mtVar2 = this.b;
                                if (i24 >= size3) {
                                    arrayList7.clear();
                                    mtVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i24);
                                    i24++;
                                    kt ktVar = (kt) obj3;
                                    ArrayList arrayList8 = mtVar2.y;
                                    s4.e1 e1Var3 = ktVar.a;
                                    s4.e1 e1Var4 = ktVar.b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = e1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(e1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ktVar.a);
                                        arrayList8.add(ktVar.b);
                                        animatorSet.addListener(new ig.k0(mtVar2, ktVar, e1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j10 = 180;
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
            new Runnable(this) { // from class: org.telegram.ui.Components.ft
                public final /* synthetic */ mt b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i152 = i15;
                    long j10 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i152) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i16 = 0;
                            while (true) {
                                mt mtVar = this.b;
                                if (i16 >= size2) {
                                    arrayList72.clear();
                                    mtVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i16);
                                    i16++;
                                    lt ltVar = (lt) obj2;
                                    s4.e1 e1Var2 = ltVar.a;
                                    int i17 = ltVar.b;
                                    int i18 = ltVar.c;
                                    int i19 = ltVar.d;
                                    int i20 = ltVar.e;
                                    View view2 = e1Var2.a;
                                    int i21 = i19 - i17;
                                    int i22 = i20 - i18;
                                    if (i21 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i22 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i18 > i20) {
                                        mtVar.B = i18 - i20;
                                    } else {
                                        mtVar.A = i22;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = mtVar.z;
                                    if (p2Var3 != null) {
                                        if (mtVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i23 = mtVar.A;
                                            mtVar.B = measuredHeight3 - i23;
                                            mtVar.z.setTopClip(i23);
                                            mtVar.z.setBottomClip(mtVar.B);
                                        } else if (mtVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - mtVar.B;
                                            mtVar.A = measuredHeight4;
                                            mtVar.z.setTopClip(measuredHeight4);
                                            mtVar.z.setBottomClip(mtVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    mtVar.w.add(e1Var2);
                                    animate2.setDuration(180L).setListener(new jt(mtVar, e1Var2, i21, view2, i22, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i24 = 0;
                            while (true) {
                                mt mtVar2 = this.b;
                                if (i24 >= size3) {
                                    arrayList72.clear();
                                    mtVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i24);
                                    i24++;
                                    kt ktVar = (kt) obj3;
                                    ArrayList arrayList8 = mtVar2.y;
                                    s4.e1 e1Var3 = ktVar.a;
                                    s4.e1 e1Var4 = ktVar.b;
                                    if (e1Var3 != null && e1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = e1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(e1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(ktVar.a);
                                        arrayList8.add(ktVar.b);
                                        animatorSet.addListener(new ig.k0(mtVar2, ktVar, e1Var3, animatorSet));
                                        animatorSet.start();
                                    }
                                    j10 = 180;
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
            s4.e1 e1Var2 = (s4.e1) obj2;
            View view2 = e1Var2.a;
            this.v.add(e1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new ht(this, e1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // s4.g1
    public final void p(s4.e1 e1Var) {
        E(e1Var);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(e1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((s4.e1) arrayList.get(i10)).a.setAlpha(0.0f);
                if (((s4.e1) arrayList.get(i10)).a instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) ((s4.e1) arrayList.get(i10)).a).setMoving(true);
                }
            }
        }
    }

    @Override // s4.g1
    public final boolean q(s4.e1 e1Var, s4.e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return false;
        }
        E(e1Var);
        E(e1Var2);
        View view2 = e1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        kt ktVar = new kt();
        ktVar.a = e1Var;
        ktVar.b = e1Var2;
        ktVar.c = i10;
        ktVar.d = i11;
        ktVar.e = i12;
        ktVar.f = i13;
        this.r.add(ktVar);
        return true;
    }

    @Override // s4.g1
    public final boolean r(s4.e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        View view = e1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = e1Var.a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view2).setMoving(true);
        } else if (view2 instanceof ig.m) {
            ((ig.m) view2).a = true;
        }
        lt ltVar = new lt();
        ltVar.a = e1Var;
        ltVar.b = translationX;
        ltVar.c = translationY;
        ltVar.d = i12;
        ltVar.e = i13;
        this.q.add(ltVar);
        return true;
    }

    @Override // s4.g1
    public final void s(s4.e1 e1Var, b2.v0 v0Var) {
        E(e1Var);
        this.o.add(e1Var);
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        while (true) {
            nm0 nm0Var = this.C;
            if (i10 >= nm0Var.getChildCount()) {
                break;
            }
            View childAt = nm0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.p2)) {
                p2Var = (org.telegram.ui.Cells.p2) childAt;
            }
            i10++;
        }
        if (e1Var.a == p2Var) {
            this.z = p2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s4.e1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
