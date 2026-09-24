package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kd(md mdVar, boolean z10, int i10) {
        this.a = i10;
        this.b = mdVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                md mdVar = this.b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    break;
                } else {
                    mdVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                md mdVar2 = this.b;
                if (!z11) {
                    mdVar2.V0.setVisibility(8);
                    break;
                } else {
                    mdVar2.getClass();
                    break;
                }
        }
    }
}
