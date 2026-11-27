// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class og6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg6 b;

    public /* synthetic */ og6(tg6 tg6Var, byte b) {
        this.a = b;
        this.b = tg6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        tg6 tg6Var = this.b;
        switch (b) {
            case 0:
                tg6Var.v0.finishFragment();
                break;
            default:
                tg6Var.v0.finishFragment();
                break;
        }
    }
}
