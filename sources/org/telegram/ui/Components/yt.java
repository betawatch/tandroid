package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yt extends s4.l0 {
    public final xt[] a = new xt[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        xt xtVar = new xt(recyclerView, i10, new vt(this, 0));
        this.a[i10] = xtVar;
        return xtVar;
    }

    public final float b(int i10) {
        xt xtVar = this.a[i10];
        if (Build.VERSION.SDK_INT < 31 || xtVar == null || xtVar.isFinished()) {
            return 0.0f;
        }
        return xtVar.getDistance();
    }
}
