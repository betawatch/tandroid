package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends View {
    public org.telegram.ui.Cells.y a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Drawable f;
    public final String h;
    public int n;
    public int r;
    public int s;
    public int w;

    public i(Context context) {
        super(context);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.n = -761748;
        this.r = org.telegram.messenger.i0.L(26.0f);
        this.s = zs.e4;
        this.w = 0;
        Drawable mutate = getContext().getDrawable(R.drawable.calls_decline).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        paint.setTextSize(org.telegram.messenger.i0.L(18.0f));
        paint.setTypeface(org.telegram.messenger.i0.o());
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setTextSize(org.telegram.messenger.i0.L(18.0f));
        paint2.setTypeface(org.telegram.messenger.i0.o());
        paint2.setTextAlign(align);
        paint2.setColor(-16777216);
        setLayerType(2, null);
        setClickable(true);
        this.h = cd.L0(2131752041, null);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.a;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.a;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        int i10 = this.n;
        Paint paint = this.b;
        paint.setColor(i10);
        float width2 = getWidth();
        float height2 = getHeight();
        RectF rectF = this.e;
        rectF.set(0.0f, 0.0f, width2, height2);
        float f7 = this.r;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        Drawable drawable = this.f;
        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / 2.0f)), (int) (height - (drawable.getIntrinsicHeight() / 2)), (int) ((drawable.getIntrinsicWidth() / 2) + width), (int) ((drawable.getIntrinsicHeight() / 2) + height));
        drawable.setAlpha(this.s);
        drawable.draw(canvas);
        int i11 = this.w;
        Paint paint2 = this.c;
        paint2.setAlpha(i11);
        int i12 = (this.w / zs.e4) * 38;
        Paint paint3 = this.d;
        paint3.setAlpha(i12);
        String str = this.h;
        canvas.drawText(str, width, org.telegram.messenger.i0.L(6.0f) + height, paint2);
        canvas.drawText(str, width, height + org.telegram.messenger.i0.L(6.0f), paint3);
        if (this.a == null) {
            org.telegram.ui.Cells.y a02 = t6.a0(t6.x0(null, t6.i6, false), 8, 8);
            this.a = a02;
            a02.setCallback(this);
        }
        this.a.setBounds(0, 0, getWidth(), getHeight());
        this.a.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
