package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class p7 extends y61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ q8 c;

    public /* synthetic */ p7(q8 q8Var, Context context, int i7) {
        this.a = i7;
        this.c = q8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((l8) view).b(i10);
                break;
            default:
                ((l8) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        switch (this.a) {
        }
        return new l8(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.y61
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
