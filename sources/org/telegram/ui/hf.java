package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hf(un unVar, boolean z10, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.b.Sc(0, this.c);
                break;
        }
    }
}
