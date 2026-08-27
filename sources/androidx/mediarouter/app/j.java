package androidx.mediarouter.app;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                uVar.i(true);
                uVar.Q.requestLayout();
                uVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new i(uVar));
                break;
            default:
                u uVar2 = ((s) this.b).b;
                if (uVar2.Y != null) {
                    uVar2.Y = null;
                    if (uVar2.o0) {
                        uVar2.q(uVar2.p0);
                        break;
                    }
                }
                break;
        }
    }
}
