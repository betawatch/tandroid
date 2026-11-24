// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d22 implements i22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ d22(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // i22
    public final String run() {
        p38 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = p38.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = p38.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return yjb.k(sb, str, f);
    }
}
