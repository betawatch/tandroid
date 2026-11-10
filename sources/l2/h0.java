package l2;

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 {
    public final WeakReference a;
    public final f0 b;
    public final /* synthetic */ i0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, l2.f0] */
    public h0(i0 i0Var, Context context) {
        this.c = i0Var;
        this.a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: l2.f0
            @Override // java.util.function.IntConsumer
            public final void accept(int i7) {
                i0 i0Var2 = h0.this.c;
                if (i0Var2.i0) {
                    return;
                }
                i0Var2.t1(1, 19, Integer.valueOf(i7));
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
