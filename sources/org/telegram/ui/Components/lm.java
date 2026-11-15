package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;
    public final /* synthetic */ int c;

    public /* synthetic */ lm(jn jnVar, int i7, int i10) {
        this.a = i10;
        this.b = jnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, null);
                break;
            case 1:
                this.b.g0(this.c);
                break;
            default:
                this.b.j0(this.c, null);
                break;
        }
    }
}
