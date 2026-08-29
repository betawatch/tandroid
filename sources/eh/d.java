package eh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.v0;
import jf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d extends v0 {
    public final b0 a = new b0(2);
    public final /* synthetic */ c6 b;
    public final /* synthetic */ f c;

    public d(f fVar, c6 c6Var) {
        this.c = fVar;
        this.b = c6Var;
    }

    @Override // f2.v0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.c0.getTranslationY()) + ((int) fVar.T.e));
        int v02 = g6.v0(g6.h5, this.b);
        b0 b0Var = this.a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
