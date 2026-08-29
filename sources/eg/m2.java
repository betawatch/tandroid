package eg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements al0, rt {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m2(w2 w2Var, int i10, c6 c6Var, int i11) {
        this.c = w2Var;
        this.a = i10;
        this.d = c6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        w2.Q((w2) this.c, this.a, (c6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rt
    public void run(String str) {
        st.k((st) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ m2(st stVar, int i10, int i11, Runnable runnable) {
        this.c = stVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
