package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.om0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w extends m91 {
    public final x[] a = new x[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ om0 c;
    public final /* synthetic */ y d;

    public w(y yVar, Context context, om0 om0Var) {
        this.d = yVar;
        this.b = context;
        this.c = om0Var;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        x[] xVarArr = this.a;
        if (xVarArr[i10] == null) {
            xVarArr[i10] = new x(this.d, this.b, i10);
        }
        return xVarArr[i10];
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 1 ? R.string.StarsTransactionsIncoming : i10 == 2 ? R.string.StarsTransactionsOutgoing : R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        return i10;
    }
}
