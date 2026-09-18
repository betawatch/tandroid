package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d31 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.ij0 E;
    public final b31 F;
    public s4.c0 G;
    public final View H;
    public final View I;
    public p21 J;
    public org.telegram.ui.Components.lp K;
    public boolean M;
    public ValueAnimator N;
    public ci.wb O;
    public float P;
    public boolean Q;
    public boolean R;
    public final /* synthetic */ e31 S;
    public final org.telegram.ui.Components.kp b;
    public final a31 c;
    public final e31 d;
    public final Window e;
    public final Drawable f;
    public final ci.n6 h;
    public final TextView n;
    public final org.telegram.ui.Components.t00 r;
    public final TextView s;
    public final LinearLayout v;
    public final TextView w;
    public final ImageView x;
    public final org.telegram.ui.Components.wl0 y;
    public final Paint a = new Paint(1);
    public int L = -1;

    public d31(e31 e31Var, e31 e31Var2, Window window) {
        int i10;
        s4.c0 sVar;
        int i11;
        this.S = e31Var;
        this.d = e31Var2;
        this.e = window;
        Activity parentActivity = e31Var2.getParentActivity();
        this.c = new a31(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f = mutate;
        int themedColor = e31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ci.n6 n6Var = new ci.n6(this, parentActivity, e31Var2);
        this.h = n6Var;
        TextView textView = new TextView(parentActivity);
        this.n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(e31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        n6Var.addView(textView, w7.y5.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor2 = e31Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.sun_outline, dp, dp, false, null);
        this.E = ij0Var;
        this.M = !org.telegram.ui.ActionBar.j6.I.q();
        int i13 = 0;
        a(org.telegram.ui.ActionBar.j6.I.q(), false);
        ij0Var.h = true;
        ij0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        b31 b31Var = new b31(this, parentActivity);
        this.F = b31Var;
        b31Var.setAnimation(ij0Var);
        b31Var.setScaleType(ImageView.ScaleType.CENTER);
        b31Var.setOnClickListener(new k60(this, 27));
        b31Var.setAlpha(0.0f);
        b31Var.setVisibility(4);
        n6Var.addView(b31Var, w7.y5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity, e31Var2.a);
        this.r = t00Var;
        t00Var.setVisibility(0);
        n6Var.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.R = true;
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(parentActivity, null);
        this.y = wl0Var;
        i10 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(i10, 2, e31Var.a);
        this.b = kpVar;
        wl0Var.setAdapter(kpVar);
        wl0Var.setClipChildren(false);
        wl0Var.setClipToPadding(false);
        wl0Var.setItemAnimator(null);
        wl0Var.setNestedScrollingEnabled(false);
        if (this.R) {
            e31Var2.getParentActivity();
            sVar = new s4.c0(0, false);
        } else {
            e31Var2.getParentActivity();
            sVar = new s4.s(3, false);
        }
        this.G = sVar;
        wl0Var.setLayoutManager(sVar);
        wl0Var.setOnItemClickListener(new z21(this, i13));
        wl0Var.setOnScrollListener(new org.telegram.ui.Components.c51(this));
        n6Var.addView(wl0Var);
        View view = new View(parentActivity);
        this.H = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        n6Var.addView(view);
        View view2 = new View(parentActivity);
        this.I = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        n6Var.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{24.0f}, e31Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(e31Var2.getThemedColor(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        n6Var.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() != e31Var.L) {
            this.v = null;
            this.x = null;
            this.w = null;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.v = linearLayout;
        linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(e31Var2.getThemedColor(i12)), 25)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(parentActivity);
        this.x = imageView;
        imageView.setLayoutParams(w7.y5.t(24, 24, 17, 0, 0, 10, 0));
        imageView.setImageResource(R.drawable.profile_qr_scan_24);
        imageView.setColorFilter(new PorterDuffColorFilter(e31Var2.getThemedColor(i12), mode));
        linearLayout.addView(imageView);
        TextView textView3 = new TextView(parentActivity);
        this.w = textView3;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setText(LocaleController.getString(R.string.ScanQrCode));
        textView3.setTextColor(e31Var2.getThemedColor(i12));
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3);
        n6Var.addView(linearLayout);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        org.telegram.ui.Components.ij0 ij0Var = this.E;
        int i10 = z10 ? ij0Var.e[0] - 1 : 0;
        b31 b31Var = this.F;
        if (z11) {
            ij0Var.P(i10);
            if (b31Var != null) {
                b31Var.d();
                return;
            }
            return;
        }
        ij0Var.P(i10);
        ij0Var.N(i10, false, true);
        if (b31Var != null) {
            b31Var.invalidate();
        }
    }

    public final void b(int i10) {
        this.L = i10;
        org.telegram.ui.Components.kp kpVar = this.b;
        kpVar.E(i10);
        if (i10 > 0 && i10 < kpVar.d.size() / 2) {
            i10--;
        }
        this.G.h1(Math.min(i10, kpVar.d.size() - 1), 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.l();
        }
    }
}
