package ci;

import ai.v1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t implements is {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final v1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, v1 v1Var) {
        this.a = i7;
        this.b = document;
        this.c = i10;
        this.d = v1Var;
        ns.f(i7).b(this, ns.Y1);
        w7.G(i7);
        if (!w7.J(document, null, true, true).exists()) {
            w7.G(i7).W(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.e || this.f) {
            return;
        }
        w7.G(this.a);
        if (w7.J(this.b, null, true, true).exists()) {
            this.f = true;
            ns.f(this.a).n(this, ns.Y1);
            w7.G(this.a);
            Utilities.e.c(new c1.c(9, this, w7.J(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.Y1) {
            a();
        }
    }
}
