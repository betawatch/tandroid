package ce;

import za.y;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                ((y) this.b).c.set((za.m) obj);
                return gd.i.a;
        }
    }
}
