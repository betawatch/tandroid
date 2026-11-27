// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fw5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fw5(jw5 jw5Var, boolean z, byte b) {
        this.a = b;
        this.b = jw5Var;
        this.c = z;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = this.c;
        jw5 jw5Var = this.b;
        switch (b) {
            case 0:
                jw5.F0(jw5Var.getContext(), jw5Var.n1, jw5Var.s1, z);
                break;
            default:
                jw5.F0(jw5Var.getContext(), jw5Var.n1, jw5Var.s1, z);
                break;
        }
    }
}
