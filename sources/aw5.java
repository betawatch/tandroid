// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class aw5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ aw5(byte b, Object obj, boolean z) {
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
                ew5 ew5Var = (ew5) obj;
                ew5.E0(ew5Var.getContext(), ew5Var.n1, ew5Var.s1, z);
                break;
            case 1:
                ew5 ew5Var2 = (ew5) obj;
                ew5.E0(ew5Var2.getContext(), ew5Var2.n1, ew5Var2.s1, z);
                break;
            default:
                v9b v9bVar = (v9b) obj;
                v9bVar.A2 = false;
                v9bVar.Y0.x(7, true);
                if (z) {
                    v9bVar.o(true);
                    break;
                }
                break;
        }
    }
}
