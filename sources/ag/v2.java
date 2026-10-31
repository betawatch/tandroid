package ag;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h3 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ m2 e;
    public final /* synthetic */ q20 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1[] g;
    public final /* synthetic */ View h;

    public v2(a2 a2Var, int i10, h3 h3Var, TextView textView, m2 m2Var, q20 q20Var, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.a = a2Var;
        this.b = i10;
        this.c = h3Var;
        this.d = textView;
        this.e = m2Var;
        this.f = q20Var;
        this.g = x1VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.a;
        String obj = a2Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.i0.E3(a2Var);
            return true;
        }
        i3 f7 = i3.f(this.b);
        h3 h3Var = this.c;
        int i11 = h3Var == null ? -1 : h3Var.a;
        h3 d = f7.d(obj);
        if (d != null && d.a != i11) {
            org.telegram.messenger.i0.E3(a2Var);
            this.d.setText(cd.L0(2131752662, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.g;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == z2.f) {
            z2.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
