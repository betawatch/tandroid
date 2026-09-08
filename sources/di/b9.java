package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b9 extends a81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ia c;

    public /* synthetic */ b9(ia iaVar, Context context, int i10) {
        this.a = i10;
        this.c = iaVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((ba) view).b(i11);
                break;
            default:
                ((ba) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new ba(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.a81
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
