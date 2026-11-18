package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z2(e3 e3Var, int i7, int i10) {
        this.a = i10;
        this.b = e3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
