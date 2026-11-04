package b1;

import v0.h;
import w0.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ i c;

    public /* synthetic */ g(h hVar, i iVar, int i3) {
        this.a = i3;
        this.b = hVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.h(2, "No provider data returned");
                }
                this.b.a(obj);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
