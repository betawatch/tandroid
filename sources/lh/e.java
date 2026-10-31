package lh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import rf.w;
import s4.m0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends m0 {
    public final w a = new w(2);
    public final /* synthetic */ p6 b;
    public final /* synthetic */ g c;

    public e(g gVar, p6 p6Var) {
        this.c = gVar;
        this.b = p6Var;
    }

    @Override // s4.m0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.c;
        int max = Math.max(0, i0.L(80.0f) + ((int) gVar.Y1.getTranslationY()) + ((int) gVar.P1.f));
        int w02 = t6.w0(t6.h5, this.b);
        w wVar = this.a;
        wVar.b(w02);
        wVar.setBounds(0, max, recyclerView.getWidth(), i0.L(8.0f) + max);
        wVar.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
