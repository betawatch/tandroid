package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q7 extends f61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ t8 c;

    public /* synthetic */ q7(t8 t8Var, Context context, int i3) {
        this.a = i3;
        this.c = t8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        switch (this.a) {
            case 0:
                ((o8) view).b(i10);
                break;
            default:
                ((o8) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        switch (this.a) {
        }
        return new o8(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        switch (this.a) {
            case 0:
                if (i3 == 0) {
                    return 0;
                }
                return this.c.E1;
            default:
                return 5;
        }
    }
}
