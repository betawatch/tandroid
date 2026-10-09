package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ u3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Context context, s3 s3Var, u3 u3Var) {
        super(context);
        this.b = s3Var;
        this.c = u3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        s3 s3Var = this.b;
        s3Var.setItemCount(i12);
        u3 u3Var = this.c;
        u3Var.setItemCount(i12);
        s3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
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
