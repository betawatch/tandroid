package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d0 {
    public final Runnable a;
    public boolean b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public xy0 h;
    public TL_keyboard.KeyboardInlineButton i;
    public org.telegram.messenger.p2 j;
    public org.telegram.messenger.n2 k;
    public boolean l;
    public boolean m;
    public final Path n = new Path();
    public final Paint o = new Paint(1);
    public final RectF p = new RectF();
    public final float[] q = new float[8];
    public q80 r;
    public y s;
    public Drawable t;
    public org.telegram.ui.Components.p5 u;
    public boolean v;
    public float w;
    public ValueAnimator x;

    public d0(Runnable runnable) {
        this.a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.r) / 100.0f) + f10;
                this.w = min;
                this.w = Utilities.i(min, 1.0f, 0.0f);
                this.a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.w, 0.04f, 0.96f);
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
            float f10 = this.w;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new r(this, 1));
                this.x.addListener(new ki.m3(this, 23));
                c0.q(2.0f, this.x);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
