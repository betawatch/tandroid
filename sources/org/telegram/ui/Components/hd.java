package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hd(jd jdVar, boolean z10, int i10) {
        this.a = i10;
        this.b = jdVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                jd jdVar = this.b;
                if (!z10) {
                    jdVar.Z0.setVisibility(8);
                    break;
                } else {
                    jdVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                jd jdVar2 = this.b;
                if (!z11) {
                    jdVar2.V0.setVisibility(8);
                    break;
                } else {
                    jdVar2.getClass();
                    break;
                }
        }
    }
}
