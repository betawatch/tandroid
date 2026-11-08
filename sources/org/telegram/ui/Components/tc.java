package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tc(uc ucVar, boolean z9, int i7) {
        this.a = i7;
        this.b = ucVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                uc ucVar = this.b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    break;
                } else {
                    ucVar.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                uc ucVar2 = this.b;
                if (!z10) {
                    ucVar2.U0.setVisibility(8);
                    break;
                } else {
                    ucVar2.getClass();
                    break;
                }
        }
    }
}
