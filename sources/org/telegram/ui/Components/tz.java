package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z4;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vz vzVar = (vz) this.e;
                if (this.b) {
                    zz zzVar = vzVar.G;
                    zzVar.a = true;
                    zzVar.b = true;
                }
                if (this.c) {
                    vzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(vzVar.X - currentTimeMillis) > 30) {
                    vzVar.X = currentTimeMillis;
                    vzVar.a0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ng0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
