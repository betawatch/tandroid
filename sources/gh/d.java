package gh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.u0;
import kf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d extends u0 {
    public final b0 a = new b0(2);
    public final /* synthetic */ f6 b;
    public final /* synthetic */ f c;

    public d(f fVar, f6 f6Var) {
        this.c = fVar;
        this.b = f6Var;
    }

    @Override // f2.u0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.d0.getTranslationY()) + ((int) fVar.U.e));
        int v02 = j6.v0(j6.h5, this.b);
        b0 b0Var = this.a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
