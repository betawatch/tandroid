// default package

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny2 implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ny0 b;

    public /* synthetic */ ny2(ny0 ny0Var, byte b) {
        this.a = b;
        this.b = ny0Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        ny0 ny0Var = this.b;
        switch (b) {
            case 0:
                ((ry2) ny0Var).W1.addAll((List) obj2);
                break;
            default:
                ((t2a) ny0Var).f2.addAll((List) obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        byte b = this.a;
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }
}
