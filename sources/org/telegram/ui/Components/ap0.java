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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class ap0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public static final /* synthetic */ int U2 = 0;
    public final ek0 A1;
    public ArrayList A2;
    public final co0 B1;
    public TL_stories.StoryItem B2;
    public final co0 C1;
    public i0.b C2;
    public final v4.t D1;
    public int D2;
    public final v4.t E1;
    public boolean E2;
    public final xy F1;
    public org.telegram.ui.ActionBar.g1 F2;
    public final to0 G1;
    public int G2;
    public final yo0 H1;
    public boolean H2;
    public final xo0 I1;
    public boolean I2;
    public final ArrayList J1;
    public int J2;
    public final String[] K1;
    public final dh.g K2;
    public final int L1;
    public final ui.c L2;
    public final nv0 M1;
    public final dh.c M2;
    public final Drawable N1;
    public final dh.c N2;
    public final View[] O1;
    public final dh.c O2;
    public final AnimatorSet[] P1;
    public final kh P2;
    public final a0.h Q1;
    public final fh.g Q2;
    public final HashMap R1;
    public final dh.d R2;
    public final oo0 S1;
    public final fh.g S2;
    public int T1;
    public boolean T2;
    public boolean U1;
    public final boolean V1;
    public boolean W1;
    public final int X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final op a2;
    public final org.telegram.ui.bn b2;
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
    public final fo0 n1;
    public boolean n2;
    public final go0 o1;
    public qo0 o2;
    public final oi.w1 p1;
    public float p2;
    public final fo0 q1;
    public float q2;
    public final FrameLayout r1;
    public float r2;
    public float s1;
    public ValueAnimator s2;
    public final bi.m3 t1;
    public final hj0 t2;
    public final FrameLayout u1;
    public final e10 u2;
    public final org.telegram.ui.ActionBar.m5 v1;
    public final org.telegram.ui.ActionBar.k v2;
    public final FrameLayout w1;
    public boolean w2;
    public final FrameLayout x1;
    public r1.g x2;
    public final LinearLayout y1;
    public TLRPC.Dialog y2;
    public AnimatorSet z1;
    public final no0 z2;

    public ap0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, h6Var);
    }

    public static void J0(ap0 ap0Var) {
        co0 co0Var = ap0Var.B1;
        co0 co0Var2 = ap0Var.C1;
        ek0 ek0Var = ap0Var.A1;
        if (ap0Var.n2) {
            return;
        }
        co0 co0Var3 = ap0Var.H2 ? co0Var2 : co0Var;
        if (co0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = co0Var3.getChildAt(0);
        for (int i7 = 0; i7 < co0Var3.getChildCount(); i7++) {
            if (co0Var3.getChildAt(i7).getTop() < childAt.getTop()) {
                childAt = co0Var3.getChildAt(i7);
            }
        }
        mj0 mj0Var = (mj0) co0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || mj0Var == null || mj0Var.b() != 0) ? 0 : top;
        if (top < 0 || mj0Var == null || mj0Var.b() != 0) {
            ap0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            ap0Var.U0(true);
            top = i10;
        } else {
            ap0Var.G2 = childAt.getTop();
            ap0Var.U0(false);
        }
        if (ek0Var.getVisibility() == 0) {
            if (ek0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = ek0Var.getChildAt(0);
            for (int i11 = 0; i11 < ek0Var.getChildCount(); i11++) {
                if (ek0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = ek0Var.getChildAt(i11);
                }
            }
            mj0 mj0Var2 = (mj0) ek0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || mj0Var2 == null || mj0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || mj0Var2 == null || mj0Var2.b() != 0) {
                ap0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                ap0Var.U0(true);
                top2 = i12;
            } else {
                ap0Var.G2 = childAt2.getTop();
                ap0Var.U0(false);
            }
            top = org.telegram.messenger.g0.W1(ek0Var.getAlpha(), top, top2);
        }
        int i13 = ap0Var.l2;
        if (i13 != top) {
            ap0Var.m2 = i13;
            float f10 = top;
            int i14 = (int) (ap0Var.p2 + f10);
            ap0Var.l2 = i14;
            co0Var.setTopGlowOffset(i14);
            int i15 = (int) (ap0Var.p2 + f10);
            ap0Var.l2 = i15;
            co0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + ap0Var.p2);
            ap0Var.l2 = i16;
            ek0Var.setTopGlowOffset(i16);
            ap0Var.m1.setTranslationY(ap0Var.l2 + ap0Var.p2);
            ap0Var.M1.setTranslationY(ap0Var.l2 + ap0Var.p2);
            ap0Var.b.invalidate();
        }
    }

    public static int K0(ap0 ap0Var) {
        co0 co0Var = ap0Var.B1;
        if (co0Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = co0Var.getChildAt(0);
        mj0 mj0Var = (mj0) co0Var.G(childAt);
        if (mj0Var == null) {
            return -1000;
        }
        int paddingTop = co0Var.getPaddingTop();
        if (mj0Var.c() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    public static ap0 O0(Context context, org.telegram.messenger.gj gjVar, String str, boolean z10, String str2) {
        return new ap0(context, gjVar != null ? org.telegram.messenger.f3.i(gjVar) : null, str, null, z10, str2, null, false);
    }

    public static void X0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != itemsCount - 1) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.t6.Q(childAt, org.telegram.ui.ActionBar.m6.a0(w02, i12, i11), null, org.telegram.ui.ActionBar.t6.M(i7), h6Var);
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void L() {
        super.L();
        go0 go0Var = this.o1;
        if (go0Var != null) {
            go0Var.o();
        }
    }

    public final void L0(boolean z10) {
        e10 e10Var = this.u2;
        ah.i iVar = e10Var.r;
        ah.i iVar2 = e10Var.r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        co0 co0Var = this.B1;
        co0 co0Var2 = this.C1;
        boolean z11 = true;
        if (!isEmpty || ((this.d && iVar2.hasFocus()) || this.I2)) {
            this.w2 = true;
            if (this.y2 == null) {
                org.telegram.messenger.g0.X3(co0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.V3(co0Var2, true);
            }
        } else {
            if (this.y2 == null) {
                org.telegram.messenger.g0.X3(co0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.V3(co0Var2, false);
            }
            z11 = false;
        }
        if (this.H2 != z11 || z10) {
            this.H2 = z11;
            xo0 xo0Var = this.I1;
            xo0Var.f();
            this.G1.f();
            if (this.H2) {
                if (this.G2 == Integer.MAX_VALUE) {
                    ((v4.c0) co0Var2.getLayoutManager()).h1(0, -co0Var2.getPaddingTop());
                } else {
                    ((v4.c0) co0Var2.getLayoutManager()).h1(0, this.G2 - co0Var2.getPaddingTop());
                }
                xo0Var.E(iVar2.getText().toString());
                return;
            }
            int i7 = this.G2;
            v4.t tVar = this.D1;
            if (i7 == Integer.MAX_VALUE) {
                tVar.h1(0, 0);
            } else {
                tVar.h1(0, 0);
            }
        }
    }

    public final void M0() {
        TLRPC.Dialog dialog = this.y2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.y2 = null;
        for (int i7 = 0; i7 < Q0().getChildCount(); i7++) {
            View childAt = Q0().getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) childAt).getCurrentDialog() == dialog.id) {
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
        Q0().setVisibility(0);
        e10 e10Var = this.u2;
        e10Var.setVisibility(0);
        ah.i iVar = e10Var.r;
        if (this.H2 || this.I2) {
            this.z2.I.v = true;
            iVar.requestFocus();
            org.telegram.messenger.g0.I3(iVar);
        }
        int[] iArr = new int[2];
        r1.g gVar2 = new r1.g(new r1.f(1000.0f));
        r1.h hVar = new r1.h(0.0f);
        org.telegram.ui.bn bnVar = this.b2;
        hVar.b((bnVar == null || !bnVar.b) ? 800.0f : 10.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.x2 = gVar2;
        gVar2.b(new un0(this, (org.telegram.ui.Cells.e7) view, iArr, 0));
        this.x2.a(new ya(this, 5));
        this.x2.h();
    }

    public final void N0() {
        boolean z10 = false;
        if (this.g2 == null && this.k2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", P0()));
            qo0 qo0Var = this.o2;
            if (qo0Var != null) {
                qo0Var.D0();
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

    public final String P0() {
        String str;
        String[] strArr = this.k2;
        oo0 oo0Var = this.S1;
        if (oo0Var != null) {
            str = strArr[oo0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        op opVar = this.a2;
        if (opVar != null && opVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.X1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final ek0 Q0() {
        return (this.H2 || this.I2) ? this.C1 : this.B1;
    }

    public final void R0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ek0 ek0Var = this.A1;
        ek0Var.setPivotX(width);
        ek0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        ek0Var.setScaleX(f12);
        ek0Var.setScaleY(f12);
        ek0Var.setAlpha(f10);
        ek0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        Q0.setScaleX(f13);
        Q0.setScaleY(f13);
        float f14 = 1.0f - f10;
        Q0.setAlpha(f14);
        e10 e10Var = this.u2;
        e10Var.setPivotX(e10Var.getWidth() / 2.0f);
        e10Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        e10Var.setScaleX(f15);
        e10Var.setScaleY(f15);
        e10Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.v2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        ek0Var.getLocationInWindow(iArr);
        float interpolation = nr.g.getInterpolation(f10);
        for (int i7 = 0; i7 < Q0.getChildCount(); i7++) {
            View childAt = Q0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.e7) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f10, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f14);
                }
            }
        }
        for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
            View childAt2 = ek0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ek0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        Q0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int S() {
        return this.b.getMeasuredHeight() - this.T1;
    }

    public final void U0(boolean z10) {
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
        animatorSetArr[0].addListener(new lo0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ap0 ap0Var;
        ArrayList l10;
        wo0 wo0Var;
        if (dialog instanceof so0) {
            T0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).G) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).o0)) {
            Z0(dialog.id, view);
            return;
        }
        ek0 ek0Var = this.A1;
        if (ek0Var.getVisibility() != 8 || (activity = this.c2) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.n5.z(dialog.id);
        int i7 = this.L1;
        if (z10) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                TLRPC.Chat O02 = org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.v3.n(O02) && !O02.megagroup) || i7 == 2 || i7 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String N0 = org.telegram.messenger.hd.N0(2131745400, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    if (i7 == 3) {
                        if (org.telegram.messenger.v3.P(10, O0)) {
                            t1Var.U = org.telegram.messenger.hd.N0(2131751072, null);
                        } else {
                            t1Var.U = org.telegram.messenger.hd.N0(2131751073, null);
                        }
                    } else if (i7 != 2) {
                        t1Var.U = org.telegram.messenger.hd.N0(2131752428, null);
                    } else if (this.j2) {
                        t1Var.U = org.telegram.messenger.hd.N0(2131746391, null);
                    } else if (org.telegram.messenger.v3.P(10, O0)) {
                        t1Var.U = org.telegram.messenger.hd.N0(2131751080, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.N0(2131751081, null);
                    }
                    i5.c.y(null, 2131747637, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.n5.C(dialog.id) && i7 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String N02 = org.telegram.messenger.hd.N0(2131745400, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = N02;
            if (i7 == 3) {
                t1Var2.U = org.telegram.messenger.hd.N0(2131743847, null);
            } else if (i7 != 0) {
                t1Var2.U = org.telegram.messenger.hd.N0(2131746982, null);
            } else {
                t1Var2.U = org.telegram.messenger.hd.N0(2131748911, null);
            }
            i5.c.y(null, 2131747637, alertDialog$Builder2, null);
            return;
        }
        long j3 = dialog.id;
        a0.h hVar = this.Q1;
        if (hVar.h(j3) >= 0) {
            hVar.l(dialog.id);
            this.R1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).w(false, true);
            } else if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).b(false, true);
            }
            c1(1);
            ap0Var = this;
        } else {
            TLRPC.User c22 = org.telegram.messenger.np.u1(this.a).c2(Long.valueOf(dialog.id));
            TLRPC.Chat O03 = org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.p10.v(c22) && !(((l10 = org.telegram.messenger.np.u1(this.a).t7.l(-c22.id)) == null || l10.isEmpty()) && org.telegram.messenger.np.u1(this.a).t7.e(-c22.id))) || (org.telegram.messenger.n5.z(dialog.id) && (org.telegram.messenger.v3.c0(O03) || (org.telegram.messenger.v3.p0(O03) && org.telegram.messenger.v3.A(this.a, O03, 24))))) {
                this.y2 = dialog;
                this.E1.h1(0, this.l2 - ek0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                jo0 jo0Var = new jo0(this, dialog, atomicReference, view);
                atomicReference.set(new q20(this, atomicReference, jo0Var, dialog, 7));
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(this.a);
                int i10 = org.telegram.messenger.ls.t5;
                f10.b(jo0Var, i10);
                if (org.telegram.messenger.np.u1(this.a).t7.l(-dialog.id) != null) {
                    jo0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.np.u1(this.a).t7.o(-dialog.id);
                    org.telegram.messenger.g0.h3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            ap0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).b(true, true);
            }
            c1(2);
            long j10 = org.telegram.messenger.k10.i(ap0Var.a).n;
            if (ap0Var.H2) {
                to0 to0Var = ap0Var.G1;
                a0.h hVar2 = to0Var.e;
                ArrayList arrayList = to0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    to0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                to0Var.f();
                ap0Var.w2 = false;
                e10 e10Var = ap0Var.u2;
                e10Var.r.setText("");
                L0(false);
                org.telegram.messenger.g0.v1(e10Var.r);
            }
        }
        xo0 xo0Var = ap0Var.I1;
        if (xo0Var == null || (wo0Var = xo0Var.I) == null) {
            return;
        }
        wo0Var.k(0, wo0Var.b());
    }

    public final void W0(final boolean z10) {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.Q1;
            int m10 = hVar.m();
            fo0 fo0Var = this.n1;
            go0 go0Var = this.o1;
            if (i11 >= m10) {
                Editable text = go0Var.getText();
                tt ttVar = go0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = org.telegram.messenger.si.d0(this.a).Y(charSequenceArr, true, true);
                op opVar = this.a2;
                int i12 = (opVar == null || !opVar.a.q) ? -1 : this.X1;
                ArrayList arrayList = new ArrayList();
                if (this.J1 != null) {
                    i7 = 0;
                    while (i10 < hVar.m()) {
                        long j3 = hVar.j(i10);
                        long P1 = org.telegram.messenger.np.u1(this.a).P1(j3);
                        if (P1 <= 0) {
                            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.a).P2(j3));
                        }
                        if (fo0Var.getTag() != null && ttVar.length() > 0 && P1 > 0) {
                            i7++;
                        }
                        if (P1 > 0) {
                            i7++;
                        }
                        if (P1 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                            arrayList.add(Long.valueOf(j3));
                        }
                        i10++;
                    }
                } else {
                    oo0 oo0Var = this.S1;
                    int i13 = oo0Var != null ? oo0Var.e : 0;
                    if (this.B2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j10 = hVar.j(i14);
                            long P12 = org.telegram.messenger.np.u1(this.a).P1(j10);
                            if (P12 <= 0) {
                                P12 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.a).P2(j10));
                            }
                            int i16 = i10;
                            if (this.B2 != null && fo0Var.getTag() != null && ttVar.length() > 0 && charSequenceArr[i16] != null && P12 > 0) {
                                i15++;
                            }
                            if (P12 > 0) {
                                i15++;
                            }
                            if (P12 > 0 && !arrayList.contains(Long.valueOf(j10))) {
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
                                long P13 = org.telegram.messenger.np.u1(this.a).P1(j11);
                                if (P13 <= 0) {
                                    P13 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.a).P2(j11));
                                }
                                if (fo0Var.getTag() != null && ttVar.length() > 0 && P13 > 0) {
                                    i17++;
                                }
                                if (P13 > 0) {
                                    i17++;
                                }
                                if (P13 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                    arrayList.add(Long.valueOf(j11));
                                }
                            }
                        }
                        i7 = i17;
                    }
                }
                final int i19 = i12;
                c5.Z(this.a, arrayList, i7, new org.telegram.messenger.y10() { // from class: org.telegram.ui.Components.ao0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.h6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        int i20;
                        boolean z11;
                        int i21;
                        HashMap hashMap;
                        long j12;
                        boolean z12;
                        char c10;
                        org.telegram.messenger.gj gjVar;
                        go0 go0Var2;
                        long longValue;
                        boolean z13;
                        boolean z14;
                        long j13;
                        String[] strArr;
                        org.telegram.messenger.gj gjVar2;
                        org.telegram.messenger.yy b10;
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
                        ap0 ap0Var = ap0.this;
                        String[] strArr2 = ap0Var.K1;
                        go0 go0Var3 = ap0Var.o1;
                        fo0 fo0Var2 = ap0Var.n1;
                        HashMap hashMap3 = ap0Var.R1;
                        Long l11 = 0L;
                        a0.h hVar2 = ap0Var.Q1;
                        ArrayList arrayList4 = ap0Var.J1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
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
                                boolean E2 = org.telegram.messenger.np.u1(ap0Var.a).E2(j15);
                                fo0 fo0Var3 = fo0Var2;
                                Long l12 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j15));
                                boolean z19 = (l12 == null || l12.longValue() <= 0) ? z17 : true;
                                Long l13 = l12;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j15));
                                if (tL_forumTopic2 == null || !E2) {
                                    i22 = i23;
                                    z15 = E2;
                                    j14 = 0;
                                } else {
                                    i22 = i23;
                                    z15 = E2;
                                    j14 = org.telegram.messenger.n5.o(tL_forumTopic2.from_id);
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
                                    gjVar3 = new org.telegram.messenger.gj(ap0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (gjVar3 != null) {
                                    gjVar3.p = true;
                                }
                                if (fo0Var3.getTag() == null || go0Var3.a.length() <= 0) {
                                    gjVar4 = gjVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    gjVar4 = gjVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.yy b11 = org.telegram.messenger.yy.b(charSequence == null ? null : charSequence.toString(), j15, gjVar4, gjVar3, null, true, arrayList7, null, null, z18, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z18 = z18;
                                    b11.Q = l13 == null ? 0L : l13.longValue();
                                    b11.R = j14;
                                    org.telegram.messenger.az.C(ap0Var.a).r0(b11);
                                }
                                boolean z20 = z18;
                                int q02 = org.telegram.messenger.az.C(ap0Var.a).q0(ap0Var.J1, j15, !ap0Var.E2, false, z20, 0, 0, gjVar4, i19, l13 == null ? 0L : l13.longValue(), j14, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j15));
                                }
                                if (hVar2.m() == 1) {
                                    c5.q0(q02, ap0Var.b2, r11);
                                    if (q02 != 0) {
                                        z17 = z19;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z16 = z20;
                                fo0Var2 = fo0Var3;
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
                                ap0Var.S0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z17);
                            }
                        } else {
                            boolean z21 = z16;
                            oo0 oo0Var2 = ap0Var.S1;
                            int i25 = oo0Var2 != null ? oo0Var2.e : 0;
                            if (ap0Var.B2 != null) {
                                int i26 = 0;
                                boolean z22 = false;
                                while (i26 < hVar2.m()) {
                                    long j16 = hVar2.j(i26);
                                    boolean E22 = org.telegram.messenger.np.u1(ap0Var.a).E2(j16);
                                    Long l14 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j16));
                                    if (l14 != null && l14.longValue() > 0) {
                                        z22 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                    if (tL_forumTopic3 == null || !E22) {
                                        z13 = z22;
                                        z14 = E22;
                                        j13 = 0;
                                    } else {
                                        z13 = z22;
                                        z14 = E22;
                                        j13 = org.telegram.messenger.n5.o(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || z14) {
                                        strArr = strArr2;
                                        gjVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        gjVar2 = new org.telegram.messenger.gj(ap0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (ap0Var.B2 != null) {
                                        if (fo0Var2.getTag() != null && go0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.gj gjVar5 = gjVar2;
                                            gjVar2 = gjVar5;
                                            org.telegram.messenger.az.C(ap0Var.a).r0(org.telegram.messenger.yy.b(charSequenceArr3[0].toString(), j16, null, gjVar5, null, true, null, null, null, z21, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.yy.b(null, j16, gjVar2, gjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                        b10.I = ap0Var.B2;
                                    } else if (fo0Var2.getTag() == null || go0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.yy.b(strArr[i25], j16, gjVar2, gjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z23 = z21;
                                        b10 = org.telegram.messenger.yy.b(charSequence2 == null ? null : charSequence2.toString(), j16, gjVar2, gjVar2, null, true, arrayList5, null, null, z23, 0, 0, null, false);
                                        z21 = z23;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j13;
                                    org.telegram.messenger.az.C(ap0Var.a).r0(b10);
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
                                    boolean E23 = org.telegram.messenger.np.u1(ap0Var.a).E2(j17);
                                    Long l15 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j17));
                                    if (l15 != null && l15.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic4 == null || !E23) {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j12 = 0;
                                    } else {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j12 = org.telegram.messenger.n5.o(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || E23) {
                                        z12 = z24;
                                        c10 = 0;
                                        gjVar = null;
                                    } else {
                                        z12 = z24;
                                        c10 = 0;
                                        gjVar = new org.telegram.messenger.gj(ap0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (fo0Var2.getTag() == null || go0Var3.a.length() <= 0) {
                                        go0Var2 = go0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z25 = z21;
                                        org.telegram.messenger.yy b12 = org.telegram.messenger.yy.b(charSequence3 == null ? null : charSequence3.toString(), j17, gjVar, gjVar, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                        z21 = z25;
                                        if (l15 == null) {
                                            go0Var2 = go0Var3;
                                            longValue = 0;
                                        } else {
                                            go0Var2 = go0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j12;
                                        org.telegram.messenger.az.C(ap0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.gj gjVar6 = gjVar;
                                    org.telegram.messenger.yy b13 = org.telegram.messenger.yy.b(strArr2[i25], j17, gjVar6, gjVar6, null, true, null, null, null, z21, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j12;
                                    org.telegram.messenger.az.C(ap0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    go0Var3 = go0Var2;
                                    hashMap2 = hashMap;
                                    z24 = z12;
                                }
                                z11 = z24;
                            } else {
                                i20 = 0;
                                z11 = false;
                                ap0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                            }
                            i20 = 0;
                            ap0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                        }
                        qo0 qo0Var = ap0Var.o2;
                        if (qo0Var != null) {
                            qo0Var.Q();
                        }
                        ap0Var.dismiss();
                    }
                });
                return;
            }
            if (c5.h(getContext(), this.a, hVar.j(i11), fo0Var.getTag() != null && go0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void Y0(boolean z10) {
        fo0 fo0Var = this.n1;
        if (z10 == (fo0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fo0Var.setTag(z10 ? 1 : null);
        go0 go0Var = this.o1;
        if (go0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(go0Var.getEditText());
        }
        go0Var.k(true);
        FrameLayout frameLayout = this.Y1;
        fo0 fo0Var2 = this.q1;
        FrameLayout frameLayout2 = this.r1;
        if (z10) {
            fo0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            fo0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(fo0Var, (Property<fo0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, (Property<fo0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, (Property<fo0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(fo0Var2, (Property<fo0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.z1.addListener(new lo0(this, z10, 1));
        this.z1.start();
    }

    public final void Z0(long j3, View view) {
        int i7 = -this.D2;
        this.D2 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.E.a();
        String q10 = j3 >= 0 ? org.telegram.messenger.p10.q(org.telegram.messenger.np.u1(this.a).c2(Long.valueOf(j3))) : "";
        boolean K3 = org.telegram.messenger.np.u1(this.a).K3();
        int i10 = 1;
        FrameLayout frameLayout = this.w1;
        (K3 ? new lc(frameLayout, this.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743515, q10))) : new lc(frameLayout, this.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743515, q10)), org.telegram.messenger.hd.N0(2131743514, null), new xn0(this, i10))).j();
    }

    public final void a1() {
        org.telegram.ui.ActionBar.i1 i1Var;
        fo0 fo0Var = this.n1;
        if (fo0Var == null) {
            return;
        }
        go0 go0Var = this.o1;
        if (go0Var == null || !go0Var.m()) {
            no0 no0Var = this.z2;
            if (no0Var != null && (i1Var = no0Var.I) != null && !i1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            go0Var.getEmojiPaddingShown();
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
        fo0Var.setTranslationY(f11);
        this.q1.setTranslationY(f11);
    }

    public final void b1() {
        org.telegram.ui.ActionBar.m5 m5Var = this.v1;
        if (m5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            m5Var.l(P0, false);
        }
    }

    public final void c1(int i7) {
        a0.h hVar = this.Q1;
        if (hVar.m() == 0) {
            Y0(false);
            return;
        }
        ArrayList arrayList = this.J1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.n1.getTag();
        go0 go0Var = this.o1;
        if (tag != null && go0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).id;
            long P1 = org.telegram.messenger.np.u1(this.a).P1(j10);
            if (P1 <= 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.np.u1(this.a).P2(j10));
            }
            j3 += P1;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i7 != 0;
        oi.w1 w1Var = this.p1;
        w1Var.e(max, z10);
        w1Var.i(size, j3, i7 != 0);
        Y0(true);
        go0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), w1Var.l()), 0);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.s;
        if (i7 == i11) {
            to0 to0Var = this.G1;
            if (to0Var != null) {
                to0Var.E();
            }
            org.telegram.messenger.ls.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        go0 go0Var = this.o1;
        if (go0Var != null) {
            org.telegram.messenger.g0.v1(go0Var.getEditText());
        }
        this.U1 = false;
        super.dismiss();
        org.telegram.messenger.ls.f(this.a).n(this, org.telegram.messenger.ls.s);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.y2 != null) {
            M0();
            return;
        }
        go0 go0Var = this.o1;
        if (go0Var == null || !go0Var.e) {
            super.onBackPressed();
        } else {
            go0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.L2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.c;
            if (m2Var != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0)) > 0.721f;
                if (z10 != this.T2) {
                    this.T2 = z10;
                    org.telegram.messenger.g0.n3(m2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ap0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ap0(Context context, org.telegram.ui.bn bnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        int i7;
        float f10;
        co0 co0Var;
        float f11;
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
        this.C2 = i0.b.e;
        this.D2 = 4;
        this.E2 = true;
        this.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.g0.S(getWindow());
        ui.c d = this.Y0.d(new wn0(this, i14));
        this.L2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.f()) {
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
        this.J0 = h6Var;
        this.V1 = z13;
        this.c2 = org.telegram.messenger.g0.W(context);
        this.d2 = z12;
        if (z12) {
            this.J0 = new fi.h0(i12);
        }
        d.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0));
        this.b2 = bnVar;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.N1 = g10;
        int i17 = org.telegram.ui.ActionBar.m6.h5;
        this.b0 = i17;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i17, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(0);
            String r10 = org.telegram.messenger.n5.r(org.telegram.messenger.np.u1(this.a).g2(org.telegram.messenger.gj.B0(gjVar.k)));
            if (!TextUtils.isEmpty(r10)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.np.u1(this.a).X2, "/", r10, "/");
                sb2.append(gjVar.e1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && gjVar.z2()) {
                    strArr2[0] = a8.p0.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.J1 = arrayList;
        this.I1 = new xo0(this, context);
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
            tL_channels_exportMessageLink.channel = org.telegram.messenger.np.u1(this.a).j1(((org.telegram.messenger.gj) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.u7(i20, this, context));
        }
        no0 no0Var = new no0(this, context);
        this.z2 = no0Var;
        this.b = no0Var;
        no0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i21 = this.u0;
        viewGroup.setPadding(i21, 0, i21, this.C2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v2(this));
        if (this.d2 && this.k2[1] != null) {
            oo0 oo0Var = new oo0(this, context);
            this.S1 = oo0Var;
            frameLayout.addView(oo0Var, c8.ma.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        e10 e10Var = new e10(context, this.J0);
        this.u2 = e10Var;
        ho0 ho0Var = new ho0(this, i11);
        ah.i iVar = e10Var.r;
        iVar.addTextChangedListener(ho0Var);
        iVar.setHint(org.telegram.messenger.hd.N0(2131745244, null));
        iVar.setOnEditorActionListener(new h(this, 8));
        e10Var.setCloseButtonOnClickListener(new xn0(this, i13));
        frameLayout.addView(e10Var, c8.ma.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.v2 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i22 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(kVar, 5, i22, this.J0);
        org.telegram.ui.ActionBar.t6.l(kVar, 6, org.telegram.ui.ActionBar.m6.q5, this.J0);
        org.telegram.ui.ActionBar.t6.l(kVar, 1, org.telegram.ui.ActionBar.m6.z6, null);
        org.telegram.ui.ActionBar.t6.l(kVar, 3, org.telegram.ui.ActionBar.m6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 20));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, c8.ma.e(-1, 58, 83));
        ek0 ek0Var = new ek0(context, this.J0);
        this.A1 = ek0Var;
        v4.t tVar = new v4.t(4);
        this.E1 = tVar;
        ek0Var.setLayoutManager(tVar);
        tVar.O = new do0(this, i12);
        ek0Var.setOnScrollListener(new eo0(this, i12));
        yo0 yo0Var = new yo0(this, context);
        this.H1 = yo0Var;
        ek0Var.setAdapter(yo0Var);
        int i23 = org.telegram.ui.ActionBar.m6.A5;
        org.telegram.ui.ActionBar.t6.l(ek0Var, 21, i23, this.J0);
        ek0Var.setVerticalScrollBarEnabled(false);
        ek0Var.setHorizontalScrollBarEnabled(false);
        ek0Var.setOverScrollMode(2);
        ek0Var.setSelectorDrawableColor(0);
        int i24 = 11;
        ek0Var.setItemSelectorColorProvider(new xb0(i24));
        ek0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ek0Var.setClipToPadding(false);
        ek0Var.i(new fi.k(9));
        ek0Var.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.yn0
            public final /* synthetic */ ap0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.qj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        ap0 ap0Var = this.b;
                        e10 e10Var2 = ap0Var.u2;
                        HashMap hashMap = ap0Var.R1;
                        a0.h hVar = ap0Var.Q1;
                        to0 to0Var = ap0Var.G1;
                        yo0 yo0Var2 = ap0Var.H1;
                        if (yo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = ap0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var.e.f(dialog2.id)) == null) {
                                        to0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = to0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    to0Var.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < ap0Var.Q0().getChildCount(); i26++) {
                                    View childAt = ap0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = yo0Var2.E(i25);
                            if (E != null && (dialog = ap0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.np.u1(ap0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = ap0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var.e.f(dialog3.id)) == null) {
                                        to0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = to0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    to0Var.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < ap0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = ap0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            ap0 ap0Var2 = this.b;
                            ArrayList arrayList4 = ap0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                ap0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            ap0 ap0Var3 = this.b;
                            xo0 xo0Var = ap0Var3.I1;
                            ap0 ap0Var4 = xo0Var.L;
                            int i29 = xo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < xo0Var.d.size()) {
                                        dialog5 = ((po0) xo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - xo0Var.d.size();
                                        ArrayList arrayList5 = xo0Var.e.d;
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
                                    ap0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < ap0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) ap0Var4.A2.get(i31)).a;
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
        ek0Var.setVisibility(8);
        this.b.addView(ek0Var, c8.ma.e(-1, -1, 51));
        co0 co0Var2 = new co0(this, context, this.J0, i13);
        this.B1 = co0Var2;
        co0Var2.setSelectorDrawableColor(0);
        co0Var2.setItemSelectorColorProvider(new xb0(i24));
        co0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        co0Var2.setClipToPadding(false);
        getContext();
        v4.t tVar2 = new v4.t(4);
        this.D1 = tVar2;
        co0Var2.setLayoutManager(tVar2);
        this.P2 = new kh(this, i12);
        tVar2.O = new do0(this, i13);
        co0Var2.setHorizontalScrollBarEnabled(false);
        co0Var2.setVerticalScrollBarEnabled(false);
        co0Var2.setOverScrollMode(2);
        co0Var2.i(new fi.k(10));
        this.b.addView(co0Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        to0 to0Var = new to0(this, context);
        this.G1 = to0Var;
        co0Var2.setAdapter(to0Var);
        org.telegram.ui.ActionBar.t6.l(co0Var2, 21, i23, this.J0);
        co0Var2.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.yn0
            public final /* synthetic */ ap0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.qj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        ap0 ap0Var = this.b;
                        e10 e10Var2 = ap0Var.u2;
                        HashMap hashMap = ap0Var.R1;
                        a0.h hVar = ap0Var.Q1;
                        to0 to0Var2 = ap0Var.G1;
                        yo0 yo0Var2 = ap0Var.H1;
                        if (yo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = ap0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var2.e.f(dialog2.id)) == null) {
                                        to0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = to0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    to0Var2.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < ap0Var.Q0().getChildCount(); i26++) {
                                    View childAt = ap0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = yo0Var2.E(i25);
                            if (E != null && (dialog = ap0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.np.u1(ap0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = ap0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var2.e.f(dialog3.id)) == null) {
                                        to0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = to0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    to0Var2.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < ap0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = ap0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            ap0 ap0Var2 = this.b;
                            ArrayList arrayList4 = ap0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                ap0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            ap0 ap0Var3 = this.b;
                            xo0 xo0Var = ap0Var3.I1;
                            ap0 ap0Var4 = xo0Var.L;
                            int i29 = xo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < xo0Var.d.size()) {
                                        dialog5 = ((po0) xo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - xo0Var.d.size();
                                        ArrayList arrayList5 = xo0Var.e.d;
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
                                    ap0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < ap0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) ap0Var4.A2.get(i31)).a;
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
        co0Var2.setOnScrollListener(new eo0(this, i13));
        this.Y0.b(co0Var2);
        co0 co0Var3 = new co0(this, context, this.J0, i11);
        this.C1 = co0Var3;
        co0Var3.setItemSelectorColorProvider(new xb0(i24));
        co0Var3.setSelectorDrawableColor(0);
        co0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        co0Var3.setClipToPadding(false);
        getContext();
        xy xyVar = new xy(4, 0, co0Var3);
        this.F1 = xyVar;
        co0Var3.setLayoutManager(xyVar);
        xyVar.O = new do0(this, i11);
        co0Var3.setOnItemClickListener(new qj0(this) { // from class: org.telegram.ui.Components.yn0
            public final /* synthetic */ ap0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.qj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        ap0 ap0Var = this.b;
                        e10 e10Var2 = ap0Var.u2;
                        HashMap hashMap = ap0Var.R1;
                        a0.h hVar = ap0Var.Q1;
                        to0 to0Var2 = ap0Var.G1;
                        yo0 yo0Var2 = ap0Var.H1;
                        if (yo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = ap0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var2.e.f(dialog2.id)) == null) {
                                        to0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = to0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    to0Var2.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < ap0Var.Q0().getChildCount(); i26++) {
                                    View childAt = ap0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = yo0Var2.E(i25);
                            if (E != null && (dialog = ap0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.np.u1(ap0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = ap0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                ap0Var.c1(2);
                                if (ap0Var.H2 || ap0Var.I2) {
                                    if (((TLRPC.Dialog) to0Var2.e.f(dialog3.id)) == null) {
                                        to0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = to0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    to0Var2.f();
                                    ap0Var.w2 = false;
                                    e10Var2.r.setText("");
                                    ap0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < ap0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = ap0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == ap0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                ap0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            ap0 ap0Var2 = this.b;
                            ArrayList arrayList4 = ap0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                ap0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            ap0 ap0Var3 = this.b;
                            xo0 xo0Var = ap0Var3.I1;
                            ap0 ap0Var4 = xo0Var.L;
                            int i29 = xo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < xo0Var.d.size()) {
                                        dialog5 = ((po0) xo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - xo0Var.d.size();
                                        ArrayList arrayList5 = xo0Var.e.d;
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
                                    ap0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < ap0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) ap0Var4.A2.get(i31)).a;
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
        co0Var3.setHasFixedSize(true);
        co0Var3.setItemAnimator(null);
        co0Var3.setHorizontalScrollBarEnabled(false);
        co0Var3.setVerticalScrollBarEnabled(false);
        co0Var3.setOnScrollListener(new eo0(this, i11));
        co0Var3.i(new fi.k(i24));
        co0Var3.setAdapter(this.I1);
        org.telegram.ui.ActionBar.t6.l(co0Var3, 21, i23, this.J0);
        this.t2 = new hj0(co0Var3, true);
        yz yzVar = new yz(context, this.J0);
        yzVar.setViewType(12);
        nv0 nv0Var = new nv0(context, yzVar, 1, this.J0);
        this.M1 = nv0Var;
        nv0Var.addView(yzVar, 0);
        nv0Var.setAnimateLayoutChange(true);
        nv0Var.e(false, false);
        boolean z14 = this.d2;
        xh.l lVar = nv0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.t6.U(lVar, org.telegram.ui.ActionBar.m6.eh, this.J0);
        }
        lVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        co0Var3.setEmptyView(nv0Var);
        co0Var3.setHideIfEmpty(false);
        co0Var3.X1 = true;
        co0Var3.Y1 = 0;
        this.b.addView(nv0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(co0Var3, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.m3 m3Var = new bi.m3(23, context, this);
        this.t1 = m3Var;
        this.b.addView(m3Var, c8.ma.e(-1, org.telegram.messenger.ls.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.d2 || this.k2[1] == null) ? 58.0f : 111.0f);
        this.O1[0] = new View(context);
        View view = this.O1[0];
        int i25 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i25, view, this.J0);
        this.O1[0].setAlpha(0.0f);
        this.O1[0].setTag(1);
        this.b.addView(this.O1[0], layoutParams);
        this.b.addView(frameLayout, c8.ma.e(-1, (!this.d2 || this.k2[1] == null) ? 58 : org.telegram.messenger.ls.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.O1[1] = new View(context);
        org.telegram.ui.ActionBar.t6.h(i25, this.O1[1], this.J0);
        this.O1[1].setLayoutParams(layoutParams2);
        if (!this.j2 && this.k2[0] == null) {
            this.O1[1].setAlpha(0.0f);
            co0Var = co0Var3;
            f10 = 4.0f;
            f11 = 9.0f;
        } else {
            f10 = 4.0f;
            if (this.d2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.r1 = frameLayout2;
                f11 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.u1 = frameLayout3;
                frameLayout2.addView(frameLayout3, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                c8.ra.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new vn0(this, 4));
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                this.v1 = m5Var;
                m5Var.setTextSize(15);
                org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.Kl, this.J0);
                m5Var.setEllipsizeByGradient(true);
                b1();
                linearLayout3.addView(m5Var, c8.ma.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.J0);
                textView.setText(org.telegram.messenger.hd.N0(2131751755, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i26 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i26, this.J0), 4, 4);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i26);
                org.telegram.ui.ActionBar.h6 h6Var2 = this.J0;
                textView.setBackground(a02);
                co0Var = co0Var3;
                org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, h6Var2);
                linearLayout3.addView(textView, c8.ma.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new vn0(this, 5));
                c8.ra.a(textView);
                this.b.addView(frameLayout2, c8.ma.e(-1, 58, 83));
                ArrayList arrayList2 = this.J1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.gj) this.J1.get(0)).k != null && ((org.telegram.messenger.gj) this.J1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) this.J1.get(0);
                    if (org.telegram.messenger.v3.N(org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-org.telegram.messenger.gj.B0(gjVar3.k)))) && !org.telegram.messenger.gj.l3(gjVar3.k)) {
                        final int i27 = 0;
                        linearLayout = org.telegram.messenger.f3.g(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bo0
                            public final /* synthetic */ ap0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i27) {
                                    case 0:
                                        ap0 ap0Var = this.b;
                                        org.telegram.ui.ActionBar.g2 g2Var = ap0Var.b2;
                                        if (g2Var == null) {
                                            g2Var = LaunchActivity.T();
                                        }
                                        if (g2Var != null) {
                                            ap0Var.dismiss();
                                            g2Var.presentFragment(new org.telegram.ui.og0(gjVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        ap0 ap0Var2 = this.b;
                                        org.telegram.ui.ActionBar.g2 g2Var2 = ap0Var2.b2;
                                        if (g2Var2 == null) {
                                            g2Var2 = LaunchActivity.T();
                                        }
                                        if (g2Var2 != null) {
                                            ap0Var2.dismiss();
                                            g2Var2.presentFragment(new org.telegram.ui.og0(gjVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i26, this.J0), 6, 6);
                        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i26);
                        org.telegram.ui.ActionBar.h6 h6Var3 = this.J0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.t6.j(linearLayout, a03, null, M2, h6Var3);
                        c8.ra.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i28 = org.telegram.ui.ActionBar.m6.Ml;
                        org.telegram.ui.ActionBar.t6.s(imageView, i28, this.J0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, c8.ma.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.t6.U(textView2, i28, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.hd.E(gjVar3.k.forwards, ','));
                        linearLayout.addView(textView2, c8.ma.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i10 = 8;
                        linearLayout2.addView(linearLayout3, c8.ma.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, c8.ma.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i10 = 11;
                linearLayout2.addView(linearLayout3, c8.ma.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                if (linearLayout != null) {
                }
            } else {
                co0Var = co0Var3;
                f11 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.r1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.u1 = frameLayout5;
                frameLayout4.addView(frameLayout5, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i29 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i29, this.J0), 20, 20);
                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i29);
                org.telegram.ui.ActionBar.h6 h6Var4 = this.J0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.t6.j(textView3, a04, null, M3, h6Var4);
                org.telegram.ui.ActionBar.t6.U(textView3, this.d2 ? org.telegram.ui.ActionBar.m6.gh : org.telegram.ui.ActionBar.m6.n5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.d2 && this.k2[1] != null) {
                    textView3.setText(org.telegram.messenger.hd.N0(2131743142, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.hd.M0(2131751750).toUpperCase());
                }
                textView3.setOnClickListener(new vn0(this, 6));
                frameLayout5.addView(textView3, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
                this.b.addView(frameLayout4, c8.ma.e(-1, 58, 87));
                ArrayList arrayList3 = this.J1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.gj) this.J1.get(0)).k != null && ((org.telegram.messenger.gj) this.J1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.gj gjVar4 = (org.telegram.messenger.gj) this.J1.get(0);
                    if (org.telegram.messenger.v3.N(org.telegram.messenger.np.u1(this.a).O0(Long.valueOf(-gjVar4.A0()))) && !gjVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.y1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.t6.Q(linearLayout4, org.telegram.ui.ActionBar.m6.a0(W(this.d2 ? org.telegram.ui.ActionBar.m6.Vg : i29), 20, 20), null, org.telegram.ui.ActionBar.t6.M(this.d2 ? org.telegram.ui.ActionBar.m6.Vg : i29), this.J0);
                        frameLayout5.addView(linearLayout4, c8.ma.e(-2, -1, 21));
                        final int i30 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bo0
                            public final /* synthetic */ ap0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        ap0 ap0Var = this.b;
                                        org.telegram.ui.ActionBar.g2 g2Var = ap0Var.b2;
                                        if (g2Var == null) {
                                            g2Var = LaunchActivity.T();
                                        }
                                        if (g2Var != null) {
                                            ap0Var.dismiss();
                                            g2Var.presentFragment(new org.telegram.ui.og0(gjVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        ap0 ap0Var2 = this.b;
                                        org.telegram.ui.ActionBar.g2 g2Var2 = ap0Var2.b2;
                                        if (g2Var2 == null) {
                                            g2Var2 = LaunchActivity.T();
                                        }
                                        if (g2Var2 != null) {
                                            ap0Var2.dismiss();
                                            g2Var2.presentFragment(new org.telegram.ui.og0(gjVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.t6.s(imageView2, this.d2 ? org.telegram.ui.ActionBar.m6.gh : org.telegram.ui.ActionBar.m6.n5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, c8.ma.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(gjVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.t6.U(textView4, this.d2 ? org.telegram.ui.ActionBar.m6.gh : org.telegram.ui.ActionBar.m6.n5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout4.addView(textView4, c8.ma.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.w1 = frameLayout6;
        this.b.addView(frameLayout6, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.u1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.x1 = frameLayout7;
        this.b.addView(frameLayout7, c8.ma.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        fo0 fo0Var = new fo0(this, context, 0);
        this.n1 = fo0Var;
        fo0Var.setWillNotDraw(false);
        fo0Var.setAlpha(0.0f);
        fo0Var.setVisibility(4);
        this.b.addView(fo0Var, c8.ma.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        fo0Var.setOnTouchListener(new gi.a(23));
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        boolean z15 = org.telegram.messenger.g0.B(W(org.telegram.ui.ActionBar.m6.h5)) > 0.721f;
        this.T2 = z15;
        org.telegram.messenger.g0.n3(m2Var, z15);
        go0 go0Var = new go0(this, context, no0Var, this.J0);
        this.o1 = go0Var;
        go0Var.K = true;
        if (this.d2) {
            ot editText = go0Var.getEditText();
            int i31 = org.telegram.ui.ActionBar.m6.eh;
            editText.setTextColor(W(i31));
            go0Var.getEditText().setCursorColor(W(i31));
        }
        go0Var.setHint(org.telegram.messenger.hd.M0(2131745266));
        go0Var.s();
        go0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        fo0Var.addView(go0Var, c8.ma.e(-1, -2, 51));
        fo0Var.setClipChildren(false);
        fo0Var.setClipToPadding(false);
        go0Var.setClipChildren(false);
        go0Var.getEditText().addTextChangedListener(new ho0(this, 0));
        fo0 fo0Var2 = new fo0(this, context, 1);
        this.q1 = fo0Var2;
        fo0Var2.setFocusable(true);
        fo0Var2.setFocusableInTouchMode(true);
        fo0Var2.setVisibility(4);
        fo0Var2.setScaleX(0.2f);
        fo0Var2.setScaleY(0.2f);
        fo0Var2.setAlpha(0.0f);
        this.b.addView(fo0Var2, c8.ma.e(org.telegram.messenger.ls.v1, 50, 85));
        oi.w1 w1Var = new oi.w1(this, context, this.J0);
        this.p1 = w1Var;
        int L3 = org.telegram.messenger.g0.L(52.0f);
        int L4 = org.telegram.messenger.g0.L(38.0f);
        w1Var.L = L3;
        w1Var.M = L4;
        float L5 = org.telegram.messenger.g0.L(1.0f);
        float L6 = org.telegram.messenger.g0.L(6.0f);
        w1Var.P = L5;
        w1Var.Q = L6;
        w1Var.s0 = true;
        fo0Var2.addView(w1Var, c8.ma.g());
        w1Var.setOnClickListener(new vn0(this, 0));
        w1Var.setOnLongClickListener(new q00(this, 2));
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
            int i32 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.Q(linearLayout5, org.telegram.ui.ActionBar.m6.a0(W(i32), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i32), this.J0);
            op opVar = new op(24, context, this.J0);
            this.a2 = opVar;
            opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
            opVar.setDrawUnchecked(true);
            opVar.a(false, false);
            opVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(opVar, c8.ma.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView5, i22, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.hd.Z(2131743336, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, c8.ma.t(-2, -2, 16, 9, 0, 0, 0));
            c8.ra.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new vn0(this, 1));
            frameLayout8.addView(linearLayout5, c8.ma.e(-2, -2, 17));
            if (this.r1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view2, this.J0);
                frameLayout8.addView(view2, c8.ma.a(-1.0f, this.d2 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, c8.ma.e(-1, 58, 83));
            if (this.r1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        dh.d dVar = new dh.d(this.O2.b(m3Var, null));
        this.R2 = dVar;
        if (org.telegram.messenger.cz.f()) {
            org.telegram.messenger.qc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        fh.g b10 = this.N2.b(this.z2, c8.i0.f(this.J0));
        this.Q2 = b10;
        b10.T = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.R.g = 0.4f;
        b10.n();
        fh.g b11 = this.M2.b(fo0Var, c8.i0.f(this.J0));
        this.S2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        fo0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
        FrameLayout frameLayout9 = this.u1;
        if (frameLayout9 != null) {
            fh.g b12 = this.M2.b(frameLayout9, c8.i0.f(this.J0));
            b12.q(org.telegram.messenger.g0.L(f11));
            b12.r(org.telegram.messenger.g0.L(22.0f));
            this.u1.setBackground(b12);
            this.u1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        FrameLayout frameLayout10 = this.Y1;
        if (frameLayout10 != null) {
            fh.g b13 = this.M2.b(frameLayout10, c8.i0.f(this.J0));
            b13.q(org.telegram.messenger.g0.L(f11));
            b13.r(org.telegram.messenger.g0.L(22.0f));
            this.Y1.setBackground(b13);
            this.Y1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        c1(0);
        org.telegram.ui.cx.z4(org.telegram.messenger.c.a(this.a));
        if (to0Var.d.isEmpty()) {
            org.telegram.messenger.ls.f(this.a).c(this, org.telegram.messenger.ls.s);
        }
        int i33 = this.a;
        int i34 = 0;
        org.telegram.messenger.ur.a0(i33).a.c(new jg.q(i33, i34, new io0(this), i34));
        org.telegram.messenger.si.d0(this.a).P0(true);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new wn0(this, i34);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.U3(1.0f, co0Var2, true, false);
        org.telegram.messenger.g0.U3(1.0f, co0Var, false, false);
        r0.i0.l(this.c, new wn0(this, 1));
    }

    public void T0(View view) {
    }

    public void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
