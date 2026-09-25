package ce;

import za.a0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
