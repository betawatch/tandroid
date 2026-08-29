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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable A;
    public CharSequence[] B;
    public String[] C;
    public int D;
    public j70 E;
    public long F;
    public boolean G;
    public LocaleController.LocaleInfo H;
    public boolean I;
    public boolean J;
    public final Object a;
    public final Object b;
    public final int c;
    public m2.g d;
    public org.telegram.ui.Components.pa e;
    public TextView f;
    public GradientDrawable h;
    public cg.s0 n;
    public FrameLayout r;
    public bg.d1 s;
    public org.telegram.ui.Components.xi0 v;
    public int w;
    public boolean x;
    public boolean y;

    public k70() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = UserConfig.selectedAccount;
        this.w = 0;
        this.x = false;
        this.y = false;
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
            this.H = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.H = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getStrings, new zg(28, this, str), 8);
    }

    public final void V(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.A.setColorFilter(org.telegram.ui.ActionBar.g6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.g6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        cg.s0 s0Var = this.n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        if (!z10) {
            Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            return;
        }
        j70 j70Var = this.E;
        if (j70Var != null) {
            j70Var.postRunnable(new q00(this, 10));
        }
        for (int i12 = 0; i12 < this.d.getChildCount(); i12++) {
            View childAt = this.d.getChildAt(i12);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        Drawable mutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.A = mutate;
        mutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.A), 0, spannableStringBuilder.length(), 33);
        this.B[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(aj0Var, i7.f6.e(28, 28, 17));
        bg.d1 d1Var = new bg.d1(this, context, frameLayout, 20);
        this.s = d1Var;
        scrollView.addView(d1Var, i7.f6.x(-1, -2, 51));
        int i10 = R.raw.sun;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i10, String.valueOf(i10), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xi0Var;
        xi0Var.h = true;
        xi0Var.W = true;
        xi0Var.m();
        this.v.N(org.telegram.ui.ActionBar.g6.A0().q() ? this.v.e[0] - 1 : 0);
        this.v.L(org.telegram.ui.ActionBar.g6.A0().q() ? this.v.e[0] - 1 : 0, false, false);
        aj0Var.setContentDescription(LocaleController.getString(org.telegram.ui.ActionBar.g6.A0().q() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        aj0Var.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.fi0(29, this, aj0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, i7.f6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, i7.f6.e(200, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17));
        textureView.setSurfaceTextureListener(new h70(this, 0));
        m2.g gVar = new m2.g(context);
        this.d = gVar;
        gVar.setAdapter(new cg.k1(this, 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, i7.f6.c(-1.0f, -1));
        this.d.b(new q2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        cg.s0 s0Var = new cg.s0(this, context);
        this.n = s0Var;
        i7.h6.b(s0Var, 0.02f, 1.2f);
        this.n.setText(LocaleController.getString(R.string.StartMessaging));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.s.addView(this.n, i7.f6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i11 = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.g70
            public final /* synthetic */ k70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k70 k70Var = this.b;
                        if (!k70Var.y) {
                            k70Var.y = true;
                            k70Var.presentFragment(new fg0(), true);
                            k70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        k70 k70Var2 = this.b;
                        if (!k70Var2.y && k70Var2.H != null) {
                            k70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(k70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(k70Var2.H, true, false, k70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.pa paVar = new org.telegram.ui.Components.pa(context, this.d, 6);
        this.e = paVar;
        this.s.addView(paVar, i7.f6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, i7.f6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i12 = 1;
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.g70
            public final /* synthetic */ k70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k70 k70Var = this.b;
                        if (!k70Var.y) {
                            k70Var.y = true;
                            k70Var.presentFragment(new fg0(), true);
                            k70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        k70 k70Var2 = this.b;
                        if (!k70Var2.y && k70Var2.H != null) {
                            k70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new i70(k70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(k70Var2.H, true, false, k70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f9 = 4;
        this.s.addView(frameLayout, i7.f6.d(64, 64.0f, 53, 0.0f, f9, f9, 0.0f));
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
        return i7.i6.a(new f(this, 18), org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.Sh, org.telegram.ui.ActionBar.g6.G6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        if (!this.J) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.B = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.C = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.I = true;
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
}
