package i2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i0 {
    public final WeakReference a;
    public final g0 b;
    public final /* synthetic */ j0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.g0, java.util.function.IntConsumer] */
    public i0(j0 j0Var, Context context) {
        this.c = j0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: i2.g0
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                j0 j0Var2 = i0.this.c;
                if (j0Var2.i0) {
                    return;
                }
                j0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r02;
        context.registerDeviceIdChangeListener(new h0(j0Var.v.a(j0Var.t, null), 0), r02);
    }

    public static void a(i0 i0Var) {
        Context context = (Context) i0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(i0Var.b);
    }
}
