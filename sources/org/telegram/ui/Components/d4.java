package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d4 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ bc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Context context, bc0 bc0Var, int i9) {
        super(context);
        this.a = i9;
        this.c = bc0Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                c4 c4Var = (c4) this.c;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x > point.y ? 3 : 5;
                c4Var.setItemCount(i11);
                c4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            default:
                h4 h4Var = (h4) this.c;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i12 = point2.x > point2.y ? 3 : 5;
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
