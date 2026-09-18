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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        lk lkVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        char c10 = 1;
        zn znVar = this.b;
        switch (i10) {
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
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new qe(znVar, i11));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(znVar, 3));
                    znVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                znVar.Y6();
                break;
            case 2:
                zn.h0(znVar);
                break;
            case 3:
                znVar.oa(null, znVar.s8);
                znVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(znVar) && (lkVar = znVar.Y) != null) {
                    lkVar.setFieldFocused(true);
                    znVar.Y.H0();
                    break;
                }
                break;
            case 5:
                znVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (e2.h) new lf(znVar, 1));
                znVar.u7();
                ck ckVar = znVar.X2;
                if (ckVar != null) {
                    ckVar.setTranslationX(znVar.R8() / 2.0f);
                }
                bk bkVar = znVar.Y2;
                if (bkVar != null) {
                    bkVar.setTranslationX(znVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.R8() / 2.0f);
                }
                znVar.S6();
                znVar.t7();
                break;
            case 6:
                ze1 a02 = ze1.a0(-znVar.T5, 0L);
                a02.y = znVar;
                znVar.presentFragment(a02);
                break;
            case 7:
                znVar.getNotificationCenter().onAnimationFinish(znVar.F9);
                break;
            case 8:
                znVar.j1.d(true);
                break;
            case 9:
                AndroidUtilities.removeFromParent(znVar.K0);
                break;
            case 10:
                int childCount = znVar.x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = znVar.x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i12++;
                }
                break;
            case 11:
                znVar.Ab = true;
                znVar.xc(true);
                break;
            case 12:
                zn.K0(znVar);
                break;
            case 13:
                bl blVar = znVar.ab;
                if (blVar != null) {
                    blVar.requestLayout();
                    break;
                }
                break;
            case 14:
                TLRPC.UserFull userFull = znVar.a8;
                znVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 15:
                zn.f1(znVar);
                break;
            case 16:
                znVar.resumeDelayedFragmentAnimation();
                mk mkVar = znVar.W9;
                AndroidUtilities.cancelRunOnUIThread(mkVar);
                mkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                znVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                znVar.N7 = false;
                znVar.O7 = 0L;
                znVar.P7 = null;
                znVar.Q7 = null;
                znVar.R7 = null;
                znVar.S7 = -1;
                znVar.M7 = false;
                znVar.Wc(false);
                znVar.U7 = null;
                break;
            case 18:
                znVar.vb(false, true);
                break;
            case 19:
                znVar.bc(true);
                break;
            case 20:
                znVar.Z6();
                break;
            case 21:
                znVar.Y.H0();
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (e2.h) new ai.i(21));
                lm lmVar = znVar.A0;
                if (lmVar != null) {
                    lmVar.O(true);
                    break;
                }
                break;
            case 23:
                zn znVar2 = this.b;
                int i13 = znVar2.pb;
                if (i13 != 0) {
                    znVar2.F(i13, znVar2.qb, znVar2.sb, znVar2.ub, znVar2.rb, znVar2.tb);
                    znVar2.pb = 0;
                    break;
                }
                break;
            case 24:
                if (!znVar.l3 && znVar.x0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.qp qpVar = znVar.v2;
                    if (qpVar == null || qpVar.getTag() == null) {
                        if (znVar.v2 == null) {
                            rm rmVar = znVar.X0;
                            int indexOfChild = rmVar.indexOfChild(znVar.S);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(znVar.getParentActivity(), znVar.ea);
                                znVar.v2 = qpVar2;
                                rmVar.addView(qpVar2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                znVar.v2.setAlpha(0.0f);
                                znVar.v2.setVisibility(4);
                            }
                        }
                        int childCount2 = znVar.x0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = znVar.x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.qp qpVar3 = znVar.v2;
                                ImageView imageView = qpVar3.c;
                                org.telegram.ui.Components.og ogVar = qpVar3.e;
                                if (ogVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ogVar);
                                    qpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c10];
                                ((View) qpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) u1Var.getParent();
                                qpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i16 > AndroidUtilities.dp(10.0f) + qpVar3.getMeasuredHeight()) {
                                    int D = org.telegram.messenger.q.D(6.0f, u1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = D - qpVar3.getMeasuredHeight();
                                    qpVar3.f = measuredHeight;
                                    qpVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - qpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        qpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        qpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            qpVar3.setTranslationX(qpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > qpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - qpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        qpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        qpVar3.setTranslationX(qpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    qpVar3.setPivotX(left2);
                                    qpVar3.setPivotY(qpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = qpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        qpVar3.d = null;
                                    }
                                    qpVar3.setTag(1);
                                    qpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qpVar3.d = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(qpVar3, (Property<org.telegram.ui.Components.qp, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(qpVar3, (Property<org.telegram.ui.Components.qp, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(qpVar3, (Property<org.telegram.ui.Components.qp, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    qpVar3.d.addListener(new org.telegram.ui.Components.pp(qpVar3, i12));
                                    qpVar3.d.setDuration(180L);
                                    qpVar3.d.start();
                                    while (i12 < 2) {
                                        qpVar3.a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.qr.i).setStartDelay((i12 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ei.v2(qpVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i14++;
                            c10 = 1;
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) znVar.x0, (e2.h) new ai.i(22));
                lm lmVar2 = znVar.A0;
                if (lmVar2 != null) {
                    lmVar2.O(false);
                    break;
                }
                break;
            case 26:
                zn.y0(znVar);
                break;
            case 27:
                lk lkVar2 = znVar.Y;
                if (lkVar2 != null && znVar.nb != 5) {
                    lkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.qo qoVar = ((org.telegram.ui.Components.qo[]) znVar.a0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = qoVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = qoVar.e;
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
                znVar.uc();
                break;
        }
    }
}
