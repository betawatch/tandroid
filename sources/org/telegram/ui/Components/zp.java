package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zp extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int l0 = 0;
    public final yj0 E;
    public final tp F;
    public final up G;
    public final View H;
    public final s6 I;
    public final s6 J;
    public final TextView K;
    public yp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public c31 Q;
    public float R;
    public ValueAnimator S;
    public t40 T;
    public boolean U;
    public org.telegram.ui.ActionBar.h4 V;
    public org.telegram.ui.ActionBar.r2 W;
    public ti X;
    public bh.p Y;
    public s6 Z;
    public boolean a0;
    public final ImageView b;
    public zq b0;
    public final org.telegram.ui.ActionBar.j2 c;
    public boolean c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public TL_stories.TL_premium_boostsStatus e0;
    public TLRPC.WallPaper f;
    public float f0;
    public ValueAnimator g0;
    public final xp h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final org.telegram.ui.un n;
    public final org.telegram.ui.ActionBar.h4 r;
    public final boolean s;
    public final org.telegram.ui.wn v;
    public final nm0 w;
    public final s4.c0 x;
    public final c10 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(org.telegram.ui.wn wnVar, org.telegram.ui.un unVar) {
        super(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) unVar, true);
        String str;
        int i10 = 1;
        this.P = -1;
        this.c0 = false;
        this.d0 = false;
        this.f0 = 0.0f;
        this.v = wnVar;
        this.n = unVar;
        this.r = unVar.f;
        this.f = unVar.g;
        this.s = org.telegram.ui.ActionBar.y6.I.q();
        xp xpVar = new xp(this.currentAccount, wnVar.a(), unVar, 0);
        this.h = xpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.y6.i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.c = j2Var;
        imageView.setImageDrawable(j2Var);
        imageView.setOnClickListener(new ip(this, i10));
        frameLayout.addView(imageView, kb1.h(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, kb1.h(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        yj0 yj0Var = new yj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.E = yj0Var;
        this.M = !org.telegram.ui.ActionBar.y6.I.q();
        G(org.telegram.ui.ActionBar.y6.I.q(), false);
        yj0Var.J(true);
        yj0Var.h = true;
        this.j0 = themedColor;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        tp tpVar = new tp(this, getContext());
        this.F = tpVar;
        tpVar.setAnimation(yj0Var);
        tpVar.setScaleType(ImageView.ScaleType.CENTER);
        tpVar.setOnClickListener(new ip(this, 2));
        frameLayout.addView(tpVar, kb1.h(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.G = new up(getContext());
        nm0 nm0Var = new nm0(getContext(), null);
        this.w = nm0Var;
        nm0Var.setAdapter(xpVar);
        nm0Var.setDrawSelection(false);
        nm0Var.setClipChildren(false);
        nm0Var.setClipToPadding(false);
        nm0Var.setHasFixedSize(true);
        nm0Var.setItemAnimator(null);
        nm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.x = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i13 = 3;
        nm0Var.setOnItemClickListener(new j(this, i13));
        nm0Var.setOnScrollListener(new ml(this, i13));
        c10 c10Var = new c10(getContext(), this.resourcesProvider);
        this.y = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        frameLayout.addView(c10Var, kb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(nm0Var, kb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.H = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int i14 = org.telegram.ui.ActionBar.y6.Qh;
        int themedColor3 = getThemedColor(i14);
        Drawable j02 = org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, u6Var);
        view.setOnClickListener(new ip(this, i13));
        frameLayout.addView(view, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.K = textView2;
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
        frameLayout.addView(textView2, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var = new s6(getContext(), true, true, true);
        this.I = s6Var;
        s6Var.getDrawable().q(true);
        s6Var.n = false;
        s6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i15, this.resourcesProvider);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(s6Var, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var2 = new s6(getContext(), true, true, true);
        this.J = s6Var2;
        s6Var2.getDrawable().q(true);
        s6Var2.n = false;
        s6Var2.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i15, this.resourcesProvider);
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var2.setAlpha(0.0f);
        s6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(s6Var2, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ga(7, this, wnVar));
            frameLayout.addView(textView3, kb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (wnVar.i() != null) {
                str = UserObject.getFirstName(wnVar.i());
            } else {
                TLRPC.Chat chat = wnVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, kb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        K();
        L(false);
    }

    public static void I(c31 c31Var) {
        if (c31Var == null) {
            return;
        }
        float width = c31Var.getWidth() / 2.0f;
        float width2 = c31Var.getWidth();
        float height = c31Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c31Var, c31.w, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ut.e);
        ofFloat.addListener(new org.telegram.ui.sp(c31Var, 18));
        ofFloat.start();
    }

    public static void m(zp zpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (zpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.wn wnVar = zpVar.v;
        tg.j0 j0Var = new tg.j0(22, zpVar.currentAccount, zpVar.getContext(), wnVar, zpVar.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(zpVar.e0, true);
        j0Var.L1(zpVar.v.a());
        j0Var.Q0 = new hp(zpVar, 2);
        j0Var.show();
    }

    public static /* synthetic */ void n(zp zpVar, org.telegram.ui.wn wnVar) {
        if (zpVar.f == null) {
            zpVar.dismiss();
            return;
        }
        zpVar.f = null;
        zpVar.dismiss();
        ChatThemeController.getInstance(zpVar.currentAccount).clearWallpaper(wnVar.a(), true);
    }

    public static void o(zp zpVar, View view, int i10) {
        np0 np0Var;
        nm0 nm0Var = zpVar.w;
        xp xpVar = zpVar.h;
        if (xpVar.d.get(i10) == zpVar.L || zpVar.Q != null) {
            return;
        }
        zpVar.L = (yp) xpVar.d.get(i10);
        zpVar.D();
        xpVar.E(i10);
        zpVar.containerView.postDelayed(new hf(zpVar, i10, 1), 100L);
        for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
            e31 e31Var = (e31) nm0Var.getChildAt(i11);
            if (e31Var != view && (np0Var = e31Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(np0Var);
                e31Var.J.run();
            }
        }
        if (!((yp) xpVar.d.get(i10)).a.a) {
            ((e31) view).d();
        }
        zpVar.L(true);
    }

    public static void q(zp zpVar, vc1 vc1Var) {
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        org.telegram.ui.wn wnVar = zpVar.v;
        vc1Var.a.a = wnVar.getResourceProvider();
        vc1Var.q1 = new sp(zpVar);
        p2Var.c = new k5(10);
        p2Var.d = new hp(zpVar, 5);
        p2Var.b = new hp(zpVar, 6);
        p2Var.e = true;
        zpVar.W = vc1Var;
        wnVar.showAsSheet(vc1Var, p2Var);
    }

    public static void r(zp zpVar) {
        org.telegram.ui.wn wnVar = zpVar.v;
        ti tiVar = new ti(wnVar.getParentActivity(), wnVar, false, false, false, wnVar.getResourceProvider());
        zpVar.X = tiVar;
        tiVar.drawNavigationBar = true;
        tiVar.T1(LocaleController.getString(R.string.ChooseBackground));
        ti tiVar2 = zpVar.X;
        tiVar2.c2 = new rp(zpVar);
        tiVar2.R1(1, false);
        zpVar.X.w1();
        zpVar.X.j0.g0();
        zpVar.X.show();
        zpVar.Y = new bh.p(zpVar, zpVar.getContext());
        s6 s6Var = new s6(zpVar.getContext(), true, true, true);
        zpVar.Z = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        zpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
        zpVar.Z.setGravity(17);
        s6 s6Var2 = zpVar.Z;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i10, zpVar.resourcesProvider);
        zpVar.Y.addView(zpVar.Z, kb1.i(-1, -2, 17));
        bh.p pVar = zpVar.Y;
        int dp = AndroidUtilities.dp(0.0f);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        int themedColor = zpVar.getThemedColor(i11);
        int o10 = i0.a.o(zpVar.getThemedColor(i10), 76);
        org.telegram.ui.ActionBar.f7.R(pVar, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor, o10, o10), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.h(i10, 76), zpVar.resourcesProvider);
        zpVar.Y.setOnClickListener(new ip(zpVar, 0));
        zpVar.X.u1.addView(zpVar.Y, kb1.i(-1, -2, 80));
    }

    public static org.telegram.ui.ActionBar.x6 t(boolean z10) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string) != null && !org.telegram.ui.ActionBar.y6.P0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string2) != null && org.telegram.ui.ActionBar.y6.P0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
    }

    public final boolean A() {
        if (this.L == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h4 h4Var = this.V;
        hg.b bVar = h4Var != null ? h4Var.c : null;
        if (bVar == null) {
            bVar = hg.b.d("❌");
        }
        org.telegram.ui.ActionBar.h4 h4Var2 = this.L.a;
        hg.b bVar2 = h4Var2 != null ? h4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = hg.b.d("❌");
        }
        return !hg.b.a(bVar, bVar2);
    }

    public final void B() {
        if (this.a0) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.a0 = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new vp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new wp(this, chatThemeController));
        }
    }

    public final void C(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        yp ypVar = new yp((org.telegram.ui.ActionBar.h4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.U) {
            org.telegram.ui.ActionBar.h4 h4Var = this.n.f;
            this.V = h4Var;
            if (h4Var != null) {
                h4Var.k();
            }
        }
        arrayList.add(0, ypVar);
        if (!this.U) {
            this.L = ypVar;
        }
        org.telegram.ui.ActionBar.h4 h4Var2 = this.V;
        hg.b bVar = h4Var2 != null ? h4Var2.c : null;
        boolean z10 = false;
        int i10 = 1;
        while (i10 < list.size()) {
            org.telegram.ui.ActionBar.h4 h4Var3 = (org.telegram.ui.ActionBar.h4) list.get(i10);
            yp ypVar2 = new yp(h4Var3);
            h4Var3.m(this.currentAccount);
            ypVar2.c = this.M ? 1 : 0;
            if (hg.b.a(h4Var3.c, bVar)) {
                arrayList.add(1, ypVar2);
                z10 = true;
            } else {
                arrayList.add(ypVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.h4 h4Var4 = this.V;
        if (h4Var4 != null && !z10) {
            yp ypVar3 = new yp(h4Var4);
            h4Var4.m(this.currentAccount);
            ypVar3.c = this.M ? 1 : 0;
            arrayList.add(1, ypVar3);
        }
        xp xpVar = this.h;
        xpVar.d = arrayList;
        xpVar.l();
        this.F.setVisibility(0);
        if (!this.U) {
            F(false);
            this.w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.U = true;
        L(true);
    }

    public final void D() {
        if (isDismissed() || this.N) {
            return;
        }
        this.O = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = A() ? null : this.f;
        org.telegram.ui.ActionBar.h4 h4Var = this.L.a;
        if (h4Var.a) {
            this.n.q(null, wallPaper, true, Boolean.valueOf(this.M), false);
        } else {
            this.n.q(h4Var, wallPaper, true, Boolean.valueOf(this.M), false);
        }
    }

    public final void F(boolean z10) {
        xp xpVar = this.h;
        ArrayList arrayList = xpVar.d;
        org.telegram.ui.ActionBar.h4 h4Var = this.V;
        s4.c0 c0Var = this.x;
        nm0 nm0Var = this.w;
        if (h4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (hg.b.a(((yp) arrayList.get(i10)).a.c, this.V.c)) {
                        this.L = (yp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.P = i10;
                xpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, xpVar.d.size() - 1);
                if (z10) {
                    nm0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.L = (yp) arrayList.get(0);
            xpVar.E(0);
            if (z10) {
                nm0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        D();
    }

    public final void G(boolean z10, boolean z11) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        tp tpVar = this.F;
        yj0 yj0Var = this.E;
        if (z11) {
            yj0Var.P(z10 ? yj0Var.e[0] : 0);
            if (tpVar != null) {
                tpVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? yj0Var.e[0] - 1 : 0;
        yj0Var.N(i10, false, true);
        yj0Var.P(i10);
        if (tpVar != null) {
            tpVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(boolean z10) {
        char c10;
        Bitmap bitmap;
        if (isDismissed() || this.h0) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.wn wnVar = this.v;
        FrameLayout frameLayout = (FrameLayout) wnVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = wnVar.getParentActivity().getWindow();
        Window window2 = getWindow();
        int i10 = 26;
        if (Build.VERSION.SDK_INT < 26 || frameLayout2.getWidth() <= 0 || frameLayout2.getHeight() <= 0) {
            c10 = 0;
        } else {
            Bitmap bitmapFromWindow = AndroidUtilities.getBitmapFromWindow(window);
            Bitmap bitmapFromWindow2 = bitmapFromWindow != null ? AndroidUtilities.getBitmapFromWindow(window2) : null;
            if (bitmapFromWindow != null && bitmapFromWindow2 != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                frameLayout2.getLocationOnScreen(new int[2]);
                c10 = 0;
                bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.drawBitmap(bitmapFromWindow, r6[0] - r13[0], r6[1] - r13[1], (Paint) null);
                canvas.drawBitmap(bitmapFromWindow2, 0.0f, 0.0f, (Paint) null);
                bitmapFromWindow.recycle();
                bitmapFromWindow2.recycle();
                tp tpVar = this.F;
                if (bitmap == null) {
                    c31.a(bitmap, null, tpVar);
                } else {
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap);
                    tpVar.setAlpha(0.0f);
                    frameLayout.draw(canvas2);
                    frameLayout2.draw(canvas2);
                    tpVar.setAlpha(1.0f);
                }
                tpVar.getLocationInWindow(new int[2]);
                float measuredWidth = (tpVar.getMeasuredWidth() / 2.0f) + r3[c10];
                float measuredHeight = (tpVar.getMeasuredHeight() / 2.0f) + r3[1];
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                org.telegram.ui.Cells.b1 b1Var = c31.w;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                c31 c31Var = new c31(getContext());
                c31Var.setScaleType(ImageView.ScaleType.MATRIX);
                c31Var.setImageBitmap(bitmap);
                c31Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.E.getColorFilter();
                c31Var.n = tpVar;
                c31Var.r = colorFilter;
                c31Var.setRadius(!z10 ? 0.0f : sqrt);
                this.Q = c31Var;
                c31Var.setOnTouchListener(new ei.d(16));
                this.R = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.S = ofFloat;
                ofFloat.addUpdateListener(new mp(this, c31Var, sqrt, z10));
                this.S.addListener(new org.telegram.ui.sp(this, 17));
                this.S.setDuration(400L);
                this.S.setInterpolator(ut.e);
                this.S.start();
                frameLayout2.addView(this.Q, new ViewGroup.LayoutParams(-1, -1));
                AndroidUtilities.runOnUIThread(new bh.n(i10, this, z10));
            }
            c10 = 0;
            if (bitmapFromWindow != null) {
                bitmapFromWindow.recycle();
            }
        }
        bitmap = null;
        tp tpVar2 = this.F;
        if (bitmap == null) {
        }
        tpVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (tpVar2.getMeasuredWidth() / 2.0f) + r3[c10];
        float measuredHeight2 = (tpVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.b1 b1Var2 = c31.w;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        c31 c31Var2 = new c31(getContext());
        c31Var2.setScaleType(ImageView.ScaleType.MATRIX);
        c31Var2.setImageBitmap(bitmap);
        c31Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.E.getColorFilter();
        c31Var2.n = tpVar2;
        c31Var2.r = colorFilter2;
        c31Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.Q = c31Var2;
        c31Var2.setOnTouchListener(new ei.d(16));
        this.R = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat2;
        ofFloat2.addUpdateListener(new mp(this, c31Var2, sqrt2, z10));
        this.S.addListener(new org.telegram.ui.sp(this, 17));
        this.S.setDuration(400L);
        this.S.setInterpolator(ut.e);
        this.S.start();
        frameLayout2.addView(this.Q, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bh.n(i10, this, z10));
    }

    public final void J(org.telegram.ui.ActionBar.x6 x6Var) {
        if (x6Var == null || x6Var == org.telegram.ui.ActionBar.y6.I) {
            return;
        }
        this.h0 = true;
        try {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, x6Var, Boolean.FALSE, null, -1);
        } finally {
            this.h0 = false;
        }
    }

    public final void K() {
        TextView textView = this.e;
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.p5, this.resourcesProvider);
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int o10 = i0.a.o(getThemedColor(i10), 76);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i10, 76);
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            textView.setBackground(j02);
            org.telegram.ui.ActionBar.f7.k(textView, j02, null, h, u6Var);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.y6.p7;
            org.telegram.ui.ActionBar.f7.V(textView2, i11, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i11), 76);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
            org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i11, 76);
            org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
            textView2.setBackground(j03);
            org.telegram.ui.ActionBar.f7.k(textView2, j03, null, h10, u6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1);
        org.telegram.ui.ActionBar.b7 h11 = org.telegram.ui.ActionBar.f7.h(i12, 30);
        org.telegram.ui.ActionBar.u6 u6Var3 = this.resourcesProvider;
        ImageView imageView = this.b;
        org.telegram.ui.ActionBar.f7.R(imageView, g02, null, h11, u6Var3);
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        j2Var.a(themedColor);
        j2Var.b(getThemedColor(i12));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.R(this.F, org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i13), 30), 1, -1), null, org.telegram.ui.ActionBar.f7.h(i13, 30), this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.y6.m5;
        org.telegram.ui.ActionBar.u6 u6Var4 = this.resourcesProvider;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.f7.V(textView3, i14, u6Var4);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i13), 76);
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o12, o12), null, org.telegram.ui.ActionBar.f7.h(i13, 76), this.resourcesProvider);
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
    public final void L(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        ?? r17;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.h4 h4Var;
        org.telegram.ui.wn wnVar = this.v;
        TLRPC.Chat chat = wnVar.e;
        int i10 = 0;
        if (chat != null && !this.c0 && !this.d0 && this.e0 == null) {
            this.c0 = true;
            wnVar.getMessagesController().getBoostsController().getBoostsStats(wnVar.a(), new jp(this, i10));
        }
        boolean z13 = this.U;
        c10 c10Var = this.y;
        TextView textView = this.e;
        s6 s6Var = this.J;
        TextView textView2 = this.d;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        View view = this.H;
        s6 s6Var2 = this.I;
        if (!z13) {
            j2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(c10Var, false, 1.0f, true, z10);
        if (!A()) {
            j2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(s6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        j2Var.c(0.0f, z10);
        view.setEnabled(true);
        yp ypVar = this.L;
        if (ypVar == null || (h4Var = ypVar.a) == null || !h4Var.a) {
            s6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.e0) != null && tL_premium_boostsStatus.level < wnVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.b0 == null) {
                    zq zqVar = new zq(R.drawable.mini_switch_lock, 0);
                    this.b0 = zqVar;
                    zqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.b0, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", wnVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                s6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || s6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.g0 = null;
                }
                if (z12) {
                    this.f0 = z11 ? 1.0f : 0.0f;
                    s6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.f0);
                } else {
                    float f7 = this.f0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[r17] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.g0 = ofFloat;
                    ofFloat.addUpdateListener(new n6(this, 15));
                    this.g0.addListener(new org.telegram.ui.lo(6, this, z11));
                    this.g0.start();
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
        valueAnimator = this.g0;
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

    @Override // org.telegram.ui.ActionBar.k3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i5));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new hp(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        boolean z10 = this.N;
        boolean z11 = this.s;
        c31 v = (z10 || this.M == z11) ? null : v();
        if (!this.N) {
            org.telegram.ui.un unVar = this.n;
            TLRPC.WallPaper wallPaper = unVar.g;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            unVar.q(this.r, wallPaper, v == null, Boolean.valueOf(z11), false);
        }
        if (this.M != z11) {
            org.telegram.ui.ActionBar.x6 t10 = org.telegram.ui.ActionBar.y6.I.q() == z11 ? org.telegram.ui.ActionBar.y6.I : t(z11);
            if (this.i0) {
                J(t10);
            } else {
                org.telegram.ui.ActionBar.y6.t(t10, false, z11);
            }
        }
        this.i0 = false;
        I(v);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final ArrayList getThemeDescriptions() {
        lp lpVar = new lp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.u7) {
            org.telegram.ui.ActionBar.r2 r2Var = this.W;
            if (r2Var instanceof vc1) {
                arrayList.addAll(((vc1) r2Var).T0());
                return arrayList;
            }
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, lpVar, org.telegram.ui.ActionBar.y6.h5));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        View view = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h7) obj).n = this.n;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        w();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !A()) {
            return false;
        }
        int x9 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x9 >= this.containerView.getLeft() && x9 <= this.containerView.getRight()) {
            return false;
        }
        this.v.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onContainerTranslationYChanged(float f7) {
        t40 t40Var = this.T;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.N = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            C(chatThemeController.getEmojiThemes(7));
        } else {
            B();
        }
        org.telegram.ui.wn wnVar = this.v;
        if (wnVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || wnVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        t40 t40Var = new t40(9, getContext(), wnVar.getResourceProvider(), false);
        this.T = t40Var;
        t40Var.setVisibility(4);
        this.T.setShowingDuration(5000L);
        this.T.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.M) {
            this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new hp(this, 7), 1500L);
        this.container.addView(this.T, kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        x();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.navBarColorKey != -1 || this.navBarColor == (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.i5))) {
                return;
            }
            this.navBarColor = themedColor;
            AndroidUtilities.setNavigationBarColor((Dialog) this, themedColor, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(themedColor)) > 0.721d);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.User i10;
        boolean z11;
        if (this.c0) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.e0;
        int i11 = 1;
        org.telegram.ui.wn wnVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < wnVar.getMessagesController().channelWallpaperLevelMin) {
            wnVar.getMessagesController().getBoostsController().userCanBoostChannel(wnVar.a(), this.e0, new jp(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.h4 h4Var = this.L.a;
        qc qcVar = null;
        if (h4Var != this.V) {
            TLRPC.ChatTheme chatTheme = !h4Var.a ? h4Var.d : null;
            long giftThemeUser = h4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(h4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) h4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = h4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        g5.m0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new hp(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(wnVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(wnVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !A() ? null : this.n.g;
                    boolean z12 = this.M;
                    boolean z13 = this.s;
                    c31 v = z12 == z13 ? v() : null;
                    if (h4Var.a) {
                        this.n.q(h4Var, wallPaper, v == null, Boolean.valueOf(z13), false);
                    } else {
                        this.n.q(null, wallPaper, v == null, Boolean.valueOf(z13), false);
                    }
                    I(v);
                    this.N = true;
                    i10 = wnVar.i();
                    if (i10 != null && !i10.self) {
                        z11 = h4Var.a;
                        hy0 hy0Var = new hy0(getContext(), null, 1, -1, h4Var.e(), wnVar.getResourceProvider());
                        hy0Var.c.setVisibility(8);
                        TextView textView = hy0Var.b;
                        if (z11) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        qcVar = qc.g(wnVar, hy0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(wnVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(wnVar.a(), chatTheme, true);
            if (!A()) {
            }
            boolean z122 = this.M;
            boolean z132 = this.s;
            if (z122 == z132) {
            }
            if (h4Var.a) {
            }
            I(v);
            this.N = true;
            i10 = wnVar.i();
            if (i10 != null) {
                z11 = h4Var.a;
                hy0 hy0Var2 = new hy0(getContext(), null, 1, -1, h4Var.e(), wnVar.getResourceProvider());
                hy0Var2.c.setVisibility(8);
                TextView textView2 = hy0Var2.b;
                if (z11) {
                }
                textView2.setTypeface(null);
                qcVar = qc.g(wnVar, hy0Var2, 2750);
            }
        }
        dismiss();
        if (qcVar != null) {
            qcVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c31 v() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.wn wnVar = this.v;
        Activity parentActivity = wnVar != null ? wnVar.getParentActivity() : null;
        if (parentActivity == null || parentActivity.getWindow() == null || !(parentActivity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        FrameLayout frameLayout = (FrameLayout) parentActivity.getWindow().getDecorView();
        if (frameLayout.getWidth() <= 0 || frameLayout.getHeight() <= 0) {
            return null;
        }
        try {
            bitmap2 = Build.VERSION.SDK_INT >= 26 ? AndroidUtilities.getBitmapFromWindow(parentActivity.getWindow()) : null;
            if (bitmap2 == null) {
                try {
                    bitmap2 = AndroidUtilities.snapshotView(frameLayout);
                } catch (Throwable th2) {
                    bitmap = bitmap2;
                    th = th2;
                    FileLog.e(th);
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
        if (bitmap2 != null) {
            return null;
        }
        c31 c31Var = new c31(parentActivity);
        c31Var.setScaleType(ImageView.ScaleType.MATRIX);
        c31Var.setImageBitmap(bitmap2);
        c31Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        c31Var.setRadius(0.0f);
        frameLayout.addView(c31Var, new FrameLayout.LayoutParams(-1, -1));
        return c31Var;
    }

    public final void w() {
        if (!A()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.kp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.Components.kp
            public final /* synthetic */ zp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
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
        alertDialog$Builder.p();
    }

    public final void x() {
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
            yj0 yj0Var = this.E;
            if (yj0Var != null && themedColor != this.j0) {
                this.j0 = themedColor;
                yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.c;
            if (j2Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.j5;
                j2Var.a(getThemedColor(i10));
                j2Var.b(getThemedColor(i10));
                ImageView imageView = this.b;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
            if (themedColor2 != this.k0) {
                this.k0 = themedColor2;
                setBackgroundColor(themedColor2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y() {
        if (isDismissed() || this.N) {
            return;
        }
        org.telegram.ui.ActionBar.y6.b = false;
        TLRPC.WallPaper wallPaper = A() ? null : this.n.g;
        org.telegram.ui.ActionBar.h4 h4Var = this.L.a;
        if (h4Var.a) {
            this.n.q(null, wallPaper, false, Boolean.valueOf(this.M), true);
        } else {
            this.n.q(h4Var, wallPaper, false, Boolean.valueOf(this.M), true);
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            ij ijVar = tiVar.r0;
            if (ijVar != null) {
                boolean z10 = this.M;
                za zaVar = ijVar.v;
                ((ArrayList) zaVar.e).clear();
                WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                zaVar.l();
            }
            this.X.h1();
        }
        xp xpVar = this.h;
        if (xpVar == null || xpVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < xpVar.d.size(); i10++) {
            ((yp) xpVar.d.get(i10)).c = this.M ? 1 : 0;
        }
        xpVar.l();
    }
}
