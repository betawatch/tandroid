package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dq0 extends gi.q {
    public final /* synthetic */ gt0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, long j3) {
        super(context, h2Var, j3);
        this.H = gt0Var;
    }

    @Override // gi.q
    public final boolean c(org.telegram.messenger.fj fjVar) {
        gt0 gt0Var = this.H;
        return gt0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > gt0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0;
    }

    @Override // gi.q
    public final boolean e(org.telegram.messenger.fj fjVar) {
        gt0 gt0Var = this.H;
        ArrayList arrayList = gt0Var.Q0;
        SparseArray[] sparseArrayArr = gt0Var.c1;
        if (fjVar != null) {
            char c10 = org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        gt0Var.d1++;
                    }
                    if (gt0Var.F1) {
                        gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.g0.v1(gt0Var.y1.getParentActivity().getCurrentFocus());
                        int i7 = 8;
                        gt0Var.o0.setVisibility(gt0Var.d1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.x0;
                        if (r0Var != null) {
                            r0Var.setVisibility((gt0Var.getClosestTab() == 8 || gt0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.y0;
                        if (r0Var2 != null) {
                            r0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.z0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.w0;
                        if (r0Var4 != null) {
                            if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                                i7 = 0;
                            }
                            r0Var4.setVisibility(i7);
                        }
                        gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        gt0Var.e1 = false;
                        gt0Var.q1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gi.q
    public final boolean g(org.telegram.messenger.fj fjVar) {
        gt0 gt0Var = this.H;
        ArrayList arrayList = gt0Var.Q0;
        SparseArray[] sparseArrayArr = gt0Var.c1;
        if (fjVar != null) {
            int i7 = 1;
            char c10 = org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(fjVar.e1());
                if (!fjVar.s(null, false)) {
                    gt0Var.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(gt0Var.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    gt0Var.o0.setVisibility(gt0Var.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = gt0Var.x0;
                    if (r0Var != null) {
                        r0Var.setVisibility((gt0Var.getClosestTab() == 8 || gt0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.y0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = gt0Var.z0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = gt0Var.w0;
                    if (r0Var4 != null) {
                        if (gt0Var.getClosestTab() != 8 && gt0Var.getClosestTab() != 13) {
                            i10 = 0;
                        }
                        r0Var4.setVisibility(i10);
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
                    gt0Var.e1 = false;
                    org.telegram.messenger.g0.h3(new ap0(this, i7), 20L);
                } else {
                    gt0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
