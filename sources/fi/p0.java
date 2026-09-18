package fi;

import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ bo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, bo boVar, boolean z10) {
        this.d = i10;
        this.b = boVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                bo boVar = this.b;
                if (i10 != 2) {
                    boVar.U9();
                    boVar.Yb();
                }
                u0.f(vc.a0(boVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.yc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(bo boVar, boolean z10, int i10) {
        this.b = boVar;
        this.c = z10;
        this.d = i10;
    }
}
