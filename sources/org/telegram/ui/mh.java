package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ tn c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mh(int i10, tn tnVar, boolean z10) {
        this.b = i10;
        this.c = tnVar;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.d;
                this.c.yc(this.b, z10);
                break;
            default:
                int i10 = this.b;
                tn tnVar = this.c;
                if (i10 != 2) {
                    tnVar.U9();
                    tnVar.Yb();
                }
                qh.p0.f(org.telegram.ui.Components.tc.a0(tnVar), i10, this.d);
                break;
        }
    }

    public /* synthetic */ mh(tn tnVar, boolean z10, int i10) {
        this.c = tnVar;
        this.d = z10;
        this.b = i10;
    }
}
