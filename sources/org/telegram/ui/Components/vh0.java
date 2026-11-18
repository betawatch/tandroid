package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ei0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ vh0(ei0 ei0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = ei0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ei0 ei0Var = this.b;
                org.telegram.messenger.ks.f(ei0Var.b).d(new vh0(ei0Var, this.c, 1));
                break;
            default:
                ei0.a(this.b, this.c);
                break;
        }
    }
}
