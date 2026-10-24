package i2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g0 {
    public final WeakReference a;
    public final e0 b;
    public final /* synthetic */ h0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.e0, java.util.function.IntConsumer] */
    public g0(h0 h0Var, Context context) {
        this.c = h0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: i2.e0
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                h0 h0Var2 = g0.this.c;
                if (h0Var2.i0) {
                    return;
                }
                h0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r02;
        context.registerDeviceIdChangeListener(new f0(h0Var.v.a(h0Var.t, null), 0), r02);
    }

    public static void a(g0 g0Var) {
        Context context = (Context) g0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(g0Var.b);
    }
}
