package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n4 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ cd0 b;
    public final /* synthetic */ cd0 c;
    public final /* synthetic */ cd0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Context context, cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3) {
        super(context);
        this.b = cd0Var;
        this.c = cd0Var2;
        this.d = cd0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        cd0 cd0Var = this.b;
        cd0Var.setItemCount(i12);
        cd0 cd0Var2 = this.c;
        cd0Var2.setItemCount(i12);
        cd0 cd0Var3 = this.d;
        cd0Var3.setItemCount(i12);
        cd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        cd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
