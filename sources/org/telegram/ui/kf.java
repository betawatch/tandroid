package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kf(co coVar, boolean z10, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.b.yc(0, this.c);
                break;
        }
    }
}
