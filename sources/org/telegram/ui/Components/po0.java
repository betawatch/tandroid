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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class po0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final /* synthetic */ int U2 = 0;
    public final uj0 A1;
    public ArrayList A2;
    public final rn0 B1;
    public TL_stories.StoryItem B2;
    public final rn0 C1;
    public i0.c C2;
    public final v4.s D1;
    public int D2;
    public final v4.s E1;
    public boolean E2;
    public final py F1;
    public org.telegram.ui.ActionBar.g1 F2;
    public final io0 G1;
    public int G2;
    public final no0 H1;
    public boolean H2;
    public final mo0 I1;
    public boolean I2;
    public final ArrayList J1;
    public int J2;
    public final String[] K1;
    public final dh.g K2;
    public final int L1;
    public final ui.c L2;
    public final cv0 M1;
    public final dh.c M2;
    public final Drawable N1;
    public final dh.c N2;
    public final View[] O1;
    public final dh.c O2;
    public final AnimatorSet[] P1;
    public final zg P2;
    public final a0.h Q1;
    public final fh.g Q2;
    public final HashMap R1;
    public final dh.d R2;
    public final do0 S1;
    public final fh.g S2;
    public int T1;
    public boolean T2;
    public boolean U1;
    public final boolean V1;
    public boolean W1;
    public final int X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final fp a2;
    public final org.telegram.ui.an b2;
    public final Activity c2;
    public final boolean d2;
    public boolean e2;
    public final TextPaint f2;
    public TLRPC.TL_exportedMessageLink g2;
    public boolean h2;
    public boolean i2;
    public final boolean j2;
    public final String[] k2;
    public int l2;
    public final FrameLayout m1;
    public int m2;
    public final un0 n1;
    public boolean n2;
    public final vn0 o1;
    public fo0 o2;
    public final oi.u1 p1;
    public float p2;
    public final un0 q1;
    public float q2;
    public final FrameLayout r1;
    public float r2;
    public float s1;
    public ValueAnimator s2;
    public final bi.o2 t1;
    public final xi0 t2;
    public final FrameLayout u1;
    public final v00 u2;
    public final org.telegram.ui.ActionBar.j5 v1;
    public final org.telegram.ui.ActionBar.k v2;
    public final FrameLayout w1;
    public boolean w2;
    public final FrameLayout x1;
    public r1.g x2;
    public final LinearLayout y1;
    public TLRPC.Dialog y2;
    public AnimatorSet z1;
    public final co0 z2;

    public po0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void I0(po0 po0Var) {
        rn0 rn0Var = po0Var.B1;
        rn0 rn0Var2 = po0Var.C1;
        uj0 uj0Var = po0Var.A1;
        if (po0Var.n2) {
            return;
        }
        rn0 rn0Var3 = po0Var.H2 ? rn0Var2 : rn0Var;
        if (rn0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = rn0Var3.getChildAt(0);
        for (int i7 = 0; i7 < rn0Var3.getChildCount(); i7++) {
            if (rn0Var3.getChildAt(i7).getTop() < childAt.getTop()) {
                childAt = rn0Var3.getChildAt(i7);
            }
        }
        cj0 cj0Var = (cj0) rn0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || cj0Var == null || cj0Var.b() != 0) ? 0 : top;
        if (top < 0 || cj0Var == null || cj0Var.b() != 0) {
            po0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            po0Var.T0(true);
            top = i10;
        } else {
            po0Var.G2 = childAt.getTop();
            po0Var.T0(false);
        }
        if (uj0Var.getVisibility() == 0) {
            if (uj0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = uj0Var.getChildAt(0);
            for (int i11 = 0; i11 < uj0Var.getChildCount(); i11++) {
                if (uj0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = uj0Var.getChildAt(i11);
                }
            }
            cj0 cj0Var2 = (cj0) uj0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || cj0Var2 == null || cj0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || cj0Var2 == null || cj0Var2.b() != 0) {
                po0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                po0Var.T0(true);
                top2 = i12;
            } else {
                po0Var.G2 = childAt2.getTop();
                po0Var.T0(false);
            }
            top = org.telegram.messenger.g0.W1(uj0Var.getAlpha(), top, top2);
        }
        int i13 = po0Var.l2;
        if (i13 != top) {
            po0Var.m2 = i13;
            float f10 = top;
            int i14 = (int) (po0Var.p2 + f10);
            po0Var.l2 = i14;
            rn0Var.setTopGlowOffset(i14);
            int i15 = (int) (po0Var.p2 + f10);
            po0Var.l2 = i15;
            rn0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + po0Var.p2);
            po0Var.l2 = i16;
            uj0Var.setTopGlowOffset(i16);
            po0Var.m1.setTranslationY(po0Var.l2 + po0Var.p2);
            po0Var.M1.setTranslationY(po0Var.l2 + po0Var.p2);
            po0Var.b.invalidate();
        }
    }

    public static int J0(po0 po0Var) {
        rn0 rn0Var = po0Var.B1;
        if (rn0Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = rn0Var.getChildAt(0);
        cj0 cj0Var = (cj0) rn0Var.G(childAt);
        if (cj0Var == null) {
            return -1000;
        }
        int paddingTop = rn0Var.getPaddingTop();
        if (cj0Var.c() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    public static po0 N0(Context context, org.telegram.messenger.gj gjVar, String str, boolean z10, String str2) {
        return new po0(context, gjVar != null ? org.telegram.messenger.k5.j(gjVar) : null, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != itemsCount - 1) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.q6.Q(childAt, org.telegram.ui.ActionBar.j6.a0(w02, i12, i11), null, org.telegram.ui.ActionBar.q6.M(i7), e6Var);
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void K0(boolean z10) {
        v00 v00Var = this.u2;
        ah.i iVar = v00Var.r;
        ah.i iVar2 = v00Var.r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        rn0 rn0Var = this.B1;
        rn0 rn0Var2 = this.C1;
        boolean z11 = true;
        if (!isEmpty || ((this.d && iVar2.hasFocus()) || this.I2)) {
            this.w2 = true;
            if (this.y2 == null) {
                org.telegram.messenger.g0.Y3(rn0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.W3(rn0Var2, true);
            }
        } else {
            if (this.y2 == null) {
                org.telegram.messenger.g0.Y3(rn0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.W3(rn0Var2, false);
            }
            z11 = false;
        }
        if (this.H2 != z11 || z10) {
            this.H2 = z11;
            mo0 mo0Var = this.I1;
            mo0Var.f();
            this.G1.f();
            if (this.H2) {
                if (this.G2 == Integer.MAX_VALUE) {
                    ((v4.b0) rn0Var2.getLayoutManager()).h1(0, -rn0Var2.getPaddingTop());
                } else {
                    ((v4.b0) rn0Var2.getLayoutManager()).h1(0, this.G2 - rn0Var2.getPaddingTop());
                }
                mo0Var.E(iVar2.getText().toString());
                return;
            }
            int i7 = this.G2;
            v4.s sVar = this.D1;
            if (i7 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public void L() {
        super.L();
        vn0 vn0Var = this.o1;
        if (vn0Var != null) {
            vn0Var.o();
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.y2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.y2 = null;
        for (int i7 = 0; i7 < P0().getChildCount(); i7++) {
            View childAt = P0().getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        r1.g gVar = this.x2;
        if (gVar != null) {
            gVar.d();
        }
        P0().setVisibility(0);
        v00 v00Var = this.u2;
        v00Var.setVisibility(0);
        ah.i iVar = v00Var.r;
        if (this.H2 || this.I2) {
            this.z2.I.v = true;
            iVar.requestFocus();
            org.telegram.messenger.g0.J3(iVar);
        }
        int[] iArr = new int[2];
        r1.g gVar2 = new r1.g(new r1.f(1000.0f));
        r1.h hVar = new r1.h(0.0f);
        org.telegram.ui.an anVar = this.b2;
        hVar.b((anVar == null || !anVar.b) ? 800.0f : 10.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.x2 = gVar2;
        gVar2.b(new jn0(this, (org.telegram.ui.Cells.c7) view, iArr, 0));
        this.x2.a(new pa(this, 5));
        this.x2.h();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.g2 == null && this.k2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            fo0 fo0Var = this.o2;
            if (fo0Var != null) {
                fo0Var.x0();
                return;
            }
            if (this.c2 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.c2).H0(new l2.v(2, z10));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.k2;
        do0 do0Var = this.S1;
        if (do0Var != null) {
            str = strArr[do0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        fp fpVar = this.a2;
        if (fpVar != null && fpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.X1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final uj0 P0() {
        return (this.H2 || this.I2) ? this.C1 : this.B1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        uj0 uj0Var = this.A1;
        uj0Var.setPivotX(width);
        uj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        uj0Var.setScaleX(f12);
        uj0Var.setScaleY(f12);
        uj0Var.setAlpha(f10);
        uj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        v00 v00Var = this.u2;
        v00Var.setPivotX(v00Var.getWidth() / 2.0f);
        v00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        v00Var.setScaleX(f15);
        v00Var.setScaleY(f15);
        v00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.v2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        uj0Var.getLocationInWindow(iArr);
        float interpolation = er.g.getInterpolation(f10);
        for (int i7 = 0; i7 < P0.getChildCount(); i7++) {
            View childAt = P0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.c7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
            View childAt2 = uj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((uj0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        P0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final int S() {
        return this.b.getMeasuredHeight() - this.T1;
    }

    public final void T0(boolean z10) {
        View[] viewArr = this.O1;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.P1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new ao0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        po0 po0Var;
        ArrayList l10;
        lo0 lo0Var;
        if (dialog instanceof ho0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).G) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).o0)) {
            Y0(dialog.id, view);
            return;
        }
        uj0 uj0Var = this.A1;
        if (uj0Var.getVisibility() != 8 || (activity = this.c2) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.m5.z(dialog.id);
        int i7 = this.L1;
        if (z10) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i7 == 2 || i7 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M03 = org.telegram.messenger.hd.M0(2131745596, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M03;
                    if (i7 == 3) {
                        if (org.telegram.messenger.t3.P(10, M0)) {
                            t1Var.U = org.telegram.messenger.hd.M0(2131751084, null);
                        } else {
                            t1Var.U = org.telegram.messenger.hd.M0(2131751085, null);
                        }
                    } else if (i7 != 2) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752440, null);
                    } else if (this.j2) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131746587, null);
                    } else if (org.telegram.messenger.t3.P(10, M0)) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131751092, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131751093, null);
                    }
                    i5.c.x(null, 2131747831, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.m5.C(dialog.id) && i7 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M04 = org.telegram.messenger.hd.M0(2131745596, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = M04;
            if (i7 == 3) {
                t1Var2.U = org.telegram.messenger.hd.M0(2131744090, null);
            } else if (i7 != 0) {
                t1Var2.U = org.telegram.messenger.hd.M0(2131747176, null);
            } else {
                t1Var2.U = org.telegram.messenger.hd.M0(2131749104, null);
            }
            i5.c.x(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.h hVar = this.Q1;
        if (hVar.h(j3) >= 0) {
            hVar.l(dialog.id);
            this.R1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(false, true);
            }
            b1(1);
            po0Var = this;
        } else {
            TLRPC.User a22 = org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(dialog.id));
            TLRPC.Chat M05 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.q10.u(a22) && !(((l10 = org.telegram.messenger.np.s1(this.a).r7.l(-a22.id)) == null || l10.isEmpty()) && org.telegram.messenger.np.s1(this.a).r7.e(-a22.id))) || (org.telegram.messenger.m5.z(dialog.id) && (org.telegram.messenger.t3.c0(M05) || (org.telegram.messenger.t3.p0(M05) && org.telegram.messenger.t3.A(this.a, M05, 24))))) {
                this.y2 = dialog;
                this.E1.h1(0, this.l2 - uj0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                yn0 yn0Var = new yn0(this, dialog, atomicReference, view);
                atomicReference.set(new ma0(this, atomicReference, yn0Var, dialog, 3));
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.a);
                int i10 = org.telegram.messenger.ns.q5;
                f10.b(yn0Var, i10);
                if (org.telegram.messenger.np.s1(this.a).r7.l(-dialog.id) != null) {
                    yn0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.np.s1(this.a).r7.o(-dialog.id);
                    org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            po0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(true, true);
            }
            b1(2);
            long j10 = org.telegram.messenger.m10.i(po0Var.a).n;
            if (po0Var.H2) {
                io0 io0Var = po0Var.G1;
                a0.h hVar2 = io0Var.e;
                ArrayList arrayList = io0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    io0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                io0Var.f();
                po0Var.w2 = false;
                v00 v00Var = po0Var.u2;
                v00Var.r.setText("");
                K0(false);
                org.telegram.messenger.g0.v1(v00Var.r);
            }
        }
        mo0 mo0Var = po0Var.I1;
        if (mo0Var == null || (lo0Var = mo0Var.I) == null) {
            return;
        }
        lo0Var.k(0, lo0Var.b());
    }

    public final void V0(final boolean z10) {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.Q1;
            int m10 = hVar.m();
            un0 un0Var = this.n1;
            vn0 vn0Var = this.o1;
            if (i11 >= m10) {
                Editable text = vn0Var.getText();
                mt mtVar = vn0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.si.b0(this.a).W(charSequenceArr, true, true);
                fp fpVar = this.a2;
                int i12 = (fpVar == null || !fpVar.a.q) ? -1 : this.X1;
                ArrayList arrayList = new ArrayList();
                if (this.J1 != null) {
                    i7 = 0;
                    while (i10 < hVar.m()) {
                        long j3 = hVar.j(i10);
                        long N1 = org.telegram.messenger.np.s1(this.a).N1(j3);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.a).J2(j3));
                        }
                        if (un0Var.getTag() != null && mtVar.length() > 0 && N1 > 0) {
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
                    do0 do0Var = this.S1;
                    int i13 = do0Var != null ? do0Var.e : 0;
                    if (this.B2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j10 = hVar.j(i14);
                            long N12 = org.telegram.messenger.np.s1(this.a).N1(j10);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.a).J2(j10));
                            }
                            int i16 = i10;
                            if (this.B2 != null && un0Var.getTag() != null && mtVar.length() > 0 && charSequenceArr[i16] != null && N12 > 0) {
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
                        if (this.K1[i13] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j11 = hVar.j(i18);
                                long N13 = org.telegram.messenger.np.s1(this.a).N1(j11);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.a).J2(j11));
                                }
                                if (un0Var.getTag() != null && mtVar.length() > 0 && N13 > 0) {
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
                t4.Z(this.a, arrayList, i7, new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.pn0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.e6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        int i20;
                        boolean z11;
                        int i21;
                        HashMap hashMap;
                        long j12;
                        boolean z12;
                        char c10;
                        org.telegram.messenger.gj gjVar;
                        vn0 vn0Var2;
                        long longValue;
                        boolean z13;
                        boolean z14;
                        long j13;
                        String[] strArr;
                        org.telegram.messenger.gj gjVar2;
                        org.telegram.messenger.cz b10;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i22;
                        boolean z15;
                        long j14;
                        Long l10;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.gj gjVar3;
                        org.telegram.messenger.gj gjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        po0 po0Var = po0.this;
                        String[] strArr2 = po0Var.K1;
                        vn0 vn0Var3 = po0Var.o1;
                        un0 un0Var2 = po0Var.n1;
                        HashMap hashMap3 = po0Var.R1;
                        Long l11 = 0L;
                        a0.h hVar2 = po0Var.Q1;
                        ArrayList arrayList4 = po0Var.J1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = W;
                        boolean z16 = z10;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i23 = 0;
                            boolean z17 = false;
                            while (true) {
                                if (i23 >= hVar2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z18 = z16;
                                long j15 = hVar2.j(i23);
                                boolean y22 = org.telegram.messenger.np.s1(po0Var.a).y2(j15);
                                un0 un0Var3 = un0Var2;
                                Long l12 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j15));
                                boolean z19 = (l12 == null || l12.longValue() <= 0) ? z17 : true;
                                Long l13 = l12;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j15));
                                if (tL_forumTopic2 == null || !y22) {
                                    i22 = i23;
                                    z15 = y22;
                                    j14 = 0;
                                } else {
                                    i22 = i23;
                                    z15 = y22;
                                    j14 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z15) {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    gjVar3 = null;
                                } else {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    gjVar3 = new org.telegram.messenger.gj(po0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (gjVar3 != null) {
                                    gjVar3.p = true;
                                }
                                if (un0Var3.getTag() == null || vn0Var3.a.length() <= 0) {
                                    gjVar4 = gjVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    gjVar4 = gjVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.cz b11 = org.telegram.messenger.cz.b(charSequence == null ? null : charSequence.toString(), j15, gjVar4, gjVar3, null, true, arrayList7, null, null, z18, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z18 = z18;
                                    b11.Q = l13 == null ? 0L : l13.longValue();
                                    b11.R = j14;
                                    org.telegram.messenger.ez.C(po0Var.a).r0(b11);
                                }
                                boolean z20 = z18;
                                int q02 = org.telegram.messenger.ez.C(po0Var.a).q0(po0Var.J1, j15, !po0Var.E2, false, z20, 0, 0, gjVar4, i19, l13 == null ? 0L : l13.longValue(), j14, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j15));
                                }
                                if (hVar2.m() == 1) {
                                    t4.q0(q02, po0Var.b2, r11);
                                    if (q02 != 0) {
                                        z17 = z19;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z16 = z20;
                                un0Var2 = un0Var3;
                                z17 = z19;
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
                                po0Var.R0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z17);
                            }
                        } else {
                            boolean z21 = z16;
                            do0 do0Var2 = po0Var.S1;
                            int i25 = do0Var2 != null ? do0Var2.e : 0;
                            if (po0Var.B2 != null) {
                                int i26 = 0;
                                boolean z22 = false;
                                while (i26 < hVar2.m()) {
                                    long j16 = hVar2.j(i26);
                                    boolean y23 = org.telegram.messenger.np.s1(po0Var.a).y2(j16);
                                    Long l14 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j16));
                                    if (l14 != null && l14.longValue() > 0) {
                                        z22 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                    if (tL_forumTopic3 == null || !y23) {
                                        z13 = z22;
                                        z14 = y23;
                                        j13 = 0;
                                    } else {
                                        z13 = z22;
                                        z14 = y23;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || z14) {
                                        strArr = strArr2;
                                        gjVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        gjVar2 = new org.telegram.messenger.gj(po0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (po0Var.B2 != null) {
                                        if (un0Var2.getTag() != null && vn0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.gj gjVar5 = gjVar2;
                                            gjVar2 = gjVar5;
                                            org.telegram.messenger.ez.C(po0Var.a).r0(org.telegram.messenger.cz.b(charSequenceArr3[0].toString(), j16, null, gjVar5, null, true, null, null, null, z21, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.cz.b(null, j16, gjVar2, gjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                        b10.I = po0Var.B2;
                                    } else if (un0Var2.getTag() == null || vn0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.cz.b(strArr[i25], j16, gjVar2, gjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z23 = z21;
                                        b10 = org.telegram.messenger.cz.b(charSequence2 == null ? null : charSequence2.toString(), j16, gjVar2, gjVar2, null, true, arrayList5, null, null, z23, 0, 0, null, false);
                                        z21 = z23;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j13;
                                    org.telegram.messenger.ez.C(po0Var.a).r0(b10);
                                    i26++;
                                    z22 = z13;
                                    strArr2 = strArr;
                                }
                                z11 = z22;
                            } else if (strArr2[i25] != null) {
                                int i27 = 0;
                                boolean z24 = false;
                                while (i27 < hVar2.m()) {
                                    long j17 = hVar2.j(i27);
                                    boolean y24 = org.telegram.messenger.np.s1(po0Var.a).y2(j17);
                                    Long l15 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j17));
                                    if (l15 != null && l15.longValue() > 0) {
                                        z24 = true;
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
                                        z12 = z24;
                                        c10 = 0;
                                        gjVar = null;
                                    } else {
                                        z12 = z24;
                                        c10 = 0;
                                        gjVar = new org.telegram.messenger.gj(po0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (un0Var2.getTag() == null || vn0Var3.a.length() <= 0) {
                                        vn0Var2 = vn0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z25 = z21;
                                        org.telegram.messenger.cz b12 = org.telegram.messenger.cz.b(charSequence3 == null ? null : charSequence3.toString(), j17, gjVar, gjVar, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                        z21 = z25;
                                        if (l15 == null) {
                                            vn0Var2 = vn0Var3;
                                            longValue = 0;
                                        } else {
                                            vn0Var2 = vn0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j12;
                                        org.telegram.messenger.ez.C(po0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.gj gjVar6 = gjVar;
                                    org.telegram.messenger.cz b13 = org.telegram.messenger.cz.b(strArr2[i25], j17, gjVar6, gjVar6, null, true, null, null, null, z21, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j12;
                                    org.telegram.messenger.ez.C(po0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    vn0Var3 = vn0Var2;
                                    hashMap2 = hashMap;
                                    z24 = z12;
                                }
                                z11 = z24;
                            } else {
                                i20 = 0;
                                z11 = false;
                                po0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                            }
                            i20 = 0;
                            po0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                        }
                        fo0 fo0Var = po0Var.o2;
                        if (fo0Var != null) {
                            fo0Var.W();
                        }
                        po0Var.dismiss();
                    }
                });
                return;
            }
            if (t4.h(getContext(), this.a, hVar.j(i11), un0Var.getTag() != null && vn0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void X0(boolean z10) {
        un0 un0Var = this.n1;
        if (z10 == (un0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        un0Var.setTag(z10 ? 1 : null);
        vn0 vn0Var = this.o1;
        if (vn0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(vn0Var.getEditText());
        }
        vn0Var.k(true);
        FrameLayout frameLayout = this.Y1;
        un0 un0Var2 = this.q1;
        FrameLayout frameLayout2 = this.r1;
        if (z10) {
            un0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            un0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i7 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.y1;
        if (linearLayout != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.z1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(un0Var, (Property<un0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, (Property<un0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, (Property<un0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(un0Var2, (Property<un0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.O1[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.u1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.d2 && z10) {
                f10 = org.telegram.messenger.g0.L(this.Z1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.z1.playTogether(arrayList);
        this.z1.setInterpolator(new DecelerateInterpolator());
        this.z1.setDuration(180L);
        this.z1.addListener(new ao0(this, z10, 1));
        this.z1.start();
    }

    public final void Y0(long j3, View view) {
        int i7 = -this.D2;
        this.D2 = i7;
        org.telegram.messenger.g0.F3(i7, view, null);
        org.telegram.messenger.p2.E.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(j3))) : "";
        boolean D3 = org.telegram.messenger.np.s1(this.a).D3();
        int i10 = 1;
        FrameLayout frameLayout = this.w1;
        (D3 ? new cc(frameLayout, this.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, p10))) : new cc(frameLayout, this.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, p10)), org.telegram.messenger.hd.M0(2131743759, null), new mn0(this, i10))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.i1 i1Var;
        un0 un0Var = this.n1;
        if (un0Var == null) {
            return;
        }
        vn0 vn0Var = this.o1;
        if (vn0Var == null || !vn0Var.m()) {
            co0 co0Var = this.z2;
            if (co0Var != null && (i1Var = co0Var.I) != null && !i1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            vn0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.Y1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.r1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        un0Var.setTranslationY(f11);
        this.q1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.j5 j5Var = this.v1;
        if (j5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            j5Var.l(O0, false);
        }
    }

    public final void b1(int i7) {
        a0.h hVar = this.Q1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.J1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.n1.getTag();
        vn0 vn0Var = this.o1;
        if (tag != null && vn0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).id;
            long N1 = org.telegram.messenger.np.s1(this.a).N1(j10);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(this.a).J2(j10));
            }
            j3 += N1;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i7 != 0;
        oi.u1 u1Var = this.p1;
        u1Var.e(max, z10);
        u1Var.i(size, j3, i7 != 0);
        X0(true);
        vn0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), u1Var.l()), 0);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.s;
        if (i7 == i11) {
            io0 io0Var = this.G1;
            if (io0Var != null) {
                io0Var.E();
            }
            org.telegram.messenger.ns.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        vn0 vn0Var = this.o1;
        if (vn0Var != null) {
            org.telegram.messenger.g0.v1(vn0Var.getEditText());
        }
        this.U1 = false;
        super.dismiss();
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.s);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        if (this.y2 != null) {
            L0();
            return;
        }
        vn0 vn0Var = this.o1;
        if (vn0Var == null || !vn0Var.e) {
            super.onBackPressed();
        } else {
            vn0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.L2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.c;
            if (k2Var != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, this.J0)) > 0.721f;
                if (z10 != this.T2) {
                    this.T2 = z10;
                    org.telegram.messenger.g0.o3(k2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public po0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public po0(Context context, org.telegram.ui.an anVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        int i7;
        float f10;
        float f11;
        rn0 rn0Var;
        rn0 rn0Var2;
        LinearLayout linearLayout;
        int i10;
        final int i11 = 1;
        final int i12 = 2;
        String[] strArr = new String[2];
        this.K1 = strArr;
        this.O1 = new View[2];
        this.P1 = new AnimatorSet[2];
        this.Q1 = new a0.h();
        this.R1 = new HashMap();
        this.T1 = -1;
        final int i13 = 0;
        this.U1 = false;
        new RectF();
        new Paint(1);
        this.f2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.k2 = strArr2;
        this.A2 = new ArrayList();
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
        this.C2 = i0.c.e;
        this.D2 = 4;
        this.E2 = true;
        this.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.g0.S(getWindow());
        ui.c d = this.Y0.d(new ln0(this, i14));
        this.L2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.gz.f()) {
            dh.g gVar = new dh.g(false);
            this.K2 = gVar;
            this.Y0.a(gVar);
            ui.f fVar = new ui.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            ui.f fVar2 = new ui.f(d);
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.M2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.qc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.Y0;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.N2 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            ri.q qVar = this.Y0;
            cVar2.j = qVar;
            dh.c cVar3 = new dh.c(d, d, d);
            this.O2 = cVar3;
            cVar3.j = qVar;
        } else {
            this.K2 = null;
            dh.c cVar4 = new dh.c(d, d, d);
            cVar4.j = this.Y0;
            this.N2 = cVar4;
            this.M2 = cVar4;
            this.O2 = cVar4;
        }
        this.J0 = e6Var;
        this.V1 = z13;
        this.c2 = org.telegram.messenger.g0.W(context);
        this.d2 = z12;
        if (z12) {
            this.J0 = new fi.i0(i12);
        }
        d.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0));
        this.b2 = anVar;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.N1 = g10;
        int i17 = org.telegram.ui.ActionBar.j6.h5;
        this.b0 = i17;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i17, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(0);
            String r10 = org.telegram.messenger.m5.r(org.telegram.messenger.np.s1(this.a).e2(org.telegram.messenger.gj.B0(gjVar.k)));
            if (!TextUtils.isEmpty(r10)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.s1(this.a).V2, "/", r10, "/");
                sb2.append(gjVar.e1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && gjVar.z2()) {
                    strArr2[0] = a8.p0.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.J1 = arrayList;
        this.I1 = new mo0(this, context);
        this.j2 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new org.telegram.ui.h0(this, i11);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.J1.get(i18);
                if (gjVar2.D4()) {
                    this.L1 = 3;
                } else if (gjVar2.T3()) {
                    int i19 = gjVar2.Z3() ? 2 : 1;
                    this.L1 = i19;
                    if (i19 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i20 = 21;
        if (z10) {
            this.h2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.gj) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.np.s1(this.a).h1(((org.telegram.messenger.gj) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.v7(i20, this, context));
        }
        co0 co0Var = new co0(this, context);
        this.z2 = co0Var;
        this.b = co0Var;
        co0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i21 = this.u0;
        viewGroup.setPadding(i21, 0, i21, this.C2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.t2(this));
        if (this.d2 && this.k2[1] != null) {
            do0 do0Var = new do0(this, context);
            this.S1 = do0Var;
            frameLayout.addView(do0Var, c8.ja.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        v00 v00Var = new v00(context, this.J0);
        this.u2 = v00Var;
        wn0 wn0Var = new wn0(this, i11);
        ah.i iVar = v00Var.r;
        iVar.addTextChangedListener(wn0Var);
        iVar.setHint(org.telegram.messenger.hd.M0(2131745440, null));
        iVar.setOnEditorActionListener(new q0(this, 7));
        v00Var.setCloseButtonOnClickListener(new mn0(this, i13));
        frameLayout.addView(v00Var, c8.ja.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.v2 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i22 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.l(kVar, 5, i22, this.J0);
        org.telegram.ui.ActionBar.q6.l(kVar, 6, org.telegram.ui.ActionBar.j6.q5, this.J0);
        org.telegram.ui.ActionBar.q6.l(kVar, 1, org.telegram.ui.ActionBar.j6.z6, null);
        org.telegram.ui.ActionBar.q6.l(kVar, 3, org.telegram.ui.ActionBar.j6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 18));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, c8.ja.e(-1, 58, 83));
        uj0 uj0Var = new uj0(context, this.J0);
        this.A1 = uj0Var;
        v4.s sVar = new v4.s(4);
        this.E1 = sVar;
        uj0Var.setLayoutManager(sVar);
        sVar.O = new sn0(this, i12);
        uj0Var.setOnScrollListener(new tn0(this, i12));
        no0 no0Var = new no0(this, context);
        this.H1 = no0Var;
        uj0Var.setAdapter(no0Var);
        int i23 = org.telegram.ui.ActionBar.j6.A5;
        org.telegram.ui.ActionBar.q6.l(uj0Var, 21, i23, this.J0);
        uj0Var.setVerticalScrollBarEnabled(false);
        uj0Var.setHorizontalScrollBarEnabled(false);
        uj0Var.setOverScrollMode(2);
        uj0Var.setSelectorDrawableColor(0);
        int i24 = 10;
        uj0Var.setItemSelectorColorProvider(new rb0(i24));
        uj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        uj0Var.setClipToPadding(false);
        uj0Var.i(new fi.k(9));
        uj0Var.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.nn0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        po0 po0Var = this.b;
                        v00 v00Var2 = po0Var.u2;
                        HashMap hashMap = po0Var.R1;
                        a0.h hVar = po0Var.Q1;
                        io0 io0Var = po0Var.G1;
                        no0 no0Var2 = po0Var.H1;
                        if (no0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = po0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var.e.f(dialog2.id)) == null) {
                                        io0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = io0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    io0Var.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < po0Var.P0().getChildCount(); i26++) {
                                    View childAt = po0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = no0Var2.E(i25);
                            if (E != null && (dialog = po0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.np.s1(po0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = po0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var.e.f(dialog3.id)) == null) {
                                        io0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = io0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    io0Var.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < po0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = po0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            po0 po0Var2 = this.b;
                            ArrayList arrayList4 = po0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                po0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            po0 po0Var3 = this.b;
                            mo0 mo0Var = po0Var3.I1;
                            po0 po0Var4 = mo0Var.L;
                            int i29 = mo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < mo0Var.d.size()) {
                                        dialog5 = ((eo0) mo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - mo0Var.d.size();
                                        ArrayList arrayList5 = mo0Var.e.d;
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
                                    po0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < po0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) po0Var4.A2.get(i31)).a;
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
        uj0Var.setVisibility(8);
        this.b.addView(uj0Var, c8.ja.e(-1, -1, 51));
        rn0 rn0Var3 = new rn0(this, context, this.J0, i13);
        this.B1 = rn0Var3;
        rn0Var3.setSelectorDrawableColor(0);
        rn0Var3.setItemSelectorColorProvider(new rb0(i24));
        rn0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        rn0Var3.setClipToPadding(false);
        getContext();
        v4.s sVar2 = new v4.s(4);
        this.D1 = sVar2;
        rn0Var3.setLayoutManager(sVar2);
        this.P2 = new zg(this, i12);
        sVar2.O = new sn0(this, i13);
        rn0Var3.setHorizontalScrollBarEnabled(false);
        rn0Var3.setVerticalScrollBarEnabled(false);
        rn0Var3.setOverScrollMode(2);
        rn0Var3.i(new fi.k(i24));
        this.b.addView(rn0Var3, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        io0 io0Var = new io0(this, context);
        this.G1 = io0Var;
        rn0Var3.setAdapter(io0Var);
        org.telegram.ui.ActionBar.q6.l(rn0Var3, 21, i23, this.J0);
        rn0Var3.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.nn0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        po0 po0Var = this.b;
                        v00 v00Var2 = po0Var.u2;
                        HashMap hashMap = po0Var.R1;
                        a0.h hVar = po0Var.Q1;
                        io0 io0Var2 = po0Var.G1;
                        no0 no0Var2 = po0Var.H1;
                        if (no0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = po0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var2.e.f(dialog2.id)) == null) {
                                        io0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = io0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    io0Var2.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < po0Var.P0().getChildCount(); i26++) {
                                    View childAt = po0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = no0Var2.E(i25);
                            if (E != null && (dialog = po0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.np.s1(po0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = po0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var2.e.f(dialog3.id)) == null) {
                                        io0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = io0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    io0Var2.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < po0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = po0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            po0 po0Var2 = this.b;
                            ArrayList arrayList4 = po0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                po0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            po0 po0Var3 = this.b;
                            mo0 mo0Var = po0Var3.I1;
                            po0 po0Var4 = mo0Var.L;
                            int i29 = mo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < mo0Var.d.size()) {
                                        dialog5 = ((eo0) mo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - mo0Var.d.size();
                                        ArrayList arrayList5 = mo0Var.e.d;
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
                                    po0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < po0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) po0Var4.A2.get(i31)).a;
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
        rn0Var3.setOnScrollListener(new tn0(this, i13));
        this.Y0.b(rn0Var3);
        rn0 rn0Var4 = new rn0(this, context, this.J0, i11);
        this.C1 = rn0Var4;
        rn0Var4.setItemSelectorColorProvider(new rb0(i24));
        rn0Var4.setSelectorDrawableColor(0);
        rn0Var4.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        rn0Var4.setClipToPadding(false);
        getContext();
        py pyVar = new py(4, 0, rn0Var4);
        this.F1 = pyVar;
        rn0Var4.setLayoutManager(pyVar);
        pyVar.O = new sn0(this, i11);
        rn0Var4.setOnItemClickListener(new gj0(this) { // from class: org.telegram.ui.Components.nn0
            public final /* synthetic */ po0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.gj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        po0 po0Var = this.b;
                        v00 v00Var2 = po0Var.u2;
                        HashMap hashMap = po0Var.R1;
                        a0.h hVar = po0Var.Q1;
                        io0 io0Var2 = po0Var.G1;
                        no0 no0Var2 = po0Var.H1;
                        if (no0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = po0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var2.e.f(dialog2.id)) == null) {
                                        io0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = io0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    io0Var2.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < po0Var.P0().getChildCount(); i26++) {
                                    View childAt = po0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = no0Var2.E(i25);
                            if (E != null && (dialog = po0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.np.s1(po0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = po0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                po0Var.b1(2);
                                if (po0Var.H2 || po0Var.I2) {
                                    if (((TLRPC.Dialog) io0Var2.e.f(dialog3.id)) == null) {
                                        io0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = io0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    io0Var2.f();
                                    po0Var.w2 = false;
                                    v00Var2.r.setText("");
                                    po0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < po0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = po0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == po0Var.y2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                po0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            po0 po0Var2 = this.b;
                            ArrayList arrayList4 = po0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                po0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            po0 po0Var3 = this.b;
                            mo0 mo0Var = po0Var3.I1;
                            po0 po0Var4 = mo0Var.L;
                            int i29 = mo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < mo0Var.d.size()) {
                                        dialog5 = ((eo0) mo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - mo0Var.d.size();
                                        ArrayList arrayList5 = mo0Var.e.d;
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
                                    po0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < po0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) po0Var4.A2.get(i31)).a;
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
        rn0Var4.setHasFixedSize(true);
        rn0Var4.setItemAnimator(null);
        rn0Var4.setHorizontalScrollBarEnabled(false);
        rn0Var4.setVerticalScrollBarEnabled(false);
        rn0Var4.setOnScrollListener(new tn0(this, i11));
        rn0Var4.i(new fi.k(11));
        rn0Var4.setAdapter(this.I1);
        org.telegram.ui.ActionBar.q6.l(rn0Var4, 21, i23, this.J0);
        this.t2 = new xi0(rn0Var4, true);
        pz pzVar = new pz(context, this.J0);
        pzVar.setViewType(12);
        cv0 cv0Var = new cv0(context, pzVar, 1, this.J0);
        this.M1 = cv0Var;
        cv0Var.addView(pzVar, 0);
        cv0Var.setAnimateLayoutChange(true);
        cv0Var.e(false, false);
        boolean z14 = this.d2;
        xh.l lVar = cv0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.q6.U(lVar, org.telegram.ui.ActionBar.j6.eh, this.J0);
        }
        lVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
        rn0Var4.setEmptyView(cv0Var);
        rn0Var4.setHideIfEmpty(false);
        rn0Var4.X1 = true;
        rn0Var4.Y1 = 0;
        this.b.addView(cv0Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(rn0Var4, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.o2 o2Var = new bi.o2(23, context, this);
        this.t1 = o2Var;
        this.b.addView(o2Var, c8.ja.e(-1, org.telegram.messenger.ns.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.d2 || this.k2[1] == null) ? 58.0f : 111.0f);
        this.O1[0] = new View(context);
        View view = this.O1[0];
        int i25 = org.telegram.ui.ActionBar.j6.V5;
        org.telegram.ui.ActionBar.q6.h(i25, view, this.J0);
        this.O1[0].setAlpha(0.0f);
        this.O1[0].setTag(1);
        this.b.addView(this.O1[0], layoutParams);
        this.b.addView(frameLayout, c8.ja.e(-1, (!this.d2 || this.k2[1] == null) ? 58 : org.telegram.messenger.ns.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.O1[1] = new View(context);
        org.telegram.ui.ActionBar.q6.h(i25, this.O1[1], this.J0);
        this.O1[1].setLayoutParams(layoutParams2);
        if (!this.j2 && this.k2[0] == null) {
            this.O1[1].setAlpha(0.0f);
            rn0Var = rn0Var3;
            rn0Var2 = rn0Var4;
            f10 = 4.0f;
            f11 = 9.0f;
        } else {
            f10 = 4.0f;
            f11 = 9.0f;
            if (this.d2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.r1 = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.u1 = frameLayout3;
                frameLayout2.addView(frameLayout3, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                c8.na.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new kn0(this, 4));
                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                this.v1 = j5Var;
                j5Var.setTextSize(15);
                org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.Kl, this.J0);
                j5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(j5Var, c8.ja.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, this.J0);
                textView.setText(org.telegram.messenger.hd.M0(2131751767, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i26 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i26, this.J0), 4, 4);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i26);
                org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
                textView.setBackground(a02);
                rn0Var2 = rn0Var4;
                org.telegram.ui.ActionBar.q6.j(textView, a02, null, M, e6Var2);
                linearLayout3.addView(textView, c8.ja.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new kn0(this, 5));
                c8.na.a(textView);
                this.b.addView(frameLayout2, c8.ja.e(-1, 58, 83));
                ArrayList arrayList2 = this.J1;
                if (arrayList2 == null || arrayList2.size() <= 0 || ((org.telegram.messenger.gj) this.J1.get(0)).k == null || ((org.telegram.messenger.gj) this.J1.get(0)).k.forwards <= 0) {
                    rn0Var = rn0Var3;
                } else {
                    final org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.J1.get(0);
                    rn0Var = rn0Var3;
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-org.telegram.messenger.gj.B0(gjVar3.k)))) && !org.telegram.messenger.gj.l3(gjVar3.k)) {
                        final int i27 = 0;
                        linearLayout = org.telegram.messenger.k5.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qn0
                            public final /* synthetic */ po0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i27) {
                                    case 0:
                                        po0 po0Var = this.b;
                                        org.telegram.ui.ActionBar.e2 e2Var = po0Var.b2;
                                        if (e2Var == null) {
                                            e2Var = LaunchActivity.T();
                                        }
                                        if (e2Var != null) {
                                            po0Var.dismiss();
                                            e2Var.presentFragment(new org.telegram.ui.jg0(gjVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        po0 po0Var2 = this.b;
                                        org.telegram.ui.ActionBar.e2 e2Var2 = po0Var2.b2;
                                        if (e2Var2 == null) {
                                            e2Var2 = LaunchActivity.T();
                                        }
                                        if (e2Var2 != null) {
                                            po0Var2.dismiss();
                                            e2Var2.presentFragment(new org.telegram.ui.jg0(gjVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i26, this.J0), 6, 6);
                        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i26);
                        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.q6.j(linearLayout, a03, null, M2, e6Var3);
                        c8.na.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i28 = org.telegram.ui.ActionBar.j6.Ml;
                        org.telegram.ui.ActionBar.q6.s(imageView, i28, this.J0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, c8.ja.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.q6.U(textView2, i28, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.hd.E(gjVar3.k.forwards, ','));
                        linearLayout.addView(textView2, c8.ja.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i10 = 8;
                        linearLayout2.addView(linearLayout3, c8.ja.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, c8.ja.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i10 = 11;
                linearLayout2.addView(linearLayout3, c8.ja.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                if (linearLayout != null) {
                }
            } else {
                rn0Var = rn0Var3;
                rn0Var2 = rn0Var4;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.r1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.u1 = frameLayout5;
                frameLayout4.addView(frameLayout5, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i29 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i29, this.J0), 20, 20);
                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i29);
                org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.q6.j(textView3, a04, null, M3, e6Var4);
                org.telegram.ui.ActionBar.q6.U(textView3, this.d2 ? org.telegram.ui.ActionBar.j6.gh : org.telegram.ui.ActionBar.j6.n5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.d2 && this.k2[1] != null) {
                    textView3.setText(org.telegram.messenger.hd.M0(2131743387, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.hd.L0(2131751762).toUpperCase());
                }
                textView3.setOnClickListener(new kn0(this, 6));
                frameLayout5.addView(textView3, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
                this.b.addView(frameLayout4, c8.ja.e(-1, 58, 87));
                ArrayList arrayList3 = this.J1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.gj) this.J1.get(0)).k != null && ((org.telegram.messenger.gj) this.J1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) this.J1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-gjVar4.A0()))) && !gjVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.y1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.q6.Q(linearLayout4, org.telegram.ui.ActionBar.j6.a0(W(this.d2 ? org.telegram.ui.ActionBar.j6.Vg : i29), 20, 20), null, org.telegram.ui.ActionBar.q6.M(this.d2 ? org.telegram.ui.ActionBar.j6.Vg : i29), this.J0);
                        frameLayout5.addView(linearLayout4, c8.ja.e(-2, -1, 21));
                        final int i30 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qn0
                            public final /* synthetic */ po0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        po0 po0Var = this.b;
                                        org.telegram.ui.ActionBar.e2 e2Var = po0Var.b2;
                                        if (e2Var == null) {
                                            e2Var = LaunchActivity.T();
                                        }
                                        if (e2Var != null) {
                                            po0Var.dismiss();
                                            e2Var.presentFragment(new org.telegram.ui.jg0(gjVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        po0 po0Var2 = this.b;
                                        org.telegram.ui.ActionBar.e2 e2Var2 = po0Var2.b2;
                                        if (e2Var2 == null) {
                                            e2Var2 = LaunchActivity.T();
                                        }
                                        if (e2Var2 != null) {
                                            po0Var2.dismiss();
                                            e2Var2.presentFragment(new org.telegram.ui.jg0(gjVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.q6.s(imageView2, this.d2 ? org.telegram.ui.ActionBar.j6.gh : org.telegram.ui.ActionBar.j6.n5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, c8.ja.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(gjVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.q6.U(textView4, this.d2 ? org.telegram.ui.ActionBar.j6.gh : org.telegram.ui.ActionBar.j6.n5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout4.addView(textView4, c8.ja.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.w1 = frameLayout6;
        this.b.addView(frameLayout6, c8.ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.u1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.x1 = frameLayout7;
        this.b.addView(frameLayout7, c8.ja.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        un0 un0Var = new un0(this, context, 0);
        this.n1 = un0Var;
        un0Var.setWillNotDraw(false);
        un0Var.setAlpha(0.0f);
        un0Var.setVisibility(4);
        this.b.addView(un0Var, c8.ja.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        un0Var.setOnTouchListener(new gi.a(23));
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        boolean z15 = org.telegram.messenger.g0.B(W(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
        this.T2 = z15;
        org.telegram.messenger.g0.o3(k2Var, z15);
        vn0 vn0Var = new vn0(this, context, co0Var, this.J0);
        this.o1 = vn0Var;
        vn0Var.K = true;
        if (this.d2) {
            ft editText = vn0Var.getEditText();
            int i31 = org.telegram.ui.ActionBar.j6.eh;
            editText.setTextColor(W(i31));
            vn0Var.getEditText().setCursorColor(W(i31));
        }
        vn0Var.setHint(org.telegram.messenger.hd.L0(2131745462));
        vn0Var.s();
        vn0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        un0Var.addView(vn0Var, c8.ja.e(-1, -2, 51));
        un0Var.setClipChildren(false);
        un0Var.setClipToPadding(false);
        vn0Var.setClipChildren(false);
        vn0Var.getEditText().addTextChangedListener(new wn0(this, 0));
        un0 un0Var2 = new un0(this, context, 1);
        this.q1 = un0Var2;
        un0Var2.setFocusable(true);
        un0Var2.setFocusableInTouchMode(true);
        un0Var2.setVisibility(4);
        un0Var2.setScaleX(0.2f);
        un0Var2.setScaleY(0.2f);
        un0Var2.setAlpha(0.0f);
        this.b.addView(un0Var2, c8.ja.e(org.telegram.messenger.ns.v1, 50, 85));
        oi.u1 u1Var = new oi.u1(this, context, this.J0);
        this.p1 = u1Var;
        int L3 = org.telegram.messenger.g0.L(52.0f);
        int L4 = org.telegram.messenger.g0.L(38.0f);
        u1Var.L = L3;
        u1Var.M = L4;
        float L5 = org.telegram.messenger.g0.L(1.0f);
        float L6 = org.telegram.messenger.g0.L(6.0f);
        u1Var.P = L5;
        u1Var.Q = L6;
        u1Var.q0 = true;
        un0Var2.addView(u1Var, c8.ja.g());
        u1Var.setOnClickListener(new kn0(this, 0));
        u1Var.setOnLongClickListener(new h00(this, 2));
        this.f2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.f2.setTypeface(org.telegram.messenger.g0.o());
        if (num != null) {
            this.X1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.Y1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Z1 = linearLayout5;
            linearLayout5.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i32 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.ActionBar.q6.Q(linearLayout5, org.telegram.ui.ActionBar.j6.a0(W(i32), 6, 6), null, org.telegram.ui.ActionBar.q6.M(i32), this.J0);
            fp fpVar = new fp(24, context, this.J0);
            this.a2 = fpVar;
            fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
            fpVar.setDrawUnchecked(true);
            fpVar.a(false, false);
            fpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView5, i22, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.hd.Z(2131743581, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
            c8.na.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new kn0(this, 1));
            frameLayout8.addView(linearLayout5, c8.ja.e(-2, -2, 17));
            if (this.r1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view2, this.J0);
                frameLayout8.addView(view2, c8.ja.a(-1.0f, this.d2 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, c8.ja.e(-1, 58, 83));
            if (this.r1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        dh.d dVar = new dh.d(this.O2.b(o2Var, null));
        this.R2 = dVar;
        if (org.telegram.messenger.gz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        fh.g b10 = this.N2.b(this.z2, c8.g0.e(this.J0));
        this.Q2 = b10;
        b10.T = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.R.g = 0.4f;
        b10.n();
        fh.g b11 = this.M2.b(un0Var, c8.g0.e(this.J0));
        this.S2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        un0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
        FrameLayout frameLayout9 = this.u1;
        if (frameLayout9 != null) {
            fh.g b12 = this.M2.b(frameLayout9, c8.g0.e(this.J0));
            b12.q(org.telegram.messenger.g0.L(f11));
            b12.r(org.telegram.messenger.g0.L(22.0f));
            this.u1.setBackground(b12);
            this.u1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        FrameLayout frameLayout10 = this.Y1;
        if (frameLayout10 != null) {
            fh.g b13 = this.M2.b(frameLayout10, c8.g0.e(this.J0));
            b13.q(org.telegram.messenger.g0.L(f11));
            b13.r(org.telegram.messenger.g0.L(22.0f));
            this.Y1.setBackground(b13);
            this.Y1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        b1(0);
        org.telegram.ui.yw.u4(org.telegram.messenger.c.a(this.a));
        if (io0Var.d.isEmpty()) {
            org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.s);
        }
        int i33 = this.a;
        int i34 = 0;
        org.telegram.messenger.vr.a0(i33).a.c(new jg.q(i33, i34, new xn0(this), i34));
        org.telegram.messenger.si.b0(this.a).M0(true);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new ln0(this, i34);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.V3(1.0f, rn0Var, true, false);
        org.telegram.messenger.g0.V3(1.0f, rn0Var2, false, false);
        r0.i0.l(this.c, new ln0(this, 1));
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
