package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c91;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class y8 extends c91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ea c;

    public /* synthetic */ y8(ea eaVar, Context context, int i10) {
        this.a = i10;
        this.c = eaVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((x9) view).b(i11);
                break;
            default:
                ((x9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        switch (this.a) {
        }
        return new x9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.c91
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
