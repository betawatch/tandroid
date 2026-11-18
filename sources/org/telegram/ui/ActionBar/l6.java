package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ l6(m6 m6Var, int i7) {
        this.a = i7;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m6 m6Var = this.b;
        switch (i7) {
            case 0:
                m6Var.s();
                break;
            default:
                ks.e().k(ks.w4, m6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
