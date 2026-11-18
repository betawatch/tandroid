package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bt extends v4.m0 {
    public final at[] a = new at[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.m0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        at atVar = new at(recyclerView, i7, new ys(this, 0));
        this.a[i7] = atVar;
        return atVar;
    }

    public final float b(int i7) {
        at atVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || atVar == null || atVar.isFinished()) {
            return 0.0f;
        }
        return atVar.getDistance();
    }
}
