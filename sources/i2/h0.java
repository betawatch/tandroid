package i2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class h0 {
    public final WeakReference a;
    public final f0 b;
    public final /* synthetic */ i0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.f0, java.util.function.IntConsumer] */
    public h0(i0 i0Var, Context context) {
        this.c = i0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: i2.f0
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                i0 i0Var2 = h0.this.c;
                if (i0Var2.i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i10));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r02;
        context.registerDeviceIdChangeListener(new g0(i0Var.v.a(i0Var.t, null), 0), r02);
    }

    public static void a(h0 h0Var) {
        Context context = (Context) h0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(h0Var.b);
    }
}
