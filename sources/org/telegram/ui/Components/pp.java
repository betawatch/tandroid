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
import org.telegram.ui.pd1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i0 = 0;
    public final TextView E;
    public final kj0 F;
    public final ip G;
    public final jp H;
    public final View I;
    public final p6 J;
    public final p6 K;
    public final TextView L;
    public op M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.sb R;
    public float S;
    public ValueAnimator T;
    public m40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.c4 W;
    public org.telegram.ui.ActionBar.n2 X;
    public xi Y;
    public ci.m6 Z;
    public p6 a0;
    public final ImageView b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.g2 c;
    public rq c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public boolean e0;
    public TLRPC.WallPaper f;
    public TL_stories.TL_premium_boostsStatus f0;
    public float g0;
    public final np h;
    public ValueAnimator h0;
    public final org.telegram.ui.wn n;
    public final org.telegram.ui.ActionBar.c4 r;
    public final boolean s;
    public final org.telegram.ui.yn v;
    public final zl0 w;
    public final s4.c0 x;
    public final w00 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(org.telegram.ui.yn ynVar, org.telegram.ui.wn wnVar) {
        super(1, (Context) ynVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) wnVar, true);
        String str;
        int i10 = 1;
        this.Q = -1;
        this.d0 = false;
        this.e0 = false;
        this.g0 = 0.0f;
        this.v = ynVar;
        this.n = wnVar;
        this.r = wnVar.f;
        this.f = wnVar.h;
        this.s = org.telegram.ui.ActionBar.i6.I.q();
        np npVar = new np(this.currentAccount, ynVar.a(), wnVar, 0);
        this.h = npVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.i6.i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new yo(this, i10));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        kj0 kj0Var = new kj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = kj0Var;
        this.N = !org.telegram.ui.ActionBar.i6.I.q();
        A(org.telegram.ui.ActionBar.i6.I.q(), false);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ip ipVar = new ip(this, getContext());
        this.G = ipVar;
        ipVar.setAnimation(kj0Var);
        ipVar.setScaleType(ImageView.ScaleType.CENTER);
        ipVar.setOnClickListener(new yo(this, 2));
        frameLayout.addView(ipVar, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new jp(getContext());
        zl0 zl0Var = new zl0(getContext(), null);
        this.w = zl0Var;
        zl0Var.setAdapter(npVar);
        zl0Var.setDrawSelection(false);
        zl0Var.setClipChildren(false);
        zl0Var.setClipToPadding(false);
        zl0Var.setHasFixedSize(true);
        zl0Var.setItemAnimator(null);
        zl0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.x = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        zl0Var.setOnItemClickListener(new j(this, i13));
        zl0Var.setOnScrollListener(new ai.r(this, 25));
        w00 w00Var = new w00(getContext(), this.resourcesProvider);
        this.y = w00Var;
        w00Var.setViewType(14);
        w00Var.setVisibility(0);
        frameLayout.addView(w00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(zl0Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.i6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.i6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new yo(this, i13));
        frameLayout.addView(view, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
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
        frameLayout.addView(textView2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        p6 p6Var = new p6(getContext(), true, true, true);
        this.J = p6Var;
        p6Var.getDrawable().n(true);
        p6Var.n = false;
        p6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.i6.Sh;
        p6Var.setTextColor(getThemedColor(i14));
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(p6Var, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        p6 p6Var2 = new p6(getContext(), true, true, true);
        this.K = p6Var2;
        p6Var2.getDrawable().n(true);
        p6Var2.n = false;
        p6Var2.setGravity(17);
        p6Var2.setTextColor(getThemedColor(i14));
        p6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        p6Var2.setAlpha(0.0f);
        p6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(p6Var2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.qf(this, ynVar));
            frameLayout.addView(textView3, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (ynVar.i() != null) {
                str = UserObject.getFirstName(ynVar.i());
            } else {
                TLRPC.Chat chat = ynVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        C();
        D(false);
    }

    public static void m(pp ppVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (ppVar.getContext() == null) {
            return;
        }
        org.telegram.ui.yn ynVar = ppVar.v;
        rg.k0 k0Var = new rg.k0(22, ppVar.currentAccount, ppVar.getContext(), ynVar, ppVar.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(ppVar.f0, true);
        k0Var.H1(ppVar.v.a());
        k0Var.Q0 = new xo(ppVar, 2);
        k0Var.show();
    }

    public static /* synthetic */ void n(pp ppVar, org.telegram.ui.yn ynVar) {
        if (ppVar.f == null) {
            ppVar.dismiss();
            return;
        }
        ppVar.f = null;
        ppVar.dismiss();
        ChatThemeController.getInstance(ppVar.currentAccount).clearWallpaper(ynVar.a(), true);
    }

    public static void o(pp ppVar, View view, int i10) {
        gq0 gq0Var;
        zl0 zl0Var = ppVar.w;
        np npVar = ppVar.h;
        if (npVar.d.get(i10) == ppVar.M || ppVar.R != null) {
            return;
        }
        ppVar.M = (op) npVar.d.get(i10);
        ppVar.y();
        npVar.E(i10);
        ppVar.containerView.postDelayed(new kf(ppVar, i10, 1), 100L);
        for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
            t21 t21Var = (t21) zl0Var.getChildAt(i11);
            if (t21Var != view && (gq0Var = t21Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(gq0Var);
                t21Var.J.run();
            }
        }
        if (!((op) npVar.d.get(i10)).a.a) {
            ((t21) view).d();
        }
        ppVar.D(true);
    }

    public static void q(pp ppVar, pd1 pd1Var) {
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        org.telegram.ui.yn ynVar = ppVar.v;
        pd1Var.a.a = ynVar.getResourceProvider();
        pd1Var.p1 = new hp(ppVar);
        l2Var.c = new uh(3);
        l2Var.d = new xo(ppVar, 5);
        l2Var.b = new xo(ppVar, 6);
        l2Var.e = true;
        ppVar.X = pd1Var;
        ynVar.showAsSheet(pd1Var, l2Var);
    }

    public final void A(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        ip ipVar = this.G;
        kj0 kj0Var = this.F;
        if (z11) {
            kj0Var.P(z10 ? kj0Var.e[0] : 0);
            if (ipVar != null) {
                ipVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? kj0Var.e[0] - 1 : 0;
        kj0Var.N(i10, false, true);
        kj0Var.P(i10);
        if (ipVar != null) {
            ipVar.invalidate();
        }
    }

    public final void B(boolean z10) {
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
        ip ipVar = this.G;
        ipVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        ipVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        ipVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.sb sbVar = new ci.sb(this, getContext(), z10, canvas, (ipVar.getMeasuredWidth() / 2.0f) + f7, (ipVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = sbVar;
        sbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new bp(this));
        this.T.addListener(new r8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(nt.e);
        this.T.start();
        frameLayout2.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(22, this, z10));
    }

    public final void C() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.i6.p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.i6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.i6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.i6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        char c10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.c4 c4Var;
        org.telegram.ui.yn ynVar = this.v;
        TLRPC.Chat chat = ynVar.e;
        int i10 = 0;
        if (chat != null && !this.d0 && !this.e0 && this.f0 == null) {
            this.d0 = true;
            ynVar.getMessagesController().getBoostsController().getBoostsStats(ynVar.a(), new zo(this, i10));
        }
        boolean z13 = this.V;
        w00 w00Var = this.y;
        TextView textView = this.e;
        p6 p6Var = this.K;
        TextView textView2 = this.d;
        TextView textView3 = this.L;
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        View view = this.I;
        p6 p6Var2 = this.J;
        if (!z13) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(p6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(p6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(w00Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(w00Var, false, 1.0f, true, z10);
        if (!v()) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(p6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(p6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        g2Var.c(0.0f, z10);
        view.setEnabled(true);
        op opVar = this.M;
        if (opVar == null || (c4Var = opVar.a) == null || !c4Var.a) {
            p6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.f0) != null && tL_premium_boostsStatus.level < ynVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.c0 == null) {
                    rq rqVar = new rq(R.drawable.mini_switch_lock, 0);
                    this.c0 = rqVar;
                    rqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.c0, 0, 1, 33);
                c10 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", ynVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                p6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = !z10 && p6Var2.getAlpha() > 0.8f;
                valueAnimator = this.h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h0 = null;
                }
                if (z12) {
                    this.g0 = z11 ? 1.0f : 0.0f;
                    p6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.g0);
                } else {
                    float f7 = this.g0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[c10] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.h0 = ofFloat;
                    ofFloat.addUpdateListener(new k6(this, 13));
                    this.h0.addListener(new da(5, this, z11));
                    this.h0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(p6Var2, true, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(p6Var, z11, 0.9f, false, 0.7f, z10, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
            }
        } else {
            p6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
        }
        c10 = 1;
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
        AndroidUtilities.updateViewVisibilityAnimated(p6Var2, true, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(p6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new xo(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        org.telegram.ui.ActionBar.h6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.wn wnVar = this.n;
            TLRPC.WallPaper wallPaper = wnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            wnVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.N != this.s) {
            if (org.telegram.ui.ActionBar.i6.I.q() == this.s) {
                N0 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string) != null && !org.telegram.ui.ActionBar.i6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string2) != null && org.telegram.ui.ActionBar.i6.N0(string2).q()) {
                    str2 = string2;
                }
                N0 = this.s ? org.telegram.ui.ActionBar.i6.N0(str2) : org.telegram.ui.ActionBar.i6.N0(str);
            }
            org.telegram.ui.ActionBar.i6.t(N0, false, this.s);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        mp mpVar = new mp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.c7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof pd1) {
                arrayList.addAll(((pd1) n2Var).S0());
                return arrayList;
            }
        }
        xi xiVar = this.Y;
        if (xiVar != null) {
            arrayList.addAll(xiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, mpVar, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 16, new Class[]{t21.class}, null, null, null, org.telegram.ui.ActionBar.i6.i5));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.k6) obj).o = this.n;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        t();
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        m40 m40Var = this.U;
        if (m40Var != null) {
            m40Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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
        org.telegram.ui.yn ynVar = this.v;
        if (ynVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || ynVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        m40 m40Var = new m40(9, getContext(), ynVar.getResourceProvider(), false);
        this.U = m40Var;
        m40Var.setVisibility(4);
        this.U.setShowingDuration(5000L);
        this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.N) {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new xo(this, 7), 1500L);
        this.container.addView(this.U, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
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
        org.telegram.ui.yn ynVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < ynVar.getMessagesController().channelWallpaperLevelMin) {
            ynVar.getMessagesController().getBoostsController().userCanBoostChannel(ynVar.a(), this.f0, new zo(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        rc rcVar = null;
        if (c4Var != this.W) {
            TLRPC.ChatTheme chatTheme = !c4Var.a ? c4Var.d : null;
            long giftThemeUser = c4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(c4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = c4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        e5.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new xo(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(ynVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(ynVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !v() ? null : this.n.h;
                    z11 = c4Var.a;
                    boolean z13 = this.s;
                    if (z11) {
                        this.n.i(c4Var, wallPaper, true, Boolean.valueOf(z13), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z13), false);
                    }
                    this.O = true;
                    i10 = ynVar.i();
                    if (i10 != null && !i10.self) {
                        z12 = c4Var.a;
                        wx0 wx0Var = new wx0(getContext(), null, 1, -1, c4Var.f(), ynVar.getResourceProvider());
                        wx0Var.c.setVisibility(8);
                        TextView textView = wx0Var.b;
                        if (z12) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        rcVar = rc.g(ynVar, wx0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(ynVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(ynVar.a(), chatTheme, true);
            if (!v()) {
            }
            z11 = c4Var.a;
            boolean z132 = this.s;
            if (z11) {
            }
            this.O = true;
            i10 = ynVar.i();
            if (i10 != null) {
                z12 = c4Var.a;
                wx0 wx0Var2 = new wx0(getContext(), null, 1, -1, c4Var.f(), ynVar.getResourceProvider());
                wx0Var2.c.setVisibility(8);
                TextView textView2 = wx0Var2.b;
                if (z12) {
                }
                textView2.setTypeface(null);
                rcVar = rc.g(ynVar, wx0Var2, 2750);
            }
        }
        dismiss();
        if (rcVar != null) {
            rcVar.j();
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.ap
            public final /* synthetic */ pp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.ap
            public final /* synthetic */ pp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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
        org.telegram.ui.ActionBar.i6.b = false;
        TLRPC.WallPaper wallPaper = v() ? null : this.n.h;
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        if (c4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.N), true);
        } else {
            this.n.i(c4Var, wallPaper, false, Boolean.valueOf(this.N), true);
        }
        xi xiVar = this.Y;
        if (xiVar != null) {
            mj mjVar = xiVar.r0;
            if (mjVar != null) {
                boolean z10 = this.N;
                ab abVar = mjVar.v;
                ((ArrayList) abVar.e).clear();
                WallpapersListActivity.z0((ArrayList) abVar.e, z10);
                abVar.l();
            }
            this.Y.c1();
        }
        np npVar = this.h;
        if (npVar == null || npVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < npVar.d.size(); i10++) {
            ((op) npVar.d.get(i10)).c = this.N ? 1 : 0;
        }
        npVar.l();
    }

    public final boolean v() {
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        fg.b bVar = c4Var != null ? c4Var.c : null;
        if (bVar == null) {
            bVar = fg.b.d("❌");
        }
        org.telegram.ui.ActionBar.c4 c4Var2 = this.M.a;
        fg.b bVar2 = c4Var2 != null ? c4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = fg.b.d("❌");
        }
        return !fg.b.a(bVar, bVar2);
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
            chatThemeController.requestAllChatThemes(new kp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new lp(this, chatThemeController));
        }
    }

    public final void x(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        op opVar = new op((org.telegram.ui.ActionBar.c4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.V) {
            org.telegram.ui.ActionBar.c4 c4Var = this.n.f;
            this.W = c4Var;
            if (c4Var != null) {
                c4Var.l();
            }
        }
        arrayList.add(0, opVar);
        if (!this.V) {
            this.M = opVar;
        }
        org.telegram.ui.ActionBar.c4 c4Var2 = this.W;
        fg.b bVar = c4Var2 != null ? c4Var2.c : null;
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.c4 c4Var3 = (org.telegram.ui.ActionBar.c4) list.get(i10);
            op opVar2 = new op(c4Var3);
            c4Var3.n(this.currentAccount);
            opVar2.c = this.N ? 1 : 0;
            if (fg.b.a(c4Var3.c, bVar)) {
                arrayList.add(1, opVar2);
                z10 = true;
            } else {
                arrayList.add(opVar2);
            }
        }
        org.telegram.ui.ActionBar.c4 c4Var4 = this.W;
        if (c4Var4 != null && !z10) {
            op opVar3 = new op(c4Var4);
            c4Var4.n(this.currentAccount);
            opVar3.c = this.N ? 1 : 0;
            arrayList.add(1, opVar3);
        }
        np npVar = this.h;
        npVar.d = arrayList;
        npVar.l();
        this.G.setVisibility(0);
        if (!this.V) {
            z(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.V = true;
        D(true);
    }

    public final void y() {
        if (isDismissed() || this.O) {
            return;
        }
        this.P = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = v() ? null : this.f;
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        if (c4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.N), false);
        } else {
            this.n.i(c4Var, wallPaper, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void z(boolean z10) {
        np npVar = this.h;
        ArrayList arrayList = npVar.d;
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        s4.c0 c0Var = this.x;
        zl0 zl0Var = this.w;
        if (c4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (fg.b.a(((op) arrayList.get(i10)).a.c, this.W.c)) {
                        this.M = (op) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.Q = i10;
                npVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, npVar.d.size() - 1);
                if (z10) {
                    zl0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (op) arrayList.get(0);
            npVar.E(0);
            if (z10) {
                zl0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }
}
