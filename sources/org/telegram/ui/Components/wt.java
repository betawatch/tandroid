package org.telegram.ui.Components;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wt extends s4.k0 {
    public final vt[] a = new vt[4];
    public final ArrayList b = new ArrayList();

    @Override // s4.k0
    public final EdgeEffect a(RecyclerView recyclerView, int i10) {
        vt vtVar = new vt(recyclerView, i10, new tt(this, 0));
        this.a[i10] = vtVar;
        return vtVar;
    }

    public final float b(int i10) {
        vt vtVar = this.a[i10];
        if (Build.VERSION.SDK_INT < 31 || vtVar == null || vtVar.isFinished()) {
            return 0.0f;
        }
        return vtVar.getDistance();
    }
}
