package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l91 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;

    public /* synthetic */ l91(w91 w91Var, int i7) {
        this.a = i7;
        this.b = w91Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        w91 w91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (w91Var = this.b).i1) != null) {
                    gVar.f(i7, i10);
                    w91Var.B0();
                    break;
                }
                break;
        }
    }
}
