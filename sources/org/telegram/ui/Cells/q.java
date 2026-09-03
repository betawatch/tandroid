package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class q extends ImageView {
    public Drawable a;
    public final Path b;
    public int c;
    public int d;

    public q(Context context) {
        super(context);
        this.b = new Path();
        this.c = AndroidUtilities.dp(5.0f);
        this.d = AndroidUtilities.dp(42.0f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        canvas.scale((this.d / getWidth()) + 1.0f, (this.d / getHeight()) + 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
        Drawable drawable = this.a;
        if (drawable != null) {
            int i10 = this.c;
            drawable.setBounds(-i10, -i10, getWidth() + this.c, getHeight() + this.c);
            this.a.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i10) {
        this.d = i10;
    }

    public void setForeground(int i10) {
        this.a = getContext().getDrawable(i10);
        invalidate();
    }

    public void setOuterPadding(int i10) {
        this.c = i10;
    }

    public void setPadding(int i10) {
        setPadding(i10, i10, i10, i10);
    }
}
