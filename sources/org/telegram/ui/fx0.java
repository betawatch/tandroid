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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fx0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public org.telegram.messenger.zy d;
    public Drawable e;
    public final org.telegram.ui.Components.wo f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        boolean z10 = org.telegram.messenger.bd.a0;
        addView(textView, b8.mf.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 10.0f, z10 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.bd.a0;
        addView(textView2, b8.mf.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 56 : 21, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131751336, null));
        addView(imageView, b8.mf.d(48, 48.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new b40(this, 28));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawBackgroundAsArc(14);
        woVar.setVisibility(8);
        addView(woVar, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.n == z10 && z11) {
            return;
        }
        this.n = z10;
        float L = org.telegram.messenger.bd.a0 ? -org.telegram.messenger.g0.L(32.0f) : org.telegram.messenger.g0.L(32.0f);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.xq.f);
            duration.addUpdateListener(new of(this, L, 4));
            duration.addListener(new u40(6, this, z10));
            duration.start();
            return;
        }
        if (!z10) {
            L = 0.0f;
        }
        this.a.setTranslationX(L);
        this.b.setTranslationX(L);
        ImageView imageView = this.c;
        imageView.setTranslationX(L);
        boolean z12 = org.telegram.messenger.bd.a0;
        int L2 = org.telegram.messenger.g0.L(32.0f);
        if (!z12) {
            L2 = -L2;
        }
        float f10 = L2 + L;
        org.telegram.ui.Components.wo woVar = this.f;
        woVar.setTranslationX(f10);
        imageView.setVisibility(z10 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        woVar.setVisibility(z10 ? 0 : 8);
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
        int i3;
        Drawable drawable;
        org.telegram.messenger.zy zyVar = org.telegram.messenger.az.B1;
        org.telegram.messenger.zy zyVar2 = this.d;
        TextView textView = this.b;
        if (zyVar == zyVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i10 = proxyListActivity.c;
                if (i10 == 3 || i10 == 5) {
                    i3 = org.telegram.ui.ActionBar.k6.s6;
                    if (zyVar2.b != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131751812, sb2, ", ");
                        sb2.append(org.telegram.messenger.bd.a0("Ping", null, 2131747244, Long.valueOf(this.d.b)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(org.telegram.messenger.bd.M0(2131751812, null));
                    }
                    org.telegram.messenger.zy zyVar3 = this.d;
                    if (!zyVar3.c && !zyVar3.d) {
                        zyVar3.e = 0L;
                    }
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.z6;
                    textView.setText(org.telegram.messenger.bd.M0(2131751809, null));
                }
                this.r = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                textView.setTag(Integer.valueOf(i3));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (zyVar2.c) {
            textView.setText(org.telegram.messenger.bd.M0(2131752141, null));
            i3 = org.telegram.ui.ActionBar.k6.z6;
        } else if (zyVar2.d) {
            if (zyVar2.b != 0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131753761, sb3, ", ");
                sb3.append(org.telegram.messenger.bd.a0("Ping", null, 2131747244, Long.valueOf(this.d.b)));
                textView.setText(sb3.toString());
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131753761, null));
            }
            i3 = org.telegram.ui.ActionBar.k6.w6;
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131743923, null));
            i3 = org.telegram.ui.ActionBar.k6.p7;
        }
        this.r = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        textView.setTag(Integer.valueOf(i3));
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
        canvas.drawLine(org.telegram.messenger.bd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(64.0f, 1, TLObject.FLAG_30));
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
        if (org.telegram.messenger.bd.a0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(org.telegram.messenger.zy zyVar) {
        String str;
        if (zyVar.a.a == 3) {
            str = a1.g.s(new StringBuilder(), zyVar.a.b, " (WEB)");
        } else {
            str = zyVar.a.b + ":" + zyVar.a.c;
        }
        this.a.setText(str);
        this.d = zyVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.z5
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

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
