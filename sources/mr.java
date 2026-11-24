// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class mr extends ImageView {
    public Drawable a;
    public final Path b;
    public int c;
    public int d;

    public mr(Context context) {
        super(context);
        this.b = new Path();
        this.c = gl.L(5.0f);
        this.d = gl.L(42.0f);
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
            int i = this.c;
            drawable.setBounds(-i, -i, getWidth() + this.c, getHeight() + this.c);
            this.a.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.b;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f, Path.Direction.CW);
    }

    public void setBackgroundOuterPadding(int i) {
        this.d = i;
    }

    public void setForeground(int i) {
        this.a = getContext().getDrawable(i);
        invalidate();
    }

    public void setOuterPadding(int i) {
        this.c = i;
    }

    public void setPadding(int i) {
        setPadding(i, i, i, i);
    }
}
