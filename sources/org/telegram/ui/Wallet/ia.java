package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                lc.b0(naVar).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                break;
        }
    }
}
