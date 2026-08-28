package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final mi0 h;
    public final mb i;
    public final /* synthetic */ mb j;

    public r(mb mbVar, mb mbVar2) {
        this.j = mbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = mbVar2;
        int i9 = R.raw.chat_audio_record_delete_3;
        mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = mi0Var;
        mi0Var.l0 = true;
        paint.setColor(-2406842);
        mi0Var.W = true;
        mi0Var.O(-2406842, "Cup Red");
        mi0Var.O(-2406842, "Box");
        mi0Var.m();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        mi0 mi0Var = this.h;
        if (z10) {
            mi0Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i9 = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i9);
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.e || this.g) {
            float f10 = (currentTimeMillis / 600.0f) + this.b;
            this.b = f10;
            if (f10 >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        } else {
            float f11 = this.b - (currentTimeMillis / 600.0f);
            this.b = f11;
            if (f11 <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        }
        this.d = System.currentTimeMillis();
        mi0Var.setBounds(getBounds());
        if (this.g) {
            mi0Var.draw(canvas);
        }
        if (!this.g || !mi0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.c = i9 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
