// default package

import android.view.Menu;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dib implements zw5, yw5 {
    public final /* synthetic */ dt3 a;
    public final /* synthetic */ Menu b;

    public /* synthetic */ dib(dt3 dt3Var, Menu menu) {
        this.a = dt3Var;
        this.b = menu;
    }

    @Override // zw5
    public final void a(String str) {
        dt3 dt3Var = this.a;
        dt3Var.b = str;
        dt3Var.b(this.b);
    }

    @Override // yw5
    public final void n(Exception exc) {
        fa4.d("mlkit: failed to detect language in selection");
        fa4.g(exc, true);
        dt3 dt3Var = this.a;
        dt3Var.b = null;
        dt3Var.b(this.b);
    }
}
