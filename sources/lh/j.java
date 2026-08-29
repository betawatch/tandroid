package lh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j extends f2.v0 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S != 1) {
                    if (S == 2) {
                        rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                        break;
                    }
                } else {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    break;
                }
                break;
            case 1:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 2:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 3:
                vk0 vk0Var = (vk0) recyclerView.T(view);
                if (vk0Var == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b10 = vk0Var.b() % 4;
                    rect.left = b10 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b10 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 4:
                vk0 vk0Var2 = (vk0) recyclerView.T(view);
                if (vk0Var2 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b11 = vk0Var2.b() % 4;
                    rect.left = b11 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b11 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 5:
                vk0 vk0Var3 = (vk0) recyclerView.T(view);
                if (vk0Var3 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    if (vk0Var3.f == 5) {
                        int b12 = vk0Var3.b() % 4;
                        rect.left = b12 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = b12 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                        break;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                        break;
                    }
                }
            case 6:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 7:
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R == k1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    break;
                }
                break;
            case 8:
                super.a(rect, view, recyclerView, k1Var);
                rect.top = 1;
                break;
            case 9:
                super.a(rect, view, recyclerView, k1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (R2 == k1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (R2 == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                    break;
                }
                break;
            default:
                rect.top = AndroidUtilities.dp(6.0f);
                break;
        }
    }

    @Override // f2.v0
    public void b(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 8:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                int i11 = 0;
                while (i11 < i10) {
                    View childAt = recyclerView.getChildAt(i11);
                    View childAt2 = i11 < childCount + (-2) ? recyclerView.getChildAt(i11 + 1) : null;
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.s3) && !(childAt2 instanceof org.telegram.ui.Cells.s3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, org.telegram.ui.ActionBar.g6.k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
