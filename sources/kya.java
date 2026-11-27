// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kya implements vka {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l15 b;

    public /* synthetic */ kya(l15 l15Var, byte b) {
        this.a = b;
        this.b = l15Var;
    }

    @Override // vka
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        l15 l15Var = this.b;
        switch (b) {
            case 0:
                d79 d79Var = (d79) recyclerView;
                uk0.a(d79Var, canvas, rectF, d79Var, l15Var);
                break;
            default:
                d79 d79Var2 = (d79) recyclerView;
                uk0.a(d79Var2, canvas, rectF, d79Var2, l15Var);
                break;
        }
    }
}
