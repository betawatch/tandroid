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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zr0 extends bi.z {
    public final /* synthetic */ lv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(context, n2Var, j3);
        this.G = lv0Var;
    }

    @Override // bi.z
    public final boolean c(MessageObject messageObject) {
        lv0 lv0Var = this.G;
        return lv0Var.Z0[(messageObject.getDialogId() > lv0Var.j1 ? 1 : (messageObject.getDialogId() == lv0Var.j1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
    }

    @Override // bi.z
    public final boolean e(MessageObject messageObject) {
        lv0 lv0Var = this.G;
        ArrayList arrayList = lv0Var.N0;
        NumberTextView numberTextView = lv0Var.A0;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == lv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) < 0) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                    sparseArrayArr[c10].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        lv0Var.a1++;
                    }
                    if (lv0Var.C1) {
                        numberTextView.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    } else {
                        AndroidUtilities.hideKeyboard(lv0Var.v1.getParentActivity().getCurrentFocus());
                        int i10 = 8;
                        lv0Var.l0.setVisibility(lv0Var.a1 == 0 ? 0 : 8);
                        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.u0;
                        if (v0Var != null) {
                            v0Var.setVisibility((lv0Var.getClosestTab() == 8 || lv0Var.getClosestTab() == 13) ? 8 : 0);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var2 = lv0Var.v0;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = lv0Var.w0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.v0 v0Var4 = lv0Var.t0;
                        if (v0Var4 != null) {
                            if (lv0Var.getClosestTab() != 8 && lv0Var.getClosestTab() != 13) {
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
                        lv0Var.b1 = false;
                        lv0Var.b1(true);
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
        lv0 lv0Var = this.G;
        ArrayList arrayList = lv0Var.N0;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        if (messageObject != null) {
            char c10 = messageObject.getDialogId() == lv0Var.j1 ? (char) 0 : (char) 1;
            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                sparseArrayArr[c10].remove(messageObject.getId());
                if (!messageObject.canDeleteMessage(false, null)) {
                    lv0Var.a1--;
                }
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    AndroidUtilities.hideKeyboard(lv0Var.v1.getParentActivity().getCurrentFocus());
                    sparseArrayArr[0].clear();
                    sparseArrayArr[1].clear();
                    int i11 = 8;
                    lv0Var.l0.setVisibility(lv0Var.a1 == 0 ? 0 : 8);
                    org.telegram.ui.ActionBar.v0 v0Var = lv0Var.u0;
                    if (v0Var != null) {
                        v0Var.setVisibility((lv0Var.getClosestTab() == 8 || lv0Var.getClosestTab() == 13) ? 8 : 0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = lv0Var.v0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = lv0Var.w0;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = lv0Var.t0;
                    if (v0Var4 != null) {
                        if (lv0Var.getClosestTab() != 8 && lv0Var.getClosestTab() != 13) {
                            i11 = 0;
                        }
                        v0Var4.setVisibility(i11);
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
                    lv0Var.b1 = false;
                    AndroidUtilities.runOnUIThread(new yq0(this, i10), 20L);
                } else {
                    lv0Var.A0.a(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
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
