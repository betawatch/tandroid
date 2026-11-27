// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class hy6 implements py6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qy6 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hy6(qy6 qy6Var, Object obj, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = obj;
    }

    @Override // py6
    public final void a(xw6 xw6Var) {
        byte b = this.a;
        Object obj = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                yx6 yx6Var = qy6Var.j;
                yx6Var.t();
                ((bn2) obj).e(yx6Var.t);
                break;
            default:
                String str = ((os6) obj).a;
                if (TextUtils.isEmpty(str)) {
                    efd.f("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    yx6 yx6Var2 = qy6Var.j;
                    yx6Var2.t();
                    og8 og8Var = yx6Var2.t;
                    if (og8Var.m0(17)) {
                        asb y0 = og8Var.y0();
                        zrb zrbVar = new zrb();
                        for (int i = 0; i < y0.o(); i++) {
                            if (TextUtils.equals(y0.m(i, zrbVar, 0L).b.a, str)) {
                                og8Var.O(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        efd.f("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }
}
