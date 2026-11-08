package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b0 extends RatingBar {
    public final z a;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        a3.a(this, getContext());
        z zVar = new z(this);
        this.a = zVar;
        zVar.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }
}
