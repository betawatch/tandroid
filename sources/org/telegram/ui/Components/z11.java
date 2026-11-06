package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.v10 b;
    public final /* synthetic */ String c;

    public /* synthetic */ z11(String str, int i7, org.telegram.messenger.v10 v10Var) {
        this.a = i7;
        this.b = v10Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.v10 v10Var = this.b;
                if (v10Var != null) {
                    v10Var.a(this.c, Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                this.b.a(null, this.c);
                break;
            default:
                this.b.a(null, this.c);
                break;
        }
    }
}
