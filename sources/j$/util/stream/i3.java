package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i3 extends l3 implements j$.util.E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i3(j$.util.E e, long j, long j2) {
        super(e, j, j2);
    }

    i3(j$.util.E e, long j, long j2, long j3, long j4) {
        super(e, j, j2, j3, j4);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.a.b(this, consumer);
    }

    @Override // j$.util.stream.n3
    protected final j$.util.Q b(j$.util.Q q, long j, long j2, long j3, long j4) {
        return new i3((j$.util.E) q, j, j2, j3, j4);
    }

    @Override // j$.util.stream.l3
    protected final Object f() {
        return new y0(1);
    }

    @Override // j$.util.Q
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.a.n(this, consumer);
    }
}
