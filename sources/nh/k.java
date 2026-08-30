package nh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.el0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k extends f2.u0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i10) {
        this.a = i10;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
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
                el0 el0Var = (el0) recyclerView.T(view);
                if (el0Var == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b10 = el0Var.b() % 4;
                    rect.left = b10 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b10 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 4:
                el0 el0Var2 = (el0) recyclerView.T(view);
                if (el0Var2 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b11 = el0Var2.b() % 4;
                    rect.left = b11 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b11 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 5:
                el0 el0Var3 = (el0) recyclerView.T(view);
                if (el0Var3 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    if (el0Var3.f == 5) {
                        int b12 = el0Var3.b() % 4;
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
                if (R == i1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    break;
                }
                break;
            case 8:
                super.a(rect, view, recyclerView, i1Var);
                rect.top = 1;
                break;
            case 9:
                super.a(rect, view, recyclerView, i1Var);
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (R2 == i1Var.b() - 1) {
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

    @Override // f2.u0
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
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.u3) && !(childAt2 instanceof org.telegram.ui.Cells.u3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, org.telegram.ui.ActionBar.j6.k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
