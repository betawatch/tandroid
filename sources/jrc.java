// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jrc extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(gl.L(25.0f), gl.L(31.0f), gl.L(18.0f), wallpapersListActivity.s);
        if (this.a == bkb.w0(null, bkb.c6, false)) {
            canvas.drawCircle(gl.L(25.0f), gl.L(31.0f), gl.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(50.0f), gl.L(62.0f));
    }
}
