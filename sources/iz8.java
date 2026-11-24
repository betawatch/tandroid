// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iz8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a52 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ oz8 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ jv0 e;
    public final /* synthetic */ qac f;
    public final /* synthetic */ he[] g;
    public final /* synthetic */ View h;

    public iz8(a52 a52Var, int i, oz8 oz8Var, TextView textView, jv0 jv0Var, qac qacVar, he[] heVarArr, View view) {
        this.a = a52Var;
        this.b = i;
        this.c = oz8Var;
        this.d = textView;
        this.e = jv0Var;
        this.f = qacVar;
        this.g = heVarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        a52 a52Var = this.a;
        String obj = a52Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            gm.z3(a52Var);
            return true;
        }
        pz8 f = pz8.f(this.b);
        oz8 oz8Var = this.c;
        int i2 = oz8Var == null ? -1 : oz8Var.a;
        oz8 d = f.d(obj);
        if (d != null && d.a != i2) {
            gm.z3(a52Var);
            this.d.setText(jb6.M0(2131752615, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        he[] heVarArr = this.g;
        he heVar = heVarArr[0];
        if (heVar != null) {
            heVar.dismiss();
        }
        if (heVarArr[0] == lz8.f) {
            lz8.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
