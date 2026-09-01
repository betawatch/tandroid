package lh;

import android.view.View;
import mh.l7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i2(l7 l7Var, int i10, Runnable runnable) {
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

    public /* synthetic */ i2(za zaVar, ya yaVar, int i10) {
        this.c = zaVar;
        this.d = yaVar;
        this.b = i10;
    }
}
