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
import org.telegram.ui.jd1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jp extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int f0 = 0;
    public final TextView B;
    public final gj0 C;
    public final bp D;
    public final cp E;
    public final View F;
    public final k6 G;
    public final k6 H;
    public final TextView I;
    public ip J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public to O;
    public float P;
    public ValueAnimator Q;
    public l40 R;
    public boolean S;
    public org.telegram.ui.ActionBar.e4 T;
    public org.telegram.ui.ActionBar.p2 U;
    public li V;
    public ah.e W;
    public k6 X;
    public boolean Y;
    public lq Z;
    public boolean a0;
    public final ImageView b;
    public boolean b0;
    public final org.telegram.ui.ActionBar.i2 c;
    public TL_stories.TL_premium_boostsStatus c0;
    public final TextView d;
    public float d0;
    public final TextView e;
    public ValueAnimator e0;
    public TLRPC.WallPaper f;
    public final hp h;
    public final org.telegram.ui.xn n;
    public final org.telegram.ui.ActionBar.e4 r;
    public final boolean s;
    public final org.telegram.ui.zn v;
    public final rl0 w;
    public final f2.i0 x;
    public final u00 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(org.telegram.ui.zn znVar, org.telegram.ui.xn xnVar) {
        super(znVar.getParentActivity(), xnVar, true, false);
        String str;
        int i10 = 1;
        this.N = -1;
        this.a0 = false;
        this.b0 = false;
        this.d0 = 0.0f;
        this.v = znVar;
        this.n = xnVar;
        this.r = xnVar.f;
        this.f = xnVar.h;
        this.s = org.telegram.ui.ActionBar.j6.I.q();
        hp hpVar = new hp(this.currentAccount, znVar.a(), xnVar, 0);
        this.h = hpVar;
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
        this.B = textView;
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
        imageView.setOnClickListener(new qo(this, i10));
        frameLayout.addView(imageView, k7.b6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        gj0 gj0Var = new gj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.C = gj0Var;
        this.K = !org.telegram.ui.ActionBar.j6.I.q();
        B(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        bp bpVar = new bp(this, getContext());
        this.D = bpVar;
        bpVar.setAnimation(gj0Var);
        bpVar.setScaleType(ImageView.ScaleType.CENTER);
        bpVar.setOnClickListener(new qo(this, 2));
        frameLayout.addView(bpVar, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.E = new cp(getContext());
        rl0 rl0Var = new rl0(getContext(), null);
        this.w = rl0Var;
        rl0Var.setAdapter(hpVar);
        rl0Var.setDrawSelection(false);
        rl0Var.setClipChildren(false);
        rl0Var.setClipToPadding(false);
        rl0Var.setHasFixedSize(true);
        rl0Var.setItemAnimator(null);
        rl0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.i0 i0Var = new f2.i0(0, false);
        this.x = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        rl0Var.setOnItemClickListener(new k(this, i13));
        rl0Var.setOnScrollListener(new eg.f2(this, 25));
        u00 u00Var = new u00(getContext(), this.resourcesProvider);
        this.y = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(rl0Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.F = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new qo(this, i13));
        frameLayout.addView(view, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.I = textView2;
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
        textView2.setOnClickListener(new androidx.mediarouter.app.y(this, 8));
        frameLayout.addView(textView2, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var = new k6(getContext(), true, true, true);
        this.G = k6Var;
        k6Var.getDrawable().n(true);
        k6Var.n = false;
        k6Var.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.j6.Sh;
        k6Var.setTextColor(getThemedColor(i14));
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(k6Var, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var2 = new k6(getContext(), true, true, true);
        this.H = k6Var2;
        k6Var2.getDrawable().n(true);
        k6Var2.n = false;
        k6Var2.setGravity(17);
        k6Var2.setTextColor(getThemedColor(i14));
        k6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var2.setAlpha(0.0f);
        k6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(k6Var2, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new w2(10, this, znVar));
            frameLayout.addView(textView3, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
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
            frameLayout.addView(textView4, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(jp jpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (jpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.zn znVar = jpVar.v;
        eg.v0 v0Var = new eg.v0(22, jpVar.currentAccount, jpVar.getContext(), znVar, jpVar.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(jpVar.c0, true);
        v0Var.H1(jpVar.v.a());
        v0Var.N0 = new po(jpVar, 2);
        v0Var.show();
    }

    public static /* synthetic */ void n(jp jpVar, org.telegram.ui.zn znVar) {
        if (jpVar.f == null) {
            jpVar.dismiss();
            return;
        }
        jpVar.f = null;
        jpVar.dismiss();
        ChatThemeController.getInstance(jpVar.currentAccount).clearWallpaper(znVar.a(), true);
    }

    public static void o(jp jpVar, View view, int i10) {
        nq0 nq0Var;
        rl0 rl0Var = jpVar.w;
        hp hpVar = jpVar.h;
        if (hpVar.d.get(i10) == jpVar.J || jpVar.O != null) {
            return;
        }
        jpVar.J = (ip) hpVar.d.get(i10);
        jpVar.y();
        hpVar.E(i10);
        jpVar.containerView.postDelayed(new ye(jpVar, i10, 1), 100L);
        for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
            w11 w11Var = (w11) rl0Var.getChildAt(i11);
            if (w11Var != view && (nq0Var = w11Var.G) != null) {
                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                w11Var.G.run();
            }
        }
        if (!((ip) hpVar.d.get(i10)).a.a) {
            ((w11) view).d();
        }
        jpVar.E(true);
    }

    public static void q(jp jpVar, jd1 jd1Var) {
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        org.telegram.ui.zn znVar = jpVar.v;
        jd1Var.a.a = znVar.getResourceProvider();
        jd1Var.m1 = new ap(jpVar);
        n2Var.c = new mc(6);
        n2Var.d = new po(jpVar, 5);
        n2Var.b = new po(jpVar, 6);
        n2Var.e = true;
        jpVar.U = jd1Var;
        znVar.showAsSheet(jd1Var, n2Var);
    }

    public final void A(boolean z4) {
        hp hpVar = this.h;
        ArrayList arrayList = hpVar.d;
        org.telegram.ui.ActionBar.e4 e4Var = this.T;
        f2.i0 i0Var = this.x;
        rl0 rl0Var = this.w;
        if (e4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (sf.b.a(((ip) arrayList.get(i10)).a.c, this.T.c)) {
                        this.J = (ip) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.N = i10;
                hpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, hpVar.d.size() - 1);
                if (z4) {
                    rl0Var.x0(min);
                } else {
                    i0Var.h1(min, 0);
                }
            }
        } else {
            this.J = (ip) arrayList.get(0);
            hpVar.E(0);
            if (z4) {
                rl0Var.x0(0);
            } else {
                i0Var.h1(0, 0);
            }
        }
        y();
    }

    public final void B(boolean z4, boolean z10) {
        if (this.K == z4) {
            return;
        }
        this.K = z4;
        bp bpVar = this.D;
        gj0 gj0Var = this.C;
        if (z10) {
            gj0Var.N(z4 ? gj0Var.e[0] : 0);
            if (bpVar != null) {
                bpVar.d();
                return;
            }
            return;
        }
        int i10 = z4 ? gj0Var.e[0] - 1 : 0;
        gj0Var.L(i10, false, true);
        gj0Var.N(i10);
        if (bpVar != null) {
            bpVar.invalidate();
        }
    }

    public final void C(boolean z4) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.v.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        bp bpVar = this.D;
        bpVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        bpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        bpVar.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        to toVar = new to(this, getContext(), z4, canvas, (bpVar.getMeasuredWidth() / 2.0f) + f10, (bpVar.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 0);
        this.O = toVar;
        toVar.setOnTouchListener(new oh.d(16));
        this.P = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new uo(this));
        this.Q.addListener(new a9(this, 10));
        this.Q.setDuration(400L);
        this.Q.setInterpolator(ft.e);
        this.Q.start();
        frameLayout2.addView(this.O, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new jh.f(20, this, z4));
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
        this.D.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.m5);
        TextView textView3 = this.I;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z4) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        char c3;
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.e4 e4Var;
        org.telegram.ui.zn znVar = this.v;
        TLRPC.Chat chat = znVar.e;
        int i10 = 0;
        if (chat != null && !this.a0 && !this.b0 && this.c0 == null) {
            this.a0 = true;
            znVar.getMessagesController().getBoostsController().getBoostsStats(znVar.a(), new ro(this, i10));
        }
        boolean z12 = this.S;
        u00 u00Var = this.y;
        TextView textView = this.e;
        k6 k6Var = this.H;
        TextView textView2 = this.d;
        TextView textView3 = this.I;
        org.telegram.ui.ActionBar.i2 i2Var = this.c;
        View view = this.F;
        k6 k6Var2 = this.G;
        if (!z12) {
            i2Var.c(1.0f, z4);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(k6Var2, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(k6Var, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, z4);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, z4);
        if (!v()) {
            i2Var.c(1.0f, z4);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(k6Var2, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(k6Var, false, 0.9f, false, z4);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z4);
            return;
        }
        i2Var.c(0.0f, z4);
        view.setEnabled(true);
        ip ipVar = this.J;
        if (ipVar == null || (e4Var = ipVar.a) == null || !e4Var.a) {
            k6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.c0) != null && tL_premium_boostsStatus.level < znVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.Z == null) {
                    lq lqVar = new lq(R.drawable.mini_switch_lock, 0);
                    this.Z = lqVar;
                    lqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.Z, 0, 1, 33);
                c3 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", znVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                k6Var.setText(spannableStringBuilder);
                z10 = true;
                z11 = !z4 && k6Var2.getAlpha() > 0.8f;
                valueAnimator = this.e0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.e0 = null;
                }
                if (z11) {
                    this.d0 = z10 ? 1.0f : 0.0f;
                    k6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.d0);
                } else {
                    float f10 = this.d0;
                    float f11 = z10 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f10;
                    fArr[c3] = f11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.e0 = ofFloat;
                    ofFloat.addUpdateListener(new f6(this, 13));
                    this.e0.addListener(new dg.w2(27, this, z10));
                    this.e0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z4);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z4);
                AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z4);
                AndroidUtilities.updateViewVisibilityAnimated(k6Var2, true, 0.9f, false, z4);
                AndroidUtilities.updateViewVisibilityAnimated(k6Var, z10, 0.9f, false, 0.7f, z4, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z4);
            }
        } else {
            k6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
        }
        c3 = 1;
        z10 = false;
        if (z4) {
        }
        valueAnimator = this.e0;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z4);
        AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z4);
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z4);
        AndroidUtilities.updateViewVisibilityAnimated(k6Var2, true, 0.9f, false, z4);
        AndroidUtilities.updateViewVisibilityAnimated(k6Var, z10, 0.9f, false, 0.7f, z4, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z4);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new po(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.L) {
            org.telegram.ui.xn xnVar = this.n;
            TLRPC.WallPaper wallPaper = xnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            xnVar.i(this.r, wallPaper, true, Boolean.valueOf(this.s), false);
        }
        if (this.K != this.s) {
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

    @Override // org.telegram.ui.ActionBar.g3
    public final ArrayList getThemeDescriptions() {
        fp fpVar = new fp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.b7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.U;
            if (p2Var instanceof jd1) {
                arrayList.addAll(((jd1) p2Var).S0());
                return arrayList;
            }
        }
        li liVar = this.V;
        if (liVar != null) {
            arrayList.addAll(liVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, fpVar, org.telegram.ui.ActionBar.j6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.w, 16, new Class[]{w11.class}, null, null, null, org.telegram.ui.ActionBar.j6.i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.F;
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

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        t();
    }

    @Override // org.telegram.ui.ActionBar.g3
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

    @Override // org.telegram.ui.ActionBar.g3
    public final void onContainerTranslationYChanged(float f10) {
        l40 l40Var = this.R;
        if (l40Var != null) {
            l40Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.L = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.zn znVar = this.v;
        if (znVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || znVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        l40 l40Var = new l40(9, getContext(), znVar.getResourceProvider(), false);
        this.R = l40Var;
        l40Var.setVisibility(4);
        this.R.setShowingDuration(5000L);
        this.R.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.K) {
            this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new po(this, 7), 1500L);
        this.container.addView(this.R, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
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
    public final void s(boolean z4) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        boolean z10;
        TLRPC.User i10;
        boolean z11;
        if (this.a0) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c0;
        int i11 = 1;
        org.telegram.ui.zn znVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < znVar.getMessagesController().channelWallpaperLevelMin) {
            znVar.getMessagesController().getBoostsController().userCanBoostChannel(znVar.a(), this.c0, new ro(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.e4 e4Var = this.J.a;
        ic icVar = null;
        if (e4Var != this.T) {
            TLRPC.ChatTheme chatTheme = !e4Var.a ? e4Var.d : null;
            long giftThemeUser = e4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(e4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) e4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = e4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z4) {
                        z4.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new po(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(znVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(znVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !v() ? null : this.n.h;
                    z10 = e4Var.a;
                    boolean z12 = this.s;
                    if (z10) {
                        this.n.i(e4Var, wallPaper, true, Boolean.valueOf(z12), false);
                    } else {
                        this.n.i(null, wallPaper, true, Boolean.valueOf(z12), false);
                    }
                    this.L = true;
                    i10 = znVar.i();
                    if (i10 != null && !i10.self) {
                        z11 = e4Var.a;
                        bx0 bx0Var = new bx0(getContext(), null, 1, -1, e4Var.f(), znVar.getResourceProvider());
                        bx0Var.c.setVisibility(8);
                        TextView textView = bx0Var.b;
                        if (z11) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        icVar = ic.g(znVar, bx0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(znVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(znVar.a(), chatTheme, true);
            if (!v()) {
            }
            z10 = e4Var.a;
            boolean z122 = this.s;
            if (z10) {
            }
            this.L = true;
            i10 = znVar.i();
            if (i10 != null) {
                z11 = e4Var.a;
                bx0 bx0Var2 = new bx0(getContext(), null, 1, -1, e4Var.f(), znVar.getResourceProvider());
                bx0Var2.c.setVisibility(8);
                TextView textView2 = bx0Var2.b;
                if (z11) {
                }
                textView2.setTypeface(null);
                icVar = ic.g(znVar, bx0Var2, 2750);
            }
        }
        dismiss();
        if (icVar != null) {
            icVar.j();
        }
    }

    public final void t() {
        if (!v()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.so
            public final /* synthetic */ jp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.Components.so
            public final /* synthetic */ jp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
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
        if (isDismissed() || this.L) {
            return;
        }
        org.telegram.ui.ActionBar.j6.b = false;
        TLRPC.WallPaper wallPaper = v() ? null : this.n.h;
        org.telegram.ui.ActionBar.e4 e4Var = this.J.a;
        if (e4Var.a) {
            this.n.i(null, wallPaper, false, Boolean.valueOf(this.K), true);
        } else {
            this.n.i(e4Var, wallPaper, false, Boolean.valueOf(this.K), true);
        }
        li liVar = this.V;
        if (liVar != null) {
            zi ziVar = liVar.o0;
            if (ziVar != null) {
                boolean z4 = this.K;
                ra raVar = ziVar.v;
                ((ArrayList) raVar.e).clear();
                WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                raVar.l();
            }
            this.V.c1();
        }
        hp hpVar = this.h;
        if (hpVar == null || hpVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < hpVar.d.size(); i10++) {
            ((ip) hpVar.d.get(i10)).c = this.K ? 1 : 0;
        }
        hpVar.l();
    }

    public final boolean v() {
        if (this.J == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e4 e4Var = this.T;
        sf.b bVar = e4Var != null ? e4Var.c : null;
        if (bVar == null) {
            bVar = sf.b.d("❌");
        }
        org.telegram.ui.ActionBar.e4 e4Var2 = this.J.a;
        sf.b bVar2 = e4Var2 != null ? e4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = sf.b.d("❌");
        }
        return !sf.b.a(bVar, bVar2);
    }

    public final void w() {
        if (this.Y) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.Y = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new dp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new ep(this, chatThemeController));
        }
    }

    public final void x(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ip ipVar = new ip((org.telegram.ui.ActionBar.e4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.S) {
            org.telegram.ui.ActionBar.e4 e4Var = this.n.f;
            this.T = e4Var;
            if (e4Var != null) {
                e4Var.l();
            }
        }
        arrayList.add(0, ipVar);
        if (!this.S) {
            this.J = ipVar;
        }
        org.telegram.ui.ActionBar.e4 e4Var2 = this.T;
        sf.b bVar = e4Var2 != null ? e4Var2.c : null;
        boolean z4 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.e4 e4Var3 = (org.telegram.ui.ActionBar.e4) list.get(i10);
            ip ipVar2 = new ip(e4Var3);
            e4Var3.n(this.currentAccount);
            ipVar2.c = this.K ? 1 : 0;
            if (sf.b.a(e4Var3.c, bVar)) {
                arrayList.add(1, ipVar2);
                z4 = true;
            } else {
                arrayList.add(ipVar2);
            }
        }
        org.telegram.ui.ActionBar.e4 e4Var4 = this.T;
        if (e4Var4 != null && !z4) {
            ip ipVar3 = new ip(e4Var4);
            e4Var4.n(this.currentAccount);
            ipVar3.c = this.K ? 1 : 0;
            arrayList.add(1, ipVar3);
        }
        hp hpVar = this.h;
        hpVar.d = arrayList;
        hpVar.l();
        this.D.setVisibility(0);
        if (!this.S) {
            A(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.S = true;
        E(true);
    }

    public final void y() {
        if (isDismissed() || this.L) {
            return;
        }
        this.M = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = v() ? null : this.f;
        org.telegram.ui.ActionBar.e4 e4Var = this.J.a;
        if (e4Var.a) {
            this.n.i(null, wallPaper, true, Boolean.valueOf(this.K), false);
        } else {
            this.n.i(e4Var, wallPaper, true, Boolean.valueOf(this.K), false);
        }
    }
}
