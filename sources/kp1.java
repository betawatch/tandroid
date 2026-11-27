// default package

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kp1 implements dic {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public kp1(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // dic
    public final void a(int i) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i), true);
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        float f2 = -1.0f;
        float f3 = -1.0f;
        int i3 = 0;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i3 >= childCount) {
                break;
            }
            q39 q39Var = (q39) linearLayout.getChildAt(i3);
            q39Var.setOutlineProgress(i3 == i ? 1.0f - f : i3 == (i + 1) % this.c ? f : 0.0f);
            if (i3 == i) {
                f2 = q39Var.getX() - ((horizontalScrollView.getWidth() - q39Var.getWidth()) / 2.0f);
            }
            if (i3 == i + 1) {
                f3 = q39Var.getX() - ((horizontalScrollView.getWidth() - q39Var.getWidth()) / 2.0f);
            }
            i3++;
        }
        if (f2 != -1.0f && f3 != -1.0f) {
            horizontalScrollView.setScrollX((int) qd4.A(f3, f2, f, f2));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i + 1, 0) * f) + ((1.0f - f) * sparseIntArray.get(i, 0))), false);
    }

    @Override // dic
    public final void c(int i) {
        if (i == 0) {
            this.a.set(false);
        }
    }
}
