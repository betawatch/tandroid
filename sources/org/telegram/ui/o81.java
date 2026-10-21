package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class o81 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p91 b;

    public /* synthetic */ o81(p91 p91Var, int i10) {
        this.a = i10;
        this.b = p91Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        p91 p91Var;
        bh.f fVar2;
        p91 p91Var2;
        bh.f fVar3;
        switch (this.a) {
            case 0:
                p91 p91Var3 = this.b;
                if (p91Var3.r0.size() != p91Var3.s0.size() && !p91Var3.w0 && p91Var3.U.N0() > p91Var3.X.c0 - 20) {
                    p91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = p91Var3.C0) != null) {
                    fVar.f(i10, i11);
                    p91.W(p91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (p91Var = this.b).C0) != null) {
                    fVar2.f(i10, i11);
                    p91.W(p91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (p91Var2 = this.b).C0) != null) {
                    fVar3.f(i10, i11);
                    p91.W(p91Var2);
                    break;
                }
                break;
        }
    }
}
