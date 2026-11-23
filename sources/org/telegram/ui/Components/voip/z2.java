package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z2(e3 e3Var, int i7, int i10) {
        this.a = i10;
        this.b = e3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
