package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x0 extends c2 {
    public final Path d3;
    public final /* synthetic */ mt0 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mt0 mt0Var, Context context) {
        super(context);
        this.e3 = mt0Var;
        this.d3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.e3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.K1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.K1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.K1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.K1));
        Path path = this.d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
