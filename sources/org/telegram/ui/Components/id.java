package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ id(jd jdVar, boolean z10, int i10) {
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
