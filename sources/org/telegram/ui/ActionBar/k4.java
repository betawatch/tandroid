package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.view.View;
import org.telegram.ui.Components.dp0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k4 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public k4(dp0 dp0Var, dp0 dp0Var2, dp0 dp0Var3) {
        this.a = 1;
        this.b = dp0Var;
        this.c = dp0Var2;
        this.d = dp0Var3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.b;
                rect.set(i10, i11, i12, i13);
                Rect rect2 = (Rect) this.c;
                rect2.set(i14, i15, i16, i17);
                x4 x4Var = (x4) this.d;
                v4 v4Var = x4Var.b;
                if (v4Var.f() && !rect.equals(rect2)) {
                    x4Var.h = true;
                    if (v4Var.f()) {
                        x4Var.c();
                        break;
                    }
                }
                break;
            default:
                ((dp0) this.b).setProgress(org.telegram.ui.n5.c);
                ((dp0) this.c).setProgress(org.telegram.ui.n5.d);
                ((dp0) this.d).setProgress(org.telegram.ui.n5.e);
                break;
        }
    }

    public k4(x4 x4Var) {
        this.a = 0;
        this.d = x4Var;
        this.b = new Rect();
        this.c = new Rect();
    }
}
