package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements org.telegram.ui.Components.ht0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ a6(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.ht0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) recyclerView;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.uj0 uj0Var2 = (org.telegram.ui.Components.uj0) recyclerView;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, this.b);
                break;
        }
    }
}
