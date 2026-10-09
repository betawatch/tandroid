package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;

    public /* synthetic */ c7(ci.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = callback;
        this.d = f3Var;
        this.e = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ci.d dVar = this.b;
                dVar.setLoading(true);
                this.c.run(new o3(dVar, this.d, this.e, 1));
                break;
            default:
                ci.d dVar2 = this.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.c.run(new o3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
