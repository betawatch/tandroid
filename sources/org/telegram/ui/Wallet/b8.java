package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 e;

    public /* synthetic */ b8(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = callback;
        this.d = f3Var;
        this.e = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ei.d dVar = this.b;
                dVar.setLoading(true);
                this.c.run(new q3(dVar, this.d, this.e, 1));
                break;
            default:
                ei.d dVar2 = this.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.c.run(new q3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
