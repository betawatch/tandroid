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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class js0 extends di.v {
    public final /* synthetic */ uv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, n2Var, j10);
        this.G = uv0Var;
    }

    @Override // di.v
    public final boolean c(MessageObject messageObject) {
        uv0 uv0Var = this.G;
        return uv0Var.Z0[(messageObject.getDialogId() > uv0Var.j1 ? 1 : (messageObject.getDialogId() == uv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // di.v
    public final boolean e(MessageObject messageObject) {
        uv0 uv0Var = this.G;
        ArrayList arrayList = uv0Var.N0;
        NumberTextView numberTextView = uv0Var.A0;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == uv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        uv0Var.a1++;
                    }
                    if (uv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(uv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        uv0Var.l0.setVisibility(uv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.u0;
                        if (u0Var != null) {
                            u0Var.setVisibility((uv0Var.getClosestTab() == 8 || uv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.v0;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = uv0Var.w0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = uv0Var.t0;
                        if (u0Var4 != null) {
                            if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
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
                        uv0Var.b1 = false;
                        uv0Var.d1(true);
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
        uv0 uv0Var = this.G;
        ArrayList arrayList = uv0Var.N0;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        if (messageObject != null) {
            int i10 = 1;
            char c10 = messageObject.getDialogId() == uv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    uv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(uv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    uv0Var.l0.setVisibility(uv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = uv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((uv0Var.getClosestTab() == 8 || uv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.v0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = uv0Var.w0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = uv0Var.t0;
                    if (u0Var4 != null) {
                        if (uv0Var.getClosestTab() != 8 && uv0Var.getClosestTab() != 13) {
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
                    uv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new hr0(this, i10), 20L);
                } else {
                    uv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
