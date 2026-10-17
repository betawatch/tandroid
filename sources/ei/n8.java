package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class n8 extends u81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r9 c;

    public /* synthetic */ n8(r9 r9Var, Context context, int i10) {
        this.a = i10;
        this.c = r9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((k9) view).b(i11);
                break;
            default:
                ((k9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new k9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.c.M;
            default:
                return 5;
        }
    }
}
