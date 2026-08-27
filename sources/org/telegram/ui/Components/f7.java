package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ f7(b8 b8Var, int i10) {
        this.a = i10;
        this.b = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8.n(this.b);
                break;
            default:
                b8.G(this.b);
                break;
        }
    }
}
