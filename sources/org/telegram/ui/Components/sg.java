package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug b;
    public final /* synthetic */ bi.x4 c;

    public /* synthetic */ sg(ug ugVar, bi.x4 x4Var, int i10) {
        this.a = i10;
        this.b = ugVar;
        this.c = x4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ug ugVar = this.b;
                bi.x4 x4Var = this.c;
                ugVar.removeView(x4Var);
                if (ugVar.b == x4Var) {
                    ugVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                ug ugVar2 = this.b;
                bi.x4 x4Var2 = this.c;
                ugVar2.removeView(x4Var2);
                if (ugVar2.a == x4Var2) {
                    ugVar2.a = null;
                    break;
                }
                break;
        }
    }
}
