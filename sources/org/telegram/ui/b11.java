package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.u b;

    public /* synthetic */ b11(bi.u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.J3(((f01) this.b.f2).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
