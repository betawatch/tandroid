package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;
    public final /* synthetic */ org.telegram.messenger.ya c;

    public /* synthetic */ dl(ml mlVar, org.telegram.messenger.ya yaVar, int i7) {
        this.a = i7;
        this.b = mlVar;
        this.c = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.ya yaVar = this.c;
                try {
                    ((a8.r7) yaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new dl(this.b, yaVar, 1));
                break;
            default:
                ml.S(this.b, this.c);
                break;
        }
    }
}
