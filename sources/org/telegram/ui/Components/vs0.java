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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vs0 extends ei.v {
    public final /* synthetic */ bw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, long j10) {
        super(context, r2Var, j10);
        this.G = bw0Var;
    }

    @Override // ei.v
    public final boolean c(MessageObject messageObject) {
        bw0 bw0Var = this.G;
        return bw0Var.b1[(messageObject.getDialogId() > bw0Var.l1 ? 1 : (messageObject.getDialogId() == bw0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // ei.v
    public final boolean e(MessageObject messageObject) {
        bw0 bw0Var = this.G;
        ArrayList arrayList = bw0Var.P0;
        SparseArray[] sparseArrayArr = bw0Var.b1;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == bw0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        bw0Var.c1++;
                    }
                    if (bw0Var.E1) {
                        bw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(bw0Var.x1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        bw0Var.n0.setVisibility(bw0Var.c1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.w0;
                        if (w0Var != null) {
                            w0Var.setVisibility((bw0Var.getClosestTab() == 8 || bw0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.x0;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = bw0Var.y0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = bw0Var.v0;
                        if (w0Var4 != null) {
                            if (bw0Var.getClosestTab() != 8 && bw0Var.getClosestTab() != 13) {
                                i10 = 0;
                            }
                            w0Var4.setVisibility(i10);
                        }
                        bw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
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
                        bw0Var.d1 = false;
                        bw0Var.k1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ei.v
    public final boolean g(MessageObject messageObject) {
        bw0 bw0Var = this.G;
        ArrayList arrayList = bw0Var.P0;
        SparseArray[] sparseArrayArr = bw0Var.b1;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == bw0Var.l1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    bw0Var.c1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(bw0Var.x1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    bw0Var.n0.setVisibility(bw0Var.c1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = bw0Var.w0;
                    if (w0Var != null) {
                        w0Var.setVisibility((bw0Var.getClosestTab() == 8 || bw0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.x0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = bw0Var.y0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = bw0Var.v0;
                    if (w0Var4 != null) {
                        if (bw0Var.getClosestTab() != 8 && bw0Var.getClosestTab() != 13) {
                            i10 = 0;
                        }
                        w0Var4.setVisibility(i10);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        View view = (View) arrayList.get(i11);
                        AndroidUtilities.clearDrawableAnimation(view);
                        arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    bw0Var.d1 = false;
                    AndroidUtilities.runOnUIThread(new np0(this, 5), 20L);
                } else {
                    bw0Var.i1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // ei.v
    public final int getStartedTrackingX() {
        return this.G.B1;
    }
}
