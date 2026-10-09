package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class eu extends s4.m0 {
    public final du[] a = new du[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.m0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        du duVar = new du(recyclerView, i10, new bu(this, 0));
        this.a[i10] = duVar;
        return duVar;
    }

    public final float b(int i10) {
        du duVar = this.a[i10];
        if (Build.VERSION.SDK_INT < 31 || duVar == null || duVar.isFinished()) {
            return 0.0f;
        }
        return duVar.getDistance();
    }
}
