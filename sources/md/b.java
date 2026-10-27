package md;

import a8.jd;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import nd.g;
import ud.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends g {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ ld.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ld.c cVar, ld.c cVar2, p pVar) {
        super(cVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            jd.b(obj);
            return obj;
        }
        this.a = 1;
        jd.b(obj);
        p pVar = this.b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
