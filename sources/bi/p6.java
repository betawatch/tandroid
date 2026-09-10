package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p6 extends pg.i1 {
    public final Path g3;
    public final /* synthetic */ ad h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(ad adVar, Context context) {
        super(context);
        this.h3 = adVar;
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
