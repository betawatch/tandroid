package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks b;

    public /* synthetic */ gs(ks ksVar, int i7) {
        this.a = i7;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(false);
                break;
            default:
                this.b.O(true);
                break;
        }
    }
}
