package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d0 extends TableLayout {
    public final /* synthetic */ p6 a;
    public final /* synthetic */ e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Context context, p6 p6Var) {
        super(context);
        this.b = e0Var;
        this.a = p6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e0 e0Var = this.b;
        e0Var.w.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.s.rewind();
        e0Var.s.addRoundRect(e0Var.w, i0.L(6.0f), i0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.r.setColor(i0.b.f(0.1f, t6.w0(t6.d7, this.a), -1));
        e0Var.r.setStrokeWidth(i0.L(1.0f));
        float height = getHeight() / (e0Var.D.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i10 = 1; i10 <= 4; i10++) {
            float f7 = height * i10;
            canvas.drawLine(0.0f, f7, getWidth(), f7, e0Var.r);
        }
        float right = cd.X ? e0Var.e.getRight() : e0Var.e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), e0Var.r);
        e0Var.r.setStrokeWidth(i0.L(2.0f));
        canvas.drawPath(e0Var.s, e0Var.r);
    }
}
