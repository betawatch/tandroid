package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n8 extends g71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ q9 c;

    public /* synthetic */ n8(q9 q9Var, Context context, int i10) {
        this.a = i10;
        this.c = q9Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((k9) view).b(i11);
                break;
            default:
                ((k9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        switch (this.a) {
        }
        return new k9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.g71
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
