package bc;

import android.content.Context;
import b2.h;
import y7.ea;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends h {
    public final sb.g b;

    public e(sb.g gVar) {
        super(6);
        this.b = gVar;
    }

    @Override // b2.h
    public final Object Q0(Object obj) {
        ac.b bVar = (ac.b) obj;
        Context b10 = this.b.b();
        l6.e.b.getClass();
        return new f(bVar, l6.e.a(b10) >= 204700000 ? new a(b10, bVar) : new c(b10, bVar), ea.b());
    }
}
