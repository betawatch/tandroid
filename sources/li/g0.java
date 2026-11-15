package li;

import org.telegram.ui.Components.cc;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ g0(int i7, an anVar, boolean z10) {
        this.d = i7;
        this.b = anVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i7 = this.d;
                an anVar = this.b;
                if (i7 != 2) {
                    anVar.xa();
                    anVar.Fc();
                }
                l0.f(cc.a0(anVar), i7, this.c);
                break;
            default:
                boolean z10 = this.c;
                this.b.gd(this.d, z10);
                break;
        }
    }

    public /* synthetic */ g0(an anVar, boolean z10, int i7) {
        this.b = anVar;
        this.c = z10;
        this.d = i7;
    }
}
