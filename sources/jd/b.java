package jd;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import rd.p;
import v7.u7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b extends h {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ id.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(id.c cVar, id.c cVar2, p pVar) {
        super(cVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            u7.b(obj);
            return obj;
        }
        this.a = 1;
        u7.b(obj);
        p pVar = this.b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
