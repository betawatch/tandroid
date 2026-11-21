package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ k6(l6 l6Var, int i7) {
        this.a = i7;
        this.b = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        l6 l6Var = this.b;
        switch (i7) {
            case 0:
                l6Var.s();
                break;
            default:
                ks.e().k(ks.w4, l6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
