package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vp0 extends gi.q {
    public final /* synthetic */ ys0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, long j3) {
        super(context, e2Var, j3);
        this.H = ys0Var;
    }

    @Override // gi.q
    public final boolean c(org.telegram.messenger.gj gjVar) {
        ys0 ys0Var = this.H;
        return ys0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > ys0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0;
    }

    @Override // gi.q
    public final boolean e(org.telegram.messenger.gj gjVar) {
        ys0 ys0Var = this.H;
        ArrayList arrayList = ys0Var.Q0;
        SparseArray[] sparseArrayArr = ys0Var.c1;
        if (gjVar != null) {
            char c10 = org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(gjVar.e1(), gjVar);
                    if (!gjVar.s(null, false)) {
                        ys0Var.d1++;
                    }
                    if (ys0Var.F1) {
                        ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.g0.v1(ys0Var.y1.getParentActivity().getCurrentFocus());
                        int i7 = 8;
                        ys0Var.o0.setVisibility(ys0Var.d1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.x0;
                        if (q0Var != null) {
                            q0Var.setVisibility((ys0Var.getClosestTab() == 8 || ys0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.y0;
                        if (q0Var2 != null) {
                            q0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.z0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.w0;
                        if (q0Var4 != null) {
                            if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                                i7 = 0;
                            }
                            q0Var4.setVisibility(i7);
                        }
                        ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            View view = (View) arrayList.get(i10);
                            org.telegram.messenger.g0.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        ys0Var.e1 = false;
                        ys0Var.q1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gi.q
    public final boolean g(org.telegram.messenger.gj gjVar) {
        ys0 ys0Var = this.H;
        ArrayList arrayList = ys0Var.Q0;
        SparseArray[] sparseArrayArr = ys0Var.c1;
        if (gjVar != null) {
            int i7 = 1;
            char c10 = org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(gjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(gjVar.e1());
                if (!gjVar.s(null, false)) {
                    ys0Var.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(ys0Var.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    ys0Var.o0.setVisibility(ys0Var.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.q0 q0Var = ys0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility((ys0Var.getClosestTab() == 8 || ys0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.y0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = ys0Var.z0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = ys0Var.w0;
                    if (q0Var4 != null) {
                        if (ys0Var.getClosestTab() != 8 && ys0Var.getClosestTab() != 13) {
                            i10 = 0;
                        }
                        q0Var4.setVisibility(i10);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        View view = (View) arrayList.get(i11);
                        org.telegram.messenger.g0.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    ys0Var.e1 = false;
                    org.telegram.messenger.g0.i3(new ro0(this, i7), 20L);
                } else {
                    ys0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // gi.q
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
