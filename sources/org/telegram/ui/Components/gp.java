package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
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
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int e0 = 0;
    public final TextView A;
    public final xi0 B;
    public final zo C;
    public final ap D;
    public final View E;
    public final o6 F;
    public final o6 G;
    public final TextView H;
    public fp I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public nh.pa N;
    public float O;
    public ValueAnimator P;
    public g40 Q;
    public boolean R;
    public org.telegram.ui.ActionBar.b4 S;
    public org.telegram.ui.ActionBar.o2 T;
    public ni U;
    public bg.d1 V;
    public o6 W;
    public boolean X;
    public iq Y;
    public boolean Z;
    public boolean a0;
    public final ImageView b;
    public TL_stories.TL_premium_boostsStatus b0;
    public final org.telegram.ui.ActionBar.h2 c;
    public float c0;
    public final TextView d;
    public ValueAnimator d0;
    public final TextView e;
    public TLRPC.WallPaper f;
    public final ep h;
    public final org.telegram.ui.rn n;
    public final org.telegram.ui.ActionBar.b4 r;
    public final boolean s;
    public final org.telegram.ui.tn v;
    public final jl0 w;
    public final f2.j0 x;
    public final p00 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(org.telegram.ui.tn tnVar, org.telegram.ui.rn rnVar) {
        super(tnVar.getParentActivity(), rnVar, true, false);
        String str;
        int i10 = 1;
        this.M = -1;
        this.Z = false;
        this.a0 = false;
        this.c0 = 0.0f;
        this.v = tnVar;
        this.n = rnVar;
        this.r = rnVar.f;
        this.f = rnVar.h;
        this.s = org.telegram.ui.ActionBar.g6.I.q();
        ep epVar = new ep(this.currentAccount, tnVar.a(), rnVar, 0);
        this.h = epVar;
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
        this.A = textView;
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
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.c = h2Var;
        imageView.setImageDrawable(h2Var);
        imageView.setOnClickListener(new po(this, i10));
        frameLayout.addView(imageView, i7.f6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        xi0 xi0Var = new xi0(R.raw.sun_outline, "" + R.raw.sun_outline, dp2, dp2, false, null);
        this.B = xi0Var;
        this.J = org.telegram.ui.ActionBar.g6.I.q() ^ true;
        B(org.telegram.ui.ActionBar.g6.I.q(), false);
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        zo zoVar = new zo(this, getContext());
        this.C = zoVar;
        zoVar.setAnimation(xi0Var);
        zoVar.setScaleType(ImageView.ScaleType.CENTER);
        zoVar.setOnClickListener(new po(this, 2));
        frameLayout.addView(zoVar, i7.f6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.D = new ap(getContext());
        jl0 jl0Var = new jl0(getContext(), null);
        this.w = jl0Var;
        jl0Var.setAdapter(epVar);
        jl0Var.setDrawSelection(false);
        jl0Var.setClipChildren(false);
        jl0Var.setClipToPadding(false);
        jl0Var.setHasFixedSize(true);
        jl0Var.setItemAnimator(null);
        jl0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.j0 j0Var = new f2.j0(0, false);
        this.x = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        jl0Var.setOnItemClickListener(new k(this, i13));
        jl0Var.setOnScrollListener(new cg.g2(this, 27));
        p00 p00Var = new p00(getContext(), this.resourcesProvider);
        this.y = p00Var;
        p00Var.setViewType(14);
        p00Var.setVisibility(0);
        frameLayout.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(jl0Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.E = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new po(this, i13));
        frameLayout.addView(view, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.H = textView2;
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
        textView2.setOnClickListener(new androidx.mediarouter.app.v(this, 8));
        frameLayout.addView(textView2, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var = new o6(getContext(), true, true, true);
        this.F = o6Var;
        o6Var.getDrawable().n(true);
        o6Var.n = false;
        o6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.g6.Sh;
        o6Var.setTextColor(getThemedColor(i14));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(o6Var, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var2 = new o6(getContext(), true, true, true);
        this.G = o6Var2;
        o6Var2.getDrawable().n(true);
        o6Var2.n = false;
        o6Var2.setGravity(17);
        o6Var2.setTextColor(getThemedColor(i14));
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var2.setAlpha(0.0f);
        o6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(o6Var2, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new t2(13, this, tnVar));
            frameLayout.addView(textView3, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (tnVar.i() != null) {
                str = UserObject.getFirstName(tnVar.i());
            } else {
                TLRPC.Chat chat = tnVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, i7.f6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(gp gpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (gpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.tn tnVar = gpVar.v;
        cg.v0 v0Var = new cg.v0(22, gpVar.currentAccount, gpVar.getContext(), tnVar, gpVar.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(gpVar.b0, true);
        v0Var.H1(gpVar.v.a());
        v0Var.M0 = new oo(gpVar, 2);
        v0Var.show();
    }

    public static /* synthetic */ void n(gp gpVar, org.telegram.ui.tn tnVar) {
        if (gpVar.f == null) {
            gpVar.dismiss();
            return;
        }
        gpVar.f = null;
        gpVar.dismiss();
        ChatThemeController.getInstance(gpVar.currentAccount).clearWallpaper(tnVar.a(), true);
    }

    public static void o(gp gpVar, View view, int i10) {
        fq0 fq0Var;
        jl0 jl0Var = gpVar.w;
        ep epVar = gpVar.h;
        if (epVar.d.get(i10) == gpVar.I || gpVar.N != null) {
            return;
        }
        gpVar.I = (fp) epVar.d.get(i10);
        gpVar.y();
        epVar.E(i10);
        gpVar.containerView.postDelayed(new bf(gpVar, i10, 1), 100L);
        for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
            l11 l11Var = (l11) jl0Var.getChildAt(i11);
            if (l11Var != view && (fq0Var = l11Var.F) != null) {
                AndroidUtilities.cancelRunOnUIThread(fq0Var);
                l11Var.F.run();
            }
        }
        if (!((fp) epVar.d.get(i10)).a.a) {
            ((l11) view).d();
        }
        gpVar.E(true);
    }

    public static void q(gp gpVar, qc1 qc1Var) {
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        org.telegram.ui.tn tnVar = gpVar.v;
        qc1Var.a.a = tnVar.getResourceProvider();
        qc1Var.l1 = new yo(gpVar);
        m2Var.c = new g5(10);
        m2Var.d = new oo(gpVar, 5);
        m2Var.b = new oo(gpVar, 6);
        m2Var.e = true;
        gpVar.T = qc1Var;
        tnVar.showAsSheet(qc1Var, m2Var);
    }

    public final void A(boolean z10) {
        ep epVar = this.h;
        ArrayList arrayList = epVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        f2.j0 j0Var = this.x;
        jl0 jl0Var = this.w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (qf.b.a(((fp) arrayList.get(i10)).a.c, this.S.c)) {
                        this.I = (fp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.M = i10;
                epVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, epVar.d.size() - 1);
                if (z10) {
                    jl0Var.x0(min);
                } else {
                    j0Var.h1(min, 0);
                }
            }
        } else {
            this.I = (fp) arrayList.get(0);
            epVar.E(0);
            if (z10) {
                jl0Var.x0(0);
            } else {
                j0Var.h1(0, 0);
            }
        }
        y();
    }

    public final void B(boolean z10, boolean z11) {
        if (this.J == z10) {
            return;
        }
        this.J = z10;
        zo zoVar = this.C;
        xi0 xi0Var = this.B;
        if (z11) {
            xi0Var.N(z10 ? xi0Var.e[0] : 0);
            if (zoVar != null) {
                zoVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? xi0Var.e[0] - 1 : 0;
        xi0Var.L(i10, false, true);
        xi0Var.N(i10);
        if (zoVar != null) {
            zoVar.invalidate();
        }
    }

    public final void C(boolean z10) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.v.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        zo zoVar = this.C;
        zoVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        zoVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        zoVar.getLocationInWindow(iArr);
        float f9 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        nh.pa paVar = new nh.pa(this, getContext(), z10, canvas, (zoVar.getMeasuredWidth() / 2.0f) + f9, (zoVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f9, f10, 1);
        this.N = paVar;
        paVar.setOnTouchListener(new mh.d(16));
        this.O = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new so(this));
        this.P.addListener(new org.telegram.ui.bm(this, 19));
        this.P.setDuration(400L);
        this.P.setInterpolator(ct.e);
        this.P.start();
        frameLayout2.addView(this.N, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new hh.f(25, this, z10));
    }

    public final void D() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k9 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.g6.p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        }
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.g6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        h2Var.a(themedColor);
        h2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.C.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.m5);
        TextView textView3 = this.H;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k11 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        char c3;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.b4 b4Var;
        org.telegram.ui.tn tnVar = this.v;
        TLRPC.Chat chat = tnVar.e;
        int i10 = 0;
        if (chat != null && !this.Z && !this.a0 && this.b0 == null) {
            this.Z = true;
            tnVar.getMessagesController().getBoostsController().getBoostsStats(tnVar.a(), new qo(this, i10));
        }
        boolean z13 = this.R;
        p00 p00Var = this.y;
        TextView textView = this.e;
        o6 o6Var = this.G;
        TextView textView2 = this.d;
        TextView textView3 = this.H;
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        View view = this.E;
        o6 o6Var2 = this.F;
        if (!z13) {
            h2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(p00Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(p00Var, false, 1.0f, true, z10);
        if (!v()) {
            h2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(o6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        h2Var.c(0.0f, z10);
        view.setEnabled(true);
        fp fpVar = this.I;
        if (fpVar == null || (b4Var = fpVar.a) == null || !b4Var.a) {
            o6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.b0) != null && tL_premium_boostsStatus.level < tnVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.Y == null) {
                    iq iqVar = new iq(R.drawable.mini_switch_lock, 0);
                    this.Y = iqVar;
                    iqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.Y, 0, 1, 33);
                c3 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", tnVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                o6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = !z10 && o6Var2.getAlpha() > 0.8f;
                valueAnimator = this.d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.d0 = null;
                }
                if (z12) {
                    this.c0 = z11 ? 1.0f : 0.0f;
                    o6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.c0);
                } else {
                    float f9 = this.c0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f9;
                    fArr[c3] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.d0 = ofFloat;
                    ofFloat.addUpdateListener(new j6(this, 13));
                    this.d0.addListener(new z9(5, this, z11));
                    this.d0.start();
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
        c3 = 1;
        z11 = false;
        if (z10) {
        }
        valueAnimator = this.d0;
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
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new oo(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        org.telegram.ui.ActionBar.f6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.K) {
            org.telegram.ui.rn rnVar = this.n;
            TLRPC.WallPaper wallPaper = rnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            rnVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.J != this.s) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.s) {
                N0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) != null && !org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) != null && org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    str2 = string2;
                }
                N0 = this.s ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
            }
            org.telegram.ui.ActionBar.g6.t(N0, false, this.s);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        dp dpVar = new dp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.a7) {
            org.telegram.ui.ActionBar.o2 o2Var = this.T;
            if (o2Var instanceof qc1) {
                arrayList.addAll(((qc1) o2Var).S0());
                return arrayList;
            }
        }
        ni niVar = this.U;
        if (niVar != null) {
            arrayList.addAll(niVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, dpVar, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.w, 16, new Class[]{l11.class}, null, null, null, org.telegram.ui.ActionBar.g6.i5));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        View view = this.E;
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        t();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !v()) {
            return false;
        }
        int x4 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x4 >= this.containerView.getLeft() && x4 <= this.containerView.getRight()) {
            return false;
        }
        this.v.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerTranslationYChanged(float f9) {
        g40 g40Var = this.Q;
        if (g40Var != null) {
            g40Var.b(true);
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
        this.K = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.tn tnVar = this.v;
        if (tnVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || tnVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        g40 g40Var = new g40(9, getContext(), tnVar.getResourceProvider(), false);
        this.Q = g40Var;
        g40Var.setVisibility(4);
        this.Q.setShowingDuration(5000L);
        this.Q.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.J) {
            this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new oo(this, 7), 1500L);
        this.container.addView(this.Q, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
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
        if (this.Z) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        int i11 = 1;
        org.telegram.ui.tn tnVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < tnVar.getMessagesController().channelWallpaperLevelMin) {
            tnVar.getMessagesController().getBoostsController().userCanBoostChannel(tnVar.a(), this.b0, new qo(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.I.a;
        mc mcVar = null;
        if (b4Var != this.S) {
            TLRPC.ChatTheme chatTheme = !b4Var.a ? b4Var.d : null;
            long giftThemeUser = b4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = b4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        c5.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new oo(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(tnVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(tnVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !v() ? null : this.n.h;
                    z11 = b4Var.a;
                    boolean z13 = this.s;
                    if (z11) {
                        this.n.i(b4Var, wallPaper, true, Boolean.valueOf(z13), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z13), false);
                    }
                    this.K = true;
                    i10 = tnVar.i();
                    if (i10 != null && !i10.self) {
                        z12 = b4Var.a;
                        sw0 sw0Var = new sw0(getContext(), null, 1, -1, b4Var.f(), tnVar.getResourceProvider());
                        sw0Var.c.setVisibility(8);
                        TextView textView = sw0Var.b;
                        if (z12) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        mcVar = mc.g(tnVar, sw0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(tnVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(tnVar.a(), chatTheme, true);
            if (!v()) {
            }
            z11 = b4Var.a;
            boolean z132 = this.s;
            if (z11) {
            }
            this.K = true;
            i10 = tnVar.i();
            if (i10 != null) {
                z12 = b4Var.a;
                sw0 sw0Var2 = new sw0(getContext(), null, 1, -1, b4Var.f(), tnVar.getResourceProvider());
                sw0Var2.c.setVisibility(8);
                TextView textView2 = sw0Var2.b;
                if (z12) {
                }
                textView2.setTypeface(null);
                mcVar = mc.g(tnVar, sw0Var2, 2750);
            }
        }
        dismiss();
        if (mcVar != null) {
            mcVar.j();
        }
    }

    public final void t() {
        if (!v()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.ro
            public final /* synthetic */ gp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.ro
            public final /* synthetic */ gp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
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
        if (isDismissed() || this.K) {
            return;
        }
        org.telegram.ui.ActionBar.g6.b = false;
        TLRPC.WallPaper wallPaper = v() ? null : this.n.h;
        org.telegram.ui.ActionBar.b4 b4Var = this.I.a;
        if (b4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.J), true);
        } else {
            this.n.i(b4Var, wallPaper, false, Boolean.valueOf(this.J), true);
        }
        ni niVar = this.U;
        if (niVar != null) {
            bj bjVar = niVar.n0;
            if (bjVar != null) {
                boolean z10 = this.J;
                wa waVar = bjVar.v;
                ((ArrayList) waVar.e).clear();
                WallpapersListActivity.z0((ArrayList) waVar.e, z10);
                waVar.l();
            }
            this.U.c1();
        }
        ep epVar = this.h;
        if (epVar == null || epVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < epVar.d.size(); i10++) {
            ((fp) epVar.d.get(i10)).c = this.J ? 1 : 0;
        }
        epVar.l();
    }

    public final boolean v() {
        if (this.I == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        qf.b bVar = b4Var != null ? b4Var.c : null;
        if (bVar == null) {
            bVar = qf.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.I.a;
        qf.b bVar2 = b4Var2 != null ? b4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = qf.b.d("❌");
        }
        return !qf.b.a(bVar, bVar2);
    }

    public final void w() {
        if (this.X) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.X = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new bp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new cp(this, chatThemeController));
        }
    }

    public final void x(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fp fpVar = new fp((org.telegram.ui.ActionBar.b4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.R) {
            org.telegram.ui.ActionBar.b4 b4Var = this.n.f;
            this.S = b4Var;
            if (b4Var != null) {
                b4Var.l();
            }
        }
        arrayList.add(0, fpVar);
        if (!this.R) {
            this.I = fpVar;
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.S;
        qf.b bVar = b4Var2 != null ? b4Var2.c : null;
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
            fp fpVar2 = new fp(b4Var3);
            b4Var3.n(this.currentAccount);
            fpVar2.c = this.J ? 1 : 0;
            if (qf.b.a(b4Var3.c, bVar)) {
                arrayList.add(1, fpVar2);
                z10 = true;
            } else {
                arrayList.add(fpVar2);
            }
        }
        org.telegram.ui.ActionBar.b4 b4Var4 = this.S;
        if (b4Var4 != null && !z10) {
            fp fpVar3 = new fp(b4Var4);
            b4Var4.n(this.currentAccount);
            fpVar3.c = this.J ? 1 : 0;
            arrayList.add(1, fpVar3);
        }
        ep epVar = this.h;
        epVar.d = arrayList;
        epVar.l();
        this.C.setVisibility(0);
        if (!this.R) {
            A(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.R = true;
        E(true);
    }

    public final void y() {
        if (isDismissed() || this.K) {
            return;
        }
        this.L = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = v() ? null : this.f;
        org.telegram.ui.ActionBar.b4 b4Var = this.I.a;
        if (b4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.J), false);
        } else {
            this.n.i(b4Var, wallPaper, true, Boolean.valueOf(this.J), false);
        }
    }
}
