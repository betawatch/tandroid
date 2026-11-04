package lg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ y0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ ai.v1 e;
    public final /* synthetic */ u10 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] g;
    public final /* synthetic */ View h;

    public n1(y0 y0Var, int i3, t1 t1Var, TextView textView, ai.v1 v1Var, u10 u10Var, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.a = y0Var;
        this.b = i3;
        this.c = t1Var;
        this.d = textView;
        this.e = v1Var;
        this.f = u10Var;
        this.g = s1VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        if (i3 != 6) {
            return false;
        }
        y0 y0Var = this.a;
        String obj = y0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.F3(y0Var);
            return true;
        }
        u1 f10 = u1.f(this.b);
        t1 t1Var = this.c;
        int i10 = t1Var == null ? -1 : t1Var.a;
        t1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            org.telegram.messenger.g0.F3(y0Var);
            this.d.setText(bd.M0(2131752662, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.g;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
        }
        if (s1VarArr[0] == r1.f) {
            r1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
