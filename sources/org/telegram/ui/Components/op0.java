package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class op0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final /* synthetic */ int Q2 = 0;
    public final s4.r A1;
    public boolean A2;
    public final zy B1;
    public org.telegram.ui.ActionBar.k1 B2;
    public final hp0 C1;
    public int C2;
    public final mp0 D1;
    public boolean D2;
    public final lp0 E1;
    public boolean E2;
    public final ArrayList F1;
    public int F2;
    public final String[] G1;
    public final tg.f G2;
    public final int H1;
    public final hi.c H2;
    public final dw0 I1;
    public final tg.b I2;
    public final Drawable J1;
    public final tg.b J2;
    public final View[] K1;
    public final tg.b K2;
    public final AnimatorSet[] L1;
    public final qg L2;
    public final a0.h M1;
    public final vg.f M2;
    public final HashMap N1;
    public final tg.c N2;
    public final cp0 O1;
    public final vg.f O2;
    public int P1;
    public boolean P2;
    public boolean Q1;
    public final boolean R1;
    public boolean S1;
    public final int T1;
    public final FrameLayout U1;
    public final LinearLayout V1;
    public final ep W1;
    public final org.telegram.ui.un X1;
    public final Activity Y1;
    public final boolean Z1;
    public boolean a2;
    public final TextPaint b2;
    public TLRPC.TL_exportedMessageLink c2;
    public boolean d2;
    public boolean e2;
    public final boolean f2;
    public final String[] g2;
    public int h2;
    public final FrameLayout i1;
    public int i2;
    public final so0 j1;
    public boolean j2;
    public final to0 k1;
    public ep0 k2;
    public final bi.f2 l1;
    public float l2;
    public final so0 m1;
    public float m2;
    public final FrameLayout n1;
    public float n2;
    public float o1;
    public ValueAnimator o2;
    public final bi.t0 p1;
    public final wj0 p2;
    public final FrameLayout q1;
    public final h10 q2;
    public final org.telegram.ui.ActionBar.u5 r1;
    public final org.telegram.ui.ActionBar.l r2;
    public final FrameLayout s1;
    public boolean s2;
    public final FrameLayout t1;
    public o1.j t2;
    public final LinearLayout u1;
    public TLRPC.Dialog u2;
    public AnimatorSet v1;
    public final bp0 v2;
    public final tk0 w1;
    public ArrayList w2;
    public final oo0 x1;
    public TL_stories.StoryItem x2;
    public final oo0 y1;
    public i0.c y2;
    public final s4.r z1;
    public int z2;

    public op0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, p6Var);
    }

    public static void I0(op0 op0Var) {
        oo0 oo0Var = op0Var.x1;
        oo0 oo0Var2 = op0Var.y1;
        tk0 tk0Var = op0Var.w1;
        if (op0Var.j2) {
            return;
        }
        oo0 oo0Var3 = op0Var.D2 ? oo0Var2 : oo0Var;
        if (oo0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = oo0Var3.getChildAt(0);
        for (int i10 = 0; i10 < oo0Var3.getChildCount(); i10++) {
            if (oo0Var3.getChildAt(i10).getTop() < childAt.getTop()) {
                childAt = oo0Var3.getChildAt(i10);
            }
        }
        ck0 ck0Var = (ck0) oo0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.i0.L(8.0f);
        int i11 = (top <= 0 || ck0Var == null || ck0Var.b() != 0) ? 0 : top;
        if (top < 0 || ck0Var == null || ck0Var.b() != 0) {
            op0Var.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            op0Var.T0(true);
            top = i11;
        } else {
            op0Var.C2 = childAt.getTop();
            op0Var.T0(false);
        }
        if (tk0Var.getVisibility() == 0) {
            if (tk0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = tk0Var.getChildAt(0);
            for (int i12 = 0; i12 < tk0Var.getChildCount(); i12++) {
                if (tk0Var.getChildAt(i12).getTop() < childAt2.getTop()) {
                    childAt2 = tk0Var.getChildAt(i12);
                }
            }
            ck0 ck0Var2 = (ck0) tk0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.i0.L(8.0f);
            int i13 = (top2 <= 0 || ck0Var2 == null || ck0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || ck0Var2 == null || ck0Var2.b() != 0) {
                op0Var.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                op0Var.T0(true);
                top2 = i13;
            } else {
                op0Var.C2 = childAt2.getTop();
                op0Var.T0(false);
            }
            top = org.telegram.messenger.i0.W1(tk0Var.getAlpha(), top, top2);
        }
        int i14 = op0Var.h2;
        if (i14 != top) {
            op0Var.i2 = i14;
            float f7 = top;
            int i15 = (int) (op0Var.l2 + f7);
            op0Var.h2 = i15;
            oo0Var.setTopGlowOffset(i15);
            int i16 = (int) (op0Var.l2 + f7);
            op0Var.h2 = i16;
            oo0Var2.setTopGlowOffset(i16);
            int i17 = (int) (f7 + op0Var.l2);
            op0Var.h2 = i17;
            tk0Var.setTopGlowOffset(i17);
            op0Var.i1.setTranslationY(op0Var.h2 + op0Var.l2);
            op0Var.I1.setTranslationY(op0Var.h2 + op0Var.l2);
            op0Var.b.invalidate();
        }
    }

    public static int J0(op0 op0Var) {
        oo0 oo0Var = op0Var.x1;
        if (oo0Var.getChildCount() == 0) {
            return -1000;
        }
        int i10 = 0;
        View childAt = oo0Var.getChildAt(0);
        ck0 ck0Var = (ck0) oo0Var.G(childAt);
        if (ck0Var == null) {
            return -1000;
        }
        int paddingTop = oo0Var.getPaddingTop();
        if (ck0Var.c() == 0 && childAt.getTop() >= 0) {
            i10 = childAt.getTop();
        }
        return paddingTop - i10;
    }

    public static op0 N0(Context context, org.telegram.messenger.jj jjVar, String str, boolean z10, String str2) {
        return new op0(context, jjVar != null ? org.telegram.messenger.m5.j(jjVar) : null, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i11 = 0;
        while (i11 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
            int i12 = 6;
            int i13 = i11 == 0 ? 6 : 0;
            if (i11 != itemsCount - 1) {
                i12 = 0;
            }
            org.telegram.ui.ActionBar.a7.R(childAt, org.telegram.ui.ActionBar.t6.a0(w02, i13, i12), null, org.telegram.ui.ActionBar.a7.N(i10), p6Var);
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void K0(boolean z10) {
        h10 h10Var = this.q2;
        org.telegram.ui.ActionBar.n0 n0Var = h10Var.r;
        org.telegram.ui.ActionBar.n0 n0Var2 = h10Var.r;
        boolean isEmpty = TextUtils.isEmpty(n0Var.getText());
        oo0 oo0Var = this.x1;
        oo0 oo0Var2 = this.y1;
        boolean z11 = true;
        if (!isEmpty || ((this.d && n0Var2.hasFocus()) || this.E2)) {
            this.s2 = true;
            if (this.u2 == null) {
                org.telegram.messenger.i0.Y3(oo0Var, false, 0.98f, true, true);
                org.telegram.messenger.i0.W3(oo0Var2, true);
            }
        } else {
            if (this.u2 == null) {
                org.telegram.messenger.i0.Y3(oo0Var, true, 0.98f, true, true);
                org.telegram.messenger.i0.W3(oo0Var2, false);
            }
            z11 = false;
        }
        if (this.D2 != z11 || z10) {
            this.D2 = z11;
            lp0 lp0Var = this.E1;
            lp0Var.f();
            this.C1.f();
            if (this.D2) {
                if (this.C2 == Integer.MAX_VALUE) {
                    ((s4.a0) oo0Var2.getLayoutManager()).h1(0, -oo0Var2.getPaddingTop());
                } else {
                    ((s4.a0) oo0Var2.getLayoutManager()).h1(0, this.C2 - oo0Var2.getPaddingTop());
                }
                lp0Var.E(n0Var2.getText().toString());
                return;
            }
            int i10 = this.C2;
            s4.r rVar = this.z1;
            if (i10 == Integer.MAX_VALUE) {
                rVar.h1(0, 0);
            } else {
                rVar.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public void L() {
        super.L();
        to0 to0Var = this.k1;
        if (to0Var != null) {
            to0Var.o();
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.u2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.u2 = null;
        for (int i10 = 0; i10 < P0().getChildCount(); i10++) {
            View childAt = P0().getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        o1.j jVar = this.t2;
        if (jVar != null) {
            jVar.d();
        }
        P0().setVisibility(0);
        h10 h10Var = this.q2;
        h10Var.setVisibility(0);
        org.telegram.ui.ActionBar.n0 n0Var = h10Var.r;
        if (this.D2 || this.E2) {
            this.v2.H.v = true;
            n0Var.requestFocus();
            org.telegram.messenger.i0.J3(n0Var);
        }
        int[] iArr = new int[2];
        o1.j jVar2 = new o1.j(new o1.i(1000.0f));
        o1.k kVar = new o1.k(0.0f);
        org.telegram.ui.un unVar = this.X1;
        kVar.b((unVar == null || !unVar.b) ? 800.0f : 10.0f);
        kVar.a(1.0f);
        jVar2.m = kVar;
        this.t2 = jVar2;
        jVar2.b(new go0(this, (org.telegram.ui.Cells.h7) view, iArr, 0));
        this.t2.a(new na(this, 5));
        this.t2.h();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.c2 == null && this.g2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            ep0 ep0Var = this.k2;
            if (ep0Var != null) {
                ep0Var.B0();
                return;
            }
            if (this.Y1 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.c2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.Y1).H0(new i2.y(5, z10));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.g2;
        cp0 cp0Var = this.O1;
        if (cp0Var != null) {
            str = strArr[cp0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.c2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        ep epVar = this.W1;
        if (epVar != null && epVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.i0.n0(this.T1)).build().toString();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        return str == null ? "" : str;
    }

    public final tk0 P0() {
        return (this.D2 || this.E2) ? this.y1 : this.x1;
    }

    public final void Q0(View view, int[] iArr, float f7) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        tk0 tk0Var = this.w1;
        tk0Var.setPivotX(width);
        tk0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f10 = 0.25f * f7;
        float f11 = 0.75f + f10;
        tk0Var.setScaleX(f11);
        tk0Var.setScaleY(f11);
        tk0Var.setAlpha(f7);
        tk0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f12 = f10 + 1.0f;
        P0.setScaleX(f12);
        P0.setScaleY(f12);
        float f13 = 1.0f - f7;
        P0.setAlpha(f13);
        h10 h10Var = this.q2;
        h10Var.setPivotX(h10Var.getWidth() / 2.0f);
        h10Var.setPivotY(0.0f);
        float f14 = (0.1f * f13) + 0.9f;
        h10Var.setScaleX(f14);
        h10Var.setScaleY(f14);
        h10Var.setAlpha(f13);
        org.telegram.ui.ActionBar.l lVar = this.r2;
        lVar.getBackButton().setTranslationX((-org.telegram.messenger.i0.L(16.0f)) * f13);
        lVar.getTitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.i0.L(16.0f) * f13);
        lVar.setAlpha(f7);
        tk0Var.getLocationInWindow(iArr);
        float interpolation = gr.g.getInterpolation(f7);
        for (int i10 = 0; i10 < P0.getChildCount(); i10++) {
            View childAt = P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f7, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f13);
                }
            }
        }
        for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
            View childAt2 = tk0Var.getChildAt(i11);
            if (childAt2 instanceof org.telegram.ui.Cells.i7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((tk0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        P0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final int S() {
        return this.b.getMeasuredHeight() - this.P1;
    }

    public final void T0(boolean z10) {
        View[] viewArr = this.K1;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.L1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new zo0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        op0 op0Var;
        ArrayList l4;
        kp0 kp0Var;
        if (dialog instanceof gp0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.h7) && ((org.telegram.ui.Cells.h7) view).F) || ((view instanceof org.telegram.ui.Cells.k6) && ((org.telegram.ui.Cells.k6) view).n0)) {
            Y0(dialog.id, view);
            return;
        }
        tk0 tk0Var = this.w1;
        if (tk0Var.getVisibility() != 8 || (activity = this.Y1) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.o5.z(dialog.id);
        int i10 = this.H1;
        if (z10) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.w3.n(L02) && !L02.megagroup) || i10 == 2 || i10 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String L03 = org.telegram.messenger.cd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L03;
                    if (i10 == 3) {
                        if (org.telegram.messenger.w3.P(10, L0)) {
                            x1Var.T = org.telegram.messenger.cd.L0(2131751085, null);
                        } else {
                            x1Var.T = org.telegram.messenger.cd.L0(2131751086, null);
                        }
                    } else if (i10 != 2) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131752440, null);
                    } else if (this.f2) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131746602, null);
                    } else if (org.telegram.messenger.w3.P(10, L0)) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131751093, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131751094, null);
                    }
                    i0.a.s(null, 2131747847, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.o5.C(dialog.id) && i10 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String L04 = org.telegram.messenger.cd.L0(2131745613, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.R = L04;
            if (i10 == 3) {
                x1Var2.T = org.telegram.messenger.cd.L0(2131744115, null);
            } else if (i10 != 0) {
                x1Var2.T = org.telegram.messenger.cd.L0(2131747191, null);
            } else {
                x1Var2.T = org.telegram.messenger.cd.L0(2131749114, null);
            }
            i0.a.s(null, 2131747847, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.M1;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.N1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(false, true);
            } else if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).b(false, true);
            }
            b1(1);
            op0Var = this;
        } else {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(dialog.id));
            TLRPC.Chat L05 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.h20.u(Z1) && !(((l4 = org.telegram.messenger.vp.r1(this.a).r7.l(-Z1.id)) == null || l4.isEmpty()) && org.telegram.messenger.vp.r1(this.a).r7.e(-Z1.id))) || (org.telegram.messenger.o5.z(dialog.id) && (org.telegram.messenger.w3.c0(L05) || (org.telegram.messenger.w3.p0(L05) && org.telegram.messenger.w3.A(this.a, L05, 24))))) {
                this.u2 = dialog;
                this.A1.h1(0, this.h2 - tk0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                xo0 xo0Var = new xo0(this, dialog, atomicReference, view);
                atomicReference.set(new org.telegram.ui.fp((Object) this, (Object) atomicReference, (Object) xo0Var, (Object) dialog, 20));
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(this.a);
                int i11 = org.telegram.messenger.zs.q5;
                f7.b(xo0Var, i11);
                if (org.telegram.messenger.vp.r1(this.a).r7.l(-dialog.id) != null) {
                    xo0Var.didReceivedNotification(i11, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.vp.r1(this.a).r7.o(-dialog.id);
                    org.telegram.messenger.i0.h3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            op0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(true, true);
            } else if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).b(true, true);
            }
            b1(2);
            long j11 = org.telegram.messenger.d20.i(op0Var.a).n;
            if (op0Var.D2) {
                hp0 hp0Var = op0Var.C1;
                a0.h hVar2 = hp0Var.e;
                ArrayList arrayList = hp0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    hp0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                hp0Var.f();
                op0Var.s2 = false;
                h10 h10Var = op0Var.q2;
                h10Var.r.setText("");
                K0(false);
                org.telegram.messenger.i0.v1(h10Var.r);
            }
        }
        lp0 lp0Var = op0Var.E1;
        if (lp0Var == null || (kp0Var = lp0Var.H) == null) {
            return;
        }
        kp0Var.k(0, kp0Var.b());
    }

    public final void V0(final boolean z10) {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            a0.h hVar = this.M1;
            int m10 = hVar.m();
            so0 so0Var = this.j1;
            to0 to0Var = this.k1;
            if (i12 >= m10) {
                Editable text = to0Var.getText();
                rt rtVar = to0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
                ep epVar = this.W1;
                int i13 = (epVar == null || !epVar.a.q) ? -1 : this.T1;
                ArrayList arrayList = new ArrayList();
                if (this.F1 != null) {
                    i10 = 0;
                    while (i11 < hVar.m()) {
                        long j10 = hVar.j(i11);
                        long M1 = org.telegram.messenger.vp.r1(this.a).M1(j10);
                        if (M1 <= 0) {
                            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.a).H2(j10));
                        }
                        if (so0Var.getTag() != null && rtVar.length() > 0 && M1 > 0) {
                            i10++;
                        }
                        if (M1 > 0) {
                            i10++;
                        }
                        if (M1 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i11++;
                    }
                } else {
                    cp0 cp0Var = this.O1;
                    int i14 = cp0Var != null ? cp0Var.e : 0;
                    if (this.x2 != null) {
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < hVar.m()) {
                            long j11 = hVar.j(i15);
                            long M12 = org.telegram.messenger.vp.r1(this.a).M1(j11);
                            if (M12 <= 0) {
                                M12 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.a).H2(j11));
                            }
                            int i17 = i11;
                            if (this.x2 != null && so0Var.getTag() != null && rtVar.length() > 0 && charSequenceArr[i17] != null && M12 > 0) {
                                i16++;
                            }
                            if (M12 > 0) {
                                i16++;
                            }
                            if (M12 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i15++;
                            i11 = i17;
                        }
                        i10 = i16;
                    } else {
                        int i18 = 0;
                        if (this.G1[i14] != null) {
                            for (int i19 = 0; i19 < hVar.m(); i19++) {
                                long j12 = hVar.j(i19);
                                long M13 = org.telegram.messenger.vp.r1(this.a).M1(j12);
                                if (M13 <= 0) {
                                    M13 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.a).H2(j12));
                                }
                                if (so0Var.getTag() != null && rtVar.length() > 0 && M13 > 0) {
                                    i18++;
                                }
                                if (M13 > 0) {
                                    i18++;
                                }
                                if (M13 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                        }
                        i10 = i18;
                    }
                }
                final int i20 = i13;
                s4.b0(this.a, arrayList, i10, new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.mo0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.p6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        int i21;
                        boolean z11;
                        int i22;
                        HashMap hashMap;
                        long j13;
                        boolean z12;
                        char c10;
                        org.telegram.messenger.jj jjVar;
                        to0 to0Var2;
                        long longValue;
                        boolean z13;
                        boolean z14;
                        long j14;
                        String[] strArr;
                        org.telegram.messenger.jj jjVar2;
                        org.telegram.messenger.oz b10;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i23;
                        boolean z15;
                        long j15;
                        Long l4;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.jj jjVar3;
                        org.telegram.messenger.jj jjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        op0 op0Var = op0.this;
                        String[] strArr2 = op0Var.G1;
                        to0 to0Var3 = op0Var.k1;
                        so0 so0Var2 = op0Var.j1;
                        HashMap hashMap3 = op0Var.N1;
                        Long l10 = 0L;
                        a0.h hVar2 = op0Var.M1;
                        ArrayList arrayList4 = op0Var.F1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z16 = z10;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i24 = 0;
                            boolean z17 = false;
                            while (true) {
                                if (i24 >= hVar2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z18 = z16;
                                long j16 = hVar2.j(i24);
                                boolean x22 = org.telegram.messenger.vp.r1(op0Var.a).x2(j16);
                                so0 so0Var3 = so0Var2;
                                Long l11 = hashMap2 == null ? l10 : (Long) hashMap2.get(Long.valueOf(j16));
                                boolean z19 = (l11 == null || l11.longValue() <= 0) ? z17 : true;
                                Long l12 = l11;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                if (tL_forumTopic2 == null || !x22) {
                                    i23 = i24;
                                    z15 = x22;
                                    j15 = 0;
                                } else {
                                    i23 = i24;
                                    z15 = x22;
                                    j15 = org.telegram.messenger.o5.o(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z15) {
                                    l4 = l10;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    jjVar3 = null;
                                } else {
                                    l4 = l10;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    jjVar3 = new org.telegram.messenger.jj(op0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (jjVar3 != null) {
                                    jjVar3.p = true;
                                }
                                if (so0Var3.getTag() == null || to0Var3.a.length() <= 0) {
                                    jjVar4 = jjVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    jjVar4 = jjVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.oz b11 = org.telegram.messenger.oz.b(charSequence == null ? null : charSequence.toString(), j16, jjVar4, jjVar3, null, true, arrayList7, null, null, z18, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z18 = z18;
                                    b11.Q = l12 == null ? 0L : l12.longValue();
                                    b11.R = j15;
                                    org.telegram.messenger.qz.C(op0Var.a).r0(b11);
                                }
                                boolean z20 = z18;
                                int q02 = org.telegram.messenger.qz.C(op0Var.a).q0(op0Var.F1, j16, !op0Var.A2, false, z20, 0, 0, jjVar4, i20, l12 == null ? 0L : l12.longValue(), j15, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j16));
                                }
                                if (hVar2.m() == 1) {
                                    s4.s0(q02, op0Var.X1, r11);
                                    if (q02 != 0) {
                                        z17 = z19;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i24 = i23 + 1;
                                arrayList5 = arrayList3;
                                z16 = z20;
                                so0Var2 = so0Var3;
                                z17 = z19;
                                l10 = l4;
                                arrayList4 = arrayList2;
                                charSequenceArr3 = charSequenceArr2;
                            }
                            int size = arrayList6.size();
                            int i25 = 0;
                            while (i25 < size) {
                                Object obj2 = arrayList6.get(i25);
                                i25++;
                                long longValue2 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar2.f(longValue2);
                                hVar2.l(longValue2);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!hVar2.i()) {
                                op0Var.R0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z17);
                            }
                        } else {
                            boolean z21 = z16;
                            cp0 cp0Var2 = op0Var.O1;
                            int i26 = cp0Var2 != null ? cp0Var2.e : 0;
                            if (op0Var.x2 != null) {
                                int i27 = 0;
                                boolean z22 = false;
                                while (i27 < hVar2.m()) {
                                    long j17 = hVar2.j(i27);
                                    boolean x23 = org.telegram.messenger.vp.r1(op0Var.a).x2(j17);
                                    Long l13 = hashMap2 == null ? l10 : (Long) hashMap2.get(Long.valueOf(j17));
                                    if (l13 != null && l13.longValue() > 0) {
                                        z22 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic3 == null || !x23) {
                                        z13 = z22;
                                        z14 = x23;
                                        j14 = 0;
                                    } else {
                                        z13 = z22;
                                        z14 = x23;
                                        j14 = org.telegram.messenger.o5.o(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || z14) {
                                        strArr = strArr2;
                                        jjVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        jjVar2 = new org.telegram.messenger.jj(op0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (op0Var.x2 != null) {
                                        if (so0Var2.getTag() != null && to0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.jj jjVar5 = jjVar2;
                                            jjVar2 = jjVar5;
                                            org.telegram.messenger.qz.C(op0Var.a).r0(org.telegram.messenger.oz.b(charSequenceArr3[0].toString(), j17, null, jjVar5, null, true, null, null, null, z21, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.oz.b(null, j17, jjVar2, jjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                        b10.I = op0Var.x2;
                                    } else if (so0Var2.getTag() == null || to0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.oz.b(strArr[i26], j17, jjVar2, jjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z23 = z21;
                                        b10 = org.telegram.messenger.oz.b(charSequence2 == null ? null : charSequence2.toString(), j17, jjVar2, jjVar2, null, true, arrayList5, null, null, z23, 0, 0, null, false);
                                        z21 = z23;
                                    }
                                    b10.Q = l13 == null ? 0L : l13.longValue();
                                    b10.R = j14;
                                    org.telegram.messenger.qz.C(op0Var.a).r0(b10);
                                    i27++;
                                    z22 = z13;
                                    strArr2 = strArr;
                                }
                                z11 = z22;
                            } else if (strArr2[i26] != null) {
                                int i28 = 0;
                                boolean z24 = false;
                                while (i28 < hVar2.m()) {
                                    long j18 = hVar2.j(i28);
                                    boolean x24 = org.telegram.messenger.vp.r1(op0Var.a).x2(j18);
                                    Long l14 = hashMap2 == null ? l10 : (Long) hashMap2.get(Long.valueOf(j18));
                                    if (l14 != null && l14.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic4 == null || !x24) {
                                        i22 = i28;
                                        hashMap = hashMap2;
                                        j13 = 0;
                                    } else {
                                        i22 = i28;
                                        hashMap = hashMap2;
                                        j13 = org.telegram.messenger.o5.o(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || x24) {
                                        z12 = z24;
                                        c10 = 0;
                                        jjVar = null;
                                    } else {
                                        z12 = z24;
                                        c10 = 0;
                                        jjVar = new org.telegram.messenger.jj(op0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (so0Var2.getTag() == null || to0Var3.a.length() <= 0) {
                                        to0Var2 = to0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z25 = z21;
                                        org.telegram.messenger.oz b12 = org.telegram.messenger.oz.b(charSequence3 == null ? null : charSequence3.toString(), j18, jjVar, jjVar, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                        z21 = z25;
                                        if (l14 == null) {
                                            to0Var2 = to0Var3;
                                            longValue = 0;
                                        } else {
                                            to0Var2 = to0Var3;
                                            longValue = l14.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j13;
                                        org.telegram.messenger.qz.C(op0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.jj jjVar6 = jjVar;
                                    org.telegram.messenger.oz b13 = org.telegram.messenger.oz.b(strArr2[i26], j18, jjVar6, jjVar6, null, true, null, null, null, z21, 0, 0, null, false);
                                    b13.Q = l14 == null ? 0L : l14.longValue();
                                    b13.R = j13;
                                    org.telegram.messenger.qz.C(op0Var.a).r0(b13);
                                    i28 = i22 + 1;
                                    to0Var3 = to0Var2;
                                    hashMap2 = hashMap;
                                    z24 = z12;
                                }
                                z11 = z24;
                            } else {
                                i21 = 0;
                                z11 = false;
                                op0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i21)), !z11);
                            }
                            i21 = 0;
                            op0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i21)), !z11);
                        }
                        ep0 ep0Var = op0Var.k2;
                        if (ep0Var != null) {
                            ep0Var.V();
                        }
                        op0Var.dismiss();
                    }
                });
                return;
            }
            if (s4.h(getContext(), this.a, hVar.j(i12), so0Var.getTag() != null && to0Var.a.length() > 0)) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void X0(boolean z10) {
        so0 so0Var = this.j1;
        if (z10 == (so0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.v1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        so0Var.setTag(z10 ? 1 : null);
        to0 to0Var = this.k1;
        if (to0Var.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(to0Var.getEditText());
        }
        to0Var.k(true);
        FrameLayout frameLayout = this.U1;
        so0 so0Var2 = this.m1;
        FrameLayout frameLayout2 = this.n1;
        if (z10) {
            so0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            so0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.h0.a;
            frameLayout2.setImportantForAccessibility(i10);
        }
        LinearLayout linearLayout = this.u1;
        if (linearLayout != null) {
            int i11 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.h0.a;
            linearLayout.setImportantForAccessibility(i11);
        }
        this.v1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f7 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(so0Var, (Property<so0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, (Property<so0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, (Property<so0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(so0Var2, (Property<so0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.K1[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.q1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.Z1 && z10) {
                f7 = org.telegram.messenger.i0.L(this.V1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f7));
        }
        this.v1.playTogether(arrayList);
        this.v1.setInterpolator(new DecelerateInterpolator());
        this.v1.setDuration(180L);
        this.v1.addListener(new zo0(this, z10, 1));
        this.v1.start();
    }

    public final void Y0(long j10, View view) {
        int i10 = -this.z2;
        this.z2 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.D.a();
        String p5 = j10 >= 0 ? org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(this.a).Z1(Long.valueOf(j10))) : "";
        boolean A3 = org.telegram.messenger.vp.r1(this.a).A3();
        int i11 = 1;
        FrameLayout frameLayout = this.s1;
        (A3 ? new cc(frameLayout, this.I0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, p5))) : new cc(frameLayout, this.I0).K(R.raw.star_premium_2, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743786, p5)), org.telegram.messenger.cd.L0(2131743785, null), new jo0(this, i11))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.m1 m1Var;
        so0 so0Var = this.j1;
        if (so0Var == null) {
            return;
        }
        to0 to0Var = this.k1;
        if (to0Var == null || !to0Var.m()) {
            bp0 bp0Var = this.v2;
            if (bp0Var != null && (m1Var = bp0Var.H) != null && !m1Var.f) {
                org.telegram.messenger.i0.L(20.0f);
            }
        } else {
            to0Var.getEmojiPaddingShown();
        }
        float f7 = 0.0f;
        FrameLayout frameLayout = this.U1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f7 = 0.0f + org.telegram.messenger.i0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.n1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f7);
        }
        float f10 = -f7;
        so0Var.setTranslationY(f10);
        this.m1.setTranslationY(f10);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.u5 u5Var = this.r1;
        if (u5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            u5Var.l(O0, false);
        }
    }

    public final void b1(int i10) {
        a0.h hVar = this.M1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.F1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.j1.getTag();
        to0 to0Var = this.k1;
        if (tag != null && to0Var.a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i11)).id;
            long M1 = org.telegram.messenger.vp.r1(this.a).M1(j11);
            if (M1 <= 0) {
                M1 = org.telegram.messenger.o5.k(org.telegram.messenger.vp.r1(this.a).H2(j11));
            }
            j10 += M1;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i10 != 0;
        bi.f2 f2Var = this.l1;
        f2Var.g(max, z10);
        f2Var.i(size, j10, i10 != 0);
        X0(true);
        to0Var.setPadding(0, 0, Math.max(org.telegram.messenger.i0.L(84.0f), f2Var.l()), 0);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.s;
        if (i10 == i12) {
            hp0 hp0Var = this.C1;
            if (hp0Var != null) {
                hp0Var.E();
            }
            org.telegram.messenger.zs.f(this.a).n(this, i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        to0 to0Var = this.k1;
        if (to0Var != null) {
            org.telegram.messenger.i0.v1(to0Var.getEditText());
        }
        this.Q1 = false;
        super.dismiss();
        org.telegram.messenger.zs.f(this.a).n(this, org.telegram.messenger.zs.s);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        if (this.u2 != null) {
            L0();
            return;
        }
        to0 to0Var = this.k1;
        if (to0Var == null || !to0Var.e) {
            super.onBackPressed();
        } else {
            to0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            hi.c cVar = this.H2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0));
            }
            org.telegram.ui.ActionBar.p2 p2Var = this.c;
            if (p2Var != null) {
                boolean z10 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) > 0.721f;
                if (z10 != this.P2) {
                    this.P2 = z10;
                    org.telegram.messenger.i0.n3(p2Var, z10);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public op0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public op0(Context context, org.telegram.ui.un unVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        int i10;
        float f7;
        oo0 oo0Var;
        float f10;
        int i11;
        LinearLayout linearLayout;
        int i12 = 1;
        final int i13 = 2;
        String[] strArr = new String[2];
        this.G1 = strArr;
        this.K1 = new View[2];
        this.L1 = new AnimatorSet[2];
        this.M1 = new a0.h();
        this.N1 = new HashMap();
        this.P1 = -1;
        final int i14 = 0;
        this.Q1 = false;
        new RectF();
        new Paint(1);
        this.b2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.g2 = strArr2;
        this.w2 = new ArrayList();
        int i15 = 4;
        int i16 = 4;
        while (true) {
            if (i16 >= 32) {
                i10 = 80;
                break;
            }
            i10 = (1 << i16) - 12;
            if (80 <= i10) {
                break;
            } else {
                i16++;
            }
        }
        int i17 = i10 / 8;
        long[] jArr = new long[i17];
        Object[] objArr = new Object[i17];
        this.y2 = i0.c.e;
        this.z2 = 4;
        this.A2 = true;
        this.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.i0.S(getWindow());
        hi.c d = this.X0.d(new io0(this, i15));
        this.H2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f()) {
            tg.f fVar = new tg.f(false);
            this.G2 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(d);
            fVar2.f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(d);
            fVar3.f = d;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2);
            this.I2 = bVar;
            bVar.i = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.b = L;
            bVar.c = L;
            bVar.h = this.X0;
            tg.b bVar2 = new tg.b(fVar3);
            this.J2 = bVar2;
            bVar2.i = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.b = L2;
            bVar2.c = L2;
            ei.r rVar = this.X0;
            bVar2.h = rVar;
            tg.b bVar3 = new tg.b(d);
            this.K2 = bVar3;
            bVar3.h = rVar;
        } else {
            this.G2 = null;
            tg.b bVar4 = new tg.b(d);
            bVar4.h = this.X0;
            this.J2 = bVar4;
            this.I2 = bVar4;
            this.K2 = bVar4;
        }
        this.I0 = p6Var;
        this.R1 = z13;
        this.Y1 = org.telegram.messenger.i0.W(context);
        this.Z1 = z12;
        if (z12) {
            this.I0 = new ro0(i14);
        }
        d.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0));
        this.X1 = unVar;
        Drawable f11 = i0.a.f(context, R.drawable.sheet_shadow_round);
        this.J1 = f11;
        int i18 = org.telegram.ui.ActionBar.t6.h5;
        this.a0 = i18;
        f11.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i18, this.I0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.V = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(0);
            String r10 = org.telegram.messenger.o5.r(org.telegram.messenger.vp.r1(this.a).d2(org.telegram.messenger.jj.B0(jjVar.k)));
            if (!TextUtils.isEmpty(r10)) {
                StringBuilder sb2 = new StringBuilder("https://");
                c3.i0.r(sb2, org.telegram.messenger.vp.r1(this.a).U2, "/", r10, "/");
                sb2.append(jjVar.f1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && jjVar.z2()) {
                    strArr2[0] = a1.g.r(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.F1 = arrayList;
        this.E1 = new lp0(this, context);
        this.f2 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.F = true;
        this.y0 = new org.telegram.ui.i0(this, i12);
        int i19 = 3;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.F1.get(i20);
                if (jjVar2.D4()) {
                    this.H1 = 3;
                } else if (jjVar2.T3()) {
                    int i21 = jjVar2.Z3() ? 2 : 1;
                    this.H1 = i21;
                    if (i21 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z10) {
            this.d2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.jj) arrayList.get(0)).f1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.vp.r1(this.a).g1(((org.telegram.messenger.jj) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new t20(i19, this, context));
        }
        bp0 bp0Var = new bp0(this, context);
        this.v2 = bp0Var;
        this.b = bp0Var;
        bp0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i22 = this.t0;
        viewGroup.setPadding(i22, 0, i22, this.y2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.y2(this));
        if (this.Z1 && this.g2[1] != null) {
            cp0 cp0Var = new cp0(this, context);
            this.O1 = cp0Var;
            frameLayout.addView(cp0Var, w7.b6.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        h10 h10Var = new h10(context, this.I0);
        this.q2 = h10Var;
        vo0 vo0Var = new vo0(this, i12);
        org.telegram.ui.ActionBar.n0 n0Var = h10Var.r;
        n0Var.addTextChangedListener(vo0Var);
        n0Var.setHint(org.telegram.messenger.cd.L0(2131745458, null));
        int i23 = 7;
        n0Var.setOnEditorActionListener(new t0(this, i23));
        h10Var.setCloseButtonOnClickListener(new jo0(this, i14));
        frameLayout.addView(h10Var, w7.b6.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.r2 = lVar;
        lVar.setOccupyStatusBar(false);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i24 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i24, this.I0);
        org.telegram.ui.ActionBar.a7.m(lVar, 6, org.telegram.ui.ActionBar.t6.q5, this.I0);
        org.telegram.ui.ActionBar.a7.m(lVar, 1, org.telegram.ui.ActionBar.t6.z6, null);
        org.telegram.ui.ActionBar.a7.m(lVar, 3, org.telegram.ui.ActionBar.t6.u8, null);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 8));
        lVar.setVisibility(8);
        frameLayout.addView(lVar, w7.b6.e(-1, 58, 83));
        tk0 tk0Var = new tk0(context, this.I0);
        this.w1 = tk0Var;
        s4.r rVar2 = new s4.r(4);
        this.A1 = rVar2;
        tk0Var.setLayoutManager(rVar2);
        rVar2.O = new po0(this, i13);
        tk0Var.setOnScrollListener(new qo0(this, i13));
        mp0 mp0Var = new mp0(this, context);
        this.D1 = mp0Var;
        tk0Var.setAdapter(mp0Var);
        int i25 = org.telegram.ui.ActionBar.t6.A5;
        org.telegram.ui.ActionBar.a7.m(tk0Var, 21, i25, this.I0);
        tk0Var.setVerticalScrollBarEnabled(false);
        tk0Var.setHorizontalScrollBarEnabled(false);
        tk0Var.setOverScrollMode(2);
        tk0Var.setSelectorDrawableColor(0);
        int i26 = 23;
        tk0Var.setItemSelectorColorProvider(new au(i26));
        tk0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        tk0Var.setClipToPadding(false);
        tk0Var.i(new dh.g(6));
        tk0Var.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.ko0
            public final /* synthetic */ op0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i27, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i14) {
                    case 0:
                        op0 op0Var = this.b;
                        h10 h10Var2 = op0Var.q2;
                        HashMap hashMap = op0Var.N1;
                        a0.h hVar = op0Var.M1;
                        hp0 hp0Var = op0Var.C1;
                        mp0 mp0Var2 = op0Var.D1;
                        if (mp0Var2.d && i27 == 1) {
                            TLRPC.Dialog dialog2 = op0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var.e.f(dialog2.id)) == null) {
                                        hp0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = hp0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    hp0Var.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i28 = 0; i28 < op0Var.P0().getChildCount(); i28++) {
                                    View childAt = op0Var.P0().getChildAt(i28);
                                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                        if (h7Var.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var.d(null, false, true);
                                            h7Var.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mp0Var2.E(i27);
                            if (E != null && (dialog = op0Var.u2) != null) {
                                long j10 = dialog.id;
                                boolean x22 = org.telegram.messenger.vp.r1(op0Var.a).x2(j10);
                                TLRPC.Dialog dialog3 = op0Var.u2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var.e.f(dialog3.id)) == null) {
                                        hp0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = hp0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    hp0Var.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i29 = 0; i29 < op0Var.P0().getChildCount(); i29++) {
                                    View childAt2 = op0Var.P0().getChildAt(i29);
                                    if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                                        if (h7Var2.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var2.d(E, x22, true);
                                            h7Var2.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i27 >= 0) {
                            op0 op0Var2 = this.b;
                            ArrayList arrayList4 = op0Var2.C1.d;
                            int i30 = i27 - 1;
                            TLRPC.Dialog dialog4 = (i30 < 0 || i30 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i30);
                            if (dialog4 != null) {
                                op0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i27 >= 0) {
                            op0 op0Var3 = this.b;
                            lp0 lp0Var = op0Var3.E1;
                            op0 op0Var4 = lp0Var.K;
                            int i31 = lp0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i27 < i31 || i31 < 0) {
                                int i32 = i27 - 1;
                                if (i32 >= 0) {
                                    if (i32 < lp0Var.d.size()) {
                                        dialog5 = ((dp0) lp0Var.d.get(i32)).a;
                                    } else {
                                        int size2 = i32 - lp0Var.d.size();
                                        ArrayList arrayList5 = lp0Var.e.d;
                                        if (size2 < arrayList5.size()) {
                                            TLObject tLObject = (TLObject) arrayList5.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog5 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog5 == null) {
                                    op0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i33 = i27 - i31;
                                if (i33 >= 0 && i33 < op0Var4.w2.size()) {
                                    TLObject tLObject2 = ((zf.y) op0Var4.w2.get(i33)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog5 = tL_dialog;
                                }
                                if (dialog5 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        tk0Var.setVisibility(8);
        this.b.addView(tk0Var, w7.b6.e(-1, -1, 51));
        oo0 oo0Var2 = new oo0(this, context, this.I0, i14);
        this.x1 = oo0Var2;
        oo0Var2.setSelectorDrawableColor(0);
        oo0Var2.setItemSelectorColorProvider(new au(i26));
        oo0Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        oo0Var2.setClipToPadding(false);
        getContext();
        s4.r rVar3 = new s4.r(4);
        this.z1 = rVar3;
        oo0Var2.setLayoutManager(rVar3);
        this.L2 = new qg(this, i13);
        rVar3.O = new po0(this, i14);
        oo0Var2.setHorizontalScrollBarEnabled(false);
        oo0Var2.setVerticalScrollBarEnabled(false);
        oo0Var2.setOverScrollMode(2);
        oo0Var2.i(new dh.g(i23));
        this.b.addView(oo0Var2, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        hp0 hp0Var = new hp0(this, context);
        this.C1 = hp0Var;
        oo0Var2.setAdapter(hp0Var);
        org.telegram.ui.ActionBar.a7.m(oo0Var2, 21, i25, this.I0);
        final int i27 = 1;
        oo0Var2.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.ko0
            public final /* synthetic */ op0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i272, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i27) {
                    case 0:
                        op0 op0Var = this.b;
                        h10 h10Var2 = op0Var.q2;
                        HashMap hashMap = op0Var.N1;
                        a0.h hVar = op0Var.M1;
                        hp0 hp0Var2 = op0Var.C1;
                        mp0 mp0Var2 = op0Var.D1;
                        if (mp0Var2.d && i272 == 1) {
                            TLRPC.Dialog dialog2 = op0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var2.e.f(dialog2.id)) == null) {
                                        hp0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = hp0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    hp0Var2.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i28 = 0; i28 < op0Var.P0().getChildCount(); i28++) {
                                    View childAt = op0Var.P0().getChildAt(i28);
                                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                        if (h7Var.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var.d(null, false, true);
                                            h7Var.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mp0Var2.E(i272);
                            if (E != null && (dialog = op0Var.u2) != null) {
                                long j10 = dialog.id;
                                boolean x22 = org.telegram.messenger.vp.r1(op0Var.a).x2(j10);
                                TLRPC.Dialog dialog3 = op0Var.u2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var2.e.f(dialog3.id)) == null) {
                                        hp0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = hp0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    hp0Var2.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i29 = 0; i29 < op0Var.P0().getChildCount(); i29++) {
                                    View childAt2 = op0Var.P0().getChildAt(i29);
                                    if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                                        if (h7Var2.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var2.d(E, x22, true);
                                            h7Var2.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i272 >= 0) {
                            op0 op0Var2 = this.b;
                            ArrayList arrayList4 = op0Var2.C1.d;
                            int i30 = i272 - 1;
                            TLRPC.Dialog dialog4 = (i30 < 0 || i30 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i30);
                            if (dialog4 != null) {
                                op0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i272 >= 0) {
                            op0 op0Var3 = this.b;
                            lp0 lp0Var = op0Var3.E1;
                            op0 op0Var4 = lp0Var.K;
                            int i31 = lp0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i272 < i31 || i31 < 0) {
                                int i32 = i272 - 1;
                                if (i32 >= 0) {
                                    if (i32 < lp0Var.d.size()) {
                                        dialog5 = ((dp0) lp0Var.d.get(i32)).a;
                                    } else {
                                        int size2 = i32 - lp0Var.d.size();
                                        ArrayList arrayList5 = lp0Var.e.d;
                                        if (size2 < arrayList5.size()) {
                                            TLObject tLObject = (TLObject) arrayList5.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog5 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog5 == null) {
                                    op0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i33 = i272 - i31;
                                if (i33 >= 0 && i33 < op0Var4.w2.size()) {
                                    TLObject tLObject2 = ((zf.y) op0Var4.w2.get(i33)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog5 = tL_dialog;
                                }
                                if (dialog5 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        oo0Var2.setOnScrollListener(new qo0(this, i14));
        this.X0.b(oo0Var2);
        oo0 oo0Var3 = new oo0(this, context, this.I0, i27);
        this.y1 = oo0Var3;
        oo0Var3.setItemSelectorColorProvider(new au(i26));
        oo0Var3.setSelectorDrawableColor(0);
        oo0Var3.setPadding(0, 0, 0, org.telegram.messenger.i0.L(48.0f));
        oo0Var3.setClipToPadding(false);
        getContext();
        zy zyVar = new zy(4, 0, oo0Var3);
        this.B1 = zyVar;
        oo0Var3.setLayoutManager(zyVar);
        int i28 = 1;
        zyVar.O = new po0(this, i28);
        oo0Var3.setOnItemClickListener(new gk0(this) { // from class: org.telegram.ui.Components.ko0
            public final /* synthetic */ op0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i272, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        op0 op0Var = this.b;
                        h10 h10Var2 = op0Var.q2;
                        HashMap hashMap = op0Var.N1;
                        a0.h hVar = op0Var.M1;
                        hp0 hp0Var2 = op0Var.C1;
                        mp0 mp0Var2 = op0Var.D1;
                        if (mp0Var2.d && i272 == 1) {
                            TLRPC.Dialog dialog2 = op0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var2.e.f(dialog2.id)) == null) {
                                        hp0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = hp0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    hp0Var2.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i282 = 0; i282 < op0Var.P0().getChildCount(); i282++) {
                                    View childAt = op0Var.P0().getChildAt(i282);
                                    if (childAt instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                                        if (h7Var.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var.d(null, false, true);
                                            h7Var.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mp0Var2.E(i272);
                            if (E != null && (dialog = op0Var.u2) != null) {
                                long j10 = dialog.id;
                                boolean x22 = org.telegram.messenger.vp.r1(op0Var.a).x2(j10);
                                TLRPC.Dialog dialog3 = op0Var.u2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                op0Var.b1(2);
                                if (op0Var.D2 || op0Var.E2) {
                                    if (((TLRPC.Dialog) hp0Var2.e.f(dialog3.id)) == null) {
                                        hp0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = hp0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    hp0Var2.f();
                                    op0Var.s2 = false;
                                    h10Var2.r.setText("");
                                    op0Var.K0(false);
                                }
                                for (int i29 = 0; i29 < op0Var.P0().getChildCount(); i29++) {
                                    View childAt2 = op0Var.P0().getChildAt(i29);
                                    if (childAt2 instanceof org.telegram.ui.Cells.h7) {
                                        org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) childAt2;
                                        if (h7Var2.getCurrentDialog() == op0Var.u2.id) {
                                            h7Var2.d(E, x22, true);
                                            h7Var2.b(true, true);
                                        }
                                    }
                                }
                                op0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i272 >= 0) {
                            op0 op0Var2 = this.b;
                            ArrayList arrayList4 = op0Var2.C1.d;
                            int i30 = i272 - 1;
                            TLRPC.Dialog dialog4 = (i30 < 0 || i30 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i30);
                            if (dialog4 != null) {
                                op0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i272 >= 0) {
                            op0 op0Var3 = this.b;
                            lp0 lp0Var = op0Var3.E1;
                            op0 op0Var4 = lp0Var.K;
                            int i31 = lp0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i272 < i31 || i31 < 0) {
                                int i32 = i272 - 1;
                                if (i32 >= 0) {
                                    if (i32 < lp0Var.d.size()) {
                                        dialog5 = ((dp0) lp0Var.d.get(i32)).a;
                                    } else {
                                        int size2 = i32 - lp0Var.d.size();
                                        ArrayList arrayList5 = lp0Var.e.d;
                                        if (size2 < arrayList5.size()) {
                                            TLObject tLObject = (TLObject) arrayList5.get(size2);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog5 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog5 == null) {
                                    op0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i33 = i272 - i31;
                                if (i33 >= 0 && i33 < op0Var4.w2.size()) {
                                    TLObject tLObject2 = ((zf.y) op0Var4.w2.get(i33)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog5 = tL_dialog;
                                }
                                if (dialog5 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        oo0Var3.setHasFixedSize(true);
        oo0Var3.setItemAnimator(null);
        oo0Var3.setHorizontalScrollBarEnabled(false);
        oo0Var3.setVerticalScrollBarEnabled(false);
        oo0Var3.setOnScrollListener(new qo0(this, i28));
        oo0Var3.i(new dh.g(8));
        oo0Var3.setAdapter(this.E1);
        org.telegram.ui.ActionBar.a7.m(oo0Var3, 21, i25, this.I0);
        this.p2 = new wj0(oo0Var3, true);
        zz zzVar = new zz(context, this.I0);
        zzVar.setViewType(12);
        dw0 dw0Var = new dw0(context, zzVar, 1, this.I0);
        this.I1 = dw0Var;
        dw0Var.addView(zzVar, 0);
        dw0Var.setAnimateLayoutChange(true);
        dw0Var.e(false, false);
        boolean z14 = this.Z1;
        nh.p pVar = dw0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.a7.V(pVar, org.telegram.ui.ActionBar.t6.bh, this.I0);
        }
        pVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
        oo0Var3.setEmptyView(dw0Var);
        oo0Var3.setHideIfEmpty(false);
        oo0Var3.W1 = true;
        oo0Var3.X1 = 0;
        this.b.addView(dw0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(oo0Var3, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.t0 t0Var = new bi.t0(this, context, 17);
        this.p1 = t0Var;
        this.b.addView(t0Var, w7.b6.e(-1, org.telegram.messenger.zs.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L((!this.Z1 || this.g2[1] == null) ? 58.0f : 111.0f);
        this.K1[0] = new View(context);
        View view = this.K1[0];
        int i29 = org.telegram.ui.ActionBar.t6.V5;
        org.telegram.ui.ActionBar.a7.i(i29, view, this.I0);
        this.K1[0].setAlpha(0.0f);
        this.K1[0].setTag(1);
        this.b.addView(this.K1[0], layoutParams);
        this.b.addView(frameLayout, w7.b6.e(-1, (!this.Z1 || this.g2[1] == null) ? 58 : org.telegram.messenger.zs.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(48.0f);
        this.K1[1] = new View(context);
        org.telegram.ui.ActionBar.a7.i(i29, this.K1[1], this.I0);
        this.K1[1].setLayoutParams(layoutParams2);
        if (!this.f2 && this.g2[0] == null) {
            this.K1[1].setAlpha(0.0f);
            oo0Var = oo0Var3;
            f7 = 4.0f;
            f10 = 9.0f;
        } else {
            f7 = 4.0f;
            if (this.Z1) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n1 = frameLayout2;
                f10 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.q1 = frameLayout3;
                frameLayout2.addView(frameLayout3, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                w7.e6.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new ho0(this, 4));
                org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
                this.r1 = u5Var;
                u5Var.setTextSize(15);
                org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.Hl, this.I0);
                u5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(u5Var, w7.b6.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, this.I0);
                textView.setText(org.telegram.messenger.cd.L0(2131751767, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setGravity(17);
                int i30 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i30, this.I0), 4, 4);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i30);
                org.telegram.ui.ActionBar.p6 p6Var2 = this.I0;
                textView.setBackground(a02);
                oo0Var = oo0Var3;
                org.telegram.ui.ActionBar.a7.k(textView, a02, null, N, p6Var2);
                linearLayout3.addView(textView, w7.b6.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new ho0(this, 5));
                w7.e6.a(textView);
                this.b.addView(frameLayout2, w7.b6.e(-1, 58, 83));
                ArrayList arrayList2 = this.F1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.jj) this.F1.get(0)).k != null && ((org.telegram.messenger.jj) this.F1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.F1.get(0);
                    if (org.telegram.messenger.w3.N(org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-org.telegram.messenger.jj.B0(jjVar3.k)))) && !org.telegram.messenger.jj.l3(jjVar3.k)) {
                        final int i31 = 0;
                        linearLayout = org.telegram.messenger.m5.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.no0
                            public final /* synthetic */ op0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i31) {
                                    case 0:
                                        op0 op0Var = this.b;
                                        org.telegram.ui.ActionBar.k2 k2Var = op0Var.X1;
                                        if (k2Var == null) {
                                            k2Var = LaunchActivity.T();
                                        }
                                        if (k2Var != null) {
                                            op0Var.dismiss();
                                            k2Var.presentFragment(new org.telegram.ui.sh0(jjVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        op0 op0Var2 = this.b;
                                        org.telegram.ui.ActionBar.k2 k2Var2 = op0Var2.X1;
                                        if (k2Var2 == null) {
                                            k2Var2 = LaunchActivity.T();
                                        }
                                        if (k2Var2 != null) {
                                            op0Var2.dismiss();
                                            k2Var2.presentFragment(new org.telegram.ui.sh0(jjVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i30, this.I0), 6, 6);
                        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i30);
                        org.telegram.ui.ActionBar.p6 p6Var3 = this.I0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.a7.k(linearLayout, a03, null, N2, p6Var3);
                        w7.e6.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i32 = org.telegram.ui.ActionBar.t6.Jl;
                        org.telegram.ui.ActionBar.a7.t(imageView, i32, this.I0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, w7.b6.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.a7.V(textView2, i32, this.I0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.cd.E(jjVar3.k.forwards, ','));
                        linearLayout.addView(textView2, w7.b6.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i11 = 8;
                        linearLayout2.addView(linearLayout3, w7.b6.q(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, w7.b6.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                i11 = 11;
                linearLayout = null;
                linearLayout2.addView(linearLayout3, w7.b6.q(-1, 42, 1.0f, 23, 11, 0, i11, 0));
                if (linearLayout != null) {
                }
            } else {
                oo0Var = oo0Var3;
                f10 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.n1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.q1 = frameLayout5;
                frameLayout4.addView(frameLayout5, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i33 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i33, this.I0), 20, 20);
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i33);
                org.telegram.ui.ActionBar.p6 p6Var4 = this.I0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.a7.k(textView3, a04, null, N3, p6Var4);
                org.telegram.ui.ActionBar.a7.V(textView3, this.Z1 ? org.telegram.ui.ActionBar.t6.dh : org.telegram.ui.ActionBar.t6.n5, this.I0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.i0.o());
                textView3.setGravity(17);
                if (this.Z1 && this.g2[1] != null) {
                    textView3.setText(org.telegram.messenger.cd.L0(2131743413, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.cd.L0(2131751762, null).toUpperCase());
                }
                textView3.setOnClickListener(new ho0(this, 6));
                frameLayout5.addView(textView3, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
                this.b.addView(frameLayout4, w7.b6.e(-1, 58, 87));
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.jj) this.F1.get(0)).k != null && ((org.telegram.messenger.jj) this.F1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) this.F1.get(0);
                    if (org.telegram.messenger.w3.N(org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-org.telegram.messenger.jj.B0(jjVar4.k)))) && !jjVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.u1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.a7.R(linearLayout4, org.telegram.ui.ActionBar.t6.a0(W(this.Z1 ? org.telegram.ui.ActionBar.t6.Sg : i33), 20, 20), null, org.telegram.ui.ActionBar.a7.N(this.Z1 ? org.telegram.ui.ActionBar.t6.Sg : i33), this.I0);
                        frameLayout5.addView(linearLayout4, w7.b6.e(-2, -1, 21));
                        final int i34 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.no0
                            public final /* synthetic */ op0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i34) {
                                    case 0:
                                        op0 op0Var = this.b;
                                        org.telegram.ui.ActionBar.k2 k2Var = op0Var.X1;
                                        if (k2Var == null) {
                                            k2Var = LaunchActivity.T();
                                        }
                                        if (k2Var != null) {
                                            op0Var.dismiss();
                                            k2Var.presentFragment(new org.telegram.ui.sh0(jjVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        op0 op0Var2 = this.b;
                                        org.telegram.ui.ActionBar.k2 k2Var2 = op0Var2.X1;
                                        if (k2Var2 == null) {
                                            k2Var2 = LaunchActivity.T();
                                        }
                                        if (k2Var2 != null) {
                                            op0Var2.dismiss();
                                            k2Var2.presentFragment(new org.telegram.ui.sh0(jjVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.a7.t(imageView2, this.Z1 ? org.telegram.ui.ActionBar.t6.dh : org.telegram.ui.ActionBar.t6.n5, this.I0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, w7.b6.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(jjVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.a7.V(textView4, this.Z1 ? org.telegram.ui.ActionBar.t6.dh : org.telegram.ui.ActionBar.t6.n5, this.I0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.i0.o());
                        linearLayout4.addView(textView4, w7.b6.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.s1 = frameLayout6;
        this.b.addView(frameLayout6, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.q1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.t1 = frameLayout7;
        this.b.addView(frameLayout7, w7.b6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        so0 so0Var = new so0(this, context, 0);
        this.j1 = so0Var;
        so0Var.setWillNotDraw(false);
        so0Var.setAlpha(0.0f);
        so0Var.setVisibility(4);
        this.b.addView(so0Var, w7.b6.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        so0Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(21));
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        boolean z15 = org.telegram.messenger.i0.B(W(org.telegram.ui.ActionBar.t6.h5)) > 0.721f;
        this.P2 = z15;
        org.telegram.messenger.i0.n3(p2Var, z15);
        to0 to0Var = new to0(this, context, bp0Var, this.I0);
        this.k1 = to0Var;
        to0Var.J = true;
        if (this.Z1) {
            mt editText = to0Var.getEditText();
            int i35 = org.telegram.ui.ActionBar.t6.bh;
            editText.setTextColor(W(i35));
            to0Var.getEditText().setCursorColor(W(i35));
        }
        to0Var.setHint(org.telegram.messenger.cd.K0(2131745480));
        to0Var.s();
        to0Var.setPadding(0, 0, org.telegram.messenger.i0.L(84.0f), 0);
        so0Var.addView(to0Var, w7.b6.e(-1, -2, 51));
        so0Var.setClipChildren(false);
        so0Var.setClipToPadding(false);
        to0Var.setClipChildren(false);
        to0Var.getEditText().addTextChangedListener(new vo0(this, 0));
        so0 so0Var2 = new so0(this, context, 1);
        this.m1 = so0Var2;
        so0Var2.setFocusable(true);
        so0Var2.setFocusableInTouchMode(true);
        so0Var2.setVisibility(4);
        so0Var2.setScaleX(0.2f);
        so0Var2.setScaleY(0.2f);
        so0Var2.setAlpha(0.0f);
        this.b.addView(so0Var2, w7.b6.e(org.telegram.messenger.zs.v1, 50, 85));
        bi.f2 f2Var = new bi.f2(this, context, this.I0);
        this.l1 = f2Var;
        int L3 = org.telegram.messenger.i0.L(52.0f);
        int L4 = org.telegram.messenger.i0.L(38.0f);
        f2Var.I = L3;
        f2Var.J = L4;
        float L5 = org.telegram.messenger.i0.L(1.0f);
        float L6 = org.telegram.messenger.i0.L(6.0f);
        f2Var.M = L5;
        f2Var.N = L6;
        f2Var.h0 = true;
        so0Var2.addView(f2Var, w7.b6.g());
        f2Var.setOnClickListener(new ho0(this, 0));
        f2Var.setOnLongClickListener(new r00(this, 2));
        this.b2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        this.b2.setTypeface(org.telegram.messenger.i0.o());
        if (num != null) {
            this.T1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.U1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.V1 = linearLayout5;
            linearLayout5.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(f7));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i36 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(linearLayout5, org.telegram.ui.ActionBar.t6.a0(W(i36), 6, 6), null, org.telegram.ui.ActionBar.a7.N(i36), this.I0);
            ep epVar = new ep(24, context, this.I0);
            this.W1 = epVar;
            epVar.b(org.telegram.ui.ActionBar.t6.h7, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.k7);
            epVar.setDrawUnchecked(true);
            epVar.a(false, false);
            epVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView5, i24, this.I0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.cd.Z(2131743607, org.telegram.messenger.i0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
            w7.e6.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new ho0(this, 1));
            frameLayout8.addView(linearLayout5, w7.b6.e(-2, -2, 17));
            if (this.n1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view2, this.I0);
                frameLayout8.addView(view2, w7.b6.a(-1.0f, this.Z1 ? 0.66f : 1.0f / org.telegram.messenger.i0.p, 55));
            }
            this.b.addView(frameLayout8, w7.b6.e(-1, 58, 83));
            if (this.n1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        tg.c cVar = new tg.c(this.K2.b(t0Var, null));
        this.N2 = cVar;
        if (org.telegram.messenger.tz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        cVar.b(org.telegram.messenger.i0.L(72.0f), true);
        vg.f b10 = this.J2.b(this.v2, w7.b9.e(this.I0));
        this.M2 = b10;
        b10.O = true;
        b10.r(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(29.0f), 0.0f, 0.0f);
        b10.t(org.telegram.messenger.i0.L(32.0f));
        b10.M.g = 0.4f;
        b10.m();
        vg.f b11 = this.I2.b(so0Var, w7.b9.e(this.I0));
        this.O2 = b11;
        b11.q(org.telegram.messenger.i0.L(22.0f));
        b11.p(org.telegram.messenger.i0.L(f10));
        so0Var.setPadding(org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(7.0f));
        FrameLayout frameLayout9 = this.q1;
        if (frameLayout9 != null) {
            vg.f b12 = this.I2.b(frameLayout9, w7.b9.e(this.I0));
            b12.p(org.telegram.messenger.i0.L(f10));
            b12.q(org.telegram.messenger.i0.L(22.0f));
            this.q1.setBackground(b12);
            this.q1.setPadding(org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
        }
        FrameLayout frameLayout10 = this.U1;
        if (frameLayout10 != null) {
            vg.f b13 = this.I2.b(frameLayout10, w7.b9.e(this.I0));
            b13.p(org.telegram.messenger.i0.L(f10));
            b13.q(org.telegram.messenger.i0.L(22.0f));
            this.U1.setBackground(b13);
            this.U1.setPadding(org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10));
        }
        b1(0);
        org.telegram.ui.ay.t4(org.telegram.messenger.c.a(this.a));
        if (hp0Var.d.isEmpty()) {
            org.telegram.messenger.zs.f(this.a).c(this, org.telegram.messenger.zs.s);
        }
        int i37 = this.a;
        int i38 = 0;
        org.telegram.messenger.hs.a0(i37).a.c(new i2.u(i37, i38, new wo0(this), 17));
        org.telegram.messenger.ui.b0(this.a).M0(true);
        this.X0.i(this.b);
        ei.r rVar4 = this.X0;
        rVar4.a = new io0(this, i38);
        rVar4.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
        org.telegram.messenger.i0.V3(1.0f, oo0Var2, true, false);
        org.telegram.messenger.i0.V3(1.0f, oo0Var, false, false);
        r0.h0.l(this.c, new io0(this, 1));
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
