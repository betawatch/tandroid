package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class do0 extends View implements org.telegram.ui.ActionBar.k6 {
    public static final ou0 x;
    public ImageReceiver a;
    public r8 b;
    public org.telegram.ui.Cells.y c;
    public Paint d;
    public Paint e;
    public o1.j f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int w;

    static {
        ou0 ou0Var = new ou0(new au(21), new au(22));
        ou0Var.c = 100.0f;
        x = ou0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (!z10) {
            this.n = f7;
            invalidate();
            return;
        }
        o1.j jVar = this.f;
        if (jVar != null) {
            jVar.d();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = false;
        this.r = false;
        if (!z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(gr.f);
            this.h.addUpdateListener(new r60(this, 16));
            this.h.addListener(new t60(this, 18));
            this.h.start();
            return;
        }
        float f10 = this.n * 100.0f;
        o1.j jVar2 = new o1.j(this, x);
        jVar2.b = f10;
        jVar2.c = true;
        this.f = jVar2;
        boolean z12 = f7 < this.n;
        float f11 = f7 * 100.0f;
        this.s = z12;
        this.r = !z12;
        o1.k kVar = new o1.k(f11);
        kVar.i = f11;
        kVar.b(450.0f);
        kVar.a(1.0f);
        jVar2.m = kVar;
        this.f.b(new tg(this, z12, f10, f11));
        this.f.a(new na(this, 4));
        this.f.h();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.n;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.r) {
            f7 = 1.0f - this.n;
        } else if (this.s) {
            f7 = this.n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.a.h(canvas, null);
        int i10 = (int) (this.n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.i0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, TLObject.FLAG_30));
        this.a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        r8 r8Var = this.b;
        setContentDescription(org.telegram.messenger.cd.a0("AccDescrSendAsPeer", null, 2131754775, tLObject instanceof TLRPC.User ? org.telegram.messenger.h20.j((TLRPC.User) tLObject, true) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        r8Var.l(tLObject);
        this.a.i0(tLObject, r8Var, null);
    }

    public void setProgress(float f7) {
        a(true, f7 != 0.0f, f7);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Rf, false));
        this.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Qf, false));
        if (this.c != null) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            if (r12 != this.w) {
                this.w = r12;
                org.telegram.ui.ActionBar.t6.H1(this.c, r12, true);
            }
            invalidate();
            return;
        }
        this.w = org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        int L = org.telegram.messenger.i0.L(18.0f);
        int i10 = this.w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, i10, i10);
        this.c = k02;
        k02.setCallback(this);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
