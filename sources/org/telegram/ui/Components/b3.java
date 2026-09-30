package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ b3(int i10, Utilities.Callback callback, boolean[] zArr) {
        this.a = i10;
        this.b = callback;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.run(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.run(Boolean.TRUE);
                this.c[0] = true;
                a2Var.dismiss();
                break;
        }
    }
}
