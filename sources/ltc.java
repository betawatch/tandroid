// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ltc extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(gm.L(25.0f), gm.L(31.0f), gm.L(18.0f), wallpapersListActivity.s);
        if (this.a == cmb.w0(null, cmb.c6, false)) {
            canvas.drawCircle(gm.L(25.0f), gm.L(31.0f), gm.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(50.0f), gm.L(62.0f));
    }
}
