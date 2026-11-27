// default package

import android.os.CancellationSignal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g23 implements ur4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CancellationSignal) obj2).cancel();
                break;
            default:
                ((va1) obj2).resumeWith(f9cVar);
                break;
        }
        return f9cVar;
    }
}
