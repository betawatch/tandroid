package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class r5 extends qg.i1 {
    public final Path g3;
    public final /* synthetic */ qb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(qb qbVar, Context context) {
        super(context);
        this.h3 = qbVar;
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
