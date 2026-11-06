package ai;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class y implements ls {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final f1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public y(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, f1 f1Var) {
        this.a = i7;
        this.b = document;
        this.c = i10;
        this.d = f1Var;
        qs.f(i7).b(this, qs.Y1);
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
            qs.f(this.a).n(this, qs.Y1);
            w7.G(this.a);
            Utilities.e.c(new a1.e(9, this, w7.J(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
            a();
        }
    }
}
