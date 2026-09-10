package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;
    public final /* synthetic */ h11 c;

    public /* synthetic */ f11(i11 i11Var, h11 h11Var, int i10) {
        this.a = i10;
        this.b = i11Var;
        this.c = h11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
