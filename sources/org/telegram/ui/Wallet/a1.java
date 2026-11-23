package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a1(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = c8.za.b;
                if (e1Var != null) {
                    if (this.b.equals(e1Var.d)) {
                        c8.za.b.c("STORAGE_CANCELED");
                        c8.za.b.e();
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g(this.b);
                break;
        }
    }
}
