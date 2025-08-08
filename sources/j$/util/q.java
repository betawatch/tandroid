package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements j$.util.function.G {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ q(Consumer consumer) {
        this.a = consumer;
    }

    @Override // j$.util.function.G
    public final void accept(int i) {
        this.a.r(Integer.valueOf(i));
    }

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }
}
