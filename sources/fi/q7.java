package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q7 extends h61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s8 c;

    public /* synthetic */ q7(s8 s8Var, Context context, int i7) {
        this.a = i7;
        this.c = s8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.h61
    public final void b(View view, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((n8) view).b(i10);
                break;
            default:
                ((n8) view).b(i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final View d(int i7) {
        switch (this.a) {
        }
        return new n8(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.h61
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                return this.c.D1;
            default:
                return 5;
        }
    }
}
