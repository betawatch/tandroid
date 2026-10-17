package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v81 implements xl0, yl0 {
    public final /* synthetic */ b91 a;

    public /* synthetic */ v81(b91 b91Var) {
        this.a = b91Var;
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
        return ((Boolean) callback2Return.run(Integer.valueOf(((z81) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        b91 b91Var = this.a;
        a91 a91Var = b91Var.y;
        if (a91Var != null) {
            c91 c91Var = (c91) ((l2.f) a91Var).b;
            if (c91Var.x || c91Var.H) {
                return;
            }
        }
        z81 z81Var = (z81) view;
        if (i10 != b91Var.F || a91Var == null) {
            Utilities.Callback2Return callback2Return = b91Var.l0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(z81Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                b91Var.d(z81Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
