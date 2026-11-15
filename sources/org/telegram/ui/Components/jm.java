package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ jm(jn jnVar, int i7, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.c) obj);
                break;
            default:
                jn jnVar = this.b;
                jnVar.getClass();
                jnVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
