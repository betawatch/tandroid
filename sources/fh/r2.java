package fh;

import android.view.View;
import gh.n7;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r2(n7 n7Var, int i9, Runnable runnable) {
        this.c = n7Var;
        this.b = i9;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                n7 n7Var = (n7) this.c;
                Runnable runnable = (Runnable) this.d;
                n7Var.f(this.b, true);
                runnable.run();
                return true;
            default:
                za zaVar = (za) this.c;
                ya yaVar = (ya) this.d;
                return zaVar.b(yaVar.h, this.b);
        }
    }

    public /* synthetic */ r2(za zaVar, ya yaVar, int i9) {
        this.c = zaVar;
        this.d = yaVar;
        this.b = i9;
    }
}
