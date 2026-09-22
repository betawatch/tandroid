package fi;

import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
