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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ke(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk fkVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        qn qnVar = this.b;
        switch (i11) {
            case 0:
                qnVar.L5 = null;
                if (qnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.ea);
                    boolean isChannel = ChatObject.isChannel(qnVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || qnVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(qnVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(qnVar, 3));
                    qnVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                qnVar.b7();
                break;
            case 2:
                qn.n0(qnVar);
                break;
            case 3:
                qnVar.ta(null, qnVar.s8);
                qnVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(qnVar) && (fkVar = qnVar.Y) != null) {
                    fkVar.setFieldFocused(true);
                    qnVar.Y.F0();
                    break;
                }
                break;
            case 5:
                qnVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) qnVar.x0, (Utilities.Callback<View>) new xe(qnVar, 6));
                qnVar.x7();
                wj wjVar = qnVar.X2;
                if (wjVar != null) {
                    wjVar.setTranslationX(qnVar.W8() / 2.0f);
                }
                vj vjVar = qnVar.Y2;
                if (vjVar != null) {
                    vjVar.setTranslationX(qnVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = qnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(qnVar.W8() / 2.0f);
                }
                qnVar.V6();
                qnVar.w7();
                break;
            case 6:
                nd1 a02 = nd1.a0(-qnVar.T5, 0L);
                a02.y = qnVar;
                qnVar.presentFragment(a02);
                break;
            case 7:
                qnVar.fc(true);
                break;
            case 8:
                qnVar.j1.d(true);
                break;
            case 9:
                qnVar.getNotificationCenter().onAnimationFinish(qnVar.F9);
                break;
            case 10:
                int childCount = qnVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = qnVar.x0.getChildAt(i13);
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
                qnVar.Bb = true;
                qnVar.Bc(true);
                break;
            case 12:
                vk vkVar = qnVar.bb;
                if (vkVar != null) {
                    vkVar.requestLayout();
                    break;
                }
                break;
            case 13:
                qn.J0(qnVar);
                break;
            case 14:
                qnVar.zb(false, true);
                break;
            case 15:
                qnVar.resumeDelayedFragmentAnimation();
                nk nkVar = qnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(nkVar);
                nkVar.run();
                qnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 16:
                TLRPC.UserFull userFull = qnVar.a8;
                qnVar.mb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                qn.u0(qnVar);
                break;
            case 18:
                qnVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                qnVar.N7 = false;
                qnVar.O7 = 0L;
                qnVar.P7 = null;
                qnVar.Q7 = null;
                qnVar.R7 = null;
                qnVar.S7 = -1;
                qnVar.M7 = false;
                qnVar.ad(false);
                qnVar.U7 = null;
                break;
            case 19:
                qnVar.c7();
                break;
            case 20:
                qnVar.Y.F0();
                break;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.x0, (Utilities.Callback<View>) new ci.e(11));
                dm dmVar = qnVar.A0;
                if (dmVar != null) {
                    dmVar.O(true);
                    break;
                }
                break;
            case 22:
                qn qnVar2 = this.b;
                int i14 = qnVar2.qb;
                if (i14 != 0) {
                    qnVar2.j(i14, qnVar2.rb, qnVar2.sb, qnVar2.tb, qnVar2.ub, qnVar2.vb);
                    qnVar2.qb = 0;
                    break;
                }
                break;
            case 23:
                if (!qnVar.l3 && qnVar.x0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.aq aqVar = qnVar.v2;
                    if (aqVar == null || aqVar.getTag() == null) {
                        if (qnVar.v2 == null) {
                            jm jmVar = qnVar.X0;
                            int indexOfChild = jmVar.indexOfChild(qnVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(qnVar.getParentActivity(), qnVar.ea);
                                qnVar.v2 = aqVar2;
                                jmVar.addView(aqVar2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                qnVar.v2.setAlpha(0.0f);
                                qnVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = qnVar.x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = qnVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.aq aqVar3 = qnVar.v2;
                                ImageView imageView = aqVar3.c;
                                org.telegram.ui.Components.pg pgVar = aqVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    aqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) aqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                aqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + aqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.g0.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - aqVar3.getMeasuredHeight();
                                    aqVar3.f = measuredHeight;
                                    aqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - aqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        aqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        aqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            aqVar3.setTranslationX(aqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > aqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - aqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        aqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        aqVar3.setTranslationX(aqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    aqVar3.setPivotX(left2);
                                    aqVar3.setPivotY(aqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = aqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        aqVar3.d = null;
                                    }
                                    aqVar3.setTag(Integer.valueOf(i10));
                                    aqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    aqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aqVar3, (Property<org.telegram.ui.Components.aq, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aqVar3, (Property<org.telegram.ui.Components.aq, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar3, (Property<org.telegram.ui.Components.aq, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    aqVar3.d.addListener(new org.telegram.ui.Components.zp(aqVar3, i13));
                                    aqVar3.d.setDuration(180L);
                                    aqVar3.d.start();
                                    while (i13 < 2) {
                                        aqVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.bs.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new gi.p2(aqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    qnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                qn.G0(qnVar);
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.x0, (Utilities.Callback<View>) new ci.e(10));
                dm dmVar2 = qnVar.A0;
                if (dmVar2 != null) {
                    dmVar2.O(false);
                    break;
                }
                break;
            case 26:
                AndroidUtilities.removeFromParent(qnVar.K0);
                break;
            case 27:
                fk fkVar2 = qnVar.Y;
                if (fkVar2 != null && qnVar.ob != 5) {
                    fkVar2.F0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) qnVar.a0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = apVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = apVar.e;
                qnVar.F1 = !qnVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (qnVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(qnVar.G1, 6000L);
                break;
            default:
                qnVar.yc();
                break;
        }
    }
}
