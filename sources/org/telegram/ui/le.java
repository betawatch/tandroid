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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 6;
        char c3 = 1;
        int i12 = 0;
        xn xnVar = this.b;
        switch (i10) {
            case 0:
                xnVar.I5 = null;
                if (xnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ba);
                    boolean isChannel = ChatObject.isChannel(xnVar.e);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    if (!isChannel || xnVar.e.megagroup) {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekGroupText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekChannelText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new te(xnVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new te(xnVar, 1));
                    xnVar.showDialog(d2Var);
                    break;
                }
                break;
            case 1:
                xnVar.Y6();
                break;
            case 2:
                xn.i0(xnVar);
                break;
            case 3:
                xnVar.oa(null, xnVar.p8);
                xnVar.p8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.p2.hasSheets(xnVar) && (jkVar = xnVar.V) != null) {
                    jkVar.setFieldFocused(true);
                    xnVar.V.H0();
                    break;
                }
                break;
            case 5:
                xnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) xnVar.u0, (h5.d) new bg(xnVar, 1));
                xnVar.u7();
                zj zjVar = xnVar.U2;
                if (zjVar != null) {
                    zjVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                yj yjVar = xnVar.V2;
                if (yjVar != null) {
                    yjVar.setTranslationX(xnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = xnVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(xnVar.R8() / 2.0f);
                }
                xnVar.S6();
                xnVar.t7();
                break;
            case 6:
                fe1 a02 = fe1.a0(-xnVar.Q5, 0L);
                a02.y = xnVar;
                xnVar.presentFragment(a02);
                break;
            case 7:
                xnVar.getNotificationCenter().onAnimationFinish(xnVar.C9);
                break;
            case 8:
                xnVar.g1.d(true);
                break;
            case 9:
                int childCount = xnVar.u0.getChildCount();
                while (i12 < childCount) {
                    View childAt = xnVar.u0.getChildAt(i12);
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
                xnVar.yb = true;
                xnVar.xc(true);
                break;
            case 11:
                al alVar = xnVar.Ya;
                if (alVar != null) {
                    alVar.requestLayout();
                    break;
                }
                break;
            case 12:
                xn.E0(xnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = xnVar.X7;
                xnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                xn.o1(xnVar);
                break;
            case 15:
                xnVar.I7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                xnVar.K7 = false;
                xnVar.L7 = 0L;
                xnVar.M7 = null;
                xnVar.N7 = null;
                xnVar.O7 = null;
                xnVar.P7 = -1;
                xnVar.J7 = false;
                xnVar.Wc(false);
                xnVar.R7 = null;
                break;
            case 16:
                xnVar.resumeDelayedFragmentAnimation();
                kk kkVar = xnVar.T9;
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
                xnVar.V.H0();
                break;
            case 21:
                xnVar.n7 = null;
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    org.telegram.ui.Components.r50 cameraContainer = dlVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.r50, Float>) property, 0.0f), ObjectAnimator.ofFloat(xnVar.Y2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(xnVar.Y2.getPaint(), org.telegram.ui.Components.n6.b, 0), ObjectAnimator.ofFloat(xnVar.Y2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ti(xnVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.u0, (h5.d) new nh.e(7));
                jm jmVar = xnVar.x0;
                if (jmVar != null) {
                    jmVar.O(true);
                    break;
                }
                break;
            case 23:
                xn xnVar2 = this.b;
                int i13 = xnVar2.nb;
                if (i13 != 0) {
                    xnVar2.j(i13, xnVar2.ob, xnVar2.pb, xnVar2.qb, xnVar2.rb, xnVar2.sb);
                    xnVar2.nb = 0;
                    break;
                }
                break;
            case 24:
                if (!xnVar.i3 && xnVar.u0 != null && xnVar.getParentActivity() != null && xnVar.fragmentView != null) {
                    org.telegram.ui.Components.op opVar = xnVar.s2;
                    if (opVar == null || opVar.getTag() == null) {
                        if (xnVar.s2 == null) {
                            pm pmVar = xnVar.U0;
                            int indexOfChild = pmVar.indexOfChild(xnVar.P);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.op opVar2 = new org.telegram.ui.Components.op(xnVar.getParentActivity(), xnVar.ba);
                                xnVar.s2 = opVar2;
                                pmVar.addView(opVar2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                xnVar.s2.setAlpha(0.0f);
                                xnVar.s2.setVisibility(4);
                            }
                        }
                        int childCount2 = xnVar.u0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = xnVar.u0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.op opVar3 = xnVar.s2;
                                ImageView imageView = opVar3.c;
                                org.telegram.ui.Components.fg fgVar = opVar3.e;
                                if (fgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(fgVar);
                                    opVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c3];
                                ((View) opVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) t1Var.getParent();
                                opVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i16 > AndroidUtilities.dp(10.0f) + opVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.y3.C(6.0f, t1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - opVar3.getMeasuredHeight();
                                    opVar3.f = measuredHeight;
                                    opVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - opVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        opVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        opVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            opVar3.setTranslationX(opVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > opVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - opVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        opVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        opVar3.setTranslationX(opVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    opVar3.setPivotX(left2);
                                    opVar3.setPivotY(opVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = opVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        opVar3.d = null;
                                    }
                                    opVar3.setTag(1);
                                    opVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    opVar3.d = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(opVar3, (Property<org.telegram.ui.Components.op, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(opVar3, (Property<org.telegram.ui.Components.op, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(opVar3, (Property<org.telegram.ui.Components.op, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    opVar3.d.addListener(new org.telegram.ui.Components.np(opVar3, i12));
                                    opVar3.d.setDuration(180L);
                                    opVar3.d.start();
                                    while (i12 < 2) {
                                        opVar3.a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.nr.i).setStartDelay((i12 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new org.telegram.ui.Cells.b4(opVar3, i12, 3)).start();
                                        i12++;
                                    }
                                    xnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i14++;
                            c3 = 1;
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) xnVar.u0, (h5.d) new nh.e(i11));
                jm jmVar2 = xnVar.x0;
                if (jmVar2 != null) {
                    jmVar2.O(false);
                    break;
                }
                break;
            case 26:
                xn.w0(xnVar);
                break;
            case 27:
                jk jkVar2 = xnVar.V;
                if (jkVar2 != null && xnVar.lb != 5) {
                    jkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.mo moVar = ((org.telegram.ui.Components.mo[]) xnVar.X.b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = moVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = moVar.e;
                xnVar.C1 = !xnVar.C1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (xnVar.C1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(xnVar.D1, 6000L);
                break;
            default:
                xnVar.uc();
                break;
        }
    }
}
