package lb;

import android.content.Context;
import cb.h;
import l7.na;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
