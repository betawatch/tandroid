package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ea extends n81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rb c;

    public /* synthetic */ ea(rb rbVar, Context context, int i10) {
        this.a = i10;
        this.c = rbVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((kb) view).b(i11);
                break;
            default:
                ((kb) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new kb(this.c, this.b);
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
