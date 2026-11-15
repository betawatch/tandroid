package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ my(hz hzVar, int i7) {
        this.a = i7;
        this.b = hzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hz.a0(this.b);
                break;
            default:
                hz.b0(this.b);
                break;
        }
    }
}
