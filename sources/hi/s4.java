package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class s4 extends tg.z0 {
    public final Path o3;
    public final /* synthetic */ u9 p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(u9 u9Var, Context context) {
        super(context);
        this.p3 = u9Var;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(r0.n1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(r0.n1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(r0.n1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(r0.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
