package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ fd0 b;
    public final /* synthetic */ fd0 c;
    public final /* synthetic */ fd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3) {
        super(context);
        this.b = fd0Var;
        this.c = fd0Var2;
        this.d = fd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        fd0 fd0Var = this.b;
        fd0Var.setItemCount(i12);
        fd0 fd0Var2 = this.c;
        fd0Var2.setItemCount(i12);
        fd0 fd0Var3 = this.d;
        fd0Var3.setItemCount(i12);
        fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.a = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
