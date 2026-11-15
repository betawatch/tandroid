package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ id0(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new id0(this.b, 1));
                break;
            default:
                this.b.a("CANCELLED");
                break;
        }
    }
}
