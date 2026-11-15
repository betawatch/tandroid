package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j91 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;

    public /* synthetic */ j91(u91 u91Var, int i7) {
        this.a = i7;
        this.b = u91Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        u91 u91Var;
        dh.g gVar;
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (u91Var = this.b).h1) != null) {
                    gVar.f(i7, i10);
                    u91Var.B0();
                    break;
                }
                break;
        }
    }
}
