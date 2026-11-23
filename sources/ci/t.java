package ci;

import ai.y1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t implements gs {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final y1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, y1 y1Var) {
        this.a = i7;
        this.b = document;
        this.c = i10;
        this.d = y1Var;
        ls.f(i7).b(this, ls.Y1);
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
            ls.f(this.a).n(this, ls.Y1);
            w7.G(this.a);
            Utilities.e.c(new c1.a(10, this, w7.J(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.Y1) {
            a();
        }
    }
}
