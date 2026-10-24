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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable E;
    public CharSequence[] F;
    public String[] G;
    public int H;
    public l70 I;
    public long J;
    public boolean K;
    public LocaleController.LocaleInfo L;
    public boolean M;
    public boolean N;
    public int O;
    public final z5 P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Object a;
    public final Object b;
    public final int c;
    public z4.h d;
    public org.telegram.ui.Components.sa e;
    public TextView f;
    public GradientDrawable h;
    public di.n n;
    public FrameLayout r;
    public ah.v s;
    public org.telegram.ui.Components.yj0 v;
    public int w;
    public boolean x;
    public boolean y;

    public n70() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = UserConfig.selectedAccount;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.P = new z5(this, 7);
    }

    public final void U() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i10 = this.c;
        String str = MessagesController.getInstance(i10).suggestedLangCode;
        if ((str == null || (str.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str = "en";
        }
        String str2 = str.contains("-") ? str.split("-")[0] : str;
        String localeAlias = LocaleController.getLocaleAlias(str2);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i11 = 0; i11 < LocaleController.getInstance().languages.size(); i11++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i11);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(str) || localeInfo3.shortName.equals(str2) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.L = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.L = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new a50(2, this, str), 8);
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.k6.Ph)});
        this.E.setColorFilter(org.telegram.ui.ActionBar.k6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        di.n nVar = this.n;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.O = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        if (!z10) {
            Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            return;
        }
        l70 l70Var = this.I;
        if (l70Var != null) {
            l70Var.postRunnable(new fz(this, 11));
        }
        for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
            View childAt = this.d.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.E = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 0, spannableStringBuilder.length(), 33);
        this.F[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(bk0Var, w7.z5.e(28, 28, 17));
        ah.v vVar = new ah.v(this, context, frameLayout, 19);
        this.s = vVar;
        scrollView.addView(vVar, w7.z5.x(-1, -2, 51));
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = yj0Var;
        yj0Var.h = true;
        yj0Var.Z = true;
        yj0Var.o();
        this.v.P(org.telegram.ui.ActionBar.k6.C0().q() ? this.v.e[0] - 1 : 0);
        this.v.N(org.telegram.ui.ActionBar.k6.C0().q() ? this.v.e[0] - 1 : 0, false, false);
        bk0Var.setContentDescription(LocaleController.getString(org.telegram.ui.ActionBar.k6.C0().q() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        bk0Var.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.d51(22, this, bk0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, w7.z5.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, w7.z5.e(200, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17));
        int i10 = 0;
        textureView.setSurfaceTextureListener(new j70(this, i10));
        z4.h hVar = new z4.h(context);
        this.d = hVar;
        hVar.setAdapter(new m70(this, i10));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, w7.z5.c(-1.0f, -1));
        this.d.b(new n2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        di.n nVar = new di.n(this, context);
        this.n = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.n.setText(LocaleController.getString(R.string.StartMessaging));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.s.addView(this.n, w7.z5.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i11 = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.i70
            public final /* synthetic */ n70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        n70 n70Var = this.b;
                        if (!n70Var.y) {
                            n70Var.y = true;
                            n70Var.presentFragment(new ig0(), true);
                            n70Var.M = true;
                            break;
                        }
                        break;
                    default:
                        n70 n70Var2 = this.b;
                        if (!n70Var2.y && n70Var2.L != null) {
                            n70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.i0 = false;
                            c2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new k70(n70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(n70Var2.L, true, false, n70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.sa saVar = new org.telegram.ui.Components.sa(context, this.d, 6);
        this.e = saVar;
        this.s.addView(saVar, w7.z5.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, w7.z5.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i12 = 1;
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.i70
            public final /* synthetic */ n70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        n70 n70Var = this.b;
                        if (!n70Var.y) {
                            n70Var.y = true;
                            n70Var.presentFragment(new ig0(), true);
                            n70Var.M = true;
                            break;
                        }
                        break;
                    default:
                        n70 n70Var2 = this.b;
                        if (!n70Var2.y && n70Var2.L != null) {
                            n70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.i0 = false;
                            c2Var.r(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new k70(n70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(n70Var2.L, true, false, n70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f7 = 4;
        this.s.addView(frameLayout, w7.z5.d(64, 64.0f, 53, 0.0f, f7, f7, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        U();
        this.x = true;
        V(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack || i10 == NotificationCenter.configLoaded) {
            U();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(10, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.Sh, org.telegram.ui.ActionBar.k6.G6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.N) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.F = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.G = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.M = true;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (this.x) {
            if (LocaleController.isRTL) {
                this.d.setCurrentItem(6);
                this.w = 6;
            } else {
                this.d.setCurrentItem(0);
                this.w = 0;
            }
            this.x = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        z5 z5Var = this.P;
        try {
            if (this.fragmentView == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int themedColor = getThemedColor(i10);
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ph);
            GradientDrawable gradientDrawable = this.h;
            if (gradientDrawable != null) {
                if (themedColor == this.Q) {
                    if (themedColor2 != this.R) {
                    }
                }
                this.Q = themedColor;
                this.R = themedColor2;
                gradientDrawable.setColors(new int[]{themedColor, themedColor2});
            }
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.9f, getThemedColor(org.telegram.ui.ActionBar.k6.A8));
            Drawable drawable = this.E;
            if (drawable != null && o12 != this.S) {
                this.S = o12;
                drawable.setColorFilter(o12, PorterDuff.Mode.MULTIPLY);
            }
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            TextView textView = this.f;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
            }
            di.n nVar = this.n;
            if (nVar != null) {
                nVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                org.telegram.ui.ActionBar.k6.E1(this.n.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false), true);
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            org.telegram.ui.Components.yj0 yj0Var = this.v;
            if (yj0Var != null && x02 != this.T) {
                this.T = x02;
                yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.sa saVar = this.e;
            if (saVar != null) {
                saVar.invalidate();
            }
            if (this.d != null) {
                for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
                    View childAt = this.d.getChildAt(i11);
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
            if (this.I == null || this.O == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            AndroidUtilities.runOnUIThread(z5Var, 100L);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
