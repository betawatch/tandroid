package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public o0(int i7, int i10, String str) {
        this.h = true;
        this.a = i7;
        this.c = str;
        this.e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i7 = this.d;
        return i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5;
    }

    public final boolean b(o0 o0Var) {
        if (this.d == o0Var.d) {
            return true;
        }
        return a() && o0Var.a();
    }

    public o0(int i7, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.a = i7;
        this.b = i10;
        this.e = messagesFilter;
        this.d = i11;
    }
}
