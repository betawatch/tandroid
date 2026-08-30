package gg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vt;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements jl0, ut {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l2(v2 v2Var, int i10, f6 f6Var, int i11) {
        this.c = v2Var;
        this.a = i10;
        this.d = f6Var;
        this.b = i11;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        v2.Q((v2) this.c, this.a, (f6) this.d, this.b, view);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean e1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ut
    public void run(String str) {
        vt.k((vt) this.c, this.a, this.b, (Runnable) this.d, str);
    }

    public /* synthetic */ l2(vt vtVar, int i10, int i11, Runnable runnable) {
        this.c = vtVar;
        this.a = i10;
        this.b = i11;
        this.d = runnable;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void o0(View view, float f10, float f11) {
    }
}
