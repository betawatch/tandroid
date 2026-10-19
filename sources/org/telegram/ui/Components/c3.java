package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ c3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.a = i10;
        this.b = callback;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.run(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.run(Boolean.TRUE);
                this.c[0] = true;
                b2Var.dismiss();
                break;
        }
    }
}
