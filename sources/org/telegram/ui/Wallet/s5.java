package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ s5(t5 t5Var, int i7) {
        this.a = i7;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new s5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
