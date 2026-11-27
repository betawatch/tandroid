// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny1 implements hj, fd {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ny1(qy1 qy1Var, View view, Object obj, String str, Object obj2, no6 no6Var, boolean z) {
        this.c = qy1Var;
        this.d = view;
        this.e = obj;
        this.a = str;
        this.f = obj2;
        this.h = no6Var;
        this.b = z;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        bg2 bg2Var = (bg2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        bg2Var.getClass();
        bg2Var.x0(user.id, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.a, this.b, bg2Var.e1 == 1 ? 0 : 1, false);
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ((qy1) this.c).B((View) this.d, this.e, this.a, this.f, z, i, i2, (no6) this.h, this.b);
    }

    public /* synthetic */ ny1(bg2 bg2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.c = bg2Var;
        this.d = user;
        this.e = tLObject;
        this.f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.a = str;
        this.b = z;
    }
}
