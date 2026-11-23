package bi;

import android.view.View;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l5(di.p8 p8Var, int i7, Runnable runnable) {
        this.c = p8Var;
        this.b = i7;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                di.p8 p8Var = (di.p8) this.c;
                Runnable runnable = (Runnable) this.d;
                p8Var.g(this.b, true);
                runnable.run();
                return true;
            default:
                wa waVar = (wa) this.c;
                va vaVar = (va) this.d;
                return waVar.b(vaVar.h, this.b);
        }
    }

    public /* synthetic */ l5(wa waVar, va vaVar, int i7) {
        this.c = waVar;
        this.d = vaVar;
        this.b = i7;
    }
}
