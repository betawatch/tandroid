package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 d;

    public /* synthetic */ i1(b5 b5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.a = i7;
        this.b = b5Var;
        this.c = t1Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new i1(this.b, this.c, this.d, 1));
                break;
            default:
                c5.b0(this.b, this.c, this.d);
                break;
        }
    }
}
