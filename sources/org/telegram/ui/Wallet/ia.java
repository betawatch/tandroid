package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                lc.b0(naVar).N(gd.M0(2131745666, null), gd.M0(2131751094, null)).j();
                break;
        }
    }
}
