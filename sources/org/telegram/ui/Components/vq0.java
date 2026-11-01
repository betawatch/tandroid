package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vq0 extends uh.m {
    public final /* synthetic */ au0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, long j10) {
        super(context, k2Var, j10);
        this.G = au0Var;
    }

    @Override // uh.m
    public final boolean c(org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.G;
        return au0Var.b1[(org.telegram.messenger.kj.B0(kjVar.k) > au0Var.l1 ? 1 : (org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(kjVar.f1()) >= 0;
    }

    @Override // uh.m
    public final boolean e(org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.G;
        ArrayList arrayList = au0Var.P0;
        SparseArray[] sparseArrayArr = au0Var.b1;
        if (kjVar != null) {
            char c10 = org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(kjVar.f1(), kjVar);
                    if (!kjVar.s(null, false)) {
                        au0Var.c1++;
                    }
                    if (au0Var.E1) {
                        au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.i0.v1(au0Var.x1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        au0Var.n0.setVisibility(au0Var.c1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.t0 t0Var = au0Var.w0;
                        if (t0Var != null) {
                            t0Var.setVisibility((au0Var.getClosestTab() == 8 || au0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.x0;
                        if (t0Var2 != null) {
                            t0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var3 = au0Var.y0;
                        if (t0Var3 != null) {
                            t0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.t0 t0Var4 = au0Var.v0;
                        if (t0Var4 != null) {
                            if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            t0Var4.setVisibility(i10);
                        }
                        au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        au0Var.d1 = false;
                        au0Var.m1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uh.m
    public final boolean g(org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.G;
        ArrayList arrayList = au0Var.P0;
        SparseArray[] sparseArrayArr = au0Var.b1;
        if (kjVar != null) {
            char c10 = org.telegram.messenger.kj.B0(kjVar.k) == au0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(kjVar.f1()) >= 0) {
                sparseArrayArr[c10].remove(kjVar.f1());
                if (!kjVar.s(null, false)) {
                    au0Var.c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.i0.v1(au0Var.x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    au0Var.n0.setVisibility(au0Var.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.t0 t0Var = au0Var.w0;
                    if (t0Var != null) {
                        t0Var.setVisibility((au0Var.getClosestTab() == 8 || au0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.x0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var3 = au0Var.y0;
                    if (t0Var3 != null) {
                        t0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var4 = au0Var.v0;
                    if (t0Var4 != null) {
                        if (au0Var.getClosestTab() != 8 && au0Var.getClosestTab() != 13) {
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
                    au0Var.d1 = false;
                    org.telegram.messenger.i0.h3(new vo0(this, 3), 20L);
                } else {
                    au0Var.k1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
