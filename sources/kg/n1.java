package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ u1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ bi.o1 e;
    public final /* synthetic */ z10 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] g;
    public final /* synthetic */ View h;

    public n1(x0 x0Var, int i7, u1 u1Var, TextView textView, bi.o1 o1Var, z10 z10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.a = x0Var;
        this.b = i7;
        this.c = u1Var;
        this.d = textView;
        this.e = o1Var;
        this.f = z10Var;
        this.g = t1VarArr;
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
            org.telegram.messenger.g0.E3(x0Var);
            return true;
        }
        v1 f10 = v1.f(this.b);
        u1 u1Var = this.c;
        int i10 = u1Var == null ? -1 : u1Var.a;
        u1 d = f10.d(obj);
        if (d != null && d.a != i10) {
            org.telegram.messenger.g0.E3(x0Var);
            this.d.setText(hd.M0(2131752662, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.g;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == r1.f) {
            r1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
