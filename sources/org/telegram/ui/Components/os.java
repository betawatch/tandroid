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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class os extends f2.r1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final zk0 C;
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

    public os(zk0 zk0Var) {
        this.m = false;
        this.C = zk0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, f2.o1 o1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ms msVar = (ms) arrayList.get(size);
            if (C(msVar, o1Var) && msVar.a == null && msVar.b == null) {
                arrayList.remove(msVar);
            }
        }
    }

    public final boolean C(ms msVar, f2.o1 o1Var) {
        if (msVar.b == o1Var) {
            msVar.b = null;
        } else {
            if (msVar.a != o1Var) {
                return false;
            }
            msVar.a = null;
        }
        View view = o1Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(o1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(f2.o1 o1Var) {
        o1Var.a.animate().setInterpolator(D);
        f(o1Var);
    }

    @Override // f2.v0
    public final boolean c(f2.o1 o1Var, List list) {
        return o1Var.a instanceof org.telegram.ui.Cells.v2;
    }

    @Override // f2.v0
    public final void f(f2.o1 o1Var) {
        View view = o1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ns) arrayList.get(size)).a == o1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(o1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, o1Var);
        if (this.o.remove(o1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(o1Var);
        }
        if (this.p.remove(o1Var)) {
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(o1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, o1Var);
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
                if (((ns) arrayList5.get(size4)).a == o1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(o1Var);
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
            if (arrayList7.remove(o1Var)) {
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(o1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(o1Var);
        this.v.remove(o1Var);
        this.y.remove(o1Var);
        this.w.remove(o1Var);
        A();
    }

    @Override // f2.v0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ns nsVar = (ns) arrayList.get(size);
            View view = nsVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(nsVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.o1 o1Var = (f2.o1) arrayList2.get(size2);
            View view2 = o1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(o1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.o1 o1Var2 = (f2.o1) arrayList3.get(size3);
            View view3 = o1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(o1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ms msVar = (ms) arrayList4.get(size4);
            f2.o1 o1Var3 = msVar.a;
            if (o1Var3 != null) {
                C(msVar, o1Var3);
            }
            f2.o1 o1Var4 = msVar.b;
            if (o1Var4 != null) {
                C(msVar, o1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    ns nsVar2 = (ns) arrayList6.get(size6);
                    View view4 = nsVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(nsVar2.a);
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
                    f2.o1 o1Var5 = (f2.o1) arrayList8.get(size8);
                    View view5 = o1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(o1Var5);
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
                    ms msVar2 = (ms) arrayList10.get(size10);
                    f2.o1 o1Var6 = msVar2.a;
                    if (o1Var6 != null) {
                        C(msVar2, o1Var6);
                    }
                    f2.o1 o1Var7 = msVar2.b;
                    if (o1Var7 != null) {
                        C(msVar2, o1Var7);
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

    @Override // f2.v0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // f2.v0
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
            f2.o1 o1Var = (f2.o1) obj;
            View view = o1Var.a;
            this.x.add(o1Var);
            if (view instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                org.telegram.ui.Cells.p2 p2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == p2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = p2Var2.getMeasuredHeight();
                        int i12 = this.A;
                        this.B = measuredHeight - i12;
                        this.z.setTopClip(i12);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = p2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    p2Var.setElevation(-1.0f);
                    p2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(p2Var, m6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new js(this, o1Var, p2Var, 0));
                    duration.start();
                    arrayList = arrayList2;
                    i10 = size;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(p2Var, (Property<org.telegram.ui.Cells.p2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new js(this, o1Var, p2Var, 1));
                    duration2.start();
                }
            } else {
                i10 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new ks(this, o1Var, animate, view)).start();
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
            new Runnable(this) { // from class: org.telegram.ui.Components.is
                public final /* synthetic */ os b;

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
                                os osVar = this.b;
                                if (i15 >= size2) {
                                    arrayList7.clear();
                                    osVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i15);
                                    i15++;
                                    ns nsVar = (ns) obj2;
                                    f2.o1 o1Var2 = nsVar.a;
                                    int i16 = nsVar.b;
                                    int i17 = nsVar.c;
                                    int i18 = nsVar.d;
                                    int i19 = nsVar.e;
                                    View view2 = o1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        osVar.B = i17 - i19;
                                    } else {
                                        osVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = osVar.z;
                                    if (p2Var3 != null) {
                                        if (osVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i22 = osVar.A;
                                            osVar.B = measuredHeight3 - i22;
                                            osVar.z.setTopClip(i22);
                                            osVar.z.setBottomClip(osVar.B);
                                        } else if (osVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - osVar.B;
                                            osVar.A = measuredHeight4;
                                            osVar.z.setTopClip(measuredHeight4);
                                            osVar.z.setBottomClip(osVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    osVar.w.add(o1Var2);
                                    animate2.setDuration(180L).setListener(new f2.h(osVar, o1Var2, i20, view2, i21, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i23 = 0;
                            while (true) {
                                os osVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList7.clear();
                                    osVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i23);
                                    i23++;
                                    ms msVar = (ms) obj3;
                                    ArrayList arrayList8 = osVar2.y;
                                    f2.o1 o1Var3 = msVar.a;
                                    f2.o1 o1Var4 = msVar.b;
                                    if (o1Var3 != null && o1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = o1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(o1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(msVar.a);
                                        arrayList8.add(msVar.b);
                                        animatorSet.addListener(new ls(osVar2, msVar, o1Var3, animatorSet, 0));
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
            new Runnable(this) { // from class: org.telegram.ui.Components.is
                public final /* synthetic */ os b;

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
                                os osVar = this.b;
                                if (i15 >= size2) {
                                    arrayList72.clear();
                                    osVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i15);
                                    i15++;
                                    ns nsVar = (ns) obj2;
                                    f2.o1 o1Var2 = nsVar.a;
                                    int i16 = nsVar.b;
                                    int i17 = nsVar.c;
                                    int i18 = nsVar.d;
                                    int i19 = nsVar.e;
                                    View view2 = o1Var2.a;
                                    int i20 = i18 - i16;
                                    int i21 = i19 - i17;
                                    if (i20 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i21 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i17 > i19) {
                                        osVar.B = i17 - i19;
                                    } else {
                                        osVar.A = i21;
                                    }
                                    org.telegram.ui.Cells.p2 p2Var3 = osVar.z;
                                    if (p2Var3 != null) {
                                        if (osVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = p2Var3.getMeasuredHeight();
                                            int i22 = osVar.A;
                                            osVar.B = measuredHeight3 - i22;
                                            osVar.z.setTopClip(i22);
                                            osVar.z.setBottomClip(osVar.B);
                                        } else if (osVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = p2Var3.getMeasuredHeight() - osVar.B;
                                            osVar.A = measuredHeight4;
                                            osVar.z.setTopClip(measuredHeight4);
                                            osVar.z.setBottomClip(osVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    osVar.w.add(o1Var2);
                                    animate2.setDuration(180L).setListener(new f2.h(osVar, o1Var2, i20, view2, i21, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i23 = 0;
                            while (true) {
                                os osVar2 = this.b;
                                if (i23 >= size3) {
                                    arrayList72.clear();
                                    osVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i23);
                                    i23++;
                                    ms msVar = (ms) obj3;
                                    ArrayList arrayList8 = osVar2.y;
                                    f2.o1 o1Var3 = msVar.a;
                                    f2.o1 o1Var4 = msVar.b;
                                    if (o1Var3 != null && o1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = o1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(o1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(msVar.a);
                                        arrayList8.add(msVar.b);
                                        animatorSet.addListener(new ls(osVar2, msVar, o1Var3, animatorSet, 0));
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
            f2.o1 o1Var2 = (f2.o1) obj2;
            View view2 = o1Var2.a;
            this.v.add(o1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new ks(this, o1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // f2.r1
    public final void p(f2.o1 o1Var) {
        E(o1Var);
        View view = o1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(o1Var);
        if (arrayList.size() > 2) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((f2.o1) arrayList.get(i10)).a.setAlpha(0.0f);
                if (((f2.o1) arrayList.get(i10)).a instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) ((f2.o1) arrayList.get(i10)).a).setMoving(true);
                }
            }
        }
    }

    @Override // f2.r1
    public final boolean q(f2.o1 o1Var, f2.o1 o1Var2, d5.p pVar, int i10, int i11, int i12, int i13) {
        View view = o1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return false;
        }
        E(o1Var);
        E(o1Var2);
        View view2 = o1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        ms msVar = new ms();
        msVar.a = o1Var;
        msVar.b = o1Var2;
        msVar.c = i10;
        msVar.d = i11;
        msVar.e = i12;
        msVar.f = i13;
        this.r.add(msVar);
        return true;
    }

    @Override // f2.r1
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        View view = o1Var.a;
        int translationX = i10 + ((int) view.getTranslationX());
        View view2 = o1Var.a;
        int translationY = i11 + ((int) view2.getTranslationY());
        E(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(o1Var);
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
        } else if (view2 instanceof pf.j) {
            ((pf.j) view2).a = true;
        }
        ns nsVar = new ns();
        nsVar.a = o1Var;
        nsVar.b = translationX;
        nsVar.c = translationY;
        nsVar.d = i12;
        nsVar.e = i13;
        this.q.add(nsVar);
        return true;
    }

    @Override // f2.r1
    public final void s(f2.o1 o1Var, d5.p pVar) {
        E(o1Var);
        this.o.add(o1Var);
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.C;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.p2)) {
                p2Var = (org.telegram.ui.Cells.p2) childAt;
            }
            i10++;
        }
        if (o1Var.a == p2Var) {
            this.z = p2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.o1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
