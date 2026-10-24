package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class d0 {
    public final Runnable a;
    public boolean b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public i11 h;
    public TL_keyboard.KeyboardInlineButton i;
    public BotInlineKeyboard.ButtonCustom j;
    public BotInlineKeyboard.Button k;
    public boolean l;
    public boolean m;
    public final Path n = new Path();
    public final Paint o = new Paint(1);
    public final RectF p = new RectF();
    public final float[] q = new float[8];
    public ca0 r;
    public y s;
    public Drawable t;
    public org.telegram.ui.Components.r5 u;
    public boolean v;
    public float w;
    public ValueAnimator x;

    public d0(Runnable runnable) {
        this.a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.w = min;
                this.w = Utilities.clamp(min, 1.0f, 0.0f);
                this.a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.a.run();
            if (z10 && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (z10) {
                return;
            }
            float f7 = this.w;
            if (f7 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new r(this, 1));
                this.x.addListener(new m.a(this, 11));
                sl.l(2.0f, this.x);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
