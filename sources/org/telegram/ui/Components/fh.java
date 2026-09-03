package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fh(li liVar, boolean z4, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                li liVar = this.b;
                if (!z4) {
                    liVar.Z0.setVisibility(8);
                    break;
                } else {
                    liVar.getClass();
                    break;
                }
            case 1:
                boolean z10 = this.c;
                li liVar2 = this.b;
                if (!z10) {
                    liVar2.w.setVisibility(8);
                    break;
                } else {
                    liVar2.getClass();
                    break;
                }
            case 2:
                boolean z11 = this.c;
                li liVar3 = this.b;
                if (!z11) {
                    liVar3.y.setVisibility(8);
                    break;
                } else {
                    liVar3.getClass();
                    break;
                }
            default:
                boolean z12 = this.c;
                li liVar4 = this.b;
                if (!z12) {
                    liVar4.getClass();
                    break;
                } else {
                    liVar4.u1.setVisibility(4);
                    break;
                }
        }
    }
}
