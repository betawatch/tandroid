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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ me(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // java.lang.Runnable
    public final void run() {
        mk mkVar;
        int i10;
        float f7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        boolean z10;
        int i11 = this.a;
        int i12 = 5;
        int i13 = 2;
        int i14 = 0;
        ?? r12 = 1;
        un unVar = this.b;
        switch (i11) {
            case 0:
                unVar.b6 = null;
                if (unVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.xa);
                    boolean T = org.telegram.messenger.w3.T(unVar.e);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    if (!T || unVar.e.megagroup) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749093, null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131749092, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131749095, null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131749094, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749091, null), new re(unVar, i13));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new re(unVar, 3));
                    unVar.showDialog(x1Var);
                    break;
                }
                break;
            case 1:
                unVar.g7();
                break;
            case 2:
                un.o0(unVar);
                break;
            case 3:
                unVar.resumeDelayedFragmentAnimation();
                ci ciVar = unVar.pa;
                org.telegram.messenger.i0.r(ciVar);
                ciVar.run();
                unVar.getNotificationCenter().o();
                break;
            case 4:
                unVar.Ea(null, unVar.G8);
                unVar.G8 = null;
                break;
            case 5:
                if (!org.telegram.ui.ActionBar.k2.hasSheets(unVar) && (mkVar = unVar.Z) != null) {
                    mkVar.setFieldFocused(true);
                    unVar.Z.F0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.t11 t11Var = unVar.m0;
                if (t11Var != null && !unVar.f2.e) {
                    t11Var.b();
                }
                unVar.pd();
                break;
            case 7:
                unVar.pd();
                unVar.A9();
                org.telegram.messenger.i0.d0(unVar.z0, new ze(unVar, i12));
                unVar.C7();
                dk dkVar = unVar.l3;
                if (dkVar != null) {
                    dkVar.setTranslationX(unVar.e9() / 2.0f);
                }
                ck ckVar = unVar.m3;
                if (ckVar != null) {
                    ckVar.setTranslationX(unVar.e9() / 2.0f);
                }
                FrameLayout frameLayout = unVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(unVar.e9() / 2.0f);
                }
                unVar.a7();
                unVar.B7();
                break;
            case 8:
                la1 e02 = la1.e0(-unVar.j6, 0L);
                e02.D = unVar;
                unVar.presentFragment(e02);
                break;
            case 9:
                unVar.uc(true);
                break;
            case 10:
                unVar.x1.d(true);
                break;
            case 11:
                unVar.getNotificationCenter().j(unVar.Y9);
                break;
            case 12:
                int childCount = unVar.z0.getChildCount();
                while (i14 < childCount) {
                    View childAt = unVar.z0.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.E1();
                        }
                    }
                    i14++;
                }
                break;
            case 13:
                unVar.Wb = true;
                unVar.Rc(true);
                break;
            case 14:
                dl dlVar = unVar.wb;
                if (dlVar != null) {
                    dlVar.requestLayout();
                    break;
                }
                break;
            case 15:
                un.E1(unVar);
                break;
            case 16:
                TLRPC.UserFull userFull = unVar.q8;
                unVar.Ab(userFull != null ? userFull.theme : null);
                break;
            case 17:
                un.t0(unVar);
                break;
            case 18:
                unVar.b8 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                unVar.d8 = false;
                unVar.e8 = 0L;
                unVar.f8 = null;
                unVar.g8 = null;
                unVar.h8 = null;
                unVar.i8 = -1;
                unVar.c8 = false;
                unVar.sd(false);
                unVar.k8 = null;
                break;
            case 19:
                me meVar = new me(unVar, 3);
                if (org.telegram.utils.twidget.p.x()) {
                    meVar.run();
                    break;
                } else {
                    org.telegram.ui.Components.ew ewVar = new org.telegram.ui.Components.ew(meVar, 20);
                    org.telegram.utils.twidget.p.h.add(ewVar);
                    org.telegram.messenger.i0.h3(ewVar, 150L);
                    break;
                }
            case 20:
                unVar.Ob(false, true);
                break;
            case 21:
                un.n1(unVar);
                break;
            case 22:
                unVar.h7();
                break;
            case 23:
                unVar.Z.F0();
                break;
            case 24:
                un unVar2 = this.b;
                int i15 = unVar2.Lb;
                if (i15 != 0) {
                    unVar2.k(i15, unVar2.Mb, unVar2.Nb, unVar2.Ob, unVar2.Pb, unVar2.Qb);
                    unVar2.Lb = 0;
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.i0.E2(unVar.Y0);
                break;
            case 26:
                if (!unVar.z3 && unVar.z0 != null && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.hp hpVar = unVar.J2;
                    if (hpVar == null || hpVar.getTag() == null) {
                        if (unVar.J2 == null) {
                            km kmVar = unVar.l1;
                            int indexOfChild = kmVar.indexOfChild(unVar.T);
                            if (indexOfChild != -1) {
                                f7 = 24.0f;
                                Activity parentActivity = unVar.getParentActivity();
                                sn snVar = unVar.xa;
                                org.telegram.ui.Components.hp hpVar2 = new org.telegram.ui.Components.hp(parentActivity);
                                hpVar2.a = new TextView[2];
                                hpVar2.b = new org.telegram.ui.Components.ei0[2];
                                FrameLayout frameLayout2 = new FrameLayout(parentActivity);
                                frameLayout2.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.eg, snVar)));
                                frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                                hpVar2.addView(frameLayout2, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
                                int i16 = 0;
                                while (i16 < 2) {
                                    hpVar2.b[i16] = new org.telegram.ui.Components.ei0(parentActivity);
                                    hpVar2.b[i16].setScaleType(ImageView.ScaleType.CENTER);
                                    frameLayout2.addView(hpVar2.b[i16], w7.b6.d(24, 24.0f, 51, 0.0f, i16 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
                                    hpVar2.a[i16] = new TextView(parentActivity);
                                    org.telegram.ui.ActionBar.a7.V(hpVar2.a[i16], org.telegram.ui.ActionBar.t6.dg, snVar);
                                    hpVar2.a[i16].setTextSize(r12, 14.0f);
                                    hpVar2.a[i16].setMaxLines(r12);
                                    hpVar2.a[i16].setSingleLine(r12);
                                    hpVar2.a[i16].setMaxWidth(org.telegram.messenger.i0.L(250.0f));
                                    hpVar2.a[i16].setGravity(51);
                                    hpVar2.a[i16].setPivotX(0.0f);
                                    frameLayout2.addView(hpVar2.a[i16], w7.b6.d(-2, -2.0f, 51, 32.0f, i16 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
                                    if (i16 == 0) {
                                        z10 = r12;
                                        hpVar2.b[i16].f(R.raw.ticks_single, 24, 24, null);
                                        hpVar2.a[i16].setText(org.telegram.messenger.cd.L0(2131749307, null));
                                    } else {
                                        z10 = r12;
                                        hpVar2.b[i16].f(R.raw.ticks_double, 24, 24, null);
                                        hpVar2.a[i16].setText(org.telegram.messenger.cd.L0(2131749308, null));
                                    }
                                    hpVar2.b[i16].d();
                                    i16++;
                                    r12 = z10;
                                }
                                i10 = r12;
                                ImageView imageView = new ImageView(parentActivity);
                                hpVar2.c = imageView;
                                imageView.setImageResource(R.drawable.tooltip_arrow);
                                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.eg, snVar, PorterDuff.Mode.MULTIPLY);
                                hpVar2.addView(imageView, w7.b6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
                                unVar.J2 = hpVar2;
                                kmVar.addView(hpVar2, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                                unVar.J2.setAlpha(0.0f);
                                unVar.J2.setVisibility(4);
                            }
                        } else {
                            i10 = 1;
                            f7 = 24.0f;
                        }
                        int childCount2 = unVar.z0.getChildCount();
                        for (int i17 = 0; i17 < childCount2; i17++) {
                            View childAt2 = unVar.z0.getChildAt(i17);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.hp hpVar3 = unVar.J2;
                                ImageView imageView2 = hpVar3.c;
                                org.telegram.ui.Components.ho hoVar = hpVar3.e;
                                if (hoVar != null) {
                                    org.telegram.messenger.i0.r(hoVar);
                                    hpVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                q1Var.getLocationInWindow(iArr);
                                int i18 = iArr[i10];
                                ((View) hpVar3.getParent()).getLocationInWindow(iArr);
                                int i19 = i18 - iArr[i10];
                                View view = (View) q1Var.getParent();
                                hpVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(1000, TLObject.FLAG_31));
                                if (i19 > org.telegram.messenger.i0.L(10.0f) + hpVar3.getMeasuredHeight()) {
                                    int C = org.telegram.messenger.m5.C(6.0f, q1Var.getChecksY(), i19);
                                    int L = org.telegram.messenger.i0.L(5.0f) + q1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = C - hpVar3.getMeasuredHeight();
                                    hpVar3.f = measuredHeight;
                                    hpVar3.setTranslationY(measuredHeight);
                                    int left = q1Var.getLeft() + L;
                                    int L2 = org.telegram.messenger.i0.L(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - hpVar3.getMeasuredWidth()) - org.telegram.messenger.i0.L(20.0f);
                                        hpVar3.setTranslationX(measuredWidth2);
                                        L2 += measuredWidth2;
                                    } else {
                                        hpVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((q1Var.getLeft() + L) - L2) - (imageView2.getMeasuredWidth() / 2);
                                    imageView2.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < org.telegram.messenger.i0.L(10.0f)) {
                                            float L3 = left2 - org.telegram.messenger.i0.L(10.0f);
                                            hpVar3.setTranslationX(hpVar3.getTranslationX() + L3);
                                            imageView2.setTranslationX(left2 - L3);
                                        }
                                    } else if (left2 > hpVar3.getMeasuredWidth() - org.telegram.messenger.i0.L(f7)) {
                                        float measuredWidth3 = (left2 - hpVar3.getMeasuredWidth()) + org.telegram.messenger.i0.L(f7);
                                        hpVar3.setTranslationX(measuredWidth3);
                                        imageView2.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < org.telegram.messenger.i0.L(10.0f)) {
                                        float L4 = left2 - org.telegram.messenger.i0.L(10.0f);
                                        hpVar3.setTranslationX(hpVar3.getTranslationX() + L4);
                                        imageView2.setTranslationX(left2 - L4);
                                    }
                                    hpVar3.setPivotX(left2);
                                    hpVar3.setPivotY(hpVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = hpVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        hpVar3.d = null;
                                    }
                                    hpVar3.setTag(Integer.valueOf(i10));
                                    hpVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    hpVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hpVar3, (Property<org.telegram.ui.Components.hp, Float>) View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hpVar3, (Property<org.telegram.ui.Components.hp, Float>) View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hpVar3, (Property<org.telegram.ui.Components.hp, Float>) View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    hpVar3.d.addListener(new org.telegram.ui.Components.gp(hpVar3, i14));
                                    hpVar3.d.setDuration(180L);
                                    hpVar3.d.start();
                                    while (i14 < 2) {
                                        hpVar3.a[i14].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.gr.i).setStartDelay((i14 == 0 ? org.telegram.messenger.zs.Q1 : 500) + org.telegram.messenger.zs.W1).setDuration(100L).setListener(new bi.d5(hpVar3, i14, 7)).start();
                                        i14++;
                                    }
                                    unVar.getMessagesController().h4(0L, "NEWCOMER_TICKS");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                un.G0(unVar);
                break;
            case 28:
                org.telegram.messenger.i0.d0(unVar.z0, new ag.z0(9));
                fm fmVar = unVar.C0;
                if (fmVar != null) {
                    fmVar.O(true);
                    break;
                }
                break;
            default:
                mk mkVar2 = unVar.Z;
                if (mkVar2 != null && unVar.Jb != 5) {
                    mkVar2.F0();
                    break;
                }
                break;
        }
    }
}
