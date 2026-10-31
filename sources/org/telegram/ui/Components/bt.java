package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class bt extends View {
    public final qz0 a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public vg.f f;

    public bt(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(22.66f));
        this.a = new qz0(charSequence, 14.0f, org.telegram.messenger.i0.o());
        Drawable f7 = i0.a.f(context, R.drawable.arrow_newchat);
        this.b = f7;
        f7.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(48.0f), false, null, true);
        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(24.0f), false, w9, false);
        this.c.r0(org.telegram.messenger.ic.i(w9, photo), "24_24", org.telegram.messenger.ic.i(w10, photo), "24_24", null, 0L, null, obj, 0);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.c;
        boolean I = imageReceiver.I();
        int L = org.telegram.messenger.i0.L(19.0f) + ((int) Math.ceil(this.a.c)) + org.telegram.messenger.i0.L(I ? 30.33f : 11.33f);
        int L2 = org.telegram.messenger.i0.L(24.0f);
        int width = (getWidth() - L) / 2;
        int height = getHeight() / 2;
        int i10 = height - (L2 / 2);
        int i11 = L + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, L2 + i10);
        rect.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        vg.f fVar = this.f;
        if (fVar != null) {
            fVar.setBounds(rect);
            this.f.draw(canvas);
        }
        if (I) {
            float L3 = org.telegram.messenger.i0.L(0.66f) + width;
            float f7 = height;
            float L4 = f7 - (org.telegram.messenger.i0.L(22.66f) / 2.0f);
            float L5 = org.telegram.messenger.i0.L(23.32f) + width;
            float L6 = (org.telegram.messenger.i0.L(22.66f) / 2.0f) + f7;
            RectF rectF = this.e;
            rectF.set(L3, L4, L5, L6);
            imageReceiver.A0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + r2, height, 1.0f, -1, canvas);
        int L7 = i11 - org.telegram.messenger.i0.L(17.0f);
        int L8 = height - org.telegram.messenger.i0.L(6.0f);
        int L9 = i11 - org.telegram.messenger.i0.L(5.0f);
        int L10 = org.telegram.messenger.i0.L(6.0f) + height;
        Drawable drawable = this.b;
        drawable.setBounds(L7, L8, L9, L10);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(vg.f fVar) {
        fVar.p(org.telegram.messenger.i0.L(4.0f));
        fVar.q(org.telegram.messenger.i0.L(11.0f));
        this.f = fVar;
    }

    public void setImage(Bitmap bitmap) {
        this.c.v0(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new cd(29, this, str));
        }
    }
}
