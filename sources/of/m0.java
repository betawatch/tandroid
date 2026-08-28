package of;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public k0 g;
    public boolean h;

    public m0(int i9, int i10, String str) {
        this.h = true;
        this.a = i9;
        this.c = str;
        this.e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i9 = this.d;
        return i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 5;
    }

    public final boolean b(m0 m0Var) {
        if (this.d == m0Var.d) {
            return true;
        }
        return a() && m0Var.a();
    }

    public m0(int i9, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.a = i9;
        this.b = i10;
        this.e = messagesFilter;
        this.d = i11;
    }
}
