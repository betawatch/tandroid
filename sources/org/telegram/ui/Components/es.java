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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class es extends u4.f1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final tj0 C;
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

    public es(tj0 tj0Var) {
        this.m = false;
        this.C = tj0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, u4.d1 d1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cs csVar = (cs) arrayList.get(size);
            if (C(csVar, d1Var) && csVar.a == null && csVar.b == null) {
                arrayList.remove(csVar);
            }
        }
    }

    public final boolean C(cs csVar, u4.d1 d1Var) {
        if (csVar.b == d1Var) {
            csVar.b = null;
        } else {
            if (csVar.a != d1Var) {
                return false;
            }
            csVar.a = null;
        }
        View view = d1Var.a;
        View view2 = d1Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(d1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(u4.d1 d1Var) {
        d1Var.a.animate().setInterpolator(D);
        f(d1Var);
    }

    @Override // u4.m0
    public final boolean c(u4.d1 d1Var, List list) {
        return d1Var.a instanceof org.telegram.ui.Cells.z2;
    }

    @Override // u4.m0
    public final void f(u4.d1 d1Var) {
        View view = d1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ds) arrayList.get(size)).a == d1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(d1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, d1Var);
        if (this.o.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(d1Var);
        }
        if (this.p.remove(d1Var)) {
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).setClipProgress(0.0f);
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
                if (((ds) arrayList5.get(size4)).a == d1Var) {
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
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setClipProgress(1.0f);
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

    @Override // u4.m0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ds dsVar = (ds) arrayList.get(size);
            View view = dsVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(dsVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            u4.d1 d1Var = (u4.d1) arrayList2.get(size2);
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
            u4.d1 d1Var2 = (u4.d1) arrayList3.get(size3);
            View view3 = d1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(d1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            cs csVar = (cs) arrayList4.get(size4);
            u4.d1 d1Var3 = csVar.a;
            if (d1Var3 != null) {
                C(csVar, d1Var3);
            }
            u4.d1 d1Var4 = csVar.b;
            if (d1Var4 != null) {
                C(csVar, d1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    ds dsVar2 = (ds) arrayList6.get(size6);
                    View view4 = dsVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(dsVar2.a);
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
                    u4.d1 d1Var5 = (u4.d1) arrayList8.get(size8);
                    View view5 = d1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) view5).setClipProgress(0.0f);
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
                    cs csVar2 = (cs) arrayList10.get(size10);
                    u4.d1 d1Var6 = csVar2.a;
                    if (d1Var6 != null) {
                        C(csVar2, d1Var6);
                    }
                    u4.d1 d1Var7 = csVar2.b;
                    if (d1Var7 != null) {
                        C(csVar2, d1Var7);
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

    @Override // u4.m0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // u4.m0
    public final void m() {
        final int i3;
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
            u4.d1 d1Var = (u4.d1) obj;
            View view = d1Var.a;
            int i12 = 0;
            this.x.add(d1Var);
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
                    duration.addListener(new zr(this, d1Var, t2Var, i12));
                    duration.start();
                    arrayList = arrayList2;
                    i10 = size;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(t2Var, (Property<org.telegram.ui.Cells.t2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new zr(this, d1Var, t2Var, 1));
                    duration2.start();
                }
            } else {
                i10 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new as(this, d1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i10;
        }
        arrayList2.clear();
        if (isEmpty2) {
            i3 = 0;
        } else {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            i3 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.yr
                public final /* synthetic */ es b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i3;
                    long j10 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i14) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i15 = 0;
                            while (true) {
                                es esVar = this.b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    esVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    ds dsVar = (ds) obj2;
                                    u4.d1 d1Var2 = dsVar.a;
                                    int i16 = dsVar.b;
                                    int i17 = dsVar.c;
                                    int i18 = dsVar.d;
                                    int i19 = dsVar.e;
                                    View view2 = d1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        esVar.B = i17 - i19;
                                    } else {
                                        esVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = esVar.z;
                                    if (t2Var3 != null) {
                                        if (esVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i22 = esVar.A;
                                            esVar.B = measuredHeight3 - i22;
                                            esVar.z.setTopClip(i22);
                                            esVar.z.setBottomClip(esVar.B);
                                        } else if (esVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - esVar.B;
                                            esVar.A = measuredHeight4;
                                            esVar.z.setTopClip(measuredHeight4);
                                            esVar.z.setBottomClip(esVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    esVar.w.add(d1Var2);
                                    animate2.setDuration(180L).setListener(new bs(esVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i23 = 0;
                            while (true) {
                                es esVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList7.clear();
                                    esVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i23);
                                    i23++;
                                    cs csVar = (cs) obj3;
                                    ArrayList arrayList8 = esVar2.y;
                                    u4.d1 d1Var3 = csVar.a;
                                    u4.d1 d1Var4 = csVar.b;
                                    if (d1Var3 != null && d1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = d1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(d1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(csVar.a);
                                        arrayList8.add(csVar.b);
                                        animatorSet.addListener(new kg.g0(esVar2, csVar, d1Var3, animatorSet));
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
            new Runnable(this) { // from class: org.telegram.ui.Components.yr
                public final /* synthetic */ es b;

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
                                es esVar = this.b;
                                if (i15 >= size2) {
                                    arrayList72.clear();
                                    esVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i15);
                                    i15++;
                                    ds dsVar = (ds) obj2;
                                    u4.d1 d1Var2 = dsVar.a;
                                    int i16 = dsVar.b;
                                    int i17 = dsVar.c;
                                    int i18 = dsVar.d;
                                    int i19 = dsVar.e;
                                    View view2 = d1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        esVar.B = i17 - i19;
                                    } else {
                                        esVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.t2 t2Var3 = esVar.z;
                                    if (t2Var3 != null) {
                                        if (esVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = t2Var3.getMeasuredHeight();
                                            int i22 = esVar.A;
                                            esVar.B = measuredHeight3 - i22;
                                            esVar.z.setTopClip(i22);
                                            esVar.z.setBottomClip(esVar.B);
                                        } else if (esVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = t2Var3.getMeasuredHeight() - esVar.B;
                                            esVar.A = measuredHeight4;
                                            esVar.z.setTopClip(measuredHeight4);
                                            esVar.z.setBottomClip(esVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    esVar.w.add(d1Var2);
                                    animate2.setDuration(180L).setListener(new bs(esVar, d1Var2, i20, view2, i21, animate2, 0)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i23 = 0;
                            while (true) {
                                es esVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList72.clear();
                                    esVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i23);
                                    i23++;
                                    cs csVar = (cs) obj3;
                                    ArrayList arrayList8 = esVar2.y;
                                    u4.d1 d1Var3 = csVar.a;
                                    u4.d1 d1Var4 = csVar.b;
                                    if (d1Var3 != null && d1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = d1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(d1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(csVar.a);
                                        arrayList8.add(csVar.b);
                                        animatorSet.addListener(new kg.g0(esVar2, csVar, d1Var3, animatorSet));
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
        int i15 = i3;
        while (i15 < size2) {
            Object obj2 = arrayList8.get(i15);
            i15++;
            u4.d1 d1Var2 = (u4.d1) obj2;
            View view2 = d1Var2.a;
            this.v.add(d1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new as(this, d1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // u4.f1
    public final void p(u4.d1 d1Var) {
        E(d1Var);
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(d1Var);
        if (arrayList.size() > 2) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((u4.d1) arrayList.get(i3)).a.setAlpha(0.0f);
                if (((u4.d1) arrayList.get(i3)).a instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ((u4.d1) arrayList.get(i3)).a).setMoving(true);
                }
            }
        }
    }

    @Override // u4.f1
    public final boolean q(u4.d1 d1Var, u4.d1 d1Var2, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t2)) {
            return false;
        }
        E(d1Var);
        E(d1Var2);
        View view2 = d1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        cs csVar = new cs();
        csVar.a = d1Var;
        csVar.b = d1Var2;
        csVar.c = i3;
        csVar.d = i10;
        csVar.e = i11;
        csVar.f = i12;
        this.r.add(csVar);
        return true;
    }

    @Override // u4.f1
    public final boolean r(u4.d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12) {
        View view = d1Var.a;
        int translationX = i3 + ((int) view.getTranslationX());
        View view2 = d1Var.a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(d1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(d1Var);
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
        } else if (view2 instanceof kg.l) {
            ((kg.l) view2).a = true;
        }
        ds dsVar = new ds();
        dsVar.a = d1Var;
        dsVar.b = translationX;
        dsVar.c = translationY;
        dsVar.d = i11;
        dsVar.e = i12;
        this.q.add(dsVar);
        return true;
    }

    @Override // u4.f1
    public final void s(u4.d1 d1Var, d2.t0 t0Var) {
        E(d1Var);
        this.o.add(d1Var);
        org.telegram.ui.Cells.t2 t2Var = null;
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.C;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.t2)) {
                t2Var = (org.telegram.ui.Cells.t2) childAt;
            }
            i3++;
        }
        if (d1Var.a == t2Var) {
            this.z = t2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((u4.d1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
