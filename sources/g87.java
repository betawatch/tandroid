// default package

import java.util.function.IntFunction;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
