// default package

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ip4 extends ane implements shc, i36, vt9, oq4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final lq4 d;
    public final /* synthetic */ jp4 e;

    public ip4(jp4 jp4Var) {
        this.e = jp4Var;
        Handler handler = new Handler();
        this.a = jp4Var;
        this.b = jp4Var;
        this.c = handler;
        this.d = new lq4();
    }

    @Override // ane
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // ane
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // shc
    public final rhc f() {
        return this.e.f();
    }

    @Override // vt9
    public final po g() {
        return (po) this.e.e.d;
    }

    @Override // i36
    public final k36 m() {
        return this.e.L;
    }

    @Override // oq4
    public final void a() {
    }
}
