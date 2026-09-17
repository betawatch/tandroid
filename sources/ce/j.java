package ce;

import za.y;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
