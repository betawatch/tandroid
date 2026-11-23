package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ h6(i6 i6Var, int i7) {
        this.a = i7;
        this.b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new h6(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
