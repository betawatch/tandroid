// default package

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dn4 extends iie implements tdc, e16, dq9, ko4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final ho4 d;
    public final /* synthetic */ en4 e;

    public dn4(en4 en4Var) {
        this.e = en4Var;
        Handler handler = new Handler();
        this.a = en4Var;
        this.b = en4Var;
        this.c = handler;
        this.d = new ho4();
    }

    @Override // iie
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // iie
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // tdc
    public final sdc f() {
        return this.e.f();
    }

    @Override // dq9
    public final oo g() {
        return (oo) this.e.e.d;
    }

    @Override // e16
    public final g16 m() {
        return this.e.L;
    }

    @Override // ko4
    public final void a() {
    }
}
