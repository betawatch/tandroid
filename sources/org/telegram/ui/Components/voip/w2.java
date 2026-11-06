package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2(b3 b3Var, int i7, int i10) {
        this.a = i10;
        this.b = b3Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.b, this.c, 3));
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
