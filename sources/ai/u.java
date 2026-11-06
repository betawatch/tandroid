package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u extends View {
    public final i5 a;
    public final Drawable b;
    public float c;
    public boolean d;

    public u(q0 q0Var, Context context, int i7, TLRPC.Document document) {
        super(context);
        if (document != null) {
            this.a = i5.l(q0Var.a, 5, document);
            this.b = null;
        } else {
            this.a = null;
            Drawable mutate = context.getDrawable(i7 == 0 ? R.drawable.emoji_tabs_faves : R.drawable.msg_emoji_recent).mutate();
            this.b = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i5 i5Var = this.a;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i5 i5Var = this.a;
        if (i5Var != null) {
            i5Var.n(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = this.d ? 1.0f : 0.0f;
        float f11 = this.c;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.c;
                f10 = com.google.android.recaptcha.internal.a.z(f10, f12, 0.35f, f12);
            }
            this.c = f10;
            invalidate();
        }
        float interpolation = (1.0f - (xq.g.getInterpolation(this.c) * 0.15f)) * org.telegram.messenger.g0.L(26.0f);
        float f13 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f13);
        int height = (int) ((getHeight() / 2.0f) - f13);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = this.b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            x.b(canvas, drawable);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = true;
            invalidate();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
