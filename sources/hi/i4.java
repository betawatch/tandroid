package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class i4 extends View implements p6 {
    public final qw0 a;
    public final Paint b;
    public float c;
    public o1.j d;
    public final u6 e;

    public i4(Context context, u6 u6Var) {
        super(context);
        qw0 qw0Var = new qw0(new gh.a(14), new gh.a(15));
        qw0Var.c = 100.0f;
        this.a = qw0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = u6Var;
        paint.setColor(y6.w0(y6.Oh, u6Var));
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
        o1.j jVar = new o1.j(this, this.a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.u = kVar;
        this.d = jVar;
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
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.u.i = f7 * 100.0f;
        jVar.h();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.b.setColor(y6.w0(y6.Oh, this.e));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
