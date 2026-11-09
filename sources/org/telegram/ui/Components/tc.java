package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tc(uc ucVar, boolean z9, int i7) {
        this.a = i7;
        this.b = ucVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z9 = this.c;
                uc ucVar = this.b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    break;
                } else {
                    ucVar.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                uc ucVar2 = this.b;
                if (!z10) {
                    ucVar2.U0.setVisibility(8);
                    break;
                } else {
                    ucVar2.getClass();
                    break;
                }
        }
    }
}
