package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jd(kd kdVar, boolean z10, int i10) {
        this.a = i10;
        this.b = kdVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                kd kdVar = this.b;
                if (!z10) {
                    kdVar.Z0.setVisibility(8);
                    break;
                } else {
                    kdVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                kd kdVar2 = this.b;
                if (!z11) {
                    kdVar2.V0.setVisibility(8);
                    break;
                } else {
                    kdVar2.getClass();
                    break;
                }
        }
    }
}
