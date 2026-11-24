package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class d4 extends w3 {
    public final /* synthetic */ byte h;

    public /* synthetic */ d4(byte b) {
        this.h = b;
    }

    @Override // j$.util.stream.w3
    public final r4 Y() {
        switch (this.h) {
            case 0:
                return new v4();
            case 1:
                return new t4();
            case 2:
                return new w4();
            default:
                return new u4();
        }
    }

    @Override // j$.util.stream.w3, j$.util.stream.h8
    public final Object a(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.a(aVar, spliterator);
    }

    @Override // j$.util.stream.w3, j$.util.stream.h8
    public final Object b(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!b7.SIZED.n(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.w3, j$.util.stream.h8
    public final int c() {
        switch (this.h) {
        }
        return b7.r;
    }
}
