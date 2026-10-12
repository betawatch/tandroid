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
import org.telegram.ui.ce1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zp extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i0 = 0;
    public final TextView E;
    public final yj0 F;
    public final sp G;
    public final tp H;
    public final View I;
    public final s6 J;
    public final s6 K;
    public final TextView L;
    public yp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public di.sb R;
    public float S;
    public ValueAnimator T;
    public v40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.b4 W;
    public org.telegram.ui.ActionBar.m2 X;
    public vi Y;
    public ah.v Z;
    public s6 a0;
    public final ImageView b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.f2 c;
    public br c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public boolean e0;
    public TLRPC.WallPaper f;
    public TL_stories.TL_premium_boostsStatus f0;
    public float g0;
    public final xp h;
    public ValueAnimator h0;
    public final org.telegram.ui.co n;
    public final org.telegram.ui.ActionBar.b4 r;
    public final boolean s;
    public final org.telegram.ui.fo v;
    public final mm0 w;
    public final s4.b0 x;
    public final f10 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(org.telegram.ui.fo foVar, org.telegram.ui.co coVar) {
        super(1, (Context) foVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) coVar, true);
        String str;
        int i10 = 1;
        this.Q = -1;
        this.d0 = false;
        this.e0 = false;
        this.g0 = 0.0f;
        this.v = foVar;
        this.n = coVar;
        this.r = coVar.f;
        this.f = coVar.h;
        this.s = org.telegram.ui.ActionBar.g6.I.q();
        xp xpVar = new xp(this.currentAccount, foVar.a(), coVar, 0);
        this.h = xpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.g6.i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.c = f2Var;
        imageView.setImageDrawable(f2Var);
        imageView.setOnClickListener(new ip(this, i10));
        frameLayout.addView(imageView, w7.a6.a(44.0f, 4.0f, -2.0f, 62.0f, 12.0f, 44, 8388659));
        frameLayout.addView(textView, w7.a6.a(-2.0f, 44.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        yj0 yj0Var = new yj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = yj0Var;
        this.N = !org.telegram.ui.ActionBar.g6.I.q();
        D(org.telegram.ui.ActionBar.g6.I.q(), false);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        sp spVar = new sp(this, getContext());
        this.G = spVar;
        spVar.setAnimation(yj0Var);
        spVar.setScaleType(ImageView.ScaleType.CENTER);
        spVar.setOnClickListener(new ip(this, 2));
        frameLayout.addView(spVar, w7.a6.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        this.H = new tp(getContext());
        mm0 mm0Var = new mm0(getContext(), null);
        this.w = mm0Var;
        mm0Var.setAdapter(xpVar);
        mm0Var.setDrawSelection(false);
        mm0Var.setClipChildren(false);
        mm0Var.setClipToPadding(false);
        mm0Var.setHasFixedSize(true);
        mm0Var.setItemAnimator(null);
        mm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.b0 b0Var = new s4.b0(0, false);
        this.x = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        mm0Var.setOnItemClickListener(new j(this, i13));
        mm0Var.setOnScrollListener(new ah.d0(this, 25));
        f10 f10Var = new f10(getContext(), this.resourcesProvider);
        this.y = f10Var;
        f10Var.setViewType(14);
        f10Var.setVisibility(0);
        frameLayout.addView(f10Var, w7.a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        frameLayout.addView(mm0Var, w7.a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new ip(this, i13));
        frameLayout.addView(view, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
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
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 8));
        frameLayout.addView(textView2, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        s6 s6Var = new s6(getContext(), true, true, true);
        this.J = s6Var;
        s6Var.getDrawable().q(true);
        s6Var.n = false;
        s6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.g6.Sh;
        s6Var.setTextColor(getThemedColor(i14));
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(s6Var, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        s6 s6Var2 = new s6(getContext(), true, true, true);
        this.K = s6Var2;
        s6Var2.getDrawable().q(true);
        s6Var2.n = false;
        s6Var2.setGravity(17);
        s6Var2.setTextColor(getThemedColor(i14));
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var2.setAlpha(0.0f);
        s6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(s6Var2, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.xf(this, foVar));
            frameLayout.addView(textView3, w7.a6.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (foVar.i() != null) {
                str = UserObject.getFirstName(foVar.i());
            } else {
                TLRPC.Chat chat = foVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.a6.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
        }
        F();
        G(false);
    }

    public static void n(zp zpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (zpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.fo foVar = zpVar.v;
        sg.j0 j0Var = new sg.j0(22, zpVar.currentAccount, zpVar.getContext(), foVar, zpVar.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(zpVar.f0, true);
        j0Var.I1(zpVar.v.a());
        j0Var.Q0 = new hp(zpVar, 2);
        j0Var.show();
    }

    public static /* synthetic */ void o(zp zpVar, org.telegram.ui.fo foVar) {
        if (zpVar.f == null) {
            zpVar.dismiss();
            return;
        }
        zpVar.f = null;
        zpVar.dismiss();
        ChatThemeController.getInstance(zpVar.currentAccount).clearWallpaper(foVar.a(), true);
    }

    public static void q(zp zpVar, View view, int i10) {
        lr0 lr0Var;
        mm0 mm0Var = zpVar.w;
        xp xpVar = zpVar.h;
        if (xpVar.d.get(i10) == zpVar.M || zpVar.R != null) {
            return;
        }
        zpVar.M = (yp) xpVar.d.get(i10);
        zpVar.A();
        xpVar.E(i10);
        zpVar.containerView.postDelayed(new kf(zpVar, i10, 1), 100L);
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            v21 v21Var = (v21) mm0Var.getChildAt(i11);
            if (v21Var != view && (lr0Var = v21Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(lr0Var);
                v21Var.J.run();
            }
        }
        if (!((yp) xpVar.d.get(i10)).a.a) {
            ((v21) view).d();
        }
        zpVar.G(true);
    }

    public static void s(zp zpVar, ce1 ce1Var) {
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
        k2Var.a = true;
        org.telegram.ui.fo foVar = zpVar.v;
        ce1Var.a.a = foVar.getResourceProvider();
        ce1Var.p1 = new rp(zpVar);
        k2Var.c = new ve(4);
        k2Var.d = new hp(zpVar, 5);
        k2Var.b = new hp(zpVar, 6);
        k2Var.e = true;
        zpVar.X = ce1Var;
        foVar.showAsSheet(ce1Var, k2Var);
    }

    public final void A() {
        if (isDismissed() || this.O) {
            return;
        }
        this.P = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = x() ? null : this.f;
        org.telegram.ui.ActionBar.b4 b4Var = this.M.a;
        if (b4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.N), false);
        } else {
            this.n.i(b4Var, wallPaper, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void B(boolean z10) {
        xp xpVar = this.h;
        ArrayList arrayList = xpVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        s4.b0 b0Var = this.x;
        mm0 mm0Var = this.w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (gg.b.a(((yp) arrayList.get(i10)).a.c, this.W.c)) {
                        this.M = (yp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.Q = i10;
                xpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, xpVar.d.size() - 1);
                if (z10) {
                    mm0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (yp) arrayList.get(0);
            xpVar.E(0);
            if (z10) {
                mm0Var.x0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        A();
    }

    public final void D(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        sp spVar = this.G;
        yj0 yj0Var = this.F;
        if (z11) {
            yj0Var.P(z10 ? yj0Var.e[0] : 0);
            if (spVar != null) {
                spVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? yj0Var.e[0] - 1 : 0;
        yj0Var.N(i10, false, true);
        yj0Var.P(i10);
        if (spVar != null) {
            spVar.invalidate();
        }
    }

    public final void E(boolean z10) {
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
        sp spVar = this.G;
        spVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        spVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        spVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        di.sb sbVar = new di.sb(this, getContext(), z10, canvas, (spVar.getMeasuredWidth() / 2.0f) + f7, (spVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = sbVar;
        sbVar.setOnTouchListener(new ci.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new lp(this));
        this.T.addListener(new l6(this, 14));
        this.T.setDuration(400L);
        this.T.setInterpolator(xt.e);
        this.T.start();
        frameLayout2.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.t(24, this, z10));
    }

    public final void F() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.g6.p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.g6.g0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        f2Var.a(themedColor);
        f2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.b4 b4Var;
        org.telegram.ui.fo foVar = this.v;
        TLRPC.Chat chat = foVar.e;
        int i10 = 0;
        if (chat != null && !this.d0 && !this.e0 && this.f0 == null) {
            this.d0 = true;
            foVar.getMessagesController().getBoostsController().getBoostsStats(foVar.a(), new jp(this, i10));
        }
        boolean z13 = this.V;
        f10 f10Var = this.y;
        TextView textView = this.e;
        s6 s6Var = this.K;
        TextView textView2 = this.d;
        TextView textView3 = this.L;
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        View view = this.I;
        s6 s6Var2 = this.J;
        if (!z13) {
            f2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(f10Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(f10Var, false, 1.0f, true, z10);
        if (!x()) {
            f2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        f2Var.c(0.0f, z10);
        view.setEnabled(true);
        yp ypVar = this.M;
        if (ypVar == null || (b4Var = ypVar.a) == null || !b4Var.a) {
            s6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.f0) != null && tL_premium_boostsStatus.level < foVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.c0 == null) {
                    br brVar = new br(R.drawable.mini_switch_lock, 0);
                    this.c0 = brVar;
                    brVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.c0, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", foVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                s6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || s6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h0 = null;
                }
                if (z12) {
                    this.g0 = z11 ? 1.0f : 0.0f;
                    s6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.g0);
                } else {
                    float f7 = this.g0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[r17] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.h0 = ofFloat;
                    ofFloat.addUpdateListener(new n6(this, 14));
                    this.h0.addListener(new org.telegram.ui.vo(6, this, z11));
                    this.h0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                AndroidUtilities.updateViewVisibilityAnimated(view, z14, 1.0f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(s6Var2, z14, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(s6Var, z11, 0.9f, false, 0.7f, z10, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, z14, 0.9f, false, z10);
            }
        } else {
            s6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
        }
        r17 = 1;
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
        boolean z142 = r17;
        AndroidUtilities.updateViewVisibilityAnimated(view, z142, 1.0f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(s6Var2, z142, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(s6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new hp(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        org.telegram.ui.ActionBar.f6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.co coVar = this.n;
            TLRPC.WallPaper wallPaper = coVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            coVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.N != this.s) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.s) {
                O0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string) != null && !org.telegram.ui.ActionBar.g6.O0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string2) != null && org.telegram.ui.ActionBar.g6.O0(string2).q()) {
                    str2 = string2;
                }
                O0 = this.s ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
            }
            org.telegram.ui.ActionBar.g6.t(O0, false, this.s);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        wp wpVar = new wp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.m2 m2Var = this.X;
            if (m2Var instanceof ce1) {
                arrayList.addAll(((ce1) m2Var).S0());
                return arrayList;
            }
        }
        vi viVar = this.Y;
        if (viVar != null) {
            arrayList.addAll(viVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, wpVar, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 16, new Class[]{v21.class}, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.i6) obj).o = this.n;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        v();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !x()) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x10 >= this.containerView.getLeft() && x10 <= this.containerView.getRight()) {
            return false;
        }
        this.v.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onContainerTranslationYChanged(float f7) {
        v40 v40Var = this.U;
        if (v40Var != null) {
            v40Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
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
            z(chatThemeController.getEmojiThemes(7));
        } else {
            y();
        }
        org.telegram.ui.fo foVar = this.v;
        if (foVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || foVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        v40 v40Var = new v40(9, getContext(), foVar.getResourceProvider(), false);
        this.U = v40Var;
        v40Var.setVisibility(4);
        this.U.setShowingDuration(5000L);
        this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.N) {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new hp(this, 7), 1500L);
        this.container.addView(this.U, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
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
    public final void u(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z11;
        TLRPC.User i10;
        boolean z12;
        if (this.d0) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f0;
        int i11 = 1;
        org.telegram.ui.fo foVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < foVar.getMessagesController().channelWallpaperLevelMin) {
            foVar.getMessagesController().getBoostsController().userCanBoostChannel(foVar.a(), this.f0, new jp(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.M.a;
        sc scVar = null;
        if (b4Var != this.W) {
            TLRPC.ChatTheme chatTheme = !b4Var.a ? b4Var.d : null;
            long giftThemeUser = b4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = b4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        g5.m0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new hp(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(foVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(foVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !x() ? null : this.n.h;
                    z11 = b4Var.a;
                    boolean z13 = this.s;
                    if (z11) {
                        this.n.i(b4Var, wallPaper, true, Boolean.valueOf(z13), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z13), false);
                    }
                    this.O = true;
                    i10 = foVar.i();
                    if (i10 != null && !i10.self) {
                        z12 = b4Var.a;
                        yx0 yx0Var = new yx0(getContext(), null, 1, -1, b4Var.f(), foVar.getResourceProvider());
                        yx0Var.c.setVisibility(8);
                        TextView textView = yx0Var.b;
                        if (z12) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        scVar = sc.g(foVar, yx0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(foVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(foVar.a(), chatTheme, true);
            if (!x()) {
            }
            z11 = b4Var.a;
            boolean z132 = this.s;
            if (z11) {
            }
            this.O = true;
            i10 = foVar.i();
            if (i10 != null) {
                z12 = b4Var.a;
                yx0 yx0Var2 = new yx0(getContext(), null, 1, -1, b4Var.f(), foVar.getResourceProvider());
                yx0Var2.c.setVisibility(8);
                TextView textView2 = yx0Var2.b;
                if (z12) {
                }
                textView2.setTypeface(null);
                scVar = sc.g(foVar, yx0Var2, 2750);
            }
        }
        dismiss();
        if (scVar != null) {
            scVar.j();
        }
    }

    public final void v() {
        if (!x()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.kp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.u(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.kp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.u(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void w() {
        if (isDismissed() || this.O) {
            return;
        }
        org.telegram.ui.ActionBar.g6.b = false;
        TLRPC.WallPaper wallPaper = x() ? null : this.n.h;
        org.telegram.ui.ActionBar.b4 b4Var = this.M.a;
        if (b4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.N), true);
        } else {
            this.n.i(b4Var, wallPaper, false, Boolean.valueOf(this.N), true);
        }
        vi viVar = this.Y;
        if (viVar != null) {
            kj kjVar = viVar.r0;
            if (kjVar != null) {
                boolean z10 = this.N;
                bb bbVar = kjVar.v;
                ((ArrayList) bbVar.e).clear();
                WallpapersListActivity.z0((ArrayList) bbVar.e, z10);
                bbVar.l();
            }
            this.Y.e1();
        }
        xp xpVar = this.h;
        if (xpVar == null || xpVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < xpVar.d.size(); i10++) {
            ((yp) xpVar.d.get(i10)).c = this.N ? 1 : 0;
        }
        xpVar.l();
    }

    public final boolean x() {
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        gg.b bVar = b4Var != null ? b4Var.c : null;
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.M.a;
        gg.b bVar2 = b4Var2 != null ? b4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (this.b0) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.b0 = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new up(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new vp(this, chatThemeController));
        }
    }

    public final void z(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yp ypVar = new yp((org.telegram.ui.ActionBar.b4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.V) {
            org.telegram.ui.ActionBar.b4 b4Var = this.n.f;
            this.W = b4Var;
            if (b4Var != null) {
                b4Var.l();
            }
        }
        arrayList.add(0, ypVar);
        if (!this.V) {
            this.M = ypVar;
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.W;
        gg.b bVar = b4Var2 != null ? b4Var2.c : null;
        boolean z10 = false;
        int i10 = 1;
        while (i10 < list.size()) {
            org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
            yp ypVar2 = new yp(b4Var3);
            b4Var3.n(this.currentAccount);
            ypVar2.c = this.N ? 1 : 0;
            if (gg.b.a(b4Var3.c, bVar)) {
                arrayList.add(1, ypVar2);
                z10 = true;
            } else {
                arrayList.add(ypVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.b4 b4Var4 = this.W;
        if (b4Var4 != null && !z10) {
            yp ypVar3 = new yp(b4Var4);
            b4Var4.n(this.currentAccount);
            ypVar3.c = this.N ? 1 : 0;
            arrayList.add(1, ypVar3);
        }
        xp xpVar = this.h;
        xpVar.d = arrayList;
        xpVar.l();
        this.G.setVisibility(0);
        if (!this.V) {
            B(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.V = true;
        G(true);
    }
}
