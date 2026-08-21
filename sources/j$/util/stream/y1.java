package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class y1 extends r1 {
    public final /* synthetic */ int h;

    public /* synthetic */ y1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.r1
    public final M1 Z() {
        switch (this.h) {
            case 0:
                return new Q1();
            case 1:
                return new O1();
            case 2:
                return new R1();
            default:
                return new P1();
        }
    }

    @Override // j$.util.stream.r1, j$.util.stream.y3
    public final Object b(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.r1, j$.util.stream.y3
    public final Object c(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!S2.SIZED.q(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.c(aVar, spliterator);
    }

    @Override // j$.util.stream.r1, j$.util.stream.y3
    public final int d() {
        switch (this.h) {
        }
        return S2.r;
    }
}
