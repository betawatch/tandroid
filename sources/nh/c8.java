package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c8 extends q71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e9 c;

    public /* synthetic */ c8(e9 e9Var, Context context, int i10) {
        this.a = i10;
        this.c = e9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((y8) view).b(i11);
                break;
            default:
                ((y8) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        switch (this.a) {
        }
        return new y8(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.c.I;
            default:
                return 5;
        }
    }
}
