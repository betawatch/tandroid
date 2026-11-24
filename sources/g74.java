// default package

import android.content.Context;
import j$.util.function.IntConsumer$-CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g74 {
    public final WeakReference a;
    public final f74 b;
    public final /* synthetic */ h74 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [f74, java.util.function.IntConsumer] */
    public g74(h74 h74Var, Context context) {
        this.c = h74Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: f74
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                h74 h74Var2 = g74.this.c;
                if (h74Var2.i0) {
                    return;
                }
                h74Var2.m1(1, 19, Integer.valueOf(i));
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$-CC.$default$andThen(this, intConsumer);
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new rf2(h74Var.v.a(h74Var.t, null), (byte) 1), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
