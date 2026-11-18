package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ nt(pt ptVar, int i7) {
        this.a = i7;
        this.b = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.post(new nt(ptVar, 1));
                break;
            default:
                pt ptVar2 = this.b;
                ptVar2.h();
                ptVar2.d();
                break;
        }
    }
}
