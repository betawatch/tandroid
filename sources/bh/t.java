package bh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class t extends c6 {
    public final Bitmap a;

    public t(u uVar) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Bitmap.Config.ARGB_8888);
        this.a = createBitmap;
        Drawable mutate = uVar.getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override // org.telegram.ui.Components.c6, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        canvas.save();
        canvas.translate(f7, ((i12 + i14) / 2.0f) - AndroidUtilities.dp(12.0f));
        float f10 = this.extraScale;
        canvas.scale(f10, f10, f7 + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.c6, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(5.0f) + super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
