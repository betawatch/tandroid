package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ bp(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                mpVar.c0 = true;
                mpVar.b0();
                break;
            case 1:
                mp mpVar2 = this.b;
                mpVar2.X = mpVar2.getMessagesController().getChat(Long.valueOf(mpVar2.Z));
                mpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                mp mpVar3 = this.b;
                mpVar3.c0 = true;
                if (mpVar3.a.length() > 0) {
                    mpVar3.W(mpVar3.a.getText().toString());
                }
                mpVar3.b0();
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
