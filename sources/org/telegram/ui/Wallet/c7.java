package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 e;

    public /* synthetic */ c7(di.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
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
                this.c.run(new p3(dVar, this.d, this.e, 1));
                break;
            default:
                di.d dVar2 = this.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.c.run(new p3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
