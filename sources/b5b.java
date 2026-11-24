// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class b5b extends oec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ y5b c;

    public /* synthetic */ b5b(y5b y5bVar, Context context, byte b) {
        this.a = b;
        this.c = y5bVar;
        this.b = context;
    }

    @Override // oec
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((t5b) view).b(i2);
                break;
            default:
                ((t5b) view).b(i2);
                break;
        }
    }

    @Override // oec
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        y5b y5bVar = this.c;
        switch (b) {
        }
        return new t5b(y5bVar, context);
    }

    @Override // oec
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // oec
    public final int h(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                return this.c.G1;
            default:
                return 5;
        }
    }
}
