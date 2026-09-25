package org.telegram.ui;

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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ le(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 5;
        int i12 = 2;
        char c10 = 1;
        int i13 = 0;
        wn wnVar = this.b;
        switch (i10) {
            case 0:
                wnVar.L5 = null;
                if (wnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ea);
                    boolean isChannel = ChatObject.isChannel(wnVar.e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    if (!isChannel || wnVar.e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(wnVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(wnVar, 3));
                    wnVar.showDialog(a2Var);
                    break;
                }
                break;
            case 1:
                wnVar.Y6();
                break;
            case 2:
                wn.g0(wnVar);
                break;
            case 3:
                wnVar.oa(null, wnVar.s8);
                wnVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(wnVar) && (jkVar = wnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    wnVar.Y.H0();
                    break;
                }
                break;
            case 5:
                wnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new af(wnVar, i11));
                wnVar.u7();
                ak akVar = wnVar.X2;
                if (akVar != null) {
                    akVar.setTranslationX(wnVar.R8() / 2.0f);
                }
                zj zjVar = wnVar.Y2;
                if (zjVar != null) {
                    zjVar.setTranslationX(wnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = wnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wnVar.R8() / 2.0f);
                }
                wnVar.S6();
                wnVar.t7();
                break;
            case 6:
                se1 a02 = se1.a0(-wnVar.T5, 0L);
                a02.y = wnVar;
                wnVar.presentFragment(a02);
                break;
            case 7:
                wnVar.getNotificationCenter().onAnimationFinish(wnVar.F9);
                break;
            case 8:
                wnVar.j1.d(true);
                break;
            case 9:
                AndroidUtilities.removeFromParent(wnVar.K0);
                break;
            case 10:
                int childCount = wnVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = wnVar.x0.getChildAt(i13);
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
                wnVar.Ab = true;
                wnVar.xc(true);
                break;
            case 12:
                wn.J0(wnVar);
                break;
            case 13:
                al alVar = wnVar.ab;
                if (alVar != null) {
                    alVar.requestLayout();
                    break;
                }
                break;
            case 14:
                TLRPC.UserFull userFull = wnVar.a8;
                wnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 15:
                wn.f1(wnVar);
                break;
            case 16:
                wnVar.resumeDelayedFragmentAnimation();
                kk kkVar = wnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                wnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                wnVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                wnVar.N7 = false;
                wnVar.O7 = 0L;
                wnVar.P7 = null;
                wnVar.Q7 = null;
                wnVar.R7 = null;
                wnVar.S7 = -1;
                wnVar.M7 = false;
                wnVar.Wc(false);
                wnVar.U7 = null;
                break;
            case 18:
                wnVar.vb(false, true);
                break;
            case 19:
                wnVar.bc(true);
                break;
            case 20:
                wnVar.Z6();
                break;
            case 21:
                wnVar.Y.H0();
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new ai.i(10));
                jm jmVar = wnVar.A0;
                if (jmVar != null) {
                    jmVar.O(true);
                    break;
                }
                break;
            case 23:
                wn wnVar2 = this.b;
                int i14 = wnVar2.pb;
                if (i14 != 0) {
                    wnVar2.F(i14, wnVar2.qb, wnVar2.sb, wnVar2.ub, wnVar2.rb, wnVar2.tb);
                    wnVar2.pb = 0;
                    break;
                }
                break;
            case 24:
                if (!wnVar.l3 && wnVar.x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = wnVar.v2;
                    if (rpVar == null || rpVar.getTag() == null) {
                        if (wnVar.v2 == null) {
                            pm pmVar = wnVar.X0;
                            int indexOfChild = pmVar.indexOfChild(wnVar.S);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(wnVar.getParentActivity(), wnVar.ea);
                                wnVar.v2 = rpVar2;
                                pmVar.addView(rpVar2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                wnVar.v2.setAlpha(0.0f);
                                wnVar.v2.setVisibility(4);
                            }
                        }
                        int childCount2 = wnVar.x0.getChildCount();
                        int i15 = 0;
                        while (i15 < childCount2) {
                            View childAt2 = wnVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.rp rpVar3 = wnVar.v2;
                                ImageView imageView = rpVar3.c;
                                org.telegram.ui.Components.pg pgVar = rpVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    rpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[c10];
                                ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[1];
                                View view = (View) u1Var.getParent();
                                rpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + rpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.f0.C(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - rpVar3.getMeasuredHeight();
                                    rpVar3.f = measuredHeight;
                                    rpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - rpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        rpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        rpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            rpVar3.setTranslationX(rpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > rpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - rpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        rpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        rpVar3.setTranslationX(rpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    rpVar3.setPivotX(left2);
                                    rpVar3.setPivotY(rpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = rpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        rpVar3.d = null;
                                    }
                                    rpVar3.setTag(1);
                                    rpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    rpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    rpVar3.d.addListener(new org.telegram.ui.Components.qp(rpVar3, i13));
                                    rpVar3.d.setDuration(180L);
                                    rpVar3.d.start();
                                    while (i13 < 2) {
                                        rpVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.rr.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ei.v2(rpVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    wnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i15++;
                            c10 = 1;
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new ai.i(11));
                jm jmVar2 = wnVar.A0;
                if (jmVar2 != null) {
                    jmVar2.O(false);
                    break;
                }
                break;
            case 26:
                wn.x0(wnVar);
                break;
            case 27:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.nb != 5) {
                    jkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ro roVar = ((org.telegram.ui.Components.ro[]) wnVar.a0.b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = roVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = roVar.e;
                wnVar.F1 = !wnVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (wnVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(wnVar.G1, 6000L);
                break;
            default:
                wnVar.uc();
                break;
        }
    }
}
