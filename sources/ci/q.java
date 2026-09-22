package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final xi0 h;
    public final ec i;
    public final /* synthetic */ ec j;

    public q(ec ecVar, ec ecVar2) {
        this.j = ecVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = ecVar2;
        xi0 xi0Var = new xi0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = xi0Var;
        xi0Var.o0 = true;
        paint.setColor(-2406842);
        xi0Var.Z = true;
        xi0Var.Q(-2406842, "Cup Red");
        xi0Var.Q(-2406842, "Box");
        xi0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        xi0 xi0Var = this.h;
        if (z10) {
            xi0Var.setAlpha((int) (this.b * 255.0f * this.c));
        }
        int i10 = (int) (this.b * 255.0f * this.c);
        Paint paint = this.a;
        paint.setAlpha(i10);
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (this.e || this.g) {
            float f7 = (currentTimeMillis / 600.0f) + this.b;
            this.b = f7;
            if (f7 >= 1.0f) {
                this.b = 1.0f;
                this.e = false;
            }
        } else {
            float f10 = this.b - (currentTimeMillis / 600.0f);
            this.b = f10;
            if (f10 <= 0.0f) {
                this.b = 0.0f;
                this.e = true;
            }
        }
        this.d = System.currentTimeMillis();
        xi0Var.setBounds(getBounds());
        if (this.g) {
            xi0Var.draw(canvas);
        }
        if (!this.g || !xi0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.j.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c = i10 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
