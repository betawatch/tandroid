package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x extends n61 {
    public final y[] a = new y[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ sj0 c;
    public final /* synthetic */ z d;

    public x(z zVar, Context context, sj0 sj0Var) {
        this.d = zVar;
        this.b = context;
        this.c = sj0Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        y[] yVarArr = this.a;
        if (yVarArr[i7] == null) {
            yVarArr[i7] = new y(this.d, this.b, i7);
        }
        return yVarArr[i7];
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        return org.telegram.messenger.id.M0(i7 == 1 ? 2131744919 : i7 == 2 ? 2131744918 : 2131744920, null);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7;
    }
}
