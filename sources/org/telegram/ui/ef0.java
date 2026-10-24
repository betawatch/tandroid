package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ef0(mf0 mf0Var, int i10, int i11) {
        this.a = i11;
        this.b = mf0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ef0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].l(1.0f);
                break;
        }
    }
}
