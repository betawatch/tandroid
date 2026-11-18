package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
