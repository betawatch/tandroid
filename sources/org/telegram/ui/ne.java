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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ ne(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lk lkVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        int i10 = this.a;
        int i11 = 6;
        char c3 = 1;
        int i12 = 0;
        zn znVar = this.b;
        switch (i10) {
            case 0:
                znVar.I5 = null;
                if (znVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ba);
                    boolean isChannel = ChatObject.isChannel(znVar.e);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    if (!isChannel || znVar.e.megagroup) {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekGroupText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.JoinByPeekChannelText);
                        d2Var.O = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new ve(znVar, i12));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ve(znVar, 1));
                    znVar.showDialog(d2Var);
                    break;
                }
                break;
            case 1:
                znVar.Y6();
                break;
            case 2:
                zn.i0(znVar);
                break;
            case 3:
                znVar.oa(null, znVar.p8);
                znVar.p8 = null;
                break;
            case 4:
                if (!org.telegram.ui.ActionBar.p2.hasSheets(znVar) && (lkVar = znVar.V) != null) {
                    lkVar.setFieldFocused(true);
                    znVar.V.H0();
                    break;
                }
                break;
            case 5:
                znVar.o9();
                AndroidUtilities.forEachViews((RecyclerView) znVar.u0, (h5.d) new dg(znVar, 1));
                znVar.u7();
                bk bkVar = znVar.U2;
                if (bkVar != null) {
                    bkVar.setTranslationX(znVar.R8() / 2.0f);
                }
                ak akVar = znVar.V2;
                if (akVar != null) {
                    akVar.setTranslationX(znVar.R8() / 2.0f);
                }
                FrameLayout frameLayout = znVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(znVar.R8() / 2.0f);
                }
                znVar.S6();
                znVar.t7();
                break;
            case 6:
                ne1 a02 = ne1.a0(-znVar.Q5, 0L);
                a02.y = znVar;
                znVar.presentFragment(a02);
                break;
            case 7:
                znVar.getNotificationCenter().onAnimationFinish(znVar.C9);
                break;
            case 8:
                znVar.g1.d(true);
                break;
            case 9:
                int childCount = znVar.u0.getChildCount();
                while (i12 < childCount) {
                    View childAt = znVar.u0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var2.getMessageObject().type == 4) {
                            s1Var2.t2();
                        }
                    }
                    i12++;
                }
                break;
            case 10:
                znVar.yb = true;
                znVar.xc(true);
                break;
            case 11:
                cl clVar = znVar.Ya;
                if (clVar != null) {
                    clVar.requestLayout();
                    break;
                }
                break;
            case 12:
                zn.E0(znVar);
                break;
            case 13:
                TLRPC.UserFull userFull = znVar.X7;
                znVar.ib(userFull != null ? userFull.theme : null);
                break;
            case 14:
                zn.o1(znVar);
                break;
            case 15:
                znVar.I7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                znVar.K7 = false;
                znVar.L7 = 0L;
                znVar.M7 = null;
                znVar.N7 = null;
                znVar.O7 = null;
                znVar.P7 = -1;
                znVar.J7 = false;
                znVar.Wc(false);
                znVar.R7 = null;
                break;
            case 16:
                znVar.resumeDelayedFragmentAnimation();
                mk mkVar = znVar.T9;
                AndroidUtilities.cancelRunOnUIThread(mkVar);
                mkVar.run();
                znVar.getNotificationCenter().runDelayedNotifications();
                break;
            case 17:
                znVar.vb(false, true);
                break;
            case 18:
                znVar.bc(true);
                break;
            case 19:
                znVar.Z6();
                break;
            case 20:
                znVar.V.H0();
                break;
            case 21:
                znVar.n7 = null;
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    org.telegram.ui.Components.s50 cameraContainer = flVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.s50, Float>) View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.s50, Float>) View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, (Property<org.telegram.ui.Components.s50, Float>) property, 0.0f), ObjectAnimator.ofFloat(znVar.Y2.getButtonsLayout(), (Property<View, Float>) property, 0.0f), ObjectAnimator.ofInt(znVar.Y2.getPaint(), org.telegram.ui.Components.n6.b, 0), ObjectAnimator.ofFloat(znVar.Y2.getMuteImageView(), (Property<View, Float>) property, 0.0f));
                    animatorSet.addListener(new vi(znVar, i12));
                    animatorSet.start();
                    break;
                }
                break;
            case 22:
                AndroidUtilities.forEachViews((RecyclerView) znVar.u0, (h5.d) new nh.e(7));
                lm lmVar = znVar.x0;
                if (lmVar != null) {
                    lmVar.O(true);
                    break;
                }
                break;
            case 23:
                zn znVar2 = this.b;
                int i13 = znVar2.nb;
                if (i13 != 0) {
                    znVar2.j(i13, znVar2.ob, znVar2.pb, znVar2.qb, znVar2.rb, znVar2.sb);
                    znVar2.nb = 0;
                    break;
                }
                break;
            case 24:
                if (!znVar.i3 && znVar.u0 != null && znVar.getParentActivity() != null && znVar.fragmentView != null) {
                    org.telegram.ui.Components.np npVar = znVar.s2;
                    if (npVar == null || npVar.getTag() == null) {
                        if (znVar.s2 == null) {
                            rm rmVar = znVar.U0;
                            int indexOfChild = rmVar.indexOfChild(znVar.P);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(znVar.getParentActivity(), znVar.ba);
                                znVar.s2 = npVar2;
                                rmVar.addView(npVar2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                znVar.s2.setAlpha(0.0f);
                                znVar.s2.setVisibility(4);
                            }
                        }
                        int childCount2 = znVar.u0.getChildCount();
                        int i14 = 0;
                        while (i14 < childCount2) {
                            View childAt2 = znVar.u0.getChildAt(i14);
                            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.np npVar3 = znVar.s2;
                                ImageView imageView = npVar3.c;
                                org.telegram.ui.Components.fg fgVar = npVar3.e;
                                if (fgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(fgVar);
                                    npVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                s1Var.getLocationInWindow(iArr);
                                int i15 = iArr[c3];
                                ((View) npVar3.getParent()).getLocationInWindow(iArr);
                                int i16 = i15 - iArr[1];
                                View view = (View) s1Var.getParent();
                                npVar3.measure(View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(MediaDataController.MAX_STYLE_RUNS_COUNT, TLObject.FLAG_31));
                                if (i16 > AndroidUtilities.dp(10.0f) + npVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.y3.C(6.0f, s1Var.getChecksY(), i16);
                                    int dp = AndroidUtilities.dp(5.0f) + s1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - npVar3.getMeasuredHeight();
                                    npVar3.f = measuredHeight;
                                    npVar3.setTranslationY(measuredHeight);
                                    int left = s1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - npVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        npVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        npVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((s1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            npVar3.setTranslationX(npVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > npVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - npVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        npVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        npVar3.setTranslationX(npVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    npVar3.setPivotX(left2);
                                    npVar3.setPivotY(npVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = npVar3.d;
                                    if (animatorSet2 != null) {
                                        animatorSet2.cancel();
                                        npVar3.d = null;
                                    }
                                    npVar3.setTag(1);
                                    npVar3.setVisibility(0);
                                    AnimatorSet animatorSet3 = new AnimatorSet();
                                    npVar3.d = animatorSet3;
                                    animatorSet3.playTogether(ObjectAnimator.ofFloat(npVar3, (Property<org.telegram.ui.Components.np, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(npVar3, (Property<org.telegram.ui.Components.np, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(npVar3, (Property<org.telegram.ui.Components.np, Float>) View.SCALE_Y, 0.0f, 1.0f));
                                    npVar3.d.addListener(new org.telegram.ui.Components.mp(npVar3, i12));
                                    npVar3.d.setDuration(180L);
                                    npVar3.d.start();
                                    while (i12 < 2) {
                                        npVar3.a[i12].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.mr.i).setStartDelay((i12 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new org.telegram.ui.Cells.a4(npVar3, i12, 3)).start();
                                        i12++;
                                    }
                                    znVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
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
                AndroidUtilities.forEachViews((RecyclerView) znVar.u0, (h5.d) new nh.e(i11));
                lm lmVar2 = znVar.x0;
                if (lmVar2 != null) {
                    lmVar2.O(false);
                    break;
                }
                break;
            case 26:
                zn.w0(znVar);
                break;
            case 27:
                lk lkVar2 = znVar.V;
                if (lkVar2 != null && znVar.lb != 5) {
                    lkVar2.H0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.lo[]) znVar.X.b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = loVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = loVar.e;
                znVar.C1 = !znVar.C1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (znVar.C1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(znVar.D1, 6000L);
                break;
            default:
                znVar.uc();
                break;
        }
    }
}
