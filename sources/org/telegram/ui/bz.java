package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;

    public /* synthetic */ bz(cz czVar, int i7) {
        this.a = i7;
        this.b = czVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                cz czVar = this.b;
                czVar.b(czVar.D);
                break;
        }
    }
}
