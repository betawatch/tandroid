package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                vz vzVar = (vz) this.e;
                if (this.b) {
                    zz zzVar = vzVar.J;
                    zzVar.a = true;
                    zzVar.b = true;
                }
                if (this.c) {
                    vzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.a0 - currentTimeMillis) > 30) {
                    vzVar.a0 = currentTimeMillis;
                    vzVar.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.xg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
