package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ cp(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = this.b;
                npVar.c0 = true;
                npVar.b0();
                break;
            case 1:
                np npVar2 = this.b;
                npVar2.X = npVar2.getMessagesController().getChat(Long.valueOf(npVar2.Z));
                npVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                np npVar3 = this.b;
                npVar3.c0 = true;
                if (npVar3.a.length() > 0) {
                    npVar3.W(npVar3.a.getText().toString());
                }
                npVar3.b0();
                break;
            case 4:
                this.b.Y();
                break;
            default:
                this.b.a0(true);
                break;
        }
    }
}
