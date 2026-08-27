package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class a4 extends t3 {
    public final /* synthetic */ int h;

    public /* synthetic */ a4(int i10) {
        this.h = i10;
    }

    @Override // j$.util.stream.t3
    public final o4 D0() {
        switch (this.h) {
            case 0:
                return new s4();
            case 1:
                return new q4();
            case 2:
                return new t4();
            default:
                return new r4();
        }
    }

    @Override // j$.util.stream.t3, j$.util.stream.b8
    public final Object f(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!v6.SIZED.m(aVar.m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!v6.SIZED.m(aVar.m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!v6.SIZED.m(aVar.m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!v6.SIZED.m(aVar.m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.f(aVar, spliterator);
    }

    @Override // j$.util.stream.t3, j$.util.stream.b8
    public final Object i(t3 t3Var, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!v6.SIZED.m(((a) t3Var).m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!v6.SIZED.m(((a) t3Var).m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!v6.SIZED.m(((a) t3Var).m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!v6.SIZED.m(((a) t3Var).m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.i(t3Var, spliterator);
    }

    @Override // j$.util.stream.t3, j$.util.stream.b8
    public final int v() {
        switch (this.h) {
        }
        return v6.r;
    }
}
