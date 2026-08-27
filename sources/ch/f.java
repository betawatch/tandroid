package ch;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.w0;
import gf.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f extends w0 {
    public final c0 a = new c0(2);
    public final /* synthetic */ c6 b;
    public final /* synthetic */ h c;

    public f(h hVar, c6 c6Var) {
        this.c = hVar;
        this.b = c6Var;
    }

    @Override // f2.w0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        h hVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) hVar.c0.getTranslationY()) + ((int) hVar.T.e));
        int v02 = g6.v0(g6.h5, this.b);
        c0 c0Var = this.a;
        c0Var.b(v02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        c0Var.draw(canvas);
        hVar.Q();
        hVar.R();
    }
}
