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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w4 extends FrameLayout {
    public static yz y;
    public final org.telegram.ui.Components.o6 a;
    public final org.telegram.ui.Components.o6 b;
    public final org.telegram.ui.Components.q9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.h6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public w4(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.w = 0.0f;
        this.f = h6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        q9Var.setBackground(L);
        q9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z10 = hd.a0;
        addView(q9Var, c8.ma.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.a = o6Var;
        nr nrVar = nr.h;
        o6Var.b(0.4f, 350L, nrVar);
        o6Var.setScaleProperty(0.6f);
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        o6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setGravity(hd.a0 ? 5 : 3);
        o6Var.getDrawable().N = org.telegram.messenger.g0.q.x;
        ls.i(o6Var);
        boolean z11 = hd.a0;
        addView(o6Var, c8.ma.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.b = o6Var2;
        o6Var2.setScaleProperty(0.6f);
        o6Var2.b(0.4f, 350L, nrVar);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.A6, h6Var);
        o6Var2.setGravity(hd.a0 ? 5 : 3);
        boolean z12 = hd.a0;
        addView(o6Var2, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        q9Var.setAlpha(this.w);
        o6Var.setAlpha(this.w);
        o6Var2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7, boolean z10, boolean z11) {
        String str;
        CharSequence charSequence;
        this.e = z10;
        org.telegram.ui.Components.o6 o6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.j6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), o6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            o6Var.c(charSequence, this.h && !hd.a0 && z11, true);
        }
        org.telegram.ui.Components.o6 o6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            o6Var2.c(tL_messageMediaVenue.address, this.h && !hd.a0 && z11, true);
        }
        int i10 = i7 % 7;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        org.telegram.ui.Components.q9 q9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.ej, this.f, PorterDuff.Mode.MULTIPLY);
                oq oqVar = new oq(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                oqVar.h = L;
                oqVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                oqVar.e = L3;
                oqVar.f = L4;
                q9Var.setImageDrawable(oqVar);
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
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.v4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                w4 w4Var = w4.this;
                w4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j3 = abs;
                float T1 = org.telegram.messenger.g0.T1(f10, f11, j3 > 0 ? Math.min(Math.max(elapsedRealtime2 / j3, 0.0f), 1.0f) : 1.0f);
                w4Var.w = T1;
                w4Var.c.setAlpha(T1);
                w4Var.a.setAlpha(w4Var.w);
                w4Var.b.setAlpha(w4Var.w);
                w4Var.invalidate();
            }
        });
        this.x.setDuration(z12 ? Long.MAX_VALUE : abs);
        this.x.start();
        q9Var.setAlpha(f10);
        o6Var.setAlpha(f10);
        o6Var2.setAlpha(f10);
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
        yz yzVar = y;
        org.telegram.ui.ActionBar.h6 h6Var = this.f;
        if (yzVar == null) {
            yz yzVar2 = new yz(getContext(), h6Var);
            y = yzVar2;
            yzVar2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        yz yzVar3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(56.0f);
        yzVar3.P = measuredWidth;
        yzVar3.Q = measuredHeight;
        yzVar3.R = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.g();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), o10.z(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint g10 = h6Var == null ? null : h6Var.g("paintDivider");
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getHeight() - 1, hd.a0 ? getWidth() - org.telegram.messenger.g0.L(72.0f) : getWidth(), getHeight() - 1, g10);
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
