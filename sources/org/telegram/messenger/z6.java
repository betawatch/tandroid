package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z6(i7 i7Var, int i7, int i10) {
        this.a = i10;
        this.b = i7Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F0.add(Integer.valueOf(this.c));
                break;
            case 1:
                this.b.F0.remove(Integer.valueOf(this.c));
                break;
            case 2:
                this.b.F0.remove(Integer.valueOf(this.c));
                break;
            default:
                i7 i7Var = this.b;
                u7 u7Var = i7Var.g0;
                if (u7Var != null) {
                    u7Var.b(i7Var, this.c);
                }
                i7Var.i();
                break;
        }
    }
}
