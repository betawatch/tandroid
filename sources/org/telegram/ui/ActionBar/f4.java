package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.on0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public f4(on0 on0Var, on0 on0Var2, on0 on0Var3) {
        this.a = 1;
        this.b = on0Var;
        this.c = on0Var2;
        this.d = on0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                s4 s4Var = (s4) this.d;
                q4 q4Var = s4Var.b;
                if (q4Var.f() && !rect.equals(rect2)) {
                    s4Var.h = true;
                    if (q4Var.f()) {
                        s4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((on0) this.b).setProgress(org.telegram.ui.g5.j1);
                ((on0) this.c).setProgress(org.telegram.ui.g5.k1);
                ((on0) this.d).setProgress(org.telegram.ui.g5.l1);
                break;
        }
    }

    public f4(s4 s4Var) {
        this.a = 0;
        this.d = s4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
