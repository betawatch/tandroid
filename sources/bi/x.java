package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.rj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x extends m61 {
    public final y[] a = new y[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ rj0 c;
    public final /* synthetic */ z d;

    public x(z zVar, Context context, rj0 rj0Var) {
        this.d = zVar;
        this.b = context;
        this.c = rj0Var;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        y[] yVarArr = this.a;
        if (yVarArr[i7] == null) {
            yVarArr[i7] = new y(this.d, this.b, i7);
        }
        return yVarArr[i7];
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence g(int i7) {
        return org.telegram.messenger.id.M0(i7 == 1 ? 2131744919 : i7 == 2 ? 2131744918 : 2131744920, null);
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return i7;
    }
}
