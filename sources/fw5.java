// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
