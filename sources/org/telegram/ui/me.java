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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ me(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hk hkVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        sn snVar = this.b;
        switch (i11) {
            case 0:
                snVar.L5 = null;
                if (snVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.ea);
                    boolean isChannel = ChatObject.isChannel(snVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || snVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new re(snVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(snVar, 3));
                    snVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                snVar.b7();
                break;
            case 2:
                sn.n0(snVar);
                break;
            case 3:
                snVar.ta(null, snVar.s8);
                snVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(snVar) && (hkVar = snVar.Y) != null) {
                    hkVar.setFieldFocused(true);
                    snVar.Y.F0();
                    break;
                }
                break;
            case 5:
                snVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new ze(snVar, 6));
                snVar.x7();
                yj yjVar = snVar.X2;
                if (yjVar != null) {
                    yjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                xj xjVar = snVar.Y2;
                if (xjVar != null) {
                    xjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = snVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(snVar.W8() / 2.0f);
                }
                snVar.V6();
                snVar.w7();
                break;
            case 6:
                pd1 a02 = pd1.a0(-snVar.T5, 0L);
                a02.y = snVar;
                snVar.presentFragment(a02);
                break;
            case 7:
                snVar.fc(true);
                break;
            case 8:
                snVar.j1.d(true);
                break;
            case 9:
                snVar.getNotificationCenter().onAnimationFinish(snVar.F9);
                break;
            case 10:
                int childCount = snVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = snVar.x0.getChildAt(i13);
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
                snVar.Bb = true;
                snVar.Bc(true);
                break;
            case 12:
                xk xkVar = snVar.bb;
                if (xkVar != null) {
                    xkVar.requestLayout();
                    break;
                }
                break;
            case 13:
                sn.J0(snVar);
                break;
            case 14:
                snVar.zb(false, true);
                break;
            case 15:
                snVar.resumeDelayedFragmentAnimation();
                pk pkVar = snVar.W9;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                snVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 16:
                TLRPC.UserFull userFull = snVar.a8;
                snVar.mb(userFull != null ? userFull.theme : null);
                break;
            case 17:
                sn.u0(snVar);
                break;
            case 18:
                snVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                snVar.N7 = false;
                snVar.O7 = 0L;
                snVar.P7 = null;
                snVar.Q7 = null;
                snVar.R7 = null;
                snVar.S7 = -1;
                snVar.M7 = false;
                snVar.ad(false);
                snVar.U7 = null;
                break;
            case 19:
                snVar.c7();
                break;
            case 20:
                snVar.Y.F0();
                break;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new ci.e(11));
                fm fmVar = snVar.A0;
                if (fmVar != null) {
                    fmVar.O(true);
                    break;
                }
                break;
            case 22:
                sn snVar2 = this.b;
                int i14 = snVar2.qb;
                if (i14 != 0) {
                    snVar2.j(i14, snVar2.rb, snVar2.sb, snVar2.tb, snVar2.ub, snVar2.vb);
                    snVar2.qb = 0;
                    break;
                }
                break;
            case 23:
                if (!snVar.l3 && snVar.x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.aq aqVar = snVar.v2;
                    if (aqVar == null || aqVar.getTag() == null) {
                        if (snVar.v2 == null) {
                            lm lmVar = snVar.X0;
                            int indexOfChild = lmVar.indexOfChild(snVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(snVar.getParentActivity(), snVar.ea);
                                snVar.v2 = aqVar2;
                                lmVar.addView(aqVar2, indexOfChild + 1, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                snVar.v2.setAlpha(0.0f);
                                snVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = snVar.x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = snVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.aq aqVar3 = snVar.v2;
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
                                    int C = org.telegram.messenger.q.C(6.0f, u1Var.getChecksY(), i17);
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
                                    snVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                sn.G0(snVar);
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new ci.e(10));
                fm fmVar2 = snVar.A0;
                if (fmVar2 != null) {
                    fmVar2.O(false);
                    break;
                }
                break;
            case 26:
                AndroidUtilities.removeFromParent(snVar.K0);
                break;
            case 27:
                hk hkVar2 = snVar.Y;
                if (hkVar2 != null && snVar.ob != 5) {
                    hkVar2.F0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) snVar.a0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = apVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = apVar.e;
                snVar.F1 = !snVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (snVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(snVar.G1, 6000L);
                break;
            default:
                snVar.yc();
                break;
        }
    }
}
