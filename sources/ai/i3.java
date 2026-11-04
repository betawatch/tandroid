package ai;

import android.view.View;
import ci.v8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i3(v8 v8Var, int i3, Runnable runnable) {
        this.c = v8Var;
        this.b = i3;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                v8 v8Var = (v8) this.c;
                Runnable runnable = (Runnable) this.d;
                v8Var.g(this.b, true);
                runnable.run();
                return true;
            default:
                ta taVar = (ta) this.c;
                sa saVar = (sa) this.d;
                return taVar.b(saVar.h, this.b);
        }
    }

    public /* synthetic */ i3(ta taVar, sa saVar, int i3) {
        this.c = taVar;
        this.d = saVar;
        this.b = i3;
    }
}
