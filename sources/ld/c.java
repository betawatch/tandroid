package ld;

import kd.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import td.p;
import v7.i8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends md.c {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ kd.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kd.c cVar, h hVar, p pVar, kd.c cVar2) {
        super(cVar, hVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            i8.b(obj);
            return obj;
        }
        this.a = 1;
        i8.b(obj);
        p pVar = this.b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
