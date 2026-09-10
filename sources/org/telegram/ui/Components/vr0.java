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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vr0 extends ai.g0 {
    public final /* synthetic */ iv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, long j3) {
        super(context, p2Var, j3);
        this.G = iv0Var;
    }

    @Override // ai.g0
    public final boolean c(MessageObject messageObject) {
        iv0 iv0Var = this.G;
        return iv0Var.Z0[(messageObject.getDialogId() > iv0Var.j1 ? 1 : (messageObject.getDialogId() == iv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // ai.g0
    public final boolean e(MessageObject messageObject) {
        iv0 iv0Var = this.G;
        ArrayList arrayList = iv0Var.N0;
        NumberTextView numberTextView = iv0Var.A0;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == iv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        iv0Var.a1++;
                    }
                    if (iv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(iv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        iv0Var.l0.setVisibility(iv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.u0;
                        if (w0Var != null) {
                            w0Var.setVisibility((iv0Var.getClosestTab() == 8 || iv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.v0;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = iv0Var.w0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = iv0Var.t0;
                        if (w0Var4 != null) {
                            if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            w0Var4.setVisibility(i10);
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
                        iv0Var.b1 = false;
                        iv0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ai.g0
    public final boolean g(MessageObject messageObject) {
        iv0 iv0Var = this.G;
        ArrayList arrayList = iv0Var.N0;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        if (messageObject != null) {
            int i10 = 1;
            char c10 = messageObject.getDialogId() == iv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    iv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(iv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    iv0Var.l0.setVisibility(iv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = iv0Var.u0;
                    if (w0Var != null) {
                        w0Var.setVisibility((iv0Var.getClosestTab() == 8 || iv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.v0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = iv0Var.w0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = iv0Var.t0;
                    if (w0Var4 != null) {
                        if (iv0Var.getClosestTab() != 8 && iv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        w0Var4.setVisibility(i11);
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
                    iv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new uq0(this, i10), 20L);
                } else {
                    iv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // ai.g0
    public final int getStartedTrackingX() {
        return this.G.z1;
    }
}
