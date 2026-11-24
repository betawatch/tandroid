// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kwa implements eja {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g15 b;

    public /* synthetic */ kwa(g15 g15Var, byte b) {
        this.a = b;
        this.b = g15Var;
    }

    @Override // eja
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        g15 g15Var = this.b;
        switch (b) {
            case 0:
                r59 r59Var = (r59) recyclerView;
                tl0.a(r59Var, canvas, rectF, r59Var, g15Var);
                break;
            default:
                r59 r59Var2 = (r59) recyclerView;
                tl0.a(r59Var2, canvas, rectF, r59Var2, g15Var);
                break;
        }
    }
}
