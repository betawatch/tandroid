package ce;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class k extends kd.c {
    public kotlin.jvm.internal.p a;
    public j b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return o.b(null, this);
    }
}
