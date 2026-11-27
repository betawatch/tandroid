// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class drc extends wm2 {
    public final /* synthetic */ frc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drc(frc frcVar) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = frcVar;
    }

    @Override // wm2, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        frc frcVar = this.M;
        FrameLayout.LayoutParams layoutParams = frcVar.Q;
        if (frcVar.j0) {
            return;
        }
        this.x = 1.0f;
        if (frcVar.a) {
            float max = Math.max(0.0f, Math.min(1.0f, frcVar.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * frcVar.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f2 = frcVar.b;
                float f3 = intrinsicHeight * f2;
                float f4 = (f2 * f) + layoutParams.leftMargin;
                float height = ((frcVar.O.getHeight() / 2.0f) - (f3 / 2.0f)) + layoutParams.topMargin;
                frcVar.f.set(f4, height, intrinsicWidth + f4, f3 + height);
            }
            if (max < 1.0f) {
                if (frcVar.i0 == null) {
                    frcVar.i0 = new orc(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    frcVar.m();
                }
                Drawable drawable = this.c;
                frcVar.i0.setBounds(drawable.getBounds());
                orc orcVar = frcVar.i0;
                orcVar.i = frcVar.g0.c;
                this.c = orcVar;
                this.d = false;
                this.x = 1.0f - max;
                super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                this.c = drawable;
                this.d = true;
            }
            this.x = max;
            if (max == 0.0f) {
                return;
            }
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
