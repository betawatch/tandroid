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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class go0 extends View {
    public static final su0 v;
    public ImageReceiver a;
    public y8 b;
    public org.telegram.ui.Cells.z c;
    public Paint d;
    public Paint e;
    public o1.j f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;

    static {
        su0 su0Var = new su0(new pc0(9), new pc0(10));
        su0Var.c = 100.0f;
        v = su0Var;
    }

    public final void a(boolean z10, boolean z11, float f10) {
        if (!z10) {
            this.n = f10;
            invalidate();
            return;
        }
        o1.j jVar = this.f;
        if (jVar != null) {
            jVar.c();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = false;
        this.r = false;
        if (!z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(this.n, f10).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(er.f);
            this.h.addUpdateListener(new v60(this, 16));
            this.h.addListener(new sz(this, 19));
            this.h.start();
            return;
        }
        float f11 = this.n * 100.0f;
        o1.j jVar2 = new o1.j(this, v);
        jVar2.b = f11;
        jVar2.c = true;
        this.f = jVar2;
        boolean z12 = f10 < this.n;
        float f12 = f10 * 100.0f;
        this.s = z12;
        this.r = !z12;
        o1.k kVar = new o1.k(f12);
        kVar.i = f12;
        kVar.b(450.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.f.b(new zg(this, z12, f11, f12));
        this.f.a(new wa(this, 3));
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
        float f10 = 1.0f;
        if (this.r) {
            f10 = 1.0f - this.n;
        } else if (this.s) {
            f10 = this.n;
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
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
        y8 y8Var = this.b;
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, tLObject instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        y8Var.p(tLObject);
        this.a.setForUserOrChat(tLObject, y8Var);
    }

    public void setProgress(float f10) {
        a(true, f10 != 0.0f, f10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }
}
