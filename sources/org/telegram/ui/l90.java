package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q90 b;

    public /* synthetic */ l90(q90 q90Var, int i7) {
        this.a = i7;
        this.b = q90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
