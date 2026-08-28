package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p8 extends e71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ t9 c;

    public /* synthetic */ p8(t9 t9Var, Context context, int i9) {
        this.a = i9;
        this.c = t9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        switch (this.a) {
            case 0:
                ((n9) view).b(i10);
                break;
            default:
                ((n9) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        switch (this.a) {
        }
        return new n9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    return 0;
                }
                return this.c.I;
            default:
                return 5;
        }
    }
}
