// default package

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class k9c extends ColorDrawable {
    public final int a;
    public final vnb b;

    public k9c(int i, vnb vnbVar) {
        super(aob.v0(i, vnbVar));
        this.a = i;
        this.b = vnbVar;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int v0 = aob.v0(this.a, this.b);
        if (getColor() != v0) {
            setColor(v0);
        }
        super.draw(canvas);
    }
}
