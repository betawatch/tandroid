package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 e;

    public /* synthetic */ y7(fi.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = callback;
        this.d = k3Var;
        this.e = u6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fi.d dVar = this.b;
                dVar.setLoading(true);
                this.c.run(new t3(dVar, this.d, this.e, 1));
                break;
            default:
                fi.d dVar2 = this.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    this.c.run(new t3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
