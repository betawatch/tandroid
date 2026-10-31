package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class li implements z4.e {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public li(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // z4.e
    public final void a(int i10) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i10), true);
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        float f10 = -1.0f;
        float f11 = -1.0f;
        int i12 = 0;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i12 >= childCount) {
                break;
            }
            org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) linearLayout.getChildAt(i12);
            wi0Var.setOutlineProgress(i12 == i10 ? 1.0f - f7 : i12 == (i10 + 1) % this.c ? f7 : 0.0f);
            if (i12 == i10) {
                f10 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
            }
            if (i12 == i10 + 1) {
                f11 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
            }
            i12++;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            horizontalScrollView.setScrollX((int) c3.i0.z(f11, f10, f7, f10));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * sparseIntArray.get(i10, 0))), false);
    }

    @Override // z4.e
    public final void c(int i10) {
        if (i10 == 0) {
            this.a.set(false);
        }
    }
}
