package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements org.telegram.ui.Components.aw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ d6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.zl0 zl0Var = (org.telegram.ui.Components.zl0) recyclerView;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.zl0 zl0Var2 = (org.telegram.ui.Components.zl0) recyclerView;
                gh.d.a(zl0Var2, canvas, rectF, zl0Var2, this.b);
                break;
        }
    }
}
