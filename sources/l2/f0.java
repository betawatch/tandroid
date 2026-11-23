package l2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f0 {
    public final WeakReference a;
    public final d0 b;
    public final /* synthetic */ g0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, l2.d0] */
    public f0(g0 g0Var, Context context) {
        this.c = g0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: l2.d0
            @Override // java.util.function.IntConsumer
            public final void accept(int i7) {
                g0 g0Var2 = f0.this.c;
                if (g0Var2.i0) {
                    return;
                }
                g0Var2.t1(1, 19, Integer.valueOf(i7));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r02;
        context.registerDeviceIdChangeListener(new e0(g0Var.v.a(g0Var.t, null), 0), r02);
    }

    public static void a(f0 f0Var) {
        Context context = (Context) f0Var.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(f0Var.b);
    }
}
