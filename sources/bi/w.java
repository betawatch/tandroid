package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w extends n91 {
    public final x[] a = new x[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ pm0 c;
    public final /* synthetic */ y d;

    public w(y yVar, Context context, pm0 pm0Var) {
        this.d = yVar;
        this.b = context;
        this.c = pm0Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        x[] xVarArr = this.a;
        if (xVarArr[i10] == null) {
            xVarArr[i10] = new x(this.d, this.b, i10);
        }
        return xVarArr[i10];
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 1 ? R.string.StarsTransactionsIncoming : i10 == 2 ? R.string.StarsTransactionsOutgoing : R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return i10;
    }
}
