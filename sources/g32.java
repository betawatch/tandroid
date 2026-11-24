// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g32 extends ssc {
    public final /* synthetic */ byte x;
    public final /* synthetic */ q59 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g32(kz0 kz0Var, Context context) {
        super(context, 1);
        this.x = (byte) 0;
        this.y = kz0Var;
    }

    @Override // ssc
    public final void a(int i, Object obj) {
        byte b = this.x;
        q59 q59Var = this.y;
        switch (b) {
            case 0:
                gu2 gu2Var = ((h32) ((kz0) q59Var).f).y;
                if (gu2Var != null) {
                    gu2Var.accept(obj);
                    break;
                }
                break;
            case 1:
                ((otc) q59Var).d.F0(this, obj, i);
                break;
            default:
                ((qtc) q59Var).F.presentFragment(new rob(obj, null, true));
                break;
        }
    }

    @Override // ssc
    public final boolean b(Object obj, int i) {
        switch (this.x) {
            case 1:
                return ((otc) this.y).d.G0(this, obj, i);
            default:
                return super.b(obj, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g32(q59 q59Var, Context context, byte b) {
        super(context, 5);
        this.x = b;
        this.y = q59Var;
    }
}
