package ng;

import org.telegram.ui.bo;
import org.telegram.ui.eg1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ b(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                if (boVar.getParentLayout() != null) {
                    eg1.I0(boVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
