package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
