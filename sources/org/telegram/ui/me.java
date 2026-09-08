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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ me(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mk mkVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 0;
        co coVar = this.b;
        switch (i11) {
            case 0:
                coVar.L5 = null;
                if (coVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.ea);
                    boolean isChannel = ChatObject.isChannel(coVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || coVar.e.megagroup) {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ve(coVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(coVar, 1));
                    coVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                coVar.Y6();
                break;
            case 2:
                co.i0(coVar);
                break;
            case 3:
                coVar.oa(null, coVar.s8);
                coVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(coVar) && (mkVar = coVar.Y) != null) {
                    mkVar.setFieldFocused(true);
                    coVar.Y.H0();
                    break;
                }
                break;
            case 5:
                coVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) coVar.x0, (e2.h) new hg(coVar, 1));
                coVar.u7();
                dk dkVar = coVar.X2;
                if (dkVar != null) {
                    dkVar.setTranslationX(coVar.R8() / 2.0f);
                }
                ck ckVar = coVar.Y2;
                if (ckVar != null) {
                    ckVar.setTranslationX(coVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = coVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(coVar.R8() / 2.0f);
                }
                coVar.S6();
                coVar.t7();
                break;
            case 6:
                af1 a02 = af1.a0(-coVar.T5, 0L);
                a02.y = coVar;
                coVar.presentFragment(a02);
                break;
            case 7:
                coVar.getNotificationCenter().onAnimationFinish(coVar.F9);
                break;
            case 8:
                coVar.j1.d(true);
                break;
            case 9:
                int childCount = coVar.x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = coVar.x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.t2();
                        }
                    }
                    i12++;
                }
                break;
            case 10:
                coVar.Bb = true;
                coVar.xc(true);
                break;
            case 11:
                dl dlVar = coVar.bb;
                if (dlVar != null) {
                    dlVar.requestLayout();
                    break;
                }
                break;
            case 12:
                co.E0(coVar);
                break;
            case 13:
                TLRPC.UserFull userFull = coVar.a8;
                coVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                co.o1(coVar);
                break;
            case 15:
                coVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                coVar.N7 = false;
                coVar.O7 = 0L;
                coVar.P7 = null;
                coVar.Q7 = null;
                coVar.R7 = null;
                coVar.S7 = -1;
                coVar.M7 = false;
                coVar.Wc(false);
                coVar.U7 = null;
                break;
            case 16:
                coVar.resumeDelayedFragmentAnimation();
                nk nkVar = coVar.W9;
                AndroidUtilities.cancelRunOnUIThread(nkVar);
                nkVar.run();
                coVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                coVar.vb(false, true);
                break;
            case 18:
                coVar.bc(true);
                break;
            case 19:
                coVar.Z6();
                break;
            case 20:
                coVar.Y.H0();
                break;
            case 21:
                coVar.q7 = null;
                gl glVar = coVar.b3;
                if (glVar != null) {
                    org.telegram.ui.Components.p50 cameraContainer = glVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.p50, Float>) property, 0.0f), ObjectAnimator.ofFloat(coVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(coVar.b3.getPaint(), org.telegram.ui.Components.t6.b, 0), ObjectAnimator.ofFloat(coVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new xi(coVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) coVar.x0, (e2.h) new bi.f(22));
                om omVar = coVar.A0;
                if (omVar != null) {
                    omVar.O(true);
                    break;
                }
                break;
            case 23:
                co coVar2 = this.b;
                int i13 = coVar2.qb;
                if (i13 != 0) {
                    coVar2.F(i13, coVar2.rb, coVar2.tb, coVar2.vb, coVar2.sb, coVar2.ub);
                    coVar2.qb = 0;
                    break;
                }
                break;
            case 24:
                if (!coVar.l3 && coVar.x0 != null && coVar.getParentActivity() != null && coVar.fragmentView != null) {
                    org.telegram.ui.Components.pp ppVar = coVar.v2;
                    if (ppVar == null || ppVar.getTag() == null) {
                        if (coVar.v2 == null) {
                            um umVar = coVar.X0;
                            int indexOfChild = umVar.indexOfChild(coVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.pp ppVar2 = new org.telegram.ui.Components.pp(coVar.getParentActivity(), coVar.ea);
                                coVar.v2 = ppVar2;
                                umVar.addView(ppVar2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                coVar.v2.setAlpha(0.0f);
                                coVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = coVar.x0.getChildCount();
                        for (int i14 = 0; i14 < childCount2; i14++) {
                            View childAt2 = coVar.x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.pp ppVar3 = coVar.v2;
                                ImageView imageView = ppVar3.c;
                                org.telegram.ui.Components.pg pgVar = ppVar3.e;
                                if (pgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(pgVar);
                                    ppVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i15 = iArr[i10];
                                ((View) ppVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                ppVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i16 > AndroidUtilities.dp(10.0f) + ppVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.w1.C(6.0f, t1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - ppVar3.getMeasuredHeight();
                                    ppVar3.f = measuredHeight;
                                    ppVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - ppVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        ppVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        ppVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            ppVar3.setTranslationX(ppVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > ppVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - ppVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        ppVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        ppVar3.setTranslationX(ppVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    ppVar3.setPivotX(left2);
                                    ppVar3.setPivotY(ppVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = ppVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        ppVar3.d = null;
                                    }
                                    ppVar3.setTag(Integer.valueOf(i10));
                                    ppVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    ppVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ppVar3, (Property<org.telegram.ui.Components.pp, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ppVar3, (Property<org.telegram.ui.Components.pp, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ppVar3, (Property<org.telegram.ui.Components.pp, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    ppVar3.d.addListener(new org.telegram.ui.Components.op(ppVar3, i12));
                                    ppVar3.d.setDuration(180L);
                                    ppVar3.d.start();
                                    while (i12 < 2) {
                                        ppVar3.a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.pr.i).setStartDelay((i12 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new fi.v2(ppVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    coVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) coVar.x0, (e2.h) new bi.f(21));
                om omVar2 = coVar.A0;
                if (omVar2 != null) {
                    omVar2.O(false);
                    break;
                }
                break;
            case 26:
                co.v0(coVar);
                break;
            case 27:
                mk mkVar2 = coVar.Y;
                if (mkVar2 != null && coVar.ob != 5) {
                    mkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.po poVar = ((org.telegram.ui.Components.po[]) coVar.a0.b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = poVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = poVar.e;
                coVar.F1 = !coVar.F1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (coVar.F1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(coVar.G1, 6000L);
                break;
            default:
                coVar.uc();
                break;
        }
    }
}
