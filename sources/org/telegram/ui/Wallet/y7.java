package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei.d b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 e;

    public /* synthetic */ y7(ei.d dVar, Utilities.Callback callback, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
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
                this.c.run(new u3(dVar, this.d, this.e, 1));
                break;
            default:
                ei.d dVar2 = this.b;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    this.c.run(new u3(this.d, this.e, dVar2));
                    break;
                }
                break;
        }
    }
}
