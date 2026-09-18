package ng;

import org.telegram.ui.bo;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    fg1.I0(boVar);
                    break;
                }
                break;
            default:
                this.b.Yb();
                break;
        }
    }
}
