package ch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n extends r5 {
    public final Bitmap a;

    public n(o oVar) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), Bitmap.Config.ARGB_8888);
        this.a = createBitmap;
        Drawable mutate = oVar.getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override // org.telegram.ui.Components.r5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        canvas.save();
        canvas.translate(f10, ((i11 + i13) / 2.0f) - org.telegram.messenger.g0.L(12.0f));
        float f11 = this.extraScale;
        canvas.scale(f11, f11, f10 + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.r5, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(5.0f) + super.getSize(paint, charSequence, i7, i10, fontMetricsInt);
    }
}
