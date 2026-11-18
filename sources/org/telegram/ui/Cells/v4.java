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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public static wz y;
    public final org.telegram.ui.Components.n6 a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.q9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.i6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public v4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.w = 0.0f;
        this.f = i6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        q9Var.setBackground(L);
        q9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = gd.a0;
        addView(q9Var, c8.ma.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.a = n6Var;
        lr lrVar = lr.h;
        n6Var.b(0.4f, 350L, lrVar);
        n6Var.setScaleProperty(0.6f);
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(gd.a0 ? 5 : 3);
        n6Var.getDrawable().N = org.telegram.messenger.g0.q.x;
        ks.i(n6Var);
        boolean z11 = gd.a0;
        addView(n6Var, c8.ma.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.b = n6Var2;
        n6Var2.setScaleProperty(0.6f);
        n6Var2.b(0.4f, 350L, lrVar);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.A6, i6Var);
        n6Var2.setGravity(gd.a0 ? 5 : 3);
        boolean z12 = gd.a0;
        addView(n6Var2, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        q9Var.setAlpha(this.w);
        n6Var.setAlpha(this.w);
        n6Var2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7, boolean z10, boolean z11) {
        String str;
        CharSequence charSequence;
        this.e = z10;
        org.telegram.ui.Components.n6 n6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.j6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), n6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            n6Var.c(charSequence, this.h && !gd.a0 && z11, true);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            n6Var2.c(tL_messageMediaVenue.address, this.h && !gd.a0 && z11, true);
        }
        int i10 = i7 % 7;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        org.telegram.ui.Components.q9 q9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.ej, this.f, PorterDuff.Mode.MULTIPLY);
                mq mqVar = new mq(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                mqVar.h = L;
                mqVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                mqVar.e = L3;
                mqVar.f = L4;
                q9Var.setImageDrawable(mqVar);
            } else {
                q9Var.h(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(i11);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z12 = tL_messageMediaVenue == null;
        final float f10 = this.w;
        final float f11 = z12 ? 0.0f : 1.0f;
        final long abs = (long) (Math.abs(f10 - f11) * 150.0f);
        this.x = ValueAnimator.ofFloat(f10, f11);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.u4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                v4 v4Var = v4.this;
                v4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j3 = abs;
                float T1 = org.telegram.messenger.g0.T1(f10, f11, j3 > 0 ? Math.min(Math.max(elapsedRealtime2 / j3, 0.0f), 1.0f) : 1.0f);
                v4Var.w = T1;
                v4Var.c.setAlpha(T1);
                v4Var.a.setAlpha(v4Var.w);
                v4Var.b.setAlpha(v4Var.w);
                v4Var.invalidate();
            }
        });
        this.x.setDuration(z12 ? Long.MAX_VALUE : abs);
        this.x.start();
        q9Var.setAlpha(f10);
        n6Var.setAlpha(f10);
        n6Var2.setAlpha(f10);
        if (tL_messageMediaVenue == null) {
            try {
                try {
                } catch (Exception unused) {
                    setContentDescription(null);
                }
            } catch (Exception unused2) {
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

    public org.telegram.ui.Components.q9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        wz wzVar = y;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        if (wzVar == null) {
            wz wzVar2 = new wz(getContext(), i6Var);
            y = wzVar2;
            wzVar2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        wz wzVar3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(56.0f);
        wzVar3.P = measuredWidth;
        wzVar3.Q = measuredHeight;
        wzVar3.R = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), n10.z(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint g10 = i6Var == null ? null : i6Var.g("paintDivider");
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.n6.k0;
            }
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getHeight() - 1, gd.a0 ? getWidth() - org.telegram.messenger.g0.L(72.0f) : getWidth(), getHeight() - 1, g10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
