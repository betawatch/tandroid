package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap b;

    public /* synthetic */ po(ap apVar, int i10) {
        this.a = i10;
        this.b = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ap apVar = this.b;
                apVar.c0 = true;
                apVar.d0();
                break;
            case 1:
                ap apVar2 = this.b;
                apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(apVar2.Z));
                apVar2.a0();
                break;
            case 2:
                this.b.c0(false);
                break;
            case 3:
                ap apVar3 = this.b;
                apVar3.c0 = true;
                if (apVar3.b.length() > 0) {
                    apVar3.Y(apVar3.b.getText().toString());
                }
                apVar3.d0();
                break;
            case 4:
                this.b.a0();
                break;
            default:
                this.b.c0(true);
                break;
        }
    }
}
