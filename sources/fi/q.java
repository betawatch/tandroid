package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final yj0 h;
    public final ib i;
    public final /* synthetic */ ib j;

    public q(ib ibVar, ib ibVar2) {
        this.j = ibVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = ibVar2;
        yj0 yj0Var = new yj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = yj0Var;
        yj0Var.o0 = true;
        paint.setColor(-2406842);
        yj0Var.Z = true;
        yj0Var.Q(-2406842, "Cup Red");
        yj0Var.Q(-2406842, "Box");
        yj0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        yj0 yj0Var = this.h;
        if (z10) {
            yj0Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        yj0Var.setBounds(getBounds());
        if (this.g) {
            yj0Var.draw(canvas);
        }
        if (!this.g || !yj0Var.u()) {
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
