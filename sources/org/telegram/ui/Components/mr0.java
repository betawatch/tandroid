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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mr0 extends bi.z {
    public final /* synthetic */ yu0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(context, n2Var, j3);
        this.G = yu0Var;
    }

    @Override // bi.z
    public final boolean c(MessageObject messageObject) {
        yu0 yu0Var = this.G;
        return yu0Var.Z0[(messageObject.getDialogId() > yu0Var.j1 ? 1 : (messageObject.getDialogId() == yu0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // bi.z
    public final boolean e(MessageObject messageObject) {
        yu0 yu0Var = this.G;
        ArrayList arrayList = yu0Var.N0;
        NumberTextView numberTextView = yu0Var.A0;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == yu0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        yu0Var.a1++;
                    }
                    if (yu0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(yu0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        yu0Var.l0.setVisibility(yu0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.u0;
                        if (v0Var != null) {
                            v0Var.setVisibility((yu0Var.getClosestTab() == 8 || yu0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.v0;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = yu0Var.w0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = yu0Var.t0;
                        if (v0Var4 != null) {
                            if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            v0Var4.setVisibility(i10);
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
                        yu0Var.b1 = false;
                        yu0Var.b1(true);
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
        yu0 yu0Var = this.G;
        ArrayList arrayList = yu0Var.N0;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        if (messageObject != null) {
            int i10 = 1;
            char c10 = messageObject.getDialogId() == yu0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    yu0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(yu0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    yu0Var.l0.setVisibility(yu0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = yu0Var.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((yu0Var.getClosestTab() == 8 || yu0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = yu0Var.v0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = yu0Var.w0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = yu0Var.t0;
                    if (v0Var4 != null) {
                        if (yu0Var.getClosestTab() != 8 && yu0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        v0Var4.setVisibility(i11);
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
                    yu0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new jq0(this, i10), 20L);
                } else {
                    yu0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
