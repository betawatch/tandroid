package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ me(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ok okVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        zn znVar = this.b;
        switch (i11) {
            case 0:
                znVar.L5 = null;
                if (znVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ea);
                    boolean isChannel = ChatObject.isChannel(znVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || znVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new re(znVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(znVar, 3));
                    znVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                znVar.b7();
                break;
            case 2:
                zn.n0(znVar);
                break;
            case 3:
                znVar.ta(null, znVar.s8);
                znVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (okVar = znVar.Y) != null) {
                    okVar.setFieldFocused(true);
                    znVar.Y.F0();
                    break;
                }
                break;
            case 5:
                znVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (Utilities.Callback<View>) new cf(znVar, 6));
                znVar.x7();
                fk fkVar = znVar.X2;
                if (fkVar != null) {
                    fkVar.setTranslationX(znVar.W8() / 2.0f);
                }
                ek ekVar = znVar.Y2;
                if (ekVar != null) {
                    ekVar.setTranslationX(znVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.W8() / 2.0f);
                }
                znVar.V6();
                znVar.w7();
                break;
            case 6:
                bf1 a02 = bf1.a0(-znVar.T5, 0L);
                a02.y = znVar;
                znVar.presentFragment(a02);
                break;
            case 7:
                znVar.fc(true);
                break;
            case 8:
                znVar.j1.d(true);
                break;
            case 9:
                znVar.getNotificationCenter().onAnimationFinish(znVar.F9);
                break;
            case 10:
                int childCount = znVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = znVar.x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i13++;
                }
                break;
            case 11:
                znVar.Bb = true;
                znVar.Bc(true);
                break;
            case 12:
                el elVar = znVar.bb;
                if (elVar != null) {
                    elVar.requestLayout();
                    break;
                }
                break;
            case 13:
                zn.J0(znVar);
                break;
            case 14:
                znVar.zb(false, true);
                break;
            case 15:
                znVar.resumeDelayedFragmentAnimation();
                wk wkVar = znVar.W9;
                AndroidUtilities.cancelRunOnUIThread(wkVar);
                wkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 16:
                TLRPC.UserFull userFull = znVar.a8;
                znVar.mb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                zn.u0(znVar);
                break;
            case 18:
                znVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                znVar.N7 = false;
                znVar.O7 = 0L;
                znVar.P7 = null;
                znVar.Q7 = null;
                znVar.R7 = null;
                znVar.S7 = -1;
                znVar.M7 = false;
                znVar.ad(false);
                znVar.U7 = null;
                break;
            case 19:
                znVar.c7();
                break;
            case 20:
                znVar.Y.F0();
                break;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (Utilities.Callback<View>) new ai.i(11));
                mm mmVar = znVar.A0;
                if (mmVar != null) {
                    mmVar.O(true);
                    break;
                }
                break;
            case 22:
                zn znVar2 = this.b;
                int i14 = znVar2.qb;
                if (i14 != 0) {
                    znVar2.F(i14, znVar2.rb, znVar2.tb, znVar2.vb, znVar2.sb, znVar2.ub);
                    znVar2.qb = 0;
                    break;
                }
                break;
            case 23:
                if (!znVar.l3 && znVar.x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.gq gqVar = znVar.v2;
                    if (gqVar == null || gqVar.getTag() == null) {
                        if (znVar.v2 == null) {
                            sm smVar = znVar.X0;
                            int indexOfChild = smVar.indexOfChild(znVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.gq gqVar2 = new org.telegram.ui.Components.gq(znVar.getParentActivity(), znVar.ea);
                                znVar.v2 = gqVar2;
                                smVar.addView(gqVar2, indexOfChild + 1, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                znVar.v2.setAlpha(0.0f);
                                znVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = znVar.x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = znVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.gq gqVar3 = znVar.v2;
                                ImageView imageView = gqVar3.c;
                                org.telegram.ui.Components.rg rgVar = gqVar3.e;
                                if (rgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(rgVar);
                                    gqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) gqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                gqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + gqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.q.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - gqVar3.getMeasuredHeight();
                                    gqVar3.f = measuredHeight;
                                    gqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - gqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        gqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        gqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            gqVar3.setTranslationX(gqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > gqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - gqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        gqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        gqVar3.setTranslationX(gqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    gqVar3.setPivotX(left2);
                                    gqVar3.setPivotY(gqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = gqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        gqVar3.d = null;
                                    }
                                    gqVar3.setTag(Integer.valueOf(i10));
                                    gqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    gqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gqVar3, (Property<org.telegram.ui.Components.gq, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gqVar3, (Property<org.telegram.ui.Components.gq, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gqVar3, (Property<org.telegram.ui.Components.gq, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    gqVar3.d.addListener(new org.telegram.ui.Components.fq(gqVar3, i13));
                                    gqVar3.d.setDuration(180L);
                                    gqVar3.d.start();
                                    while (i13 < 2) {
                                        gqVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.hs.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ei.v2(gqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                zn.G0(znVar);
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (Utilities.Callback<View>) new ai.i(10));
                mm mmVar2 = znVar.A0;
                if (mmVar2 != null) {
                    mmVar2.O(false);
                    break;
                }
                break;
            case 26:
                AndroidUtilities.removeFromParent(znVar.K0);
                break;
            case 27:
                ok okVar2 = znVar.Y;
                if (okVar2 != null && znVar.ob != 5) {
                    okVar2.F0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.gp gpVar = ((org.telegram.ui.Components.gp[]) znVar.a0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = gpVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = gpVar.e;
                znVar.F1 = !znVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (znVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(znVar.G1, 6000L);
                break;
            default:
                znVar.yc();
                break;
        }
    }
}
