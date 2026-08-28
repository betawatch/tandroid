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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public Drawable A;
    public CharSequence[] B;
    public String[] C;
    public int D;
    public g70 E;
    public long F;
    public boolean G;
    public LocaleController.LocaleInfo H;
    public boolean I;
    public boolean J;
    public final Object a;
    public final Object b;
    public final int c;
    public m2.g d;
    public org.telegram.ui.Components.ka e;
    public TextView f;
    public GradientDrawable h;
    public bh.e n;
    public FrameLayout r;
    public fh.v s;
    public org.telegram.ui.Components.mi0 v;
    public int w;
    public boolean x;
    public boolean y;

    public i70() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = UserConfig.selectedAccount;
        this.w = 0;
        this.x = false;
        this.y = false;
    }

    public final void T() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        int i9 = this.c;
        String str = MessagesController.getInstance(i9).suggestedLangCode;
        if ((str == null || (str.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (str = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            str = "en";
        }
        String str2 = str.contains("-") ? str.split("-")[0] : str;
        String localeAlias = LocaleController.getLocaleAlias(str2);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i10 = 0; i10 < LocaleController.getInstance().languages.size(); i10++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i10);
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
        ConnectionsManager.getInstance(i9).sendRequest(tL_langpack_getStrings, new v40(2, this, str), 8);
    }

    public final void U(boolean z10) {
        GradientDrawable gradientDrawable = this.h;
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i9), getThemedColor(org.telegram.ui.ActionBar.f6.Ph)});
        this.A.setColorFilter(org.telegram.ui.ActionBar.f6.l1(0.9f, getThemedColor(org.telegram.ui.ActionBar.f6.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.f6.d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        bh.e eVar = this.n;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        eVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, w02, w02));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        if (!z10) {
            Intro.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            return;
        }
        g70 g70Var = this.E;
        if (g70Var != null) {
            g70Var.postRunnable(new o00(this, 10));
        }
        for (int i11 = 0; i11 < this.d.getChildCount(); i11++) {
            View childAt = this.d.getChildAt(i11);
            TextView textView = (TextView) childAt.findViewWithTag(this.a);
            int i12 = org.telegram.ui.ActionBar.f6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            ((TextView) childAt.findViewWithTag(this.b)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
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
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(pi0Var, g7.e6.e(28, 28, 17));
        fh.v vVar = new fh.v(this, context, frameLayout, 19);
        this.s = vVar;
        scrollView.addView(vVar, g7.e6.x(-1, -2, 51));
        int i9 = R.raw.sun;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i9, String.valueOf(i9), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = mi0Var;
        mi0Var.h = true;
        mi0Var.W = true;
        mi0Var.m();
        this.v.N(org.telegram.ui.ActionBar.f6.A0().q() ? this.v.e[0] - 1 : 0);
        this.v.L(org.telegram.ui.ActionBar.f6.A0().q() ? this.v.e[0] - 1 : 0, false, false);
        pi0Var.setContentDescription(LocaleController.getString(org.telegram.ui.ActionBar.f6.A0().q() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        pi0Var.setAnimation(this.v);
        frameLayout.setOnClickListener(new org.telegram.ui.Components.vh0(28, this, pi0Var));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, g7.e6.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, g7.e6.e(200, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17));
        int i10 = 0;
        textureView.setSurfaceTextureListener(new e70(this, i10));
        m2.g gVar = new m2.g(context);
        this.d = gVar;
        gVar.setAdapter(new h70(this, i10));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.b(new p2(this, 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bh.e eVar = new bh.e(this, context);
        this.n = eVar;
        g7.g6.b(eVar, 0.02f, 1.2f);
        this.n.setText(LocaleController.getString(R.string.StartMessaging));
        this.n.setGravity(17);
        this.n.setTypeface(AndroidUtilities.bold());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.s.addView(this.n, g7.e6.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i11 = 0;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d70
            public final /* synthetic */ i70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i70 i70Var = this.b;
                        if (!i70Var.y) {
                            i70Var.y = true;
                            i70Var.presentFragment(new fg0(), true);
                            i70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        i70 i70Var2 = this.b;
                        if (!i70Var2.y && i70Var2.H != null) {
                            i70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new f70(i70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(i70Var2.H, true, false, i70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.ka kaVar = new org.telegram.ui.Components.ka(context, this.d, 6);
        this.e = kaVar;
        this.s.addView(kaVar, g7.e6.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, g7.e6.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i12 = 1;
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d70
            public final /* synthetic */ i70 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        i70 i70Var = this.b;
                        if (!i70Var.y) {
                            i70Var.y = true;
                            i70Var.presentFragment(new fg0(), true);
                            i70Var.I = true;
                            break;
                        }
                        break;
                    default:
                        i70 i70Var2 = this.b;
                        if (!i70Var2.y && i70Var2.H != null) {
                            i70Var2.y = true;
                            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(view.getContext(), 3, null);
                            c2Var.c0 = false;
                            c2Var.q(1000L);
                            NotificationCenter.getGlobalInstance().addObserver(new f70(i70Var2, c2Var), NotificationCenter.reloadInterface);
                            LocaleController.getInstance().applyLanguage(i70Var2.H, true, false, i70Var2.c);
                            break;
                        }
                        break;
                }
            }
        });
        float f10 = 4;
        this.s.addView(frameLayout, g7.e6.d(64, 64.0f, 53, 0.0f, f10, f10, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        int i13 = this.c;
        NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(i13).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(i13);
        T();
        this.x = true;
        U(false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.suggestedLangpack || i9 == NotificationCenter.configLoaded) {
            T();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 18), org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.q6, org.telegram.ui.ActionBar.f6.P9, org.telegram.ui.ActionBar.f6.Q9, org.telegram.ui.ActionBar.f6.Sh, org.telegram.ui.ActionBar.f6.G6);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, true)) > 0.699999988079071d;
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
