package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fz(Object obj, boolean z10, boolean z11, boolean z12, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hz hzVar = (hz) this.e;
                if (this.b) {
                    lz lzVar = hzVar.F;
                    lzVar.a = true;
                    lzVar.b = true;
                }
                if (this.c) {
                    hzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(hzVar.W - currentTimeMillis) > 30) {
                    hzVar.W = currentTimeMillis;
                    hzVar.Z.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.fg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
