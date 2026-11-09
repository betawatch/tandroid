package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tp0 extends ei.r {
    public final /* synthetic */ zs0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        super(context, f2Var, j3);
        this.G = zs0Var;
    }

    @Override // ei.r
    public final boolean c(org.telegram.messenger.ij ijVar) {
        zs0 zs0Var = this.G;
        return zs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > zs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0;
    }

    @Override // ei.r
    public final boolean e(org.telegram.messenger.ij ijVar) {
        zs0 zs0Var = this.G;
        ArrayList arrayList = zs0Var.P0;
        SparseArray[] sparseArrayArr = zs0Var.b1;
        if (ijVar != null) {
            char c10 = org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(ijVar.e1(), ijVar);
                    if (!ijVar.s(null, false)) {
                        zs0Var.c1++;
                    }
                    if (zs0Var.E1) {
                        zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.g0.v1(zs0Var.x1.getParentActivity().getCurrentFocus());
                        int i7 = 8;
                        zs0Var.n0.setVisibility(zs0Var.c1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.w0;
                        if (r0Var != null) {
                            r0Var.setVisibility((zs0Var.getClosestTab() == 8 || zs0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.x0;
                        if (r0Var2 != null) {
                            r0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var3 = zs0Var.y0;
                        if (r0Var3 != null) {
                            r0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.r0 r0Var4 = zs0Var.v0;
                        if (r0Var4 != null) {
                            if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
                                i7 = 0;
                            }
                            r0Var4.setVisibility(i7);
                        }
                        zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        zs0Var.d1 = false;
                        zs0Var.q1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ei.r
    public final boolean g(org.telegram.messenger.ij ijVar) {
        zs0 zs0Var = this.G;
        ArrayList arrayList = zs0Var.P0;
        SparseArray[] sparseArrayArr = zs0Var.b1;
        if (ijVar != null) {
            char c10 = org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(ijVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(ijVar.e1());
                if (!ijVar.s(null, false)) {
                    zs0Var.c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(zs0Var.x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i7 = 8;
                    zs0Var.n0.setVisibility(zs0Var.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.r0 r0Var = zs0Var.w0;
                    if (r0Var != null) {
                        r0Var.setVisibility((zs0Var.getClosestTab() == 8 || zs0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.x0;
                    if (r0Var2 != null) {
                        r0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var3 = zs0Var.y0;
                    if (r0Var3 != null) {
                        r0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.r0 r0Var4 = zs0Var.v0;
                    if (r0Var4 != null) {
                        if (zs0Var.getClosestTab() != 8 && zs0Var.getClosestTab() != 13) {
                            i7 = 0;
                        }
                        r0Var4.setVisibility(i7);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        View view = (View) arrayList.get(i10);
                        org.telegram.messenger.g0.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    zs0Var.d1 = false;
                    org.telegram.messenger.g0.i3(new pb0(this, 28), 20L);
                } else {
                    zs0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // ei.r
    public final int getStartedTrackingX() {
        return this.G.B1;
    }
}
