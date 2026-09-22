package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.vv0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public class k4 extends View {
    public final vv0 a;
    public final Paint b;
    public float c;
    public o1.k d;

    public k4(Context context, f6 f6Var) {
        super(context);
        vv0 vv0Var = new vv0(new d2.c(19), new d2.c(20));
        vv0Var.c = 100.0f;
        this.a = vv0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(j6.v0(j6.Oh, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c > 0.0f) {
            float height = getHeight();
            Paint paint = this.b;
            float strokeWidth = height - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, strokeWidth, getWidth() * this.c, strokeWidth, paint);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.u = lVar;
        this.d = kVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.u.i = f7 * 100.0f;
        kVar.f();
    }
}
