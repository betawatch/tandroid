// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
