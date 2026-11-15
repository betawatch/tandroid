package bi;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ j4(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.k0(((Boolean) obj).booleanValue());
                break;
            default:
                this.b.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
