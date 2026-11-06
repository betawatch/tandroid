package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final zg0 h;
    public final la i;
    public final /* synthetic */ la j;

    public q(la laVar, la laVar2) {
        this.j = laVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = laVar2;
        zg0 zg0Var = new zg0(R.raw.chat_audio_record_delete_3, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = zg0Var;
        zg0Var.o0 = true;
        paint.setColor(-2406842);
        zg0Var.Z = true;
        zg0Var.Q(-2406842, "Cup Red");
        zg0Var.Q(-2406842, "Box");
        zg0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9 = this.g;
        zg0 zg0Var = this.h;
        if (z9) {
            zg0Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i7 = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i7);
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
        zg0Var.setBounds(getBounds());
        if (this.g) {
            zg0Var.draw(canvas);
        }
        if (!this.g || !zg0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.g0.L(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.c = i7 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
