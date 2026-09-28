package ce;

import za.a0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class j implements c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ce.c
    public final Object a(Object obj, kd.c cVar) {
        switch (this.a) {
            case 0:
                ((kotlin.jvm.internal.p) this.b).a = obj;
                throw new de.a(this);
            default:
                ((a0) this.b).c.set((za.o) obj);
                return gd.i.a;
        }
    }
}
