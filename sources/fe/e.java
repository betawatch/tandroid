package fe;

import ae.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e implements d0 {
    public final jd.h a;

    public e(jd.h hVar) {
        this.a = hVar;
    }

    @Override // ae.d0
    public final jd.h c() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
