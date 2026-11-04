package gd;

import b8.ib;
import hd.h;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.u;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends h {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ fd.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fd.c cVar, fd.c cVar2, p pVar) {
        super(cVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            ib.b(obj);
            return obj;
        }
        this.a = 1;
        ib.b(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
