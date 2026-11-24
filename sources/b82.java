// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b82 extends gm {
    public final Bitmap a;

    public b82(c82 c82Var) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(gl.L(24.0f), gl.L(24.0f), Bitmap.Config.ARGB_8888);
        this.a = createBitmap;
        Drawable mutate = c82Var.getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, gl.L(24.0f), gl.L(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override // gm, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.save();
        canvas.translate(f, ((i3 + i5) / 2.0f) - gl.L(12.0f));
        float f2 = this.extraScale;
        canvas.scale(f2, f2, f + gl.L(12.0f), gl.L(12.0f));
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // gm, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return gl.L(5.0f) + super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
