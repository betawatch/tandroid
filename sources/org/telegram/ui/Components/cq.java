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
import org.telegram.ui.xd1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cq extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i0 = 0;
    public final TextView E;
    public final ck0 F;
    public final vp G;
    public final wp H;
    public final View I;
    public final r6 J;
    public final r6 K;
    public final TextView L;
    public bq M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.tb R;
    public float S;
    public ValueAnimator T;
    public z40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.c4 W;
    public org.telegram.ui.ActionBar.n2 X;
    public yi Y;
    public ci.m6 Z;
    public r6 a0;
    public final ImageView b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.g2 c;
    public er c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public boolean e0;
    public TLRPC.WallPaper f;
    public TL_stories.TL_premium_boostsStatus f0;
    public float g0;
    public final aq h;
    public ValueAnimator h0;
    public final org.telegram.ui.xn n;
    public final org.telegram.ui.ActionBar.c4 r;
    public final boolean s;
    public final org.telegram.ui.zn v;
    public final qm0 w;
    public final s4.d0 x;
    public final j10 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(org.telegram.ui.zn znVar, org.telegram.ui.xn xnVar) {
        super(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) xnVar, true);
        String str;
        int i10 = 1;
        this.Q = -1;
        this.d0 = false;
        this.e0 = false;
        this.g0 = 0.0f;
        this.v = znVar;
        this.n = xnVar;
        this.r = xnVar.f;
        this.f = xnVar.h;
        this.s = org.telegram.ui.ActionBar.i6.I.q();
        aq aqVar = new aq(this.currentAccount, znVar.a(), xnVar, 0);
        this.h = aqVar;
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
        imageView.setOnClickListener(new lp(this, i10));
        frameLayout.addView(imageView, w7.x5.a(44.0f, 4.0f, -2.0f, 62.0f, 12.0f, 44, 8388659));
        frameLayout.addView(textView, w7.x5.a(-2.0f, 44.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        ck0 ck0Var = new ck0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = ck0Var;
        this.N = !org.telegram.ui.ActionBar.i6.I.q();
        D(org.telegram.ui.ActionBar.i6.I.q(), false);
        ck0Var.J(true);
        ck0Var.h = true;
        ck0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        vp vpVar = new vp(this, getContext());
        this.G = vpVar;
        vpVar.setAnimation(ck0Var);
        vpVar.setScaleType(ImageView.ScaleType.CENTER);
        vpVar.setOnClickListener(new lp(this, 2));
        frameLayout.addView(vpVar, w7.x5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        this.H = new wp(getContext());
        qm0 qm0Var = new qm0(getContext(), null);
        this.w = qm0Var;
        qm0Var.setAdapter(aqVar);
        qm0Var.setDrawSelection(false);
        qm0Var.setClipChildren(false);
        qm0Var.setClipToPadding(false);
        qm0Var.setHasFixedSize(true);
        qm0Var.setItemAnimator(null);
        qm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.d0 d0Var = new s4.d0(0, false);
        this.x = d0Var;
        qm0Var.setLayoutManager(d0Var);
        qm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        qm0Var.setOnItemClickListener(new j(this, i13));
        qm0Var.setOnScrollListener(new ai.r(this, 24));
        j10 j10Var = new j10(getContext(), this.resourcesProvider);
        this.y = j10Var;
        j10Var.setViewType(14);
        j10Var.setVisibility(0);
        frameLayout.addView(j10Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        frameLayout.addView(qm0Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.i6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.i6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new lp(this, i13));
        frameLayout.addView(view, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
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
        frameLayout.addView(textView2, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var = new r6(getContext(), true, true, true);
        this.J = r6Var;
        r6Var.getDrawable().q(true);
        r6Var.n = false;
        r6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.i6.Sh;
        r6Var.setTextColor(getThemedColor(i14));
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(r6Var, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var2 = new r6(getContext(), true, true, true);
        this.K = r6Var2;
        r6Var2.getDrawable().q(true);
        r6Var2.n = false;
        r6Var2.setGravity(17);
        r6Var2.setTextColor(getThemedColor(i14));
        r6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        r6Var2.setAlpha(0.0f);
        r6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(r6Var2, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.sf(this, znVar));
            frameLayout.addView(textView3, w7.x5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (znVar.i() != null) {
                str = UserObject.getFirstName(znVar.i());
            } else {
                TLRPC.Chat chat = znVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.x5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
        }
        F();
        G(false);
    }

    public static void o(cq cqVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (cqVar.getContext() == null) {
            return;
        }
        org.telegram.ui.zn znVar = cqVar.v;
        rg.j0 j0Var = new rg.j0(22, cqVar.currentAccount, cqVar.getContext(), znVar, cqVar.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(cqVar.f0, true);
        j0Var.I1(cqVar.v.a());
        j0Var.Q0 = new kp(cqVar, 2);
        j0Var.show();
    }

    public static /* synthetic */ void p(cq cqVar, org.telegram.ui.zn znVar) {
        if (cqVar.f == null) {
            cqVar.dismiss();
            return;
        }
        cqVar.f = null;
        cqVar.dismiss();
        ChatThemeController.getInstance(cqVar.currentAccount).clearWallpaper(znVar.a(), true);
    }

    public static void q(cq cqVar, View view, int i10) {
        or0 or0Var;
        qm0 qm0Var = cqVar.w;
        aq aqVar = cqVar.h;
        if (aqVar.d.get(i10) == cqVar.M || cqVar.R != null) {
            return;
        }
        cqVar.M = (bq) aqVar.d.get(i10);
        cqVar.B();
        aqVar.E(i10);
        cqVar.containerView.postDelayed(new lf(cqVar, i10, 1), 100L);
        for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
            z21 z21Var = (z21) qm0Var.getChildAt(i11);
            if (z21Var != view && (or0Var = z21Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(or0Var);
                z21Var.J.run();
            }
        }
        if (!((bq) aqVar.d.get(i10)).a.a) {
            ((z21) view).d();
        }
        cqVar.G(true);
    }

    public static void s(cq cqVar, xd1 xd1Var) {
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        org.telegram.ui.zn znVar = cqVar.v;
        xd1Var.a.a = znVar.getResourceProvider();
        xd1Var.p1 = new up(cqVar);
        l2Var.c = new vh(3);
        l2Var.d = new kp(cqVar, 5);
        l2Var.b = new kp(cqVar, 6);
        l2Var.e = true;
        cqVar.X = xd1Var;
        znVar.showAsSheet(xd1Var, l2Var);
    }

    public final void B() {
        if (isDismissed() || this.O) {
            return;
        }
        this.P = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = x() ? null : this.f;
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        if (c4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.N), false);
        } else {
            this.n.i(c4Var, wallPaper, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void C(boolean z10) {
        aq aqVar = this.h;
        ArrayList arrayList = aqVar.d;
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        s4.d0 d0Var = this.x;
        qm0 qm0Var = this.w;
        if (c4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (fg.b.a(((bq) arrayList.get(i10)).a.c, this.W.c)) {
                        this.M = (bq) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.Q = i10;
                aqVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, aqVar.d.size() - 1);
                if (z10) {
                    qm0Var.x0(min);
                } else {
                    d0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (bq) arrayList.get(0);
            aqVar.E(0);
            if (z10) {
                qm0Var.x0(0);
            } else {
                d0Var.h1(0, 0);
            }
        }
        B();
    }

    public final void D(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        vp vpVar = this.G;
        ck0 ck0Var = this.F;
        if (z11) {
            ck0Var.P(z10 ? ck0Var.e[0] : 0);
            if (vpVar != null) {
                vpVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? ck0Var.e[0] - 1 : 0;
        ck0Var.N(i10, false, true);
        ck0Var.P(i10);
        if (vpVar != null) {
            vpVar.invalidate();
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
        vp vpVar = this.G;
        vpVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        vpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        vpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.tb tbVar = new ci.tb(this, getContext(), z10, canvas, (vpVar.getMeasuredWidth() / 2.0f) + f7, (vpVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = tbVar;
        tbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new op(this));
        this.T.addListener(new t8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(au.e);
        this.T.start();
        frameLayout2.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(23, this, z10));
    }

    public final void F() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.i6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.i6.p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.i6.g0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp3, dp3, dp3, dp3, 0, k12, k12));
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
        org.telegram.ui.ActionBar.c4 c4Var;
        org.telegram.ui.zn znVar = this.v;
        TLRPC.Chat chat = znVar.e;
        int i10 = 0;
        if (chat != null && !this.d0 && !this.e0 && this.f0 == null) {
            this.d0 = true;
            znVar.getMessagesController().getBoostsController().getBoostsStats(znVar.a(), new mp(this, i10));
        }
        boolean z13 = this.V;
        j10 j10Var = this.y;
        TextView textView = this.e;
        r6 r6Var = this.K;
        TextView textView2 = this.d;
        TextView textView3 = this.L;
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        View view = this.I;
        r6 r6Var2 = this.J;
        if (!z13) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(r6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(r6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j10Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(j10Var, false, 1.0f, true, z10);
        if (!x()) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(r6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(r6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        g2Var.c(0.0f, z10);
        view.setEnabled(true);
        bq bqVar = this.M;
        if (bqVar == null || (c4Var = bqVar.a) == null || !c4Var.a) {
            r6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.f0) != null && tL_premium_boostsStatus.level < znVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.c0 == null) {
                    er erVar = new er(R.drawable.mini_switch_lock, 0);
                    this.c0 = erVar;
                    erVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.c0, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", znVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                r6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || r6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.h0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h0 = null;
                }
                if (z12) {
                    this.g0 = z11 ? 1.0f : 0.0f;
                    r6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.g0);
                } else {
                    float f7 = this.g0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[r17] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.h0 = ofFloat;
                    ofFloat.addUpdateListener(new m6(this, 14));
                    this.h0.addListener(new fa(5, this, z11));
                    this.h0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                AndroidUtilities.updateViewVisibilityAnimated(view, z14, 1.0f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(r6Var2, z14, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(r6Var, z11, 0.9f, false, 0.7f, z10, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, z14, 0.9f, false, z10);
            }
        } else {
            r6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
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
        AndroidUtilities.updateViewVisibilityAnimated(r6Var2, z142, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(r6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new kp(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        org.telegram.ui.ActionBar.h6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.xn xnVar = this.n;
            TLRPC.WallPaper wallPaper = xnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            xnVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.N != this.s) {
            if (org.telegram.ui.ActionBar.i6.I.q() == this.s) {
                O0 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string) != null && !org.telegram.ui.ActionBar.i6.O0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string2) != null && org.telegram.ui.ActionBar.i6.O0(string2).q()) {
                    str2 = string2;
                }
                O0 = this.s ? org.telegram.ui.ActionBar.i6.O0(str2) : org.telegram.ui.ActionBar.i6.O0(str);
            }
            org.telegram.ui.ActionBar.i6.t(O0, false, this.s);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        zp zpVar = new zp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof xd1) {
                arrayList.addAll(((xd1) n2Var).S0());
                return arrayList;
            }
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            arrayList.addAll(yiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, zpVar, org.telegram.ui.ActionBar.i6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.w, 16, new Class[]{z21.class}, null, null, null, org.telegram.ui.ActionBar.i6.i5));
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
        v();
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f7) {
        z40 z40Var = this.U;
        if (z40Var != null) {
            z40Var.b(true);
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
            z(chatThemeController.getEmojiThemes(7));
        } else {
            y();
        }
        org.telegram.ui.zn znVar = this.v;
        if (znVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || znVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        z40 z40Var = new z40(9, getContext(), znVar.getResourceProvider(), false);
        this.U = z40Var;
        z40Var.setVisibility(4);
        this.U.setShowingDuration(5000L);
        this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.N) {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new kp(this, 7), 1500L);
        this.container.addView(this.U, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
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
        org.telegram.ui.zn znVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < znVar.getMessagesController().channelWallpaperLevelMin) {
            znVar.getMessagesController().getBoostsController().userCanBoostChannel(znVar.a(), this.f0, new mp(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        tc tcVar = null;
        if (c4Var != this.W) {
            TLRPC.ChatTheme chatTheme = !c4Var.a ? c4Var.d : null;
            long giftThemeUser = c4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(c4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) c4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = c4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        g5.m0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new kp(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(znVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(znVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !x() ? null : this.n.h;
                    z11 = c4Var.a;
                    boolean z13 = this.s;
                    if (z11) {
                        this.n.i(c4Var, wallPaper, true, Boolean.valueOf(z13), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z13), false);
                    }
                    this.O = true;
                    i10 = znVar.i();
                    if (i10 != null && !i10.self) {
                        z12 = c4Var.a;
                        cy0 cy0Var = new cy0(getContext(), null, 1, -1, c4Var.f(), znVar.getResourceProvider());
                        cy0Var.c.setVisibility(8);
                        TextView textView = cy0Var.b;
                        if (z12) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        tcVar = tc.g(znVar, cy0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(znVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(znVar.a(), chatTheme, true);
            if (!x()) {
            }
            z11 = c4Var.a;
            boolean z132 = this.s;
            if (z11) {
            }
            this.O = true;
            i10 = znVar.i();
            if (i10 != null) {
                z12 = c4Var.a;
                cy0 cy0Var2 = new cy0(getContext(), null, 1, -1, c4Var.f(), znVar.getResourceProvider());
                cy0Var2.c.setVisibility(8);
                TextView textView2 = cy0Var2.b;
                if (z12) {
                }
                textView2.setTypeface(null);
                tcVar = tc.g(znVar, cy0Var2, 2750);
            }
        }
        dismiss();
        if (tcVar != null) {
            tcVar.j();
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.np
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.Components.np
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
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
        org.telegram.ui.ActionBar.i6.b = false;
        TLRPC.WallPaper wallPaper = x() ? null : this.n.h;
        org.telegram.ui.ActionBar.c4 c4Var = this.M.a;
        if (c4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.N), true);
        } else {
            this.n.i(c4Var, wallPaper, false, Boolean.valueOf(this.N), true);
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            nj njVar = yiVar.r0;
            if (njVar != null) {
                boolean z10 = this.N;
                cb cbVar = njVar.v;
                ((ArrayList) cbVar.e).clear();
                WallpapersListActivity.z0((ArrayList) cbVar.e, z10);
                cbVar.l();
            }
            this.Y.e1();
        }
        aq aqVar = this.h;
        if (aqVar == null || aqVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < aqVar.d.size(); i10++) {
            ((bq) aqVar.d.get(i10)).c = this.N ? 1 : 0;
        }
        aqVar.l();
    }

    public final boolean x() {
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
            chatThemeController.requestAllChatThemes(new xp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new yp(this, chatThemeController));
        }
    }

    public final void z(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bq bqVar = new bq((org.telegram.ui.ActionBar.c4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.V) {
            org.telegram.ui.ActionBar.c4 c4Var = this.n.f;
            this.W = c4Var;
            if (c4Var != null) {
                c4Var.l();
            }
        }
        arrayList.add(0, bqVar);
        if (!this.V) {
            this.M = bqVar;
        }
        org.telegram.ui.ActionBar.c4 c4Var2 = this.W;
        fg.b bVar = c4Var2 != null ? c4Var2.c : null;
        boolean z10 = false;
        int i10 = 1;
        while (i10 < list.size()) {
            org.telegram.ui.ActionBar.c4 c4Var3 = (org.telegram.ui.ActionBar.c4) list.get(i10);
            bq bqVar2 = new bq(c4Var3);
            c4Var3.n(this.currentAccount);
            bqVar2.c = this.N ? 1 : 0;
            if (fg.b.a(c4Var3.c, bVar)) {
                arrayList.add(1, bqVar2);
                z10 = true;
            } else {
                arrayList.add(bqVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.c4 c4Var4 = this.W;
        if (c4Var4 != null && !z10) {
            bq bqVar3 = new bq(c4Var4);
            c4Var4.n(this.currentAccount);
            bqVar3.c = this.N ? 1 : 0;
            arrayList.add(1, bqVar3);
        }
        aq aqVar = this.h;
        aqVar.d = arrayList;
        aqVar.l();
        this.G.setVisibility(0);
        if (!this.V) {
            C(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.V = true;
        G(true);
    }
}
