package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements j$.util.function.T {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ u(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.T
    public final void accept(long j) {
        this.a.r(Long.valueOf(j));
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }
}
