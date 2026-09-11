package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
