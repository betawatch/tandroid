package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ qa0(ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}
