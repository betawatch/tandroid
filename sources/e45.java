// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class e45 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jl7 b;

    public /* synthetic */ e45(jl7 jl7Var, byte b) {
        this.a = b;
        this.b = jl7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        jl7 jl7Var = this.b;
        switch (b) {
            case 0:
                jl7Var.dismiss();
                break;
            default:
                jl7Var.dismiss();
                break;
        }
    }
}
