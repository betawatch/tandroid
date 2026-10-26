package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j8 extends m91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n9 c;

    public /* synthetic */ j8(n9 n9Var, Context context, int i10) {
        this.a = i10;
        this.c = n9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((g9) view).b(i11);
                break;
            default:
                ((g9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        switch (this.a) {
        }
        return new g9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.m91
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
