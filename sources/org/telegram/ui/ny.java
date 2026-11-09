package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz b;

    public /* synthetic */ ny(iz izVar, int i7) {
        this.a = i7;
        this.b = izVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iz.a0(this.b);
                break;
            default:
                iz.b0(this.b);
                break;
        }
    }
}
