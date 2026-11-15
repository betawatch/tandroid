package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ eh(ki kiVar, boolean z10, int i7) {
        this.a = i7;
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
                    kiVar.a3.setVisibility(8);
                    break;
                } else {
                    kiVar.getClass();
                    break;
                }
            case 1:
                boolean z11 = this.c;
                ki kiVar2 = this.b;
                if (!z11) {
                    kiVar2.w1.setVisibility(8);
                    break;
                } else {
                    kiVar2.getClass();
                    break;
                }
            case 2:
                boolean z12 = this.c;
                ki kiVar3 = this.b;
                if (!z12) {
                    kiVar3.y1.setVisibility(8);
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
                    kiVar4.v3.setVisibility(4);
                    break;
                }
        }
    }
}
