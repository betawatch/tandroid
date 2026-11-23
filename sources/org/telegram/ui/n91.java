package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n91 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ n91(y91 y91Var, int i7) {
        this.a = i7;
        this.b = y91Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        y91 y91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (y91Var = this.b).i1) != null) {
                    gVar.f(i7, i10);
                    y91Var.B0();
                    break;
                }
                break;
        }
    }
}
