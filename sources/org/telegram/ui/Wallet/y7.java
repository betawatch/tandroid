package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;

    public /* synthetic */ y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = callback;
        this.d = h3Var;
        this.e = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ei.d dVar = this.b;
                dVar.setLoading(true);
                this.c.run(new t3(dVar, this.d, this.e, 1));
                break;
            default:
                ei.d dVar2 = this.b;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    this.c.run(new t3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
