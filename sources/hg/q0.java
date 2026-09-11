package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
