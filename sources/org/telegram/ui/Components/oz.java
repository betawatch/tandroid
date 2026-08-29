package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz qzVar = (qz) this.e;
                if (this.b) {
                    uz uzVar = qzVar.F;
                    uzVar.a = true;
                    uzVar.b = true;
                }
                if (this.c) {
                    qzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(qzVar.W - currentTimeMillis) > 30) {
                    qzVar.W = currentTimeMillis;
                    qzVar.Z.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.fg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
