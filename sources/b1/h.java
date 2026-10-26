package b1;

import v0.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ w0.i c;

    public /* synthetic */ h(i iVar, w0.i iVar2, int i10) {
        this.a = i10;
        this.b = iVar;
        this.c = iVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.b.onError(obj);
                break;
            default:
                this.b.onError(this.c);
                break;
        }
    }
}
