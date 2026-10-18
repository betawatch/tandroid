package ge;

import be.c0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final kd.h a;

    public e(kd.h hVar) {
        this.a = hVar;
    }

    @Override // be.c0
    public final kd.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
