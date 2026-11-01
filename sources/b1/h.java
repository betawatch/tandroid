package b1;

import w0.i;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0.h b;
    public final /* synthetic */ i c;

    public /* synthetic */ h(v0.h hVar, i iVar, int i10) {
        this.a = i10;
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
                this.b.g(obj);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
