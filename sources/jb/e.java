package jb;

import ab.h;
import android.content.Context;
import j7.na;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends ab.e {
    public final h b;

    public e(h hVar) {
        super(0);
        this.b = hVar;
    }

    @Override // ab.e
    public final Object F(Object obj) {
        ib.b bVar = (ib.b) obj;
        Context b10 = this.b.b();
        w5.e.b.getClass();
        return new f(bVar, w5.e.a(b10) >= 204700000 ? new a(b10, bVar) : new c(b10, bVar), na.b());
    }
}
