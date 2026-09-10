package fg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q0 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public o0 g;
    public boolean h;

    public q0(int i10, int i11, String str) {
        this.h = true;
        this.a = i10;
        this.c = str;
        this.e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5;
    }

    public final boolean b(q0 q0Var) {
        if (this.d == q0Var.d) {
            return true;
        }
        return a() && q0Var.a();
    }

    public q0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.a = i10;
        this.b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
