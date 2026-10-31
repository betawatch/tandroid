package lh;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import mg.v1;
import org.telegram.ui.Components.ha;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha b;

    public /* synthetic */ c(ha haVar, int i10) {
        this.a = i10;
        this.b = haVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((g) this.b).T1.addAll((List) obj2);
                break;
            default:
                ((v1) this.b).c2.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
