package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ de(bn bnVar, boolean z10, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.gd(0, this.c);
                break;
            default:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
        }
    }
}
