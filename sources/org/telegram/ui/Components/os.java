package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class os extends v4.k0 {
    public final ns[] a = new ns[4];
    public final ArrayList b = new ArrayList();

    @Override // v4.k0
    public final EdgeEffect a(RecyclerView recyclerView, int i7) {
        ns nsVar = new ns(recyclerView, i7, new ls(this, 0));
        this.a[i7] = nsVar;
        return nsVar;
    }

    public final float b(int i7) {
        ns nsVar = this.a[i7];
        if (Build.VERSION.SDK_INT < 31 || nsVar == null || nsVar.isFinished()) {
            return 0.0f;
        }
        return nsVar.getDistance();
    }
}
