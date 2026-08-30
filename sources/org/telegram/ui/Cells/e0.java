package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e0 {
    public final Runnable a;
    public boolean b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public k01 h;
    public TL_keyboard.KeyboardInlineButton i;
    public BotInlineKeyboard.ButtonCustom j;
    public BotInlineKeyboard.Button k;
    public boolean l;
    public boolean m;
    public final Path n = new Path();
    public final Paint o = new Paint(1);
    public final RectF p = new RectF();
    public final float[] q = new float[8];
    public i90 r;
    public z s;
    public Drawable t;
    public org.telegram.ui.Components.l5 u;
    public boolean v;
    public float w;
    public ValueAnimator x;

    public e0(Runnable runnable) {
        this.a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.w = min;
                this.w = Utilities.clamp(min, 1.0f, 0.0f);
                this.a.run();
            }
        }
        return e2.c.w(1.0f, this.w, 0.04f, 0.96f);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator;
        if (this.v != z4) {
            this.v = z4;
            this.a.run();
            if (z4 && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (z4) {
                return;
            }
            float f10 = this.w;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new r(this, 1));
                this.x.addListener(new org.telegram.ui.s5(this, 5));
                this.x.setInterpolator(new OvershootInterpolator(2.0f));
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
