// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class keb extends TableLayout {
    public final /* synthetic */ wjb a;
    public final /* synthetic */ meb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public keb(meb mebVar, Context context, wjb wjbVar) {
        super(context);
        this.b = mebVar;
        this.a = wjbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        meb mebVar = this.b;
        RectF rectF = mebVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = mebVar.s;
        path.rewind();
        path.addRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = mebVar.r;
        paint.setColor(bm2.f(0.1f, bkb.v0(bkb.c7, this.a), -1));
        paint.setStrokeWidth(gl.L(1.0f));
        float height = getHeight() / (mebVar.E.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i = 1; i <= 4; i++) {
            float f = height * i;
            canvas.drawLine(0.0f, f, getWidth(), f, paint);
        }
        boolean z = k96.a0;
        TextView textView = mebVar.e;
        float right = z ? textView.getRight() : textView.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), paint);
        paint.setStrokeWidth(gl.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
