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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class oo0 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final /* synthetic */ int R2 = 0;
    public final u4.s A1;
    public int A2;
    public final u4.s B1;
    public boolean B2;
    public final iy C1;
    public org.telegram.ui.ActionBar.f1 C2;
    public final ho0 D1;
    public int D2;
    public final mo0 E1;
    public boolean E2;
    public final lo0 F1;
    public boolean F2;
    public final ArrayList G1;
    public int G2;
    public final String[] H1;
    public final eh.g H2;
    public final int I1;
    public final si.c I2;
    public final zu0 J1;
    public final eh.c J2;
    public final Drawable K1;
    public final eh.c K2;
    public final View[] L1;
    public final eh.c L2;
    public final AnimatorSet[] M1;
    public final rg M2;
    public final a0.h N1;
    public final gh.g N2;
    public final HashMap O1;
    public final eh.d O2;
    public final co0 P1;
    public final gh.g P2;
    public int Q1;
    public boolean Q2;
    public boolean R1;
    public final boolean S1;
    public boolean T1;
    public final int U1;
    public final FrameLayout V1;
    public final LinearLayout W1;
    public final wo X1;
    public final org.telegram.ui.wm Y1;
    public final Activity Z1;
    public final boolean a2;
    public boolean b2;
    public final TextPaint c2;
    public TLRPC.TL_exportedMessageLink d2;
    public boolean e2;
    public boolean f2;
    public final boolean g2;
    public final String[] h2;
    public int i2;
    public final FrameLayout j1;
    public int j2;
    public final tn0 k1;
    public boolean k2;
    public final un0 l1;
    public eo0 l2;
    public final mi.x1 m1;
    public float m2;
    public final tn0 n1;
    public float n2;
    public final FrameLayout o1;
    public float o2;
    public float p1;
    public ValueAnimator p2;
    public final ai.x2 q1;
    public final wi0 q2;
    public final FrameLayout r1;
    public final n00 r2;
    public final org.telegram.ui.ActionBar.k5 s1;
    public final org.telegram.ui.ActionBar.k s2;
    public final FrameLayout t1;
    public boolean t2;
    public final FrameLayout u1;
    public q1.g u2;
    public final LinearLayout v1;
    public TLRPC.Dialog v2;
    public AnimatorSet w1;
    public final bo0 w2;
    public final tj0 x1;
    public ArrayList x2;
    public final qn0 y1;
    public TL_stories.StoryItem y2;
    public final qn0 z1;
    public i0.b z2;

    public oo0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, e6Var);
    }

    public static void I0(oo0 oo0Var) {
        qn0 qn0Var = oo0Var.y1;
        qn0 qn0Var2 = oo0Var.z1;
        tj0 tj0Var = oo0Var.x1;
        if (oo0Var.k2) {
            return;
        }
        qn0 qn0Var3 = oo0Var.E2 ? qn0Var2 : qn0Var;
        if (qn0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = qn0Var3.getChildAt(0);
        for (int i3 = 0; i3 < qn0Var3.getChildCount(); i3++) {
            if (qn0Var3.getChildAt(i3).getTop() < childAt.getTop()) {
                childAt = qn0Var3.getChildAt(i3);
            }
        }
        bj0 bj0Var = (bj0) qn0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || bj0Var == null || bj0Var.b() != 0) ? 0 : top;
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            oo0Var.D2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            oo0Var.T0(true);
            top = i10;
        } else {
            oo0Var.D2 = childAt.getTop();
            oo0Var.T0(false);
        }
        if (tj0Var.getVisibility() == 0) {
            if (tj0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = tj0Var.getChildAt(0);
            for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
                if (tj0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = tj0Var.getChildAt(i11);
                }
            }
            bj0 bj0Var2 = (bj0) tj0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || bj0Var2 == null || bj0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || bj0Var2 == null || bj0Var2.b() != 0) {
                oo0Var.D2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                oo0Var.T0(true);
                top2 = i12;
            } else {
                oo0Var.D2 = childAt2.getTop();
                oo0Var.T0(false);
            }
            top = org.telegram.messenger.g0.W1(tj0Var.getAlpha(), top, top2);
        }
        int i13 = oo0Var.i2;
        if (i13 != top) {
            oo0Var.j2 = i13;
            float f10 = top;
            int i14 = (int) (oo0Var.m2 + f10);
            oo0Var.i2 = i14;
            qn0Var.setTopGlowOffset(i14);
            int i15 = (int) (oo0Var.m2 + f10);
            oo0Var.i2 = i15;
            qn0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + oo0Var.m2);
            oo0Var.i2 = i16;
            tj0Var.setTopGlowOffset(i16);
            oo0Var.j1.setTranslationY(oo0Var.i2 + oo0Var.m2);
            oo0Var.J1.setTranslationY(oo0Var.i2 + oo0Var.m2);
            oo0Var.b.invalidate();
        }
    }

    public static int J0(oo0 oo0Var) {
        qn0 qn0Var = oo0Var.y1;
        if (qn0Var.getChildCount() == 0) {
            return -1000;
        }
        int i3 = 0;
        View childAt = qn0Var.getChildAt(0);
        bj0 bj0Var = (bj0) qn0Var.G(childAt);
        if (bj0Var == null) {
            return -1000;
        }
        int paddingTop = qn0Var.getPaddingTop();
        if (bj0Var.c() == 0 && childAt.getTop() >= 0) {
            i3 = childAt.getTop();
        }
        return paddingTop - i3;
    }

    public static oo0 N0(Context context, org.telegram.messenger.zi ziVar, String str, boolean z10, String str2) {
        return new oo0(context, ziVar != null ? org.telegram.messenger.k5.k(ziVar) : null, str, null, z10, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != itemsCount - 1) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.a0(w02, i12, i11), null, org.telegram.ui.ActionBar.r6.N(i3), e6Var);
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public void K() {
        super.K();
        un0 un0Var = this.l1;
        if (un0Var != null) {
            un0Var.o();
        }
    }

    public final void K0(boolean z10) {
        n00 n00Var = this.r2;
        bh.g gVar = n00Var.r;
        bh.g gVar2 = n00Var.r;
        boolean isEmpty = TextUtils.isEmpty(gVar.getText());
        qn0 qn0Var = this.y1;
        qn0 qn0Var2 = this.z1;
        boolean z11 = true;
        if (!isEmpty || ((this.d && gVar2.hasFocus()) || this.F2)) {
            this.t2 = true;
            if (this.v2 == null) {
                org.telegram.messenger.g0.Z3(qn0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.X3(qn0Var2, true);
            }
        } else {
            if (this.v2 == null) {
                org.telegram.messenger.g0.Z3(qn0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.X3(qn0Var2, false);
            }
            z11 = false;
        }
        if (this.E2 != z11 || z10) {
            this.E2 = z11;
            lo0 lo0Var = this.F1;
            lo0Var.f();
            this.D1.f();
            if (this.E2) {
                if (this.D2 == Integer.MAX_VALUE) {
                    ((u4.b0) qn0Var2.getLayoutManager()).h1(0, -qn0Var2.getPaddingTop());
                } else {
                    ((u4.b0) qn0Var2.getLayoutManager()).h1(0, this.D2 - qn0Var2.getPaddingTop());
                }
                lo0Var.E(gVar2.getText().toString());
                return;
            }
            int i3 = this.D2;
            u4.s sVar = this.A1;
            if (i3 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.v2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.v2 = null;
        for (int i3 = 0; i3 < P0().getChildCount(); i3++) {
            View childAt = P0().getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        q1.g gVar = this.u2;
        if (gVar != null) {
            gVar.d();
        }
        P0().setVisibility(0);
        n00 n00Var = this.r2;
        n00Var.setVisibility(0);
        bh.g gVar2 = n00Var.r;
        if (this.E2 || this.F2) {
            this.w2.I.v = true;
            gVar2.requestFocus();
            org.telegram.messenger.g0.K3(gVar2);
        }
        int[] iArr = new int[2];
        q1.g gVar3 = new q1.g(new q1.f(1000.0f));
        q1.h hVar = new q1.h(0.0f);
        org.telegram.ui.wm wmVar = this.Y1;
        hVar.b((wmVar == null || !wmVar.b) ? 800.0f : 10.0f);
        hVar.a(1.0f);
        gVar3.m = hVar;
        this.u2 = gVar3;
        gVar3.b(new in0(this, (org.telegram.ui.Cells.c7) view, iArr, 0));
        this.u2.a(new sa(this, 5));
        this.u2.h();
    }

    public final void M0() {
        boolean z10 = false;
        if (this.d2 == null && this.h2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            eo0 eo0Var = this.l2;
            if (eo0Var != null) {
                eo0Var.C0();
                return;
            }
            if (this.Z1 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.d2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z10 = true;
                }
                ((LaunchActivity) this.Z1).H0(new k2.x(5, z10));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.h2;
        co0 co0Var = this.P1;
        if (co0Var != null) {
            str = strArr[co0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.d2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        wo woVar = this.X1;
        if (woVar != null && woVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.U1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final tj0 P0() {
        return (this.E2 || this.F2) ? this.z1 : this.y1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        tj0 tj0Var = this.x1;
        tj0Var.setPivotX(width);
        tj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        tj0Var.setScaleX(f12);
        tj0Var.setScaleY(f12);
        tj0Var.setAlpha(f10);
        tj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        n00 n00Var = this.r2;
        n00Var.setPivotX(n00Var.getWidth() / 2.0f);
        n00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        n00Var.setScaleX(f15);
        n00Var.setScaleY(f15);
        n00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.s2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        tj0Var.getLocationInWindow(iArr);
        float interpolation = xq.g.getInterpolation(f10);
        for (int i3 = 0; i3 < P0.getChildCount(); i3++) {
            View childAt = P0.getChildAt(i3);
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
        for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
            View childAt2 = tj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((tj0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        P0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final int R() {
        return this.b.getMeasuredHeight() - this.Q1;
    }

    public final void T0(boolean z10) {
        View[] viewArr = this.L1;
        if ((!z10 || viewArr[0].getTag() == null) && (z10 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z10 ? null : 1);
        if (z10) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.M1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new zn0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        oo0 oo0Var;
        ArrayList l10;
        ko0 ko0Var;
        if (dialog instanceof go0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.c7) && ((org.telegram.ui.Cells.c7) view).G) || ((view instanceof org.telegram.ui.Cells.f6) && ((org.telegram.ui.Cells.f6) view).o0)) {
            Y0(dialog.id, view);
            return;
        }
        tj0 tj0Var = this.x1;
        if (tj0Var.getVisibility() != 8 || (activity = this.Z1) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.m5.z(dialog.id);
        int i3 = this.I1;
        if (z10) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.t3.n(M02) && !M02.megagroup) || i3 == 2 || i3 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M03 = org.telegram.messenger.bd.M0(2131745606, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M03;
                    if (i3 == 3) {
                        if (org.telegram.messenger.t3.P(10, M0)) {
                            s1Var.U = org.telegram.messenger.bd.M0(2131751085, null);
                        } else {
                            s1Var.U = org.telegram.messenger.bd.M0(2131751086, null);
                        }
                    } else if (i3 != 2) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752440, null);
                    } else if (this.g2) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131746595, null);
                    } else if (org.telegram.messenger.t3.P(10, M0)) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131751093, null);
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131751094, null);
                    }
                    k2.p1.v(null, 2131747839, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.m5.C(dialog.id) && i3 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M04 = org.telegram.messenger.bd.M0(2131745606, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.S = M04;
            if (i3 == 3) {
                s1Var2.U = org.telegram.messenger.bd.M0(2131744100, null);
            } else if (i3 != 0) {
                s1Var2.U = org.telegram.messenger.bd.M0(2131747184, null);
            } else {
                s1Var2.U = org.telegram.messenger.bd.M0(2131749112, null);
            }
            k2.p1.v(null, 2131747839, alertDialog$Builder2, null);
            return;
        }
        long j10 = dialog.id;
        a0.h hVar = this.N1;
        if (hVar.h(j10) >= 0) {
            hVar.l(dialog.id);
            this.O1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(false, true);
            }
            b1(1);
            oo0Var = this;
        } else {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(dialog.id));
            TLRPC.Chat M05 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.l10.u(a22) && !(((l10 = org.telegram.messenger.hp.s1(this.a).q7.l(-a22.id)) == null || l10.isEmpty()) && org.telegram.messenger.hp.s1(this.a).q7.e(-a22.id))) || (org.telegram.messenger.m5.z(dialog.id) && (org.telegram.messenger.t3.c0(M05) || (org.telegram.messenger.t3.p0(M05) && org.telegram.messenger.t3.A(this.a, M05, 24))))) {
                this.v2 = dialog;
                this.B1.h1(0, this.i2 - tj0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                xn0 xn0Var = new xn0(this, dialog, atomicReference, view);
                atomicReference.set(new v60(this, atomicReference, xn0Var, dialog, 6));
                org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.a);
                int i10 = org.telegram.messenger.hs.q5;
                f10.b(xn0Var, i10);
                if (org.telegram.messenger.hp.s1(this.a).q7.l(-dialog.id) != null) {
                    xn0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.hp.s1(this.a).q7.o(-dialog.id);
                    org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            oo0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).b(true, true);
            }
            b1(2);
            long j11 = org.telegram.messenger.h10.i(oo0Var.a).n;
            if (oo0Var.E2) {
                ho0 ho0Var = oo0Var.D1;
                a0.h hVar2 = ho0Var.e;
                ArrayList arrayList = ho0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    ho0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j11) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ho0Var.f();
                oo0Var.t2 = false;
                n00 n00Var = oo0Var.r2;
                n00Var.r.setText("");
                K0(false);
                org.telegram.messenger.g0.v1(n00Var.r);
            }
        }
        lo0 lo0Var = oo0Var.F1;
        if (lo0Var == null || (ko0Var = lo0Var.I) == null) {
            return;
        }
        ko0Var.k(0, ko0Var.b());
    }

    public final void V0(final boolean z10) {
        int i3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.N1;
            int m10 = hVar.m();
            tn0 tn0Var = this.k1;
            un0 un0Var = this.l1;
            if (i11 >= m10) {
                Editable text = un0Var.getText();
                dt dtVar = un0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.li.b0(this.a).W(charSequenceArr, true, true);
                wo woVar = this.X1;
                int i12 = (woVar == null || !woVar.a.q) ? -1 : this.U1;
                ArrayList arrayList = new ArrayList();
                if (this.G1 != null) {
                    i3 = 0;
                    while (i10 < hVar.m()) {
                        long j10 = hVar.j(i10);
                        long N1 = org.telegram.messenger.hp.s1(this.a).N1(j10);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.a).J2(j10));
                        }
                        if (tn0Var.getTag() != null && dtVar.length() > 0 && N1 > 0) {
                            i3++;
                        }
                        if (N1 > 0) {
                            i3++;
                        }
                        if (N1 > 0 && !arrayList.contains(Long.valueOf(j10))) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        i10++;
                    }
                } else {
                    co0 co0Var = this.P1;
                    int i13 = co0Var != null ? co0Var.e : 0;
                    if (this.y2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j11 = hVar.j(i14);
                            long N12 = org.telegram.messenger.hp.s1(this.a).N1(j11);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.a).J2(j11));
                            }
                            int i16 = i10;
                            if (this.y2 != null && tn0Var.getTag() != null && dtVar.length() > 0 && charSequenceArr[i16] != null && N12 > 0) {
                                i15++;
                            }
                            if (N12 > 0) {
                                i15++;
                            }
                            if (N12 > 0 && !arrayList.contains(Long.valueOf(j11))) {
                                arrayList.add(Long.valueOf(j11));
                            }
                            i14++;
                            i10 = i16;
                        }
                        i3 = i15;
                    } else {
                        int i17 = 0;
                        if (this.H1[i13] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j12 = hVar.j(i18);
                                long N13 = org.telegram.messenger.hp.s1(this.a).N1(j12);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.a).J2(j12));
                                }
                                if (tn0Var.getTag() != null && dtVar.length() > 0 && N13 > 0) {
                                    i17++;
                                }
                                if (N13 > 0) {
                                    i17++;
                                }
                                if (N13 > 0 && !arrayList.contains(Long.valueOf(j12))) {
                                    arrayList.add(Long.valueOf(j12));
                                }
                            }
                        }
                        i3 = i17;
                    }
                }
                final int i19 = i12;
                t4.b0(this.a, arrayList, i3, new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.on0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.e6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        int i20;
                        boolean z11;
                        int i21;
                        HashMap hashMap;
                        long j13;
                        boolean z12;
                        char c2;
                        org.telegram.messenger.zi ziVar;
                        un0 un0Var2;
                        long longValue;
                        boolean z13;
                        boolean z14;
                        long j14;
                        String[] strArr;
                        org.telegram.messenger.zi ziVar2;
                        org.telegram.messenger.wy b10;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i22;
                        boolean z15;
                        long j15;
                        Long l10;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.zi ziVar3;
                        org.telegram.messenger.zi ziVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        oo0 oo0Var = oo0.this;
                        String[] strArr2 = oo0Var.H1;
                        un0 un0Var3 = oo0Var.l1;
                        tn0 tn0Var2 = oo0Var.k1;
                        HashMap hashMap3 = oo0Var.O1;
                        Long l11 = 0L;
                        a0.h hVar2 = oo0Var.N1;
                        ArrayList arrayList4 = oo0Var.G1;
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
                                long j16 = hVar2.j(i23);
                                boolean y22 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j16);
                                tn0 tn0Var3 = tn0Var2;
                                Long l12 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j16));
                                boolean z19 = (l12 == null || l12.longValue() <= 0) ? z17 : true;
                                Long l13 = l12;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j16));
                                if (tL_forumTopic2 == null || !y22) {
                                    i22 = i23;
                                    z15 = y22;
                                    j15 = 0;
                                } else {
                                    i22 = i23;
                                    z15 = y22;
                                    j15 = org.telegram.messenger.m5.o(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z15) {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    ziVar3 = null;
                                } else {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    ziVar3 = new org.telegram.messenger.zi(oo0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (ziVar3 != null) {
                                    ziVar3.p = true;
                                }
                                if (tn0Var3.getTag() == null || un0Var3.a.length() <= 0) {
                                    ziVar4 = ziVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    ziVar4 = ziVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.wy b11 = org.telegram.messenger.wy.b(charSequence == null ? null : charSequence.toString(), j16, ziVar4, ziVar3, null, true, arrayList7, null, null, z18, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z18 = z18;
                                    b11.Q = l13 == null ? 0L : l13.longValue();
                                    b11.R = j15;
                                    org.telegram.messenger.yy.C(oo0Var.a).r0(b11);
                                }
                                boolean z20 = z18;
                                int q02 = org.telegram.messenger.yy.C(oo0Var.a).q0(oo0Var.G1, j16, !oo0Var.B2, false, z20, 0, 0, ziVar4, i19, l13 == null ? 0L : l13.longValue(), j15, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j16));
                                }
                                if (hVar2.m() == 1) {
                                    t4.s0(q02, oo0Var.Y1, r11);
                                    if (q02 != 0) {
                                        z17 = z19;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z16 = z20;
                                tn0Var2 = tn0Var3;
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
                                oo0Var.R0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z17);
                            }
                        } else {
                            boolean z21 = z16;
                            co0 co0Var2 = oo0Var.P1;
                            int i25 = co0Var2 != null ? co0Var2.e : 0;
                            if (oo0Var.y2 != null) {
                                int i26 = 0;
                                boolean z22 = false;
                                while (i26 < hVar2.m()) {
                                    long j17 = hVar2.j(i26);
                                    boolean y23 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j17);
                                    Long l14 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j17));
                                    if (l14 != null && l14.longValue() > 0) {
                                        z22 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j17));
                                    if (tL_forumTopic3 == null || !y23) {
                                        z13 = z22;
                                        z14 = y23;
                                        j14 = 0;
                                    } else {
                                        z13 = z22;
                                        z14 = y23;
                                        j14 = org.telegram.messenger.m5.o(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || z14) {
                                        strArr = strArr2;
                                        ziVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        ziVar2 = new org.telegram.messenger.zi(oo0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (oo0Var.y2 != null) {
                                        if (tn0Var2.getTag() != null && un0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.zi ziVar5 = ziVar2;
                                            ziVar2 = ziVar5;
                                            org.telegram.messenger.yy.C(oo0Var.a).r0(org.telegram.messenger.wy.b(charSequenceArr3[0].toString(), j17, null, ziVar5, null, true, null, null, null, z21, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.wy.b(null, j17, ziVar2, ziVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                        b10.I = oo0Var.y2;
                                    } else if (tn0Var2.getTag() == null || un0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.wy.b(strArr[i25], j17, ziVar2, ziVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z23 = z21;
                                        b10 = org.telegram.messenger.wy.b(charSequence2 == null ? null : charSequence2.toString(), j17, ziVar2, ziVar2, null, true, arrayList5, null, null, z23, 0, 0, null, false);
                                        z21 = z23;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j14;
                                    org.telegram.messenger.yy.C(oo0Var.a).r0(b10);
                                    i26++;
                                    z22 = z13;
                                    strArr2 = strArr;
                                }
                                z11 = z22;
                            } else if (strArr2[i25] != null) {
                                int i27 = 0;
                                boolean z24 = false;
                                while (i27 < hVar2.m()) {
                                    long j18 = hVar2.j(i27);
                                    boolean y24 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j18);
                                    Long l15 = hashMap2 == null ? l11 : (Long) hashMap2.get(Long.valueOf(j18));
                                    if (l15 != null && l15.longValue() > 0) {
                                        z24 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(hVar2.f(j18));
                                    if (tL_forumTopic4 == null || !y24) {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j13 = 0;
                                    } else {
                                        i21 = i27;
                                        hashMap = hashMap2;
                                        j13 = org.telegram.messenger.m5.o(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || y24) {
                                        z12 = z24;
                                        c2 = 0;
                                        ziVar = null;
                                    } else {
                                        z12 = z24;
                                        c2 = 0;
                                        ziVar = new org.telegram.messenger.zi(oo0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (tn0Var2.getTag() == null || un0Var3.a.length() <= 0) {
                                        un0Var2 = un0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c2];
                                        boolean z25 = z21;
                                        org.telegram.messenger.wy b12 = org.telegram.messenger.wy.b(charSequence3 == null ? null : charSequence3.toString(), j18, ziVar, ziVar, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                        z21 = z25;
                                        if (l15 == null) {
                                            un0Var2 = un0Var3;
                                            longValue = 0;
                                        } else {
                                            un0Var2 = un0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j13;
                                        org.telegram.messenger.yy.C(oo0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.zi ziVar6 = ziVar;
                                    org.telegram.messenger.wy b13 = org.telegram.messenger.wy.b(strArr2[i25], j18, ziVar6, ziVar6, null, true, null, null, null, z21, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j13;
                                    org.telegram.messenger.yy.C(oo0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    un0Var3 = un0Var2;
                                    hashMap2 = hashMap;
                                    z24 = z12;
                                }
                                z11 = z24;
                            } else {
                                i20 = 0;
                                z11 = false;
                                oo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                            }
                            i20 = 0;
                            oo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                        }
                        eo0 eo0Var = oo0Var.l2;
                        if (eo0Var != null) {
                            eo0Var.W();
                        }
                        oo0Var.dismiss();
                    }
                });
                return;
            }
            if (t4.h(getContext(), this.a, hVar.j(i11), tn0Var.getTag() != null && un0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void X0(boolean z10) {
        tn0 tn0Var = this.k1;
        if (z10 == (tn0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.w1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tn0Var.setTag(z10 ? 1 : null);
        un0 un0Var = this.l1;
        if (un0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(un0Var.getEditText());
        }
        un0Var.k(true);
        FrameLayout frameLayout = this.V1;
        tn0 tn0Var2 = this.n1;
        FrameLayout frameLayout2 = this.o1;
        if (z10) {
            tn0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            tn0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i3 = z10 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i3);
        }
        LinearLayout linearLayout = this.v1;
        if (linearLayout != null) {
            int i10 = z10 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.w1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(tn0Var, (Property<tn0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, (Property<tn0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, (Property<tn0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(tn0Var2, (Property<tn0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.L1[1], (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.r1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.a2 && z10) {
                f10 = org.telegram.messenger.g0.L(this.W1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.w1.playTogether(arrayList);
        this.w1.setInterpolator(new DecelerateInterpolator());
        this.w1.setDuration(180L);
        this.w1.addListener(new zn0(this, z10, 1));
        this.w1.start();
    }

    public final void Y0(long j10, View view) {
        int i3 = -this.A2;
        this.A2 = i3;
        org.telegram.messenger.g0.G3(i3, view, null);
        org.telegram.messenger.p2.E.a();
        String p10 = j10 >= 0 ? org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(j10))) : "";
        boolean D3 = org.telegram.messenger.hp.s1(this.a).D3();
        int i10 = 1;
        FrameLayout frameLayout = this.t1;
        (D3 ? new fc(frameLayout, this.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10))) : new fc(frameLayout, this.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, p10)), org.telegram.messenger.bd.M0(2131743769, null), new ln0(this, i10))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.h1 h1Var;
        tn0 tn0Var = this.k1;
        if (tn0Var == null) {
            return;
        }
        un0 un0Var = this.l1;
        if (un0Var == null || !un0Var.m()) {
            bo0 bo0Var = this.w2;
            if (bo0Var != null && (h1Var = bo0Var.I) != null && !h1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            un0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.V1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.o1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        tn0Var.setTranslationY(f11);
        this.n1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.k5 k5Var = this.s1;
        if (k5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            k5Var.l(O0, false);
        }
    }

    public final void b1(int i3) {
        a0.h hVar = this.N1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.G1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.k1.getTag();
        un0 un0Var = this.l1;
        if (tag != null && un0Var.a.length() > 0) {
            size++;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j11 = ((TLRPC.Dialog) hVar.n(i10)).id;
            long N1 = org.telegram.messenger.hp.s1(this.a).N1(j11);
            if (N1 <= 0) {
                N1 = org.telegram.messenger.m5.k(org.telegram.messenger.hp.s1(this.a).J2(j11));
            }
            j10 += N1;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i3 != 0;
        mi.x1 x1Var = this.m1;
        x1Var.e(max, z10);
        x1Var.i(size, j10, i3 != 0);
        X0(true);
        un0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), x1Var.l()), 0);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.s;
        if (i3 == i11) {
            ho0 ho0Var = this.D1;
            if (ho0Var != null) {
                ho0Var.E();
            }
            org.telegram.messenger.hs.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        un0 un0Var = this.l1;
        if (un0Var != null) {
            org.telegram.messenger.g0.v1(un0Var.getEditText());
        }
        this.R1 = false;
        super.dismiss();
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.s);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        if (this.v2 != null) {
            L0();
            return;
        }
        un0 un0Var = this.l1;
        if (un0Var == null || !un0Var.e) {
            super.onBackPressed();
        } else {
            un0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            si.c cVar = this.I2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.c;
            if (j2Var != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0)) > 0.721f;
                if (z10 != this.Q2) {
                    this.Q2 = z10;
                    org.telegram.messenger.g0.o3(j2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public oo0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oo0(Context context, org.telegram.ui.wm wmVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        int i3;
        float f10;
        float f11;
        qn0 qn0Var;
        LinearLayout linearLayout;
        int i10;
        final int i11 = 1;
        final int i12 = 2;
        String[] strArr = new String[2];
        this.H1 = strArr;
        this.L1 = new View[2];
        this.M1 = new AnimatorSet[2];
        this.N1 = new a0.h();
        this.O1 = new HashMap();
        this.Q1 = -1;
        final int i13 = 0;
        this.R1 = false;
        new RectF();
        new Paint(1);
        this.c2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.h2 = strArr2;
        this.x2 = new ArrayList();
        int i14 = 4;
        int i15 = 4;
        while (true) {
            if (i15 >= 32) {
                i3 = 80;
                break;
            }
            i3 = (1 << i15) - 12;
            if (80 <= i3) {
                break;
            } else {
                i15++;
            }
        }
        int i16 = i3 / 8;
        long[] jArr = new long[i16];
        Object[] objArr = new Object[i16];
        this.z2 = i0.b.e;
        this.A2 = 4;
        this.B2 = true;
        this.D2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.g0.S(getWindow());
        si.c d = this.Y0.d(new kn0(this, i14));
        this.I2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f()) {
            eh.g gVar = new eh.g(false);
            this.H2 = gVar;
            this.Y0.a(gVar);
            si.f fVar = new si.f(d);
            fVar.f = d;
            fVar.d = gVar;
            fVar.e = -2;
            si.f fVar2 = new si.f(d);
            fVar2.f = d;
            fVar2.d = gVar;
            fVar2.e = -3;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.J2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.lc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.Y0;
            eh.c cVar2 = new eh.c(fVar2, fVar2, fVar2);
            this.K2 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            pi.q qVar = this.Y0;
            cVar2.j = qVar;
            eh.c cVar3 = new eh.c(d, d, d);
            this.L2 = cVar3;
            cVar3.j = qVar;
        } else {
            this.H2 = null;
            eh.c cVar4 = new eh.c(d, d, d);
            cVar4.j = this.Y0;
            this.K2 = cVar4;
            this.J2 = cVar4;
            this.L2 = cVar4;
        }
        this.J0 = e6Var;
        this.S1 = z13;
        this.Z1 = org.telegram.messenger.g0.W(context);
        this.a2 = z12;
        if (z12) {
            this.J0 = new ei.k0(i12);
        }
        d.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0));
        this.Y1 = wmVar;
        Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        this.K1 = g7;
        int i17 = org.telegram.ui.ActionBar.k6.h5;
        this.b0 = i17;
        g7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i17, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(0);
            String r5 = org.telegram.messenger.m5.r(org.telegram.messenger.hp.s1(this.a).e2(org.telegram.messenger.zi.B0(ziVar.k)));
            if (!TextUtils.isEmpty(r5)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.recaptcha.internal.a.s(sb2, org.telegram.messenger.hp.s1(this.a).V2, "/", r5, "/");
                sb2.append(ziVar.f1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && ziVar.A2()) {
                    strArr2[0] = a1.g.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.G1 = arrayList;
        this.F1 = new lo0(this, context);
        this.g2 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new org.telegram.ui.i0(this, i11);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.G1.get(i18);
                if (ziVar2.E4()) {
                    this.I1 = 3;
                } else if (ziVar2.U3()) {
                    int i19 = ziVar2.a4() ? 2 : 1;
                    this.I1 = i19;
                    if (i19 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        int i20 = 22;
        if (z10) {
            this.e2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.zi) arrayList.get(0)).f1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.hp.s1(this.a).h1(((org.telegram.messenger.zi) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.ActionBar.h6(i20, this, context));
        }
        bo0 bo0Var = new bo0(this, context);
        this.w2 = bo0Var;
        this.b = bo0Var;
        bo0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i21 = this.u0;
        viewGroup.setPadding(i21, 0, i21, this.z2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.s2(this));
        if (this.a2 && this.h2[1] != null) {
            co0 co0Var = new co0(this, context);
            this.P1 = co0Var;
            frameLayout.addView(co0Var, b8.mf.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        n00 n00Var = new n00(context, this.J0);
        this.r2 = n00Var;
        vn0 vn0Var = new vn0(this, i11);
        bh.g gVar2 = n00Var.r;
        gVar2.addTextChangedListener(vn0Var);
        gVar2.setHint(org.telegram.messenger.bd.M0(2131745450, null));
        int i22 = 7;
        gVar2.setOnEditorActionListener(new s0(this, i22));
        n00Var.setCloseButtonOnClickListener(new ln0(this, i13));
        frameLayout.addView(n00Var, b8.mf.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.s2 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i23 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i23, this.J0);
        org.telegram.ui.ActionBar.r6.m(kVar, 6, org.telegram.ui.ActionBar.k6.q5, this.J0);
        org.telegram.ui.ActionBar.r6.m(kVar, 1, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.ui.ActionBar.r6.m(kVar, 3, org.telegram.ui.ActionBar.k6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 18));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, b8.mf.e(-1, 58, 83));
        tj0 tj0Var = new tj0(context, this.J0);
        this.x1 = tj0Var;
        u4.s sVar = new u4.s(4);
        this.B1 = sVar;
        tj0Var.setLayoutManager(sVar);
        sVar.O = new rn0(this, i12);
        tj0Var.setOnScrollListener(new sn0(this, i12));
        mo0 mo0Var = new mo0(this, context);
        this.E1 = mo0Var;
        tj0Var.setAdapter(mo0Var);
        int i24 = org.telegram.ui.ActionBar.k6.A5;
        org.telegram.ui.ActionBar.r6.m(tj0Var, 21, i24, this.J0);
        tj0Var.setVerticalScrollBarEnabled(false);
        tj0Var.setHorizontalScrollBarEnabled(false);
        tj0Var.setOverScrollMode(2);
        tj0Var.setSelectorDrawableColor(0);
        tj0Var.setItemSelectorColorProvider(new lf0(i22));
        tj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        tj0Var.setClipToPadding(false);
        tj0Var.i(new ei.l(9));
        tj0Var.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.mn0
            public final /* synthetic */ oo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.fj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        oo0 oo0Var = this.b;
                        n00 n00Var2 = oo0Var.r2;
                        HashMap hashMap = oo0Var.O1;
                        a0.h hVar = oo0Var.N1;
                        ho0 ho0Var = oo0Var.D1;
                        mo0 mo0Var2 = oo0Var.E1;
                        if (mo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = oo0Var.v2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var.e.f(dialog2.id)) == null) {
                                        ho0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ho0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ho0Var.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < oo0Var.P0().getChildCount(); i26++) {
                                    View childAt = oo0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mo0Var2.E(i25);
                            if (E != null && (dialog = oo0Var.v2) != null) {
                                long j10 = dialog.id;
                                boolean y22 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j10);
                                TLRPC.Dialog dialog3 = oo0Var.v2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var.e.f(dialog3.id)) == null) {
                                        ho0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ho0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ho0Var.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < oo0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = oo0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            oo0 oo0Var2 = this.b;
                            ArrayList arrayList4 = oo0Var2.D1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                oo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            oo0 oo0Var3 = this.b;
                            lo0 lo0Var = oo0Var3.F1;
                            oo0 oo0Var4 = lo0Var.L;
                            int i29 = lo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < lo0Var.d.size()) {
                                        dialog5 = ((do0) lo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - lo0Var.d.size();
                                        ArrayList arrayList5 = lo0Var.e.d;
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
                                    oo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < oo0Var4.x2.size()) {
                                    TLObject tLObject2 = ((kg.d0) oo0Var4.x2.get(i31)).a;
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
        tj0Var.setVisibility(8);
        this.b.addView(tj0Var, b8.mf.e(-1, -1, 51));
        qn0 qn0Var2 = new qn0(this, context, this.J0, i13);
        this.y1 = qn0Var2;
        qn0Var2.setSelectorDrawableColor(0);
        qn0Var2.setItemSelectorColorProvider(new lf0(i22));
        qn0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        qn0Var2.setClipToPadding(false);
        getContext();
        u4.s sVar2 = new u4.s(4);
        this.A1 = sVar2;
        qn0Var2.setLayoutManager(sVar2);
        this.M2 = new rg(this, i12);
        sVar2.O = new rn0(this, i13);
        qn0Var2.setHorizontalScrollBarEnabled(false);
        qn0Var2.setVerticalScrollBarEnabled(false);
        qn0Var2.setOverScrollMode(2);
        qn0Var2.i(new ei.l(10));
        this.b.addView(qn0Var2, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ho0 ho0Var = new ho0(this, context);
        this.D1 = ho0Var;
        qn0Var2.setAdapter(ho0Var);
        org.telegram.ui.ActionBar.r6.m(qn0Var2, 21, i24, this.J0);
        qn0Var2.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.mn0
            public final /* synthetic */ oo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.fj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        oo0 oo0Var = this.b;
                        n00 n00Var2 = oo0Var.r2;
                        HashMap hashMap = oo0Var.O1;
                        a0.h hVar = oo0Var.N1;
                        ho0 ho0Var2 = oo0Var.D1;
                        mo0 mo0Var2 = oo0Var.E1;
                        if (mo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = oo0Var.v2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var2.e.f(dialog2.id)) == null) {
                                        ho0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ho0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ho0Var2.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < oo0Var.P0().getChildCount(); i26++) {
                                    View childAt = oo0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mo0Var2.E(i25);
                            if (E != null && (dialog = oo0Var.v2) != null) {
                                long j10 = dialog.id;
                                boolean y22 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j10);
                                TLRPC.Dialog dialog3 = oo0Var.v2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var2.e.f(dialog3.id)) == null) {
                                        ho0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ho0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ho0Var2.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < oo0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = oo0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            oo0 oo0Var2 = this.b;
                            ArrayList arrayList4 = oo0Var2.D1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                oo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            oo0 oo0Var3 = this.b;
                            lo0 lo0Var = oo0Var3.F1;
                            oo0 oo0Var4 = lo0Var.L;
                            int i29 = lo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < lo0Var.d.size()) {
                                        dialog5 = ((do0) lo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - lo0Var.d.size();
                                        ArrayList arrayList5 = lo0Var.e.d;
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
                                    oo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < oo0Var4.x2.size()) {
                                    TLObject tLObject2 = ((kg.d0) oo0Var4.x2.get(i31)).a;
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
        qn0Var2.setOnScrollListener(new sn0(this, i13));
        this.Y0.b(qn0Var2);
        qn0 qn0Var3 = new qn0(this, context, this.J0, i11);
        this.z1 = qn0Var3;
        qn0Var3.setItemSelectorColorProvider(new lf0(i22));
        qn0Var3.setSelectorDrawableColor(0);
        qn0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        qn0Var3.setClipToPadding(false);
        getContext();
        iy iyVar = new iy(4, 0, qn0Var3);
        this.C1 = iyVar;
        qn0Var3.setLayoutManager(iyVar);
        iyVar.O = new rn0(this, i11);
        qn0Var3.setOnItemClickListener(new fj0(this) { // from class: org.telegram.ui.Components.mn0
            public final /* synthetic */ oo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.fj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        oo0 oo0Var = this.b;
                        n00 n00Var2 = oo0Var.r2;
                        HashMap hashMap = oo0Var.O1;
                        a0.h hVar = oo0Var.N1;
                        ho0 ho0Var2 = oo0Var.D1;
                        mo0 mo0Var2 = oo0Var.E1;
                        if (mo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = oo0Var.v2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var2.e.f(dialog2.id)) == null) {
                                        ho0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ho0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ho0Var2.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < oo0Var.P0().getChildCount(); i26++) {
                                    View childAt = oo0Var.P0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) childAt;
                                        if (c7Var.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var.d(null, false, true);
                                            c7Var.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = mo0Var2.E(i25);
                            if (E != null && (dialog = oo0Var.v2) != null) {
                                long j10 = dialog.id;
                                boolean y22 = org.telegram.messenger.hp.s1(oo0Var.a).y2(j10);
                                TLRPC.Dialog dialog3 = oo0Var.v2;
                                hVar.k(dialog3, j10);
                                hashMap.put(dialog3, E);
                                oo0Var.b1(2);
                                if (oo0Var.E2 || oo0Var.F2) {
                                    if (((TLRPC.Dialog) ho0Var2.e.f(dialog3.id)) == null) {
                                        ho0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ho0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ho0Var2.f();
                                    oo0Var.t2 = false;
                                    n00Var2.r.setText("");
                                    oo0Var.K0(false);
                                }
                                for (int i27 = 0; i27 < oo0Var.P0().getChildCount(); i27++) {
                                    View childAt2 = oo0Var.P0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.c7) {
                                        org.telegram.ui.Cells.c7 c7Var2 = (org.telegram.ui.Cells.c7) childAt2;
                                        if (c7Var2.getCurrentDialog() == oo0Var.v2.id) {
                                            c7Var2.d(E, y22, true);
                                            c7Var2.b(true, true);
                                        }
                                    }
                                }
                                oo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            oo0 oo0Var2 = this.b;
                            ArrayList arrayList4 = oo0Var2.D1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                oo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            oo0 oo0Var3 = this.b;
                            lo0 lo0Var = oo0Var3.F1;
                            oo0 oo0Var4 = lo0Var.L;
                            int i29 = lo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < lo0Var.d.size()) {
                                        dialog5 = ((do0) lo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - lo0Var.d.size();
                                        ArrayList arrayList5 = lo0Var.e.d;
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
                                    oo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < oo0Var4.x2.size()) {
                                    TLObject tLObject2 = ((kg.d0) oo0Var4.x2.get(i31)).a;
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
        qn0Var3.setHasFixedSize(true);
        qn0Var3.setItemAnimator(null);
        qn0Var3.setHorizontalScrollBarEnabled(false);
        qn0Var3.setVerticalScrollBarEnabled(false);
        qn0Var3.setOnScrollListener(new sn0(this, i11));
        qn0Var3.i(new ei.l(11));
        qn0Var3.setAdapter(this.F1);
        org.telegram.ui.ActionBar.r6.m(qn0Var3, 21, i24, this.J0);
        this.q2 = new wi0(qn0Var3, true);
        iz izVar = new iz(context, this.J0);
        izVar.setViewType(12);
        zu0 zu0Var = new zu0(context, izVar, 1, this.J0);
        this.J1 = zu0Var;
        zu0Var.addView(izVar, 0);
        zu0Var.setAnimateLayoutChange(true);
        zu0Var.e(false, false);
        boolean z14 = this.a2;
        yh.l lVar = zu0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.bh, this.J0);
        }
        lVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
        qn0Var3.setEmptyView(zu0Var);
        qn0Var3.setHideIfEmpty(false);
        qn0Var3.X1 = true;
        qn0Var3.Y1 = 0;
        this.b.addView(zu0Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(qn0Var3, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ai.x2 x2Var = new ai.x2(23, context, this);
        this.q1 = x2Var;
        this.b.addView(x2Var, b8.mf.e(-1, org.telegram.messenger.hs.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.a2 || this.h2[1] == null) ? 58.0f : 111.0f);
        this.L1[0] = new View(context);
        View view = this.L1[0];
        int i25 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i25, view, this.J0);
        this.L1[0].setAlpha(0.0f);
        this.L1[0].setTag(1);
        this.b.addView(this.L1[0], layoutParams);
        this.b.addView(frameLayout, b8.mf.e(-1, (!this.a2 || this.h2[1] == null) ? 58 : org.telegram.messenger.hs.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.L1[1] = new View(context);
        org.telegram.ui.ActionBar.r6.i(i25, this.L1[1], this.J0);
        this.L1[1].setLayoutParams(layoutParams2);
        if (!this.g2 && this.h2[0] == null) {
            this.L1[1].setAlpha(0.0f);
            qn0Var = qn0Var3;
            f10 = 4.0f;
            f11 = 9.0f;
        } else {
            f10 = 4.0f;
            f11 = 9.0f;
            if (this.a2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.o1 = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.r1 = frameLayout3;
                frameLayout2.addView(frameLayout3, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                b8.pf.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new jn0(this, 4));
                org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                this.s1 = k5Var;
                k5Var.setTextSize(15);
                org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.Hl, this.J0);
                k5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(k5Var, b8.mf.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, this.J0);
                textView.setText(org.telegram.messenger.bd.M0(2131751767, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i26 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i26, this.J0), 4, 4);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i26);
                org.telegram.ui.ActionBar.e6 e6Var2 = this.J0;
                textView.setBackground(a02);
                qn0Var = qn0Var3;
                org.telegram.ui.ActionBar.r6.k(textView, a02, null, N, e6Var2);
                linearLayout3.addView(textView, b8.mf.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new jn0(this, 5));
                b8.pf.a(textView);
                this.b.addView(frameLayout2, b8.mf.e(-1, 58, 83));
                ArrayList arrayList2 = this.G1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.zi) this.G1.get(0)).k != null && ((org.telegram.messenger.zi) this.G1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) this.G1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-org.telegram.messenger.zi.B0(ziVar3.k)))) && !org.telegram.messenger.zi.m3(ziVar3.k)) {
                        final int i27 = 0;
                        linearLayout = org.telegram.messenger.k5.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i27) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        org.telegram.ui.ActionBar.d2 d2Var = oo0Var.Y1;
                                        if (d2Var == null) {
                                            d2Var = LaunchActivity.T();
                                        }
                                        if (d2Var != null) {
                                            oo0Var.dismiss();
                                            d2Var.presentFragment(new org.telegram.ui.dg0(ziVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.d2 d2Var2 = oo0Var2.Y1;
                                        if (d2Var2 == null) {
                                            d2Var2 = LaunchActivity.T();
                                        }
                                        if (d2Var2 != null) {
                                            oo0Var2.dismiss();
                                            d2Var2.presentFragment(new org.telegram.ui.dg0(ziVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i26, this.J0), 6, 6);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i26);
                        org.telegram.ui.ActionBar.e6 e6Var3 = this.J0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.r6.k(linearLayout, a03, null, N2, e6Var3);
                        b8.pf.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i28 = org.telegram.ui.ActionBar.k6.Jl;
                        org.telegram.ui.ActionBar.r6.t(imageView, i28, this.J0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, b8.mf.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.r6.V(textView2, i28, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.bd.E(ziVar3.k.forwards, ','));
                        linearLayout.addView(textView2, b8.mf.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i10 = 8;
                        linearLayout2.addView(linearLayout3, b8.mf.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, b8.mf.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                linearLayout = null;
                i10 = 11;
                linearLayout2.addView(linearLayout3, b8.mf.q(-1, 42, 1.0f, 23, 11, 0, i10, 0));
                if (linearLayout != null) {
                }
            } else {
                qn0Var = qn0Var3;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.o1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.r1 = frameLayout5;
                frameLayout4.addView(frameLayout5, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i29 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i29, this.J0), 20, 20);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i29);
                org.telegram.ui.ActionBar.e6 e6Var4 = this.J0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.r6.k(textView3, a04, null, N3, e6Var4);
                org.telegram.ui.ActionBar.r6.V(textView3, this.a2 ? org.telegram.ui.ActionBar.k6.dh : org.telegram.ui.ActionBar.k6.n5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.a2 && this.h2[1] != null) {
                    textView3.setText(org.telegram.messenger.bd.M0(2131743397, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.bd.L0(2131751762).toUpperCase());
                }
                textView3.setOnClickListener(new jn0(this, 6));
                frameLayout5.addView(textView3, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
                this.b.addView(frameLayout4, b8.mf.e(-1, 58, 87));
                ArrayList arrayList3 = this.G1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.zi) this.G1.get(0)).k != null && ((org.telegram.messenger.zi) this.G1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) this.G1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-ziVar4.A0()))) && !ziVar4.k3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.v1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.r6.R(linearLayout4, org.telegram.ui.ActionBar.k6.a0(V(this.a2 ? org.telegram.ui.ActionBar.k6.Sg : i29), 20, 20), null, org.telegram.ui.ActionBar.r6.N(this.a2 ? org.telegram.ui.ActionBar.k6.Sg : i29), this.J0);
                        frameLayout5.addView(linearLayout4, b8.mf.e(-2, -1, 21));
                        final int i30 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pn0
                            public final /* synthetic */ oo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        oo0 oo0Var = this.b;
                                        org.telegram.ui.ActionBar.d2 d2Var = oo0Var.Y1;
                                        if (d2Var == null) {
                                            d2Var = LaunchActivity.T();
                                        }
                                        if (d2Var != null) {
                                            oo0Var.dismiss();
                                            d2Var.presentFragment(new org.telegram.ui.dg0(ziVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        oo0 oo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.d2 d2Var2 = oo0Var2.Y1;
                                        if (d2Var2 == null) {
                                            d2Var2 = LaunchActivity.T();
                                        }
                                        if (d2Var2 != null) {
                                            oo0Var2.dismiss();
                                            d2Var2.presentFragment(new org.telegram.ui.dg0(ziVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.r6.t(imageView2, this.a2 ? org.telegram.ui.ActionBar.k6.dh : org.telegram.ui.ActionBar.k6.n5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, b8.mf.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(ziVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textView4, this.a2 ? org.telegram.ui.ActionBar.k6.dh : org.telegram.ui.ActionBar.k6.n5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout4.addView(textView4, b8.mf.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.t1 = frameLayout6;
        this.b.addView(frameLayout6, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.r1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.u1 = frameLayout7;
        this.b.addView(frameLayout7, b8.mf.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        tn0 tn0Var = new tn0(this, context, 0);
        this.k1 = tn0Var;
        tn0Var.setWillNotDraw(false);
        tn0Var.setAlpha(0.0f);
        tn0Var.setVisibility(4);
        this.b.addView(tn0Var, b8.mf.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        tn0Var.setOnTouchListener(new fi.a(22));
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        boolean z15 = org.telegram.messenger.g0.B(V(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
        this.Q2 = z15;
        org.telegram.messenger.g0.o3(j2Var, z15);
        un0 un0Var = new un0(this, context, bo0Var, this.J0);
        this.l1 = un0Var;
        un0Var.K = true;
        if (this.a2) {
            xs editText = un0Var.getEditText();
            int i31 = org.telegram.ui.ActionBar.k6.bh;
            editText.setTextColor(V(i31));
            un0Var.getEditText().setCursorColor(V(i31));
        }
        un0Var.setHint(org.telegram.messenger.bd.L0(2131745472));
        un0Var.s();
        un0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        tn0Var.addView(un0Var, b8.mf.e(-1, -2, 51));
        tn0Var.setClipChildren(false);
        tn0Var.setClipToPadding(false);
        un0Var.setClipChildren(false);
        un0Var.getEditText().addTextChangedListener(new vn0(this, 0));
        tn0 tn0Var2 = new tn0(this, context, 1);
        this.n1 = tn0Var2;
        tn0Var2.setFocusable(true);
        tn0Var2.setFocusableInTouchMode(true);
        tn0Var2.setVisibility(4);
        tn0Var2.setScaleX(0.2f);
        tn0Var2.setScaleY(0.2f);
        tn0Var2.setAlpha(0.0f);
        this.b.addView(tn0Var2, b8.mf.e(org.telegram.messenger.hs.v1, 50, 85));
        mi.x1 x1Var = new mi.x1(this, context, this.J0);
        this.m1 = x1Var;
        int L3 = org.telegram.messenger.g0.L(52.0f);
        int L4 = org.telegram.messenger.g0.L(38.0f);
        x1Var.J = L3;
        x1Var.K = L4;
        float L5 = org.telegram.messenger.g0.L(1.0f);
        float L6 = org.telegram.messenger.g0.L(6.0f);
        x1Var.N = L5;
        x1Var.O = L6;
        x1Var.i0 = true;
        tn0Var2.addView(x1Var, b8.mf.g());
        x1Var.setOnClickListener(new jn0(this, 0));
        x1Var.setOnLongClickListener(new zz(this, 2));
        this.c2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.c2.setTypeface(org.telegram.messenger.g0.o());
        if (num != null) {
            this.U1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.V1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.W1 = linearLayout5;
            linearLayout5.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i32 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(linearLayout5, org.telegram.ui.ActionBar.k6.a0(V(i32), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i32), this.J0);
            wo woVar = new wo(24, context, this.J0);
            this.X1 = woVar;
            woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(woVar, b8.mf.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView5, i23, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.bd.Z(2131743591, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, b8.mf.t(-2, -2, 16, 9, 0, 0, 0));
            b8.pf.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new jn0(this, 1));
            frameLayout8.addView(linearLayout5, b8.mf.e(-2, -2, 17));
            if (this.o1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view2, this.J0);
                frameLayout8.addView(view2, b8.mf.a(-1.0f, this.a2 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, b8.mf.e(-1, 58, 83));
            if (this.o1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        eh.d dVar = new eh.d(this.L2.b(x2Var, null));
        this.O2 = dVar;
        if (org.telegram.messenger.az.f()) {
            org.telegram.messenger.lc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        gh.g b10 = this.K2.b(this.w2, b8.cd.e(this.J0));
        this.N2 = b10;
        b10.T = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.R.g = 0.4f;
        b10.n();
        gh.g b11 = this.J2.b(tn0Var, b8.cd.e(this.J0));
        this.P2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        tn0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
        FrameLayout frameLayout9 = this.r1;
        if (frameLayout9 != null) {
            gh.g b12 = this.J2.b(frameLayout9, b8.cd.e(this.J0));
            b12.q(org.telegram.messenger.g0.L(f11));
            b12.r(org.telegram.messenger.g0.L(22.0f));
            this.r1.setBackground(b12);
            this.r1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        FrameLayout frameLayout10 = this.V1;
        if (frameLayout10 != null) {
            gh.g b13 = this.J2.b(frameLayout10, b8.cd.e(this.J0));
            b13.q(org.telegram.messenger.g0.L(f11));
            b13.r(org.telegram.messenger.g0.L(22.0f));
            this.V1.setBackground(b13);
            this.V1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        b1(0);
        org.telegram.ui.uw.u4(org.telegram.messenger.c.a(this.a));
        if (ho0Var.d.isEmpty()) {
            org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.s);
        }
        int i33 = this.a;
        int i34 = 0;
        org.telegram.messenger.qr.a0(i33).a.c(new k2.u(i33, i34, new wn0(this), 2));
        org.telegram.messenger.li.b0(this.a).M0(true);
        this.Y0.i(this.b);
        pi.q qVar2 = this.Y0;
        qVar2.a = new kn0(this, i34);
        qVar2.d = new ri.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.W3(1.0f, qn0Var2, true, false);
        org.telegram.messenger.g0.W3(1.0f, qn0Var, false, false);
        r0.i0.l(this.c, new kn0(this, 1));
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
