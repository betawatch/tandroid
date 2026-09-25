package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
