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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fr0 extends mh.v {
    public final /* synthetic */ qu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(context, o2Var, j10);
        this.C = qu0Var;
    }

    @Override // mh.v
    public final boolean c(MessageObject messageObject) {
        qu0 qu0Var = this.C;
        return qu0Var.V0[(messageObject.getDialogId() > qu0Var.f1 ? 1 : (messageObject.getDialogId() == qu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // mh.v
    public final boolean e(MessageObject messageObject) {
        qu0 qu0Var = this.C;
        ArrayList arrayList = qu0Var.J0;
        NumberTextView numberTextView = qu0Var.w0;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        if (messageObject != null) {
            char c3 = messageObject.getDialogId() == qu0Var.f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        qu0Var.W0++;
                    }
                    if (qu0Var.y1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(qu0Var.r1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        qu0Var.h0.setVisibility(qu0Var.W0 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.q0;
                        if (w0Var != null) {
                            w0Var.setVisibility((qu0Var.getClosestTab() == 8 || qu0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.r0;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.s0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.p0;
                        if (w0Var4 != null) {
                            if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
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
                        qu0Var.X0 = false;
                        qu0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mh.v
    public final boolean g(MessageObject messageObject) {
        qu0 qu0Var = this.C;
        ArrayList arrayList = qu0Var.J0;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        if (messageObject != null) {
            int i10 = 1;
            char c3 = messageObject.getDialogId() == qu0Var.f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c3].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    qu0Var.W0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(qu0Var.r1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    qu0Var.h0.setVisibility(qu0Var.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = qu0Var.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility((qu0Var.getClosestTab() == 8 || qu0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.r0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.s0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.p0;
                    if (w0Var4 != null) {
                        if (qu0Var.getClosestTab() != 8 && qu0Var.getClosestTab() != 13) {
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
                    qu0Var.X0 = false;
                    AndroidUtilities.runOnUIThread(new fq0(this, i10), 20L);
                } else {
                    qu0Var.w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // mh.v
    public final int getStartedTrackingX() {
        return this.C.v1;
    }
}
