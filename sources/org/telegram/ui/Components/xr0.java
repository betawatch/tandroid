package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class xr0 extends bi.z {
    public final /* synthetic */ jv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(context, m2Var, j3);
        this.G = jv0Var;
    }

    @Override // bi.z
    public final boolean c(MessageObject messageObject) {
        jv0 jv0Var = this.G;
        return jv0Var.Z0[(messageObject.getDialogId() > jv0Var.j1 ? 1 : (messageObject.getDialogId() == jv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // bi.z
    public final boolean e(MessageObject messageObject) {
        jv0 jv0Var = this.G;
        ArrayList arrayList = jv0Var.N0;
        NumberTextView numberTextView = jv0Var.A0;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == jv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        jv0Var.a1++;
                    }
                    if (jv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(jv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        jv0Var.l0.setVisibility(jv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.u0;
                        if (u0Var != null) {
                            u0Var.setVisibility((jv0Var.getClosestTab() == 8 || jv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var2 = jv0Var.v0;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = jv0Var.w0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = jv0Var.t0;
                        if (u0Var4 != null) {
                            if (jv0Var.getClosestTab() != 8 && jv0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            u0Var4.setVisibility(i10);
                        }
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            View view = (View) arrayList.get(i11);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        jv0Var.b1 = false;
                        jv0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // bi.z
    public final boolean g(MessageObject messageObject) {
        int i10;
        jv0 jv0Var = this.G;
        ArrayList arrayList = jv0Var.N0;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == jv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    jv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(jv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    jv0Var.l0.setVisibility(jv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = jv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((jv0Var.getClosestTab() == 8 || jv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = jv0Var.v0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = jv0Var.w0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = jv0Var.t0;
                    if (u0Var4 != null) {
                        if (jv0Var.getClosestTab() != 8 && jv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        u0Var4.setVisibility(i11);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (true) {
                        i10 = 2;
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        View view = (View) arrayList.get(i12);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                        i12++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    jv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new wq0(this, i10), 20L);
                } else {
                    jv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // bi.z
    public final int getStartedTrackingX() {
        return this.G.z1;
    }
}
