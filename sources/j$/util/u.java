package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements j$.util.function.Y {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ u(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.Y
    public final void accept(long j) {
        this.a.r(Long.valueOf(j));
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }
}
