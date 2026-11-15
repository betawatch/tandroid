package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ y1(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                z10 z10Var = this.b;
                if (z10Var != null) {
                    z10Var.a(bool);
                    break;
                }
                break;
        }
    }
}
