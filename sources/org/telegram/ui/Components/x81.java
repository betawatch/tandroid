package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements yl0, zl0 {
    public final /* synthetic */ d91 a;

    public /* synthetic */ x81(d91 d91Var) {
        this.a = d91Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((b91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.yl0
    public void d(float f7, float f10, int i10, View view) {
        d91 d91Var = this.a;
        c91 c91Var = d91Var.y;
        if (c91Var != null) {
            e91 e91Var = (e91) ((l2.f) c91Var).b;
            if (e91Var.x || e91Var.H) {
                return;
            }
        }
        b91 b91Var = (b91) view;
        if (i10 != d91Var.F || c91Var == null) {
            Utilities.Callback2Return callback2Return = d91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(b91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                d91Var.d(b91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
