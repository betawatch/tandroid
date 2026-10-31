package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uq0 extends uh.m {
    public final /* synthetic */ zt0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        super(context, k2Var, j10);
        this.G = zt0Var;
    }

    @Override // uh.m
    public final boolean c(org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.G;
        return zt0Var.b1[(org.telegram.messenger.jj.B0(jjVar.k) > zt0Var.l1 ? 1 : (org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) >= 0;
    }

    @Override // uh.m
    public final boolean e(org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.G;
        ArrayList arrayList = zt0Var.P0;
        SparseArray[] sparseArrayArr = zt0Var.b1;
        if (jjVar != null) {
            char c10 = org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(jjVar.f1(), jjVar);
                    if (!jjVar.s(null, false)) {
                        zt0Var.c1++;
                    }
                    if (zt0Var.E1) {
                        zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.i0.v1(zt0Var.x1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        zt0Var.n0.setVisibility(zt0Var.c1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.w0;
                        if (t0Var != null) {
                            t0Var.setVisibility((zt0Var.getClosestTab() == 8 || zt0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.x0;
                        if (t0Var2 != null) {
                            t0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.y0;
                        if (t0Var3 != null) {
                            t0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.v0;
                        if (t0Var4 != null) {
                            if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            t0Var4.setVisibility(i10);
                        }
                        zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            View view = (View) arrayList.get(i11);
                            org.telegram.messenger.i0.y(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        zt0Var.d1 = false;
                        zt0Var.l1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uh.m
    public final boolean g(org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.G;
        ArrayList arrayList = zt0Var.P0;
        SparseArray[] sparseArrayArr = zt0Var.b1;
        if (jjVar != null) {
            char c10 = org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(jjVar.f1()) >= 0) {
                sparseArrayArr[c10].remove(jjVar.f1());
                if (!jjVar.s(null, false)) {
                    zt0Var.c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.i0.v1(zt0Var.x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    zt0Var.n0.setVisibility(zt0Var.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.t0 t0Var = zt0Var.w0;
                    if (t0Var != null) {
                        t0Var.setVisibility((zt0Var.getClosestTab() == 8 || zt0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = zt0Var.x0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var3 = zt0Var.y0;
                    if (t0Var3 != null) {
                        t0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var4 = zt0Var.v0;
                    if (t0Var4 != null) {
                        if (zt0Var.getClosestTab() != 8 && zt0Var.getClosestTab() != 13) {
                            i10 = 0;
                        }
                        t0Var4.setVisibility(i10);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        View view = (View) arrayList.get(i11);
                        org.telegram.messenger.i0.y(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    zt0Var.d1 = false;
                    org.telegram.messenger.i0.h3(new uo0(this, 3), 20L);
                } else {
                    zt0Var.j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // uh.m
    public final int getStartedTrackingX() {
        return this.G.B1;
    }
}
