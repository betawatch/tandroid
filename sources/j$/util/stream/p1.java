package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p1 extends q1 {
    private final Object[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(j$.util.Q q, b bVar, Object[] objArr) {
        super(objArr.length, q, bVar);
        this.h = objArr;
    }

    p1(p1 p1Var, j$.util.Q q, long j, long j2) {
        super(p1Var, q, j, j2, p1Var.h.length);
        this.h = p1Var.h;
    }

    @Override // j$.util.stream.q1
    final q1 a(j$.util.Q q, long j, long j2) {
        return new p1(this, q, j, j2);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
