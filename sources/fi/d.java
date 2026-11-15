package fi;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ d(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(true, false);
                break;
            case 1:
                q qVar = this.b;
                hi.l3 l3Var = qVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                qVar.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                this.b.c();
                break;
        }
    }
}
