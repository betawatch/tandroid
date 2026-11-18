package bi;

import android.view.View;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.ua;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g5 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g5(di.o8 o8Var, int i7, Runnable runnable) {
        this.c = o8Var;
        this.b = i7;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                di.o8 o8Var = (di.o8) this.c;
                Runnable runnable = (Runnable) this.d;
                o8Var.g(this.b, true);
                runnable.run();
                return true;
            default:
                ua uaVar = (ua) this.c;
                ta taVar = (ta) this.d;
                return uaVar.b(taVar.h, this.b);
        }
    }

    public /* synthetic */ g5(ua uaVar, ta taVar, int i7) {
        this.c = uaVar;
        this.d = taVar;
        this.b = i7;
    }
}
