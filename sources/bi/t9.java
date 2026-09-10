package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;

    public /* synthetic */ t9(aa aaVar, int i10) {
        this.a = i10;
        this.b = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aa.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                aa aaVar = this.b;
                org.telegram.ui.Cells.i3 i3Var = aaVar.Y;
                if (aaVar.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
