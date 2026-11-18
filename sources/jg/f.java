package jg;

import org.telegram.ui.bx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                for (bx bxVar : this.b.S.f0) {
                    ((v4.c0) bxVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.K();
                break;
        }
    }
}
