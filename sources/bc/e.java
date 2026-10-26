package bc;

import android.content.Context;
import b2.h;
import y7.ea;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
