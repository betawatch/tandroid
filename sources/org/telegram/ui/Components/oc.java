package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oc(pc pcVar, boolean z10, int i7) {
        this.a = i7;
        this.b = pcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                pc pcVar = this.b;
                if (!z10) {
                    pcVar.Z0.setVisibility(8);
                    break;
                } else {
                    pcVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                pc pcVar2 = this.b;
                if (!z11) {
                    pcVar2.V0.setVisibility(8);
                    break;
                } else {
                    pcVar2.getClass();
                    break;
                }
        }
    }
}
