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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ ge(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ck ckVar;
        int i10;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 5;
        int i14 = 0;
        rn rnVar = this.b;
        switch (i11) {
            case 0:
                rnVar.H5 = null;
                if (rnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.aa);
                    boolean isChannel = ChatObject.isChannel(rnVar.e);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (!isChannel || rnVar.e.megagroup) {
                        b2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        b2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        b2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        b2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new oe(rnVar, i14));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new oe(rnVar, 1));
                    rnVar.showDialog(b2Var);
                    break;
                }
                break;
            case 1:
                rnVar.Y6();
                break;
            case 2:
                rn.i0(rnVar);
                break;
            case 3:
                rnVar.oa(null, rnVar.o8);
                rnVar.o8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.n2.hasSheets(rnVar) && (ckVar = rnVar.U) != null) {
                    ckVar.setFieldFocused(true);
                    rnVar.U.H0();
                    break;
                }
                break;
            case 5:
                rnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) rnVar.t0, (d5.d) new xf(rnVar, 1));
                rnVar.u7();
                tj tjVar = rnVar.T2;
                if (tjVar != null) {
                    tjVar.setTranslationX(rnVar.R8() / 2.0f);
                }
                sj sjVar = rnVar.U2;
                if (sjVar != null) {
                    sjVar.setTranslationX(rnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = rnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(rnVar.R8() / 2.0f);
                }
                rnVar.S6();
                rnVar.t7();
                break;
            case 6:
                sd1 a02 = sd1.a0(-rnVar.P5, 0L);
                a02.y = rnVar;
                rnVar.presentFragment(a02);
                break;
            case 7:
                rnVar.getNotificationCenter().onAnimationFinish(rnVar.B9);
                break;
            case 8:
                rnVar.f1.d(true);
                break;
            case 9:
                int childCount = rnVar.t0.getChildCount();
                while (i14 < childCount) {
                    View childAt = rnVar.t0.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.s2();
                        }
                    }
                    i14++;
                }
                break;
            case 10:
                rnVar.xb = true;
                rnVar.xc(true);
                break;
            case 11:
                tk tkVar = rnVar.Xa;
                if (tkVar != null) {
                    tkVar.requestLayout();
                    break;
                }
                break;
            case 12:
                rn.E0(rnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = rnVar.W7;
                rnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                rn.o1(rnVar);
                break;
            case 15:
                rnVar.H7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                rnVar.J7 = false;
                rnVar.K7 = 0L;
                rnVar.L7 = null;
                rnVar.M7 = null;
                rnVar.N7 = null;
                rnVar.O7 = -1;
                rnVar.I7 = false;
                rnVar.Wc(false);
                rnVar.Q7 = null;
                break;
            case 16:
                rnVar.resumeDelayedFragmentAnimation();
                dk dkVar = rnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(dkVar);
                dkVar.run();
                rnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                rnVar.vb(false, true);
                break;
            case 18:
                rnVar.bc(true);
                break;
            case 19:
                rnVar.Z6();
                break;
            case 20:
                rnVar.U.H0();
                break;
            case 21:
                rnVar.m7 = null;
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    org.telegram.ui.Components.d50 cameraContainer = wkVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.d50, Float>) property, 0.0f), ObjectAnimator.ofFloat(rnVar.X2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(rnVar.X2.getPaint(), org.telegram.ui.Components.m6.b, 0), ObjectAnimator.ofFloat(rnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new ni(rnVar, i14));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) rnVar.t0, (d5.d) new j4.w0(i12));
                dm dmVar = rnVar.w0;
                if (dmVar != null) {
                    dmVar.O(true);
                    break;
                }
                break;
            case 23:
                rn rnVar2 = this.b;
                int i15 = rnVar2.mb;
                if (i15 != 0) {
                    rnVar2.j(i15, rnVar2.nb, rnVar2.ob, rnVar2.pb, rnVar2.qb, rnVar2.rb);
                    rnVar2.mb = 0;
                    break;
                }
                break;
            case 24:
                if (!rnVar.h3 && rnVar.t0 != null && rnVar.getParentActivity() != null && rnVar.fragmentView != null) {
                    org.telegram.ui.Components.ep epVar = rnVar.r2;
                    if (epVar == null || epVar.getTag() == null) {
                        if (rnVar.r2 == null) {
                            jm jmVar = rnVar.T0;
                            int indexOfChild = jmVar.indexOfChild(rnVar.O);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.ep epVar2 = new org.telegram.ui.Components.ep(rnVar.getParentActivity(), rnVar.aa);
                                rnVar.r2 = epVar2;
                                jmVar.addView(epVar2, indexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                rnVar.r2.setAlpha(0.0f);
                                rnVar.r2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = rnVar.t0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = rnVar.t0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.ep epVar3 = rnVar.r2;
                                ImageView imageView = epVar3.c;
                                org.telegram.ui.Components.bg bgVar = epVar3.e;
                                if (bgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(bgVar);
                                    epVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) epVar3.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) s1Var.getParent();
                                epVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i18 > AndroidUtilities.dp(10.0f) + epVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.y1.C(6.0f, s1Var.getChecksY(), i18);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - epVar3.getMeasuredHeight();
                                    epVar3.f = measuredHeight;
                                    epVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - epVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        epVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        epVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            epVar3.setTranslationX(epVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > epVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - epVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        epVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        epVar3.setTranslationX(epVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    epVar3.setPivotX(left2);
                                    epVar3.setPivotY(epVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = epVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        epVar3.d = null;
                                    }
                                    epVar3.setTag(Integer.valueOf(i10));
                                    epVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    epVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(epVar3, (Property<org.telegram.ui.Components.ep, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    epVar3.d.addListener(new org.telegram.ui.Components.dp(epVar3, i14));
                                    epVar3.d.setDuration(180L);
                                    epVar3.d.start();
                                    while (i14 < 2) {
                                        epVar3.a[i14].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.er.i).setStartDelay((i14 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new nh.n2(epVar3, i14, 5)).start();
                                        i14++;
                                    }
                                    rnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) rnVar.t0, (d5.d) new j4.w0(i13));
                dm dmVar2 = rnVar.w0;
                if (dmVar2 != null) {
                    dmVar2.O(false);
                    break;
                }
                break;
            case 26:
                rn.w0(rnVar);
                break;
            case 27:
                ck ckVar2 = rnVar.U;
                if (ckVar2 != null && rnVar.kb != 5) {
                    ckVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.eo eoVar = ((org.telegram.ui.Components.eo[]) rnVar.W.b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = eoVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = eoVar.e;
                rnVar.B1 = !rnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (rnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(rnVar.C1, 6000L);
                break;
            default:
                rnVar.uc();
                break;
        }
    }
}
