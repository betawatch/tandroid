package j$.util.stream;

import j$.util.function.BiConsumer;
/* renamed from: j$.util.stream.x0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0181x0 implements BiConsumer {
    public static final /* synthetic */ C0181x0 a = new C0181x0();

    private /* synthetic */ C0181x0() {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer b(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new j$.util.concurrent.a(this, biConsumer);
    }
}
