package kh;

import android.view.View;
import lh.l7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j2(l7 l7Var, int i10, Runnable runnable) {
        this.c = l7Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                Runnable runnable = (Runnable) this.d;
                l7Var.f(this.b, true);
                runnable.run();
                return true;
            default:
                za zaVar = (za) this.c;
                ya yaVar = (ya) this.d;
                return zaVar.b(yaVar.h, this.b);
        }
    }

    public /* synthetic */ j2(za zaVar, ya yaVar, int i10) {
        this.c = zaVar;
        this.d = yaVar;
        this.b = i10;
    }
}
