package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ia(na naVar, int i7) {
        this.a = i7;
        this.b = naVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        na naVar = this.b;
        switch (i7) {
            case 0:
                naVar.e0 = null;
                break;
            default:
                lc.b0(naVar).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                break;
        }
    }
}
