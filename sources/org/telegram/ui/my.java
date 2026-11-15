package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ my(hz hzVar, int i7) {
        this.a = i7;
        this.b = hzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hz.a0(this.b);
                break;
            default:
                hz.b0(this.b);
                break;
        }
    }
}
