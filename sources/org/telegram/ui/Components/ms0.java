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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ms0 extends di.v {
    public final /* synthetic */ xv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        super(context, o2Var, j10);
        this.G = xv0Var;
    }

    @Override // di.v
    public final boolean c(MessageObject messageObject) {
        xv0 xv0Var = this.G;
        return xv0Var.Z0[(messageObject.getDialogId() > xv0Var.j1 ? 1 : (messageObject.getDialogId() == xv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // di.v
    public final boolean e(MessageObject messageObject) {
        xv0 xv0Var = this.G;
        ArrayList arrayList = xv0Var.N0;
        NumberTextView numberTextView = xv0Var.A0;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == xv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        xv0Var.a1++;
                    }
                    if (xv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(xv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        xv0Var.l0.setVisibility(xv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.u0;
                        if (u0Var != null) {
                            u0Var.setVisibility((xv0Var.getClosestTab() == 8 || xv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.v0;
                        if (u0Var2 != null) {
                            u0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = xv0Var.w0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.u0 u0Var4 = xv0Var.t0;
                        if (u0Var4 != null) {
                            if (xv0Var.getClosestTab() != 8 && xv0Var.getClosestTab() != 13) {
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
                        xv0Var.b1 = false;
                        xv0Var.e1(true);
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
        int i10;
        xv0 xv0Var = this.G;
        ArrayList arrayList = xv0Var.N0;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == xv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    xv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(xv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    xv0Var.l0.setVisibility(xv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.u0 u0Var = xv0Var.u0;
                    if (u0Var != null) {
                        u0Var.setVisibility((xv0Var.getClosestTab() == 8 || xv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.v0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = xv0Var.w0;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = xv0Var.t0;
                    if (u0Var4 != null) {
                        if (xv0Var.getClosestTab() != 8 && xv0Var.getClosestTab() != 13) {
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
                    xv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new kr0(this, i10), 20L);
                } else {
                    xv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
