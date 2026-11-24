// default package

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fp4 extends jke implements ufc, e36, es9, lq4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final iq4 d;
    public final /* synthetic */ gp4 e;

    public fp4(gp4 gp4Var) {
        this.e = gp4Var;
        Handler handler = new Handler();
        this.a = gp4Var;
        this.b = gp4Var;
        this.c = handler;
        this.d = new iq4();
    }

    @Override // jke
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override // jke
    public final boolean c() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // ufc
    public final tfc f() {
        return this.e.f();
    }

    @Override // es9
    public final op g() {
        return (op) this.e.e.d;
    }

    @Override // e36
    public final g36 m() {
        return this.e.L;
    }

    @Override // lq4
    public final void a() {
    }
}
