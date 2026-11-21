package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.m2;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ m2 e;
    public final /* synthetic */ x10 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] g;
    public final /* synthetic */ View h;

    public o1(z0 z0Var, int i7, u1 u1Var, TextView textView, m2 m2Var, x10 x10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.a = z0Var;
        this.b = i7;
        this.c = u1Var;
        this.d = textView;
        this.e = m2Var;
        this.f = x10Var;
        this.g = t1VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        z0 z0Var = this.a;
        String obj = z0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.D3(z0Var);
            return true;
        }
        v1 f10 = v1.f(this.b);
        u1 u1Var = this.c;
        int i10 = u1Var == null ? -1 : u1Var.a;
        u1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            org.telegram.messenger.g0.D3(z0Var);
            this.d.setText(gd.N0(2131752650, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.g;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == s1.f) {
            s1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
