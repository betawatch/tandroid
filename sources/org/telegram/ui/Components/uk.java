package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
