package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class o0 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public m0 g;
    public boolean h;

    public o0(int i10, int i11, String str) {
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

    public final boolean b(o0 o0Var) {
        if (this.d == o0Var.d) {
            return true;
        }
        return a() && o0Var.a();
    }

    public o0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.a = i10;
        this.b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
