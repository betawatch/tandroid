package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                jz jzVar = (jz) this.e;
                if (this.b) {
                    nz nzVar = jzVar.F;
                    nzVar.a = true;
                    nzVar.b = true;
                }
                if (this.c) {
                    jzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(jzVar.W - currentTimeMillis) > 30) {
                    jzVar.W = currentTimeMillis;
                    jzVar.Z.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ig0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
