package fi;

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ e1 a;

    public d1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i7, boolean z10) {
        e1 e1Var = this.a;
        boolean m10 = e1Var.m();
        e1Var.E = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != e1Var.m()) {
            org.telegram.messenger.g0.h3(new c1(this, 0));
        }
    }
}
