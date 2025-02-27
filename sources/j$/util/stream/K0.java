package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class K0 extends L0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(int i, Spliterator spliterator, b bVar) {
        super(bVar, spliterator, new l(9), new k(1));
        switch (i) {
            case 1:
                super(bVar, spliterator, new l(10), new k(2));
                break;
            case 2:
                super(bVar, spliterator, new l(11), new k(3));
                break;
            default:
                break;
        }
    }

    K0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        super(bVar, spliterator, new a(intFunction, 1), new k(4));
    }
}
