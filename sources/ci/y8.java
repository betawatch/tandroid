package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x81;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class y8 extends x81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ea c;

    public /* synthetic */ y8(ea eaVar, Context context, int i10) {
        this.a = i10;
        this.c = eaVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.x81
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

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new x9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.x81
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
