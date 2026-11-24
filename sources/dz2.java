// default package

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dz2 implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mz0 b;

    public /* synthetic */ dz2(mz0 mz0Var, byte b) {
        this.a = b;
        this.b = mz0Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        mz0 mz0Var = this.b;
        switch (b) {
            case 0:
                ((hz2) mz0Var).W1.addAll((List) obj2);
                break;
            default:
                ((b1a) mz0Var).f2.addAll((List) obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
