package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class n8 extends d91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r9 c;

    public /* synthetic */ n8(r9 r9Var, Context context, int i10) {
        this.a = i10;
        this.c = r9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d91
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

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        switch (this.a) {
        }
        return new k9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.d91
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
