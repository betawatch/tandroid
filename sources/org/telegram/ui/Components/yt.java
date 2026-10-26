package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
