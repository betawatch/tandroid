package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ ap(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lp lpVar = this.b;
                lpVar.c0 = true;
                lpVar.b0();
                break;
            case 1:
                lp lpVar2 = this.b;
                lpVar2.X = lpVar2.getMessagesController().getChat(Long.valueOf(lpVar2.Z));
                lpVar2.Y();
                break;
            case 2:
                this.b.a0(false);
                break;
            case 3:
                lp lpVar3 = this.b;
                lpVar3.c0 = true;
                if (lpVar3.a.length() > 0) {
                    lpVar3.W(lpVar3.a.getText().toString());
                }
                lpVar3.b0();
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
