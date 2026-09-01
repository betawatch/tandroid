package hh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.v0;
import lf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d extends v0 {
    public final b0 a = new b0(2);
    public final /* synthetic */ g6 b;
    public final /* synthetic */ f c;

    public d(f fVar, g6 g6Var) {
        this.c = fVar;
        this.b = g6Var;
    }

    @Override // f2.v0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.d0.getTranslationY()) + ((int) fVar.U.e));
        int v02 = k6.v0(k6.h5, this.b);
        b0 b0Var = this.a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
