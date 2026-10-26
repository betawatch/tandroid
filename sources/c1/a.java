package c1;

import w0.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ i c;

    public /* synthetic */ a(e eVar, i iVar, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e().onError(this.c);
                break;
            case 1:
                this.b.e().onError(this.c);
                break;
            default:
                this.b.e().onError(this.c);
                break;
        }
    }
}
