package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dt extends v4.m0 {
    public final ct[] a = new ct[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.m0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ct ctVar = new ct(recyclerView, i7, new at(this, 0));
        this.a[i7] = ctVar;
        return ctVar;
    }

    public final float b(int i7) {
        ct ctVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || ctVar == null || ctVar.isFinished()) {
            return 0.0f;
        }
        return ctVar.getDistance();
    }
}
