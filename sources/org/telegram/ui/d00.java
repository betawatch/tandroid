package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ d00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c10.V(this.b);
                break;
            default:
                c10.W(this.b);
                break;
        }
    }
}
