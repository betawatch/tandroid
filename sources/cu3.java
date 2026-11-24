// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class cu3 extends View {
    public final uib a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public im0 f;

    public cu3(Context context, String str) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gm.L(22.66f));
        this.a = new uib(str, 14.0f, gm.o());
        Drawable d = b10.d(context, R.drawable.arrow_newchat);
        this.b = d;
        d.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.L(48.0f), false, null, true);
        TLRPC.PhotoSize w2 = bc4.w(photo.sizes, gm.L(24.0f), false, w, false);
        this.c.Z(gn5.i(w, photo), "24_24", gn5.i(w2, photo), "24_24", null, 0L, null, obj, 0);
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
        this.c.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.c;
        boolean B = imageReceiver.B();
        int L = gm.L(19.0f) + ((int) Math.ceil(this.a.c)) + gm.L(B ? 30.33f : 11.33f);
        int L2 = gm.L(24.0f);
        int width = (getWidth() - L) / 2;
        int height = getHeight() / 2;
        int i = height - (L2 / 2);
        int i2 = L + width;
        Rect rect = this.d;
        rect.set(width, i, i2, L2 + i);
        rect.inset(-gm.L(4.0f), -gm.L(4.0f));
        im0 im0Var = this.f;
        if (im0Var != null) {
            im0Var.setBounds(rect);
            this.f.draw(canvas);
        }
        if (B) {
            float L3 = gm.L(0.66f) + width;
            float f = height;
            float L4 = f - (gm.L(22.66f) / 2.0f);
            float L5 = gm.L(23.32f) + width;
            float L6 = (gm.L(22.66f) / 2.0f) + f;
            RectF rectF = this.e;
            rectF.set(L3, L4, L5, L6);
            imageReceiver.k0(rectF);
            imageReceiver.h(canvas, null);
        }
        this.a.c(width + r2, height, 1.0f, -1, canvas);
        int L7 = i2 - gm.L(17.0f);
        int L8 = height - gm.L(6.0f);
        int L9 = i2 - gm.L(5.0f);
        int L10 = gm.L(6.0f) + height;
        Drawable drawable = this.b;
        drawable.setBounds(L7, L8, L9, L10);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(im0 im0Var) {
        im0Var.q(gm.L(4.0f));
        im0Var.r(gm.L(11.0f));
        this.f = im0Var;
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.e.c(new rd3(this, str, (byte) 26));
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.f0(bitmap);
        invalidate();
    }
}
