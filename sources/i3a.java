// default package

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i3a extends e69 {
    public final PointF a = new PointF();
    public final /* synthetic */ j3a b;

    public i3a(j3a j3aVar) {
        this.b = j3aVar;
    }

    @Override // e69
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        xd9 xd9Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        j3a j3aVar = this.b;
        e3a e3aVar = j3aVar.o2;
        d3a d3aVar = j3aVar.c2;
        r59 r59Var = j3aVar.n1;
        PointF pointF = this.a;
        float f2 = 0.0f;
        if (zgc.b(d3aVar, r59Var, pointF)) {
            float f3 = pointF.x;
            height = Math.min(height, pointF.y);
            f2 = Math.max(0.0f, pointF.y + d3aVar.getMeasuredHeight());
            f = f3;
            width = d3aVar.getMeasuredWidth() + f3;
        } else {
            f = 0.0f;
        }
        if (zgc.b(e3aVar, r59Var, pointF)) {
            height = Math.min(height, pointF.y);
            f2 = Math.max(f2, pointF.y + e3aVar.getMeasuredHeight() + gm.L(12.0f));
        }
        if (height >= f2 || (xd9Var = d3aVar.M) == null) {
            return;
        }
        float height2 = (f2 - height) / xd9Var.getHeight();
        canvas.save();
        canvas.clipRect(f, height, width, f2);
        canvas.translate(f, height);
        canvas.scale(height2, height2);
        d3aVar.M.draw(canvas);
        canvas.restore();
    }
}
