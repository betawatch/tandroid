package fi;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
