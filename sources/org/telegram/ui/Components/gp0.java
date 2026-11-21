package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ gp0(jt0 jt0Var, int i7) {
        this.a = i7;
        this.b = jt0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 5;
        jt0 jt0Var = this.b;
        fi.i6 i6Var = (fi.i6) obj;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new fm0(i10, jt0Var, i6Var), 100L);
                break;
            default:
                int[] iArr = jt0.t2;
                org.telegram.messenger.g0.h3(new fm0(i10, jt0Var, i6Var), 100L);
                break;
        }
    }
}
