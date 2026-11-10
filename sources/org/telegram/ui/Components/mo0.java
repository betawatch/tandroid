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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class mo0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int T2 = 0;
    public final on0 A1;
    public TL_stories.StoryItem A2;
    public final on0 B1;
    public i0.b B2;
    public final v4.s C1;
    public int C2;
    public final v4.s D1;
    public boolean D2;
    public final ky E1;
    public org.telegram.ui.ActionBar.g1 E2;
    public final fo0 F1;
    public int F2;
    public final ko0 G1;
    public boolean G2;
    public final jo0 H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final dh.g J2;
    public final int K1;
    public final ri.c K2;
    public final bv0 L1;
    public final dh.c L2;
    public final Drawable M1;
    public final dh.c M2;
    public final View[] N1;
    public final dh.c N2;
    public final AnimatorSet[] O1;
    public final tg O2;
    public final a0.h P1;
    public final fh.g P2;
    public final HashMap Q1;
    public final dh.d Q2;
    public final ao0 R1;
    public final fh.g R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final wo Z1;
    public final org.telegram.ui.cn a2;
    public final Activity b2;
    public final boolean c2;
    public boolean d2;
    public final TextPaint e2;
    public TLRPC.TL_exportedMessageLink f2;
    public boolean g2;
    public boolean h2;
    public final boolean i2;
    public final String[] j2;
    public int k2;
    public final FrameLayout l1;
    public int l2;
    public final rn0 m1;
    public boolean m2;
    public final sn0 n1;
    public co0 n2;
    public final li.w1 o1;
    public float o2;
    public final rn0 p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final bi.ec s1;
    public final si0 s2;
    public final FrameLayout t1;
    public final r00 t2;
    public final org.telegram.ui.ActionBar.m5 u1;
    public final org.telegram.ui.ActionBar.l u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public r1.g w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final zn0 y2;
    public final pj0 z1;
    public ArrayList z2;

    public mo0(Context context, ArrayList arrayList, String str, boolean z9, String str2, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, null, arrayList, str, null, z9, str2, null, z10, false, false, null, h6Var);
    }

    public static void I0(mo0 mo0Var) {
        on0 on0Var = mo0Var.A1;
        on0 on0Var2 = mo0Var.B1;
        pj0 pj0Var = mo0Var.z1;
        if (mo0Var.m2) {
            return;
        }
        on0 on0Var3 = mo0Var.G2 ? on0Var2 : on0Var;
        if (on0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = on0Var3.getChildAt(0);
        for (int i7 = 0; i7 < on0Var3.getChildCount(); i7++) {
            if (on0Var3.getChildAt(i7).getTop() < childAt.getTop()) {
                childAt = on0Var3.getChildAt(i7);
            }
        }
        xi0 xi0Var = (xi0) on0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || xi0Var == null || xi0Var.b() != 0) ? 0 : top;
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            mo0Var.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            mo0Var.T0(true);
            top = i10;
        } else {
            mo0Var.F2 = childAt.getTop();
            mo0Var.T0(false);
        }
        if (pj0Var.getVisibility() == 0) {
            if (pj0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = pj0Var.getChildAt(0);
            for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                if (pj0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = pj0Var.getChildAt(i11);
                }
            }
            xi0 xi0Var2 = (xi0) pj0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || xi0Var2 == null || xi0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || xi0Var2 == null || xi0Var2.b() != 0) {
                mo0Var.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                mo0Var.T0(true);
                top2 = i12;
            } else {
                mo0Var.F2 = childAt2.getTop();
                mo0Var.T0(false);
            }
            top = org.telegram.messenger.g0.W1(pj0Var.getAlpha(), top, top2);
        }
        int i13 = mo0Var.k2;
        if (i13 != top) {
            mo0Var.l2 = i13;
            float f10 = top;
            int i14 = (int) (mo0Var.o2 + f10);
            mo0Var.k2 = i14;
            on0Var.setTopGlowOffset(i14);
            int i15 = (int) (mo0Var.o2 + f10);
            mo0Var.k2 = i15;
            on0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + mo0Var.o2);
            mo0Var.k2 = i16;
            pj0Var.setTopGlowOffset(i16);
            mo0Var.l1.setTranslationY(mo0Var.k2 + mo0Var.o2);
            mo0Var.L1.setTranslationY(mo0Var.k2 + mo0Var.o2);
            mo0Var.b.invalidate();
        }
    }

    public static int J0(mo0 mo0Var) {
        on0 on0Var = mo0Var.A1;
        if (on0Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = on0Var.getChildAt(0);
        xi0 xi0Var = (xi0) on0Var.G(childAt);
        if (xi0Var == null) {
            return -1000;
        }
        int paddingTop = on0Var.getPaddingTop();
        if (xi0Var.c() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    public static mo0 N0(Context context, org.telegram.messenger.ij ijVar, String str, boolean z9, String str2) {
        return new mo0(context, ijVar != null ? org.telegram.messenger.k5.k(ijVar) : null, str, null, z9, str2, null, false);
    }

    public static void W0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
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
    public void K() {
        super.K();
        sn0 sn0Var = this.n1;
        if (sn0Var != null) {
            sn0Var.o();
        }
    }

    public final void K0(boolean z9) {
        r00 r00Var = this.t2;
        ah.i iVar = r00Var.r;
        ah.i iVar2 = r00Var.r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        on0 on0Var = this.A1;
        on0 on0Var2 = this.B1;
        boolean z10 = true;
        if (!isEmpty || ((this.d && iVar2.hasFocus()) || this.H2)) {
            this.v2 = true;
            if (this.x2 == null) {
                org.telegram.messenger.g0.Z3(on0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.X3(on0Var2, true);
            }
        } else {
            if (this.x2 == null) {
                org.telegram.messenger.g0.Z3(on0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.X3(on0Var2, false);
            }
            z10 = false;
        }
        if (this.G2 != z10 || z9) {
            this.G2 = z10;
            jo0 jo0Var = this.H1;
            jo0Var.f();
            this.F1.f();
            if (this.G2) {
                if (this.F2 == Integer.MAX_VALUE) {
                    ((v4.b0) on0Var2.getLayoutManager()).h1(0, -on0Var2.getPaddingTop());
                } else {
                    ((v4.b0) on0Var2.getLayoutManager()).h1(0, this.F2 - on0Var2.getPaddingTop());
                }
                jo0Var.E(iVar2.getText().toString());
                return;
            }
            int i7 = this.F2;
            v4.s sVar = this.C1;
            if (i7 == Integer.MAX_VALUE) {
                sVar.h1(0, 0);
            } else {
                sVar.h1(0, 0);
            }
        }
    }

    public final void L0() {
        TLRPC.Dialog dialog = this.x2;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.x2 = null;
        for (int i7 = 0; i7 < P0().getChildCount(); i7++) {
            View childAt = P0().getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        r1.g gVar = this.w2;
        if (gVar != null) {
            gVar.d();
        }
        P0().setVisibility(0);
        r00 r00Var = this.t2;
        r00Var.setVisibility(0);
        ah.i iVar = r00Var.r;
        if (this.G2 || this.H2) {
            this.y2.H.v = true;
            iVar.requestFocus();
            org.telegram.messenger.g0.K3(iVar);
        }
        int[] iArr = new int[2];
        r1.g gVar2 = new r1.g(new r1.f(1000.0f));
        r1.h hVar = new r1.h(0.0f);
        org.telegram.ui.cn cnVar = this.a2;
        hVar.b((cnVar == null || !cnVar.b) ? 800.0f : 10.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.w2 = gVar2;
        gVar2.b(new fn0(this, (org.telegram.ui.Cells.d7) view, iArr, 0));
        this.w2.a(new sa(this, 5));
        this.w2.h();
    }

    public final void M0() {
        boolean z9 = false;
        if (this.f2 == null && this.j2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", O0()));
            co0 co0Var = this.n2;
            if (co0Var != null) {
                co0Var.C0();
                return;
            }
            if (this.b2 instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z9 = true;
                }
                ((LaunchActivity) this.b2).H0(new l2.w(2, z9));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final String O0() {
        String str;
        String[] strArr = this.j2;
        ao0 ao0Var = this.R1;
        if (ao0Var != null) {
            str = strArr[ao0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        wo woVar = this.Z1;
        if (woVar != null && woVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.W1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final pj0 P0() {
        return (this.G2 || this.H2) ? this.B1 : this.A1;
    }

    public final void Q0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        pj0 pj0Var = this.z1;
        pj0Var.setPivotX(width);
        pj0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        pj0Var.setScaleX(f12);
        pj0Var.setScaleY(f12);
        pj0Var.setAlpha(f10);
        pj0 P0 = P0();
        P0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        P0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        P0.setScaleX(f13);
        P0.setScaleY(f13);
        float f14 = 1.0f - f10;
        P0.setAlpha(f14);
        r00 r00Var = this.t2;
        r00Var.setPivotX(r00Var.getWidth() / 2.0f);
        r00Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        r00Var.setScaleX(f15);
        r00Var.setScaleY(f15);
        r00Var.setAlpha(f14);
        org.telegram.ui.ActionBar.l lVar = this.u2;
        lVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        lVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        lVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        lVar.setAlpha(f10);
        pj0Var.getLocationInWindow(iArr);
        float interpolation = wq.g.getInterpolation(f10);
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
        for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
            View childAt2 = pj0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((pj0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        P0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final int R() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void T0(boolean z9) {
        View[] viewArr = this.N1;
        if ((!z9 || viewArr[0].getTag() == null) && (z9 || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z9 ? null : 1);
        if (z9) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.O1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new xn0(this, z9, 0));
        animatorSetArr[0].start();
    }

    public final void U0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        mo0 mo0Var;
        ArrayList l10;
        io0 io0Var;
        if (dialog instanceof eo0) {
            S0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.d7) && ((org.telegram.ui.Cells.d7) view).F) || ((view instanceof org.telegram.ui.Cells.g6) && ((org.telegram.ui.Cells.g6) view).n0)) {
            Y0(dialog.id, view);
            return;
        }
        pj0 pj0Var = this.z1;
        if (pj0Var.getVisibility() != 8 || (activity = this.b2) == null) {
            return;
        }
        boolean z9 = org.telegram.messenger.m5.z(dialog.id);
        int i7 = this.K1;
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
                    } else if (this.i2) {
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
        a0.h hVar = this.P1;
        if (hVar.h(j3) >= 0) {
            hVar.l(dialog.id);
            this.Q1.remove(dialog);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(false, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(false, true);
            }
            b1(1);
            mo0Var = this;
        } else {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(dialog.id));
            TLRPC.Chat M05 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.t10.u(a22) && !(((l10 = org.telegram.messenger.qp.s1(this.a).q7.l(-a22.id)) == null || l10.isEmpty()) && org.telegram.messenger.qp.s1(this.a).q7.e(-a22.id))) || (org.telegram.messenger.m5.z(dialog.id) && (org.telegram.messenger.t3.c0(M05) || (org.telegram.messenger.t3.p0(M05) && org.telegram.messenger.t3.A(this.a, M05, 24))))) {
                this.x2 = dialog;
                this.D1.h1(0, this.k2 - pj0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                vn0 vn0Var = new vn0(this, dialog, atomicReference, view);
                atomicReference.set(new kn0(this, atomicReference, vn0Var, dialog, 0));
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.a);
                int i10 = org.telegram.messenger.qs.q5;
                f10.b(vn0Var, i10);
                if (org.telegram.messenger.qp.s1(this.a).q7.l(-dialog.id) != null) {
                    vn0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.qp.s1(this.a).q7.o(-dialog.id);
                    org.telegram.messenger.g0.i3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            mo0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).b(true, true);
            }
            b1(2);
            long j10 = org.telegram.messenger.p10.i(mo0Var.a).n;
            if (mo0Var.G2) {
                fo0 fo0Var = mo0Var.F1;
                a0.h hVar2 = fo0Var.e;
                ArrayList arrayList = fo0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    fo0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                fo0Var.f();
                mo0Var.v2 = false;
                r00 r00Var = mo0Var.t2;
                r00Var.r.setText("");
                K0(false);
                org.telegram.messenger.g0.v1(r00Var.r);
            }
        }
        jo0 jo0Var = mo0Var.H1;
        if (jo0Var == null || (io0Var = jo0Var.H) == null) {
            return;
        }
        io0Var.k(0, io0Var.b());
    }

    public final void V0(final boolean z9) {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.P1;
            int m10 = hVar.m();
            rn0 rn0Var = this.m1;
            sn0 sn0Var = this.n1;
            if (i11 >= m10) {
                Editable text = sn0Var.getText();
                et etVar = sn0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList W = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
                wo woVar = this.Z1;
                int i12 = (woVar == null || !woVar.a.q) ? -1 : this.W1;
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i7 = 0;
                    while (i10 < hVar.m()) {
                        long j3 = hVar.j(i10);
                        long N1 = org.telegram.messenger.qp.s1(this.a).N1(j3);
                        if (N1 <= 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j3));
                        }
                        if (rn0Var.getTag() != null && etVar.length() > 0 && N1 > 0) {
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
                    ao0 ao0Var = this.R1;
                    int i13 = ao0Var != null ? ao0Var.e : 0;
                    if (this.A2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j10 = hVar.j(i14);
                            long N12 = org.telegram.messenger.qp.s1(this.a).N1(j10);
                            if (N12 <= 0) {
                                N12 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j10));
                            }
                            int i16 = i10;
                            if (this.A2 != null && rn0Var.getTag() != null && etVar.length() > 0 && charSequenceArr[i16] != null && N12 > 0) {
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
                        if (this.J1[i13] != null) {
                            for (int i18 = 0; i18 < hVar.m(); i18++) {
                                long j11 = hVar.j(i18);
                                long N13 = org.telegram.messenger.qp.s1(this.a).N1(j11);
                                if (N13 <= 0) {
                                    N13 = org.telegram.messenger.m5.k(org.telegram.messenger.qp.s1(this.a).J2(j11));
                                }
                                if (rn0Var.getTag() != null && etVar.length() > 0 && N13 > 0) {
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
                u4.Z(this.a, arrayList, i7, new org.telegram.messenger.c20() { // from class: org.telegram.ui.Components.mn0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.h6] */
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
                        sn0 sn0Var2;
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
                        mo0 mo0Var = mo0.this;
                        String[] strArr2 = mo0Var.J1;
                        sn0 sn0Var3 = mo0Var.n1;
                        rn0 rn0Var2 = mo0Var.m1;
                        HashMap hashMap3 = mo0Var.Q1;
                        Long l11 = 0L;
                        a0.h hVar2 = mo0Var.P1;
                        ArrayList arrayList4 = mo0Var.I1;
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
                                boolean y22 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j15);
                                rn0 rn0Var3 = rn0Var2;
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
                                    ijVar3 = new org.telegram.messenger.ij(mo0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (ijVar3 != null) {
                                    ijVar3.p = true;
                                }
                                if (rn0Var3.getTag() == null || sn0Var3.a.length() <= 0) {
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
                                    org.telegram.messenger.gz.C(mo0Var.a).r0(b11);
                                }
                                boolean z19 = z17;
                                int q02 = org.telegram.messenger.gz.C(mo0Var.a).q0(mo0Var.I1, j15, !mo0Var.D2, false, z19, 0, 0, ijVar4, i19, l13 == null ? 0L : l13.longValue(), j14, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j15));
                                }
                                if (hVar2.m() == 1) {
                                    u4.q0(q02, mo0Var.a2, r11);
                                    if (q02 != 0) {
                                        z16 = z18;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z15 = z19;
                                rn0Var2 = rn0Var3;
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
                                mo0Var.R0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z16);
                            }
                        } else {
                            boolean z20 = z15;
                            ao0 ao0Var2 = mo0Var.R1;
                            int i25 = ao0Var2 != null ? ao0Var2.e : 0;
                            if (mo0Var.A2 != null) {
                                int i26 = 0;
                                boolean z21 = false;
                                while (i26 < hVar2.m()) {
                                    long j16 = hVar2.j(i26);
                                    boolean y23 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j16);
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
                                        ijVar2 = new org.telegram.messenger.ij(mo0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (mo0Var.A2 != null) {
                                        if (rn0Var2.getTag() != null && sn0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.ij ijVar5 = ijVar2;
                                            ijVar2 = ijVar5;
                                            org.telegram.messenger.gz.C(mo0Var.a).r0(org.telegram.messenger.ez.b(charSequenceArr3[0].toString(), j16, null, ijVar5, null, true, null, null, null, z20, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.ez.b(null, j16, ijVar2, ijVar2, null, true, null, null, null, z20, 0, 0, null, false);
                                        b10.I = mo0Var.A2;
                                    } else if (rn0Var2.getTag() == null || sn0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.ez.b(strArr[i25], j16, ijVar2, ijVar2, null, true, null, null, null, z20, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z22 = z20;
                                        b10 = org.telegram.messenger.ez.b(charSequence2 == null ? null : charSequence2.toString(), j16, ijVar2, ijVar2, null, true, arrayList5, null, null, z22, 0, 0, null, false);
                                        z20 = z22;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j13;
                                    org.telegram.messenger.gz.C(mo0Var.a).r0(b10);
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
                                    boolean y24 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j17);
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
                                        ijVar = new org.telegram.messenger.ij(mo0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (rn0Var2.getTag() == null || sn0Var3.a.length() <= 0) {
                                        sn0Var2 = sn0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z24 = z20;
                                        org.telegram.messenger.ez b12 = org.telegram.messenger.ez.b(charSequence3 == null ? null : charSequence3.toString(), j17, ijVar, ijVar, null, true, arrayList5, null, null, z24, 0, 0, null, false);
                                        z20 = z24;
                                        if (l15 == null) {
                                            sn0Var2 = sn0Var3;
                                            longValue = 0;
                                        } else {
                                            sn0Var2 = sn0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j12;
                                        org.telegram.messenger.gz.C(mo0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.ij ijVar6 = ijVar;
                                    org.telegram.messenger.ez b13 = org.telegram.messenger.ez.b(strArr2[i25], j17, ijVar6, ijVar6, null, true, null, null, null, z20, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j12;
                                    org.telegram.messenger.gz.C(mo0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    sn0Var3 = sn0Var2;
                                    hashMap2 = hashMap;
                                    z23 = z11;
                                }
                                z10 = z23;
                            } else {
                                i20 = 0;
                                z10 = false;
                                mo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z10);
                            }
                            i20 = 0;
                            mo0Var.R0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z10);
                        }
                        co0 co0Var = mo0Var.n2;
                        if (co0Var != null) {
                            co0Var.W();
                        }
                        mo0Var.dismiss();
                    }
                });
                return;
            }
            if (u4.h(getContext(), this.a, hVar.j(i11), rn0Var.getTag() != null && sn0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void X0(boolean z9) {
        rn0 rn0Var = this.m1;
        if (z9 == (rn0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        rn0Var.setTag(z9 ? 1 : null);
        sn0 sn0Var = this.n1;
        if (sn0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(sn0Var.getEditText());
        }
        sn0Var.k(true);
        FrameLayout frameLayout = this.X1;
        rn0 rn0Var2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z9) {
            rn0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            rn0Var2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i7 = z9 ? 4 : 1;
            WeakHashMap weakHashMap = r0.i0.a;
            frameLayout2.setImportantForAccessibility(i7);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            int i10 = z9 ? 4 : 1;
            WeakHashMap weakHashMap2 = r0.i0.a;
            linearLayout.setImportantForAccessibility(i10);
        }
        this.y1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f10 = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(rn0Var, (Property<rn0, Float>) property, z9 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z9 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, (Property<rn0, Float>) View.SCALE_X, z9 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, (Property<rn0, Float>) View.SCALE_Y, z9 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(rn0Var2, (Property<rn0, Float>) property, z9 ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.N1[1], (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.t1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.c2 && z9) {
                f10 = org.telegram.messenger.g0.L(this.Y1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f10));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new xn0(this, z9, 1));
        this.y1.start();
    }

    public final void Y0(long j3, View view) {
        int i7 = -this.C2;
        this.C2 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.D.a();
        String p10 = j3 >= 0 ? org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(j3))) : "";
        boolean D3 = org.telegram.messenger.qp.s1(this.a).D3();
        int i10 = 1;
        FrameLayout frameLayout = this.v1;
        (D3 ? new gc(frameLayout, this.I0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10))) : new gc(frameLayout, this.I0).K(R.raw.star_premium_2, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, p10)), org.telegram.messenger.id.M0(2131743759, null), new in0(this, i10))).j();
    }

    public final void Z0() {
        org.telegram.ui.ActionBar.i1 i1Var;
        rn0 rn0Var = this.m1;
        if (rn0Var == null) {
            return;
        }
        sn0 sn0Var = this.n1;
        if (sn0Var == null || !sn0Var.m()) {
            zn0 zn0Var = this.y2;
            if (zn0Var != null && (i1Var = zn0Var.H) != null && !i1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            sn0Var.getEmojiPaddingShown();
        }
        float f10 = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f10 = 0.0f + org.telegram.messenger.g0.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f10);
        }
        float f11 = -f10;
        rn0Var.setTranslationY(f11);
        this.p1.setTranslationY(f11);
    }

    public final void a1() {
        org.telegram.ui.ActionBar.m5 m5Var = this.u1;
        if (m5Var != null) {
            String O0 = O0();
            if (O0.startsWith("https://")) {
                O0 = O0.substring(8);
            } else if (O0.startsWith("http://")) {
                O0 = O0.substring(7);
            }
            m5Var.l(O0, false);
        }
    }

    public final void b1(int i7) {
        a0.h hVar = this.P1;
        if (hVar.m() == 0) {
            X0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.m1.getTag();
        sn0 sn0Var = this.n1;
        if (tag != null && sn0Var.a.length() > 0) {
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
        li.w1 w1Var = this.o1;
        w1Var.e(max, z9);
        w1Var.i(size, j3, i7 != 0);
        X0(true);
        sn0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), w1Var.l()), 0);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.s;
        if (i7 == i11) {
            fo0 fo0Var = this.F1;
            if (fo0Var != null) {
                fo0Var.E();
            }
            org.telegram.messenger.qs.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        sn0 sn0Var = this.n1;
        if (sn0Var != null) {
            org.telegram.messenger.g0.v1(sn0Var.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        org.telegram.messenger.qs.f(this.a).n(this, org.telegram.messenger.qs.s);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.x2 != null) {
            L0();
            return;
        }
        sn0 sn0Var = this.n1;
        if (sn0Var == null || !sn0Var.e) {
            super.onBackPressed();
        } else {
            sn0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            ri.c cVar = this.K2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.I0));
            }
            org.telegram.ui.ActionBar.m2 m2Var = this.c;
            if (m2Var != null) {
                boolean z9 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0)) > 0.721f;
                if (z9 != this.S2) {
                    this.S2 = z9;
                    org.telegram.messenger.g0.o3(m2Var, z9);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public mo0(Context context, ArrayList arrayList, String str, String str2, boolean z9, String str3, String str4, boolean z10) {
        this(context, null, arrayList, str, str2, z9, str3, str4, false, z10, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mo0(Context context, org.telegram.ui.cn cnVar, ArrayList arrayList, String str, String str2, boolean z9, String str3, String str4, boolean z10, boolean z11, boolean z12, Integer num, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        int i7;
        float f10;
        on0 on0Var;
        float f11;
        LinearLayout linearLayout;
        int i10;
        final int i11 = 1;
        final int i12 = 2;
        String[] strArr = new String[2];
        this.J1 = strArr;
        this.N1 = new View[2];
        this.O1 = new AnimatorSet[2];
        this.P1 = new a0.h();
        this.Q1 = new HashMap();
        this.S1 = -1;
        final int i13 = 0;
        this.T1 = false;
        new RectF();
        new Paint(1);
        this.e2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.j2 = strArr2;
        this.z2 = new ArrayList();
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
        this.B2 = i0.b.e;
        this.C2 = 4;
        this.D2 = true;
        this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        org.telegram.messenger.g0.S(getWindow());
        ri.c d = this.X0.d(new hn0(this, i14));
        this.K2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.f()) {
            dh.g gVar = new dh.g(false);
            this.J2 = gVar;
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
            this.L2 = cVar;
            cVar.k = true;
            int L = org.telegram.messenger.sc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
            cVar.d = L;
            cVar.e = L;
            cVar.j = this.X0;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.M2 = cVar2;
            cVar2.k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.e = L2;
            oi.q qVar = this.X0;
            cVar2.j = qVar;
            dh.c cVar3 = new dh.c(d, d, d);
            this.N2 = cVar3;
            cVar3.j = qVar;
        } else {
            this.J2 = null;
            dh.c cVar4 = new dh.c(d, d, d);
            cVar4.j = this.X0;
            this.M2 = cVar4;
            this.L2 = cVar4;
            this.N2 = cVar4;
        }
        this.I0 = h6Var;
        this.U1 = z12;
        this.b2 = org.telegram.messenger.g0.W(context);
        this.c2 = z11;
        if (z11) {
            this.I0 = new di.i0(i12);
        }
        d.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.I0));
        this.a2 = cnVar;
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.M1 = h;
        int i17 = org.telegram.ui.ActionBar.m6.h5;
        this.a0 = i17;
        h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i17, this.I0), PorterDuff.Mode.MULTIPLY));
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
        this.I1 = arrayList;
        this.H1 = new jo0(this, context);
        this.i2 = z9;
        strArr[0] = str;
        strArr[1] = str2;
        this.F = true;
        this.y0 = new org.telegram.ui.h0(this, i11);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.I1.get(i18);
                if (ijVar2.D4()) {
                    this.K1 = 3;
                } else if (ijVar2.T3()) {
                    int i19 = ijVar2.Z3() ? 2 : 1;
                    this.K1 = i19;
                    if (i19 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z9) {
            this.g2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.ij) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.qp.s1(this.a).h1(((org.telegram.messenger.ij) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.ld(19, this, context));
        }
        zn0 zn0Var = new zn0(this, context);
        this.y2 = zn0Var;
        this.b = zn0Var;
        zn0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i20 = this.t0;
        viewGroup.setPadding(i20, 0, i20, this.B2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.v2(this));
        if (this.c2 && this.j2[1] != null) {
            ao0 ao0Var = new ao0(this, context);
            this.R1 = ao0Var;
            frameLayout.addView(ao0Var, c8.ha.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        r00 r00Var = new r00(context, this.I0);
        this.t2 = r00Var;
        tn0 tn0Var = new tn0(this, i11);
        ah.i iVar = r00Var.r;
        iVar.addTextChangedListener(tn0Var);
        iVar.setHint(org.telegram.messenger.id.M0(2131745440, null));
        iVar.setOnEditorActionListener(new s0(this, 7));
        r00Var.setCloseButtonOnClickListener(new in0(this, i13));
        frameLayout.addView(r00Var, c8.ha.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.u2 = lVar;
        lVar.setOccupyStatusBar(false);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i21 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.l(lVar, 5, i21, this.I0);
        int i22 = 6;
        org.telegram.ui.ActionBar.t6.l(lVar, 6, org.telegram.ui.ActionBar.m6.q5, this.I0);
        org.telegram.ui.ActionBar.t6.l(lVar, 1, org.telegram.ui.ActionBar.m6.z6, null);
        org.telegram.ui.ActionBar.t6.l(lVar, 3, org.telegram.ui.ActionBar.m6.u8, null);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 17));
        lVar.setVisibility(8);
        frameLayout.addView(lVar, c8.ha.e(-1, 58, 83));
        pj0 pj0Var = new pj0(context, this.I0);
        this.z1 = pj0Var;
        v4.s sVar = new v4.s(4);
        this.D1 = sVar;
        pj0Var.setLayoutManager(sVar);
        sVar.O = new pn0(this, i12);
        pj0Var.setOnScrollListener(new qn0(this, i12));
        ko0 ko0Var = new ko0(this, context);
        this.G1 = ko0Var;
        pj0Var.setAdapter(ko0Var);
        int i23 = org.telegram.ui.ActionBar.m6.A5;
        org.telegram.ui.ActionBar.t6.l(pj0Var, 21, i23, this.I0);
        pj0Var.setVerticalScrollBarEnabled(false);
        pj0Var.setHorizontalScrollBarEnabled(false);
        pj0Var.setOverScrollMode(2);
        pj0Var.setSelectorDrawableColor(0);
        pj0Var.setItemSelectorColorProvider(new il0(i22));
        pj0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        pj0Var.setClipToPadding(false);
        pj0Var.i(new di.k(9));
        pj0Var.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.jn0
            public final /* synthetic */ mo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.bj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        mo0 mo0Var = this.b;
                        r00 r00Var2 = mo0Var.t2;
                        HashMap hashMap = mo0Var.Q1;
                        a0.h hVar = mo0Var.P1;
                        fo0 fo0Var = mo0Var.F1;
                        ko0 ko0Var2 = mo0Var.G1;
                        if (ko0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = mo0Var.x2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var.e.f(dialog2.id)) == null) {
                                        fo0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = fo0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    fo0Var.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < mo0Var.P0().getChildCount(); i25++) {
                                    View childAt = mo0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ko0Var2.E(i24);
                            if (E != null && (dialog = mo0Var.x2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = mo0Var.x2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var.e.f(dialog3.id)) == null) {
                                        fo0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = fo0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    fo0Var.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < mo0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = mo0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            mo0 mo0Var2 = this.b;
                            ArrayList arrayList4 = mo0Var2.F1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                mo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            mo0 mo0Var3 = this.b;
                            jo0 jo0Var = mo0Var3.H1;
                            mo0 mo0Var4 = jo0Var.K;
                            int i28 = jo0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jo0Var.d.size()) {
                                        dialog5 = ((bo0) jo0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jo0Var.d.size();
                                        ArrayList arrayList5 = jo0Var.e.d;
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
                                    mo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < mo0Var4.z2.size()) {
                                    TLObject tLObject2 = ((jg.g0) mo0Var4.z2.get(i30)).a;
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
        pj0Var.setVisibility(8);
        this.b.addView(pj0Var, c8.ha.e(-1, -1, 51));
        on0 on0Var2 = new on0(this, context, this.I0, i13);
        this.A1 = on0Var2;
        on0Var2.setSelectorDrawableColor(0);
        on0Var2.setItemSelectorColorProvider(new il0(i22));
        on0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        on0Var2.setClipToPadding(false);
        getContext();
        v4.s sVar2 = new v4.s(4);
        this.C1 = sVar2;
        on0Var2.setLayoutManager(sVar2);
        this.O2 = new tg(this, i12);
        sVar2.O = new pn0(this, i13);
        on0Var2.setHorizontalScrollBarEnabled(false);
        on0Var2.setVerticalScrollBarEnabled(false);
        on0Var2.setOverScrollMode(2);
        on0Var2.i(new di.k(10));
        this.b.addView(on0Var2, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        fo0 fo0Var = new fo0(this, context);
        this.F1 = fo0Var;
        on0Var2.setAdapter(fo0Var);
        org.telegram.ui.ActionBar.t6.l(on0Var2, 21, i23, this.I0);
        on0Var2.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.jn0
            public final /* synthetic */ mo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.bj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        mo0 mo0Var = this.b;
                        r00 r00Var2 = mo0Var.t2;
                        HashMap hashMap = mo0Var.Q1;
                        a0.h hVar = mo0Var.P1;
                        fo0 fo0Var2 = mo0Var.F1;
                        ko0 ko0Var2 = mo0Var.G1;
                        if (ko0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = mo0Var.x2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var2.e.f(dialog2.id)) == null) {
                                        fo0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = fo0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    fo0Var2.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < mo0Var.P0().getChildCount(); i25++) {
                                    View childAt = mo0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ko0Var2.E(i24);
                            if (E != null && (dialog = mo0Var.x2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = mo0Var.x2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var2.e.f(dialog3.id)) == null) {
                                        fo0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = fo0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    fo0Var2.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < mo0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = mo0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            mo0 mo0Var2 = this.b;
                            ArrayList arrayList4 = mo0Var2.F1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                mo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            mo0 mo0Var3 = this.b;
                            jo0 jo0Var = mo0Var3.H1;
                            mo0 mo0Var4 = jo0Var.K;
                            int i28 = jo0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jo0Var.d.size()) {
                                        dialog5 = ((bo0) jo0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jo0Var.d.size();
                                        ArrayList arrayList5 = jo0Var.e.d;
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
                                    mo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < mo0Var4.z2.size()) {
                                    TLObject tLObject2 = ((jg.g0) mo0Var4.z2.get(i30)).a;
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
        on0Var2.setOnScrollListener(new qn0(this, i13));
        this.X0.b(on0Var2);
        on0 on0Var3 = new on0(this, context, this.I0, i11);
        this.B1 = on0Var3;
        on0Var3.setItemSelectorColorProvider(new il0(i22));
        on0Var3.setSelectorDrawableColor(0);
        on0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        on0Var3.setClipToPadding(false);
        getContext();
        ky kyVar = new ky(4, 0, on0Var3);
        this.E1 = kyVar;
        on0Var3.setLayoutManager(kyVar);
        kyVar.O = new pn0(this, i11);
        on0Var3.setOnItemClickListener(new bj0(this) { // from class: org.telegram.ui.Components.jn0
            public final /* synthetic */ mo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.bj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i24, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        mo0 mo0Var = this.b;
                        r00 r00Var2 = mo0Var.t2;
                        HashMap hashMap = mo0Var.Q1;
                        a0.h hVar = mo0Var.P1;
                        fo0 fo0Var2 = mo0Var.F1;
                        ko0 ko0Var2 = mo0Var.G1;
                        if (ko0Var2.d && i24 == 1) {
                            TLRPC.Dialog dialog2 = mo0Var.x2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var2.e.f(dialog2.id)) == null) {
                                        fo0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = fo0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    fo0Var2.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i25 = 0; i25 < mo0Var.P0().getChildCount(); i25++) {
                                    View childAt = mo0Var.P0().getChildAt(i25);
                                    if (childAt instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) childAt;
                                        if (d7Var.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var.d(null, false, true);
                                            d7Var.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ko0Var2.E(i24);
                            if (E != null && (dialog = mo0Var.x2) != null) {
                                long j3 = dialog.id;
                                boolean y22 = org.telegram.messenger.qp.s1(mo0Var.a).y2(j3);
                                TLRPC.Dialog dialog3 = mo0Var.x2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                mo0Var.b1(2);
                                if (mo0Var.G2 || mo0Var.H2) {
                                    if (((TLRPC.Dialog) fo0Var2.e.f(dialog3.id)) == null) {
                                        fo0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = fo0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    fo0Var2.f();
                                    mo0Var.v2 = false;
                                    r00Var2.r.setText("");
                                    mo0Var.K0(false);
                                }
                                for (int i26 = 0; i26 < mo0Var.P0().getChildCount(); i26++) {
                                    View childAt2 = mo0Var.P0().getChildAt(i26);
                                    if (childAt2 instanceof org.telegram.ui.Cells.d7) {
                                        org.telegram.ui.Cells.d7 d7Var2 = (org.telegram.ui.Cells.d7) childAt2;
                                        if (d7Var2.getCurrentDialog() == mo0Var.x2.id) {
                                            d7Var2.d(E, y22, true);
                                            d7Var2.b(true, true);
                                        }
                                    }
                                }
                                mo0Var.L0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i24 >= 0) {
                            mo0 mo0Var2 = this.b;
                            ArrayList arrayList4 = mo0Var2.F1.d;
                            int i27 = i24 - 1;
                            TLRPC.Dialog dialog4 = (i27 < 0 || i27 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i27);
                            if (dialog4 != null) {
                                mo0Var2.U0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i24 >= 0) {
                            mo0 mo0Var3 = this.b;
                            jo0 jo0Var = mo0Var3.H1;
                            mo0 mo0Var4 = jo0Var.K;
                            int i28 = jo0Var.E;
                            TLRPC.Dialog dialog5 = null;
                            if (i24 < i28 || i28 < 0) {
                                int i29 = i24 - 1;
                                if (i29 >= 0) {
                                    if (i29 < jo0Var.d.size()) {
                                        dialog5 = ((bo0) jo0Var.d.get(i29)).a;
                                    } else {
                                        int size2 = i29 - jo0Var.d.size();
                                        ArrayList arrayList5 = jo0Var.e.d;
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
                                    mo0Var3.U0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i30 = i24 - i28;
                                if (i30 >= 0 && i30 < mo0Var4.z2.size()) {
                                    TLObject tLObject2 = ((jg.g0) mo0Var4.z2.get(i30)).a;
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
        on0Var3.setHasFixedSize(true);
        on0Var3.setItemAnimator(null);
        on0Var3.setHorizontalScrollBarEnabled(false);
        on0Var3.setVerticalScrollBarEnabled(false);
        on0Var3.setOnScrollListener(new qn0(this, i11));
        on0Var3.i(new di.k(11));
        on0Var3.setAdapter(this.H1);
        org.telegram.ui.ActionBar.t6.l(on0Var3, 21, i23, this.I0);
        this.s2 = new si0(on0Var3, true);
        lz lzVar = new lz(context, this.I0);
        lzVar.setViewType(12);
        bv0 bv0Var = new bv0(context, lzVar, 1, this.I0);
        this.L1 = bv0Var;
        bv0Var.addView(lzVar, 0);
        bv0Var.setAnimateLayoutChange(true);
        bv0Var.e(false, false);
        boolean z13 = this.c2;
        xh.l lVar2 = bv0Var.d;
        if (z13) {
            org.telegram.ui.ActionBar.t6.U(lVar2, org.telegram.ui.ActionBar.m6.bh, this.I0);
        }
        lVar2.setText(org.telegram.messenger.id.M0(2131748167, null));
        on0Var3.setEmptyView(bv0Var);
        on0Var3.setHideIfEmpty(false);
        on0Var3.W1 = true;
        on0Var3.X1 = 0;
        this.b.addView(bv0Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(on0Var3, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.ec ecVar = new bi.ec(22, context, this);
        this.s1 = ecVar;
        this.b.addView(ecVar, c8.ha.e(-1, org.telegram.messenger.qs.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.c2 || this.j2[1] == null) ? 58.0f : 111.0f);
        this.N1[0] = new View(context);
        View view = this.N1[0];
        int i24 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i24, view, this.I0);
        this.N1[0].setAlpha(0.0f);
        this.N1[0].setTag(1);
        this.b.addView(this.N1[0], layoutParams);
        this.b.addView(frameLayout, c8.ha.e(-1, (!this.c2 || this.j2[1] == null) ? 58 : org.telegram.messenger.qs.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.N1[1] = new View(context);
        org.telegram.ui.ActionBar.t6.h(i24, this.N1[1], this.I0);
        this.N1[1].setLayoutParams(layoutParams2);
        if (!this.i2 && this.j2[0] == null) {
            this.N1[1].setAlpha(0.0f);
            on0Var = on0Var3;
            f10 = 4.0f;
            f11 = 9.0f;
        } else {
            f10 = 4.0f;
            if (this.c2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.q1 = frameLayout2;
                f11 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.t1 = frameLayout3;
                frameLayout2.addView(frameLayout3, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                c8.ka.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new gn0(this, 4));
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
                this.u1 = m5Var;
                m5Var.setTextSize(15);
                org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.Hl, this.I0);
                m5Var.setEllipsizeByGradient(true);
                a1();
                linearLayout3.addView(m5Var, c8.ha.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.I0);
                textView.setText(org.telegram.messenger.id.M0(2131751767, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i25 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i25, this.I0), 4, 4);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i25);
                org.telegram.ui.ActionBar.h6 h6Var2 = this.I0;
                textView.setBackground(a02);
                on0Var = on0Var3;
                org.telegram.ui.ActionBar.t6.j(textView, a02, null, M, h6Var2);
                linearLayout3.addView(textView, c8.ha.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new gn0(this, 5));
                c8.ka.a(textView);
                this.b.addView(frameLayout2, c8.ha.e(-1, 58, 83));
                ArrayList arrayList2 = this.I1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.ij) this.I1.get(0)).k != null && ((org.telegram.messenger.ij) this.I1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) this.I1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-org.telegram.messenger.ij.B0(ijVar3.k)))) && !org.telegram.messenger.ij.l3(ijVar3.k)) {
                        final int i26 = 0;
                        linearLayout = org.telegram.messenger.k5.f(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nn0
                            public final /* synthetic */ mo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i26) {
                                    case 0:
                                        mo0 mo0Var = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var = mo0Var.a2;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.T();
                                        }
                                        if (f2Var != null) {
                                            mo0Var.dismiss();
                                            f2Var.presentFragment(new org.telegram.ui.mg0(ijVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        mo0 mo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var2 = mo0Var2.a2;
                                        if (f2Var2 == null) {
                                            f2Var2 = LaunchActivity.T();
                                        }
                                        if (f2Var2 != null) {
                                            mo0Var2.dismiss();
                                            f2Var2.presentFragment(new org.telegram.ui.mg0(ijVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i25, this.I0), 6, 6);
                        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i25);
                        org.telegram.ui.ActionBar.h6 h6Var3 = this.I0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.t6.j(linearLayout, a03, null, M2, h6Var3);
                        c8.ka.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i27 = org.telegram.ui.ActionBar.m6.Jl;
                        org.telegram.ui.ActionBar.t6.s(imageView, i27, this.I0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, c8.ha.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.t6.U(textView2, i27, this.I0);
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
                on0Var = on0Var3;
                f11 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.q1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.t1 = frameLayout5;
                frameLayout4.addView(frameLayout5, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i28 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i28, this.I0), 20, 20);
                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i28);
                org.telegram.ui.ActionBar.h6 h6Var4 = this.I0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.t6.j(textView3, a04, null, M3, h6Var4);
                org.telegram.ui.ActionBar.t6.U(textView3, this.c2 ? org.telegram.ui.ActionBar.m6.dh : org.telegram.ui.ActionBar.m6.n5, this.I0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.c2 && this.j2[1] != null) {
                    textView3.setText(org.telegram.messenger.id.M0(2131743387, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.id.L0(2131751762).toUpperCase());
                }
                textView3.setOnClickListener(new gn0(this, 6));
                frameLayout5.addView(textView3, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
                this.b.addView(frameLayout4, c8.ha.e(-1, 58, 87));
                ArrayList arrayList3 = this.I1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.ij) this.I1.get(0)).k != null && ((org.telegram.messenger.ij) this.I1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) this.I1.get(0);
                    if (org.telegram.messenger.t3.N(org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-ijVar4.A0()))) && !ijVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.t6.Q(linearLayout4, org.telegram.ui.ActionBar.m6.a0(V(this.c2 ? org.telegram.ui.ActionBar.m6.Sg : i28), 20, 20), null, org.telegram.ui.ActionBar.t6.M(this.c2 ? org.telegram.ui.ActionBar.m6.Sg : i28), this.I0);
                        frameLayout5.addView(linearLayout4, c8.ha.e(-2, -1, 21));
                        final int i29 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nn0
                            public final /* synthetic */ mo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i29) {
                                    case 0:
                                        mo0 mo0Var = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var = mo0Var.a2;
                                        if (f2Var == null) {
                                            f2Var = LaunchActivity.T();
                                        }
                                        if (f2Var != null) {
                                            mo0Var.dismiss();
                                            f2Var.presentFragment(new org.telegram.ui.mg0(ijVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        mo0 mo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.f2 f2Var2 = mo0Var2.a2;
                                        if (f2Var2 == null) {
                                            f2Var2 = LaunchActivity.T();
                                        }
                                        if (f2Var2 != null) {
                                            mo0Var2.dismiss();
                                            f2Var2.presentFragment(new org.telegram.ui.mg0(ijVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.t6.s(imageView2, this.c2 ? org.telegram.ui.ActionBar.m6.dh : org.telegram.ui.ActionBar.m6.n5, this.I0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, c8.ha.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(ijVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.t6.U(textView4, this.c2 ? org.telegram.ui.ActionBar.m6.dh : org.telegram.ui.ActionBar.m6.n5, this.I0);
                        textView4.setGravity(16);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        linearLayout4.addView(textView4, c8.ha.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v1 = frameLayout6;
        this.b.addView(frameLayout6, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.t1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w1 = frameLayout7;
        this.b.addView(frameLayout7, c8.ha.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        rn0 rn0Var = new rn0(this, context, 0);
        this.m1 = rn0Var;
        rn0Var.setWillNotDraw(false);
        rn0Var.setAlpha(0.0f);
        rn0Var.setVisibility(4);
        this.b.addView(rn0Var, c8.ha.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        rn0Var.setOnTouchListener(new ei.b(22));
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        boolean z14 = org.telegram.messenger.g0.B(V(org.telegram.ui.ActionBar.m6.h5)) > 0.721f;
        this.S2 = z14;
        org.telegram.messenger.g0.o3(m2Var, z14);
        sn0 sn0Var = new sn0(this, context, zn0Var, this.I0);
        this.n1 = sn0Var;
        sn0Var.J = true;
        if (this.c2) {
            ys editText = sn0Var.getEditText();
            int i30 = org.telegram.ui.ActionBar.m6.bh;
            editText.setTextColor(V(i30));
            sn0Var.getEditText().setCursorColor(V(i30));
        }
        sn0Var.setHint(org.telegram.messenger.id.L0(2131745462));
        sn0Var.s();
        sn0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        rn0Var.addView(sn0Var, c8.ha.e(-1, -2, 51));
        rn0Var.setClipChildren(false);
        rn0Var.setClipToPadding(false);
        sn0Var.setClipChildren(false);
        sn0Var.getEditText().addTextChangedListener(new tn0(this, 0));
        rn0 rn0Var2 = new rn0(this, context, 1);
        this.p1 = rn0Var2;
        rn0Var2.setFocusable(true);
        rn0Var2.setFocusableInTouchMode(true);
        rn0Var2.setVisibility(4);
        rn0Var2.setScaleX(0.2f);
        rn0Var2.setScaleY(0.2f);
        rn0Var2.setAlpha(0.0f);
        this.b.addView(rn0Var2, c8.ha.e(org.telegram.messenger.qs.v1, 50, 85));
        li.w1 w1Var = new li.w1(this, context, this.I0);
        this.o1 = w1Var;
        int L3 = org.telegram.messenger.g0.L(52.0f);
        int L4 = org.telegram.messenger.g0.L(38.0f);
        w1Var.I = L3;
        w1Var.J = L4;
        float L5 = org.telegram.messenger.g0.L(1.0f);
        float L6 = org.telegram.messenger.g0.L(6.0f);
        w1Var.M = L5;
        w1Var.N = L6;
        w1Var.h0 = true;
        rn0Var2.addView(w1Var, c8.ha.g());
        w1Var.setOnClickListener(new gn0(this, 0));
        w1Var.setOnLongClickListener(new d00(this, 2));
        this.e2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.e2.setTypeface(org.telegram.messenger.g0.o());
        if (num != null) {
            this.W1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.X1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Y1 = linearLayout5;
            linearLayout5.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(f10));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i31 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.ActionBar.t6.Q(linearLayout5, org.telegram.ui.ActionBar.m6.a0(V(i31), 6, 6), null, org.telegram.ui.ActionBar.t6.M(i31), this.I0);
            wo woVar = new wo(24, context, this.I0);
            this.Z1 = woVar;
            woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView5, i21, this.I0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.id.Z(2131743581, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
            c8.ka.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new gn0(this, 1));
            frameLayout8.addView(linearLayout5, c8.ha.e(-2, -2, 17));
            if (this.q1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view2, this.I0);
                frameLayout8.addView(view2, c8.ha.a(-1.0f, this.c2 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, c8.ha.e(-1, 58, 83));
            if (this.q1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        dh.d dVar = new dh.d(this.N2.b(ecVar, null));
        this.Q2 = dVar;
        if (org.telegram.messenger.iz.f()) {
            org.telegram.messenger.sc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        fh.g b10 = this.M2.b(this.y2, c8.g0.e(this.I0));
        this.P2 = b10;
        b10.S = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.Q.g = 0.4f;
        b10.n();
        fh.g b11 = this.L2.b(rn0Var, c8.g0.e(this.I0));
        this.R2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        rn0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
        FrameLayout frameLayout9 = this.t1;
        if (frameLayout9 != null) {
            fh.g b12 = this.L2.b(frameLayout9, c8.g0.e(this.I0));
            b12.q(org.telegram.messenger.g0.L(f11));
            b12.r(org.telegram.messenger.g0.L(22.0f));
            this.t1.setBackground(b12);
            this.t1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        FrameLayout frameLayout10 = this.X1;
        if (frameLayout10 != null) {
            fh.g b13 = this.L2.b(frameLayout10, c8.g0.e(this.I0));
            b13.q(org.telegram.messenger.g0.L(f11));
            b13.r(org.telegram.messenger.g0.L(22.0f));
            this.X1.setBackground(b13);
            this.X1.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11));
        }
        b1(0);
        org.telegram.ui.zw.u4(org.telegram.messenger.c.a(this.a));
        if (fo0Var.d.isEmpty()) {
            org.telegram.messenger.qs.f(this.a).c(this, org.telegram.messenger.qs.s);
        }
        int i32 = this.a;
        int i33 = 0;
        org.telegram.messenger.yr.a0(i32).a.c(new jg.r(i32, i33, new un0(this), i33));
        org.telegram.messenger.ui.b0(this.a).M0(true);
        this.X0.i(this.b);
        oi.q qVar2 = this.X0;
        qVar2.a = new hn0(this, i33);
        qVar2.d = new qi.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.W3(1.0f, on0Var2, true, false);
        org.telegram.messenger.g0.W3(1.0f, on0Var, false, false);
        r0.i0.l(this.c, new hn0(this, 1));
    }

    public void S0(View view) {
    }

    public void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
    }
}
