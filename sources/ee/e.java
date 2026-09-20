package ee;

import zd.c0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
