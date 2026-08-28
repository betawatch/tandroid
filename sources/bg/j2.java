package bg;

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ j2(sa saVar, int i9) {
        this.a = i9;
        this.b = saVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((q2) this.b).g0.addAll((List) obj2);
                break;
            default:
                ((bh.j) this.b).X.addAll((List) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i9 = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
