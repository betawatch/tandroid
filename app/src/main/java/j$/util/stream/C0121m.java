package j$.util.stream;

import j$.util.function.BiConsumer;
import java.util.LinkedHashSet;
/* renamed from: j$.util.stream.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0121m implements BiConsumer {
    public static final /* synthetic */ C0121m a = new C0121m();

    private /* synthetic */ C0121m() {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }

    @Override // j$.util.function.BiConsumer
    public BiConsumer b(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new j$.util.concurrent.a(this, biConsumer);
    }
}
