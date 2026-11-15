package bi;

import android.view.View;
import di.l8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y2(l8 l8Var, int i7, Runnable runnable) {
        this.c = l8Var;
        this.b = i7;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                l8 l8Var = (l8) this.c;
                Runnable runnable = (Runnable) this.d;
                l8Var.g(this.b, true);
                runnable.run();
                return true;
            default:
                ta taVar = (ta) this.c;
                sa saVar = (sa) this.d;
                return taVar.b(saVar.h, this.b);
        }
    }

    public /* synthetic */ y2(ta taVar, sa saVar, int i7) {
        this.c = taVar;
        this.d = saVar;
        this.b = i7;
    }
}
