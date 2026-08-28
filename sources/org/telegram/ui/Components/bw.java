package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bw extends vy {
    public final /* synthetic */ wy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(wy wyVar) {
        super(wyVar, 2);
        this.d = wyVar;
    }

    @Override // org.telegram.ui.Components.vy, f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        wy wyVar;
        ig.e eVar;
        super.b(recyclerView, i9, i10);
        if (Build.VERSION.SDK_INT < 31 || (eVar = (wyVar = this.d).f2) == null) {
            return;
        }
        eVar.f(i9, i10);
        wyVar.C();
    }
}
