package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l0 {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public j0 g;
    public boolean h;

    public l0(int i3, int i10, String str) {
        this.h = true;
        this.a = i3;
        this.c = str;
        this.e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i3 = this.d;
        return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5;
    }

    public final boolean b(l0 l0Var) {
        if (this.d == l0Var.d) {
            return true;
        }
        return a() && l0Var.a();
    }

    public l0(int i3, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.a = i3;
        this.b = i10;
        this.e = messagesFilter;
        this.d = i11;
    }
}
