package bg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements nk0, lt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w2(g3 g3Var, int i9, b6 b6Var, int i10) {
        this.c = g3Var;
        this.a = i9;
        this.d = b6Var;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        g3.P((g3) this.c, this.a, (b6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.lt
    public void run(String str) {
        mt.k((mt) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ w2(mt mtVar, int i9, int i10, Runnable runnable) {
        this.c = mtVar;
        this.a = i9;
        this.b = i10;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
