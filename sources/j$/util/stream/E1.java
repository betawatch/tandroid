package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class E1 extends w0 {
    public final /* synthetic */ int h;

    public /* synthetic */ E1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.w0
    public final S1 e0() {
        switch (this.h) {
            case 0:
                return new W1();
            case 1:
                return new U1();
            case 2:
                return new X1();
            default:
                return new V1();
        }
    }

    @Override // j$.util.stream.w0, j$.util.stream.G3
    public final Object b(b bVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(bVar, spliterator);
    }

    @Override // j$.util.stream.w0, j$.util.stream.G3
    public final Object c(b bVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!a3.SIZED.m(bVar.J())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.c(bVar, spliterator);
    }

    @Override // j$.util.stream.w0, j$.util.stream.G3
    public final int d() {
        switch (this.h) {
        }
        return a3.r;
    }
}
