// default package

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f86 extends x2c implements ListIterator {
    public final /* synthetic */ byte b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f86(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator);
        this.b = b;
        this.c = abstractList;
    }

    @Override // x2c
    public final Object a(Object obj) {
        byte b = this.b;
        AbstractList abstractList = this.c;
        switch (b) {
            case 0:
                return ((g86) abstractList).b.apply(obj);
            default:
                return ((h86) abstractList).b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
