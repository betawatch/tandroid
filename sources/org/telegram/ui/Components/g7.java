package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ g7(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8.n(this.b);
                break;
            default:
                c8.F(this.b);
                break;
        }
    }
}
