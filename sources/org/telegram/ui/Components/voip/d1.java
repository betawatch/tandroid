package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;
    public final /* synthetic */ ph0 c;

    public /* synthetic */ d1(n4 n4Var, ph0 ph0Var, int i7) {
        this.a = i7;
        this.b = n4Var;
        this.c = ph0Var;
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
