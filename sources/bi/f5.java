package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f5(di.o8 o8Var, int i7, Runnable runnable) {
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
                va vaVar = (va) this.c;
                ua uaVar = (ua) this.d;
                return vaVar.b(uaVar.h, this.b);
        }
    }

    public /* synthetic */ f5(va vaVar, ua uaVar, int i7) {
        this.c = vaVar;
        this.d = uaVar;
        this.b = i7;
    }
}
