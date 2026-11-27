// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dv3 implements DialogInterface.OnShowListener {
    public final /* synthetic */ iv3 a;

    public dv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        iv3 iv3Var = this.a;
        hyc hycVar = iv3Var.m1;
        if (iv3Var.I0() && hycVar.f()) {
            hycVar.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 2));
        }
    }
}
