package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class t extends s4.n0 {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int T = RecyclerView.T(view);
                rect.setEmpty();
                if (T != 1) {
                    if (T == 2) {
                        rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                        break;
                    }
                } else {
                    rect.left = AndroidUtilities.dp(31.0f) + (-AndroidUtilities.dp(85.0f));
                    break;
                }
                break;
            case 1:
                super.a(rect, view, recyclerView, z0Var);
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                rect.left = AndroidUtilities.dp(8.0f);
                if (S == z0Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(10.0f);
                }
                if (S == 0) {
                    rect.left = AndroidUtilities.dp(10.0f);
                    break;
                }
                break;
            case 2:
                rect.top = AndroidUtilities.dp(6.0f);
                break;
            case 3:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 4:
                rect.right = AndroidUtilities.dp(2.0f);
                break;
            case 5:
                gl0 gl0Var = (gl0) recyclerView.U(view);
                if (gl0Var == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b10 = gl0Var.b() % 4;
                    rect.left = b10 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b10 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 6:
                gl0 gl0Var2 = (gl0) recyclerView.U(view);
                if (gl0Var2 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    int b11 = gl0Var2.b() % 4;
                    rect.left = b11 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = b11 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    break;
                }
            case 7:
                gl0 gl0Var3 = (gl0) recyclerView.U(view);
                if (gl0Var3 == null) {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                    break;
                } else {
                    if (gl0Var3.f == 5) {
                        int b12 = gl0Var3.b() % 4;
                        rect.left = b12 == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = b12 != 3 ? AndroidUtilities.dp(4.0f) : 0;
                        break;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                        break;
                    }
                }
            case 8:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 9:
                recyclerView.getClass();
                int S2 = RecyclerView.S(view);
                rect.left = AndroidUtilities.dp(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (S2 == z0Var.b() - 1) {
                    rect.right = AndroidUtilities.dp(12.0f);
                    break;
                }
                break;
            default:
                super.a(rect, view, recyclerView, z0Var);
                rect.top = 1;
                break;
        }
    }

    @Override // s4.n0
    public void c(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 10:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                int i11 = 0;
                while (i11 < i10) {
                    View childAt = recyclerView.getChildAt(i11);
                    View childAt2 = i11 < childCount + (-2) ? recyclerView.getChildAt(i11 + 1) : null;
                    if (RecyclerView.S(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.v3) && !(childAt2 instanceof org.telegram.ui.Cells.v3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), bottom, width - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), bottom, org.telegram.ui.ActionBar.j6.k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
