// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hx8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ p32 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ nx8 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ au0 e;
    public final /* synthetic */ p8c f;
    public final /* synthetic */ hd[] g;
    public final /* synthetic */ View h;

    public hx8(p32 p32Var, int i, nx8 nx8Var, TextView textView, au0 au0Var, p8c p8cVar, hd[] hdVarArr, View view) {
        this.a = p32Var;
        this.b = i;
        this.c = nx8Var;
        this.d = textView;
        this.e = au0Var;
        this.f = p8cVar;
        this.g = hdVarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        p32 p32Var = this.a;
        String obj = p32Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            gl.A3(p32Var);
            return true;
        }
        ox8 f = ox8.f(this.b);
        nx8 nx8Var = this.c;
        int i2 = nx8Var == null ? -1 : nx8Var.a;
        nx8 d = f.d(obj);
        if (d != null && d.a != i2) {
            gl.A3(p32Var);
            this.d.setText(k96.M0(2131752650, null));
            this.e.a(Boolean.TRUE);
            return true;
        }
        this.f.a(obj);
        hd[] hdVarArr = this.g;
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            hdVar.dismiss();
        }
        if (hdVarArr[0] == kx8.f) {
            kx8.f = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
