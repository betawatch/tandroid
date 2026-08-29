package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x4 extends bg.h2 {
    public final Path c3;
    public final /* synthetic */ ja d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(ja jaVar, Context context) {
        super(context);
        this.d3 = jaVar;
        this.c3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.d3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.z1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.z1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.z1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.z1));
        Path path = this.c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
