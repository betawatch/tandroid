package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n91 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ n91(y91 y91Var, int i7) {
        this.a = i7;
        this.b = y91Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y91 y91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (y91Var = this.b).g1) != null) {
                    gVar.f(i7, i10);
                    y91Var.B0();
                    break;
                }
                break;
        }
    }
}
