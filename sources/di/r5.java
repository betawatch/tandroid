package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class r5 extends rg.k1 {
    public final Path g3;
    public final /* synthetic */ rb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(rb rbVar, Context context) {
        super(context);
        this.h3 = rbVar;
        this.g3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.h3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.D1));
        Path path = this.g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
