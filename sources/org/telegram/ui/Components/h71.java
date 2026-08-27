package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h71 implements qk0, rk0 {
    public final /* synthetic */ o71 a;

    public /* synthetic */ h71(o71 o71Var) {
        this.a = o71Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        Utilities.Callback2Return callback2Return = this.a.b;
        if (callback2Return == null) {
            return false;
        }
        return ((Boolean) callback2Return.run(Integer.valueOf(((m71) view).a.a), view)).booleanValue();
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        o71 o71Var = this.a;
        n71 n71Var = o71Var.y;
        if (n71Var != null) {
            p71 p71Var = (p71) ((m5.o) n71Var).b;
            if (p71Var.x || p71Var.D) {
                return;
            }
        }
        m71 m71Var = (m71) view;
        if (i10 != o71Var.B || n71Var == null) {
            Utilities.Callback2Return callback2Return = o71Var.h0;
            if (callback2Return == null || !((Boolean) callback2Return.run(Integer.valueOf(m71Var.a.a), Integer.valueOf(i10))).booleanValue()) {
                o71Var.d(m71Var.a.a, i10);
            }
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
