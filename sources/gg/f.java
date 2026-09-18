package gg;

import org.telegram.ui.vy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (vy vyVar : this.b.R.e0) {
                    ((s4.c0) vyVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.J();
                break;
        }
    }
}
