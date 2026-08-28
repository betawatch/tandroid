package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c11 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public SharedConfig.ProxyInfo d;
    public Drawable e;
    public final org.telegram.ui.Components.dp f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 10.0f, z10 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 56 : 21, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        addView(imageView, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new q50(this, 27));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.f = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.i7, org.telegram.ui.ActionBar.f6.g7, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawBackgroundAsArc(14);
        dpVar.setVisibility(8);
        addView(dpVar, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.n == z10 && z11) {
            return;
        }
        this.n = z10;
        float dp = LocaleController.isRTL ? -AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.gr.f);
            duration.addUpdateListener(new cg(this, dp, 4));
            duration.addListener(new n60(6, this, z10));
            duration.start();
            return;
        }
        if (!z10) {
            dp = 0.0f;
        }
        this.a.setTranslationX(dp);
        this.b.setTranslationX(dp);
        ImageView imageView = this.c;
        imageView.setTranslationX(dp);
        boolean z12 = LocaleController.isRTL;
        int dp2 = AndroidUtilities.dp(32.0f);
        if (!z12) {
            dp2 = -dp2;
        }
        float f10 = dp2 + dp;
        org.telegram.ui.Components.dp dpVar = this.f;
        dpVar.setTranslationX(f10);
        imageView.setVisibility(z10 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        dpVar.setVisibility(z10 ? 0 : 8);
        dpVar.setAlpha(1.0f);
        dpVar.setScaleX(1.0f);
        dpVar.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i9;
        Drawable drawable;
        SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
        SharedConfig.ProxyInfo proxyInfo2 = this.d;
        TextView textView = this.b;
        if (proxyInfo == proxyInfo2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i10 = proxyListActivity.c;
                if (i10 == 3 || i10 == 5) {
                    i9 = org.telegram.ui.ActionBar.f6.s6;
                    if (proxyInfo2.ping != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Cells.j2.k(R.string.Connected, ", ", sb2);
                        sb2.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(LocaleController.getString(R.string.Connected));
                    }
                    SharedConfig.ProxyInfo proxyInfo3 = this.d;
                    if (!proxyInfo3.checking && !proxyInfo3.available) {
                        proxyInfo3.availableCheckTime = 0L;
                    }
                } else {
                    i9 = org.telegram.ui.ActionBar.f6.z6;
                    textView.setText(LocaleController.getString(R.string.Connecting));
                }
                this.r = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
                textView.setTag(Integer.valueOf(i9));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (proxyInfo2.checking) {
            textView.setText(LocaleController.getString(R.string.Checking));
            i9 = org.telegram.ui.ActionBar.f6.z6;
        } else if (proxyInfo2.available) {
            if (proxyInfo2.ping != 0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.Available, ", ", sb3);
                sb3.append(LocaleController.formatString("Ping", R.string.Ping, Long.valueOf(this.d.ping)));
                textView.setText(sb3.toString());
            } else {
                textView.setText(LocaleController.getString(R.string.Available));
            }
            i9 = org.telegram.ui.ActionBar.f6.w6;
        } else {
            textView.setText(LocaleController.getString(R.string.Unavailable));
            i9 = org.telegram.ui.ActionBar.f6.p7;
        }
        this.r = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        textView.setTag(Integer.valueOf(i9));
        textView.setTextColor(this.r);
        drawable = this.e;
        if (drawable == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), org.telegram.messenger.ll.C(64.0f, 1, TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.b;
        if (!z10) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (this.e == null) {
            this.e = getResources().getDrawable(R.drawable.proxy_check).mutate();
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
        }
        if (LocaleController.isRTL) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        this.a.setText(proxyInfo.address + ":" + proxyInfo.port);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
