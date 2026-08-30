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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class ys extends f2.o1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final sl0 C;
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
    public org.telegram.ui.Cells.r2 z;

    public ys(sl0 sl0Var) {
        this.m = false;
        this.C = sl0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, f2.l1 l1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ws wsVar = (ws) arrayList.get(size);
            if (C(wsVar, l1Var) && wsVar.a == null && wsVar.b == null) {
                arrayList.remove(wsVar);
            }
        }
    }

    public final boolean C(ws wsVar, f2.l1 l1Var) {
        if (wsVar.b == l1Var) {
            wsVar.b = null;
        } else {
            if (wsVar.a != l1Var) {
                return false;
            }
            wsVar.a = null;
        }
        View view = l1Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(l1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(f2.l1 l1Var) {
        l1Var.a.animate().setInterpolator(D);
        f(l1Var);
    }

    @Override // f2.t0
    public final boolean c(f2.l1 l1Var, List list) {
        return l1Var.a instanceof org.telegram.ui.Cells.x2;
    }

    @Override // f2.t0
    public final void f(f2.l1 l1Var) {
        View view = l1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((xs) arrayList.get(size)).a == l1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(l1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, l1Var);
        if (this.o.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(l1Var);
        }
        if (this.p.remove(l1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(l1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, l1Var);
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
                if (((xs) arrayList5.get(size4)).a == l1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(l1Var);
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
            if (arrayList7.remove(l1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(l1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(l1Var);
        this.v.remove(l1Var);
        this.y.remove(l1Var);
        this.w.remove(l1Var);
        A();
    }

    @Override // f2.t0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            xs xsVar = (xs) arrayList.get(size);
            View view = xsVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(xsVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.l1 l1Var = (f2.l1) arrayList2.get(size2);
            View view2 = l1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(l1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.l1 l1Var2 = (f2.l1) arrayList3.get(size3);
            View view3 = l1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(l1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ws wsVar = (ws) arrayList4.get(size4);
            f2.l1 l1Var3 = wsVar.a;
            if (l1Var3 != null) {
                C(wsVar, l1Var3);
            }
            f2.l1 l1Var4 = wsVar.b;
            if (l1Var4 != null) {
                C(wsVar, l1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    xs xsVar2 = (xs) arrayList6.get(size6);
                    View view4 = xsVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(xsVar2.a);
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
                    f2.l1 l1Var5 = (f2.l1) arrayList8.get(size8);
                    View view5 = l1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(l1Var5);
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
                    ws wsVar2 = (ws) arrayList10.get(size10);
                    f2.l1 l1Var6 = wsVar2.a;
                    if (l1Var6 != null) {
                        C(wsVar2, l1Var6);
                    }
                    f2.l1 l1Var7 = wsVar2.b;
                    if (l1Var7 != null) {
                        C(wsVar2, l1Var7);
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

    @Override // f2.t0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // f2.t0
    public final void m() {
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
            f2.l1 l1Var = (f2.l1) obj;
            View view = l1Var.a;
            this.x.add(l1Var);
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                org.telegram.ui.Cells.r2 r2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == r2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = r2Var2.getMeasuredHeight();
                        int i12 = this.A;
                        this.B = measuredHeight - i12;
                        this.z.setTopClip(i12);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    r2Var.setElevation(-1.0f);
                    r2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, n6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new ts(this, l1Var, r2Var, 0));
                    duration.start();
                    arrayList = arrayList2;
                    i10 = size;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, (Property<org.telegram.ui.Cells.r2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new ts(this, l1Var, r2Var, 1));
                    duration2.start();
                }
            } else {
                i10 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new us(this, l1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i10;
        }
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            final int i13 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.ss
                public final /* synthetic */ ys b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i13;
                    long j10 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i14) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i15 = 0;
                            while (true) {
                                ys ysVar = this.b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    ysVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    xs xsVar = (xs) obj2;
                                    f2.l1 l1Var2 = xsVar.a;
                                    int i16 = xsVar.b;
                                    int i17 = xsVar.c;
                                    int i18 = xsVar.d;
                                    int i19 = xsVar.e;
                                    View view2 = l1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        ysVar.B = i17 - i19;
                                    } else {
                                        ysVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.r2 r2Var3 = ysVar.z;
                                    if (r2Var3 != null) {
                                        if (ysVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = r2Var3.getMeasuredHeight();
                                            int i22 = ysVar.A;
                                            ysVar.B = measuredHeight3 - i22;
                                            ysVar.z.setTopClip(i22);
                                            ysVar.z.setBottomClip(ysVar.B);
                                        } else if (ysVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = r2Var3.getMeasuredHeight() - ysVar.B;
                                            ysVar.A = measuredHeight4;
                                            ysVar.z.setTopClip(measuredHeight4);
                                            ysVar.z.setBottomClip(ysVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ysVar.w.add(l1Var2);
                                    animate2.setDuration(180L).setListener(new f2.h(ysVar, l1Var2, i20, view2, i21, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i23 = 0;
                            while (true) {
                                ys ysVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList7.clear();
                                    ysVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i23);
                                    i23++;
                                    ws wsVar = (ws) obj3;
                                    ArrayList arrayList8 = ysVar2.y;
                                    f2.l1 l1Var3 = wsVar.a;
                                    f2.l1 l1Var4 = wsVar.b;
                                    if (l1Var3 != null && l1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = l1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(l1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(wsVar.a);
                                        arrayList8.add(wsVar.b);
                                        animatorSet.addListener(new vs(ysVar2, wsVar, l1Var3, animatorSet, 0));
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
            final int i14 = 1;
            new Runnable(this) { // from class: org.telegram.ui.Components.ss
                public final /* synthetic */ ys b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i142 = i14;
                    long j10 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i142) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i15 = 0;
                            while (true) {
                                ys ysVar = this.b;
                                if (i15 >= size2) {
                                    arrayList72.clear();
                                    ysVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i15);
                                    i15++;
                                    xs xsVar = (xs) obj2;
                                    f2.l1 l1Var2 = xsVar.a;
                                    int i16 = xsVar.b;
                                    int i17 = xsVar.c;
                                    int i18 = xsVar.d;
                                    int i19 = xsVar.e;
                                    View view2 = l1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        ysVar.B = i17 - i19;
                                    } else {
                                        ysVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.r2 r2Var3 = ysVar.z;
                                    if (r2Var3 != null) {
                                        if (ysVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = r2Var3.getMeasuredHeight();
                                            int i22 = ysVar.A;
                                            ysVar.B = measuredHeight3 - i22;
                                            ysVar.z.setTopClip(i22);
                                            ysVar.z.setBottomClip(ysVar.B);
                                        } else if (ysVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = r2Var3.getMeasuredHeight() - ysVar.B;
                                            ysVar.A = measuredHeight4;
                                            ysVar.z.setTopClip(measuredHeight4);
                                            ysVar.z.setBottomClip(ysVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ysVar.w.add(l1Var2);
                                    animate2.setDuration(180L).setListener(new f2.h(ysVar, l1Var2, i20, view2, i21, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i23 = 0;
                            while (true) {
                                ys ysVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList72.clear();
                                    ysVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i23);
                                    i23++;
                                    ws wsVar = (ws) obj3;
                                    ArrayList arrayList8 = ysVar2.y;
                                    f2.l1 l1Var3 = wsVar.a;
                                    f2.l1 l1Var4 = wsVar.b;
                                    if (l1Var3 != null && l1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = l1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(l1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(wsVar.a);
                                        arrayList8.add(wsVar.b);
                                        animatorSet.addListener(new vs(ysVar2, wsVar, l1Var3, animatorSet, 0));
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
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList8.get(i15);
            i15++;
            f2.l1 l1Var2 = (f2.l1) obj2;
            View view2 = l1Var2.a;
            this.v.add(l1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new us(this, l1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // f2.o1
    public final void p(f2.l1 l1Var) {
        E(l1Var);
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(l1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.l1) arrayList.get(i10)).a.setAlpha(0.0f);
                if (((f2.l1) arrayList.get(i10)).a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((f2.l1) arrayList.get(i10)).a).setMoving(true);
                }
            }
        }
    }

    @Override // f2.o1
    public final boolean q(f2.l1 l1Var, f2.l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return false;
        }
        E(l1Var);
        E(l1Var2);
        View view2 = l1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        ws wsVar = new ws();
        wsVar.a = l1Var;
        wsVar.b = l1Var2;
        wsVar.c = i10;
        wsVar.d = i11;
        wsVar.e = i12;
        wsVar.f = i13;
        this.r.add(wsVar);
        return true;
    }

    @Override // f2.o1
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = l1Var.a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        if (view2 instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view2).setMoving(true);
        } else if (view2 instanceof tf.j) {
            ((tf.j) view2).a = true;
        }
        xs xsVar = new xs();
        xsVar.a = l1Var;
        xsVar.b = translationX;
        xsVar.c = translationY;
        xsVar.d = i12;
        xsVar.e = i13;
        this.q.add(xsVar);
        return true;
    }

    @Override // f2.o1
    public final void s(f2.l1 l1Var, c5.e eVar) {
        E(l1Var);
        this.o.add(l1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.C;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i10++;
        }
        if (l1Var.a == r2Var) {
            this.z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.l1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
