package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ k3(c6 c6Var, int i7) {
        this.a = i7;
        this.b = c6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.g2.setLoading(false);
                break;
            default:
                this.b.g2.setLoading(false);
                break;
        }
    }
}
