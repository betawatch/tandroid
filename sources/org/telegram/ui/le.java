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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ le(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 5;
        int i13 = 0;
        xn xnVar = this.b;
        switch (i11) {
            case 0:
                xnVar.L5 = null;
                if (xnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ea);
                    boolean isChannel = ChatObject.isChannel(xnVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || xnVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ue(xnVar, i13));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ue(xnVar, 1));
                    xnVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                xnVar.Y6();
                break;
            case 2:
                xn.j0(xnVar);
                break;
            case 3:
                xnVar.oa(null, xnVar.s8);
                xnVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(xnVar) && (jkVar = xnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    xnVar.Y.I0();
                    break;
                }
                break;
            case 5:
                xnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) xnVar.x0, (Utilities.Callback<View>) new af(xnVar, i12));
                xnVar.u7();
                ak akVar = xnVar.X2;
                if (akVar != null) {
                    akVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                zj zjVar = xnVar.Y2;
                if (zjVar != null) {
                    zjVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(xnVar.R8() / 2.0f);
                }
                xnVar.S6();
                xnVar.t7();
                break;
            case 6:
                se1 a02 = se1.a0(-xnVar.T5, 0L);
                a02.y = xnVar;
                xnVar.presentFragment(a02);
                break;
            case 7:
                xnVar.getNotificationCenter().onAnimationFinish(xnVar.F9);
                break;
            case 8:
                xnVar.j1.d(true);
                break;
            case 9:
                int childCount = xnVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = xnVar.x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.t2();
                        }
                    }
                    i13++;
                }
                break;
            case 10:
                xnVar.Ab = true;
                xnVar.xc(true);
                break;
            case 11:
                al alVar = xnVar.ab;
                if (alVar != null) {
                    alVar.requestLayout();
                    break;
                }
                break;
            case 12:
                xn.E0(xnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = xnVar.a8;
                xnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                xn.o1(xnVar);
                break;
            case 15:
                xnVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                xnVar.N7 = false;
                xnVar.O7 = 0L;
                xnVar.P7 = null;
                xnVar.Q7 = null;
                xnVar.R7 = null;
                xnVar.S7 = -1;
                xnVar.M7 = false;
                xnVar.Wc(false);
                xnVar.U7 = null;
                break;
            case 16:
                xnVar.resumeDelayedFragmentAnimation();
                kk kkVar = xnVar.W9;
                AndroidUtilities.cancelRunOnUIThread(kkVar);
                kkVar.run();
                xnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                xnVar.vb(false, true);
                break;
            case 18:
                xnVar.bc(true);
                break;
            case 19:
                xnVar.Z6();
                break;
            case 20:
                xnVar.Y.I0();
                break;
            case 21:
                xnVar.q7 = null;
                dl dlVar = xnVar.b3;
                if (dlVar != null) {
                    org.telegram.ui.Components.q50 cameraContainer = dlVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.q50, Float>) property, 0.0f), ObjectAnimator.ofFloat(xnVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(xnVar.b3.getPaint(), org.telegram.ui.Components.s6.b, 0), ObjectAnimator.ofFloat(xnVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ui(xnVar, i13));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.x0, (Utilities.Callback<View>) new ai.i(11));
                km kmVar = xnVar.A0;
                if (kmVar != null) {
                    kmVar.O(true);
                    break;
                }
                break;
            case 23:
                xn xnVar2 = this.b;
                int i14 = xnVar2.pb;
                if (i14 != 0) {
                    xnVar2.F(i14, xnVar2.qb, xnVar2.sb, xnVar2.ub, xnVar2.rb, xnVar2.tb);
                    xnVar2.pb = 0;
                    break;
                }
                break;
            case 24:
                if (!xnVar.l3 && xnVar.x0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = xnVar.v2;
                    if (rpVar == null || rpVar.getTag() == null) {
                        if (xnVar.v2 == null) {
                            qm qmVar = xnVar.X0;
                            int indexOfChild = qmVar.indexOfChild(xnVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(xnVar.getParentActivity(), xnVar.ea);
                                xnVar.v2 = rpVar2;
                                qmVar.addView(rpVar2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                xnVar.v2.setAlpha(0.0f);
                                xnVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = xnVar.x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = xnVar.x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.rp rpVar3 = xnVar.v2;
                                ImageView imageView = rpVar3.c;
                                org.telegram.ui.Components.og ogVar = rpVar3.e;
                                if (ogVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ogVar);
                                    rpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                rpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + rpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.z0.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - rpVar3.getMeasuredHeight();
                                    rpVar3.f = measuredHeight;
                                    rpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - rpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        rpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        rpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
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
                                    AnimatorSet animatorSet2 = rpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        rpVar3.d = null;
                                    }
                                    rpVar3.setTag(Integer.valueOf(i10));
                                    rpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    rpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(rpVar3, (Property<org.telegram.ui.Components.rp, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    rpVar3.d.addListener(new org.telegram.ui.Components.qp(rpVar3, i13));
                                    rpVar3.d.setDuration(180L);
                                    rpVar3.d.start();
                                    while (i13 < 2) {
                                        rpVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.rr.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new ei.v2(rpVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    xnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.x0, (Utilities.Callback<View>) new ai.i(10));
                km kmVar2 = xnVar.A0;
                if (kmVar2 != null) {
                    kmVar2.O(false);
                    break;
                }
                break;
            case 26:
                xn.w0(xnVar);
                break;
            case 27:
                jk jkVar2 = xnVar.Y;
                if (jkVar2 != null && xnVar.nb != 5) {
                    jkVar2.I0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ro roVar = ((org.telegram.ui.Components.ro[]) xnVar.a0.b)[0];
                org.telegram.ui.ActionBar.i5 i5Var = roVar.d;
                org.telegram.ui.ActionBar.i5 i5Var2 = roVar.e;
                xnVar.F1 = !xnVar.F1;
                i5Var.setPivotX(0.0f);
                i5Var2.setPivotX(0.0f);
                if (xnVar.F1) {
                    i5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    i5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    i5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    i5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(xnVar.G1, 6000L);
                break;
            default:
                xnVar.uc();
                break;
        }
    }
}
