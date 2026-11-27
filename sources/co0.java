// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class co0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ co0(lo0 lo0Var, byte b) {
        this.a = b;
        this.b = lo0Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        lo0 lo0Var = this.b;
        switch (b) {
            case 0:
                lo0Var.V = (wg1) obj;
                break;
            default:
                hl.c3(new a30(lo0Var, (TL_stories.TL_premium_boostsStatus) obj, (byte) 14));
                break;
        }
    }
}
