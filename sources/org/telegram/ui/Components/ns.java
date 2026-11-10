package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ns extends v4.k0 {
    public final ms[] a = new ms[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.k0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ms msVar = new ms(recyclerView, i7, new ks(this, 0));
        this.a[i7] = msVar;
        return msVar;
    }

    public final float b(int i7) {
        ms msVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || msVar == null || msVar.isFinished()) {
            return 0.0f;
        }
        return msVar.getDistance();
    }
}
