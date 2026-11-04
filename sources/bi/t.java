package bi;

import ai.o1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t implements cs {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final o1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public t(int i3, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, o1 o1Var) {
        this.a = i3;
        this.b = document;
        this.c = i10;
        this.d = o1Var;
        hs.f(i3).b(this, hs.Y1);
        w7.G(i3);
        if (!w7.K(document, null, true, true).exists()) {
            w7.G(i3).X(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.e || this.f) {
            return;
        }
        w7.G(this.a);
        if (w7.K(this.b, null, true, true).exists()) {
            this.f = true;
            hs.f(this.a).n(this, hs.Y1);
            w7.G(this.a);
            Utilities.e.c(new a1.f(11, this, w7.K(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            a();
        }
    }
}
