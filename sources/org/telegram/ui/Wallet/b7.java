package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;

    public /* synthetic */ b7(di.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = callback;
        this.d = e3Var;
        this.e = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                di.d dVar = this.b;
                dVar.setLoading(true);
                this.c.run(new o3(dVar, this.d, this.e, 1));
                break;
            default:
                di.d dVar2 = this.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.c.run(new o3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
