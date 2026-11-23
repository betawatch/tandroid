package ci;

import ai.s1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t implements fs {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final s1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public t(int i7, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i10, s1 s1Var) {
        this.a = i7;
        this.b = document;
        this.c = i10;
        this.d = s1Var;
        ks.f(i7).b(this, ks.Y1);
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
            ks.f(this.a).n(this, ks.Y1);
            w7.G(this.a);
            Utilities.e.c(new c1.a(10, this, w7.J(this.b, null, true, true)));
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            a();
        }
    }
}
