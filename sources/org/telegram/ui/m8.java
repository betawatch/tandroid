package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ m8(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(false);
                break;
            default:
                this.b.h0();
                break;
        }
    }
}
