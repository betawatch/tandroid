package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class L0 extends M0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(int i, Spliterator spliterator, b bVar) {
        super(bVar, spliterator, new l(9), new k(3));
        switch (i) {
            case 1:
                super(bVar, spliterator, new l(10), new k(4));
                break;
            case 2:
                super(bVar, spliterator, new l(11), new k(5));
                break;
            default:
                break;
        }
    }

    L0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        super(bVar, spliterator, new a(intFunction, 1), new k(6));
    }
}
