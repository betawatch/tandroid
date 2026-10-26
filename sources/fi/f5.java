package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f5 extends sg.k1 {
    public final Path o3;
    public final /* synthetic */ ta p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(ta taVar, Context context) {
        super(context);
        this.p3 = taVar;
        this.o3 = new Path();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        barView = this.p3.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, r0.s1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, r0.s1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), r0.s1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), r0.s1));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
