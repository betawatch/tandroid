package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public n50 J;
    public long K;
    public boolean L;
    public org.telegram.messenger.yc M;
    public boolean N;
    public boolean O;
    public int P;
    public final o4 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public b5.l d;
    public org.telegram.ui.Components.da e;
    public TextView f;
    public GradientDrawable h;
    public fi.j n;
    public FrameLayout r;
    public ai.c0 s;
    public org.telegram.ui.Components.ch0 w;
    public int x;
    public boolean y;

    public o50() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = org.telegram.messenger.h10.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new o4(this, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z() {
        String str;
        int i3;
        org.telegram.messenger.yc ycVar;
        int i10;
        org.telegram.messenger.yc ycVar2;
        o50 o50Var;
        org.telegram.messenger.yc ycVar3 = org.telegram.messenger.bd.E0().B;
        int i11 = this.c;
        String str2 = org.telegram.messenger.hp.s1(i11).P3;
        if ((str2 == null || (str2.equals("en") && org.telegram.messenger.bd.E0().z.getLanguage() != null && !org.telegram.messenger.bd.E0().z.getLanguage().equals("en"))) && (str2 = org.telegram.messenger.bd.E0().z.getLanguage()) == null) {
            str2 = "en";
        }
        String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
        if (str3 != null) {
            str = "fil";
            i3 = i11;
            ycVar = ycVar3;
            switch (str3) {
                case "he":
                    str = "iw";
                    break;
                case "id":
                    str = "in";
                    break;
                case "in":
                    str = "id";
                    break;
                case "iw":
                    str = "he";
                    break;
                case "ji":
                    str = "yi";
                    break;
                case "jv":
                    str = "jw";
                    break;
                case "jw":
                    str = "jv";
                    break;
                case "nb":
                    str = "no";
                    break;
                case "no":
                    str = "nb";
                    break;
                case "yi":
                    str = "ji";
                    break;
                case "fil":
                    str = "tl";
                    break;
            }
            ycVar2 = null;
            org.telegram.messenger.yc ycVar4 = null;
            for (i10 = 0; i10 < org.telegram.messenger.bd.E0().J.size(); i10++) {
                org.telegram.messenger.yc ycVar5 = (org.telegram.messenger.yc) org.telegram.messenger.bd.E0().J.get(i10);
                if (ycVar5.c.equals("en")) {
                    ycVar2 = ycVar5;
                }
                if (ycVar5.c.replace("_", "-").equals(str2) || ycVar5.c.equals(str3) || ycVar5.c.equals(str)) {
                    ycVar4 = ycVar5;
                }
                if (ycVar2 != null && ycVar4 != null) {
                    org.telegram.messenger.yc ycVar6 = ycVar4;
                    if (ycVar2 != null || ycVar6 == null || ycVar2 == ycVar6) {
                    }
                    TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                    if (ycVar6 != ycVar) {
                        tL_langpack_getStrings.lang_code = ycVar6.c();
                        o50Var = this;
                        o50Var.M = ycVar6;
                    } else {
                        o50Var = this;
                        tL_langpack_getStrings.lang_code = ycVar2.c();
                        o50Var.M = ycVar2;
                    }
                    tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
                    ConnectionsManager.getInstance(i3).sendRequest(tL_langpack_getStrings, new xy(4, o50Var, str2), 8);
                    return;
                }
            }
            org.telegram.messenger.yc ycVar62 = ycVar4;
            if (ycVar2 != null) {
            }
        }
        ycVar = ycVar3;
        i3 = i11;
        str = null;
        ycVar2 = null;
        org.telegram.messenger.yc ycVar42 = null;
        while (i10 < org.telegram.messenger.bd.E0().J.size()) {
        }
        org.telegram.messenger.yc ycVar622 = ycVar42;
        if (ycVar2 != null) {
        }
    }

    public final void a0(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        gradientDrawable.setColors(new int[]{getThemedColor(i3), getThemedColor(org.telegram.ui.ActionBar.k6.Di)});
        this.F.setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        fi.j jVar = this.n;
        int L = org.telegram.messenger.g0.L(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
        jVar.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, x02, x02));
        this.w.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i3, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (!z10) {
            Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            return;
        }
        n50 n50Var = this.J;
        if (n50Var != null) {
            n50Var.postRunnable(new fz(this, 10));
        }
        for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
            View childAt = this.d.getChildAt(i11);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i12 = org.telegram.ui.ActionBar.k6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        Drawable g7 = k2.p1.g(context, R.drawable.telegram_logo);
        this.F = g7;
        final int i3 = 0;
        g7.setBounds(0, org.telegram.messenger.g0.L(8.666f), org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131747756, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        final int i10 = 1;
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(fh0Var, b8.mf.e(28, 28, 17));
        ai.c0 c0Var = new ai.c0(this, context, frameLayout, 23);
        this.s = c0Var;
        scrollView.addView(c0Var, b8.mf.x(-1, -2, 51));
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.w = ch0Var;
        ch0Var.h = true;
        ch0Var.a0 = true;
        ch0Var.o();
        this.w.P(org.telegram.ui.ActionBar.k6.D0().q() ? this.w.e[0] - 1 : 0);
        this.w.N(org.telegram.ui.ActionBar.k6.D0().q() ? this.w.e[0] - 1 : 0, false, false);
        fh0Var.setContentDescription(org.telegram.messenger.bd.M0(org.telegram.ui.ActionBar.k6.D0().q() ? 2131754751 : 2131754750, null));
        fh0Var.setAnimation(this.w);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.ux0(24, this, fh0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, b8.mf.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, b8.mf.e(org.telegram.messenger.hs.e3, org.telegram.messenger.hs.g2, 17));
        textureView.setSurfaceTextureListener(new m50(this, i3));
        b5.l lVar = new b5.l(context);
        this.d = lVar;
        lVar.setAdapter(new org.telegram.ui.Components.w10(this, 2));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, b8.mf.c(-1.0f, -1));
        this.d.b(new l2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        fi.j jVar = new fi.j(this, context);
        this.n = jVar;
        b8.pf.b(jVar, 0.02f, 1.2f);
        this.n.setText(org.telegram.messenger.bd.M0(2131744921, null));
        this.n.setGravity(17);
        this.n.setTypeface(org.telegram.messenger.g0.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.s.addView(this.n, b8.mf.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.l50
            public final /* synthetic */ o50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        o50 o50Var = this.b;
                        if (!o50Var.E) {
                            o50Var.E = true;
                            o50Var.presentFragment(new xd0(), true);
                            o50Var.N = true;
                            break;
                        }
                        break;
                    default:
                        o50 o50Var2 = this.b;
                        if (!o50Var2.E && o50Var2.M != null) {
                            o50Var2.E = true;
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, view.getContext(), null);
                            s1Var.j0 = false;
                            s1Var.r(1000L);
                            org.telegram.messenger.hs.e().b(new org.telegram.messenger.gs(o50Var2, s1Var, 1), org.telegram.messenger.hs.x4);
                            org.telegram.messenger.bd.E0().d(o50Var2.M, true, false, o50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(context, this.d, 6);
        this.e = daVar;
        this.s.addView(daVar, b8.mf.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, b8.mf.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.l50
            public final /* synthetic */ o50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o50 o50Var = this.b;
                        if (!o50Var.E) {
                            o50Var.E = true;
                            o50Var.presentFragment(new xd0(), true);
                            o50Var.N = true;
                            break;
                        }
                        break;
                    default:
                        o50 o50Var2 = this.b;
                        if (!o50Var2.E && o50Var2.M != null) {
                            o50Var2.E = true;
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, view.getContext(), null);
                            s1Var.j0 = false;
                            s1Var.r(1000L);
                            org.telegram.messenger.hs.e().b(new org.telegram.messenger.gs(o50Var2, s1Var, 1), org.telegram.messenger.hs.x4);
                            org.telegram.messenger.bd.E0().d(o50Var2.M, true, false, o50Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.s.addView(frameLayout, b8.mf.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.y4);
        int i11 = this.c;
        org.telegram.messenger.hs.f(i11).c(this, org.telegram.messenger.hs.J2);
        ConnectionsManager.getInstance(i11).updateDcSettings();
        org.telegram.messenger.bd.E0().V0(i11, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.y4 || i3 == org.telegram.messenger.hs.J2) {
            Z();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return b8.qf.a(new h6(10, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.O) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hp.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, org.telegram.messenger.bd.M0(2131747754, null), org.telegram.messenger.bd.M0(2131747752, null), org.telegram.messenger.bd.M0(2131747748, null), org.telegram.messenger.bd.M0(2131747750, null), org.telegram.messenger.bd.M0(2131747746, null)};
        this.H = new String[]{org.telegram.messenger.bd.M0(2131747757, null), org.telegram.messenger.bd.M0(2131747755, null), org.telegram.messenger.bd.M0(2131747753, null), org.telegram.messenger.bd.M0(2131747749, null), org.telegram.messenger.bd.M0(2131747751, null), org.telegram.messenger.bd.M0(2131747747, null)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        org.telegram.messenger.g0.r(this.Q);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.y4);
        org.telegram.messenger.hs.f(this.c).n(this, org.telegram.messenger.hs.J2);
        org.telegram.messenger.hp.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.Q3(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (this.y) {
            if (org.telegram.messenger.bd.a0) {
                this.d.setCurrentItem(6);
                this.x = 6;
            } else {
                this.d.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        org.telegram.messenger.g0.g2(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        o4 o4Var = this.Q;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int themedColor = getThemedColor(i3);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Di);
            GradientDrawable gradientDrawable = this.h;
            if (gradientDrawable != null) {
                if (themedColor == this.R) {
                    if (themedColor2 != this.S) {
                    }
                }
                this.R = themedColor;
                this.S = themedColor2;
                gradientDrawable.setColors(new int[]{themedColor, themedColor2});
            }
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            Drawable drawable = this.F;
            if (drawable != null && r12 != this.T) {
                this.T = r12;
                drawable.setColorFilter(r12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
            }
            fi.j jVar = this.n;
            if (jVar != null) {
                jVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
                org.telegram.ui.ActionBar.k6.H1(this.n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            org.telegram.ui.Components.ch0 ch0Var = this.w;
            if (ch0Var != null && x02 != this.U) {
                this.U = x02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.da daVar = this.e;
            if (daVar != null) {
                daVar.invalidate();
            }
            if (this.d != null) {
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    View childAt = this.d.getChildAt(i10);
                    TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    }
                    TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    }
                }
            }
            if (this.J == null || this.P == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) {
                return;
            }
            org.telegram.messenger.g0.r(o4Var);
            org.telegram.messenger.g0.i3(o4Var, 100L);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
