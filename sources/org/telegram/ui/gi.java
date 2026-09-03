package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gi implements m2.f {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public gi(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // m2.f
    public final void a(int i10) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i10), true);
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        int i12 = 0;
        float f11 = -1.0f;
        float f12 = -1.0f;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i12 >= childCount) {
                break;
            }
            org.telegram.ui.Components.zj0 zj0Var = (org.telegram.ui.Components.zj0) linearLayout.getChildAt(i12);
            zj0Var.setOutlineProgress(i12 == i10 ? 1.0f - f10 : i12 == (i10 + 1) % this.c ? f10 : 0.0f);
            if (i12 == i10) {
                f11 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
            }
            if (i12 == i10 + 1) {
                f12 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
            }
            i12++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) e2.c.w(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i10, 0))), false);
    }

    @Override // m2.f
    public final void c(int i10) {
        if (i10 == 0) {
            this.a.set(false);
        }
    }
}
