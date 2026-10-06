package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ b3(int i10, Utilities.Callback callback, boolean[] zArr) {
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
