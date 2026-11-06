package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k30 extends org.telegram.ui.Components.pj0 {
    public final LongSparseIntArray e3;
    public final /* synthetic */ c40 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = c40Var;
        this.e3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z9;
        float f11;
        c40 c40Var = this.f3;
        float f12 = Float.MAX_VALUE;
        boolean z10 = c40Var.O1.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.e3;
        longSparseIntArray.clear();
        for (int i7 = 0; i7 < c40Var.s4.size(); i7++) {
            longSparseIntArray.put(c40Var.s4.keyAt(i7), 1);
        }
        c40Var.s4.clear();
        int childCount = getChildCount();
        float f13 = Float.MAX_VALUE;
        int i10 = 0;
        boolean z11 = false;
        float f14 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            v4.d1 G = G(childAt);
            if (G != null) {
                f11 = f12;
                int i11 = G.f;
                if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                    z9 = z10;
                } else {
                    if (i11 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                            z9 = z10;
                            c40Var.s4.append(f4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(f4Var.getPeerId(), 0) == 0) {
                                z11 = true;
                            } else {
                                longSparseIntArray.delete(f4Var.getPeerId());
                            }
                            if (z9) {
                                f14 = Math.max(f14, childAt.getY() + childAt.getMeasuredHeight());
                                f13 = Math.min(f13, Math.max(0.0f, childAt.getY()));
                                i10++;
                                f12 = f11;
                                z10 = z9;
                            } else if (!c40Var.O1.I.contains(G)) {
                                f13 = Math.min(f13, Math.max(0, childAt.getTop()));
                                f14 = Math.max(f14, childAt.getBottom());
                            }
                        }
                    }
                    z9 = z10;
                    if (z9) {
                    }
                }
            } else {
                z9 = z10;
                f11 = f12;
            }
            i10++;
            f12 = f11;
            z10 = z9;
        }
        boolean z12 = z10;
        float f15 = f12;
        if (longSparseIntArray.size() > 0) {
            z11 = true;
        }
        if (z11) {
            c40Var.U1();
        }
        if (z12) {
            q30 q30Var = c40Var.O1;
            float f16 = q30Var.K;
            float f17 = q30Var.F;
            f10 = (f13 * f17) + ((1.0f - f17) * f16);
            f14 = (f14 * f17) + ((1.0f - f17) * q30Var.J);
        } else {
            f10 = f13;
        }
        if (f13 != f15) {
            c40Var.m2.set((getMeasuredWidth() - (org.telegram.messenger.g0.Q1() ? Math.min(org.telegram.messenger.g0.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f14));
            canvas.drawRoundRect(c40Var.m2, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), c40Var.t2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3.O4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        q30 q30Var = this.f3.O1;
        HashSet hashSet = q30Var.I;
        c40 c40Var = q30Var.L;
        HashSet hashSet2 = q30Var.H;
        if (q30Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(q30Var.q);
        hashSet.clear();
        hashSet.addAll(q30Var.p);
        q30Var.J = 0.0f;
        q30Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        k30 k30Var = c40Var.H1;
        int childCount = k30Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = k30Var.getChildAt(i14);
            v4.d1 G = k30Var.G(childAt);
            if (G != null && (i13 = G.f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                q30Var.J = Math.max(q30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                q30Var.K = Math.min(q30Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        q30Var.F = 0.0f;
        k30Var.invalidate();
    }

    @Override // org.telegram.ui.Components.pj0, android.view.View
    public final void setVisibility(int i7) {
        if (getVisibility() != i7) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.r) {
                    c40.J0(this.f3, (org.telegram.ui.Components.voip.r) childAt, childAt.isAttachedToWindow() && i7 == 0);
                }
            }
        }
        super.setVisibility(i7);
    }
}
