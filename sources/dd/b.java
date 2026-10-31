package dd;

import ed.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import ld.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends h {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ cd.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cd.c cVar, cd.c cVar2, p pVar) {
        super(cVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            l9.b.b(obj);
            return obj;
        }
        this.a = 1;
        l9.b.b(obj);
        p pVar = this.b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
