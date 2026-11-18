package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ op0(bs0 bs0Var, int i7, int i10) {
        this.a = i10;
        this.b = bs0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            case 1:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}
