package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
