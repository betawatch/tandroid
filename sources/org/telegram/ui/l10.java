package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l10 extends g.p {
    public final /* synthetic */ f40 c;

    public l10(f40 f40Var) {
        this.c = f40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int size = this.c.n4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i7 == 0 || i7 == 1) ? 3 : 6;
        }
        return 6;
    }
}
