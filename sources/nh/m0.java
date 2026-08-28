package nh;

import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ m0(int i9, qn qnVar, boolean z10) {
        this.d = i9;
        this.b = qnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i9 = this.d;
                qn qnVar = this.b;
                if (i9 != 2) {
                    qnVar.U9();
                    qnVar.Yb();
                }
                r0.f(oc.a0(qnVar), i9, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ m0(qn qnVar, boolean z10, int i9) {
        this.b = qnVar;
        this.c = z10;
        this.d = i9;
    }
}
