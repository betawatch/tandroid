package jd;

import id.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import rd.p;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends kd.c {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ id.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(id.c cVar, h hVar, p pVar, id.c cVar2) {
        super(cVar, hVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            af.b.c(obj);
            return obj;
        }
        this.a = 1;
        af.b.c(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
