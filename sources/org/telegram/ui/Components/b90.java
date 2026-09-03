package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c90 b;
    public final /* synthetic */ g90 c;

    public /* synthetic */ b90(c90 c90Var, g90 g90Var, int i10) {
        this.a = i10;
        this.b = c90Var;
        this.c = g90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
