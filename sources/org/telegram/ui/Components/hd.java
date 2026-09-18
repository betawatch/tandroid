package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
