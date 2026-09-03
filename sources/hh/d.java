package hh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.v0;
import lf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
