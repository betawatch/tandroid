package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a1 extends h2 {
    public final Path c3;
    public final /* synthetic */ ws0 d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ws0 ws0Var, Context context) {
        super(context);
        this.d3 = ws0Var;
        this.c3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.d3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.J1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.J1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.J1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.J1));
        Path path = this.c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
