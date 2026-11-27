// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd implements nr7, vka {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ kd(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        i2d i2dVar = l2dVar.a;
        if (i >= 30) {
            mq5 f = i2dVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(i2dVar.i().a, i2dVar.i().b, i2dVar.i().c, i2dVar.i().d);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom + hl.n;
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(i2, i3, i4, i5);
        frameLayout.requestLayout();
        return l2dVar;
    }

    @Override // vka
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                d79 d79Var = (d79) recyclerView;
                uk0.a(d79Var, canvas, rectF, d79Var, frameLayout);
                break;
            default:
                d79 d79Var2 = (d79) recyclerView;
                uk0.a(d79Var2, canvas, rectF, d79Var2, frameLayout);
                break;
        }
    }
}
