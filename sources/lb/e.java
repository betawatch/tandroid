package lb;

import android.content.Context;
import cb.h;
import l7.na;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e extends cb.e {
    public final h b;

    public e(h hVar) {
        super(0);
        this.b = hVar;
    }

    @Override // cb.e
    public final Object E(Object obj) {
        kb.b bVar = (kb.b) obj;
        Context b10 = this.b.b();
        y5.e.b.getClass();
        return new f(bVar, y5.e.a(b10) >= 204700000 ? new a(b10, bVar) : new c(b10, bVar), na.b());
    }
}
