package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a0 extends RatingBar {
    public final y a;

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        z2.a(this, getContext());
        y yVar = new y(this);
        this.a = yVar;
        yVar.b(attributeSet, R.attr.ratingBarStyle);
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
