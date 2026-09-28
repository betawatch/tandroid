package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jd(md mdVar, boolean z10, int i10) {
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
