package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements xl0, yl0 {
    public final /* synthetic */ c91 a;

    public /* synthetic */ w81(c91 c91Var) {
        this.a = c91Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((a91) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        c91 c91Var = this.a;
        b91 b91Var = c91Var.y;
        if (b91Var != null) {
            d91 d91Var = (d91) ((l2.f) b91Var).b;
            if (d91Var.x || d91Var.H) {
                return;
            }
        }
        a91 a91Var = (a91) view;
        if (i10 != c91Var.F || b91Var == null) {
            Utilities.Callback2Return callback2Return = c91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(a91Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                c91Var.d(a91Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
