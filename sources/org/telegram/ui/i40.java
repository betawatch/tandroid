package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i40 extends org.telegram.ui.Components.tk0 {
    public final LongSparseIntArray e3;
    public final /* synthetic */ b50 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = b50Var;
        this.e3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        boolean z10;
        float f10;
        b50 b50Var = this.f3;
        float f11 = Float.MAX_VALUE;
        boolean z11 = b50Var.O1.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.e3;
        longSparseIntArray.clear();
        for (int i10 = 0; i10 < b50Var.s4.size(); i10++) {
            longSparseIntArray.put(b50Var.s4.keyAt(i10), 1);
        }
        b50Var.s4.clear();
        int childCount = getChildCount();
        float f12 = Float.MAX_VALUE;
        int i11 = 0;
        boolean z12 = false;
        float f13 = 0.0f;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            s4.c1 G = G(childAt);
            if (G != null) {
                f10 = f11;
                int i12 = G.f;
                if (i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) {
                    z10 = z11;
                } else {
                    if (i12 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.h4) {
                            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                            z10 = z11;
                            b50Var.s4.append(h4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(h4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                            } else {
                                longSparseIntArray.delete(h4Var.getPeerId());
                            }
                            if (z10) {
                                f13 = Math.max(f13, childAt.getY() + childAt.getMeasuredHeight());
                                f12 = Math.min(f12, Math.max(0.0f, childAt.getY()));
                                i11++;
                                f11 = f10;
                                z11 = z10;
                            } else if (!b50Var.O1.I.contains(G)) {
                                f12 = Math.min(f12, Math.max(0, childAt.getTop()));
                                f13 = Math.max(f13, childAt.getBottom());
                            }
                        }
                    }
                    z10 = z11;
                    if (z10) {
                    }
                }
            } else {
                z10 = z11;
                f10 = f11;
            }
            i11++;
            f11 = f10;
            z11 = z10;
        }
        boolean z13 = z11;
        float f14 = f11;
        if (longSparseIntArray.size() > 0) {
            z12 = true;
        }
        if (z12) {
            b50Var.R1();
        }
        if (z13) {
            p40 p40Var = b50Var.O1;
            float f15 = p40Var.K;
            float f16 = p40Var.F;
            f7 = (f12 * f16) + ((1.0f - f16) * f15);
            f13 = (f13 * f16) + ((1.0f - f16) * p40Var.J);
        } else {
            f7 = f12;
        }
        if (f12 != f14) {
            b50Var.m2.set((getMeasuredWidth() - (org.telegram.messenger.i0.Q1() ? Math.min(org.telegram.messenger.i0.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f7, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f13));
            canvas.drawRoundRect(b50Var.m2, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), b50Var.t2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        p40 p40Var = this.f3.O1;
        HashSet hashSet = p40Var.I;
        b50 b50Var = p40Var.L;
        HashSet hashSet2 = p40Var.H;
        if (p40Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(p40Var.q);
        hashSet.clear();
        hashSet.addAll(p40Var.p);
        p40Var.J = 0.0f;
        p40Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        i40 i40Var = b50Var.H1;
        int childCount = i40Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = i40Var.getChildAt(i15);
            s4.c1 G = i40Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                p40Var.J = Math.max(p40Var.J, childAt.getY() + childAt.getMeasuredHeight());
                p40Var.K = Math.min(p40Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        p40Var.F = 0.0f;
        i40Var.invalidate();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    b50.J0(this.f3, (org.telegram.ui.Components.voip.k) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
