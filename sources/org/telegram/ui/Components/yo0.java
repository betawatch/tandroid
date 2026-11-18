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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class yo0 extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public static final /* synthetic */ int U2 = 0;
    public final ck0 A1;
    public ArrayList A2;
    public final ao0 B1;
    public TL_stories.StoryItem B2;
    public final ao0 C1;
    public i0.b C2;
    public final v4.t D1;
    public int D2;
    public final v4.t E1;
    public boolean E2;
    public final vy F1;
    public org.telegram.ui.ActionBar.h1 F2;
    public final ro0 G1;
    public int G2;
    public final wo0 H1;
    public boolean H2;
    public final vo0 I1;
    public boolean I2;
    public final ArrayList J1;
    public int J2;
    public final String[] K1;
    public final dh.g K2;
    public final int L1;
    public final ui.c L2;
    public final kv0 M1;
    public final dh.c M2;
    public final Drawable N1;
    public final dh.c N2;
    public final View[] O1;
    public final dh.c O2;
    public final AnimatorSet[] P1;
    public final ih P2;
    public final a0.h Q1;
    public final fh.g Q2;
    public final HashMap R1;
    public final dh.d R2;
    public final mo0 S1;
    public final fh.g S2;
    public int T1;
    public boolean T2;
    public boolean U1;
    public final boolean V1;
    public boolean W1;
    public final int X1;
    public final FrameLayout Y1;
    public final LinearLayout Z1;
    public final mp a2;
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
    public final do0 n1;
    public boolean n2;
    public final eo0 o1;
    public oo0 o2;
    public final oi.u1 p1;
    public float p2;
    public final do0 q1;
    public float q2;
    public final FrameLayout r1;
    public float r2;
    public float s1;
    public ValueAnimator s2;
    public final bi.i3 t1;
    public final fj0 t2;
    public final FrameLayout u1;
    public final c10 u2;
    public final org.telegram.ui.ActionBar.n5 v1;
    public final org.telegram.ui.ActionBar.k v2;
    public final FrameLayout w1;
    public boolean w2;
    public final FrameLayout x1;
    public r1.g x2;
    public final LinearLayout y1;
    public TLRPC.Dialog y2;
    public AnimatorSet z1;
    public final lo0 z2;

    public yo0(Context context, ArrayList arrayList, String str, boolean z10, String str2, boolean z11, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, null, arrayList, str, null, z10, str2, null, z11, false, false, null, i6Var);
    }

    public static void J0(yo0 yo0Var) {
        ao0 ao0Var = yo0Var.B1;
        ao0 ao0Var2 = yo0Var.C1;
        ck0 ck0Var = yo0Var.A1;
        if (yo0Var.n2) {
            return;
        }
        ao0 ao0Var3 = yo0Var.H2 ? ao0Var2 : ao0Var;
        if (ao0Var3.getChildCount() <= 0) {
            return;
        }
        View childAt = ao0Var3.getChildAt(0);
        for (int i7 = 0; i7 < ao0Var3.getChildCount(); i7++) {
            if (ao0Var3.getChildAt(i7).getTop() < childAt.getTop()) {
                childAt = ao0Var3.getChildAt(i7);
            }
        }
        kj0 kj0Var = (kj0) ao0Var3.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(8.0f);
        int i10 = (top <= 0 || kj0Var == null || kj0Var.b() != 0) ? 0 : top;
        if (top < 0 || kj0Var == null || kj0Var.b() != 0) {
            yo0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            yo0Var.U0(true);
            top = i10;
        } else {
            yo0Var.G2 = childAt.getTop();
            yo0Var.U0(false);
        }
        if (ck0Var.getVisibility() == 0) {
            if (ck0Var.getChildCount() <= 0) {
                return;
            }
            View childAt2 = ck0Var.getChildAt(0);
            for (int i11 = 0; i11 < ck0Var.getChildCount(); i11++) {
                if (ck0Var.getChildAt(i11).getTop() < childAt2.getTop()) {
                    childAt2 = ck0Var.getChildAt(i11);
                }
            }
            kj0 kj0Var2 = (kj0) ck0Var.G(childAt2);
            int top2 = childAt2.getTop() - org.telegram.messenger.g0.L(8.0f);
            int i12 = (top2 <= 0 || kj0Var2 == null || kj0Var2.b() != 0) ? 0 : top2;
            if (top2 < 0 || kj0Var2 == null || kj0Var2.b() != 0) {
                yo0Var.G2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                yo0Var.U0(true);
                top2 = i12;
            } else {
                yo0Var.G2 = childAt2.getTop();
                yo0Var.U0(false);
            }
            top = org.telegram.messenger.g0.W1(ck0Var.getAlpha(), top, top2);
        }
        int i13 = yo0Var.l2;
        if (i13 != top) {
            yo0Var.m2 = i13;
            float f10 = top;
            int i14 = (int) (yo0Var.p2 + f10);
            yo0Var.l2 = i14;
            ao0Var.setTopGlowOffset(i14);
            int i15 = (int) (yo0Var.p2 + f10);
            yo0Var.l2 = i15;
            ao0Var2.setTopGlowOffset(i15);
            int i16 = (int) (f10 + yo0Var.p2);
            yo0Var.l2 = i16;
            ck0Var.setTopGlowOffset(i16);
            yo0Var.m1.setTranslationY(yo0Var.l2 + yo0Var.p2);
            yo0Var.M1.setTranslationY(yo0Var.l2 + yo0Var.p2);
            yo0Var.b.invalidate();
        }
    }

    public static int K0(yo0 yo0Var) {
        ao0 ao0Var = yo0Var.B1;
        if (ao0Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = ao0Var.getChildAt(0);
        kj0 kj0Var = (kj0) ao0Var.G(childAt);
        if (kj0Var == null) {
            return -1000;
        }
        int paddingTop = ao0Var.getPaddingTop();
        if (kj0Var.c() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    public static yo0 O0(Context context, org.telegram.messenger.fj fjVar, String str, boolean z10, String str2) {
        return new yo0(context, fjVar != null ? org.telegram.messenger.f3.i(fjVar) : null, str, null, z10, str2, null, false);
    }

    public static void X0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i10 = 0;
        while (i10 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
            int i11 = 6;
            int i12 = i10 == 0 ? 6 : 0;
            if (i10 != itemsCount - 1) {
                i11 = 0;
            }
            org.telegram.ui.ActionBar.u6.Q(childAt, org.telegram.ui.ActionBar.n6.a0(w02, i12, i11), null, org.telegram.ui.ActionBar.u6.M(i7), i6Var);
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public void L() {
        super.L();
        eo0 eo0Var = this.o1;
        if (eo0Var != null) {
            eo0Var.o();
        }
    }

    public final void L0(boolean z10) {
        c10 c10Var = this.u2;
        ah.i iVar = c10Var.r;
        ah.i iVar2 = c10Var.r;
        boolean isEmpty = TextUtils.isEmpty(iVar.getText());
        ao0 ao0Var = this.B1;
        ao0 ao0Var2 = this.C1;
        boolean z11 = true;
        if (!isEmpty || ((this.d && iVar2.hasFocus()) || this.I2)) {
            this.w2 = true;
            if (this.y2 == null) {
                org.telegram.messenger.g0.X3(ao0Var, false, 0.98f, true, true);
                org.telegram.messenger.g0.V3(ao0Var2, true);
            }
        } else {
            if (this.y2 == null) {
                org.telegram.messenger.g0.X3(ao0Var, true, 0.98f, true, true);
                org.telegram.messenger.g0.V3(ao0Var2, false);
            }
            z11 = false;
        }
        if (this.H2 != z11 || z10) {
            this.H2 = z11;
            vo0 vo0Var = this.I1;
            vo0Var.f();
            this.G1.f();
            if (this.H2) {
                if (this.G2 == Integer.MAX_VALUE) {
                    ((v4.c0) ao0Var2.getLayoutManager()).h1(0, -ao0Var2.getPaddingTop());
                } else {
                    ((v4.c0) ao0Var2.getLayoutManager()).h1(0, this.G2 - ao0Var2.getPaddingTop());
                }
                vo0Var.E(iVar2.getText().toString());
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
        c10 c10Var = this.u2;
        c10Var.setVisibility(0);
        ah.i iVar = c10Var.r;
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
        gVar2.b(new sn0(this, (org.telegram.ui.Cells.e7) view, iArr, 0));
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
            oo0 oo0Var = this.o2;
            if (oo0Var != null) {
                oo0Var.D0();
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
        mo0 mo0Var = this.S1;
        if (mo0Var != null) {
            str = strArr[mo0Var.e];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.g2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        mp mpVar = this.a2;
        if (mpVar != null && mpVar.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", org.telegram.messenger.g0.n0(this.X1)).build().toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return str == null ? "" : str;
    }

    public final ck0 Q0() {
        return (this.H2 || this.I2) ? this.C1 : this.B1;
    }

    public final void R0(View view, int[] iArr, float f10) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        ck0 ck0Var = this.A1;
        ck0Var.setPivotX(width);
        ck0Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f11 = 0.25f * f10;
        float f12 = 0.75f + f11;
        ck0Var.setScaleX(f12);
        ck0Var.setScaleY(f12);
        ck0Var.setAlpha(f10);
        ck0 Q0 = Q0();
        Q0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        Q0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f13 = f11 + 1.0f;
        Q0.setScaleX(f13);
        Q0.setScaleY(f13);
        float f14 = 1.0f - f10;
        Q0.setAlpha(f14);
        c10 c10Var = this.u2;
        c10Var.setPivotX(c10Var.getWidth() / 2.0f);
        c10Var.setPivotY(0.0f);
        float f15 = (0.1f * f14) + 0.9f;
        c10Var.setScaleX(f15);
        c10Var.setScaleY(f15);
        c10Var.setAlpha(f14);
        org.telegram.ui.ActionBar.k kVar = this.v2;
        kVar.getBackButton().setTranslationX((-org.telegram.messenger.g0.L(16.0f)) * f14);
        kVar.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(16.0f) * f14);
        kVar.setAlpha(f10);
        ck0Var.getLocationInWindow(iArr);
        float interpolation = lr.g.getInterpolation(f10);
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
        for (int i10 = 0; i10 < ck0Var.getChildCount(); i10++) {
            View childAt2 = ck0Var.getChildAt(i10);
            if (childAt2 instanceof org.telegram.ui.Cells.f7) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((ck0Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        Q0.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.x2
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
        animatorSetArr[0].addListener(new jo0(this, z10, 0));
        animatorSetArr[0].start();
    }

    public final void V0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        yo0 yo0Var;
        ArrayList l10;
        uo0 uo0Var;
        if (dialog instanceof qo0) {
            T0(view);
            return;
        }
        if (((view instanceof org.telegram.ui.Cells.e7) && ((org.telegram.ui.Cells.e7) view).G) || ((view instanceof org.telegram.ui.Cells.h6) && ((org.telegram.ui.Cells.h6) view).o0)) {
            Z0(dialog.id, view);
            return;
        }
        ck0 ck0Var = this.A1;
        if (ck0Var.getVisibility() != 8 || (activity = this.c2) == null) {
            return;
        }
        boolean z10 = org.telegram.messenger.n5.z(dialog.id);
        int i7 = this.L1;
        if (z10) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-dialog.id));
            if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-dialog.id));
                if ((!org.telegram.messenger.v3.n(O02) && !O02.megagroup) || i7 == 2 || i7 == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = org.telegram.messenger.gd.M0(2131745401, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    if (i7 == 3) {
                        if (org.telegram.messenger.v3.P(10, O0)) {
                            u1Var.U = org.telegram.messenger.gd.M0(2131751073, null);
                        } else {
                            u1Var.U = org.telegram.messenger.gd.M0(2131751074, null);
                        }
                    } else if (i7 != 2) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131752429, null);
                    } else if (this.j2) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131746392, null);
                    } else if (org.telegram.messenger.v3.P(10, O0)) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131751081, null);
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131751082, null);
                    }
                    i5.c.y(null, 2131747638, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (org.telegram.messenger.n5.C(dialog.id) && i7 != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M02 = org.telegram.messenger.gd.M0(2131745401, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.S = M02;
            if (i7 == 3) {
                u1Var2.U = org.telegram.messenger.gd.M0(2131743855, null);
            } else if (i7 != 0) {
                u1Var2.U = org.telegram.messenger.gd.M0(2131746983, null);
            } else {
                u1Var2.U = org.telegram.messenger.gd.M0(2131748912, null);
            }
            i5.c.y(null, 2131747638, alertDialog$Builder2, null);
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
            yo0Var = this;
        } else {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(dialog.id));
            TLRPC.Chat O03 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-dialog.id));
            if ((org.telegram.messenger.o10.v(c22) && !(((l10 = org.telegram.messenger.mp.u1(this.a).t7.l(-c22.id)) == null || l10.isEmpty()) && org.telegram.messenger.mp.u1(this.a).t7.e(-c22.id))) || (org.telegram.messenger.n5.z(dialog.id) && (org.telegram.messenger.v3.c0(O03) || (org.telegram.messenger.v3.p0(O03) && org.telegram.messenger.v3.A(this.a, O03, 24))))) {
                this.y2 = dialog;
                this.E1.h1(0, this.l2 - ck0Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                ho0 ho0Var = new ho0(this, dialog, atomicReference, view);
                atomicReference.set(new n20(this, atomicReference, ho0Var, dialog, 7));
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(this.a);
                int i10 = org.telegram.messenger.ks.t5;
                f10.b(ho0Var, i10);
                if (org.telegram.messenger.mp.u1(this.a).t7.l(-dialog.id) != null) {
                    ho0Var.didReceivedNotification(i10, this.a, Long.valueOf(-dialog.id));
                    return;
                } else {
                    org.telegram.messenger.mp.u1(this.a).t7.o(-dialog.id);
                    org.telegram.messenger.g0.h3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            yo0Var = this;
            hVar.k(dialog, dialog.id);
            if (view instanceof org.telegram.ui.Cells.h6) {
                ((org.telegram.ui.Cells.h6) view).w(true, true);
            } else if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).b(true, true);
            }
            c1(2);
            long j10 = org.telegram.messenger.j10.i(yo0Var.a).n;
            if (yo0Var.H2) {
                ro0 ro0Var = yo0Var.G1;
                a0.h hVar2 = ro0Var.e;
                ArrayList arrayList = ro0Var.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar2.f(dialog.id);
                if (dialog2 == null) {
                    ro0Var.e.k(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j10) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                ro0Var.f();
                yo0Var.w2 = false;
                c10 c10Var = yo0Var.u2;
                c10Var.r.setText("");
                L0(false);
                org.telegram.messenger.g0.v1(c10Var.r);
            }
        }
        vo0 vo0Var = yo0Var.I1;
        if (vo0Var == null || (uo0Var = vo0Var.I) == null) {
            return;
        }
        uo0Var.k(0, uo0Var.b());
    }

    public final void W0(final boolean z10) {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a0.h hVar = this.Q1;
            int m10 = hVar.m();
            do0 do0Var = this.n1;
            eo0 eo0Var = this.o1;
            if (i11 >= m10) {
                Editable text = eo0Var.getText();
                rt rtVar = eo0Var.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = org.telegram.messenger.ri.d0(this.a).Y(charSequenceArr, true, true);
                mp mpVar = this.a2;
                int i12 = (mpVar == null || !mpVar.a.q) ? -1 : this.X1;
                ArrayList arrayList = new ArrayList();
                if (this.J1 != null) {
                    i7 = 0;
                    while (i10 < hVar.m()) {
                        long j3 = hVar.j(i10);
                        long P1 = org.telegram.messenger.mp.u1(this.a).P1(j3);
                        if (P1 <= 0) {
                            P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(this.a).P2(j3));
                        }
                        if (do0Var.getTag() != null && rtVar.length() > 0 && P1 > 0) {
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
                    mo0 mo0Var = this.S1;
                    int i13 = mo0Var != null ? mo0Var.e : 0;
                    if (this.B2 != null) {
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < hVar.m()) {
                            long j10 = hVar.j(i14);
                            long P12 = org.telegram.messenger.mp.u1(this.a).P1(j10);
                            if (P12 <= 0) {
                                P12 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(this.a).P2(j10));
                            }
                            int i16 = i10;
                            if (this.B2 != null && do0Var.getTag() != null && rtVar.length() > 0 && charSequenceArr[i16] != null && P12 > 0) {
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
                                long P13 = org.telegram.messenger.mp.u1(this.a).P1(j11);
                                if (P13 <= 0) {
                                    P13 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(this.a).P2(j11));
                                }
                                if (do0Var.getTag() != null && rtVar.length() > 0 && P13 > 0) {
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
                b5.Z(this.a, arrayList, i7, new org.telegram.messenger.x10() { // from class: org.telegram.ui.Components.yn0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v15 */
                    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.ui.ActionBar.i6] */
                    /* JADX WARN: Type inference failed for: r11v18 */
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        int i20;
                        boolean z11;
                        int i21;
                        HashMap hashMap;
                        long j12;
                        boolean z12;
                        char c10;
                        org.telegram.messenger.fj fjVar;
                        eo0 eo0Var2;
                        long longValue;
                        boolean z13;
                        boolean z14;
                        long j13;
                        String[] strArr;
                        org.telegram.messenger.fj fjVar2;
                        org.telegram.messenger.xy b10;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i22;
                        boolean z15;
                        long j14;
                        Long l10;
                        CharSequence[] charSequenceArr2;
                        org.telegram.messenger.fj fjVar3;
                        org.telegram.messenger.fj fjVar4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        yo0 yo0Var = yo0.this;
                        String[] strArr2 = yo0Var.K1;
                        eo0 eo0Var3 = yo0Var.o1;
                        do0 do0Var2 = yo0Var.n1;
                        HashMap hashMap3 = yo0Var.R1;
                        Long l11 = 0L;
                        a0.h hVar2 = yo0Var.Q1;
                        ArrayList arrayList4 = yo0Var.J1;
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
                                boolean E2 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j15);
                                do0 do0Var3 = do0Var2;
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
                                    fjVar3 = null;
                                } else {
                                    l10 = l11;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    fjVar3 = new org.telegram.messenger.fj(yo0Var.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (fjVar3 != null) {
                                    fjVar3.p = true;
                                }
                                if (do0Var3.getTag() == null || eo0Var3.a.length() <= 0) {
                                    fjVar4 = fjVar3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    fjVar4 = fjVar3;
                                    ArrayList arrayList7 = arrayList5;
                                    org.telegram.messenger.xy b11 = org.telegram.messenger.xy.b(charSequence == null ? null : charSequence.toString(), j15, fjVar4, fjVar3, null, true, arrayList7, null, null, z18, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z18 = z18;
                                    b11.Q = l13 == null ? 0L : l13.longValue();
                                    b11.R = j14;
                                    org.telegram.messenger.zy.C(yo0Var.a).r0(b11);
                                }
                                boolean z20 = z18;
                                int q02 = org.telegram.messenger.zy.C(yo0Var.a).q0(yo0Var.J1, j15, !yo0Var.E2, false, z20, 0, 0, fjVar4, i19, l13 == null ? 0L : l13.longValue(), j14, null);
                                if (q02 != 0) {
                                    arrayList6.add(Long.valueOf(j15));
                                }
                                if (hVar2.m() == 1) {
                                    b5.q0(q02, yo0Var.b2, r11);
                                    if (q02 != 0) {
                                        z17 = z19;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i23 = i22 + 1;
                                arrayList5 = arrayList3;
                                z16 = z20;
                                do0Var2 = do0Var3;
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
                                yo0Var.S0(hVar2, arrayList2.size(), hVar2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(0)) : tL_forumTopic, !z17);
                            }
                        } else {
                            boolean z21 = z16;
                            mo0 mo0Var2 = yo0Var.S1;
                            int i25 = mo0Var2 != null ? mo0Var2.e : 0;
                            if (yo0Var.B2 != null) {
                                int i26 = 0;
                                boolean z22 = false;
                                while (i26 < hVar2.m()) {
                                    long j16 = hVar2.j(i26);
                                    boolean E22 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j16);
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
                                        fjVar2 = null;
                                    } else {
                                        strArr = strArr2;
                                        fjVar2 = new org.telegram.messenger.fj(yo0Var.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (yo0Var.B2 != null) {
                                        if (do0Var2.getTag() != null && eo0Var3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            org.telegram.messenger.fj fjVar5 = fjVar2;
                                            fjVar2 = fjVar5;
                                            org.telegram.messenger.zy.C(yo0Var.a).r0(org.telegram.messenger.xy.b(charSequenceArr3[0].toString(), j16, null, fjVar5, null, true, null, null, null, z21, 0, 0, null, false));
                                        }
                                        b10 = org.telegram.messenger.xy.b(null, j16, fjVar2, fjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                        b10.I = yo0Var.B2;
                                    } else if (do0Var2.getTag() == null || eo0Var3.a.length() <= 0) {
                                        b10 = org.telegram.messenger.xy.b(strArr[i25], j16, fjVar2, fjVar2, null, true, null, null, null, z21, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z23 = z21;
                                        b10 = org.telegram.messenger.xy.b(charSequence2 == null ? null : charSequence2.toString(), j16, fjVar2, fjVar2, null, true, arrayList5, null, null, z23, 0, 0, null, false);
                                        z21 = z23;
                                    }
                                    b10.Q = l14 == null ? 0L : l14.longValue();
                                    b10.R = j13;
                                    org.telegram.messenger.zy.C(yo0Var.a).r0(b10);
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
                                    boolean E23 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j17);
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
                                        fjVar = null;
                                    } else {
                                        z12 = z24;
                                        c10 = 0;
                                        fjVar = new org.telegram.messenger.fj(yo0Var.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (do0Var2.getTag() == null || eo0Var3.a.length() <= 0) {
                                        eo0Var2 = eo0Var3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c10];
                                        boolean z25 = z21;
                                        org.telegram.messenger.xy b12 = org.telegram.messenger.xy.b(charSequence3 == null ? null : charSequence3.toString(), j17, fjVar, fjVar, null, true, arrayList5, null, null, z25, 0, 0, null, false);
                                        z21 = z25;
                                        if (l15 == null) {
                                            eo0Var2 = eo0Var3;
                                            longValue = 0;
                                        } else {
                                            eo0Var2 = eo0Var3;
                                            longValue = l15.longValue();
                                        }
                                        b12.Q = longValue;
                                        b12.R = j12;
                                        org.telegram.messenger.zy.C(yo0Var.a).r0(b12);
                                    }
                                    org.telegram.messenger.fj fjVar6 = fjVar;
                                    org.telegram.messenger.xy b13 = org.telegram.messenger.xy.b(strArr2[i25], j17, fjVar6, fjVar6, null, true, null, null, null, z21, 0, 0, null, false);
                                    b13.Q = l15 == null ? 0L : l15.longValue();
                                    b13.R = j12;
                                    org.telegram.messenger.zy.C(yo0Var.a).r0(b13);
                                    i27 = i21 + 1;
                                    eo0Var3 = eo0Var2;
                                    hashMap2 = hashMap;
                                    z24 = z12;
                                }
                                z11 = z24;
                            } else {
                                i20 = 0;
                                z11 = false;
                                yo0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                            }
                            i20 = 0;
                            yo0Var.S0(hVar2, 1, (TLRPC.TL_forumTopic) hashMap3.get(hVar2.n(i20)), !z11);
                        }
                        oo0 oo0Var = yo0Var.o2;
                        if (oo0Var != null) {
                            oo0Var.Q();
                        }
                        yo0Var.dismiss();
                    }
                });
                return;
            }
            if (b5.h(getContext(), this.a, hVar.j(i11), do0Var.getTag() != null && eo0Var.a.length() > 0)) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void Y0(boolean z10) {
        do0 do0Var = this.n1;
        if (z10 == (do0Var.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        do0Var.setTag(z10 ? 1 : null);
        eo0 eo0Var = this.o1;
        if (eo0Var.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(eo0Var.getEditText());
        }
        eo0Var.k(true);
        FrameLayout frameLayout = this.Y1;
        do0 do0Var2 = this.q1;
        FrameLayout frameLayout2 = this.r1;
        if (z10) {
            do0Var.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            do0Var2.setVisibility(0);
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
        arrayList.add(ObjectAnimator.ofFloat(do0Var, (Property<do0, Float>) property, z10 ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z10 ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(do0Var2, (Property<do0, Float>) View.SCALE_X, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(do0Var2, (Property<do0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(do0Var2, (Property<do0, Float>) property, z10 ? 1.0f : 0.0f));
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
        this.z1.addListener(new jo0(this, z10, 1));
        this.z1.start();
    }

    public final void Z0(long j3, View view) {
        int i7 = -this.D2;
        this.D2 = i7;
        org.telegram.messenger.g0.E3(i7, view, null);
        org.telegram.messenger.q2.E.a();
        String q10 = j3 >= 0 ? org.telegram.messenger.o10.q(org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(j3))) : "";
        boolean K3 = org.telegram.messenger.mp.u1(this.a).K3();
        int i10 = 1;
        FrameLayout frameLayout = this.w1;
        (K3 ? new lc(frameLayout, this.J0).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, q10))) : new lc(frameLayout, this.J0).K(R.raw.star_premium_2, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743523, q10)), org.telegram.messenger.gd.M0(2131743522, null), new vn0(this, i10))).j();
    }

    public final void a1() {
        org.telegram.ui.ActionBar.j1 j1Var;
        do0 do0Var = this.n1;
        if (do0Var == null) {
            return;
        }
        eo0 eo0Var = this.o1;
        if (eo0Var == null || !eo0Var.m()) {
            lo0 lo0Var = this.z2;
            if (lo0Var != null && (j1Var = lo0Var.I) != null && !j1Var.f) {
                org.telegram.messenger.g0.L(20.0f);
            }
        } else {
            eo0Var.getEmojiPaddingShown();
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
        do0Var.setTranslationY(f11);
        this.q1.setTranslationY(f11);
    }

    public final void b1() {
        org.telegram.ui.ActionBar.n5 n5Var = this.v1;
        if (n5Var != null) {
            String P0 = P0();
            if (P0.startsWith("https://")) {
                P0 = P0.substring(8);
            } else if (P0.startsWith("http://")) {
                P0 = P0.substring(7);
            }
            n5Var.l(P0, false);
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
        eo0 eo0Var = this.o1;
        if (tag != null && eo0Var.a.length() > 0) {
            size++;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = ((TLRPC.Dialog) hVar.n(i10)).id;
            long P1 = org.telegram.messenger.mp.u1(this.a).P1(j10);
            if (P1 <= 0) {
                P1 = org.telegram.messenger.n5.k(org.telegram.messenger.mp.u1(this.a).P2(j10));
            }
            j3 += P1;
        }
        int max = Math.max(1, hVar.m());
        boolean z10 = i7 != 0;
        oi.u1 u1Var = this.p1;
        u1Var.e(max, z10);
        u1Var.i(size, j3, i7 != 0);
        Y0(true);
        eo0Var.setPadding(0, 0, Math.max(org.telegram.messenger.g0.L(84.0f), u1Var.l()), 0);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.s;
        if (i7 == i11) {
            ro0 ro0Var = this.G1;
            if (ro0Var != null) {
                ro0Var.E();
            }
            org.telegram.messenger.ks.f(this.a).n(this, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        eo0 eo0Var = this.o1;
        if (eo0Var != null) {
            org.telegram.messenger.g0.v1(eo0Var.getEditText());
        }
        this.U1 = false;
        super.dismiss();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.s);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void onBackPressed() {
        if (this.y2 != null) {
            M0();
            return;
        }
        eo0 eo0Var = this.o1;
        if (eo0Var == null || !eo0Var.e) {
            super.onBackPressed();
        } else {
            eo0Var.k(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            ui.c cVar = this.L2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.c;
            if (n2Var != null) {
                boolean z10 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.J0)) > 0.721f;
                if (z10 != this.T2) {
                    this.T2 = z10;
                    org.telegram.messenger.g0.n3(n2Var, z10);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public yo0(Context context, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        this(context, null, arrayList, str, str2, z10, str3, str4, false, z11, false, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:135:0x07e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yo0(Context context, org.telegram.ui.bn bnVar, ArrayList arrayList, String str, String str2, boolean z10, String str3, String str4, boolean z11, boolean z12, boolean z13, Integer num, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        int i7;
        float f10;
        ao0 ao0Var;
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
        ui.c d = this.Y0.d(new un0(this, i14));
        this.L2 = d;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f()) {
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
            int L = org.telegram.messenger.pc.e(262144) ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(48.0f);
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
        this.J0 = i6Var;
        this.V1 = z13;
        this.c2 = org.telegram.messenger.g0.W(context);
        this.d2 = z12;
        if (z12) {
            this.J0 = new fi.h0(i12);
        }
        d.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0));
        this.b2 = bnVar;
        Drawable g10 = i5.c.g(context, R.drawable.sheet_shadow_round);
        this.N1 = g10;
        int i17 = org.telegram.ui.ActionBar.n6.h5;
        this.b0 = i17;
        g10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i17, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z11;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(0);
            String r10 = org.telegram.messenger.n5.r(org.telegram.messenger.mp.u1(this.a).g2(org.telegram.messenger.fj.B0(fjVar.k)));
            if (!TextUtils.isEmpty(r10)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.mp.u1(this.a).X2, "/", r10, "/");
                sb2.append(fjVar.e1());
                strArr2[0] = sb2.toString();
                if (arrayList.size() == 1 && fjVar.z2()) {
                    strArr2[0] = a8.p0.s(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.J1 = arrayList;
        this.I1 = new vo0(this, context);
        this.j2 = z10;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new org.telegram.ui.h0(this, i11);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.J1.get(i18);
                if (fjVar2.D4()) {
                    this.L1 = 3;
                } else if (fjVar2.T3()) {
                    int i19 = fjVar2.Z3() ? 2 : 1;
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
            tL_channels_exportMessageLink.id = ((org.telegram.messenger.fj) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = org.telegram.messenger.mp.u1(this.a).j1(((org.telegram.messenger.fj) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new org.telegram.ui.u7(i20, this, context));
        }
        lo0 lo0Var = new lo0(this, context);
        this.z2 = lo0Var;
        this.b = lo0Var;
        lo0Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i21 = this.u0;
        viewGroup.setPadding(i21, 0, i21, this.C2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m1 = frameLayout;
        frameLayout.setBackground(new org.telegram.ui.ActionBar.w2(this));
        if (this.d2 && this.k2[1] != null) {
            mo0 mo0Var = new mo0(this, context);
            this.S1 = mo0Var;
            frameLayout.addView(mo0Var, c8.ma.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        c10 c10Var = new c10(context, this.J0);
        this.u2 = c10Var;
        fo0 fo0Var = new fo0(this, i11);
        ah.i iVar = c10Var.r;
        iVar.addTextChangedListener(fo0Var);
        iVar.setHint(org.telegram.messenger.gd.M0(2131745245, null));
        iVar.setOnEditorActionListener(new g(this, 8));
        c10Var.setCloseButtonOnClickListener(new vn0(this, i13));
        frameLayout.addView(c10Var, c8.ma.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.v2 = kVar;
        kVar.setOccupyStatusBar(false);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i22 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.l(kVar, 5, i22, this.J0);
        org.telegram.ui.ActionBar.u6.l(kVar, 6, org.telegram.ui.ActionBar.n6.q5, this.J0);
        org.telegram.ui.ActionBar.u6.l(kVar, 1, org.telegram.ui.ActionBar.n6.z6, null);
        org.telegram.ui.ActionBar.u6.l(kVar, 3, org.telegram.ui.ActionBar.n6.u8, null);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 20));
        kVar.setVisibility(8);
        frameLayout.addView(kVar, c8.ma.e(-1, 58, 83));
        ck0 ck0Var = new ck0(context, this.J0);
        this.A1 = ck0Var;
        v4.t tVar = new v4.t(4);
        this.E1 = tVar;
        ck0Var.setLayoutManager(tVar);
        tVar.O = new bo0(this, i12);
        ck0Var.setOnScrollListener(new co0(this, i12));
        wo0 wo0Var = new wo0(this, context);
        this.H1 = wo0Var;
        ck0Var.setAdapter(wo0Var);
        int i23 = org.telegram.ui.ActionBar.n6.A5;
        org.telegram.ui.ActionBar.u6.l(ck0Var, 21, i23, this.J0);
        ck0Var.setVerticalScrollBarEnabled(false);
        ck0Var.setHorizontalScrollBarEnabled(false);
        ck0Var.setOverScrollMode(2);
        ck0Var.setSelectorDrawableColor(0);
        int i24 = 11;
        ck0Var.setItemSelectorColorProvider(new wb0(i24));
        ck0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ck0Var.setClipToPadding(false);
        ck0Var.i(new fi.k(9));
        ck0Var.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.wn0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.oj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i13) {
                    case 0:
                        yo0 yo0Var = this.b;
                        c10 c10Var2 = yo0Var.u2;
                        HashMap hashMap = yo0Var.R1;
                        a0.h hVar = yo0Var.Q1;
                        ro0 ro0Var = yo0Var.G1;
                        wo0 wo0Var2 = yo0Var.H1;
                        if (wo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = yo0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var.e.f(dialog2.id)) == null) {
                                        ro0Var.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ro0Var.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ro0Var.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < yo0Var.Q0().getChildCount(); i26++) {
                                    View childAt = yo0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = wo0Var2.E(i25);
                            if (E != null && (dialog = yo0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = yo0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var.e.f(dialog3.id)) == null) {
                                        ro0Var.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ro0Var.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ro0Var.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < yo0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = yo0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            yo0 yo0Var2 = this.b;
                            ArrayList arrayList4 = yo0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                yo0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            yo0 yo0Var3 = this.b;
                            vo0 vo0Var = yo0Var3.I1;
                            yo0 yo0Var4 = vo0Var.L;
                            int i29 = vo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < vo0Var.d.size()) {
                                        dialog5 = ((no0) vo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - vo0Var.d.size();
                                        ArrayList arrayList5 = vo0Var.e.d;
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
                                    yo0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < yo0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) yo0Var4.A2.get(i31)).a;
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
        ck0Var.setVisibility(8);
        this.b.addView(ck0Var, c8.ma.e(-1, -1, 51));
        ao0 ao0Var2 = new ao0(this, context, this.J0, i13);
        this.B1 = ao0Var2;
        ao0Var2.setSelectorDrawableColor(0);
        ao0Var2.setItemSelectorColorProvider(new wb0(i24));
        ao0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ao0Var2.setClipToPadding(false);
        getContext();
        v4.t tVar2 = new v4.t(4);
        this.D1 = tVar2;
        ao0Var2.setLayoutManager(tVar2);
        this.P2 = new ih(this, i12);
        tVar2.O = new bo0(this, i13);
        ao0Var2.setHorizontalScrollBarEnabled(false);
        ao0Var2.setVerticalScrollBarEnabled(false);
        ao0Var2.setOverScrollMode(2);
        ao0Var2.i(new fi.k(10));
        this.b.addView(ao0Var2, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ro0 ro0Var = new ro0(this, context);
        this.G1 = ro0Var;
        ao0Var2.setAdapter(ro0Var);
        org.telegram.ui.ActionBar.u6.l(ao0Var2, 21, i23, this.J0);
        ao0Var2.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.wn0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.oj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i11) {
                    case 0:
                        yo0 yo0Var = this.b;
                        c10 c10Var2 = yo0Var.u2;
                        HashMap hashMap = yo0Var.R1;
                        a0.h hVar = yo0Var.Q1;
                        ro0 ro0Var2 = yo0Var.G1;
                        wo0 wo0Var2 = yo0Var.H1;
                        if (wo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = yo0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var2.e.f(dialog2.id)) == null) {
                                        ro0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ro0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ro0Var2.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < yo0Var.Q0().getChildCount(); i26++) {
                                    View childAt = yo0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = wo0Var2.E(i25);
                            if (E != null && (dialog = yo0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = yo0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var2.e.f(dialog3.id)) == null) {
                                        ro0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ro0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ro0Var2.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < yo0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = yo0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            yo0 yo0Var2 = this.b;
                            ArrayList arrayList4 = yo0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                yo0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            yo0 yo0Var3 = this.b;
                            vo0 vo0Var = yo0Var3.I1;
                            yo0 yo0Var4 = vo0Var.L;
                            int i29 = vo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < vo0Var.d.size()) {
                                        dialog5 = ((no0) vo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - vo0Var.d.size();
                                        ArrayList arrayList5 = vo0Var.e.d;
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
                                    yo0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < yo0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) yo0Var4.A2.get(i31)).a;
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
        ao0Var2.setOnScrollListener(new co0(this, i13));
        this.Y0.b(ao0Var2);
        ao0 ao0Var3 = new ao0(this, context, this.J0, i11);
        this.C1 = ao0Var3;
        ao0Var3.setItemSelectorColorProvider(new wb0(i24));
        ao0Var3.setSelectorDrawableColor(0);
        ao0Var3.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
        ao0Var3.setClipToPadding(false);
        getContext();
        vy vyVar = new vy(4, 0, ao0Var3);
        this.F1 = vyVar;
        ao0Var3.setLayoutManager(vyVar);
        vyVar.O = new bo0(this, i11);
        ao0Var3.setOnItemClickListener(new oj0(this) { // from class: org.telegram.ui.Components.wn0
            public final /* synthetic */ yo0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
            @Override // org.telegram.ui.Components.oj0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(int i25, View view) {
                TLRPC.Dialog dialog;
                TLRPC.Dialog tL_dialog;
                switch (i12) {
                    case 0:
                        yo0 yo0Var = this.b;
                        c10 c10Var2 = yo0Var.u2;
                        HashMap hashMap = yo0Var.R1;
                        a0.h hVar = yo0Var.Q1;
                        ro0 ro0Var2 = yo0Var.G1;
                        wo0 wo0Var2 = yo0Var.H1;
                        if (wo0Var2.d && i25 == 1) {
                            TLRPC.Dialog dialog2 = yo0Var.y2;
                            if (dialog2 != null) {
                                hVar.k(dialog2, dialog2.id);
                                hashMap.remove(dialog2);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var2.e.f(dialog2.id)) == null) {
                                        ro0Var2.e.k(dialog2, dialog2.id);
                                        ArrayList arrayList2 = ro0Var2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog2);
                                    }
                                    ro0Var2.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i26 = 0; i26 < yo0Var.Q0().getChildCount(); i26++) {
                                    View childAt = yo0Var.Q0().getChildAt(i26);
                                    if (childAt instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) childAt;
                                        if (e7Var.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var.d(null, false, true);
                                            e7Var.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = wo0Var2.E(i25);
                            if (E != null && (dialog = yo0Var.y2) != null) {
                                long j3 = dialog.id;
                                boolean E2 = org.telegram.messenger.mp.u1(yo0Var.a).E2(j3);
                                TLRPC.Dialog dialog3 = yo0Var.y2;
                                hVar.k(dialog3, j3);
                                hashMap.put(dialog3, E);
                                yo0Var.c1(2);
                                if (yo0Var.H2 || yo0Var.I2) {
                                    if (((TLRPC.Dialog) ro0Var2.e.f(dialog3.id)) == null) {
                                        ro0Var2.e.k(dialog3, dialog3.id);
                                        ArrayList arrayList3 = ro0Var2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    ro0Var2.f();
                                    yo0Var.w2 = false;
                                    c10Var2.r.setText("");
                                    yo0Var.L0(false);
                                }
                                for (int i27 = 0; i27 < yo0Var.Q0().getChildCount(); i27++) {
                                    View childAt2 = yo0Var.Q0().getChildAt(i27);
                                    if (childAt2 instanceof org.telegram.ui.Cells.e7) {
                                        org.telegram.ui.Cells.e7 e7Var2 = (org.telegram.ui.Cells.e7) childAt2;
                                        if (e7Var2.getCurrentDialog() == yo0Var.y2.id) {
                                            e7Var2.d(E, E2, true);
                                            e7Var2.b(true, true);
                                        }
                                    }
                                }
                                yo0Var.M0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i25 >= 0) {
                            yo0 yo0Var2 = this.b;
                            ArrayList arrayList4 = yo0Var2.G1.d;
                            int i28 = i25 - 1;
                            TLRPC.Dialog dialog4 = (i28 < 0 || i28 >= arrayList4.size()) ? null : (TLRPC.Dialog) arrayList4.get(i28);
                            if (dialog4 != null) {
                                yo0Var2.V0(view, dialog4);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i25 >= 0) {
                            yo0 yo0Var3 = this.b;
                            vo0 vo0Var = yo0Var3.I1;
                            yo0 yo0Var4 = vo0Var.L;
                            int i29 = vo0Var.F;
                            TLRPC.Dialog dialog5 = null;
                            if (i25 < i29 || i29 < 0) {
                                int i30 = i25 - 1;
                                if (i30 >= 0) {
                                    if (i30 < vo0Var.d.size()) {
                                        dialog5 = ((no0) vo0Var.d.get(i30)).a;
                                    } else {
                                        int size2 = i30 - vo0Var.d.size();
                                        ArrayList arrayList5 = vo0Var.e.d;
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
                                    yo0Var3.V0(view, dialog5);
                                    break;
                                }
                            } else {
                                int i31 = i25 - i29;
                                if (i31 >= 0 && i31 < yo0Var4.A2.size()) {
                                    TLObject tLObject2 = ((jg.g0) yo0Var4.A2.get(i31)).a;
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
        ao0Var3.setHasFixedSize(true);
        ao0Var3.setItemAnimator(null);
        ao0Var3.setHorizontalScrollBarEnabled(false);
        ao0Var3.setVerticalScrollBarEnabled(false);
        ao0Var3.setOnScrollListener(new co0(this, i11));
        ao0Var3.i(new fi.k(i24));
        ao0Var3.setAdapter(this.I1);
        org.telegram.ui.ActionBar.u6.l(ao0Var3, 21, i23, this.J0);
        this.t2 = new fj0(ao0Var3, true);
        wz wzVar = new wz(context, this.J0);
        wzVar.setViewType(12);
        kv0 kv0Var = new kv0(context, wzVar, 1, this.J0);
        this.M1 = kv0Var;
        kv0Var.addView(wzVar, 0);
        kv0Var.setAnimateLayoutChange(true);
        kv0Var.e(false, false);
        boolean z14 = this.d2;
        xh.l lVar = kv0Var.d;
        if (z14) {
            org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.eh, this.J0);
        }
        lVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
        ao0Var3.setEmptyView(kv0Var);
        ao0Var3.setHideIfEmpty(false);
        ao0Var3.X1 = true;
        ao0Var3.Y1 = 0;
        this.b.addView(kv0Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(ao0Var3, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        bi.i3 i3Var = new bi.i3(23, context, this);
        this.t1 = i3Var;
        this.b.addView(i3Var, c8.ma.e(-1, org.telegram.messenger.ks.X4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L((!this.d2 || this.k2[1] == null) ? 58.0f : 111.0f);
        this.O1[0] = new View(context);
        View view = this.O1[0];
        int i25 = org.telegram.ui.ActionBar.n6.V5;
        org.telegram.ui.ActionBar.u6.h(i25, view, this.J0);
        this.O1[0].setAlpha(0.0f);
        this.O1[0].setTag(1);
        this.b.addView(this.O1[0], layoutParams);
        this.b.addView(frameLayout, c8.ma.e(-1, (!this.d2 || this.k2[1] == null) ? 58 : org.telegram.messenger.ks.w1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        this.O1[1] = new View(context);
        org.telegram.ui.ActionBar.u6.h(i25, this.O1[1], this.J0);
        this.O1[1].setLayoutParams(layoutParams2);
        if (!this.j2 && this.k2[0] == null) {
            this.O1[1].setAlpha(0.0f);
            ao0Var = ao0Var3;
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
                frameLayout2.addView(frameLayout3, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                c8.ra.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new tn0(this, 4));
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
                this.v1 = n5Var;
                n5Var.setTextSize(15);
                org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.Kl, this.J0);
                n5Var.setEllipsizeByGradient(true);
                b1();
                linearLayout3.addView(n5Var, c8.ma.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, this.J0);
                textView.setText(org.telegram.messenger.gd.M0(2131751756, null).toUpperCase());
                textView.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(17);
                int i26 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i26, this.J0), 4, 4);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i26);
                org.telegram.ui.ActionBar.i6 i6Var2 = this.J0;
                textView.setBackground(a02);
                ao0Var = ao0Var3;
                org.telegram.ui.ActionBar.u6.j(textView, a02, null, M, i6Var2);
                linearLayout3.addView(textView, c8.ma.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new tn0(this, 5));
                c8.ra.a(textView);
                this.b.addView(frameLayout2, c8.ma.e(-1, 58, 83));
                ArrayList arrayList2 = this.J1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((org.telegram.messenger.fj) this.J1.get(0)).k != null && ((org.telegram.messenger.fj) this.J1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) this.J1.get(0);
                    if (org.telegram.messenger.v3.N(org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-org.telegram.messenger.fj.B0(fjVar3.k)))) && !org.telegram.messenger.fj.l3(fjVar3.k)) {
                        final int i27 = 0;
                        linearLayout = org.telegram.messenger.f3.g(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zn0
                            public final /* synthetic */ yo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i27) {
                                    case 0:
                                        yo0 yo0Var = this.b;
                                        org.telegram.ui.ActionBar.h2 h2Var = yo0Var.b2;
                                        if (h2Var == null) {
                                            h2Var = LaunchActivity.T();
                                        }
                                        if (h2Var != null) {
                                            yo0Var.dismiss();
                                            h2Var.presentFragment(new org.telegram.ui.og0(fjVar3));
                                            break;
                                        }
                                        break;
                                    default:
                                        yo0 yo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.h2 h2Var2 = yo0Var2.b2;
                                        if (h2Var2 == null) {
                                            h2Var2 = LaunchActivity.T();
                                        }
                                        if (h2Var2 != null) {
                                            yo0Var2.dismiss();
                                            h2Var2.presentFragment(new org.telegram.ui.og0(fjVar3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f));
                        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i26, this.J0), 6, 6);
                        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i26);
                        org.telegram.ui.ActionBar.i6 i6Var3 = this.J0;
                        linearLayout.setBackground(a03);
                        org.telegram.ui.ActionBar.u6.j(linearLayout, a03, null, M2, i6Var3);
                        c8.ra.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i28 = org.telegram.ui.ActionBar.n6.Ml;
                        org.telegram.ui.ActionBar.u6.s(imageView, i28, this.J0, PorterDuff.Mode.SRC_IN);
                        linearLayout.addView(imageView, c8.ma.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        org.telegram.ui.ActionBar.u6.U(textView2, i28, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.gd.E(fjVar3.k.forwards, ','));
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
                ao0Var = ao0Var3;
                f11 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.r1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.u1 = frameLayout5;
                frameLayout4.addView(frameLayout5, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i29 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.Cells.y a04 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i29, this.J0), 20, 20);
                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i29);
                org.telegram.ui.ActionBar.i6 i6Var4 = this.J0;
                textView3.setBackground(a04);
                org.telegram.ui.ActionBar.u6.j(textView3, a04, null, M3, i6Var4);
                org.telegram.ui.ActionBar.u6.U(textView3, this.d2 ? org.telegram.ui.ActionBar.n6.gh : org.telegram.ui.ActionBar.n6.n5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setGravity(17);
                if (this.d2 && this.k2[1] != null) {
                    textView3.setText(org.telegram.messenger.gd.M0(2131743150, null).toUpperCase());
                } else {
                    textView3.setText(org.telegram.messenger.gd.L0(2131751751).toUpperCase());
                }
                textView3.setOnClickListener(new tn0(this, 6));
                frameLayout5.addView(textView3, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
                this.b.addView(frameLayout4, c8.ma.e(-1, 58, 87));
                ArrayList arrayList3 = this.J1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((org.telegram.messenger.fj) this.J1.get(0)).k != null && ((org.telegram.messenger.fj) this.J1.get(0)).k.forwards > 0) {
                    final org.telegram.messenger.fj fjVar4 = (org.telegram.messenger.fj) this.J1.get(0);
                    if (org.telegram.messenger.v3.N(org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-fjVar4.A0()))) && !fjVar4.j3()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.y1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        org.telegram.ui.ActionBar.u6.Q(linearLayout4, org.telegram.ui.ActionBar.n6.a0(W(this.d2 ? org.telegram.ui.ActionBar.n6.Vg : i29), 20, 20), null, org.telegram.ui.ActionBar.u6.M(this.d2 ? org.telegram.ui.ActionBar.n6.Vg : i29), this.J0);
                        frameLayout5.addView(linearLayout4, c8.ma.e(-2, -1, 21));
                        final int i30 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zn0
                            public final /* synthetic */ yo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i30) {
                                    case 0:
                                        yo0 yo0Var = this.b;
                                        org.telegram.ui.ActionBar.h2 h2Var = yo0Var.b2;
                                        if (h2Var == null) {
                                            h2Var = LaunchActivity.T();
                                        }
                                        if (h2Var != null) {
                                            yo0Var.dismiss();
                                            h2Var.presentFragment(new org.telegram.ui.og0(fjVar4));
                                            break;
                                        }
                                        break;
                                    default:
                                        yo0 yo0Var2 = this.b;
                                        org.telegram.ui.ActionBar.h2 h2Var2 = yo0Var2.b2;
                                        if (h2Var2 == null) {
                                            h2Var2 = LaunchActivity.T();
                                        }
                                        if (h2Var2 != null) {
                                            yo0Var2.dismiss();
                                            h2Var2.presentFragment(new org.telegram.ui.og0(fjVar4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        org.telegram.ui.ActionBar.u6.s(imageView2, this.d2 ? org.telegram.ui.ActionBar.n6.gh : org.telegram.ui.ActionBar.n6.n5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, c8.ma.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(fjVar4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textView4, this.d2 ? org.telegram.ui.ActionBar.n6.gh : org.telegram.ui.ActionBar.n6.n5, this.J0);
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
        do0 do0Var = new do0(this, context, 0);
        this.n1 = do0Var;
        do0Var.setWillNotDraw(false);
        do0Var.setAlpha(0.0f);
        do0Var.setVisibility(4);
        this.b.addView(do0Var, c8.ma.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        do0Var.setOnTouchListener(new gi.a(23));
        org.telegram.ui.ActionBar.n2 n2Var = this.c;
        boolean z15 = org.telegram.messenger.g0.B(W(org.telegram.ui.ActionBar.n6.h5)) > 0.721f;
        this.T2 = z15;
        org.telegram.messenger.g0.n3(n2Var, z15);
        eo0 eo0Var = new eo0(this, context, lo0Var, this.J0);
        this.o1 = eo0Var;
        eo0Var.K = true;
        if (this.d2) {
            mt editText = eo0Var.getEditText();
            int i31 = org.telegram.ui.ActionBar.n6.eh;
            editText.setTextColor(W(i31));
            eo0Var.getEditText().setCursorColor(W(i31));
        }
        eo0Var.setHint(org.telegram.messenger.gd.L0(2131745267));
        eo0Var.s();
        eo0Var.setPadding(0, 0, org.telegram.messenger.g0.L(84.0f), 0);
        do0Var.addView(eo0Var, c8.ma.e(-1, -2, 51));
        do0Var.setClipChildren(false);
        do0Var.setClipToPadding(false);
        eo0Var.setClipChildren(false);
        eo0Var.getEditText().addTextChangedListener(new fo0(this, 0));
        do0 do0Var2 = new do0(this, context, 1);
        this.q1 = do0Var2;
        do0Var2.setFocusable(true);
        do0Var2.setFocusableInTouchMode(true);
        do0Var2.setVisibility(4);
        do0Var2.setScaleX(0.2f);
        do0Var2.setScaleY(0.2f);
        do0Var2.setAlpha(0.0f);
        this.b.addView(do0Var2, c8.ma.e(org.telegram.messenger.ks.v1, 50, 85));
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
        u1Var.s0 = true;
        do0Var2.addView(u1Var, c8.ma.g());
        u1Var.setOnClickListener(new tn0(this, 0));
        u1Var.setOnLongClickListener(new o00(this, 2));
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
            int i32 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.ActionBar.u6.Q(linearLayout5, org.telegram.ui.ActionBar.n6.a0(W(i32), 6, 6), null, org.telegram.ui.ActionBar.u6.M(i32), this.J0);
            mp mpVar = new mp(24, context, this.J0);
            this.a2 = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
            mpVar.setDrawUnchecked(true);
            mpVar.a(false, false);
            mpVar.setDrawBackgroundAsArc(10);
            linearLayout5.addView(mpVar, c8.ma.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            org.telegram.ui.ActionBar.u6.U(textView5, i22, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(org.telegram.messenger.gd.Z(2131743344, org.telegram.messenger.g0.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, c8.ma.t(-2, -2, 16, 9, 0, 0, 0));
            c8.ra.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new tn0(this, 1));
            frameLayout8.addView(linearLayout5, c8.ma.e(-2, -2, 17));
            if (this.r1 == null) {
                View view2 = new View(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view2, this.J0);
                frameLayout8.addView(view2, c8.ma.a(-1.0f, this.d2 ? 0.66f : 1.0f / org.telegram.messenger.g0.p, 55));
            }
            this.b.addView(frameLayout8, c8.ma.e(-1, 58, 83));
            if (this.r1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        dh.d dVar = new dh.d(this.O2.b(i3Var, null));
        this.R2 = dVar;
        if (org.telegram.messenger.bz.f()) {
            org.telegram.messenger.pc.e(262144);
        }
        dVar.b(org.telegram.messenger.g0.L(72.0f), true);
        fh.g b10 = this.N2.b(this.z2, c8.i0.f(this.J0));
        this.Q2 = b10;
        b10.T = true;
        b10.s(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), 0.0f, 0.0f);
        b10.u(org.telegram.messenger.g0.L(32.0f));
        b10.R.g = 0.4f;
        b10.n();
        fh.g b11 = this.M2.b(do0Var, c8.i0.f(this.J0));
        this.S2 = b11;
        b11.r(org.telegram.messenger.g0.L(22.0f));
        b11.q(org.telegram.messenger.g0.L(f11));
        do0Var.setPadding(org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(7.0f));
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
        if (ro0Var.d.isEmpty()) {
            org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.s);
        }
        int i33 = this.a;
        int i34 = 0;
        org.telegram.messenger.tr.a0(i33).a.c(new jg.q(i33, i34, new go0(this), i34));
        org.telegram.messenger.ri.d0(this.a).P0(true);
        this.Y0.i(this.b);
        ri.q qVar2 = this.Y0;
        qVar2.a = new un0(this, i34);
        qVar2.d = new ti.b(org.telegram.messenger.g0.L(48.0f));
        org.telegram.messenger.g0.U3(1.0f, ao0Var2, true, false);
        org.telegram.messenger.g0.U3(1.0f, ao0Var, false, false);
        r0.i0.l(this.c, new un0(this, 1));
    }

    public void T0(View view) {
    }

    public void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
    }
}
