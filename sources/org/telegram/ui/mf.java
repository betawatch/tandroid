package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mf(yn ynVar, boolean z10, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.b.xc(0, this.c);
                break;
        }
    }
}
