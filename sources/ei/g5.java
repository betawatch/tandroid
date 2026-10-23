package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class g5 extends rg.j1 {
    public final Path h3;
    public final /* synthetic */ xa i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(xa xaVar, Context context) {
        super(context);
        this.i3 = xaVar;
        this.h3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.i3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.D1));
        Path path = this.h3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
