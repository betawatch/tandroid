package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p81 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q91 b;

    public /* synthetic */ p81(q91 q91Var, int i10) {
        this.a = i10;
        this.b = q91Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        q91 q91Var;
        jg.e eVar2;
        q91 q91Var2;
        jg.e eVar3;
        switch (this.a) {
            case 0:
                q91 q91Var3 = this.b;
                if (q91Var3.n0.size() != q91Var3.o0.size() && !q91Var3.s0 && q91Var3.Q.N0() > q91Var3.T.Y - 20) {
                    q91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = q91Var3.y0) != null) {
                    eVar.f(i10, i11);
                    q91.W(q91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (q91Var = this.b).y0) != null) {
                    eVar2.f(i10, i11);
                    q91.W(q91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (q91Var2 = this.b).y0) != null) {
                    eVar3.f(i10, i11);
                    q91.W(q91Var2);
                    break;
                }
                break;
        }
    }
}
