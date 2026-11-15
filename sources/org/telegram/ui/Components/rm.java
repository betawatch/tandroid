package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rm extends org.telegram.ui.mq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jn c;

    public rm(jn jnVar, int i7) {
        this.c = jnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        return false;
    }
}
