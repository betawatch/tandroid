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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qo0 extends View {
    public static final av0 v;
    public ImageReceiver a;
    public e9 b;
    public org.telegram.ui.Cells.z c;
    public Paint d;
    public Paint e;
    public o1.k f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;

    static {
        av0 av0Var = new av0(new r2(28), new r2(29));
        av0Var.c = 100.0f;
        v = av0Var;
    }

    public final void a(boolean z10, boolean z11, float f9) {
        if (!z10) {
            this.n = f9;
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
            ValueAnimator duration = ValueAnimator.ofFloat(this.n, f9).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(jr.f);
            this.h.addUpdateListener(new d70(this, 16));
            this.h.addListener(new zz(this, 19));
            this.h.start();
            return;
        }
        float f10 = this.n * 100.0f;
        o1.k kVar2 = new o1.k(this, v);
        kVar2.b = f10;
        kVar2.c = true;
        this.f = kVar2;
        boolean z12 = f9 < this.n;
        float f11 = f9 * 100.0f;
        this.s = z12;
        this.r = !z12;
        o1.l lVar = new o1.l(f11);
        lVar.i = f11;
        lVar.b(450.0f);
        lVar.a(1.0f);
        kVar2.u = lVar;
        this.f.b(new gh(this, z12, f10, f11));
        this.f.a(new db(this, 3));
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
        float f9 = 1.0f;
        if (this.r) {
            f9 = 1.0f - this.n;
        } else if (this.s) {
            f9 = this.n;
        }
        canvas.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
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
        e9 e9Var = this.b;
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, tLObject instanceof TLRPC.User ? UserObject.getFirstName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        e9Var.p(tLObject);
        this.a.setForUserOrChat(tLObject, e9Var);
    }

    public void setProgress(float f9) {
        a(true, f9 != 0.0f, f9);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }
}
