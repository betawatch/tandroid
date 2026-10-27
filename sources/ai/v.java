package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v extends View {
    public final t5 a;
    public final Drawable b;
    public float c;
    public boolean d;

    public v(x0 x0Var, Context context, int i10, TLRPC.Document document) {
        super(context);
        if (document != null) {
            this.a = t5.m(x0Var.a, 5, document);
            this.b = null;
        } else {
            this.a = null;
            Drawable mutate = context.getDrawable(i10 == 0 ? R.drawable.emoji_tabs_faves : R.drawable.msg_emoji_recent).mutate();
            this.b = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5 t5Var = this.a;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5 t5Var = this.a;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.d ? 1.0f : 0.0f;
        float f10 = this.c;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.c;
                f7 = c3.h0.z(f7, f11, 0.35f, f11);
            }
            this.c = f7;
            invalidate();
        }
        float interpolation = (1.0f - (ds.g.getInterpolation(this.c) * 0.15f)) * AndroidUtilities.dp(26.0f);
        float f12 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f12);
        int height = (int) ((getHeight() / 2.0f) - f12);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = this.b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            y.b(canvas, drawable);
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
