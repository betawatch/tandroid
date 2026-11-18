package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
