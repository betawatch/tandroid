package l2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e0 {
    public final WeakReference a;
    public final c0 b;
    public final /* synthetic */ f0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, l2.c0] */
    public e0(f0 f0Var, Context context) {
        this.c = f0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: l2.c0
            @Override // java.util.function.IntConsumer
            public final void accept(int i7) {
                f0 f0Var2 = e0.this.c;
                if (f0Var2.i0) {
                    return;
                }
                f0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r02;
        context.registerDeviceIdChangeListener(new d0(f0Var.v.a(f0Var.t, null), 0), r02);
    }

    public static void a(e0 e0Var) {
        Context context = (Context) e0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(e0Var.b);
    }
}
