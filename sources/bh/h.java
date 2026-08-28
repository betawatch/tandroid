package bh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.y0;
import ff.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends y0 {
    public final c0 a = new c0(2);
    public final /* synthetic */ b6 b;
    public final /* synthetic */ j c;

    public h(j jVar, b6 b6Var) {
        this.c = jVar;
        this.b = b6Var;
    }

    @Override // f2.y0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        j jVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) jVar.c0.getTranslationY()) + ((int) jVar.T.e));
        int v02 = f6.v0(f6.h5, this.b);
        c0 c0Var = this.a;
        c0Var.b(v02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        c0Var.draw(canvas);
        jVar.P();
        jVar.Q();
    }
}
