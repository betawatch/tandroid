package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements org.telegram.ui.Components.kw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ e6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) recyclerView;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.mm0 mm0Var2 = (org.telegram.ui.Components.mm0) recyclerView;
                ih.d.a(mm0Var2, canvas, rectF, mm0Var2, this.b);
                break;
        }
    }
}
