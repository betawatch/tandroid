package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ r4(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.w0(false);
                break;
            default:
                this.b.w0(false);
                break;
        }
    }
}
