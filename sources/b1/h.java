package b1;

import v0.i;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
