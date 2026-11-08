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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cn0 extends View implements org.telegram.ui.ActionBar.a6 {
    public static final lt0 x;
    public ImageReceiver a;
    public w8 b;
    public org.telegram.ui.Cells.y c;
    public Paint d;
    public Paint e;
    public r1.g f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int w;

    static {
        lt0 lt0Var = new lt0(new il0(4), new il0(5));
        lt0Var.c = 100.0f;
        x = lt0Var;
    }

    public final void a(boolean z9, boolean z10, float f10) {
        if (!z9) {
            this.n = f10;
            invalidate();
            return;
        }
        r1.g gVar = this.f;
        if (gVar != null) {
            gVar.d();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = false;
        this.r = false;
        if (!z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(xq.f);
            this.h.addUpdateListener(new c60(this, 15));
            this.h.addListener(new e60(this, 18));
            this.h.start();
            return;
        }
        float f11 = this.n * 100.0f;
        r1.g gVar2 = new r1.g(this, x);
        gVar2.b = f11;
        gVar2.c = true;
        this.f = gVar2;
        boolean z11 = f10 < this.n;
        float f12 = f10 * 100.0f;
        this.s = z11;
        this.r = !z11;
        r1.h hVar = new r1.h(f12);
        hVar.i = f12;
        hVar.b(450.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.f.b(new xg(this, z11, f11, f12));
        this.f.a(new ta(this, 4));
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
        float f10 = 1.0f;
        if (this.r) {
            f10 = 1.0f - this.n;
        } else if (this.s) {
            f10 = this.n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.a.h(canvas, null);
        int i7 = (int) (this.n * 255.0f);
        paint.setAlpha(i7);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i7);
        float strokeWidth = paint2.getStrokeWidth() + org.telegram.messenger.g0.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, TLObject.FLAG_30));
        this.a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        w8 w8Var = this.b;
        setContentDescription(org.telegram.messenger.id.a0("AccDescrSendAsPeer", null, 2131754775, tLObject instanceof TLRPC.User ? org.telegram.messenger.t10.j((TLRPC.User) tLObject, true) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        w8Var.l(tLObject);
        this.a.i0(tLObject, w8Var, null);
    }

    public void setProgress(float f10) {
        a(true, f10 != 0.0f, f10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rf, false));
        this.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qf, false));
        if (this.c != null) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            if (r12 != this.w) {
                this.w = r12;
                org.telegram.ui.ActionBar.k6.H1(this.c, r12, true);
            }
            invalidate();
            return;
        }
        this.w = org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = this.w;
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, i7, i7);
        this.c = k02;
        k02.setCallback(this);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
