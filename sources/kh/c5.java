package kh;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ c5(g6 g6Var, int i9) {
        this.a = i9;
        this.b = g6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.z0(false);
                break;
            default:
                this.b.z0(false);
                break;
        }
    }
}
