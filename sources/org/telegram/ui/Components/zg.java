package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zg(di diVar, boolean z9, int i7) {
        this.a = i7;
        this.b = diVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                di diVar = this.b;
                if (!z9) {
                    diVar.W2.setVisibility(8);
                    break;
                } else {
                    diVar.getClass();
                    break;
                }
            case 1:
                boolean z10 = this.c;
                di diVar2 = this.b;
                if (!z10) {
                    diVar2.s1.setVisibility(8);
                    break;
                } else {
                    diVar2.getClass();
                    break;
                }
            case 2:
                boolean z11 = this.c;
                di diVar3 = this.b;
                if (!z11) {
                    diVar3.u1.setVisibility(8);
                    break;
                } else {
                    diVar3.getClass();
                    break;
                }
            default:
                boolean z12 = this.c;
                di diVar4 = this.b;
                if (!z12) {
                    diVar4.getClass();
                    break;
                } else {
                    diVar4.r3.setVisibility(4);
                    break;
                }
        }
    }
}
