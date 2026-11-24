// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mna implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ int c;

    public /* synthetic */ mna(vqa vqaVar, int i, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.P2 = i;
                fpa fpaVar = vqaVar.U1;
                fpaVar.E(fpaVar.getCurrentPosition() + (i > vqaVar.w1() ? 1 : -1));
                break;
            case 1:
                vqaVar.P2 = i;
                fpa fpaVar2 = vqaVar.U1;
                fpaVar2.E(fpaVar2.getCurrentPosition() + (i > vqaVar.w1() ? 1 : -1));
                break;
            case 2:
                vqaVar.P2 = i;
                fpa fpaVar3 = vqaVar.U1;
                fpaVar3.E(fpaVar3.getCurrentPosition() + (i > vqaVar.w1() ? 1 : -1));
                break;
            default:
                vqaVar.P2 = i;
                fpa fpaVar4 = vqaVar.U1;
                fpaVar4.E(fpaVar4.getCurrentPosition() + (i > vqaVar.w1() ? 1 : -1));
                break;
        }
    }
}
