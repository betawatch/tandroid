// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fla implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jla b;

    public /* synthetic */ fla(jla jlaVar, byte b) {
        this.a = b;
        this.b = jlaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        jla jlaVar = this.b;
        switch (b) {
            case 0:
                if (!jlaVar.M && jlaVar.L) {
                    jlaVar.o(true);
                    break;
                } else {
                    d6 d6Var = jlaVar.f0;
                    if (d6Var != null) {
                        d6Var.b(-1);
                        break;
                    }
                }
                break;
            case 1:
                if (jlaVar.s.length() != 0) {
                    jlaVar.s.setText("");
                } else if (jlaVar.C()) {
                    jlaVar.n();
                }
                jlaVar.s.requestFocus();
                hl.E3(jlaVar.s);
                break;
            default:
                if (jlaVar.s.length() == 0) {
                    if (!jlaVar.C()) {
                        jlaVar.o(true);
                        break;
                    } else {
                        jlaVar.n();
                        break;
                    }
                } else {
                    jlaVar.s.setText("");
                    break;
                }
        }
    }
}
