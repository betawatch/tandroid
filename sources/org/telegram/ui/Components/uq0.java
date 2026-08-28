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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uq0 extends jh.u {
    public final /* synthetic */ eu0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(context, o2Var, j10);
        this.C = eu0Var;
    }

    @Override // jh.u
    public final boolean c(MessageObject messageObject) {
        eu0 eu0Var = this.C;
        return eu0Var.V0[(messageObject.getDialogId() > eu0Var.f1 ? 1 : (messageObject.getDialogId() == eu0Var.f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // jh.u
    public final boolean e(MessageObject messageObject) {
        eu0 eu0Var = this.C;
        ArrayList arrayList = eu0Var.J0;
        NumberTextView numberTextView = eu0Var.w0;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == eu0Var.f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        eu0Var.W0++;
                    }
                    if (eu0Var.y1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(eu0Var.r1.getParentActivity().getCurrentFocus());
                        int i9 = 8;
                        eu0Var.h0.setVisibility(eu0Var.W0 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.q0;
                        if (w0Var != null) {
                            w0Var.setVisibility((eu0Var.getClosestTab() == 8 || eu0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.r0;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = eu0Var.s0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = eu0Var.p0;
                        if (w0Var4 != null) {
                            if (eu0Var.getClosestTab() != 8 && eu0Var.getClosestTab() != 13) {
                                i9 = 0;
                            }
                            w0Var4.setVisibility(i9);
                        }
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            View view = (View) arrayList.get(i10);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        eu0Var.X0 = false;
                        eu0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jh.u
    public final boolean g(MessageObject messageObject) {
        eu0 eu0Var = this.C;
        ArrayList arrayList = eu0Var.J0;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        if (messageObject != null) {
            int i9 = 1;
            char c10 = messageObject.getDialogId() == eu0Var.f1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    eu0Var.W0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(eu0Var.r1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i10 = 8;
                    eu0Var.h0.setVisibility(eu0Var.W0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = eu0Var.q0;
                    if (w0Var != null) {
                        w0Var.setVisibility((eu0Var.getClosestTab() == 8 || eu0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.r0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = eu0Var.s0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = eu0Var.p0;
                    if (w0Var4 != null) {
                        if (eu0Var.getClosestTab() != 8 && eu0Var.getClosestTab() != 13) {
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
                    eu0Var.X0 = false;
                    AndroidUtilities.runOnUIThread(new tp0(this, i9), 20L);
                } else {
                    eu0Var.w0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // jh.u
    public final int getStartedTrackingX() {
        return this.C.v1;
    }
}
