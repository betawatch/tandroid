package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;
    public final /* synthetic */ org.telegram.messenger.ya c;

    public /* synthetic */ uk(dl dlVar, org.telegram.messenger.ya yaVar, int i7) {
        this.a = i7;
        this.b = dlVar;
        this.c = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.ya yaVar = this.c;
                try {
                    ((a8.r7) yaVar).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new uk(this.b, yaVar, 1));
                break;
            default:
                dl.S(this.b, this.c);
                break;
        }
    }
}
