package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vn b;
    public final /* synthetic */ int c;

    public /* synthetic */ tm(vn vnVar, int i10, int i11) {
        this.a = i11;
        this.b = vnVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, null);
                break;
            case 1:
                this.b.b0(this.c);
                break;
            default:
                this.b.e0(this.c, null);
                break;
        }
    }
}
