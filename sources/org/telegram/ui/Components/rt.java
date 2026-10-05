package org.telegram.ui.Components;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rt extends s4.l0 {
    public final qt[] a = new qt[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.l0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        qt qtVar = new qt(recyclerView, i10, new ot(this, 0));
        this.a[i10] = qtVar;
        return qtVar;
    }
}
