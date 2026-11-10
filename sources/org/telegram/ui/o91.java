package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o91 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z91 b;

    public /* synthetic */ o91(z91 z91Var, int i7) {
        this.a = i7;
        this.b = z91Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        z91 z91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (z91Var = this.b).g1) != null) {
                    gVar.f(i7, i10);
                    z91Var.B0();
                    break;
                }
                break;
        }
    }
}
