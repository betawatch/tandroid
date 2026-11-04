package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ nn(bo boVar, int i3) {
        this.a = i3;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                boVar.d0 = true;
                boVar.h0();
                break;
            case 1:
                bo boVar2 = this.b;
                boVar2.Y = boVar2.getMessagesController().M0(Long.valueOf(boVar2.a0));
                boVar2.e0();
                break;
            case 2:
                this.b.g0(false);
                break;
            case 3:
                bo boVar3 = this.b;
                boVar3.d0 = true;
                if (boVar3.b.length() > 0) {
                    boVar3.c0(boVar3.b.getText().toString());
                }
                boVar3.h0();
                break;
            case 4:
                this.b.e0();
                break;
            default:
                this.b.g0(true);
                break;
        }
    }
}
