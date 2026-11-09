package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import di.s2;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ s2 e;
    public final /* synthetic */ c20 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] g;
    public final /* synthetic */ View h;

    public m1(x0 x0Var, int i7, s1 s1Var, TextView textView, s2 s2Var, c20 c20Var, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.a = x0Var;
        this.b = i7;
        this.c = s1Var;
        this.d = textView;
        this.e = s2Var;
        this.f = c20Var;
        this.g = u1VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        x0 x0Var = this.a;
        String obj = x0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.F3(x0Var);
            return true;
        }
        t1 f10 = t1.f(this.b);
        s1 s1Var = this.c;
        int i10 = s1Var == null ? -1 : s1Var.a;
        s1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            org.telegram.messenger.g0.F3(x0Var);
            this.d.setText(id.M0(2131752662, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.g;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == q1.f) {
            q1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
