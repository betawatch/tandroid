// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bu5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bu5(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                fu5 fu5Var = (fu5) obj;
                fu5.E0(fu5Var.getContext(), fu5Var.n1, fu5Var.s1, z);
                break;
            case 1:
                fu5 fu5Var2 = (fu5) obj;
                fu5.E0(fu5Var2.getContext(), fu5Var2.n1, fu5Var2.s1, z);
                break;
            default:
                t7b t7bVar = (t7b) obj;
                t7bVar.A2 = false;
                t7bVar.Y0.x(7, true);
                if (z) {
                    t7bVar.o(true);
                    break;
                }
                break;
        }
    }
}
