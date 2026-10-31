package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x4 extends FrameLayout {
    public static zz y;
    public final org.telegram.ui.Components.f6 a;
    public final org.telegram.ui.Components.f6 b;
    public final org.telegram.ui.Components.g9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.p6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public x4(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.w = 0.0f;
        this.f = p6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.c = g9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), -1);
        this.d = L;
        g9Var.setBackground(L);
        g9Var.u(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(30.0f));
        boolean z10 = cd.X;
        addView(g9Var, w7.b6.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        this.a = f6Var;
        gr grVar = gr.h;
        f6Var.b(0.4f, 350L, grVar);
        f6Var.setScaleProperty(0.6f);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setGravity(cd.X ? 5 : 3);
        f6Var.getDrawable().M = org.telegram.messenger.i0.q.x;
        zs.i(f6Var);
        boolean z11 = cd.X;
        addView(f6Var, w7.b6.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.b = f6Var2;
        f6Var2.setScaleProperty(0.6f);
        f6Var2.b(0.4f, 350L, grVar);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.A6, p6Var);
        f6Var2.setGravity(cd.X ? 5 : 3);
        boolean z12 = cd.X;
        addView(f6Var2, w7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        g9Var.setAlpha(this.w);
        f6Var.setAlpha(this.w);
        f6Var2.setAlpha(this.w);
    }

    public static int a(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return -1351584;
        }
        if (i11 == 1) {
            return -868277;
        }
        if (i11 == 2) {
            return -12214795;
        }
        if (i11 == 3) {
            return -13187226;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1285237 : -12338729;
        }
        return -7900675;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z10, boolean z11) {
        String str;
        CharSequence charSequence;
        this.e = z10;
        org.telegram.ui.Components.f6 f6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.k6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), f6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            f6Var.c(charSequence, this.h && !cd.X && z11, true);
        }
        org.telegram.ui.Components.f6 f6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            f6Var2.c(tL_messageMediaVenue.address, this.h && !cd.X && z11, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.g9 g9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.bj, this.f, PorterDuff.Mode.MULTIPLY);
                eq eqVar = new eq(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.i0.L(42.0f);
                int L2 = org.telegram.messenger.i0.L(42.0f);
                eqVar.h = L;
                eqVar.n = L2;
                int L3 = org.telegram.messenger.i0.L(24.0f);
                int L4 = org.telegram.messenger.i0.L(24.0f);
                eqVar.e = L3;
                eqVar.f = L4;
                g9Var.setImageDrawable(eqVar);
            } else {
                g9Var.h(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z12 = tL_messageMediaVenue == null;
        final float f7 = this.w;
        final float f10 = z12 ? 0.0f : 1.0f;
        final long abs = (long) (Math.abs(f7 - f10) * 150.0f);
        this.x = ValueAnimator.ofFloat(f7, f10);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.w4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                x4 x4Var = x4.this;
                x4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j10 = abs;
                float T1 = org.telegram.messenger.i0.T1(f7, f10, j10 > 0 ? Math.min(Math.max(elapsedRealtime2 / j10, 0.0f), 1.0f) : 1.0f);
                x4Var.w = T1;
                x4Var.c.setAlpha(T1);
                x4Var.a.setAlpha(x4Var.w);
                x4Var.b.setAlpha(x4Var.w);
                x4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.x;
        if (z12) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.x.start();
        g9Var.setAlpha(f7);
        f6Var.setAlpha(f7);
        f6Var2.setAlpha(f7);
        if (tL_messageMediaVenue == null) {
            try {
            } catch (Exception unused) {
                setContentDescription(null);
            }
            if (TextUtils.isEmpty(null)) {
                setContentDescription(null);
                invalidate();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb2.append(tL_messageMediaVenue.title);
        }
        String str2 = (TextUtils.isEmpty(null) && tL_messageMediaVenue != null) ? tL_messageMediaVenue.address : null;
        if (!TextUtils.isEmpty(str2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((CharSequence) str2);
        }
        setContentDescription(sb2.length() > 0 ? sb2.toString() : null);
        invalidate();
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zz zzVar = y;
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        if (zzVar == null) {
            zz zzVar2 = new zz(getContext(), p6Var);
            y = zzVar2;
            zzVar2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        zz zzVar3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = org.telegram.messenger.i0.L(56.0f);
        zzVar3.O = measuredWidth;
        zzVar3.P = measuredHeight;
        zzVar3.Q = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.i0.L(2.0f), z20.y(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = p6Var == null ? null : p6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(72.0f), getHeight() - 1, cd.X ? getWidth() - org.telegram.messenger.i0.L(72.0f) : getWidth(), getHeight() - 1, d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
