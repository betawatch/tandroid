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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n21 implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.ij0 B;
    public final l21 C;
    public f2.j0 D;
    public final View E;
    public final View F;
    public a21 G;
    public org.telegram.ui.Components.lp H;
    public boolean J;
    public ValueAnimator K;
    public org.telegram.ui.Components.wo L;
    public float M;
    public boolean N;
    public boolean O;
    public final /* synthetic */ o21 P;
    public final org.telegram.ui.Components.kp b;
    public final k21 c;
    public final o21 d;
    public final Window e;
    public final Drawable f;
    public final ag.l h;
    public final TextView n;
    public final org.telegram.ui.Components.u00 r;
    public final TextView s;
    public final LinearLayout v;
    public final TextView w;
    public final ImageView x;
    public final org.telegram.ui.Components.tl0 y;
    public final Paint a = new Paint(1);
    public int I = -1;

    public n21(o21 o21Var, o21 o21Var2, Window window) {
        int i10;
        f2.j0 wVar;
        int i11;
        this.P = o21Var;
        this.d = o21Var2;
        this.e = window;
        Activity parentActivity = o21Var2.getParentActivity();
        this.c = new k21(parentActivity);
        Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f = mutate;
        int themedColor = o21Var2.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ag.l lVar = new ag.l(this, parentActivity, o21Var2);
        this.h = lVar;
        TextView textView = new TextView(parentActivity);
        this.n = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(o21Var2.getThemedColor(org.telegram.ui.ActionBar.k6.j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        lVar.addView(textView, k7.c6.d(-1, -2.0f, 8388659, 0.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor2 = o21Var2.getThemedColor(i12);
        int dp = AndroidUtilities.dp(28.0f);
        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.sun_outline, "" + R.raw.sun_outline, dp, dp, false, null);
        this.B = ij0Var;
        this.J = org.telegram.ui.ActionBar.k6.I.q() ^ true;
        a(org.telegram.ui.ActionBar.k6.I.q(), false);
        ij0Var.h = true;
        ij0Var.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN));
        l21 l21Var = new l21(this, parentActivity);
        this.C = l21Var;
        l21Var.setAnimation(ij0Var);
        l21Var.setScaleType(ImageView.ScaleType.CENTER);
        l21Var.setOnClickListener(new f60(this, 28));
        l21Var.setAlpha(0.0f);
        l21Var.setVisibility(4);
        lVar.addView(l21Var, k7.c6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity, o21Var2.a);
        this.r = u00Var;
        u00Var.setVisibility(0);
        lVar.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        this.O = true;
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(parentActivity, null);
        this.y = tl0Var;
        i10 = ((org.telegram.ui.ActionBar.p2) o21Var).currentAccount;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(i10, 2, o21Var.a);
        this.b = kpVar;
        tl0Var.setAdapter(kpVar);
        tl0Var.setClipChildren(false);
        tl0Var.setClipToPadding(false);
        tl0Var.setItemAnimator(null);
        tl0Var.setNestedScrollingEnabled(false);
        if (this.O) {
            o21Var2.getParentActivity();
            wVar = new f2.j0(0, false);
        } else {
            o21Var2.getParentActivity();
            wVar = new f2.w(3, false);
        }
        this.D = wVar;
        tl0Var.setLayoutManager(wVar);
        tl0Var.setOnItemClickListener(new j(this, 29));
        tl0Var.setOnScrollListener(new org.telegram.ui.Components.o41(this));
        lVar.addView(tl0Var);
        View view = new View(parentActivity);
        this.E = view;
        view.setAlpha(0.0f);
        view.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        view.setRotation(180.0f);
        lVar.addView(view);
        View view2 = new View(parentActivity);
        this.F = view2;
        view2.setBackground(parentActivity.getDrawable(R.drawable.shadowdown));
        lVar.addView(view2);
        TextView textView2 = new TextView(parentActivity);
        this.s = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, o21Var2.getThemedColor(i12)));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setText(LocaleController.getString(R.string.ShareQrCode));
        textView2.setTextColor(o21Var2.getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        lVar.addView(textView2);
        i11 = ((org.telegram.ui.ActionBar.p2) o21Var).currentAccount;
        if (UserConfig.getInstance(i11).getClientUserId() != o21Var.I) {
            this.v = null;
            this.x = null;
            this.w = null;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.v = linearLayout;
        linearLayout.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{24.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.a6.b(o21Var2.getThemedColor(i12)), 25)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(parentActivity);
        this.x = imageView;
        imageView.setLayoutParams(k7.c6.t(24, 24, 17, 0, 0, 10, 0));
        imageView.setImageResource(R.drawable.profile_qr_scan_24);
        imageView.setColorFilter(new PorterDuffColorFilter(o21Var2.getThemedColor(i12), mode));
        linearLayout.addView(imageView);
        TextView textView3 = new TextView(parentActivity);
        this.w = textView3;
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setText(LocaleController.getString(R.string.ScanQrCode));
        textView3.setTextColor(o21Var2.getThemedColor(i12));
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3);
        lVar.addView(linearLayout);
    }

    public final void a(boolean z4, boolean z10) {
        if (this.J == z4) {
            return;
        }
        this.J = z4;
        org.telegram.ui.Components.ij0 ij0Var = this.B;
        int i10 = z4 ? ij0Var.e[0] - 1 : 0;
        l21 l21Var = this.C;
        if (z10) {
            ij0Var.N(i10);
            if (l21Var != null) {
                l21Var.d();
                return;
            }
            return;
        }
        ij0Var.N(i10);
        ij0Var.L(i10, false, true);
        if (l21Var != null) {
            l21Var.invalidate();
        }
    }

    public final void b(int i10) {
        this.I = i10;
        org.telegram.ui.Components.kp kpVar = this.b;
        kpVar.E(i10);
        if (i10 > 0 && i10 < kpVar.d.size() / 2) {
            i10--;
        }
        this.D.h1(Math.min(i10, kpVar.d.size() - 1), 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.b.l();
        }
    }
}
