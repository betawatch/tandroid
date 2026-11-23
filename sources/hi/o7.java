package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class o7 extends b71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ p8 c;

    public /* synthetic */ o7(p8 p8Var, Context context, int i7) {
        this.a = i7;
        this.c = p8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((k8) view).b(i10);
                break;
            default:
                ((k8) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        switch (this.a) {
        }
        return new k8(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.c.H1;
            default:
                return 5;
        }
    }
}
