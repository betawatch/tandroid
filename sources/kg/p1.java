package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.i2;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ i2 e;
    public final /* synthetic */ x10 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] g;
    public final /* synthetic */ View h;

    public p1(a1 a1Var, int i7, v1 v1Var, TextView textView, i2 i2Var, x10 x10Var, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.a = a1Var;
        this.b = i7;
        this.c = v1Var;
        this.d = textView;
        this.e = i2Var;
        this.f = x10Var;
        this.g = u1VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        a1 a1Var = this.a;
        String obj = a1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.D3(a1Var);
            return true;
        }
        w1 f10 = w1.f(this.b);
        v1 v1Var = this.c;
        int i10 = v1Var == null ? -1 : v1Var.a;
        v1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            org.telegram.messenger.g0.D3(a1Var);
            this.d.setText(gd.M0(2131752651, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.g;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == t1.f) {
            t1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
