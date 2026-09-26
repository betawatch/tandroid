package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ as(gs gsVar, int i10) {
        this.a = i10;
        this.b = gsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(false);
                break;
            default:
                gs.Q(this.b);
                break;
        }
    }
}
