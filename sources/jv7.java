// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jv7 extends bu7 {
    public final Path o3;
    public final /* synthetic */ z8b p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv7(z8b z8bVar, Context context) {
        super(context);
        this.p3 = z8bVar;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = gm.P;
        rectF.set(gm.U1(r0.t1, barView.getLeft() - getLeft(), 0), gm.U1(r0.t1, barView.getTop() - getTop(), 0), gm.U1(r0.t1, barView.getRight() - getLeft(), getWidth()), gm.U1(r0.t1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gm.L(32.0f), gm.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
