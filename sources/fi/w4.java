package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w4 extends tg.y0 {
    public final Path n3;
    public final /* synthetic */ x9 o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(x9 x9Var, Context context) {
        super(context);
        this.o3 = x9Var;
        this.n3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.o3.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(r0.m1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(r0.m1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(r0.m1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(r0.m1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
