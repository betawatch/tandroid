package kg;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bi.o2;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ o2 e;
    public final /* synthetic */ w10 f;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] g;
    public final /* synthetic */ View h;

    public p1(z0 z0Var, int i7, v1 v1Var, TextView textView, o2 o2Var, w10 w10Var, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.a = z0Var;
        this.b = i7;
        this.c = v1Var;
        this.d = textView;
        this.e = o2Var;
        this.f = w10Var;
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
        w1 f10 = w1.f(this.b);
        v1 v1Var = this.c;
        int i10 = v1Var == null ? -1 : v1Var.a;
        v1 d = f10.d(obj);
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
        if (t1VarArr[0] == t1.f) {
            t1.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
