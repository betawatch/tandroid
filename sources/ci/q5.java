package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class q5 extends qg.j1 {
    public final Path g3;
    public final /* synthetic */ nb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(nb nbVar, Context context) {
        super(context);
        this.h3 = nbVar;
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
