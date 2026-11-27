// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fib extends TableLayout {
    public final /* synthetic */ vnb a;
    public final /* synthetic */ hib b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fib(hib hibVar, Context context, vnb vnbVar) {
        super(context);
        this.b = hibVar;
        this.a = vnbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hib hibVar = this.b;
        RectF rectF = hibVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = hibVar.s;
        path.rewind();
        path.addRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = hibVar.r;
        paint.setColor(vm2.f(0.1f, aob.v0(aob.d7, this.a), -1));
        paint.setStrokeWidth(hl.L(1.0f));
        float height = getHeight() / (hibVar.E.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i = 1; i <= 4; i++) {
            float f = height * i;
            canvas.drawLine(0.0f, f, getWidth(), f, paint);
        }
        boolean z = ob6.a0;
        TextView textView = hibVar.e;
        float right = z ? textView.getRight() : textView.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), paint);
        paint.setStrokeWidth(hl.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
