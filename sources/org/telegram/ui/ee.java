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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ ee(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk dkVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 5;
        char c3 = 1;
        int i13 = 0;
        tn tnVar = this.b;
        switch (i10) {
            case 0:
                tnVar.H5 = null;
                if (tnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.aa);
                    boolean isChannel = ChatObject.isChannel(tnVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    if (!isChannel || tnVar.e.megagroup) {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new me(tnVar, i13));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new me(tnVar, 1));
                    tnVar.showDialog(c2Var);
                    break;
                }
                break;
            case 1:
                tnVar.Y6();
                break;
            case 2:
                tn.i0(tnVar);
                break;
            case 3:
                tnVar.oa(null, tnVar.o8);
                tnVar.o8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(tnVar) && (dkVar = tnVar.U) != null) {
                    dkVar.setFieldFocused(true);
                    tnVar.U.H0();
                    break;
                }
                break;
            case 5:
                tnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) tnVar.t0, (f5.d) new uf(tnVar, 1));
                tnVar.u7();
                uj ujVar = tnVar.T2;
                if (ujVar != null) {
                    ujVar.setTranslationX(tnVar.R8() / 2.0f);
                }
                tj tjVar = tnVar.U2;
                if (tjVar != null) {
                    tjVar.setTranslationX(tnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = tnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(tnVar.R8() / 2.0f);
                }
                tnVar.S6();
                tnVar.t7();
                break;
            case 6:
                td1 a02 = td1.a0(-tnVar.P5, 0L);
                a02.y = tnVar;
                tnVar.presentFragment(a02);
                break;
            case 7:
                tnVar.getNotificationCenter().onAnimationFinish(tnVar.B9);
                break;
            case 8:
                tnVar.f1.d(true);
                break;
            case 9:
                int childCount = tnVar.t0.getChildCount();
                while (i13 < childCount) {
                    View childAt = tnVar.t0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i13++;
                }
                break;
            case 10:
                tnVar.xb = true;
                tnVar.xc(true);
                break;
            case 11:
                uk ukVar = tnVar.Xa;
                if (ukVar != null) {
                    ukVar.requestLayout();
                    break;
                }
                break;
            case 12:
                tn.E0(tnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = tnVar.W7;
                tnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                tn.o1(tnVar);
                break;
            case 15:
                tnVar.H7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                tnVar.J7 = false;
                tnVar.K7 = 0L;
                tnVar.L7 = null;
                tnVar.M7 = null;
                tnVar.N7 = null;
                tnVar.O7 = -1;
                tnVar.I7 = false;
                tnVar.Wc(false);
                tnVar.Q7 = null;
                break;
            case 16:
                tnVar.resumeDelayedFragmentAnimation();
                ek ekVar = tnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(ekVar);
                ekVar.run();
                tnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                tnVar.vb(false, true);
                break;
            case 18:
                tnVar.bc(true);
                break;
            case 19:
                tnVar.Z6();
                break;
            case 20:
                tnVar.U.H0();
                break;
            case 21:
                tnVar.m7 = null;
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    org.telegram.ui.Components.m50 cameraContainer = xkVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.m50, Float>) property, 0.0f), ObjectAnimator.ofFloat(tnVar.X2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(tnVar.X2.getPaint(), org.telegram.ui.Components.r6.b, 0), ObjectAnimator.ofFloat(tnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new oi(tnVar, i13));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) tnVar.t0, (f5.d) new l4.x0(i11));
                em emVar = tnVar.w0;
                if (emVar != null) {
                    emVar.O(true);
                    break;
                }
                break;
            case 23:
                tn tnVar2 = this.b;
                int i14 = tnVar2.mb;
                if (i14 != 0) {
                    tnVar2.j(i14, tnVar2.nb, tnVar2.ob, tnVar2.pb, tnVar2.qb, tnVar2.rb);
                    tnVar2.mb = 0;
                    break;
                }
                break;
            case 24:
                if (!tnVar.h3 && tnVar.t0 != null && tnVar.getParentActivity() != null && tnVar.fragmentView != null) {
                    org.telegram.ui.Components.kp kpVar = tnVar.r2;
                    if (kpVar == null || kpVar.getTag() == null) {
                        if (tnVar.r2 == null) {
                            km kmVar = tnVar.T0;
                            int indexOfChild = kmVar.indexOfChild(tnVar.O);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.kp kpVar2 = new org.telegram.ui.Components.kp(tnVar.getParentActivity(), tnVar.aa);
                                tnVar.r2 = kpVar2;
                                kmVar.addView(kpVar2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                tnVar.r2.setAlpha(0.0f);
                                tnVar.r2.setVisibility(4);
                            }
                        }
                        int childCount2 = tnVar.t0.getChildCount();
                        int i15 = 0;
                        while (i15 < childCount2) {
                            View childAt2 = tnVar.t0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.kp kpVar3 = tnVar.r2;
                                ImageView imageView = kpVar3.c;
                                org.telegram.ui.Components.ig igVar = kpVar3.e;
                                if (igVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(igVar);
                                    kpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i16 = iArr[c3];
                                ((View) kpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[1];
                                View view = (View) s1Var.getParent();
                                kpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + kpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.x3.C(6.0f, s1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - kpVar3.getMeasuredHeight();
                                    kpVar3.f = measuredHeight;
                                    kpVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - kpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        kpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        kpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            kpVar3.setTranslationX(kpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > kpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - kpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        kpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        kpVar3.setTranslationX(kpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    kpVar3.setPivotX(left2);
                                    kpVar3.setPivotY(kpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = kpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        kpVar3.d = null;
                                    }
                                    kpVar3.setTag(1);
                                    kpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    kpVar3.d = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(kpVar3, (Property<org.telegram.ui.Components.kp, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(kpVar3, (Property<org.telegram.ui.Components.kp, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(kpVar3, (Property<org.telegram.ui.Components.kp, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    kpVar3.d.addListener(new org.telegram.ui.Components.jp(kpVar3, i13));
                                    kpVar3.d.setDuration(180L);
                                    kpVar3.d.start();
                                    while (i13 < 2) {
                                        kpVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.jr.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new org.telegram.ui.Cells.z3(kpVar3, i13, 3)).start();
                                        i13++;
                                    }
                                    tnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                            i15++;
                            c3 = 1;
                        }
                        break;
                    }
                }
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) tnVar.t0, (f5.d) new l4.x0(i12));
                em emVar2 = tnVar.w0;
                if (emVar2 != null) {
                    emVar2.O(false);
                    break;
                }
                break;
            case 26:
                tn.w0(tnVar);
                break;
            case 27:
                dk dkVar2 = tnVar.U;
                if (dkVar2 != null && tnVar.kb != 5) {
                    dkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ko koVar = ((org.telegram.ui.Components.ko[]) tnVar.W.b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = koVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = koVar.e;
                tnVar.B1 = !tnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (tnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(tnVar.C1, 6000L);
                break;
            default:
                tnVar.uc();
                break;
        }
    }
}
