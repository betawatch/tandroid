// default package

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g1a extends c49 {
    public final PointF a = new PointF();
    public final /* synthetic */ h1a b;

    public g1a(h1a h1aVar) {
        this.b = h1aVar;
    }

    @Override // c49
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f;
        si9 si9Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        h1a h1aVar = this.b;
        c1a c1aVar = h1aVar.o2;
        b1a b1aVar = h1aVar.c2;
        o39 o39Var = h1aVar.n1;
        PointF pointF = this.a;
        float f2 = 0.0f;
        if (zec.b(b1aVar, o39Var, pointF)) {
            float f3 = pointF.x;
            height = Math.min(height, pointF.y);
            f2 = Math.max(0.0f, pointF.y + b1aVar.getMeasuredHeight());
            f = f3;
            width = b1aVar.getMeasuredWidth() + f3;
        } else {
            f = 0.0f;
        }
        if (zec.b(c1aVar, o39Var, pointF)) {
            height = Math.min(height, pointF.y);
            f2 = Math.max(f2, pointF.y + c1aVar.getMeasuredHeight() + gl.L(12.0f));
        }
        if (height >= f2 || (si9Var = b1aVar.M) == null) {
            return;
        }
        float height2 = (f2 - height) / si9Var.getHeight();
        canvas.save();
        canvas.clipRect(f, height, width, f2);
        canvas.translate(f, height);
        canvas.scale(height2, height2);
        b1aVar.M.draw(canvas);
        canvas.restore();
    }
}
