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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ le(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // java.lang.Runnable
    public final void run() {
        jk jkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        boolean z10;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        ?? r15 = 1;
        wn wnVar = this.b;
        switch (i11) {
            case 0:
                wnVar.b6 = null;
                if (wnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ua);
                    boolean isChannel = ChatObject.isChannel(wnVar.e);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    if (!isChannel || wnVar.e.megagroup) {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new qe(wnVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(wnVar, 3));
                    wnVar.showDialog(e2Var);
                    break;
                }
                break;
            case 1:
                wnVar.h7();
                break;
            case 2:
                wn.j0(wnVar);
                break;
            case 3:
                wnVar.Ba(null, wnVar.I8);
                wnVar.I8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.r2.hasSheets(wnVar) && (jkVar = wnVar.Y) != null) {
                    jkVar.setFieldFocused(true);
                    wnVar.Y.E0();
                    break;
                }
                break;
            case 5:
                wnVar.A9();
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new ye(wnVar, 6));
                wnVar.D7();
                ak akVar = wnVar.j3;
                if (akVar != null) {
                    akVar.setTranslationX(wnVar.e9() / 2.0f);
                }
                yj yjVar = wnVar.k3;
                if (yjVar != null) {
                    yjVar.setTranslationX(wnVar.e9() / 2.0f);
                }
                FrameLayout frameLayout = wnVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wnVar.e9() / 2.0f);
                }
                wnVar.b7();
                wnVar.C7();
                break;
            case 6:
                yd1 b02 = yd1.b0(-wnVar.j6, 0L);
                b02.y = wnVar;
                wnVar.presentFragment(b02);
                break;
            case 7:
                wnVar.rc(true);
                break;
            case 8:
                wnVar.v1.d(true);
                break;
            case 9:
                wnVar.getNotificationCenter().onAnimationFinish(wnVar.V9);
                break;
            case 10:
                int childCount = wnVar.x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = wnVar.x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i13++;
                }
                break;
            case 11:
                wnVar.bc = true;
                wnVar.Oc(true);
                break;
            case 12:
                zk zkVar = wnVar.Ab;
                if (zkVar != null) {
                    zkVar.requestLayout();
                    break;
                }
                break;
            case 13:
                wnVar.resumeDelayedFragmentAnimation();
                rk rkVar = wnVar.ma;
                AndroidUtilities.cancelRunOnUIThread(rkVar);
                rkVar.run();
                wnVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 14:
                wn.M0(wnVar);
                break;
            case 15:
                TLRPC.UserFull userFull = wnVar.q8;
                wnVar.xb(userFull != null ? userFull.theme : null);
                break;
            case 16:
                wn.Q0(wnVar);
                break;
            case 17:
                wnVar.b8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                wnVar.d8 = false;
                wnVar.e8 = 0L;
                wnVar.f8 = null;
                wnVar.g8 = null;
                wnVar.h8 = null;
                wnVar.i8 = -1;
                wnVar.c8 = false;
                wnVar.nd(false);
                wnVar.k8 = null;
                break;
            case 18:
                le leVar = new le(wnVar, 13);
                if (org.telegram.ui.Components.jb1.u()) {
                    leVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.dy0 dy0Var = new org.telegram.ui.Components.dy0(leVar, 3);
                    org.telegram.ui.Components.jb1.h.add(dy0Var);
                    AndroidUtilities.runOnUIThread(dy0Var, 150L);
                    break;
                }
            case 19:
                wnVar.Kb(false, true);
                break;
            case 20:
                wn.b1(wnVar);
                break;
            case 21:
                wnVar.i7();
                break;
            case 22:
                wnVar.Y.E0();
                break;
            case 23:
                wn wnVar2 = this.b;
                int i14 = wnVar2.Qb;
                if (i14 != 0) {
                    wnVar2.j(i14, wnVar2.Rb, wnVar2.Sb, wnVar2.Tb, wnVar2.Ub, wnVar2.Vb);
                    wnVar2.Qb = 0;
                    break;
                }
                break;
            case 24:
                if (!wnVar.x3 && wnVar.x0 != null && wnVar.getParentActivity() != null && wnVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = wnVar.H2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (wnVar.H2 == null) {
                            om omVar = wnVar.j1;
                            f7 = 24.0f;
                            int indexOfChild = omVar.indexOfChild(wnVar.S);
                            if (indexOfChild != -1) {
                                Activity parentActivity = wnVar.getParentActivity();
                                un unVar = wnVar.ua;
                                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(parentActivity);
                                dqVar2.a = new TextView[2];
                                dqVar2.b = new org.telegram.ui.Components.bk0[2];
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.qf, unVar)));
                                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                dqVar2.addView(frameLayout2, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i15 = 0;
                                while (i15 < 2) {
                                    dqVar2.b[i15] = new org.telegram.ui.Components.bk0(parentActivity);
                                    dqVar2.b[i15].setScaleType(ImageView.ScaleType.CENTER);
                                    frameLayout2.addView(dqVar2.b[i15], org.telegram.ui.Components.kb1.h(24, 24.0f, 51, 0.0f, i15 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
                                    dqVar2.a[i15] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.f7.V(dqVar2.a[i15], org.telegram.ui.ActionBar.y6.pf, unVar);
                                    dqVar2.a[i15].setTextSize(r15, 14.0f);
                                    dqVar2.a[i15].setMaxLines(r15);
                                    dqVar2.a[i15].setSingleLine(r15);
                                    dqVar2.a[i15].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    dqVar2.a[i15].setGravity(51);
                                    dqVar2.a[i15].setPivotX(0.0f);
                                    frameLayout2.addView(dqVar2.a[i15], org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 32.0f, i15 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
                                    if (i15 == 0) {
                                        z10 = r15;
                                        dqVar2.b[i15].f(R.raw.ticks_single, 24, 24, null);
                                        dqVar2.a[i15].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r15;
                                        dqVar2.b[i15].f(R.raw.ticks_double, 24, 24, null);
                                        dqVar2.a[i15].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    dqVar2.b[i15].d();
                                    i15++;
                                    r15 = z10;
                                }
                                i10 = r15;
                                ImageView imageView = new ImageView(parentActivity);
                                dqVar2.c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.qf, unVar, PorterDuff.Mode.MULTIPLY);
                                dqVar2.addView(imageView, org.telegram.ui.Components.kb1.h(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                wnVar.H2 = dqVar2;
                                omVar.addView(dqVar2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                wnVar.H2.setAlpha(0.0f);
                                wnVar.H2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = wnVar.x0.getChildCount();
                        for (int i16 = 0; i16 < childCount2; i16++) {
                            View childAt2 = wnVar.x0.getChildAt(i16);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar3 = wnVar.H2;
                                ImageView imageView2 = dqVar3.c;
                                org.telegram.ui.Components.cp cpVar = dqVar3.e;
                                if (cpVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(cpVar);
                                    dqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i17 = iArr[i10];
                                ((View) dqVar3.getParent()).getLocationInWindow(iArr);
                                int i18 = i17 - iArr[i10];
                                View view = (View) s1Var.getParent();
                                dqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i18 > AndroidUtilities.dp(10.0f) + dqVar3.getMeasuredHeight()) {
                                    int D = org.telegram.messenger.t.D(6.0f, s1Var.getChecksY(), i18);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = D - dqVar3.getMeasuredHeight();
                                    dqVar3.f = measuredHeight;
                                    dqVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - dqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        dqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        dqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            dqVar3.setTranslationX(dqVar3.getTranslationX() + dp3);
                                            imageView2.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > dqVar3.getMeasuredWidth() - AndroidUtilities.dp(f7)) {
                                        float measuredWidth3 = (left2 - dqVar3.getMeasuredWidth()) + AndroidUtilities.dp(f7);
                                        dqVar3.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        dqVar3.setTranslationX(dqVar3.getTranslationX() + dp4);
                                        imageView2.setTranslationX(left2 - dp4);
                                    }
                                    dqVar3.setPivotX(left2);
                                    dqVar3.setPivotY(dqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = dqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        dqVar3.d = null;
                                    }
                                    dqVar3.setTag(Integer.valueOf(i10));
                                    dqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    dqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dqVar3, (Property<org.telegram.ui.Components.dq, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    dqVar3.d.addListener(new org.telegram.ui.Components.cq(dqVar3, i13));
                                    dqVar3.d.setDuration(180L);
                                    dqVar3.d.start();
                                    while (i13 < 2) {
                                        dqVar3.a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.ds.i).setStartDelay((i13 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new hi.y2(dqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    wnVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                wn.A0(wnVar);
                break;
            case 26:
                AndroidUtilities.removeFromParent(wnVar.W0);
                break;
            case 27:
                jk jkVar2 = wnVar.Y;
                if (jkVar2 != null && wnVar.Ob != 5) {
                    jkVar2.E0();
                    break;
                }
                break;
            case 28:
                AndroidUtilities.forEachViews((RecyclerView) wnVar.x0, (Utilities.Callback<View>) new di.e(10));
                hm hmVar = wnVar.A0;
                if (hmVar != null) {
                    hmVar.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.dp dpVar = ((org.telegram.ui.Components.dp[]) wnVar.a0.b)[0];
                org.telegram.ui.ActionBar.b6 b6Var = dpVar.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = dpVar.e;
                wnVar.R1 = !wnVar.R1;
                b6Var.setPivotX(0.0f);
                b6Var2.setPivotX(0.0f);
                if (wnVar.R1) {
                    b6Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(wnVar.S1, 6000L);
                break;
        }
    }
}
