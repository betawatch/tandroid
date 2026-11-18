package di;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ n3(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
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
