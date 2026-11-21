package fi;

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ c1 a;

    public b1(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i7, boolean z10) {
        c1 c1Var = this.a;
        boolean m10 = c1Var.m();
        c1Var.E = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != c1Var.m()) {
            org.telegram.messenger.g0.g3(new f2.a(this, 4));
        }
    }
}
