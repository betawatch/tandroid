package hg;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ z1(sa saVar, int i10) {
        this.a = i10;
        this.b = saVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((f2) this.b).h0.addAll((List) obj2);
                break;
            default:
                ((hh.f) this.b).Y.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
