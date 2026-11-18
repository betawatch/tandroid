package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersActivity b;

    public /* synthetic */ e51(StickersActivity stickersActivity, int i7) {
        this.a = i7;
        this.b = stickersActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                StickersActivity stickersActivity = this.b;
                stickersActivity.n--;
                break;
        }
    }
}
