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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ ne(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ok okVar;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 0;
        eo eoVar = this.b;
        switch (i11) {
            case 0:
                eoVar.L5 = null;
                if (eoVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.ea);
                    boolean isChannel = ChatObject.isChannel(eoVar.e);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    if (!isChannel || eoVar.e.megagroup) {
                        d2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        d2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        d2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        d2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new xe(eoVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xe(eoVar, 1));
                    eoVar.showDialog(d2Var);
                    break;
                }
                break;
            case 1:
                eoVar.Y6();
                break;
            case 2:
                eo.i0(eoVar);
                break;
            case 3:
                eoVar.oa(null, eoVar.s8);
                eoVar.s8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.p2.hasSheets(eoVar) && (okVar = eoVar.Y) != null) {
                    okVar.setFieldFocused(true);
                    eoVar.Y.H0();
                    break;
                }
                break;
            case 5:
                eoVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) eoVar.x0, (e2.h) new ig(eoVar, 1));
                eoVar.u7();
                fk fkVar = eoVar.X2;
                if (fkVar != null) {
                    fkVar.setTranslationX(eoVar.R8() / 2.0f);
                }
                ek ekVar = eoVar.Y2;
                if (ekVar != null) {
                    ekVar.setTranslationX(eoVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(eoVar.R8() / 2.0f);
                }
                eoVar.S6();
                eoVar.t7();
                break;
            case 6:
                ef1 a02 = ef1.a0(-eoVar.T5, 0L);
                a02.y = eoVar;
                eoVar.presentFragment(a02);
                break;
            case 7:
                eoVar.getNotificationCenter().onAnimationFinish(eoVar.F9);
                break;
            case 8:
                eoVar.j1.d(true);
                break;
            case 9:
                int childCount = eoVar.x0.getChildCount();
                while (i12 < childCount) {
                    View childAt = eoVar.x0.getChildAt(i12);
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
                eoVar.Bb = true;
                eoVar.xc(true);
                break;
            case 11:
                fl flVar = eoVar.bb;
                if (flVar != null) {
                    flVar.requestLayout();
                    break;
                }
                break;
            case 12:
                eo.E0(eoVar);
                break;
            case 13:
                TLRPC.UserFull userFull = eoVar.a8;
                eoVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                eo.o1(eoVar);
                break;
            case 15:
                eoVar.L7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                eoVar.N7 = false;
                eoVar.O7 = 0L;
                eoVar.P7 = null;
                eoVar.Q7 = null;
                eoVar.R7 = null;
                eoVar.S7 = -1;
                eoVar.M7 = false;
                eoVar.Wc(false);
                eoVar.U7 = null;
                break;
            case 16:
                eoVar.resumeDelayedFragmentAnimation();
                pk pkVar = eoVar.W9;
                AndroidUtilities.cancelRunOnUIThread(pkVar);
                pkVar.run();
                eoVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                eoVar.vb(false, true);
                break;
            case 18:
                eoVar.bc(true);
                break;
            case 19:
                eoVar.Z6();
                break;
            case 20:
                eoVar.Y.H0();
                break;
            case 21:
                eoVar.q7 = null;
                il ilVar = eoVar.b3;
                if (ilVar != null) {
                    org.telegram.ui.Components.z50 cameraContainer = ilVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.z50, Float>) property, 0.0f), ObjectAnimator.ofFloat(eoVar.b3.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(eoVar.b3.getPaint(), org.telegram.ui.Components.r6.b, 0), ObjectAnimator.ofFloat(eoVar.b3.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new zi(eoVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.x0, (e2.h) new gg.g0(19));
                pm pmVar = eoVar.A0;
                if (pmVar != null) {
                    pmVar.O(true);
                    break;
                }
                break;
            case 23:
                eo eoVar2 = this.b;
                int i13 = eoVar2.qb;
                if (i13 != 0) {
                    eoVar2.E(i13, eoVar2.rb, eoVar2.tb, eoVar2.vb, eoVar2.sb, eoVar2.ub);
                    eoVar2.qb = 0;
                    break;
                }
                break;
            case 24:
                if (!eoVar.l3 && eoVar.x0 != null && eoVar.getParentActivity() != null && eoVar.fragmentView != null) {
                    org.telegram.ui.Components.wp wpVar = eoVar.v2;
                    if (wpVar == null || wpVar.getTag() == null) {
                        if (eoVar.v2 == null) {
                            vm vmVar = eoVar.X0;
                            int indexOfChild = vmVar.indexOfChild(eoVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(eoVar.getParentActivity(), eoVar.ea);
                                eoVar.v2 = wpVar2;
                                vmVar.addView(wpVar2, indexOfChild + 1, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                eoVar.v2.setAlpha(0.0f);
                                eoVar.v2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = eoVar.x0.getChildCount();
                        for (int i14 = 0; i14 < childCount2; i14++) {
                            View childAt2 = eoVar.x0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.wp wpVar3 = eoVar.v2;
                                ImageView imageView = wpVar3.c;
                                org.telegram.ui.Components.rg rgVar = wpVar3.e;
                                if (rgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(rgVar);
                                    wpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i15 = iArr[i10];
                                ((View) wpVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                wpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i16 > AndroidUtilities.dp(10.0f) + wpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.a2.C(6.0f, t1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - wpVar3.getMeasuredHeight();
                                    wpVar3.f = measuredHeight;
                                    wpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - wpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        wpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        wpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            wpVar3.setTranslationX(wpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > wpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - wpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        wpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        wpVar3.setTranslationX(wpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    wpVar3.setPivotX(left2);
                                    wpVar3.setPivotY(wpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = wpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        wpVar3.d = null;
                                    }
                                    wpVar3.setTag(Integer.valueOf(i10));
                                    wpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    wpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wpVar3, (Property<org.telegram.ui.Components.wp, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wpVar3, (Property<org.telegram.ui.Components.wp, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wpVar3, (Property<org.telegram.ui.Components.wp, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i10] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    wpVar3.d.addListener(new org.telegram.ui.Components.vp(wpVar3, i12));
                                    wpVar3.d.setDuration(180L);
                                    wpVar3.d.start();
                                    while (i12 < 2) {
                                        wpVar3.a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.wr.i).setStartDelay((i12 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new di.y2(wpVar3, i12, 6)).start();
                                        i12++;
                                    }
                                    eoVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) eoVar.x0, (e2.h) new gg.g0(18));
                pm pmVar2 = eoVar.A0;
                if (pmVar2 != null) {
                    pmVar2.O(false);
                    break;
                }
                break;
            case 26:
                eo.v0(eoVar);
                break;
            case 27:
                ok okVar2 = eoVar.Y;
                if (okVar2 != null && eoVar.ob != 5) {
                    okVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.vo voVar = ((org.telegram.ui.Components.vo[]) eoVar.a0.b)[0];
                org.telegram.ui.ActionBar.l5 l5Var = voVar.d;
                org.telegram.ui.ActionBar.l5 l5Var2 = voVar.e;
                eoVar.F1 = !eoVar.F1;
                l5Var.setPivotX(0.0f);
                l5Var2.setPivotX(0.0f);
                if (eoVar.F1) {
                    l5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    l5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(eoVar.G1, 6000L);
                break;
            default:
                eoVar.uc();
                break;
        }
    }
}
