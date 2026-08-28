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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ge(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak akVar;
        int i9;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 5;
        int i13 = 0;
        qn qnVar = this.b;
        switch (i10) {
            case 0:
                qnVar.H5 = null;
                if (qnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.aa);
                    boolean isChannel = ChatObject.isChannel(qnVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    if (!isChannel || qnVar.e.megagroup) {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        c2Var.P = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.N = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new oe(qnVar, i13));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new oe(qnVar, 1));
                    qnVar.showDialog(c2Var);
                    break;
                }
                break;
            case 1:
                qnVar.Y6();
                break;
            case 2:
                qn.h0(qnVar);
                break;
            case 3:
                qnVar.oa(null, qnVar.o8);
                qnVar.o8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(qnVar) && (akVar = qnVar.U) != null) {
                    akVar.setFieldFocused(true);
                    qnVar.U.G0();
                    break;
                }
                break;
            case 5:
                qnVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) qnVar.t0, (d5.d) new xf(qnVar, 1));
                qnVar.u7();
                rj rjVar = qnVar.T2;
                if (rjVar != null) {
                    rjVar.setTranslationX(qnVar.R8() / 2.0f);
                }
                qj qjVar = qnVar.U2;
                if (qjVar != null) {
                    qjVar.setTranslationX(qnVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = qnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(qnVar.R8() / 2.0f);
                }
                qnVar.S6();
                qnVar.t7();
                break;
            case 6:
                rd1 Z = rd1.Z(-qnVar.P5, 0L);
                Z.y = qnVar;
                qnVar.presentFragment(Z);
                break;
            case 7:
                qnVar.getNotificationCenter().onAnimationFinish(qnVar.B9);
                break;
            case 8:
                qnVar.f1.d(true);
                break;
            case 9:
                int childCount = qnVar.t0.getChildCount();
                while (i13 < childCount) {
                    View childAt = qnVar.t0.getChildAt(i13);
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
                qnVar.xb = true;
                qnVar.xc(true);
                break;
            case 11:
                rk rkVar = qnVar.Xa;
                if (rkVar != null) {
                    rkVar.requestLayout();
                    break;
                }
                break;
            case 12:
                qn.D0(qnVar);
                break;
            case 13:
                TLRPC.UserFull userFull = qnVar.W7;
                qnVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                qn.o1(qnVar);
                break;
            case 15:
                qnVar.H7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                qnVar.J7 = false;
                qnVar.K7 = 0L;
                qnVar.L7 = null;
                qnVar.M7 = null;
                qnVar.N7 = null;
                qnVar.O7 = -1;
                qnVar.I7 = false;
                qnVar.Wc(false);
                qnVar.Q7 = null;
                break;
            case 16:
                qnVar.resumeDelayedFragmentAnimation();
                bk bkVar = qnVar.S9;
                AndroidUtilities.cancelRunOnUIThread(bkVar);
                bkVar.run();
                qnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                qnVar.vb(false, true);
                break;
            case 18:
                qnVar.bc(true);
                break;
            case 19:
                qnVar.Z6();
                break;
            case 20:
                qnVar.U.G0();
                break;
            case 21:
                qnVar.m7 = null;
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    org.telegram.ui.Components.y40 cameraContainer = ukVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.y40, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.y40, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.y40, Float>) property, 0.0f), ObjectAnimator.ofFloat(qnVar.X2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(qnVar.X2.getPaint(), org.telegram.ui.Components.m6.b, 0), ObjectAnimator.ofFloat(qnVar.X2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new li(qnVar, i13));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.t0, (d5.d) new ih.e(i11));
                bm bmVar = qnVar.w0;
                if (bmVar != null) {
                    bmVar.O(true);
                    break;
                }
                break;
            case 23:
                qn qnVar2 = this.b;
                int i14 = qnVar2.mb;
                if (i14 != 0) {
                    qnVar2.j(i14, qnVar2.nb, qnVar2.ob, qnVar2.pb, qnVar2.qb, qnVar2.rb);
                    qnVar2.mb = 0;
                    break;
                }
                break;
            case 24:
                if (!qnVar.h3 && qnVar.t0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
                    org.telegram.ui.Components.gp gpVar = qnVar.r2;
                    if (gpVar == null || gpVar.getTag() == null) {
                        if (qnVar.r2 == null) {
                            im imVar = qnVar.T0;
                            int indexOfChild = imVar.indexOfChild(qnVar.O);
                            if (indexOfChild != -1) {
                                i9 = 1;
                                org.telegram.ui.Components.gp gpVar2 = new org.telegram.ui.Components.gp(qnVar.getParentActivity(), qnVar.aa);
                                qnVar.r2 = gpVar2;
                                imVar.addView(gpVar2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                qnVar.r2.setAlpha(0.0f);
                                qnVar.r2.setVisibility(4);
                            }
                        } else {
                            i9 = 1;
                        }
                        int childCount2 = qnVar.t0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = qnVar.t0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.gp gpVar3 = qnVar.r2;
                                ImageView imageView = gpVar3.c;
                                org.telegram.ui.Components.fg fgVar = gpVar3.e;
                                if (fgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(fgVar);
                                    gpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i9];
                                ((View) gpVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i9];
                                View view = (View) t1Var.getParent();
                                gpVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i17 > AndroidUtilities.dp(10.0f) + gpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.l0.C(6.0f, t1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - gpVar3.getMeasuredHeight();
                                    gpVar3.f = measuredHeight;
                                    gpVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - gpVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        gpVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        gpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            gpVar3.setTranslationX(gpVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > gpVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - gpVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        gpVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        gpVar3.setTranslationX(gpVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    gpVar3.setPivotX(left2);
                                    gpVar3.setPivotY(gpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = gpVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        gpVar3.d = null;
                                    }
                                    gpVar3.setTag(Integer.valueOf(i9));
                                    gpVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    gpVar3.d = animatorSet3;
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gpVar3, (Property<org.telegram.ui.Components.gp, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gpVar3, (Property<org.telegram.ui.Components.gp, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gpVar3, (Property<org.telegram.ui.Components.gp, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat3;
                                    animatorArr[i9] = ofFloat4;
                                    animatorArr[2] = ofFloat5;
                                    animatorSet3.playTogether(animatorArr);
                                    gpVar3.d.addListener(new org.telegram.ui.Components.fp(gpVar3, i13));
                                    gpVar3.d.setDuration(180L);
                                    gpVar3.d.start();
                                    while (i13 < 2) {
                                        gpVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.gr.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new mh.o2(gpVar3, i13, 5)).start();
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
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) qnVar.t0, (d5.d) new ih.e(i12));
                bm bmVar2 = qnVar.w0;
                if (bmVar2 != null) {
                    bmVar2.O(false);
                    break;
                }
                break;
            case 26:
                qn.v0(qnVar);
                break;
            case 27:
                ak akVar2 = qnVar.U;
                if (akVar2 != null && qnVar.kb != 5) {
                    akVar2.G0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.go goVar = ((org.telegram.ui.Components.go[]) qnVar.W.b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = goVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = goVar.e;
                qnVar.B1 = !qnVar.B1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (qnVar.B1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(qnVar.C1, 6000L);
                break;
            default:
                qnVar.uc();
                break;
        }
    }
}
