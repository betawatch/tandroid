package j$.util.stream;

import j$.util.function.Predicate;
/* renamed from: j$.util.stream.f1 */
/* loaded from: classes2.dex */
class C0081f1 extends AbstractC0105j1 {
    final /* synthetic */ EnumC0111k1 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081f1(EnumC0111k1 enumC0111k1, Predicate predicate) {
        super(enumC0111k1);
        this.c = enumC0111k1;
        this.d = predicate;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.a) {
            boolean test = this.d.test(obj);
            z = this.c.a;
            if (test != z) {
                return;
            }
            this.a = true;
            z2 = this.c.b;
            this.b = z2;
        }
    }
}
