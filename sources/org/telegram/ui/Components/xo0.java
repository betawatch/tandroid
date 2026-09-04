package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xo0 extends View {
    public static final hv0 v;
    public ImageReceiver a;
    public i9 b;
    public org.telegram.ui.Cells.z c;
    public Paint d;
    public Paint e;
    public o1.k f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;

    static {
        hv0 hv0Var = new hv0(new p2(29), new wo0(0));
        hv0Var.c = 100.0f;
        v = hv0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (!z10) {
            this.n = f7;
            invalidate();
            return;
        }
        o1.k kVar = this.f;
        if (kVar != null) {
            kVar.c();
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
            duration.setInterpolator(pr.f);
            this.h.addUpdateListener(new h70(this, 16));
            this.h.addListener(new r80(this, 14));
            this.h.start();
            return;
        }
        float f10 = this.n * 100.0f;
        o1.k kVar2 = new o1.k(this, v);
        kVar2.b = f10;
        kVar2.c = true;
        this.f = kVar2;
        boolean z12 = f7 < this.n;
        float f11 = f7 * 100.0f;
        this.s = z12;
        this.r = !z12;
        o1.l lVar = new o1.l(f11);
        lVar.i = f11;
        lVar.b(450.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.f.b(new oh(this, z12, f10, f11));
        this.f.a(new hb(this, 3));
        this.f.f();
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
        this.a.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
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
        this.a.draw(canvas);
        int i10 = (int) (this.n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
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
        this.a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        i9 i9Var = this.b;
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, tLObject instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        i9Var.p(tLObject);
        this.a.setForUserOrChat(tLObject, i9Var);
    }

    public void setProgress(float f7) {
        a(true, f7 != 0.0f, f7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }
}
