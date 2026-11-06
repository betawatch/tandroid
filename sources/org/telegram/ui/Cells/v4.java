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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public static lz y;
    public final org.telegram.ui.Components.j6 a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.l9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.f6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public v4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.w = 0.0f;
        this.f = f6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), -1);
        this.d = L;
        l9Var.setBackground(L);
        l9Var.u(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
        boolean z9 = hd.a0;
        addView(l9Var, c8.ha.d(42, 42.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : 15.0f, 11.0f, z9 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.a = j6Var;
        xq xqVar = xq.h;
        j6Var.b(0.4f, 350L, xqVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(hd.a0 ? 5 : 3);
        j6Var.getDrawable().M = org.telegram.messenger.g0.q.x;
        qs.i(j6Var);
        boolean z10 = hd.a0;
        addView(j6Var, c8.ha.d(-1, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 16 : 73, 10.0f, z10 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.b = j6Var2;
        j6Var2.setScaleProperty(0.6f);
        j6Var2.b(0.4f, 350L, xqVar);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.A6, f6Var);
        j6Var2.setGravity(hd.a0 ? 5 : 3);
        boolean z11 = hd.a0;
        addView(j6Var2, c8.ha.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 35.0f, z11 ? 73 : 16, 0.0f));
        l9Var.setAlpha(this.w);
        j6Var.setAlpha(this.w);
        j6Var2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i7, boolean z9, boolean z10) {
        String str;
        CharSequence charSequence;
        this.e = z9;
        org.telegram.ui.Components.j6 j6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = org.telegram.messenger.i6.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), j6Var.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            j6Var.c(charSequence, this.h && !hd.a0 && z10, true);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            j6Var2.c(tL_messageMediaVenue.address, this.h && !hd.a0 && z10, true);
        }
        int i10 = i7 % 7;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? -1285237 : -12338729 : -7900675 : -13187226 : -12214795 : -868277 : -1351584;
        org.telegram.ui.Components.l9 l9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || "city".equals(tL_messageMediaVenue.icon) || "country".equals(tL_messageMediaVenue.icon) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable("city".equals(tL_messageMediaVenue.icon) ? R.drawable.location_city : "country".equals(tL_messageMediaVenue.icon) ? R.drawable.location_country : R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.bj, this.f, PorterDuff.Mode.MULTIPLY);
                xp xpVar = new xp(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), 0), mutate);
                int L = org.telegram.messenger.g0.L(42.0f);
                int L2 = org.telegram.messenger.g0.L(42.0f);
                xpVar.h = L;
                xpVar.n = L2;
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(24.0f);
                xpVar.e = L3;
                xpVar.f = L4;
                l9Var.setImageDrawable(xpVar);
            } else {
                l9Var.h(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(i11);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = tL_messageMediaVenue == null;
        final float f10 = this.w;
        final float f11 = z11 ? 0.0f : 1.0f;
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
        this.x.setDuration(z11 ? Long.MAX_VALUE : abs);
        this.x.start();
        l9Var.setAlpha(f10);
        j6Var.setAlpha(f10);
        j6Var2.setAlpha(f10);
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

    public org.telegram.ui.Components.l9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lz lzVar = y;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (lzVar == null) {
            lz lzVar2 = new lz(getContext(), f6Var);
            y = lzVar2;
            lzVar2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        lz lzVar3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(56.0f);
        lzVar3.O = measuredWidth;
        lzVar3.P = measuredHeight;
        lzVar3.Q = L * (-indexOfChild);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.camera.q.y(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = f6Var == null ? null : f6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), getHeight() - 1, hd.a0 ? getWidth() - org.telegram.messenger.g0.L(72.0f) : getWidth(), getHeight() - 1, d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z9) {
        this.h = z9;
    }
}
