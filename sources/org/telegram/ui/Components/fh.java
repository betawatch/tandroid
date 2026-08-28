package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fh(ki kiVar, boolean z10, int i9) {
        this.a = i9;
        this.b = kiVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                ki kiVar = this.b;
                if (!z10) {
                    kiVar.Y0.setVisibility(8);
                    break;
                } else {
                    kiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ki kiVar2 = this.b;
                if (!z11) {
                    kiVar2.w.setVisibility(8);
                    break;
                } else {
                    kiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ki kiVar3 = this.b;
                if (!z12) {
                    kiVar3.y.setVisibility(8);
                    break;
                } else {
                    kiVar3.getClass();
                    break;
                }
            default:
                boolean z13 = this.c;
                ki kiVar4 = this.b;
                if (!z13) {
                    kiVar4.getClass();
                    break;
                } else {
                    kiVar4.t1.setVisibility(4);
                    break;
                }
        }
    }
}
