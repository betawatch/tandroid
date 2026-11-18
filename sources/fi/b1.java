package fi;

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
