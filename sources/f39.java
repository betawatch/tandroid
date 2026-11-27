// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f39 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o39 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ f39(o39 o39Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = o39Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        o39 o39Var = this.b;
        switch (b) {
            case 0:
                jn7.f(o39Var.b).d(new f39(o39Var, tLObject, (byte) 1));
                break;
            default:
                o39Var.b(tLObject);
                break;
        }
    }
}
