// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
