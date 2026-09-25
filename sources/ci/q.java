package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q extends Drawable {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ij0 h;
    public final bc i;
    public final /* synthetic */ bc j;

    public q(bc bcVar, bc bcVar2) {
        this.j = bcVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 1.0f;
        this.i = bcVar2;
        ij0 ij0Var = new ij0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = ij0Var;
        ij0Var.o0 = true;
        paint.setColor(-2406842);
        ij0Var.Z = true;
        ij0Var.Q(-2406842, "Cup Red");
        ij0Var.Q(-2406842, "Box");
        ij0Var.o();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.g;
        ij0 ij0Var = this.h;
        if (z10) {
            ij0Var.setAlpha((int) (this.b * 255.0f * this.c));
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
        ij0Var.setBounds(getBounds());
        if (this.g) {
            ij0Var.draw(canvas);
        }
        if (!this.g || !ij0Var.u()) {
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
