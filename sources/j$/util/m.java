package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements j$.util.function.m {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ m(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.m
    public final void accept(double d) {
        this.a.r(Double.valueOf(d));
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }
}
