package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tp0 extends fi.q {
    public final /* synthetic */ ws0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        super(context, d2Var, j10);
        this.H = ws0Var;
    }

    @Override // fi.q
    public final boolean c(org.telegram.messenger.zi ziVar) {
        ws0 ws0Var = this.H;
        return ws0Var.c1[(org.telegram.messenger.zi.B0(ziVar.k) > ws0Var.m1 ? 1 : (org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) >= 0;
    }

    @Override // fi.q
    public final boolean e(org.telegram.messenger.zi ziVar) {
        ws0 ws0Var = this.H;
        ArrayList arrayList = ws0Var.Q0;
        SparseArray[] sparseArrayArr = ws0Var.c1;
        if (ziVar != null) {
            char c2 = org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c2].put(ziVar.f1(), ziVar);
                    if (!ziVar.s(null, false)) {
                        ws0Var.d1++;
                    }
                    if (ws0Var.F1) {
                        ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        org.telegram.messenger.g0.v1(ws0Var.y1.getParentActivity().getCurrentFocus());
                        int i3 = 8;
                        ws0Var.o0.setVisibility(ws0Var.d1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.x0;
                        if (q0Var != null) {
                            q0Var.setVisibility((ws0Var.getClosestTab() == 8 || ws0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.y0;
                        if (q0Var2 != null) {
                            q0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.z0;
                        if (q0Var3 != null) {
                            q0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.w0;
                        if (q0Var4 != null) {
                            if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
                                i3 = 0;
                            }
                            q0Var4.setVisibility(i3);
                        }
                        ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        ws0Var.e1 = false;
                        ws0Var.o1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fi.q
    public final boolean g(org.telegram.messenger.zi ziVar) {
        ws0 ws0Var = this.H;
        ArrayList arrayList = ws0Var.Q0;
        SparseArray[] sparseArrayArr = ws0Var.c1;
        int i3 = 0;
        if (ziVar != null) {
            char c2 = org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c2].indexOfKey(ziVar.f1()) >= 0) {
                sparseArrayArr[c2].remove(ziVar.f1());
                if (!ziVar.s(null, false)) {
                    ws0Var.d1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    org.telegram.messenger.g0.v1(ws0Var.y1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    ws0Var.o0.setVisibility(ws0Var.d1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.q0 q0Var = ws0Var.x0;
                    if (q0Var != null) {
                        q0Var.setVisibility((ws0Var.getClosestTab() == 8 || ws0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.y0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = ws0Var.z0;
                    if (q0Var3 != null) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = ws0Var.w0;
                    if (q0Var4 != null) {
                        if (ws0Var.getClosestTab() != 8 && ws0Var.getClosestTab() != 13) {
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
                    ws0Var.e1 = false;
                    org.telegram.messenger.g0.i3(new sp0(this, i3), 20L);
                } else {
                    ws0Var.m1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // fi.q
    public final int getStartedTrackingX() {
        return this.H.C1;
    }
}
