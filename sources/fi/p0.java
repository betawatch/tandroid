package fi;

import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zn b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ p0(int i10, zn znVar, boolean z10) {
        this.d = i10;
        this.b = znVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i10 = this.d;
                zn znVar = this.b;
                if (i10 != 2) {
                    znVar.Z9();
                    znVar.cc();
                }
                u0.f(ad.a0(znVar), i10, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.Cc(this.d, z10);
                break;
        }
    }

    public /* synthetic */ p0(zn znVar, boolean z10, int i10) {
        this.b = znVar;
        this.c = z10;
        this.d = i10;
    }
}
