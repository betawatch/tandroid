package ih;

import android.view.View;
import jh.k7;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j2(k7 k7Var, int i10, Runnable runnable) {
        this.c = k7Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                Runnable runnable = (Runnable) this.d;
                k7Var.f(this.b, true);
                runnable.run();
                return true;
            default:
                wa waVar = (wa) this.c;
                va vaVar = (va) this.d;
                return waVar.b(vaVar.h, this.b);
        }
    }

    public /* synthetic */ j2(wa waVar, va vaVar, int i10) {
        this.c = waVar;
        this.d = vaVar;
        this.b = i10;
    }
}
