package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l2(q2 q2Var, int i3, int i10) {
        this.a = i10;
        this.b = q2Var;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new l2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new l2(this.b, this.c, 3));
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
