package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j8 extends c71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ k9 c;

    public /* synthetic */ j8(k9 k9Var, Context context, int i7) {
        this.a = i7;
        this.c = k9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((f9) view).b(i10);
                break;
            default:
                ((f9) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        switch (this.a) {
        }
        return new f9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.c71
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
