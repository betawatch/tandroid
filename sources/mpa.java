// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mpa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ int c;

    public /* synthetic */ mpa(wsa wsaVar, int i, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.P2 = i;
                fra fraVar = wsaVar.U1;
                fraVar.E(fraVar.getCurrentPosition() + (i > wsaVar.w1() ? 1 : -1));
                break;
            case 1:
                wsaVar.P2 = i;
                fra fraVar2 = wsaVar.U1;
                fraVar2.E(fraVar2.getCurrentPosition() + (i > wsaVar.w1() ? 1 : -1));
                break;
            case 2:
                wsaVar.P2 = i;
                fra fraVar3 = wsaVar.U1;
                fraVar3.E(fraVar3.getCurrentPosition() + (i > wsaVar.w1() ? 1 : -1));
                break;
            default:
                wsaVar.P2 = i;
                fra fraVar4 = wsaVar.U1;
                fraVar4.E(fraVar4.getCurrentPosition() + (i > wsaVar.w1() ? 1 : -1));
                break;
        }
    }
}
