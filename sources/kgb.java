// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kgb extends TableLayout {
    public final /* synthetic */ ylb a;
    public final /* synthetic */ mgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgb(mgb mgbVar, Context context, ylb ylbVar) {
        super(context);
        this.b = mgbVar;
        this.a = ylbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mgb mgbVar = this.b;
        RectF rectF = mgbVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = mgbVar.s;
        path.rewind();
        path.addRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = mgbVar.r;
        paint.setColor(on2.f(0.1f, cmb.v0(cmb.c7, this.a), -1));
        paint.setStrokeWidth(gm.L(1.0f));
        float height = getHeight() / (mgbVar.E.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i = 1; i <= 4; i++) {
            float f = height * i;
            canvas.drawLine(0.0f, f, getWidth(), f, paint);
        }
        boolean z = jb6.a0;
        TextView textView = mgbVar.e;
        float right = z ? textView.getRight() : textView.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), paint);
        paint.setStrokeWidth(gm.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
