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
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class wp extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int l0 = 0;
    public final yj0 E;
    public final qp F;
    public final rp G;
    public final View H;
    public final q6 I;
    public final q6 J;
    public final TextView K;
    public vp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public t21 Q;
    public float R;
    public ValueAnimator S;
    public r40 T;
    public boolean U;
    public org.telegram.ui.ActionBar.f4 V;
    public org.telegram.ui.ActionBar.o2 W;
    public ti X;
    public ah.v Y;
    public q6 Z;
    public boolean a0;
    public final ImageView b;
    public xq b0;
    public final org.telegram.ui.ActionBar.h2 c;
    public boolean c0;
    public final TextView d;
    public boolean d0;
    public final TextView e;
    public TL_stories.TL_premium_boostsStatus e0;
    public TLRPC.WallPaper f;
    public float f0;
    public ValueAnimator g0;
    public final up h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public final org.telegram.ui.qn n;
    public final org.telegram.ui.ActionBar.f4 r;
    public final boolean s;
    public final org.telegram.ui.sn v;
    public final mm0 w;
    public final s4.b0 x;
    public final b10 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(org.telegram.ui.sn snVar, org.telegram.ui.qn qnVar) {
        super(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) qnVar, true);
        String str;
        int i10 = 1;
        this.P = -1;
        this.c0 = false;
        this.d0 = false;
        this.f0 = 0.0f;
        this.v = snVar;
        this.n = qnVar;
        this.r = qnVar.f;
        this.f = qnVar.g;
        this.s = org.telegram.ui.ActionBar.k6.I.q();
        up upVar = new up(this.currentAccount, snVar.a(), qnVar, 0);
        this.h = upVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.k6.i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBarKey(org.telegram.ui.ActionBar.k6.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.c = h2Var;
        imageView.setImageDrawable(h2Var);
        imageView.setOnClickListener(new fp(this, i10));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = getThemedColor(i12);
        int dp2 = AndroidUtilities.dp(28.0f);
        yj0 yj0Var = new yj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.E = yj0Var;
        this.M = !org.telegram.ui.ActionBar.k6.I.q();
        F(org.telegram.ui.ActionBar.k6.I.q(), false);
        yj0Var.J(true);
        yj0Var.h = true;
        this.j0 = themedColor;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        qp qpVar = new qp(this, getContext());
        this.F = qpVar;
        qpVar.setAnimation(yj0Var);
        qpVar.setScaleType(ImageView.ScaleType.CENTER);
        qpVar.setOnClickListener(new fp(this, 2));
        frameLayout.addView(qpVar, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.G = new rp(getContext());
        mm0 mm0Var = new mm0(getContext(), null);
        this.w = mm0Var;
        mm0Var.setAdapter(upVar);
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
        mm0Var.setOnScrollListener(new ah.d0(this, 29));
        b10 b10Var = new b10(getContext(), this.resourcesProvider);
        this.y = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(mm0Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.H = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int i14 = org.telegram.ui.ActionBar.k6.Qh;
        int themedColor3 = getThemedColor(i14);
        Drawable j02 = org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        view.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(view, j02, O, O2, g6Var);
        view.setOnClickListener(new fp(this, i13));
        frameLayout.addView(view, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
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
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 8));
        frameLayout.addView(textView2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var = new q6(getContext(), true, true, true);
        this.I = q6Var;
        q6Var.getDrawable().q(true);
        q6Var.n = false;
        q6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.r6.a0(q6Var, i15, this.resourcesProvider);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(q6Var, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var2 = new q6(getContext(), true, true, true);
        this.J = q6Var2;
        q6Var2.getDrawable().q(true);
        q6Var2.n = false;
        q6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i15, this.resourcesProvider);
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        q6Var2.setAlpha(0.0f);
        q6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(q6Var2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ca(6, this, snVar));
            frameLayout.addView(textView3, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (snVar.i() != null) {
                str = UserObject.getFirstName(snVar.i());
            } else {
                TLRPC.Chat chat = snVar.e;
                str = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        K();
        L(false);
    }

    public static void I(t21 t21Var) {
        if (t21Var == null) {
            return;
        }
        float width = t21Var.getWidth() / 2.0f;
        float width2 = t21Var.getWidth();
        float height = t21Var.getHeight();
        float max = Math.max(width, width2 - width);
        float max2 = Math.max(0.0f, height - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t21Var, t21.w, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(st.e);
        ofFloat.addListener(new org.telegram.ui.pq(t21Var, 17));
        ofFloat.start();
    }

    public static void m(wp wpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (wpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.sn snVar = wpVar.v;
        sg.j0 j0Var = new sg.j0(22, wpVar.currentAccount, wpVar.getContext(), snVar, wpVar.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(wpVar.e0, true);
        j0Var.L1(wpVar.v.a());
        j0Var.Q0 = new ep(wpVar, 2);
        j0Var.show();
    }

    public static /* synthetic */ void n(wp wpVar, org.telegram.ui.sn snVar) {
        if (wpVar.f == null) {
            wpVar.dismiss();
            return;
        }
        wpVar.f = null;
        wpVar.dismiss();
        ChatThemeController.getInstance(wpVar.currentAccount).clearWallpaper(snVar.a(), true);
    }

    public static void p(wp wpVar, View view, int i10) {
        kr0 kr0Var;
        mm0 mm0Var = wpVar.w;
        up upVar = wpVar.h;
        if (upVar.d.get(i10) == wpVar.L || wpVar.Q != null) {
            return;
        }
        wpVar.L = (vp) upVar.d.get(i10);
        wpVar.D();
        upVar.E(i10);
        wpVar.containerView.postDelayed(new hf(wpVar, i10, 1), 100L);
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            v21 v21Var = (v21) mm0Var.getChildAt(i11);
            if (v21Var != view && (kr0Var = v21Var.J) != null) {
                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                v21Var.J.run();
            }
        }
        if (!((vp) upVar.d.get(i10)).a.a) {
            ((v21) view).d();
        }
        wpVar.L(true);
    }

    public static void r(wp wpVar, qc1 qc1Var) {
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        org.telegram.ui.sn snVar = wpVar.v;
        qc1Var.a.a = snVar.getResourceProvider();
        qc1Var.q1 = new pp(wpVar);
        m2Var.c = new rc(8);
        m2Var.d = new ep(wpVar, 5);
        m2Var.b = new ep(wpVar, 6);
        m2Var.e = true;
        wpVar.W = qc1Var;
        snVar.showAsSheet(qc1Var, m2Var);
    }

    public static void s(wp wpVar) {
        org.telegram.ui.sn snVar = wpVar.v;
        ti tiVar = new ti(snVar.getParentActivity(), snVar, false, false, false, snVar.getResourceProvider());
        wpVar.X = tiVar;
        tiVar.drawNavigationBar = true;
        tiVar.T1(LocaleController.getString(R.string.ChooseBackground));
        ti tiVar2 = wpVar.X;
        tiVar2.c2 = new op(wpVar);
        tiVar2.R1(1, false);
        wpVar.X.w1();
        wpVar.X.j0.f0();
        wpVar.X.show();
        wpVar.Y = new ah.v(wpVar, wpVar.getContext());
        q6 q6Var = new q6(wpVar.getContext(), true, true, true);
        wpVar.Z = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        wpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
        wpVar.Z.setGravity(17);
        q6 q6Var2 = wpVar.Z;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.a0(q6Var2, i10, wpVar.resourcesProvider);
        wpVar.Y.addView(wpVar.Z, w7.z5.e(-1, -2, 17));
        ah.v vVar = wpVar.Y;
        int dp = AndroidUtilities.dp(0.0f);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        int themedColor = wpVar.getThemedColor(i11);
        int o10 = i0.a.o(wpVar.getThemedColor(i10), 76);
        org.telegram.ui.ActionBar.r6.S(vVar, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor, o10, o10), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.h(i10, 76), wpVar.resourcesProvider);
        wpVar.Y.setOnClickListener(new fp(wpVar, 0));
        wpVar.X.u1.addView(wpVar.Y, w7.z5.e(-1, -2, 80));
    }

    public static org.telegram.ui.ActionBar.j6 u(boolean z10) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string) != null && !org.telegram.ui.ActionBar.k6.P0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string2) != null && org.telegram.ui.ActionBar.k6.P0(string2).q()) {
            str2 = string2;
        }
        return z10 ? org.telegram.ui.ActionBar.k6.P0(str2) : org.telegram.ui.ActionBar.k6.P0(str);
    }

    public final boolean A() {
        if (this.L == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.V;
        gg.b bVar = f4Var != null ? f4Var.c : null;
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.L.a;
        gg.b bVar2 = f4Var2 != null ? f4Var2.c : null;
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
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
            chatThemeController.requestAllChatThemes(new sp(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new tp(this, chatThemeController));
        }
    }

    public final void C(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vp vpVar = new vp((org.telegram.ui.ActionBar.f4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.U) {
            org.telegram.ui.ActionBar.f4 f4Var = this.n.f;
            this.V = f4Var;
            if (f4Var != null) {
                f4Var.k();
            }
        }
        arrayList.add(0, vpVar);
        if (!this.U) {
            this.L = vpVar;
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.V;
        gg.b bVar = f4Var2 != null ? f4Var2.c : null;
        boolean z10 = false;
        int i10 = 1;
        while (i10 < list.size()) {
            org.telegram.ui.ActionBar.f4 f4Var3 = (org.telegram.ui.ActionBar.f4) list.get(i10);
            vp vpVar2 = new vp(f4Var3);
            f4Var3.m(this.currentAccount);
            vpVar2.c = this.M ? 1 : 0;
            if (gg.b.a(f4Var3.c, bVar)) {
                arrayList.add(1, vpVar2);
                z10 = true;
            } else {
                arrayList.add(vpVar2);
            }
            i10++;
            z10 = z10;
        }
        org.telegram.ui.ActionBar.f4 f4Var4 = this.V;
        if (f4Var4 != null && !z10) {
            vp vpVar3 = new vp(f4Var4);
            f4Var4.m(this.currentAccount);
            vpVar3.c = this.M ? 1 : 0;
            arrayList.add(1, vpVar3);
        }
        up upVar = this.h;
        upVar.d = arrayList;
        upVar.l();
        this.F.setVisibility(0);
        if (!this.U) {
            E(false);
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
        org.telegram.ui.ActionBar.f4 f4Var = this.L.a;
        if (f4Var.a) {
            this.n.q(null, wallPaper, true, Boolean.valueOf(this.M), false);
        } else {
            this.n.q(f4Var, wallPaper, true, Boolean.valueOf(this.M), false);
        }
    }

    public final void E(boolean z10) {
        up upVar = this.h;
        ArrayList arrayList = upVar.d;
        org.telegram.ui.ActionBar.f4 f4Var = this.V;
        s4.b0 b0Var = this.x;
        mm0 mm0Var = this.w;
        if (f4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (gg.b.a(((vp) arrayList.get(i10)).a.c, this.V.c)) {
                        this.L = (vp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.P = i10;
                upVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, upVar.d.size() - 1);
                if (z10) {
                    mm0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.L = (vp) arrayList.get(0);
            upVar.E(0);
            if (z10) {
                mm0Var.x0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        D();
    }

    public final void F(boolean z10, boolean z11) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        qp qpVar = this.F;
        yj0 yj0Var = this.E;
        if (z11) {
            yj0Var.P(z10 ? yj0Var.e[0] : 0);
            if (qpVar != null) {
                qpVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? yj0Var.e[0] - 1 : 0;
        yj0Var.N(i10, false, true);
        yj0Var.P(i10);
        if (qpVar != null) {
            qpVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(boolean z10) {
        char c10;
        Bitmap bitmap;
        if (isDismissed() || this.h0) {
            return;
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.sn snVar = this.v;
        FrameLayout frameLayout = (FrameLayout) snVar.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Window window = snVar.getParentActivity().getWindow();
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
                qp qpVar = this.F;
                if (bitmap == null) {
                    t21.a(bitmap, null, qpVar);
                } else {
                    bitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmap);
                    qpVar.setAlpha(0.0f);
                    frameLayout.draw(canvas2);
                    frameLayout2.draw(canvas2);
                    qpVar.setAlpha(1.0f);
                }
                qpVar.getLocationInWindow(new int[2]);
                float measuredWidth = (qpVar.getMeasuredWidth() / 2.0f) + r3[c10];
                float measuredHeight = (qpVar.getMeasuredHeight() / 2.0f) + r3[1];
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                org.telegram.ui.Cells.c1 c1Var = t21.w;
                float max = Math.max(measuredWidth, width - measuredWidth);
                float max2 = Math.max(measuredHeight, height - measuredHeight);
                float sqrt = ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f;
                t21 t21Var = new t21(getContext());
                t21Var.setScaleType(ImageView.ScaleType.MATRIX);
                t21Var.setImageBitmap(bitmap);
                t21Var.b(measuredWidth, measuredHeight, z10);
                ColorFilter colorFilter = this.E.getColorFilter();
                t21Var.n = qpVar;
                t21Var.r = colorFilter;
                t21Var.setRadius(!z10 ? 0.0f : sqrt);
                this.Q = t21Var;
                int i11 = 16;
                t21Var.setOnTouchListener(new di.d(i11));
                this.R = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.S = ofFloat;
                ofFloat.addUpdateListener(new jp(this, t21Var, sqrt, z10));
                this.S.addListener(new org.telegram.ui.pq(this, i11));
                this.S.setDuration(400L);
                this.S.setInterpolator(st.e);
                this.S.start();
                frameLayout2.addView(this.Q, new ViewGroup.LayoutParams(-1, -1));
                AndroidUtilities.runOnUIThread(new ah.t(i10, this, z10));
            }
            c10 = 0;
            if (bitmapFromWindow != null) {
                bitmapFromWindow.recycle();
            }
        }
        bitmap = null;
        qp qpVar2 = this.F;
        if (bitmap == null) {
        }
        qpVar2.getLocationInWindow(new int[2]);
        float measuredWidth2 = (qpVar2.getMeasuredWidth() / 2.0f) + r3[c10];
        float measuredHeight2 = (qpVar2.getMeasuredHeight() / 2.0f) + r3[1];
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        org.telegram.ui.Cells.c1 c1Var2 = t21.w;
        float max3 = Math.max(measuredWidth2, width2 - measuredWidth2);
        float max22 = Math.max(measuredHeight2, height2 - measuredHeight2);
        float sqrt2 = ((float) Math.sqrt((max22 * max22) + (max3 * max3))) / 0.6f;
        t21 t21Var2 = new t21(getContext());
        t21Var2.setScaleType(ImageView.ScaleType.MATRIX);
        t21Var2.setImageBitmap(bitmap);
        t21Var2.b(measuredWidth2, measuredHeight2, z10);
        ColorFilter colorFilter2 = this.E.getColorFilter();
        t21Var2.n = qpVar2;
        t21Var2.r = colorFilter2;
        t21Var2.setRadius(!z10 ? 0.0f : sqrt2);
        this.Q = t21Var2;
        int i112 = 16;
        t21Var2.setOnTouchListener(new di.d(i112));
        this.R = 0.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat2;
        ofFloat2.addUpdateListener(new jp(this, t21Var2, sqrt2, z10));
        this.S.addListener(new org.telegram.ui.pq(this, i112));
        this.S.setDuration(400L);
        this.S.setInterpolator(st.e);
        this.S.start();
        frameLayout2.addView(this.Q, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.t(i10, this, z10));
    }

    public final void J(org.telegram.ui.ActionBar.j6 j6Var) {
        if (j6Var == null || j6Var == org.telegram.ui.ActionBar.k6.I) {
            return;
        }
        this.h0 = true;
        try {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, -1);
        } finally {
            this.h0 = false;
        }
    }

    public final void K() {
        TextView textView = this.e;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p5, this.resourcesProvider);
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int o10 = i0.a.o(getThemedColor(i10), 76);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 76);
            org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
            textView.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(textView, j02, null, h, g6Var);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            org.telegram.ui.ActionBar.r6.W(textView2, i11, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i11), 76);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
            org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i11, 76);
            org.telegram.ui.ActionBar.g6 g6Var2 = this.resourcesProvider;
            textView2.setBackground(j03);
            org.telegram.ui.ActionBar.r6.k(textView2, j03, null, h10, g6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1);
        org.telegram.ui.ActionBar.n6 h11 = org.telegram.ui.ActionBar.r6.h(i12, 30);
        org.telegram.ui.ActionBar.g6 g6Var3 = this.resourcesProvider;
        ImageView imageView = this.b;
        org.telegram.ui.ActionBar.r6.S(imageView, g02, null, h11, g6Var3);
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        h2Var.a(themedColor);
        h2Var.b(getThemedColor(i12));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.S(this.F, org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i13), 30), 1, -1), null, org.telegram.ui.ActionBar.r6.h(i13, 30), this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.k6.m5;
        org.telegram.ui.ActionBar.g6 g6Var4 = this.resourcesProvider;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.r6.W(textView3, i14, g6Var4);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i13), 76);
        org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i13, 76), this.resourcesProvider);
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
        org.telegram.ui.ActionBar.f4 f4Var;
        org.telegram.ui.sn snVar = this.v;
        TLRPC.Chat chat = snVar.e;
        int i10 = 0;
        if (chat != null && !this.c0 && !this.d0 && this.e0 == null) {
            this.c0 = true;
            snVar.getMessagesController().getBoostsController().getBoostsStats(snVar.a(), new gp(this, i10));
        }
        boolean z13 = this.U;
        b10 b10Var = this.y;
        TextView textView = this.e;
        q6 q6Var = this.J;
        TextView textView2 = this.d;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        View view = this.H;
        q6 q6Var2 = this.I;
        if (!z13) {
            h2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(q6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(q6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, z10);
        if (!A()) {
            h2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(q6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(q6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        h2Var.c(0.0f, z10);
        view.setEnabled(true);
        vp vpVar = this.L;
        if (vpVar == null || (f4Var = vpVar.a) == null || !f4Var.a) {
            q6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.e0) != null && tL_premium_boostsStatus.level < snVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.b0 == null) {
                    xq xqVar = new xq(R.drawable.mini_switch_lock, 0);
                    this.b0 = xqVar;
                    xqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.b0, 0, 1, 33);
                r17 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", snVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                q6Var.setText(spannableStringBuilder);
                z11 = true;
                z12 = (z10 || q6Var2.getAlpha() <= 0.8f) ? false : r17;
                valueAnimator = this.g0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.g0 = null;
                }
                if (z12) {
                    this.f0 = z11 ? 1.0f : 0.0f;
                    q6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.f0);
                } else {
                    float f7 = this.f0;
                    float f10 = z11 ? 1.0f : 0.0f;
                    float[] fArr = new float[2];
                    fArr[0] = f7;
                    fArr[r17] = f10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.g0 = ofFloat;
                    ofFloat.addUpdateListener(new l6(this, 14));
                    this.g0.addListener(new org.telegram.ui.ho(6, this, z11));
                    this.g0.start();
                }
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
                boolean z14 = r17;
                AndroidUtilities.updateViewVisibilityAnimated(view, z14, 1.0f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(q6Var2, z14, 0.9f, false, z10);
                AndroidUtilities.updateViewVisibilityAnimated(q6Var, z11, 0.9f, false, 0.7f, z10, null);
                AndroidUtilities.updateViewVisibilityAnimated(textView, z14, 0.9f, false, z10);
            }
        } else {
            q6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
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
        AndroidUtilities.updateViewVisibilityAnimated(q6Var2, z142, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(q6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, z142, 0.9f, false, z10);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i5));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ep(this, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        boolean z10 = this.N;
        boolean z11 = this.s;
        t21 w9 = (z10 || this.M == z11) ? null : w();
        if (!this.N) {
            org.telegram.ui.qn qnVar = this.n;
            TLRPC.WallPaper wallPaper = qnVar.g;
            if (wallPaper == null) {
                wallPaper = this.f;
            }
            qnVar.q(this.r, wallPaper, w9 == null, Boolean.valueOf(z11), false);
        }
        if (this.M != z11) {
            org.telegram.ui.ActionBar.j6 u10 = org.telegram.ui.ActionBar.k6.I.q() == z11 ? org.telegram.ui.ActionBar.k6.I : u(z11);
            if (this.i0) {
                J(u10);
            } else {
                org.telegram.ui.ActionBar.k6.t(u10, false, z11);
            }
        }
        this.i0 = false;
        I(w9);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ip ipVar = new ip(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.q7) {
            org.telegram.ui.ActionBar.o2 o2Var = this.W;
            if (o2Var instanceof qc1) {
                arrayList.addAll(((qc1) o2Var).S0());
                return arrayList;
            }
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, ipVar, org.telegram.ui.ActionBar.k6.h5));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        View view = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.t6) obj).n = this.n;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        x();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !A()) {
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
        r40 r40Var = this.T;
        if (r40Var != null) {
            r40Var.b(true);
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
        this.N = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            C(chatThemeController.getEmojiThemes(7));
        } else {
            B();
        }
        org.telegram.ui.sn snVar = this.v;
        if (snVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || snVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        r40 r40Var = new r40(9, getContext(), snVar.getResourceProvider(), false);
        this.T = r40Var;
        r40Var.setVisibility(4);
        this.T.setShowingDuration(5000L);
        this.T.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.M) {
            this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new ep(this, 7), 1500L);
        this.container.addView(this.T, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        y();
        try {
            if (Build.VERSION.SDK_INT < 30 || this.navBarColorKey != -1 || this.navBarColor == (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.i5))) {
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
    public final void v(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.User i10;
        boolean z11;
        if (this.c0) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.e0;
        int i11 = 1;
        org.telegram.ui.sn snVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < snVar.getMessagesController().channelWallpaperLevelMin) {
            snVar.getMessagesController().getBoostsController().userCanBoostChannel(snVar.a(), this.e0, new gp(this, i11));
            return;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.L.a;
        qc qcVar = null;
        if (f4Var != this.V) {
            TLRPC.ChatTheme chatTheme = !f4Var.a ? f4Var.d : null;
            long giftThemeUser = f4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(f4Var.g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) f4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = f4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (giftThemeUser == 0 && tL_starGiftUnique != null && !z10) {
                        f5.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new ep(this, i11));
                        return;
                    }
                    ChatThemeController.getInstance(this.currentAccount).clearWallpaper(snVar.a(), false);
                    ChatThemeController.getInstance(this.currentAccount).setDialogTheme(snVar.a(), chatTheme, true);
                    TLRPC.WallPaper wallPaper = !A() ? null : this.n.g;
                    boolean z12 = this.M;
                    boolean z13 = this.s;
                    t21 w9 = z12 == z13 ? w() : null;
                    if (f4Var.a) {
                        this.n.q(f4Var, wallPaper, w9 == null, Boolean.valueOf(z13), false);
                    } else {
                        this.n.q(null, wallPaper, w9 == null, Boolean.valueOf(z13), false);
                    }
                    I(w9);
                    this.N = true;
                    i10 = snVar.i();
                    if (i10 != null && !i10.self) {
                        z11 = f4Var.a;
                        yx0 yx0Var = new yx0(getContext(), null, 1, -1, f4Var.e(), snVar.getResourceProvider());
                        yx0Var.c.setVisibility(8);
                        TextView textView = yx0Var.b;
                        if (z11) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, i10.first_name)));
                        } else {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, i10.first_name)));
                        }
                        textView.setTypeface(null);
                        qcVar = qc.g(snVar, yx0Var, 2750);
                    }
                }
            }
            tL_starGiftUnique = null;
            if (giftThemeUser == 0) {
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(snVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(snVar.a(), chatTheme, true);
            if (!A()) {
            }
            boolean z122 = this.M;
            boolean z132 = this.s;
            if (z122 == z132) {
            }
            if (f4Var.a) {
            }
            I(w9);
            this.N = true;
            i10 = snVar.i();
            if (i10 != null) {
                z11 = f4Var.a;
                yx0 yx0Var2 = new yx0(getContext(), null, 1, -1, f4Var.e(), snVar.getResourceProvider());
                yx0Var2.c.setVisibility(8);
                TextView textView2 = yx0Var2.b;
                if (z11) {
                }
                textView2.setTypeface(null);
                qcVar = qc.g(snVar, yx0Var2, 2750);
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
    public final t21 w() {
        Bitmap bitmap;
        Bitmap bitmap2;
        org.telegram.ui.sn snVar = this.v;
        Activity parentActivity = snVar != null ? snVar.getParentActivity() : null;
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
        t21 t21Var = new t21(parentActivity);
        t21Var.setScaleType(ImageView.ScaleType.MATRIX);
        t21Var.setImageBitmap(bitmap2);
        t21Var.b(frameLayout.getWidth() / 2.0f, 0.0f, true);
        t21Var.setRadius(0.0f);
        frameLayout.addView(t21Var, new FrameLayout.LayoutParams(-1, -1));
        return t21Var;
    }

    public final void x() {
        if (!A()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.hp
            public final /* synthetic */ wp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.v(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.Components.hp
            public final /* synthetic */ wp b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.z1
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.v(false);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.p();
    }

    public final void y() {
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
            yj0 yj0Var = this.E;
            if (yj0Var != null && themedColor != this.j0) {
                this.j0 = themedColor;
                yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.c;
            if (h2Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.j5;
                h2Var.a(getThemedColor(i10));
                h2Var.b(getThemedColor(i10));
                ImageView imageView = this.b;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
            if (themedColor2 != this.k0) {
                this.k0 = themedColor2;
                setBackgroundColor(themedColor2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void z() {
        if (isDismissed() || this.N) {
            return;
        }
        org.telegram.ui.ActionBar.k6.b = false;
        TLRPC.WallPaper wallPaper = A() ? null : this.n.g;
        org.telegram.ui.ActionBar.f4 f4Var = this.L.a;
        if (f4Var.a) {
            this.n.q(null, wallPaper, false, Boolean.valueOf(this.M), true);
        } else {
            this.n.q(f4Var, wallPaper, false, Boolean.valueOf(this.M), true);
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            ij ijVar = tiVar.r0;
            if (ijVar != null) {
                boolean z10 = this.M;
                za zaVar = ijVar.v;
                ((ArrayList) zaVar.e).clear();
                WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                zaVar.l();
            }
            this.X.h1();
        }
        up upVar = this.h;
        if (upVar == null || upVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < upVar.d.size(); i10++) {
            ((vp) upVar.d.get(i10)).c = this.M ? 1 : 0;
        }
        upVar.l();
    }
}
