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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nx0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public org.telegram.messenger.hz d;
    public Drawable e;
    public final org.telegram.ui.Components.wo f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        boolean z9 = org.telegram.messenger.hd.a0;
        addView(textView, c8.ha.d(-2, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 56 : 21, 10.0f, z9 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(textView2, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 35.0f, z10 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131751336, null));
        addView(imageView, c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new g40(this, 28));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawBackgroundAsArc(14);
        woVar.setVisibility(8);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z9, boolean z10) {
        if (this.n == z9 && z10) {
            return;
        }
        this.n = z9;
        float L = org.telegram.messenger.hd.a0 ? -org.telegram.messenger.g0.L(32.0f) : org.telegram.messenger.g0.L(32.0f);
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.xq.f);
            duration.addUpdateListener(new sf(this, L, 4));
            duration.addListener(new z40(6, this, z9));
            duration.start();
            return;
        }
        if (!z9) {
            L = 0.0f;
        }
        this.a.setTranslationX(L);
        this.b.setTranslationX(L);
        ImageView imageView = this.c;
        imageView.setTranslationX(L);
        boolean z11 = org.telegram.messenger.hd.a0;
        int L2 = org.telegram.messenger.g0.L(32.0f);
        if (!z11) {
            L2 = -L2;
        }
        float f10 = L2 + L;
        org.telegram.ui.Components.wo woVar = this.f;
        woVar.setTranslationX(f10);
        imageView.setVisibility(z9 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        woVar.setVisibility(z9 ? 0 : 8);
        woVar.setAlpha(1.0f);
        woVar.setScaleX(1.0f);
        woVar.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i7;
        Drawable drawable;
        org.telegram.messenger.hz hzVar = org.telegram.messenger.iz.B1;
        org.telegram.messenger.hz hzVar2 = this.d;
        TextView textView = this.b;
        if (hzVar == hzVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i10 = proxyListActivity.c;
                if (i10 == 3 || i10 == 5) {
                    i7 = org.telegram.ui.ActionBar.k6.s6;
                    if (hzVar2.b != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131751812, sb2, ", ");
                        sb2.append(org.telegram.messenger.hd.a0("Ping", null, 2131747235, Long.valueOf(this.d.b)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(org.telegram.messenger.hd.M0(2131751812, null));
                    }
                    org.telegram.messenger.hz hzVar3 = this.d;
                    if (!hzVar3.c && !hzVar3.d) {
                        hzVar3.e = 0L;
                    }
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.z6;
                    textView.setText(org.telegram.messenger.hd.M0(2131751809, null));
                }
                this.r = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
                textView.setTag(Integer.valueOf(i7));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (hzVar2.c) {
            textView.setText(org.telegram.messenger.hd.M0(2131752141, null));
            i7 = org.telegram.ui.ActionBar.k6.z6;
        } else if (hzVar2.d) {
            if (hzVar2.b != 0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753761, sb3, ", ");
                sb3.append(org.telegram.messenger.hd.a0("Ping", null, 2131747235, Long.valueOf(this.d.b)));
                textView.setText(sb3.toString());
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131753761, null));
            }
            i7 = org.telegram.ui.ActionBar.k6.w6;
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131743914, null));
            i7 = org.telegram.ui.ActionBar.k6.p7;
        }
        this.r = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        textView.setTag(Integer.valueOf(i7));
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
        canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(64.0f, 1, TLObject.FLAG_30));
    }

    public void setChecked(boolean z9) {
        TextView textView = this.b;
        if (!z9) {
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
        if (org.telegram.messenger.hd.a0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(org.telegram.messenger.hz hzVar) {
        String str;
        if (hzVar.a.a == 3) {
            str = a8.p0.s(new StringBuilder(), hzVar.a.b, " (WEB)");
        } else {
            str = hzVar.a.b + ":" + hzVar.a.c;
        }
        this.a.setText(str);
        this.d = hzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int x02;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.k6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.r) {
                    this.r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
