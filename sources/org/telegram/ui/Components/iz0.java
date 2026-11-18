package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz0 b;
    public final /* synthetic */ jz0 c;

    public /* synthetic */ iz0(kz0 kz0Var, jz0 jz0Var, int i7) {
        this.a = i7;
        this.b = kz0Var;
        this.c = jz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
