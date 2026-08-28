package ih;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ik0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l extends f2.y0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i9) {
        this.a = i9;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
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
                super.a(rect, view, recyclerView, n1Var);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (R == n1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (R == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                    break;
                }
                break;
            case 2:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 3:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 4:
                ik0 ik0Var = (ik0) recyclerView.T(view);
                if (ik0Var == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b10 = ik0Var.b() % 4;
                    rect.left = b10 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b10 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 5:
                ik0 ik0Var2 = (ik0) recyclerView.T(view);
                if (ik0Var2 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b11 = ik0Var2.b() % 4;
                    rect.left = b11 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b11 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 6:
                ik0 ik0Var3 = (ik0) recyclerView.T(view);
                if (ik0Var3 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    if (ik0Var3.f == 5) {
                        int b12 = ik0Var3.b() % 4;
                        rect.left = b12 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = b12 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                        break;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                        break;
                    }
                }
            case 7:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 8:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == n1Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    break;
                }
                break;
            case 9:
                super.a(rect, view, recyclerView, n1Var);
                rect.top = 1;
                break;
            default:
                rect.top = AndroidUtilities.dp(6.0f);
                break;
        }
    }

    @Override // f2.y0
    public void b(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 9:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i9 = childCount - 1;
                int i10 = 0;
                while (i10 < i9) {
                    View childAt = recyclerView.getChildAt(i10);
                    View childAt2 = i10 < childCount + (-2) ? recyclerView.getChildAt(i10 + 1) : null;
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.v3) && !(childAt2 instanceof org.telegram.ui.Cells.v3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, org.telegram.ui.ActionBar.f6.k0);
                    }
                    i10++;
                }
                break;
        }
    }
}
