package jg;

import org.telegram.ui.xw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (xw xwVar : this.b.S.f0) {
                    ((v4.b0) xwVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.K();
                break;
        }
    }
}
