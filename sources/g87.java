// default package

import java.util.function.IntFunction;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class g87 implements IntFunction {
    public final /* synthetic */ byte a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new int[i][];
            default:
                return String.valueOf(i);
        }
    }
}
