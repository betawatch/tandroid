// default package

import j$.util.function.BiConsumer$-CC;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
