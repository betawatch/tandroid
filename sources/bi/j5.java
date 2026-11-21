package bi;

import android.view.View;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j5(di.p8 p8Var, int i7, Runnable runnable) {
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
                va vaVar = (va) this.c;
                ua uaVar = (ua) this.d;
                return vaVar.b(uaVar.h, this.b);
        }
    }

    public /* synthetic */ j5(va vaVar, ua uaVar, int i7) {
        this.c = vaVar;
        this.d = uaVar;
        this.b = i7;
    }
}
