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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class is0 extends di.v {
    public final /* synthetic */ tv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, n2Var, j10);
        this.G = tv0Var;
    }

    @Override // di.v
    public final boolean c(MessageObject messageObject) {
        tv0 tv0Var = this.G;
        return tv0Var.Z0[(messageObject.getDialogId() > tv0Var.j1 ? 1 : (messageObject.getDialogId() == tv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // di.v
    public final boolean e(MessageObject messageObject) {
        tv0 tv0Var = this.G;
        ArrayList arrayList = tv0Var.N0;
        NumberTextView numberTextView = tv0Var.A0;
        SparseArray[] sparseArrayArr = tv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == tv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        tv0Var.a1++;
                    }
                    if (tv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(tv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        tv0Var.l0.setVisibility(tv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.u0;
                        if (u0Var != null) {
                            u0Var.setVisibility((tv0Var.getClosestTab() == 8 || tv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var2 = tv0Var.v0;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = tv0Var.w0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = tv0Var.t0;
                        if (u0Var4 != null) {
                            if (tv0Var.getClosestTab() != 8 && tv0Var.getClosestTab() != 13) {
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
                        tv0Var.b1 = false;
                        tv0Var.d1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // di.v
    public final boolean g(MessageObject messageObject) {
        tv0 tv0Var = this.G;
        ArrayList arrayList = tv0Var.N0;
        SparseArray[] sparseArrayArr = tv0Var.Z0;
        if (messageObject != null) {
            int i10 = 1;
            char c10 = messageObject.getDialogId() == tv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    tv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(tv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    tv0Var.l0.setVisibility(tv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = tv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((tv0Var.getClosestTab() == 8 || tv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = tv0Var.v0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = tv0Var.w0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = tv0Var.t0;
                    if (u0Var4 != null) {
                        if (tv0Var.getClosestTab() != 8 && tv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        u0Var4.setVisibility(i11);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        View view = (View) arrayList.get(i12);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    tv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new gr0(this, i10), 20L);
                } else {
                    tv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // di.v
    public final int getStartedTrackingX() {
        return this.G.z1;
    }
}
