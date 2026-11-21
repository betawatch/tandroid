package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class hm implements org.telegram.messenger.ap {
    public final /* synthetic */ hi a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ mm c;

    public hm(mm mmVar, hi hiVar, bn bnVar) {
        this.c = mmVar;
        this.a = hiVar;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.ap
    public final void a() {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }

    @Override // org.telegram.messenger.ap
    public final void f(boolean z10) {
        this.a.c(false);
        this.c.a.presentFragment(this.b);
    }
}
