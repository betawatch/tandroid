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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cz0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public org.telegram.messenger.sz d;
    public Drawable e;
    public final org.telegram.ui.Components.ep f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 56 : 21, 10.0f, z10 ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 56 : 21, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131751336, null));
        addView(imageView, w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new f50(this, 28));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.f = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.i7, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawBackgroundAsArc(14);
        epVar.setVisibility(8);
        addView(epVar, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.n == z10 && z11) {
            return;
        }
        this.n = z10;
        float L = org.telegram.messenger.cd.X ? -org.telegram.messenger.i0.L(32.0f) : org.telegram.messenger.i0.L(32.0f);
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
            duration.setInterpolator(org.telegram.ui.Components.gr.f);
            duration.addUpdateListener(new eg(this, L, 4));
            duration.addListener(new org.telegram.ui.Components.ha0(22, this, z10));
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
        boolean z12 = org.telegram.messenger.cd.X;
        int L2 = org.telegram.messenger.i0.L(32.0f);
        if (!z12) {
            L2 = -L2;
        }
        float f7 = L2 + L;
        org.telegram.ui.Components.ep epVar = this.f;
        epVar.setTranslationX(f7);
        imageView.setVisibility(z10 ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        epVar.setVisibility(z10 ? 0 : 8);
        epVar.setAlpha(1.0f);
        epVar.setScaleX(1.0f);
        epVar.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        Drawable drawable;
        org.telegram.messenger.sz szVar = org.telegram.messenger.tz.B1;
        org.telegram.messenger.sz szVar2 = this.d;
        TextView textView = this.b;
        if (szVar == szVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i11 = proxyListActivity.c;
                if (i11 == 3 || i11 == 5) {
                    i10 = org.telegram.ui.ActionBar.t6.s6;
                    if (szVar2.b != 0) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.z20.q(null, 2131751812, sb2, ", ");
                        sb2.append(org.telegram.messenger.cd.a0("Ping", null, 2131747252, Long.valueOf(this.d.b)));
                        textView.setText(sb2.toString());
                    } else {
                        textView.setText(org.telegram.messenger.cd.L0(2131751812, null));
                    }
                    org.telegram.messenger.sz szVar3 = this.d;
                    if (!szVar3.c && !szVar3.d) {
                        szVar3.e = 0L;
                    }
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.z6;
                    textView.setText(org.telegram.messenger.cd.L0(2131751809, null));
                }
                this.r = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
                textView.setTag(Integer.valueOf(i10));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (szVar2.c) {
            textView.setText(org.telegram.messenger.cd.L0(2131752141, null));
            i10 = org.telegram.ui.ActionBar.t6.z6;
        } else if (szVar2.d) {
            if (szVar2.b != 0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.z20.q(null, 2131753761, sb3, ", ");
                sb3.append(org.telegram.messenger.cd.a0("Ping", null, 2131747252, Long.valueOf(this.d.b)));
                textView.setText(sb3.toString());
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131753761, null));
            }
            i10 = org.telegram.ui.ActionBar.t6.w6;
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131743938, null));
            i10 = org.telegram.ui.ActionBar.t6.p7;
        }
        this.r = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        textView.setTag(Integer.valueOf(i10));
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
        canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.messenger.z20.B(64.0f, 1, TLObject.FLAG_30));
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
        if (org.telegram.messenger.cd.X) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(org.telegram.messenger.sz szVar) {
        String str;
        if (szVar.a.a == 3) {
            str = a1.g.r(new StringBuilder(), szVar.a.b, " (WEB)");
        } else {
            str = szVar.a.b + ":" + szVar.a.c;
        }
        this.a.setText(str);
        this.d = szVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int x02;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.t6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.r) {
                    this.r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
