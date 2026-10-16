package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bu extends s4.k0 {
    public final au[] a = new au[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.k0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        au auVar = new au(recyclerView, i10, new yt(this, 0));
        this.a[i10] = auVar;
        return auVar;
    }

    public final float b(int i10) {
        au auVar = this.a[i10];
        if (Build.VERSION.SDK_INT < 31 || auVar == null || auVar.isFinished()) {
            return 0.0f;
        }
        return auVar.getDistance();
    }
}
