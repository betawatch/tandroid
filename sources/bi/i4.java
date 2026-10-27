package bi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ i4(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.k0.setLoading(false);
                break;
            default:
                this.b.k0.setLoading(false);
                break;
        }
    }
}
