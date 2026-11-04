package ci;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ t3(l6 l6Var, int i3) {
        this.a = i3;
        this.b = l6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.d2.setLoading(false);
                break;
            default:
                this.b.d2.setLoading(false);
                break;
        }
    }
}
