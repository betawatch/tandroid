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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class or0 extends ph.p {
    public final /* synthetic */ zu0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(context, p2Var, j10);
        this.D = zu0Var;
    }

    @Override // ph.p
    public final boolean c(MessageObject messageObject) {
        zu0 zu0Var = this.D;
        return zu0Var.W0[(messageObject.getDialogId() > zu0Var.g1 ? 1 : (messageObject.getDialogId() == zu0Var.g1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // ph.p
    public final boolean e(MessageObject messageObject) {
        zu0 zu0Var = this.D;
        ArrayList arrayList = zu0Var.K0;
        NumberTextView numberTextView = zu0Var.x0;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        if (messageObject != null) {
            char c3 = messageObject.getDialogId() == zu0Var.g1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c3].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        zu0Var.X0++;
                    }
                    if (zu0Var.z1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(zu0Var.s1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        zu0Var.i0.setVisibility(zu0Var.X0 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.r0;
                        if (w0Var != null) {
                            w0Var.setVisibility((zu0Var.getClosestTab() == 8 || zu0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.s0;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.t0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.q0;
                        if (w0Var4 != null) {
                            if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
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
                        zu0Var.Y0 = false;
                        zu0Var.b1(true);
                    }
                    j();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ph.p
    public final boolean g(MessageObject messageObject) {
        zu0 zu0Var = this.D;
        ArrayList arrayList = zu0Var.K0;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        if (messageObject != null) {
            int i10 = 1;
            char c3 = messageObject.getDialogId() == zu0Var.g1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c3].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    zu0Var.X0--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(zu0Var.s1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    zu0Var.i0.setVisibility(zu0Var.X0 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.w0 w0Var = zu0Var.r0;
                    if (w0Var != null) {
                        w0Var.setVisibility((zu0Var.getClosestTab() == 8 || zu0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.s0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.t0;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.q0;
                    if (w0Var4 != null) {
                        if (zu0Var.getClosestTab() != 8 && zu0Var.getClosestTab() != 13) {
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
                    zu0Var.Y0 = false;
                    AndroidUtilities.runOnUIThread(new oq0(this, i10), 20L);
                } else {
                    zu0Var.x0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                }
                j();
                return true;
            }
        }
        return false;
    }

    @Override // ph.p
    public final int getStartedTrackingX() {
        return this.D.w1;
    }
}
