package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
