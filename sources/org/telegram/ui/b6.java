package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements org.telegram.ui.Components.ft0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ b6(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.ft0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) recyclerView;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.tj0 tj0Var2 = (org.telegram.ui.Components.tj0) recyclerView;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, this.b);
                break;
        }
    }
}
