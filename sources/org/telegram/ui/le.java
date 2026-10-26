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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ le(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // java.lang.Runnable
    public final void run() {
        hk hkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        boolean z10;
        int i11 = this.a;
        int i12 = 5;
        int i13 = 2;
        ?? r14 = 1;
        int i14 = 0;
        un unVar = this.b;
        switch (i11) {
            case 0:
                unVar.X5 = null;
                if (unVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.qa);
                    boolean isChannel = ChatObject.isChannel(unVar.e);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                    if (!isChannel || unVar.e.megagroup) {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        e2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        e2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new pe(unVar, i13));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(unVar, 3));
                    unVar.showDialog(e2Var);
                    break;
                }
                break;
            case 1:
                unVar.f7();
                break;
            case 2:
                un.j0(unVar);
                break;
            case 3:
                unVar.ya(null, unVar.E8);
                unVar.E8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.r2.hasSheets(unVar) && (hkVar = unVar.Y) != null) {
                    hkVar.setFieldFocused(true);
                    unVar.Y.F0();
                    break;
                }
                break;
            case 5:
                unVar.x9();
                AndroidUtilities.forEachViews((RecyclerView) unVar.x0, (Utilities.Callback<View>) new ye(unVar, i12));
                unVar.B7();
                yj yjVar = unVar.j3;
                if (yjVar != null) {
                    yjVar.setTranslationX(unVar.b9() / 2.0f);
                }
                wj wjVar = unVar.k3;
                if (wjVar != null) {
                    wjVar.setTranslationX(unVar.b9() / 2.0f);
                }
                FrameLayout frameLayout = unVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(unVar.b9() / 2.0f);
                }
                unVar.Z6();
                unVar.A7();
                break;
            case 6:
                wd1 b02 = wd1.b0(-unVar.f6, 0L);
                b02.y = unVar;
                unVar.presentFragment(b02);
                break;
            case 7:
                unVar.nc(true);
                break;
            case 8:
                unVar.v1.d(true);
                break;
            case 9:
                unVar.getNotificationCenter().onAnimationFinish(unVar.R9);
                break;
            case 10:
                int childCount = unVar.x0.getChildCount();
                while (i14 < childCount) {
                    View childAt = unVar.x0.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i14++;
                }
                break;
            case 11:
                unVar.Xb = true;
                unVar.Kc(true);
                break;
            case 12:
                xk xkVar = unVar.wb;
                if (xkVar != null) {
                    xkVar.requestLayout();
                    break;
                }
                break;
            case 13:
                un.f0(unVar);
                break;
            case 14:
                TLRPC.UserFull userFull = unVar.m8;
                unVar.tb(userFull != null ? userFull.theme : null);
                break;
            case 15:
                un.p1(unVar);
                break;
            case 16:
                unVar.X7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                unVar.Z7 = false;
                unVar.a8 = 0L;
                unVar.b8 = null;
                unVar.c8 = null;
                unVar.d8 = null;
                unVar.e8 = -1;
                unVar.Y7 = false;
                unVar.jd(false);
                unVar.g8 = null;
                break;
            case 17:
                kf kfVar = new kf(unVar, 7);
                if (org.telegram.ui.Components.fb1.o()) {
                    kfVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(kfVar, 3);
                    org.telegram.ui.Components.fb1.h.add(cy0Var);
                    AndroidUtilities.runOnUIThread(cy0Var, 150L);
                    break;
                }
            case 18:
                unVar.Gb(false, true);
                break;
            case 19:
                AndroidUtilities.removeFromParent(unVar.W0);
                break;
            case 20:
                unVar.g7();
                break;
            case 21:
                unVar.Y.F0();
                break;
            case 22:
                un unVar2 = this.b;
                int i15 = unVar2.Mb;
                if (i15 != 0) {
                    unVar2.j(i15, unVar2.Nb, unVar2.Ob, unVar2.Pb, unVar2.Qb, unVar2.Rb);
                    unVar2.Mb = 0;
                    break;
                }
                break;
            case 23:
                AndroidUtilities.forEachViews((RecyclerView) unVar.x0, (Utilities.Callback<View>) new di.e(10));
                fm fmVar = unVar.A0;
                if (fmVar != null) {
                    fmVar.O(true);
                    break;
                }
                break;
            case 24:
                if (!unVar.x3 && unVar.x0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = unVar.H2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (unVar.H2 == null) {
                            mm mmVar = unVar.j1;
                            int indexOfChild = mmVar.indexOfChild(unVar.S);
                            if (indexOfChild != -1) {
                                f7 = 24.0f;
                                Activity parentActivity = unVar.getParentActivity();
                                sn snVar = unVar.qa;
                                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(parentActivity);
                                dqVar2.a = new TextView[2];
                                dqVar2.b = new org.telegram.ui.Components.ak0[2];
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.qf, snVar)));
                                frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                                dqVar2.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i16 = 0;
                                while (i16 < 2) {
                                    dqVar2.b[i16] = new org.telegram.ui.Components.ak0(parentActivity);
                                    dqVar2.b[i16].setScaleType(ImageView.ScaleType.CENTER);
                                    frameLayout2.addView(dqVar2.b[i16], org.telegram.ui.Components.gb1.h(24, 24.0f, 51, 0.0f, i16 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
                                    dqVar2.a[i16] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.f7.V(dqVar2.a[i16], org.telegram.ui.ActionBar.y6.pf, snVar);
                                    dqVar2.a[i16].setTextSize(r14, 14.0f);
                                    dqVar2.a[i16].setMaxLines(r14);
                                    dqVar2.a[i16].setSingleLine(r14);
                                    dqVar2.a[i16].setMaxWidth(AndroidUtilities.dp(250.0f));
                                    dqVar2.a[i16].setGravity(51);
                                    dqVar2.a[i16].setPivotX(0.0f);
                                    frameLayout2.addView(dqVar2.a[i16], org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 32.0f, i16 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
                                    if (i16 == 0) {
                                        z10 = r14;
                                        dqVar2.b[i16].f(R.raw.ticks_single, 24, 24, null);
                                        dqVar2.a[i16].setText(LocaleController.getString(R.string.HintSent));
                                    } else {
                                        z10 = r14;
                                        dqVar2.b[i16].f(R.raw.ticks_double, 24, 24, null);
                                        dqVar2.a[i16].setText(LocaleController.getString(R.string.HintRead));
                                    }
                                    dqVar2.b[i16].d();
                                    i16++;
                                    r14 = z10;
                                }
                                i10 = r14;
                                ImageView imageView = new ImageView(parentActivity);
                                dqVar2.c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.qf, snVar, PorterDuff.Mode.MULTIPLY);
                                dqVar2.addView(imageView, org.telegram.ui.Components.gb1.h(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                unVar.H2 = dqVar2;
                                mmVar.addView(dqVar2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                unVar.H2.setAlpha(0.0f);
                                unVar.H2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = unVar.x0.getChildCount();
                        for (int i17 = 0; i17 < childCount2; i17++) {
                            View childAt2 = unVar.x0.getChildAt(i17);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar3 = unVar.H2;
                                ImageView imageView2 = dqVar3.c;
                                org.telegram.ui.Components.bq bqVar = dqVar3.e;
                                if (bqVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(bqVar);
                                    dqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i18 = iArr[i10];
                                ((View) dqVar3.getParent()).getLocationInWindow(iArr);
                                int i19 = i18 - iArr[i10];
                                View view = (View) s1Var.getParent();
                                dqVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i19 > AndroidUtilities.dp(10.0f) + dqVar3.getMeasuredHeight()) {
                                    int D = org.telegram.messenger.t.D(6.0f, s1Var.getChecksY(), i19);
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
                                    dqVar3.d.addListener(new org.telegram.ui.Components.cq(dqVar3, i14));
                                    dqVar3.d.setDuration(180L);
                                    dqVar3.d.start();
                                    while (i14 < 2) {
                                        dqVar3.a[i14].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.ds.i).setStartDelay((i14 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new hi.y2(dqVar3, i14, 6)).start();
                                        i14++;
                                    }
                                    unVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                un.C0(unVar);
                break;
            case 26:
                hk hkVar2 = unVar.Y;
                if (hkVar2 != null && unVar.Kb != 5) {
                    hkVar2.F0();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.cp cpVar = ((org.telegram.ui.Components.cp[]) unVar.a0.b)[0];
                org.telegram.ui.ActionBar.b6 b6Var = cpVar.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = cpVar.e;
                unVar.R1 = !unVar.R1;
                b6Var.setPivotX(0.0f);
                b6Var2.setPivotX(0.0f);
                if (unVar.R1) {
                    b6Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    b6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    b6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    b6Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(unVar.S1, 6000L);
                break;
            case 28:
                AndroidUtilities.forEachViews((RecyclerView) unVar.x0, (Utilities.Callback<View>) new di.e(11));
                fm fmVar2 = unVar.A0;
                if (fmVar2 != null) {
                    fmVar2.O(false);
                    break;
                }
                break;
            default:
                unVar.Hc();
                break;
        }
    }
}
