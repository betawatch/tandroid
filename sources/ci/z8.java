package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class z8 extends n81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fa c;

    public /* synthetic */ z8(fa faVar, Context context, int i10) {
        this.a = i10;
        this.c = faVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((y9) view).b(i11);
                break;
            default:
                ((y9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new y9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.n81
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
