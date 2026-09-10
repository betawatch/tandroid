package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ae1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sp extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i0 = 0;
    public final TextView E;
    public final hj0 F;
    public final lp G;
    public final mp H;
    public final View I;
    public final o6 J;
    public final o6 K;
    public final TextView L;
    public rp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public bi.gd R;
    public float S;
    public ValueAnimator T;
    public s40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.f4 W;
    public org.telegram.ui.ActionBar.p2 X;
    public yi Y;
    public bi.n7 Z;
    public o6 a0;
    public final ImageView b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.i2 c;
    public uq c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public boolean e0;
    public TLRPC.WallPaper f;
    public TL_stories.TL_premium_boostsStatus f0;
    public float g0;
    public final qp h;
    public ValueAnimator h0;
    public final org.telegram.ui.bo n;
    public final org.telegram.ui.ActionBar.f4 r;
    public final boolean s;
    public final org.telegram.ui.eo v;
    public final vl0 w;
    public final s4.c0 x;
    public final a10 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(org.telegram.ui.eo eoVar, org.telegram.ui.bo boVar) {
        super(1, (Context) eoVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) boVar, true);
        String str;
        int i10 = 1;
        this.Q = -1;
        this.d0 = false;
        this.e0 = false;
        this.g0 = 0.0f;
        this.v = eoVar;
        this.n = boVar;
        this.r = boVar.f;
        this.f = boVar.h;
        this.s = org.telegram.ui.ActionBar.j6.I.q();
        qp qpVar = new qp(this.currentAccount, eoVar.a(), boVar, 0);
        this.h = qpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.j6.i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.c = i2Var;
        imageView.setImageDrawable(i2Var);
        imageView.setOnClickListener(new bp(this, i10));
        frameLayout.addView(imageView, w7.a6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        hj0 hj0Var = new hj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = hj0Var;
        this.N = !org.telegram.ui.ActionBar.j6.I.q();
        A(org.telegram.ui.ActionBar.j6.I.q(), false);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        lp lpVar = new lp(this, getContext());
        this.G = lpVar;
        lpVar.setAnimation(hj0Var);
        lpVar.setScaleType(ImageView.ScaleType.CENTER);
        lpVar.setOnClickListener(new bp(this, 2));
        frameLayout.addView(lpVar, w7.a6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new mp(getContext());
        vl0 vl0Var = new vl0(getContext(), null);
        this.w = vl0Var;
        vl0Var.setAdapter(qpVar);
        vl0Var.setDrawSelection(false);
        vl0Var.setClipChildren(false);
        vl0Var.setClipToPadding(false);
        vl0Var.setHasFixedSize(true);
        vl0Var.setItemAnimator(null);
        vl0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.x = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        vl0Var.setOnItemClickListener(new k(this, i13));
        int i14 = 22;
        vl0Var.setOnScrollListener(new bi.a2(this, i14));
        a10 a10Var = new a10(getContext(), this.resourcesProvider);
        this.y = a10Var;
        a10Var.setViewType(14);
        a10Var.setVisibility(0);
        frameLayout.addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(vl0Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new bp(this, i13));
        frameLayout.addView(view, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var = new o6(getContext(), true, true, true);
        this.J = o6Var;
        o6Var.getDrawable().n(true);
        o6Var.n = false;
        o6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.j6.Sh;
        o6Var.setTextColor(getThemedColor(i15));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(o6Var, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var2 = new o6(getContext(), true, true, true);
        this.K = o6Var2;
        o6Var2.getDrawable().n(true);
        o6Var2.n = false;
        o6Var2.setGravity(17);
        o6Var2.setTextColor(getThemedColor(i15));
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var2.setAlpha(0.0f);
        o6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(o6Var2, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.sh(i14, this, eoVar));
            frameLayout.addView(textView3, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (eoVar.i() != null) {
                str = UserObject.getFirstName(eoVar.i());
            } else {
                TLRPC.Chat chat = eoVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(sp spVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (spVar.getContext() == null) {
            return;
        }
        org.telegram.ui.eo eoVar = spVar.v;
        qg.k0 k0Var = new qg.k0(22, spVar.currentAccount, spVar.getContext(), eoVar, spVar.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(spVar.f0, true);
        k0Var.H1(spVar.v.a());
        k0Var.Q0 = new ap(spVar, 2);
        k0Var.show();
    }

    public static /* synthetic */ void n(sp spVar, org.telegram.ui.eo eoVar) {
        if (spVar.f == null) {
            spVar.dismiss();
            return;
        }
        spVar.f = null;
        spVar.dismiss();
        ChatThemeController.getInstance(spVar.currentAccount).clearWallpaper(eoVar.a(), true);
    }

    public static void o(sp spVar, View view, int i10) {
        uq0 uq0Var;
        vl0 vl0Var = spVar.w;
        qp qpVar = spVar.h;
        if (qpVar.d.get(i10) == spVar.M || spVar.R != null) {
            return;
        }
        spVar.M = (rp) qpVar.d.get(i10);
        spVar.y();
        qpVar.E(i10);
        spVar.containerView.postDelayed(new kf(spVar, i10, 1), 100L);
        for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
            i21 i21Var = (i21) vl0Var.getChildAt(i11);
            if (i21Var != view && (uq0Var = i21Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(uq0Var);
                i21Var.J.run();
            }
        }
        if (!((rp) qpVar.d.get(i10)).a.a) {
            ((i21) view).d();
        }
        spVar.E(true);
    }

    public static void q(sp spVar, ae1 ae1Var) {
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        org.telegram.ui.eo eoVar = spVar.v;
        ae1Var.a.a = eoVar.getResourceProvider();
        ae1Var.p1 = new kp(spVar);
        n2Var.c = new bi.f0(28);
        n2Var.d = new ap(spVar, 5);
        n2Var.b = new ap(spVar, 6);
        n2Var.e = true;
        spVar.X = ae1Var;
        eoVar.showAsSheet(ae1Var, n2Var);
    }

    public final void A(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        lp lpVar = this.G;
        hj0 hj0Var = this.F;
        if (z11) {
            hj0Var.P(z10 ? hj0Var.e[0] : 0);
            if (lpVar != null) {
                lpVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? hj0Var.e[0] - 1 : 0;
        hj0Var.N(i10, false, true);
        hj0Var.P(i10);
        if (lpVar != null) {
            lpVar.invalidate();
        }
    }

    public final void C(boolean z10) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.v.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        lp lpVar = this.G;
        lpVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        lpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        lpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        bi.gd gdVar = new bi.gd(this, getContext(), z10, canvas, (lpVar.getMeasuredWidth() / 2.0f) + f7, (lpVar.getMeasuredHeight() / 2.0f) + f10, 0.9f * Math.max(createBitmap.getHeight(), createBitmap.getWidth()), paint, createBitmap, paint2, f7, f10, 1);
        this.R = gdVar;
        gdVar.setOnTouchListener(new ai.h(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new ep(this));
        this.T.addListener(new rm(this, 1));
        this.T.setDuration(400L);
        this.T.setInterpolator(pt.e);
        this.T.start();
        frameLayout2.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ai.j(21, this, z10));
    }

    public final void D() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.i2 i2Var = this.c;
        i2Var.a(themedColor);
        i2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.f4 f4Var;
        org.telegram.ui.eo eoVar = this.v;
        TLRPC.Chat chat = eoVar.e;
        int i10 = 1;
        int i11 = 0;
        if (chat != null && !this.d0 && !this.e0 && this.f0 == null) {
            this.d0 = true;
            eoVar.getMessagesController().getBoostsController().getBoostsStats(eoVar.a(), new cp(this, i11));
        }
        boolean z13 = this.V;
        a10 a10Var = this.y;
        TextView textView = this.e;
        o6 o6Var = this.K;
        TextView textView2 = this.d;
        TextView textView3 = this.L;
        org.telegram.ui.ActionBar.i2 i2Var = this.c;
        View view = this.I;
        o6 o6Var2 = this.J;
        if (!z13) {
            i2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(a10Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(a10Var, false, 1.0f, true, z10);
        if (!v()) {
            i2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        i2Var.c(0.0f, z10);
        view.setEnabled(true);
        rp rpVar = this.M;
        if (rpVar == null || (f4Var = rpVar.a) == null || !f4Var.a) {
            o6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.f0) != null && tL_premium_boostsStatus.level < eoVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.c0 == null) {
                    uq uqVar = new uq(R.drawable.mini_switch_lock, 0);
                    this.c0 = uqVar;
                    uqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.c0, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", eoVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                o6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = !z10 && o6Var2.getAlpha() > 0.8f;
                valueAnimator = this.h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h0 = null;
                }
                if (z12) {
                    this.g0 = z11 ? 1.0f : 0.0f;
                    o6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.g0);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g0, z11 ? 1.0f : 0.0f);
                    this.h0 = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 13));
                    this.h0.addListener(new yo(i10, this, z11));
                    this.h0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(o6Var2, true, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(o6Var, z11, 0.9f, false, 0.7f, z10, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
            }
        } else {
            o6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
        }
        z11 = false;
        if (z10) {
        }
        valueAnimator = this.h0;
        if (valueAnimator != null) {
        }
        if (z12) {
        }
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(o6Var2, true, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(o6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ap(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.bo boVar = this.n;
            TLRPC.WallPaper wallPaper = boVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            boVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.N != this.s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.s) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str2 = string2;
                }
                N0 = this.s ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.s);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        pp ppVar = new pp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.X;
            if (p2Var instanceof ae1) {
                arrayList.addAll(((ae1) p2Var).S0());
                return arrayList;
            }
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            arrayList.addAll(yiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, ppVar, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 16, new Class[]{i21.class}, null, null, null, org.telegram.ui.ActionBar.j6.i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).o = this.n;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        t();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !v()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x10 >= this.containerView.getLeft() && x10 <= this.containerView.getRight()) {
            return false;
        }
        this.v.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onContainerTranslationYChanged(float f7) {
        s40 s40Var = this.U;
        if (s40Var != null) {
            s40Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.O = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.eo eoVar = this.v;
        if (eoVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || eoVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        s40 s40Var = new s40(9, getContext(), eoVar.getResourceProvider(), false);
        this.U = s40Var;
        s40Var.setVisibility(4);
        this.U.setShowingDuration(5000L);
        this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.N) {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new ap(this, 7), 1500L);
        this.container.addView(this.U, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z11;
        TLRPC.User i10;
        boolean z12;
        if (this.d0) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f0;
        int i11 = 1;
        org.telegram.ui.eo eoVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < eoVar.getMessagesController().channelWallpaperLevelMin) {
            eoVar.getMessagesController().getBoostsController().userCanBoostChannel(eoVar.a(), this.f0, new cp(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.M.a;
        pc pcVar = null;
        if (f4Var != this.W) {
            TLRPC.ChatTheme chatTheme = !f4Var.a ? f4Var.d : null;
            long giftThemeUser = f4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(f4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) f4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = f4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        d5.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new ap(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(eoVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(eoVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !v() ? null : this.n.h;
                    z11 = f4Var.a;
                    boolean z13 = this.s;
                    if (z11) {
                        this.n.i(f4Var, wallPaper, true, Boolean.valueOf(z13), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z13), false);
                    }
                    this.O = true;
                    i10 = eoVar.i();
                    if (i10 != null && !i10.self) {
                        z12 = f4Var.a;
                        lx0 lx0Var = new lx0(getContext(), null, 1, -1, f4Var.f(), eoVar.getResourceProvider());
                        lx0Var.c.setVisibility(8);
                        TextView textView = lx0Var.b;
                        if (z12) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        pcVar = pc.g(eoVar, lx0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(eoVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(eoVar.a(), chatTheme, true);
            if (!v()) {
            }
            z11 = f4Var.a;
            boolean z132 = this.s;
            if (z11) {
            }
            this.O = true;
            i10 = eoVar.i();
            if (i10 != null) {
                z12 = f4Var.a;
                lx0 lx0Var2 = new lx0(getContext(), null, 1, -1, f4Var.f(), eoVar.getResourceProvider());
                lx0Var2.c.setVisibility(8);
                TextView textView2 = lx0Var2.b;
                if (z12) {
                }
                textView2.setTypeface(null);
                pcVar = pc.g(eoVar, lx0Var2, 2750);
            }
        }
        dismiss();
        if (pcVar != null) {
            pcVar.j();
        }
    }

    public final void t() {
        if (!v()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.dp
            public final /* synthetic */ sp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.s(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.dp
            public final /* synthetic */ sp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.s(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void u() {
        if (isDismissed() || this.O) {
            return;
        }
        org.telegram.ui.ActionBar.j6.b = false;
        TLRPC.WallPaper wallPaper = v() ? null : this.n.h;
        org.telegram.ui.ActionBar.f4 f4Var = this.M.a;
        if (f4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.N), true);
        } else {
            this.n.i(f4Var, wallPaper, false, Boolean.valueOf(this.N), true);
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            mj mjVar = yiVar.r0;
            if (mjVar != null) {
                boolean z10 = this.N;
                ya yaVar = mjVar.v;
                ((ArrayList) yaVar.e).clear();
                WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                yaVar.l();
            }
            this.Y.c1();
        }
        qp qpVar = this.h;
        if (qpVar == null || qpVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < qpVar.d.size(); i10++) {
            ((rp) qpVar.d.get(i10)).c = this.N ? 1 : 0;
        }
        qpVar.l();
    }

    public final boolean v() {
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.W;
        eg.b bVar = f4Var != null ? f4Var.c : null;
        if (bVar == null) {
            bVar = eg.b.d("❌");
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.M.a;
        eg.b bVar2 = f4Var2 != null ? f4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = eg.b.d("❌");
        }
        return !eg.b.a(bVar, bVar2);
    }

    public final void w() {
        if (this.b0) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.b0 = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new np(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new op(this, chatThemeController));
        }
    }

    public final void x(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rp rpVar = new rp((org.telegram.ui.ActionBar.f4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.V) {
            org.telegram.ui.ActionBar.f4 f4Var = this.n.f;
            this.W = f4Var;
            if (f4Var != null) {
                f4Var.l();
            }
        }
        arrayList.add(0, rpVar);
        if (!this.V) {
            this.M = rpVar;
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.W;
        eg.b bVar = f4Var2 != null ? f4Var2.c : null;
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.f4 f4Var3 = (org.telegram.ui.ActionBar.f4) list.get(i10);
            rp rpVar2 = new rp(f4Var3);
            f4Var3.n(this.currentAccount);
            rpVar2.c = this.N ? 1 : 0;
            if (eg.b.a(f4Var3.c, bVar)) {
                arrayList.add(1, rpVar2);
                z10 = true;
            } else {
                arrayList.add(rpVar2);
            }
        }
        org.telegram.ui.ActionBar.f4 f4Var4 = this.W;
        if (f4Var4 != null && !z10) {
            rp rpVar3 = new rp(f4Var4);
            f4Var4.n(this.currentAccount);
            rpVar3.c = this.N ? 1 : 0;
            arrayList.add(1, rpVar3);
        }
        qp qpVar = this.h;
        qpVar.d = arrayList;
        qpVar.l();
        this.G.setVisibility(0);
        if (!this.V) {
            z(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.V = true;
        E(true);
    }

    public final void y() {
        if (isDismissed() || this.O) {
            return;
        }
        this.P = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = v() ? null : this.f;
        org.telegram.ui.ActionBar.f4 f4Var = this.M.a;
        if (f4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.N), false);
        } else {
            this.n.i(f4Var, wallPaper, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void z(boolean z10) {
        qp qpVar = this.h;
        ArrayList arrayList = qpVar.d;
        org.telegram.ui.ActionBar.f4 f4Var = this.W;
        s4.c0 c0Var = this.x;
        vl0 vl0Var = this.w;
        if (f4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (eg.b.a(((rp) arrayList.get(i10)).a.c, this.W.c)) {
                        this.M = (rp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.Q = i10;
                qpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, qpVar.d.size() - 1);
                if (z10) {
                    vl0Var.x0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (rp) arrayList.get(0);
            qpVar.E(0);
            if (z10) {
                vl0Var.x0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }
}
