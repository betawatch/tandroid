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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e0 {
    public final Runnable a;
    public boolean b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public zz0 h;
    public TL_keyboard.KeyboardInlineButton i;
    public BotInlineKeyboard.ButtonCustom j;
    public BotInlineKeyboard.Button k;
    public boolean l;
    public boolean m;
    public final Path n = new Path();
    public final Paint o = new Paint(1);
    public final RectF p = new RectF();
    public final float[] q = new float[8];
    public c90 r;
    public z s;
    public Drawable t;
    public org.telegram.ui.Components.p5 u;
    public boolean v;
    public float w;
    public ValueAnimator x;

    public e0(Runnable runnable) {
        this.a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f9 = this.w;
            if (f9 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f9;
                this.w = min;
                this.w = Utilities.clamp(min, 1.0f, 0.0f);
                this.a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.w, 0.04f, 0.96f);
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
            float f9 = this.w;
            if (f9 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new r(this, 1));
                this.x.addListener(new nh.q5(this, 14));
                this.x.setInterpolator(new OvershootInterpolator(2.0f));
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
