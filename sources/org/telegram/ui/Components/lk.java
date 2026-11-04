package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk b;
    public final /* synthetic */ org.telegram.messenger.sa c;

    public /* synthetic */ lk(uk ukVar, org.telegram.messenger.sa saVar, int i3) {
        this.a = i3;
        this.b = ukVar;
        this.c = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.sa saVar = this.c;
                try {
                    ((b8.ke) saVar).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new lk(this.b, saVar, 1));
                break;
            default:
                uk.R(this.b, this.c);
                break;
        }
    }
}
