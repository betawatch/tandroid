package ee;

import zd.c0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final id.h a;

    public e(id.h hVar) {
        this.a = hVar;
    }

    @Override // zd.c0
    public final id.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
