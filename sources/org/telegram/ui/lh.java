package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lh implements b5.h {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public lh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i3, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i3;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // b5.h
    public final void a(int i3) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i3), true);
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        HorizontalScrollView horizontalScrollView;
        if (this.a.get()) {
            return;
        }
        float f11 = -1.0f;
        float f12 = -1.0f;
        int i11 = 0;
        while (true) {
            LinearLayout linearLayout = this.b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i11 >= childCount) {
                break;
            }
            org.telegram.ui.Components.vh0 vh0Var = (org.telegram.ui.Components.vh0) linearLayout.getChildAt(i11);
            vh0Var.setOutlineProgress(i11 == i3 ? 1.0f - f10 : i11 == (i3 + 1) % this.c ? f10 : 0.0f);
            if (i11 == i3) {
                f11 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
            }
            if (i11 == i3 + 1) {
                f12 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
            }
            i11++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.y(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i3 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i3, 0))), false);
    }

    @Override // b5.h
    public final void c(int i3) {
        if (i3 == 0) {
            this.a.set(false);
        }
    }
}
