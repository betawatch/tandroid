package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ke(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // java.lang.Runnable
    public final void run() {
        gk gkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        boolean z10;
        int i11 = this.a;
        int i12 = 2;
        ?? r12 = 1;
        int i13 = 0;
        sn snVar = this.b;
        switch (i11) {
            case 0:
                snVar.X5 = null;
                if (snVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.qa);
                    boolean isChannel = ChatObject.isChannel(snVar.e);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    if (!isChannel || snVar.e.megagroup) {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        c2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        c2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(snVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(snVar, 3));
                    snVar.showDialog(c2Var);
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
                snVar.ta(null, snVar.E8);
                snVar.E8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.o2.hasSheets(snVar) && (gkVar = snVar.Y) != null) {
                    gkVar.setFieldFocused(true);
                    snVar.Y.F0();
                    break;
                }
                break;
            case 5:
                snVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new xe(snVar, 6));
                snVar.x7();
                xj xjVar = snVar.j3;
                if (xjVar != null) {
                    xjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                vj vjVar = snVar.k3;
                if (vjVar != null) {
                    vjVar.setTranslationX(snVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = snVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(snVar.W8() / 2.0f);
                }
                snVar.V6();
                snVar.w7();
                break;
            case 6:
                td1 a02 = td1.a0(-snVar.f6, 0L);
                a02.y = snVar;
                snVar.presentFragment(a02);
                break;
            case 7:
                snVar.hc(true);
                break;
            case 8:
                snVar.v1.d(true);
                break;
            case 9:
                snVar.getNotificationCenter().onAnimationFinish(snVar.R9);
                break;
            case 10:
                int childCount = snVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = snVar.x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var2.getMessageObject().type == 4) {
                            t1Var2.s2();
                        }
                    }
                    i13++;
                }
                break;
            case 11:
                snVar.Ob = true;
                snVar.Ec(true);
                break;
            case 12:
                wk wkVar = snVar.nb;
                if (wkVar != null) {
                    wkVar.requestLayout();
                    break;
                }
                break;
            case 13:
                sn.N0(snVar);
                break;
            case 14:
                snVar.Bb(false, true);
                break;
            case 15:
                snVar.resumeDelayedFragmentAnimation();
                ok okVar = snVar.ia;
                AndroidUtilities.cancelRunOnUIThread(okVar);
                okVar.run();
                snVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 16:
                TLRPC.UserFull userFull = snVar.m8;
                snVar.ob(userFull != null ? userFull.theme : null);
                break;
            case 17:
                sn.u0(snVar);
                break;
            case 18:
                snVar.X7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                snVar.Z7 = false;
                snVar.a8 = 0L;
                snVar.b8 = null;
                snVar.c8 = null;
                snVar.d8 = null;
                snVar.e8 = -1;
                snVar.Y7 = false;
                snVar.dd(false);
                snVar.g8 = null;
                break;
            case 19:
                snVar.c7();
                break;
            case 20:
                snVar.Y.F0();
                break;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new ci.e(11));
                em emVar = snVar.A0;
                if (emVar != null) {
                    emVar.O(true);
                    break;
                }
                break;
            case 22:
                sn snVar2 = this.b;
                int i14 = snVar2.Db;
                if (i14 != 0) {
                    snVar2.j(i14, snVar2.Eb, snVar2.Fb, snVar2.Gb, snVar2.Hb, snVar2.Ib);
                    snVar2.Db = 0;
                    break;
                }
                break;
            case 23:
                if (!snVar.x3 && snVar.x0 != null && snVar.getParentActivity() != null && snVar.fragmentView != null) {
                    org.telegram.ui.Components.bq bqVar = snVar.H2;
                    if (bqVar == null || bqVar.getTag() == null) {
                        if (snVar.H2 == null) {
                            km kmVar = snVar.j1;
                            f7 = 24.0f;
                            int indexOfChild = kmVar.indexOfChild(snVar.S);
                            if (indexOfChild != -1) {
                                Activity parentActivity = snVar.getParentActivity();
                                qn qnVar = snVar.qa;
                                org.telegram.ui.Components.bq bqVar2 = new org.telegram.ui.Components.bq(parentActivity);
                                bqVar2.a = new TextView[2];
                                bqVar2.b = new org.telegram.ui.Components.bk0[2];
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qf, qnVar)));
                                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                bqVar2.addView(frameLayout2, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    bqVar2.b[i15] = new org.telegram.ui.Components.bk0(parentActivity);
                                    bqVar2.b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    frameLayout2.addView(bqVar2.b[i15], w7.z5.d(24, 24.0f, 51, 0.0f, i15 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
                                    bqVar2.a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.r6.W(bqVar2.a[i15], org.telegram.ui.ActionBar.k6.pf, qnVar);
                                    bqVar2.a[i15].setTextSize(r12, 14.0f);
                                    bqVar2.a[i15].setMaxLines(r12);
                                    bqVar2.a[i15].setSingleLine(r12);
                                    bqVar2.a[i15].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    bqVar2.a[i15].setGravity(51);
                                    bqVar2.a[i15].setPivotX(0.0f);
                                    frameLayout2.addView(bqVar2.a[i15], w7.z5.d(-2, -2.0f, 51, 32.0f, i15 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r12;
                                        bqVar2.b[i15].f(R.raw.ticks_single, 24, 24, null);
                                        bqVar2.a[i15].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r12;
                                        bqVar2.b[i15].f(R.raw.ticks_double, 24, 24, null);
                                        bqVar2.a[i15].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    bqVar2.b[i15].d();
                                    i15++;
                                    r12 = z10;
                                }
                                i10 = r12;
                                ImageView imageView = new ImageView(parentActivity);
                                bqVar2.c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.qf, qnVar, PorterDuff.Mode.MULTIPLY);
                                bqVar2.addView(imageView, w7.z5.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                snVar.H2 = bqVar2;
                                kmVar.addView(bqVar2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                snVar.H2.setAlpha(0.0f);
                                snVar.H2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = snVar.x0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = snVar.x0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.bq bqVar3 = snVar.H2;
                                ImageView imageView2 = bqVar3.c;
                                org.telegram.ui.Components.zp zpVar = bqVar3.e;
                                if (zpVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(zpVar);
                                    bqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                t1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) bqVar3.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) t1Var.getParent();
                                bqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i18 > AndroidUtilities.dp(10.0f) + bqVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.v0.C(6.0f, t1Var.getChecksY(), i18);
                                    int dp = AndroidUtilities.dp(5.0f) + t1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - bqVar3.getMeasuredHeight();
                                    bqVar3.f = measuredHeight;
                                    bqVar3.setTranslationY(measuredHeight);
                                    int left = t1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - bqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        bqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        bqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((t1Var.getLeft() + dp) - dp2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            bqVar3.setTranslationX(bqVar3.getTranslationX() + dp3);
                                            imageView2.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > bqVar3.getMeasuredWidth() - AndroidUtilities.dp(f7)) {
                                        float measuredWidth3 = (left2 - bqVar3.getMeasuredWidth()) + AndroidUtilities.dp(f7);
                                        bqVar3.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        bqVar3.setTranslationX(bqVar3.getTranslationX() + dp4);
                                        imageView2.setTranslationX(left2 - dp4);
                                    }
                                    bqVar3.setPivotX(left2);
                                    bqVar3.setPivotY(bqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = bqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        bqVar3.d = null;
                                    }
                                    bqVar3.setTag(Integer.valueOf(i10));
                                    bqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    bqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bqVar3, (Property<org.telegram.ui.Components.bq, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bqVar3, (Property<org.telegram.ui.Components.bq, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bqVar3, (Property<org.telegram.ui.Components.bq, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    bqVar3.d.addListener(new org.telegram.ui.Components.aq(bqVar3, i13));
                                    bqVar3.d.setDuration(180L);
                                    bqVar3.d.start();
                                    while (i13 < 2) {
                                        bqVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.bs.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new gi.p2(bqVar3, i13, 6)).start();
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
                sn.K0(snVar);
                break;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) snVar.x0, (Utilities.Callback<View>) new ci.e(10));
                em emVar2 = snVar.A0;
                if (emVar2 != null) {
                    emVar2.O(false);
                    break;
                }
                break;
            case 26:
                AndroidUtilities.removeFromParent(snVar.W0);
                break;
            case 27:
                gk gkVar2 = snVar.Y;
                if (gkVar2 != null && snVar.Bb != 5) {
                    gkVar2.F0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.ap apVar = ((org.telegram.ui.Components.ap[]) snVar.a0.b)[0];
                org.telegram.ui.ActionBar.n5 n5Var = apVar.d;
                org.telegram.ui.ActionBar.n5 n5Var2 = apVar.e;
                snVar.R1 = !snVar.R1;
                n5Var.setPivotX(0.0f);
                n5Var2.setPivotX(0.0f);
                if (snVar.R1) {
                    n5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    n5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(snVar.S1, 6000L);
                break;
            default:
                snVar.Bc();
                break;
        }
    }
}
