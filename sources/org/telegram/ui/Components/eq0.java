package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class eq0 extends gi.q {
    public final /* synthetic */ it0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, long j3) {
        super(context, g2Var, j3);
        this.H = it0Var;
    }

    @Override // gi.q
    public final boolean c(org.telegram.messenger.fj fjVar) {
        it0 it0Var = this.H;
        return it0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > it0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == it0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0;
    }

    @Override // gi.q
    public final boolean e(org.telegram.messenger.fj fjVar) {
        it0 it0Var = this.H;
        ArrayList arrayList = it0Var.Q0;
        SparseArray[] sparseArrayArr = it0Var.c1;
        if (fjVar != null) {
            char c10 = org.telegram.messenger.fj.B0(fjVar.k) == it0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(fjVar.e1(), fjVar);
                    if (!fjVar.s(null, false)) {
                        it0Var.d1++;
                    }
                    if (it0Var.F1) {
                        it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.g0.v1(it0Var.y1.getParentActivity().getCurrentFocus());
                        int i7 = 8;
                        it0Var.o0.setVisibility(it0Var.d1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.q0 q0Var = it0Var.x0;
                        if (q0Var != null) {
                            q0Var.setVisibility((it0Var.getClosestTab() == 8 || it0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.y0;
                        if (q0Var2 != null) {
                            q0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = it0Var.z0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = it0Var.w0;
                        if (q0Var4 != null) {
                            if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
                                i7 = 0;
                            }
                            q0Var4.setVisibility(i7);
                        }
                        it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        it0Var.e1 = false;
                        it0Var.q1(true);
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
        it0 it0Var = this.H;
        ArrayList arrayList = it0Var.Q0;
        SparseArray[] sparseArrayArr = it0Var.c1;
        if (fjVar != null) {
            int i7 = 1;
            char c10 = org.telegram.messenger.fj.B0(fjVar.k) == it0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(fjVar.e1()) >= 0) {
                sparseArrayArr[c10].remove(fjVar.e1());
                if (!fjVar.s(null, false)) {
                    it0Var.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(it0Var.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    it0Var.o0.setVisibility(it0Var.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.q0 q0Var = it0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility((it0Var.getClosestTab() == 8 || it0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.y0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = it0Var.z0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = it0Var.w0;
                    if (q0Var4 != null) {
                        if (it0Var.getClosestTab() != 8 && it0Var.getClosestTab() != 13) {
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
                    it0Var.e1 = false;
                    org.telegram.messenger.g0.h3(new bp0(this, i7), 20L);
                } else {
                    it0Var.o1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
