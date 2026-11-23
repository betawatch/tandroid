package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;
    public final /* synthetic */ rh0 c;

    public /* synthetic */ d1(n4 n4Var, rh0 rh0Var, int i7) {
        this.a = i7;
        this.b = n4Var;
        this.c = rh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new d1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
