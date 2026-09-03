package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    a00 a00Var = vzVar.G;
                    a00Var.a = true;
                    a00Var.b = true;
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
                ((org.telegram.ui.pg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
