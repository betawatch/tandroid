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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ps extends f2.t1 {
    public static final DecelerateInterpolator D = new DecelerateInterpolator();
    public int A;
    public int B;
    public final wk0 C;
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

    public ps(wk0 wk0Var) {
        this.m = false;
        this.C = wk0Var;
    }

    public final void A() {
        if (k()) {
            return;
        }
        e();
    }

    public final void B(ArrayList arrayList, f2.q1 q1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ns nsVar = (ns) arrayList.get(size);
            if (C(nsVar, q1Var) && nsVar.a == null && nsVar.b == null) {
                arrayList.remove(nsVar);
            }
        }
    }

    public final boolean C(ns nsVar, f2.q1 q1Var) {
        if (nsVar.b == q1Var) {
            nsVar.b = null;
        } else {
            if (nsVar.a != q1Var) {
                return false;
            }
            nsVar.a = null;
        }
        View view = q1Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(q1Var);
        return true;
    }

    public final void D() {
        this.A = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.z = null;
    }

    public final void E(f2.q1 q1Var) {
        q1Var.a.animate().setInterpolator(D);
        f(q1Var);
    }

    @Override // f2.w0
    public final boolean c(f2.q1 q1Var, List list) {
        return q1Var.a instanceof org.telegram.ui.Cells.x2;
    }

    @Override // f2.w0
    public final void f(f2.q1 q1Var) {
        View view = q1Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((os) arrayList.get(size)).a == q1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(q1Var);
                arrayList.remove(size);
            }
        }
        B(this.r, q1Var);
        if (this.o.remove(q1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(q1Var);
        }
        if (this.p.remove(q1Var)) {
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(q1Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, q1Var);
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
                if (((os) arrayList5.get(size4)).a == q1Var) {
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
        ArrayList arrayList6 = this.s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(q1Var)) {
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(q1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(q1Var);
        this.v.remove(q1Var);
        this.y.remove(q1Var);
        this.w.remove(q1Var);
        A();
    }

    @Override // f2.w0
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            os osVar = (os) arrayList.get(size);
            View view = osVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(osVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f2.q1 q1Var = (f2.q1) arrayList2.get(size2);
            View view2 = q1Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(q1Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f2.q1 q1Var2 = (f2.q1) arrayList3.get(size3);
            View view3 = q1Var2.a;
            if (view3 instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(q1Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ns nsVar = (ns) arrayList4.get(size4);
            f2.q1 q1Var3 = nsVar.a;
            if (q1Var3 != null) {
                C(nsVar, q1Var3);
            }
            f2.q1 q1Var4 = nsVar.b;
            if (q1Var4 != null) {
                C(nsVar, q1Var4);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.t;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    os osVar2 = (os) arrayList6.get(size6);
                    View view4 = osVar2.a.a;
                    view4.setTranslationY(0.0f);
                    view4.setTranslationX(0.0f);
                    v(osVar2.a);
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
                    f2.q1 q1Var5 = (f2.q1) arrayList8.get(size8);
                    View view5 = q1Var5.a;
                    if (view5 instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) view5).setClipProgress(0.0f);
                    } else {
                        view5.setAlpha(1.0f);
                    }
                    u(q1Var5);
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
                    ns nsVar2 = (ns) arrayList10.get(size10);
                    f2.q1 q1Var6 = nsVar2.a;
                    if (q1Var6 != null) {
                        C(nsVar2, q1Var6);
                    }
                    f2.q1 q1Var7 = nsVar2.b;
                    if (q1Var7 != null) {
                        C(nsVar2, q1Var7);
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

    @Override // f2.w0
    public final boolean k() {
        if (!this.p.isEmpty()) {
            return true;
        }
        ArrayList arrayList = this.r;
        return (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // f2.w0
    public final void m() {
        int i9;
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            f2.q1 q1Var = (f2.q1) obj;
            View view = q1Var.a;
            this.x.add(q1Var);
            if (view instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                org.telegram.ui.Cells.r2 r2Var2 = this.z;
                DecelerateInterpolator decelerateInterpolator = D;
                if (view == r2Var2) {
                    if (this.A != Integer.MAX_VALUE) {
                        int measuredHeight = r2Var2.getMeasuredHeight();
                        int i11 = this.A;
                        this.B = measuredHeight - i11;
                        this.z.setTopClip(i11);
                        this.z.setBottomClip(this.B);
                    } else if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight2 = r2Var2.getMeasuredHeight() - this.B;
                        this.A = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.B);
                    }
                    r2Var.setElevation(-1.0f);
                    r2Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(r2Var, m6.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new ls(this, q1Var, r2Var, 0));
                    duration.start();
                    arrayList = arrayList2;
                    i9 = size;
                } else {
                    arrayList = arrayList2;
                    i9 = size;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(r2Var, (Property<org.telegram.ui.Cells.r2, Float>) View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new ls(this, q1Var, r2Var, 1));
                    duration2.start();
                }
            } else {
                i9 = size;
                arrayList = arrayList2;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).alpha(0.0f).setListener(new ms(this, q1Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i9;
        }
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            final int i12 = 0;
            new Runnable(this) { // from class: org.telegram.ui.Components.ks
                public final /* synthetic */ ps b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    long j10 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (i13) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i14 = 0;
                            while (true) {
                                ps psVar = this.b;
                                if (i14 >= size2) {
                                    arrayList7.clear();
                                    psVar.t.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj2 = arrayList7.get(i14);
                                    i14++;
                                    os osVar = (os) obj2;
                                    f2.q1 q1Var2 = osVar.a;
                                    int i15 = osVar.b;
                                    int i16 = osVar.c;
                                    int i17 = osVar.d;
                                    int i18 = osVar.e;
                                    View view2 = q1Var2.a;
                                    int i19 = i17 - i15;
                                    int i20 = i18 - i16;
                                    if (i19 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i20 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i16 > i18) {
                                        psVar.B = i16 - i18;
                                    } else {
                                        psVar.A = i20;
                                    }
                                    org.telegram.ui.Cells.r2 r2Var3 = psVar.z;
                                    if (r2Var3 != null) {
                                        if (psVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = r2Var3.getMeasuredHeight();
                                            int i21 = psVar.A;
                                            psVar.B = measuredHeight3 - i21;
                                            psVar.z.setTopClip(i21);
                                            psVar.z.setBottomClip(psVar.B);
                                        } else if (psVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = r2Var3.getMeasuredHeight() - psVar.B;
                                            psVar.A = measuredHeight4;
                                            psVar.z.setTopClip(measuredHeight4);
                                            psVar.z.setBottomClip(psVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    psVar.w.add(q1Var2);
                                    animate2.setDuration(180L).setListener(new f2.j(psVar, q1Var2, i19, view2, i20, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i22 = 0;
                            while (true) {
                                ps psVar2 = this.b;
                                if (i22 >= size3) {
                                    arrayList7.clear();
                                    psVar2.u.remove(arrayList7);
                                    break;
                                } else {
                                    Object obj3 = arrayList7.get(i22);
                                    i22++;
                                    ns nsVar = (ns) obj3;
                                    ArrayList arrayList8 = psVar2.y;
                                    f2.q1 q1Var3 = nsVar.a;
                                    f2.q1 q1Var4 = nsVar.b;
                                    if (q1Var3 != null && q1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = q1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(q1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(nsVar.a);
                                        arrayList8.add(nsVar.b);
                                        animatorSet.addListener(new of.h0(psVar2, nsVar, q1Var3, animatorSet));
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
            final int i13 = 1;
            new Runnable(this) { // from class: org.telegram.ui.Components.ks
                public final /* synthetic */ ps b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i13;
                    long j10 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (i132) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i14 = 0;
                            while (true) {
                                ps psVar = this.b;
                                if (i14 >= size2) {
                                    arrayList72.clear();
                                    psVar.t.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj2 = arrayList72.get(i14);
                                    i14++;
                                    os osVar = (os) obj2;
                                    f2.q1 q1Var2 = osVar.a;
                                    int i15 = osVar.b;
                                    int i16 = osVar.c;
                                    int i17 = osVar.d;
                                    int i18 = osVar.e;
                                    View view2 = q1Var2.a;
                                    int i19 = i17 - i15;
                                    int i20 = i18 - i16;
                                    if (i19 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i20 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i16 > i18) {
                                        psVar.B = i16 - i18;
                                    } else {
                                        psVar.A = i20;
                                    }
                                    org.telegram.ui.Cells.r2 r2Var3 = psVar.z;
                                    if (r2Var3 != null) {
                                        if (psVar.A != Integer.MAX_VALUE) {
                                            int measuredHeight3 = r2Var3.getMeasuredHeight();
                                            int i21 = psVar.A;
                                            psVar.B = measuredHeight3 - i21;
                                            psVar.z.setTopClip(i21);
                                            psVar.z.setBottomClip(psVar.B);
                                        } else if (psVar.B != Integer.MAX_VALUE) {
                                            int measuredHeight4 = r2Var3.getMeasuredHeight() - psVar.B;
                                            psVar.A = measuredHeight4;
                                            psVar.z.setTopClip(measuredHeight4);
                                            psVar.z.setBottomClip(psVar.B);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    psVar.w.add(q1Var2);
                                    animate2.setDuration(180L).setListener(new f2.j(psVar, q1Var2, i19, view2, i20, animate2, 1)).start();
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i22 = 0;
                            while (true) {
                                ps psVar2 = this.b;
                                if (i22 >= size3) {
                                    arrayList72.clear();
                                    psVar2.u.remove(arrayList72);
                                    break;
                                } else {
                                    Object obj3 = arrayList72.get(i22);
                                    i22++;
                                    ns nsVar = (ns) obj3;
                                    ArrayList arrayList8 = psVar2.y;
                                    f2.q1 q1Var3 = nsVar.a;
                                    f2.q1 q1Var4 = nsVar.b;
                                    if (q1Var3 != null && q1Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j10);
                                        View view3 = q1Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(q1Var4.a, (Property<View, Float>) property, 1.0f));
                                        arrayList8.add(nsVar.a);
                                        arrayList8.add(nsVar.b);
                                        animatorSet.addListener(new of.h0(psVar2, nsVar, q1Var3, animatorSet));
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
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList8.get(i14);
            i14++;
            f2.q1 q1Var2 = (f2.q1) obj2;
            View view2 = q1Var2.a;
            this.v.add(q1Var2);
            ViewPropertyAnimator animate2 = view2.animate();
            animate2.alpha(1.0f).setDuration(180L).setListener(new ms(this, q1Var2, view2, animate2)).start();
        }
        arrayList8.clear();
        arrayList9.remove(arrayList8);
    }

    @Override // f2.t1
    public final void p(f2.q1 q1Var) {
        E(q1Var);
        View view = q1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(q1Var);
        if (arrayList.size() > 2) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((f2.q1) arrayList.get(i9)).a.setAlpha(0.0f);
                if (((f2.q1) arrayList.get(i9)).a instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) ((f2.q1) arrayList.get(i9)).a).setMoving(true);
                }
            }
        }
    }

    @Override // f2.t1
    public final boolean q(f2.q1 q1Var, f2.q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return false;
        }
        E(q1Var);
        E(q1Var2);
        View view2 = q1Var2.a;
        view.setAlpha(1.0f);
        view2.setAlpha(0.0f);
        view2.setTranslationX(0.0f);
        ns nsVar = new ns();
        nsVar.a = q1Var;
        nsVar.b = q1Var2;
        nsVar.c = i9;
        nsVar.d = i10;
        nsVar.e = i11;
        nsVar.f = i12;
        this.r.add(nsVar);
        return true;
    }

    @Override // f2.t1
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.a;
        int translationX = i9 + ((int) view.getTranslationX());
        View view2 = q1Var.a;
        int translationY = i10 + ((int) view2.getTranslationY());
        E(q1Var);
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
        if (view2 instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view2).setMoving(true);
        } else if (view2 instanceof of.l) {
            ((of.l) view2).a = true;
        }
        os osVar = new os();
        osVar.a = q1Var;
        osVar.b = translationX;
        osVar.c = translationY;
        osVar.d = i11;
        osVar.e = i12;
        this.q.add(osVar);
        return true;
    }

    @Override // f2.t1
    public final void s(f2.q1 q1Var, d5.p pVar) {
        E(q1Var);
        this.o.add(q1Var);
        org.telegram.ui.Cells.r2 r2Var = null;
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.C;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof org.telegram.ui.Cells.r2)) {
                r2Var = (org.telegram.ui.Cells.r2) childAt;
            }
            i9++;
        }
        if (q1Var.a == r2Var) {
            this.z = r2Var;
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f2.q1) arrayList.get(size)).a.animate().cancel();
        }
    }
}
