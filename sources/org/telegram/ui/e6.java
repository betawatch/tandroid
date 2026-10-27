package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements org.telegram.ui.Components.lw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.lw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.nm0 nm0Var = (org.telegram.ui.Components.nm0) recyclerView;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.nm0 nm0Var2 = (org.telegram.ui.Components.nm0) recyclerView;
                ih.d.a(nm0Var2, canvas, rectF, nm0Var2, this.b);
                break;
        }
    }
}
