package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vg0 b;

    public /* synthetic */ pg0(vg0 vg0Var, int i7) {
        this.a = i7;
        this.b = vg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.h1(true, false);
                break;
            default:
                this.b.h1(true, false);
                break;
        }
    }
}
