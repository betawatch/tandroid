package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class r extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final mh0 h;
    public final ja i;
    public final /* synthetic */ ja j;

    public r(ja jaVar, ja jaVar2) {
        this.j = jaVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = jaVar2;
        mh0 mh0Var = new mh0(R.raw.chat_audio_record_delete_3, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.h = mh0Var;
        mh0Var.p0 = true;
        paint.setColor(-2406842);
        mh0Var.a0 = true;
        mh0Var.Q(-2406842, "Cup Red");
        mh0Var.Q(-2406842, "Box");
        mh0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        mh0 mh0Var = this.h;
        if (z10) {
            mh0Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        mh0Var.setBounds(getBounds());
        if (this.g) {
            mh0Var.draw(canvas);
        }
        if (!this.g || !mh0Var.u()) {
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
