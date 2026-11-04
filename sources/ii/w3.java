package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import gi.i8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.kt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class w3 extends View implements z5 {
    public final kt0 a;
    public final Paint b;
    public float c;
    public q1.g d;
    public final e6 e;

    public w3(Context context, e6 e6Var) {
        super(context);
        kt0 kt0Var = new kt0(new i8(27), new i8(28));
        kt0Var.c = 100.0f;
        this.a = kt0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = e6Var;
        paint.setColor(k6.w0(k6.Ci, e6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
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
        q1.g gVar = new q1.g(this, this.a);
        q1.h hVar = new q1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.m = hVar;
        this.d = gVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        q1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.m.i = f10 * 100.0f;
        gVar.h();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.b.setColor(k6.w0(k6.Ci, this.e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
