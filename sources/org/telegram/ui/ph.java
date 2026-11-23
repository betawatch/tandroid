package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ph implements c5.h {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int c;
    public final /* synthetic */ HorizontalScrollView d;
    public final /* synthetic */ SparseIntArray e;
    public final /* synthetic */ ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final /* synthetic */ int[] g;

    public ph(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.a = atomicBoolean;
        this.b = linearLayout;
        this.c = i7;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.g = iArr;
    }

    @Override // c5.h
    public final void a(int i7) {
        this.f.getSwipeBack().f(this.g[0], this.e.get(i7), true);
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
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
            org.telegram.ui.Components.hi0 hi0Var = (org.telegram.ui.Components.hi0) linearLayout.getChildAt(i11);
            hi0Var.setOutlineProgress(i11 == i7 ? 1.0f - f10 : i11 == (i7 + 1) % this.c ? f10 : 0.0f);
            if (i11 == i7) {
                f11 = hi0Var.getX() - ((horizontalScrollView.getWidth() - hi0Var.getWidth()) / 2.0f);
            }
            if (i11 == i7 + 1) {
                f12 = hi0Var.getX() - ((horizontalScrollView.getWidth() - hi0Var.getWidth()) / 2.0f);
            }
            i11++;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f10, f11));
        }
        SparseIntArray sparseIntArray = this.e;
        this.f.getSwipeBack().f(this.g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i7, 0))), false);
    }

    @Override // c5.h
    public final void c(int i7) {
        if (i7 == 0) {
            this.a.set(false);
        }
    }
}
