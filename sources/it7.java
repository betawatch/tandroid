// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class it7 extends as7 {
    public final Path o3;
    public final /* synthetic */ x6b p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it7(x6b x6bVar, Context context) {
        super(context);
        this.p3 = x6bVar;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = gl.P;
        rectF.set(gl.U1(r0.t1, barView.getLeft() - getLeft(), 0), gl.U1(r0.t1, barView.getTop() - getTop(), 0), gl.U1(r0.t1, barView.getRight() - getLeft(), getWidth()), gl.U1(r0.t1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gl.L(32.0f), gl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
