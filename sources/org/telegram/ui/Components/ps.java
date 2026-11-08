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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class ps extends View {
    public final my0 a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public fh.g f;

    public ps(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(22.66f));
        this.a = new my0(charSequence, 14.0f, org.telegram.messenger.g0.o());
        Drawable h = jg.g.h(context, R.drawable.arrow_newchat);
        this.b = h;
        h.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(48.0f), false, null, true);
        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.L(24.0f), false, w10, false);
        this.c.r0(org.telegram.messenger.hc.i(w10, photo), "24_24", org.telegram.messenger.hc.i(w11, photo), "24_24", null, 0L, null, obj, 0);
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
        int L = org.telegram.messenger.g0.L(19.0f) + ((int) Math.ceil(this.a.c)) + org.telegram.messenger.g0.L(I ? 30.33f : 11.33f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        int width = (getWidth() - L) / 2;
        int height = getHeight() / 2;
        int i7 = height - (L2 / 2);
        int i10 = L + width;
        Rect rect = this.d;
        rect.set(width, i7, i10, L2 + i7);
        rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        fh.g gVar = this.f;
        if (gVar != null) {
            gVar.setBounds(rect);
            this.f.draw(canvas);
        }
        if (I) {
            float L3 = org.telegram.messenger.g0.L(0.66f) + width;
            float f10 = height;
            float L4 = f10 - (org.telegram.messenger.g0.L(22.66f) / 2.0f);
            float L5 = org.telegram.messenger.g0.L(23.32f) + width;
            float L6 = (org.telegram.messenger.g0.L(22.66f) / 2.0f) + f10;
            RectF rectF = this.e;
            rectF.set(L3, L4, L5, L6);
            imageReceiver.A0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + r2, height, 1.0f, -1, canvas);
        int L7 = i10 - org.telegram.messenger.g0.L(17.0f);
        int L8 = height - org.telegram.messenger.g0.L(6.0f);
        int L9 = i10 - org.telegram.messenger.g0.L(5.0f);
        int L10 = org.telegram.messenger.g0.L(6.0f) + height;
        Drawable drawable = this.b;
        drawable.setBounds(L7, L8, L9, L10);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(fh.g gVar) {
        gVar.q(org.telegram.messenger.g0.L(4.0f));
        gVar.r(org.telegram.messenger.g0.L(11.0f));
        this.f = gVar;
    }

    public void setImage(Bitmap bitmap) {
        this.c.v0(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new fq(5, this, str));
        }
    }
}
