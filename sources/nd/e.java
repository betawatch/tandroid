package nd;

import id.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final rc.h a;

    public e(rc.h hVar) {
        this.a = hVar;
    }

    @Override // id.c0
    public final rc.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
