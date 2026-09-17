package lg;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final f6 s;

    public h(kg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = f6Var;
        this.c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // lg.f
    public final void a() {
        super.a();
        this.r = i0.a.d(0.3f, j6.v0(j6.d6, this.s), this.m);
    }
}
