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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class no0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int Q2 = 0;
    public final v4.s A1;
    public boolean A2;
    public final ly B1;
    public org.telegram.ui.ActionBar.g1 B2;
    public final go0 C1;
    public int C2;
    public final lo0 D1;
    public boolean D2;
    public final ko0 E1;
    public boolean E2;
    public final ArrayList F1;
    public int F2;
    public final String[] G1;
    public final dh.g G2;
    public final int H1;
    public final ri.c H2;
    public final cv0 I1;
    public final dh.c I2;
    public final Drawable J1;
    public final dh.c J2;
    public final View[] K1;
    public final dh.c K2;
    public final AnimatorSet[] L1;
    public final ug L2;
    public final a0.h M1;
    public final fh.g M2;
    public final HashMap N1;
    public final dh.d N2;
    public final bo0 O1;
    public final fh.g O2;
    public int P1;
    public boolean P2;
    public boolean Q1;
    public final boolean R1;
    public boolean S1;
    public final int T1;
    public final FrameLayout U1;
    public final LinearLayout V1;
    public final wo W1;
    public final org.telegram.ui.cn X1;
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
    public final sn0 j1;
    public boolean j2;
    public final tn0 k1;
    public do0 k2;
    public final li.w1 l1;
    public float l2;
    public final sn0 m1;
    public float m2;
    public final FrameLayout n1;
    public float n2;
    public float o1;
    public ValueAnimator o2;
    public final bi.ec p1;
    public final ti0 p2;
    public final FrameLayout q1;
    public final s00 q2;
    public final org.telegram.ui.ActionBar.l5 r1;
    public final org.telegram.ui.ActionBar.k r2;
    public final FrameLayout s1;
    public boolean s2;
    public final FrameLayout t1;
    public r1.g t2;
    public final LinearLayout u1;
    public TLRPC.Dialog u2;
    public AnimatorSet v1;
    public final ao0 v2;
    public final qj0 w1;
    public ArrayList w2;
    public final pn0 x1;
    public TL_stories.StoryItem x2;
    public final pn0 y1;
    public i0.b y2;
    public final v4.s z1;
    public int z2;

    public no0(Context context, ArrayList arrayList, String str, boolean z9, String str2, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, null, arrayList, str, null, z9, str2, null, z10, false, false, null, g6Var);
    }

    public static void I0(no0 no0Var) {
        pn0 pn0Var = no0Var.x1;
        pn0 pn0Var2 = no0Var.y1;
        qj0 qj0Var = no0Var.w1;
        if (no0Var.j2) {
            return;
        }
        pn0 pn0Var3 = no0Var.D2 ? pn0Var2 : pn0Var;
        if (pn0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = pn0Var3.getChildAt(0);
        for (int i7 = 0; i7 < pn0Var3.getChildCount(); i7++) {
            if (pn0Var3.getChildAt(i7).getTop() < childAt.getTop()) {
                childAt = pn0Var3.getChildAt(i7);
            }
        }
        yi0 yi0Var = (yi0) pn0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || yi0Var == null || yi0Var.b() != 0) ? 0 : top;
        if (top < 0 || yi0Var == null || yi0Var.b() != 0) {
            no0Var.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            no0Var.T0(true);
            top = i10;
        } else {
            no0Var.C2 = childAt.getTop();
            no0Var.T0(false);
        }
        if (qj0Var.getVisibility() == 0) {
            if (qj0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = qj0Var.getChildAt(0);
            for (int i11 = 0; i11 < qj0Var.getChildCount(); i11++) {
                if (qj0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = qj0Var.getChildAt(i11);
                }
            }
            yi0 yi0Var2 = (yi0) qj0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || yi0Var2 == null || yi0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || yi0Var2 == null || yi0Var2.b() != 0) {
                no0Var.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                no0Var.T0(true);
                top2 = i12;
            } else {
                no0Var.C2 = childAt2.getTop();
                no0Var.T0(false);
            }
            top = org.telegram.messenger.g0.W1(qj0Var.getAlpha(), top, top2);
        }
        int i13 = no0Var.h2;
        if (i13 != top) {
            no0Var.i2 = i13;
            float f10 = top;
            int i14 = (int) (no0Var.l2 + f10);
            no0Var.h2 = i14;
            pn0Var.setTopGlowOffset(i14);
            int i15 = (int) (no0Var.l2 + f10);
            no0Var.h2 = i15;
            pn0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + no0Var.l2);
            no0Var.h2 = i16;
            qj0Var.setTopGlowOffset(i16);
            no0Var.i1.setTranslationY(no0Var.h2 + no0Var.l2);
            no0Var.I1.setTranslationY(no0Var.h2 + no0Var.l2);
            no0Var.b.invalidate();
        }
    }

    public static int J0(no0 no0Var) {
        pn0 pn0Var = no0Var.x1;
        if (pn0Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = pn0Var.getChildAt(0);
        yi0 yi0Var = (yi0) pn0Var.G(childAt);
        if (yi0Var == null) {
            return -1000;
        }
        int paddingTop = pn0Var.getPaddingTop();
        if (yi0Var.c() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    public static no0 N0(Context context, org.telegram.messenger.ij ijVar, String str, boolean z9, String str2) {
        return new no0(context, ijVar != null ? org.telegram.messenger.k5.k(ijVar) : null, str, null, z9, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != itemsCount - 1) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.s6.Q(childAt, org.telegram.ui.ActionBar.l6.a0(w02, i12, i11), null, org.telegram.ui.ActionBar.s6.M(i7), g6Var);
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public void K() {
        super.K();
        tn0 tn0Var = this.k1;
        if (tn0Var != null) {
            tn0Var.o();
        }
    }

    public final void K0(boolean z9) {
        s00 s00Var = this.q2;
        ah.i iVar = s00Var.r;
        ah.i iVar2 = s00Var.r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        pn0 pn0Var = this.x1;
        pn0 pn0Var2 = this.y1;
        boolean z10 = true;
        if (!isEmpty || ((this.d && iVar2.hasFocus()) || this.E2)) {
            this.s2 = true;
            if (this.u2 == null) {
                org.telegram.messenger.g0.Z3(pn0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.X3(pn0Var2, true);
            }
        } else {
            if (this.u2 == null) {
                org.telegram.messenger.g0.Z3(pn0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.X3(pn0Var2, false);
            }
            z10 = false;
        }
        if (this.D2 != z10 || z9) {
            this.D2 = z10;
            ko0 ko0Var = this.E1;
            ko0Var.f();
            this.C1.f();
            if (this.D2) {
                if (this.C2 == Integer.MAX_VALUE) {
                    ((v4.b0) pn0Var2.getLayoutManager()).h1(0, -pn0Var2.getPaddingTop());
                } else {
                    ((v4.b0) pn0Var2.getLayoutManager()).h1(0, this.C2 - pn0Var2.getPaddingTop());
                }
                ko0Var.E(iVar2.getText().toString());
                return;
            }
            int i7 = this.C2;
            v4.s sVar = this.z1;
            if (i7 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.u2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.u2 = null;
        for (int i7 = 0; i7 < P0().getChildCount(); i7++) {
            View childAt = P0().getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        r1.g gVar = this.t2;
        if (gVar != null) {
            gVar.d();
        }
        P0().setVisibility(0);
        s00 s00Var = this.q2;
        s00Var.setVisibility(0);
        ah.i iVar = s00Var.r;
        if (this.D2 || this.E2) {
            this.v2.H.v = true;
            iVar.requestFocus();
            org.telegram.messenger.g0.K3(iVar);
        }
        int[] iArr = new int[2];
        r1.g gVar2 = new r1.g(new r1.f(1000.0f));
        r1.h hVar = new r1.h(0.0f);
        org.telegram.ui.cn cnVar = this.X1;
        hVar.b((cnVar == null || !cnVar.b) ? 800.0f : 10.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.t2 = gVar2;
        gVar2.b(new gn0(this, (org.telegram.ui.Cells.d7) view, iArr, 0));
        this.t2.a(new ta(this, 5));
        this.t2.h();
    }

    public final void M0() {
        boolean z9 = false;
        if (this.c2 == null && this.g2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            do0 do0Var = this.k2;
            if (do0Var != null) {
                do0Var.C0();
                return;
            }
            if (this.Y1 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.c2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z9 = true;
                }
                ((LaunchActivity) this.Y1).H0(new l2.w(2, z9));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.g2;
        bo0 bo0Var = this.O1;
        if (bo0Var != null) {
            str = strArr[bo0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.c2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        wo woVar = this.W1;
        if (woVar != null && woVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.T1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final qj0 P0() {
        return (this.D2 || this.E2) ? this.y1 : this.x1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        qj0 qj0Var = this.w1;
        qj0Var.setPivotX(width);
        qj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        qj0Var.setScaleX(f12);
        qj0Var.setScaleY(f12);
        qj0Var.setAlpha(f10);
        qj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        s00 s00Var = this.q2;
        s00Var.setPivotX(s00Var.getWidth() / 2.0f);
        s00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        s00Var.setScaleX(f15);
        s00Var.setScaleY(f15);
        s00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.r2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        qj0Var.getLocationInWindow(iArr);
        float interpolation = xq.g.getInterpolation(f10);
        for (int i7 = 0; i7 < P0.getChildCount(); i7++) {
            View childAt = P0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.d7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
            View childAt2 = qj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((qj0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        P0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final int R() {
        return this.b.getMeasuredHeight() - this.P1;
    }

    public final void T0(boolean z9) {
        View[] viewArr = this.K1;
        if ((!z9 || viewArr[0].getTag() == null) && (z9 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z9 ? null : 1);
        if (z9) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.L1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new yn0(this, z9, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        no0 no0Var;
        ArrayList l10;
        jo0 jo0Var;
        if (dialog instanceof fo0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) view).F) || ((view instanceof org.telegram.ui.Cells.g6) && ((org.telegram.ui.Cells.g6) view).n0)) {
            Y0(dialog.id, view);
            return;
        }
        qj0 qj0Var = this.w1;
        if (qj0Var.getVisibility() != 8 || (activity = this.Y1) == null) {
            return;
        }
        boolean z9 = org.telegram.messenger.m5.z(dialog.id);
        int i7 = this.H1;
        if (z9) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i7 == 2 || i7 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M03 = org.telegram.messenger.id.M0(2131745596, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M03;
                    if (i7 == 3) {
                        if (org.telegram.messenger.t3.P(10, M0)) {
                            u1Var.T = org.telegram.messenger.id.M0(2131751084, null);
                        } else {
                            u1Var.T = org.telegram.messenger.id.M0(2131751085, null);
                        }
                    } else if (i7 != 2) {
                        u1Var.T = org.telegram.messenger.id.M0(2131752440, null);
                    } else if (this.f2) {
                        u1Var.T = org.telegram.messenger.id.M0(2131746587, null);
                    } else if (org.telegram.messenger.t3.P(10, M0)) {
                        u1Var.T = org.telegram.messenger.id.M0(2131751092, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131751093, null);
                    }
                    jg.g.w(null, 2131747831, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.m5.C(dialog.id) && i7 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M04 = org.telegram.messenger.id.M0(2131745596, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = M04;
            if (i7 == 3) {
                u1Var2.T = org.telegram.messenger.id.M0(2131744090, null);
            } else if (i7 != 0) {
                u1Var2.T = org.telegram.messenger.id.M0(2131747176, null);
            } else {
                u1Var2.T = org.telegram.messenger.id.M0(2131749104, null);
            }
            jg.g.w(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.h hVar = this.M1;
        if (hVar.h(j3) >= 0) {
            hVar.l(dialog.id);
            this.N1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(false, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(false, true);
            }
            b1(1);
            no0Var = this;
        } else {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(dialog.id));
            TLRPC.Chat M05 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.t10.u(a22) && !(((l10 = org.telegram.messenger.qp.s1(this.a).q7.l(-a22.id)) == null || l10.isEmpty()) && org.telegram.messenger.qp.s1(this.a).q7.e(-a22.id))) || (org.telegram.messenger.m5.z(dialog.id) && (org.telegram.messenger.t3.c0(M05) || (org.telegram.messenger.t3.p0(M05) && org.telegram.messenger.t3.A(this.a, M05, 24))))) {
                this.u2 = dialog;
                this.A1.h1(0, this.h2 - qj0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                wn0 wn0Var = new wn0(this, dialog, atomicReference, view);
                atomicReference.set(new ln0(this, atomicReference, wn0Var, dialog, 0));
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.a);
                int i10 = org.telegram.messenger.qs.q5;
                f10.b(wn0Var, i10);
                if (org.telegram.messenger.qp.s1(this.a).q7.l(-dialog.id) != null) {
                    wn0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.qp.s1(this.a).q7.o(-dialog.id);
                    org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            no0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(true, true);
            }
            b1(2);
            long j10 = org.telegram.messenger.p10.i(no0Var.a).n;
            if (no0Var.D2) {
                go0 go0Var = no0Var.C1;
                a0.h hVar2 = go0Var.e;
                ArrayList arrayList = go0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    go0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                go0Var.f();
                no0Var.s2 = false;
                s00 s00Var = no0Var.q2;
                s00Var.r.setText("");
                K0(false);
                org.telegram.messenger.g0.v1(s00Var.r);
            }
        }
        ko0 ko0Var = no0Var.E1;
        if (ko0Var == null || (jo0Var = ko0Var.H) == null) {
            return;
        }
        jo0Var.k(0, jo0Var.b());
    }

    public final void V0(final boolean z9) {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.M1;
            int m10 = hVar.m();
            sn0 sn0Var = this.j1;
            tn0 tn0Var = this.k1;
            if (i11 >= m10) {
                Editable text = tn0Var.getText();
                ft ftVar = tn0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
                wo woVar = this.W1;
                int i12 = (woVar == null || !woVar.a.q) ? -1 : this.T1;
                ArrayList arrayList = new ArrayList();
                if (this.F1 != null) {
                    i7 = 0;
                    while (i10 < hVar.m()) {
                        long j3 = hVar.j(i10);
                        long N1 = org.telegram.messenger.qp.s1(this.a).N1(j3);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j3));
                        }
                        if (sn0Var.getTag() != null && ftVar.length() > 0 && N1 > 0) {
                            i7++;
                        }
                        if (N1 > 0) {
                            i7++;
                        }
                        if (N1 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                        i10++;
                    }
                } else {
                    bo0 bo0Var = this.O1;
                    int i13 = bo0Var != null ? bo0Var.e : 0;
                    if (this.x2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j10 = hVar.j(i14);
                            long N12 = org.telegram.messenger.qp.s1(this.a).N1(j10);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j10));
                            }
                            int i16 = i10;
                            if (this.x2 != null && sn0Var.getTag() != null && ftVar.length() > 0 && charSequenceArr[i16] != null && N12 > 0) {
                                i15++;
                            }
                            if (N12 > 0) {
                                i15++;
                            }
                            if (N12 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                                arrayList.add(Long.valueOf(j10));
                            }
                            i14++;
                            i10 = i16;
                        }
                        i7 = i15;
                    } else {
                        int i17 = 0;
                        if (this.G1[i13] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j11 = hVar.j(i18);
                                long N13 = org.telegram.messenger.qp.s1(this.a).N1(j11);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j11));
                                }
                                if (sn0Var.getTag() != null && ftVar.length() > 0 && N13 > 0) {
                                    i17++;
                                }
                                if (N13 > 0) {
                                    i17++;
                                }
                                if (N13 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                        }
                        i7 = i17;
                    }
                }
                final int i19 = i12;
                v4.Z(this.a, arrayList, i7, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.nn0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.g6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        int i20;
                        boolean z10;
                        int i21;
                        HashMap hashMap;
                        long j12;
                        boolean z11;
                        char c10;
                        org.telegram.messenger.ij ijVar;
                        tn0 tn0Var2;
                        long longValue;
                        boolean z12;
                        boolean z13;
                        long j13;
                        String[] strArr;
                        org.telegram.messenger.ij ijVar2;
                        org.telegram.messenger.ez b10;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i22;
                        boolean z14;
                        long j14;
                        Long l10;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.ij ijVar3;
                        org.telegram.messenger.ij ijVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        no0 no0Var = no0.this;
                        String[] strArr2 = no0Var.G1;
                        tn0 tn0Var3 = no0Var.k1;
                        sn0 sn0Var2 = no0Var.j1;
                        HashMap hashMap3 = no0Var.N1;
                        Long l11 = 0L;
                        a0.h hVar2 = no0Var.M1;
                        ArrayList arrayList4 = no0Var.F1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z15 = z9;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i23 = 0;
                            boolean z16 = false;
                            while (true) {
                                if (i23 >= hVar2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z17 = z15;
                                long j15 = hVar2.j(i23);
                                boolean y22 = org.telegram.messenger.qp.s1(no0Var.a).y2(j15);
                                sn0 sn0Var3 = sn0Var2;
                                Long l12 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j15));
                                boolean z18 = (l12 == null || l12.longValue() <= 0) ? z16 : true;
                                Long l13 = l12;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j15));
                                if (tL_forumTopic2 == null || !y22) {
                                    i22 = i23;
                                    z14 = y22;
                                    j14 = 0;
                                } else {
                                    i22 = i23;
                                    z14 = y22;
                                    j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z14) {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    ijVar3 = null;
                                } else {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    ijVar3 = new org.telegram.messenger.ij(no0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (ijVar3 != null) {
                                    ijVar3.p = true;
                                }
                                if (sn0Var3.getTag() == null || tn0Var3.a.length() <= 0) {
                                    ijVar4 = ijVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    ijVar4 = ijVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.ez b11 = org.telegram.messenger.ez.b(charSequence == null ? null : charSequence.toString(), j15, ijVar4, ijVar3, null, true, arrayList7, null, null, z17, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z17 = z17;
                                    b11.Q = l13 == null ? 0L : l13.longValue();
                                    b11.R = j14;
                                    org.telegram.messenger.gz.C(no0Var.a).r0(b11);
                                }
                                boolean z19 = z17;
                                int q02 = org.telegram.messenger.gz.C(no0Var.a).q0(no0Var.F1, j15, !no0Var.A2, false, z19, 0, 0, ijVar4, i19, l13 == null ? 0L : l13.longValue(), j14, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j15));
                                }
                                if (hVar2.m() == 1) {
                                    v4.q0(q02, no0Var.X1, r11);
                                    if (q02 != 0) {
                                        z16 = z18;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z15 = z19;
                                sn0Var2 = sn0Var3;
                                z16 = z18;
                                l11 = l10;
                                arrayList4 = arrayList2;
                                charSequenceArr3 = charSequenceArr2;
                            }
                            int size = arrayList6.size();
                            int i24 = 0;
                            while (i24 < size) {
                                Object obj2 = arrayList6.get(i24);
                                i24++;
                                long longValue2 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar2.f(longValue2);
                                hVar2.l(longValue2);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!hVar2.i()) {
                                no0Var.R0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z16);
                            }
                        } else {
                            boolean z20 = z15;
                            bo0 bo0Var2 = no0Var.O1;
                            int i25 = bo0Var2 != null ? bo0Var2.e : 0;
                            if (no0Var.x2 != null) {
                                int i26 = 0;
                                boolean z21 = false;
                                while (i26 < hVar2.m()) {
                                    long j16 = hVar2.j(i26);
                                    boolean y23 = org.telegram.messenger.qp.s1(no0Var.a).y2(j16);
                                    Long l14 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j16));
                                    if (l14 != null && l14.longValue() > 0) {
                                        z21 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                    if (tL_forumTopic3 == null || !y23) {
                                        z12 = z21;
                                        z13 = y23;
                                        j13 = 0;
                                    } else {
                                        z12 = z21;
                                        z13 = y23;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || z13) {
                                        strArr = strArr2;
                                        ijVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        ijVar2 = new org.telegram.messenger.ij(no0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (no0Var.x2 != null) {
                                        if (sn0Var2.getTag() != null && tn0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.ij ijVar5 = ijVar2;
                                            ijVar2 = ijVar5;
                                            org.telegram.messenger.gz.C(no0Var.a).r0(org.telegram.messenger.ez.b(charSequenceArr3[0].toString(), j16, null, ijVar5, null, true, null, null, null, z20, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.ez.b(null, j16, ijVar2, ijVar2, null, true, null, null, null, z20, 0, 0, null, false);
                                        b10.I = no0Var.x2;
                                    } else if (sn0Var2.getTag() == null || tn0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.ez.b(strArr[i25], j16, ijVar2, ijVar2, null, true, null, null, null, z20, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z22 = z20;
                                        b10 = org.telegram.messenger.ez.b(charSequence2 == null ? null : charSequence2.toString(), j16, ijVar2, ijVar2, null, true, arrayList5, null, null, z22, 0, 0, null, false);
                                        z20 = z22;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j13;
                                    org.telegram.messenger.gz.C(no0Var.a).r0(b10);
                                    i26++;
                                    z21 = z12;
                                    strArr2 = strArr;
                                }
                                z10 = z21;
                            } else if (strArr2[i25] != null) {
                                int i27 = 0;
                                boolean z23 = false;
                                while (i27 < hVar2.m()) {
                                    long j17 = hVar2.j(i27);
                                    boolean y24 = org.telegram.messenger.qp.s1(no0Var.a).y2(j17);
                                    Long l15 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j17));
                                    if (l15 != null && l15.longValue() > 0) {
                                        z23 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic4 == null || !y24) {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j12 = 0;
                                    } else {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j12 = org.telegram.messenger.m5.o(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || y24) {
                                        z11 = z23;
                                        c10 = 0;
                                        ijVar = null;
                                    } else {
                                        z11 = z23;
                                        c10 = 0;
                                        ijVar = new org.telegram.messenger.ij(no0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (sn0Var2.getTag() == null || tn0Var3.a.length() <= 0) {
                                        tn0Var2 = tn0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z24 = z20;
                                        org.telegram.messenger.ez b12 = org.telegram.messenger.ez.b(charSequence3 == null ? null : charSequence3.toString(), j17, ijVar, ijVar, null, true, arrayList5, null, null, z24, 0, 0, null, false);
                                        z20 = z24;
                                        if (l15 == null) {
                                            tn0Var2 = tn0Var3;
                                            longValue = 0;
                                        } else {
                                            tn0Var2 = tn0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j12;
                                        org.telegram.messenger.gz.C(no0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.ij ijVar6 = ijVar;
                                    org.telegram.messenger.ez b13 = org.telegram.messenger.ez.b(strArr2[i25], j17, ijVar6, ijVar6, null, true, null, null, null, z20, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j12;
                                    org.telegram.messenger.gz.C(no0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    tn0Var3 = tn0Var2;
                                    hashMap2 = hashMap;
                                    z23 = z11;
                                }
                                z10 = z23;
                            } else {
                                i20 = 0;
                                z10 = false;
                                no0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z10);
                            }
                            i20 = 0;
                            no0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z10);
                        }
                        do0 do0Var = no0Var.k2;
                        if (do0Var != null) {
                            do0Var.W();
                        }
                        no0Var.dismiss();
                    }
                });
                return;
            }
            if (v4.h(getContext(), this.a, hVar.j(i11), sn0Var.getTag() != null && tn0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void X0(boolean z9) {
        sn0 sn0Var = this.j1;
        if (z9 == (sn0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.v1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        sn0Var.setTag(z9 ? 1 : null);
        tn0 tn0Var = this.k1;
        if (tn0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(tn0Var.getEditText());
        }
        tn0Var.k(true);
        FrameLayout frameLayout = this.U1;
        sn0 sn0Var2 = this.m1;
        FrameLayout frameLayout2 = this.n1;
        if (z9) {
            sn0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            sn0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i7 = z9 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.u1;
        if (linearLayout != null) {
            int i10 = z9 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.v1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(sn0Var, (Property<sn0, Float>) property, z9 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z9 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(sn0Var2, (Property<sn0, Float>) View.SCALE_X, z9 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(sn0Var2, (Property<sn0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(sn0Var2, (Property<sn0, Float>) property, z9 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.K1[1], (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.q1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.Z1 && z9) {
                f10 = org.telegram.messenger.g0.L(this.V1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.v1.playTogether(arrayList);
        this.v1.setInterpolator(new DecelerateInterpolator());
        this.v1.setDuration(180L);
        this.v1.addListener(new yn0(this, z9, 1));
        this.v1.start();
    }

    public final void Y0(long j3, View view) {
        int i7 = -this.z2;
        this.z2 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.D.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(j3))) : "";
        boolean D3 = org.telegram.messenger.qp.s1(this.a).D3();
        int i10 = 1;
        FrameLayout frameLayout = this.s1;
        (D3 ? new hc(frameLayout, this.I0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10))) : new hc(frameLayout, this.I0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10)), org.telegram.messenger.id.M0(2131743759, null), new jn0(this, i10))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.i1 i1Var;
        sn0 sn0Var = this.j1;
        if (sn0Var == null) {
            return;
        }
        tn0 tn0Var = this.k1;
        if (tn0Var == null || !tn0Var.m()) {
            ao0 ao0Var = this.v2;
            if (ao0Var != null && (i1Var = ao0Var.H) != null && !i1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            tn0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.U1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.n1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        sn0Var.setTranslationY(f11);
        this.m1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.l5 l5Var = this.r1;
        if (l5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            l5Var.l(O0, false);
        }
    }

    public final void b1(int i7) {
        a0.h hVar = this.M1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.F1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.j1.getTag();
        tn0 tn0Var = this.k1;
        if (tag != null && tn0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).id;
            long N1 = org.telegram.messenger.qp.s1(this.a).N1(j10);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j10));
            }
            j3 += N1;
        }
        int max = Math.max(1, hVar.m());
        boolean z9 = i7 != 0;
        li.w1 w1Var = this.l1;
        w1Var.e(max, z9);
        w1Var.i(size, j3, i7 != 0);
        X0(true);
        tn0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), w1Var.l()), 0);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.s;
        if (i7 == i11) {
            go0 go0Var = this.C1;
            if (go0Var != null) {
                go0Var.E();
            }
            org.telegram.messenger.qs.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        tn0 tn0Var = this.k1;
        if (tn0Var != null) {
            org.telegram.messenger.g0.v1(tn0Var.getEditText());
        }
        this.Q1 = false;
        super.dismiss();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.s);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        if (this.u2 != null) {
            L0();
            return;
        }
        tn0 tn0Var = this.k1;
        if (tn0Var == null || !tn0Var.e) {
            super.onBackPressed();
        } else {
            tn0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            ri.c cVar = this.H2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, this.I0));
            }
            org.telegram.ui.ActionBar.l2 l2Var = this.c;
            if (l2Var != null) {
                boolean z9 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, this.I0)) > 0.721f;
                if (z9 != this.P2) {
                    this.P2 = z9;
                    org.telegram.messenger.g0.o3(l2Var, z9);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public no0(Context context, ArrayList arrayList, String str, String str2, boolean z9, String str3, String str4, boolean z10) {
        this(context, null, arrayList, str, str2, z9, str3, str4, false, z10, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public no0(Context context, org.telegram.ui.cn cnVar, ArrayList arrayList, String str, String str2, boolean z9, String str3, String str4, boolean z10, boolean z11, boolean z12, Integer num, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        int i7;
        float f10;
        pn0 pn0Var;
        float f11;
        LinearLayout linearLayout;
        int i10;
        final int i11 = 1;
        final int i12 = 2;
        String[] strArr = new String[2];
        this.G1 = strArr;
        this.K1 = new View[2];
        this.L1 = new AnimatorSet[2];
        this.M1 = new a0.h();
        this.N1 = new HashMap();
        this.P1 = -1;
        final int i13 = 0;
        this.Q1 = false;
        new RectF();
        new Paint(1);
        this.b2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.g2 = strArr2;
        this.w2 = new ArrayList();
        int i14 = 4;
        int i15 = 4;
        while (true) {
            if (i15 >= 32) {
                i7 = 80;
                break;
            }
            i7 = (1 << i15) - 12;
            if (80 <= i7) {
                break;
            } else {
                i15++;
            }
        }
        int i16 = i7 / 8;
        long[] jArr = new long[i16];
        Object[] objArr = new Object[i16];
        this.y2 = i0.b.e;
        this.z2 = 4;
        this.A2 = true;
        this.C2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.g0.S(getWindow());
        ri.c d = this.X0.d(new in0(this, i14));
        this.H2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.G2 = gVar;
            this.X0.a(gVar);
            ri.f fVar = new ri.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ri.f fVar2 = new ri.f(d);
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.I2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.X0;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.J2 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            oi.q qVar = this.X0;
            cVar2.j = qVar;
            dh.c cVar3 = new dh.c(d, d, d);
            this.K2 = cVar3;
            cVar3.j = qVar;
        } else {
            this.G2 = null;
            dh.c cVar4 = new dh.c(d, d, d);
            cVar4.j = this.X0;
            this.J2 = cVar4;
            this.I2 = cVar4;
            this.K2 = cVar4;
        }
        this.I0 = g6Var;
        this.R1 = z12;
        this.Y1 = org.telegram.messenger.g0.W(context);
        this.Z1 = z11;
        if (z11) {
            this.I0 = new di.i0(i12);
        }
        d.a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, this.I0));
        this.X1 = cnVar;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.J1 = h;
        int i17 = org.telegram.ui.ActionBar.l6.h5;
        this.a0 = i17;
        h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i17, this.I0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.V = z10;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(0);
            String r10 = org.telegram.messenger.m5.r(org.telegram.messenger.qp.s1(this.a).e2(org.telegram.messenger.ij.B0(ijVar.k)));
            if (!TextUtils.isEmpty(r10)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.qp.s1(this.a).U2, "/", r10, "/");
                sb2.append(ijVar.e1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && ijVar.z2()) {
                    strArr2[0] = a8.p0.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.F1 = arrayList;
        this.E1 = new ko0(this, context);
        this.f2 = z9;
        strArr[0] = str;
        strArr[1] = str2;
        this.F = true;
        this.y0 = new org.telegram.ui.h0(this, i11);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.F1.get(i18);
                if (ijVar2.D4()) {
                    this.H1 = 3;
                } else if (ijVar2.T3()) {
                    int i19 = ijVar2.Z3() ? 2 : 1;
                    this.H1 = i19;
                    if (i19 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z9) {
            this.d2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.ij) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.qp.s1(this.a).h1(((org.telegram.messenger.ij) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.ld(19, this, context));
        }
        ao0 ao0Var = new ao0(this, context);
        this.v2 = ao0Var;
        this.b = ao0Var;
        ao0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i20 = this.t0;
        viewGroup.setPadding(i20, 0, i20, this.y2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.u2(this));
        if (this.Z1 && this.g2[1] != null) {
            bo0 bo0Var = new bo0(this, context);
            this.O1 = bo0Var;
            frameLayout.addView(bo0Var, c8.ha.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        s00 s00Var = new s00(context, this.I0);
        this.q2 = s00Var;
        un0 un0Var = new un0(this, i11);
        ah.i iVar = s00Var.r;
        iVar.addTextChangedListener(un0Var);
        iVar.setHint(org.telegram.messenger.id.M0(2131745440, null));
        iVar.setOnEditorActionListener(new t0(this, 7));
        s00Var.setCloseButtonOnClickListener(new jn0(this, i13));
        frameLayout.addView(s00Var, c8.ha.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.r2 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i21 = org.telegram.ui.ActionBar.l6.j5;
        org.telegram.ui.ActionBar.s6.l(kVar, 5, i21, this.I0);
        int i22 = 6;
        org.telegram.ui.ActionBar.s6.l(kVar, 6, org.telegram.ui.ActionBar.l6.q5, this.I0);
        org.telegram.ui.ActionBar.s6.l(kVar, 1, org.telegram.ui.ActionBar.l6.z6, null);
        org.telegram.ui.ActionBar.s6.l(kVar, 3, org.telegram.ui.ActionBar.l6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 17));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, c8.ha.e(-1, 58, 83));
        qj0 qj0Var = new qj0(context, this.I0);
        this.w1 = qj0Var;
        v4.s sVar = new v4.s(4);
        this.A1 = sVar;
        qj0Var.setLayoutManager(sVar);
        sVar.O = new qn0(this, i12);
        qj0Var.setOnScrollListener(new rn0(this, i12));
        lo0 lo0Var = new lo0(this, context);
        this.D1 = lo0Var;
        qj0Var.setAdapter(lo0Var);
        int i23 = org.telegram.ui.ActionBar.l6.A5;
        org.telegram.ui.ActionBar.s6.l(qj0Var, 21, i23, this.I0);
        qj0Var.setVerticalScrollBarEnabled(false);
        qj0Var.setHorizontalScrollBarEnabled(false);
        qj0Var.setOverScrollMode(2);
        qj0Var.setSelectorDrawableColor(0);
        qj0Var.setItemSelectorColorProvider(new jl0(i22));
        qj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        qj0Var.setClipToPadding(false);
        qj0Var.i(new di.k(9));
        qj0Var.setOnItemClickListener(new cj0(this) { // from class: org.telegram.ui.Components.kn0
            public final /* synthetic */ no0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.cj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        no0 no0Var = this.b;
                        s00 s00Var2 = no0Var.q2;
                        HashMap hashMap = no0Var.N1;
                        a0.h hVar = no0Var.M1;
                        go0 go0Var = no0Var.C1;
                        lo0 lo0Var2 = no0Var.D1;
                        if (lo0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = no0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var.e.f(dialog2.id)) == null) {
                                        go0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = go0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    go0Var.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < no0Var.P0().getChildCount(); i25++) {
                                    View childAt = no0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = lo0Var2.E(i24);
                            if (E != null && (dialog = no0Var.u2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(no0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = no0Var.u2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var.e.f(dialog3.id)) == null) {
                                        go0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = go0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    go0Var.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < no0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = no0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            no0 no0Var2 = this.b;
                            ArrayList arrayList4 = no0Var2.C1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                no0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            no0 no0Var3 = this.b;
                            ko0 ko0Var = no0Var3.E1;
                            no0 no0Var4 = ko0Var.K;
                            int i28 = ko0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ko0Var.d.size()) {
                                        dialog5 = ((co0) ko0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ko0Var.d.size();
                                        ArrayList arrayList5 = ko0Var.e.d;
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
                                    no0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < no0Var4.w2.size()) {
                                    TLObject tLObject2 = ((jg.g0) no0Var4.w2.get(i30)).a;
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
        qj0Var.setVisibility(8);
        this.b.addView(qj0Var, c8.ha.e(-1, -1, 51));
        pn0 pn0Var2 = new pn0(this, context, this.I0, i13);
        this.x1 = pn0Var2;
        pn0Var2.setSelectorDrawableColor(0);
        pn0Var2.setItemSelectorColorProvider(new jl0(i22));
        pn0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        pn0Var2.setClipToPadding(false);
        getContext();
        v4.s sVar2 = new v4.s(4);
        this.z1 = sVar2;
        pn0Var2.setLayoutManager(sVar2);
        this.L2 = new ug(this, i12);
        sVar2.O = new qn0(this, i13);
        pn0Var2.setHorizontalScrollBarEnabled(false);
        pn0Var2.setVerticalScrollBarEnabled(false);
        pn0Var2.setOverScrollMode(2);
        pn0Var2.i(new di.k(10));
        this.b.addView(pn0Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        go0 go0Var = new go0(this, context);
        this.C1 = go0Var;
        pn0Var2.setAdapter(go0Var);
        org.telegram.ui.ActionBar.s6.l(pn0Var2, 21, i23, this.I0);
        pn0Var2.setOnItemClickListener(new cj0(this) { // from class: org.telegram.ui.Components.kn0
            public final /* synthetic */ no0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.cj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        no0 no0Var = this.b;
                        s00 s00Var2 = no0Var.q2;
                        HashMap hashMap = no0Var.N1;
                        a0.h hVar = no0Var.M1;
                        go0 go0Var2 = no0Var.C1;
                        lo0 lo0Var2 = no0Var.D1;
                        if (lo0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = no0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var2.e.f(dialog2.id)) == null) {
                                        go0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = go0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    go0Var2.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < no0Var.P0().getChildCount(); i25++) {
                                    View childAt = no0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = lo0Var2.E(i24);
                            if (E != null && (dialog = no0Var.u2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(no0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = no0Var.u2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var2.e.f(dialog3.id)) == null) {
                                        go0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = go0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    go0Var2.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < no0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = no0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            no0 no0Var2 = this.b;
                            ArrayList arrayList4 = no0Var2.C1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                no0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            no0 no0Var3 = this.b;
                            ko0 ko0Var = no0Var3.E1;
                            no0 no0Var4 = ko0Var.K;
                            int i28 = ko0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ko0Var.d.size()) {
                                        dialog5 = ((co0) ko0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ko0Var.d.size();
                                        ArrayList arrayList5 = ko0Var.e.d;
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
                                    no0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < no0Var4.w2.size()) {
                                    TLObject tLObject2 = ((jg.g0) no0Var4.w2.get(i30)).a;
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
        pn0Var2.setOnScrollListener(new rn0(this, i13));
        this.X0.b(pn0Var2);
        pn0 pn0Var3 = new pn0(this, context, this.I0, i11);
        this.y1 = pn0Var3;
        pn0Var3.setItemSelectorColorProvider(new jl0(i22));
        pn0Var3.setSelectorDrawableColor(0);
        pn0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        pn0Var3.setClipToPadding(false);
        getContext();
        ly lyVar = new ly(4, 0, pn0Var3);
        this.B1 = lyVar;
        pn0Var3.setLayoutManager(lyVar);
        lyVar.O = new qn0(this, i11);
        pn0Var3.setOnItemClickListener(new cj0(this) { // from class: org.telegram.ui.Components.kn0
            public final /* synthetic */ no0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.cj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        no0 no0Var = this.b;
                        s00 s00Var2 = no0Var.q2;
                        HashMap hashMap = no0Var.N1;
                        a0.h hVar = no0Var.M1;
                        go0 go0Var2 = no0Var.C1;
                        lo0 lo0Var2 = no0Var.D1;
                        if (lo0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = no0Var.u2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var2.e.f(dialog2.id)) == null) {
                                        go0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = go0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    go0Var2.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < no0Var.P0().getChildCount(); i25++) {
                                    View childAt = no0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = lo0Var2.E(i24);
                            if (E != null && (dialog = no0Var.u2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(no0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = no0Var.u2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                no0Var.b1(2);
                                if (no0Var.D2 || no0Var.E2) {
                                    if (((TLRPC.Dialog) go0Var2.e.f(dialog3.id)) == null) {
                                        go0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = go0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    go0Var2.f();
                                    no0Var.s2 = false;
                                    s00Var2.r.setText("");
                                    no0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < no0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = no0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == no0Var.u2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                no0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            no0 no0Var2 = this.b;
                            ArrayList arrayList4 = no0Var2.C1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                no0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            no0 no0Var3 = this.b;
                            ko0 ko0Var = no0Var3.E1;
                            no0 no0Var4 = ko0Var.K;
                            int i28 = ko0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < ko0Var.d.size()) {
                                        dialog5 = ((co0) ko0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - ko0Var.d.size();
                                        ArrayList arrayList5 = ko0Var.e.d;
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
                                    no0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < no0Var4.w2.size()) {
                                    TLObject tLObject2 = ((jg.g0) no0Var4.w2.get(i30)).a;
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
        pn0Var3.setHasFixedSize(true);
        pn0Var3.setItemAnimator(null);
        pn0Var3.setHorizontalScrollBarEnabled(false);
        pn0Var3.setVerticalScrollBarEnabled(false);
        pn0Var3.setOnScrollListener(new rn0(this, i11));
        pn0Var3.i(new di.k(11));
        pn0Var3.setAdapter(this.E1);
        org.telegram.ui.ActionBar.s6.l(pn0Var3, 21, i23, this.I0);
        this.p2 = new ti0(pn0Var3, true);
        mz mzVar = new mz(context, this.I0);
        mzVar.setViewType(12);
        cv0 cv0Var = new cv0(context, mzVar, 1, this.I0);
        this.I1 = cv0Var;
        cv0Var.addView(mzVar, 0);
        cv0Var.setAnimateLayoutChange(true);
        cv0Var.e(false, false);
        boolean z13 = this.Z1;
        xh.l lVar = cv0Var.d;
        if (z13) {
            org.telegram.ui.ActionBar.s6.U(lVar, org.telegram.ui.ActionBar.l6.bh, this.I0);
        }
        lVar.setText(org.telegram.messenger.id.M0(2131748167, null));
        pn0Var3.setEmptyView(cv0Var);
        pn0Var3.setHideIfEmpty(false);
        pn0Var3.W1 = true;
        pn0Var3.X1 = 0;
        this.b.addView(cv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(pn0Var3, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.ec ecVar = new bi.ec(22, context, this);
        this.p1 = ecVar;
        this.b.addView(ecVar, c8.ha.e(-1, org.telegram.messenger.qs.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.Z1 || this.g2[1] == null) ? 58.0f : 111.0f);
        this.K1[0] = new View(context);
        View view = this.K1[0];
        int i24 = org.telegram.ui.ActionBar.l6.V5;
        org.telegram.ui.ActionBar.s6.h(i24, view, this.I0);
        this.K1[0].setAlpha(0.0f);
        this.K1[0].setTag(1);
        this.b.addView(this.K1[0], layoutParams);
        this.b.addView(frameLayout, c8.ha.e(-1, (!this.Z1 || this.g2[1] == null) ? 58 : org.telegram.messenger.qs.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.K1[1] = new View(context);
        org.telegram.ui.ActionBar.s6.h(i24, this.K1[1], this.I0);
        this.K1[1].setLayoutParams(layoutParams2);
        if (!this.f2 && this.g2[0] == null) {
            this.K1[1].setAlpha(0.0f);
            pn0Var = pn0Var3;
            f10 = 4.0f;
            f11 = 9.0f;
        } else {
            f10 = 4.0f;
            if (this.Z1) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n1 = frameLayout2;
                f11 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.q1 = frameLayout3;
                frameLayout2.addView(frameLayout3, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                c8.ka.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new hn0(this, 4));
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                this.r1 = l5Var;
                l5Var.setTextSize(15);
                org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.Hl, this.I0);
                l5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(l5Var, c8.ha.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, this.I0);
                textView.setText(org.telegram.messenger.id.M0(2131751767, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i25 = org.telegram.ui.ActionBar.l6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i25, this.I0), 4, 4);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i25);
                org.telegram.ui.ActionBar.g6 g6Var2 = this.I0;
                textView.setBackground(a02);
                pn0Var = pn0Var3;
                org.telegram.ui.ActionBar.s6.j(textView, a02, null, M, g6Var2);
                linearLayout3.addView(textView, c8.ha.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new hn0(this, 5));
                c8.ka.a(textView);
                this.b.addView(frameLayout2, c8.ha.e(-1, 58, 83));
                ArrayList arrayList2 = this.F1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.ij) this.F1.get(0)).k != null && ((org.telegram.messenger.ij) this.F1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.F1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-org.telegram.messenger.ij.B0(ijVar3.k)))) && !org.telegram.messenger.ij.l3(ijVar3.k)) {
                        final int i26 = 0;
                        linearLayout = org.telegram.messenger.k5.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on0
                            public final /* synthetic */ no0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i26) {
                                    case 0:
                                        no0 no0Var = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var = no0Var.X1;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.T();
                                        }
                                        if (f2Var != null) {
                                            no0Var.dismiss();
                                            f2Var.presentFragment(new org.telegram.ui.lg0(ijVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        no0 no0Var2 = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var2 = no0Var2.X1;
                                        if (f2Var2 == null) {
                                            f2Var2 = LaunchActivity.T();
                                        }
                                        if (f2Var2 != null) {
                                            no0Var2.dismiss();
                                            f2Var2.presentFragment(new org.telegram.ui.lg0(ijVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i25, this.I0), 6, 6);
                        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i25);
                        org.telegram.ui.ActionBar.g6 g6Var3 = this.I0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.s6.j(linearLayout, a03, null, M2, g6Var3);
                        c8.ka.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i27 = org.telegram.ui.ActionBar.l6.Jl;
                        org.telegram.ui.ActionBar.s6.s(imageView, i27, this.I0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, c8.ha.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.s6.U(textView2, i27, this.I0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.id.E(ijVar3.k.forwards, ','));
                        linearLayout.addView(textView2, c8.ha.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i10 = 8;
                        linearLayout2.addView(linearLayout3, c8.ha.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, c8.ha.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i10 = 11;
                linearLayout2.addView(linearLayout3, c8.ha.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                if (linearLayout != null) {
                }
            } else {
                pn0Var = pn0Var3;
                f11 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.n1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.q1 = frameLayout5;
                frameLayout4.addView(frameLayout5, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i28 = org.telegram.ui.ActionBar.l6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i28, this.I0), 20, 20);
                org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i28);
                org.telegram.ui.ActionBar.g6 g6Var4 = this.I0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.s6.j(textView3, a04, null, M3, g6Var4);
                org.telegram.ui.ActionBar.s6.U(textView3, this.Z1 ? org.telegram.ui.ActionBar.l6.dh : org.telegram.ui.ActionBar.l6.n5, this.I0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.Z1 && this.g2[1] != null) {
                    textView3.setText(org.telegram.messenger.id.M0(2131743387, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.id.L0(2131751762).toUpperCase());
                }
                textView3.setOnClickListener(new hn0(this, 6));
                frameLayout5.addView(textView3, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                this.b.addView(frameLayout4, c8.ha.e(-1, 58, 87));
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.ij) this.F1.get(0)).k != null && ((org.telegram.messenger.ij) this.F1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) this.F1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-ijVar4.A0()))) && !ijVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.u1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.s6.Q(linearLayout4, org.telegram.ui.ActionBar.l6.a0(V(this.Z1 ? org.telegram.ui.ActionBar.l6.Sg : i28), 20, 20), null, org.telegram.ui.ActionBar.s6.M(this.Z1 ? org.telegram.ui.ActionBar.l6.Sg : i28), this.I0);
                        frameLayout5.addView(linearLayout4, c8.ha.e(-2, -1, 21));
                        final int i29 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on0
                            public final /* synthetic */ no0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i29) {
                                    case 0:
                                        no0 no0Var = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var = no0Var.X1;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.T();
                                        }
                                        if (f2Var != null) {
                                            no0Var.dismiss();
                                            f2Var.presentFragment(new org.telegram.ui.lg0(ijVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        no0 no0Var2 = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var2 = no0Var2.X1;
                                        if (f2Var2 == null) {
                                            f2Var2 = LaunchActivity.T();
                                        }
                                        if (f2Var2 != null) {
                                            no0Var2.dismiss();
                                            f2Var2.presentFragment(new org.telegram.ui.lg0(ijVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.s6.s(imageView2, this.Z1 ? org.telegram.ui.ActionBar.l6.dh : org.telegram.ui.ActionBar.l6.n5, this.I0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, c8.ha.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(ijVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.s6.U(textView4, this.Z1 ? org.telegram.ui.ActionBar.l6.dh : org.telegram.ui.ActionBar.l6.n5, this.I0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout4.addView(textView4, c8.ha.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.s1 = frameLayout6;
        this.b.addView(frameLayout6, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.q1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.t1 = frameLayout7;
        this.b.addView(frameLayout7, c8.ha.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        sn0 sn0Var = new sn0(this, context, 0);
        this.j1 = sn0Var;
        sn0Var.setWillNotDraw(false);
        sn0Var.setAlpha(0.0f);
        sn0Var.setVisibility(4);
        this.b.addView(sn0Var, c8.ha.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        sn0Var.setOnTouchListener(new ei.b(22));
        org.telegram.ui.ActionBar.l2 l2Var = this.c;
        boolean z14 = org.telegram.messenger.g0.B(V(org.telegram.ui.ActionBar.l6.h5)) > 0.721f;
        this.P2 = z14;
        org.telegram.messenger.g0.o3(l2Var, z14);
        tn0 tn0Var = new tn0(this, context, ao0Var, this.I0);
        this.k1 = tn0Var;
        tn0Var.J = true;
        if (this.Z1) {
            zs editText = tn0Var.getEditText();
            int i30 = org.telegram.ui.ActionBar.l6.bh;
            editText.setTextColor(V(i30));
            tn0Var.getEditText().setCursorColor(V(i30));
        }
        tn0Var.setHint(org.telegram.messenger.id.L0(2131745462));
        tn0Var.s();
        tn0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        sn0Var.addView(tn0Var, c8.ha.e(-1, -2, 51));
        sn0Var.setClipChildren(false);
        sn0Var.setClipToPadding(false);
        tn0Var.setClipChildren(false);
        tn0Var.getEditText().addTextChangedListener(new un0(this, 0));
        sn0 sn0Var2 = new sn0(this, context, 1);
        this.m1 = sn0Var2;
        sn0Var2.setFocusable(true);
        sn0Var2.setFocusableInTouchMode(true);
        sn0Var2.setVisibility(4);
        sn0Var2.setScaleX(0.2f);
        sn0Var2.setScaleY(0.2f);
        sn0Var2.setAlpha(0.0f);
        this.b.addView(sn0Var2, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
        li.w1 w1Var = new li.w1(this, context, this.I0);
        this.l1 = w1Var;
        int L3 = org.telegram.messenger.g0.L(52.0f);
        int L4 = org.telegram.messenger.g0.L(38.0f);
        w1Var.I = L3;
        w1Var.J = L4;
        float L5 = org.telegram.messenger.g0.L(1.0f);
        float L6 = org.telegram.messenger.g0.L(6.0f);
        w1Var.M = L5;
        w1Var.N = L6;
        w1Var.h0 = true;
        sn0Var2.addView(w1Var, c8.ha.g());
        w1Var.setOnClickListener(new hn0(this, 0));
        w1Var.setOnLongClickListener(new e00(this, 2));
        this.b2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.b2.setTypeface(org.telegram.messenger.g0.o());
        if (num != null) {
            this.T1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.U1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.V1 = linearLayout5;
            linearLayout5.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i31 = org.telegram.ui.ActionBar.l6.i6;
            org.telegram.ui.ActionBar.s6.Q(linearLayout5, org.telegram.ui.ActionBar.l6.a0(V(i31), 6, 6), null, org.telegram.ui.ActionBar.s6.M(i31), this.I0);
            wo woVar = new wo(24, context, this.I0);
            this.W1 = woVar;
            woVar.b(org.telegram.ui.ActionBar.l6.h7, org.telegram.ui.ActionBar.l6.j7, org.telegram.ui.ActionBar.l6.k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.s6.U(textView5, i21, this.I0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.id.Z(2131743581, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
            c8.ka.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new hn0(this, 1));
            frameLayout8.addView(linearLayout5, c8.ha.e(-2, -2, 17));
            if (this.n1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d7, view2, this.I0);
                frameLayout8.addView(view2, c8.ha.a(-1.0f, this.Z1 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, c8.ha.e(-1, 58, 83));
            if (this.n1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        dh.d dVar = new dh.d(this.K2.b(ecVar, null));
        this.N2 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        fh.g b10 = this.J2.b(this.v2, c8.g0.e(this.I0));
        this.M2 = b10;
        b10.S = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.Q.g = 0.4f;
        b10.n();
        fh.g b11 = this.I2.b(sn0Var, c8.g0.e(this.I0));
        this.O2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        sn0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
        FrameLayout frameLayout9 = this.q1;
        if (frameLayout9 != null) {
            fh.g b12 = this.I2.b(frameLayout9, c8.g0.e(this.I0));
            b12.q(org.telegram.messenger.g0.L(f11));
            b12.r(org.telegram.messenger.g0.L(22.0f));
            this.q1.setBackground(b12);
            this.q1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        FrameLayout frameLayout10 = this.U1;
        if (frameLayout10 != null) {
            fh.g b13 = this.I2.b(frameLayout10, c8.g0.e(this.I0));
            b13.q(org.telegram.messenger.g0.L(f11));
            b13.r(org.telegram.messenger.g0.L(22.0f));
            this.U1.setBackground(b13);
            this.U1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        b1(0);
        org.telegram.ui.yw.u4(org.telegram.messenger.c.a(this.a));
        if (go0Var.d.isEmpty()) {
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.s);
        }
        int i32 = this.a;
        int i33 = 0;
        org.telegram.messenger.yr.a0(i32).a.c(new jg.r(i32, i33, new vn0(this), i33));
        org.telegram.messenger.ui.b0(this.a).M0(true);
        this.X0.i(this.b);
        oi.q qVar2 = this.X0;
        qVar2.a = new in0(this, i33);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.W3(1.0f, pn0Var2, true, false);
        org.telegram.messenger.g0.W3(1.0f, pn0Var, false, false);
        r0.i0.l(this.c, new in0(this, 1));
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
    }
}
