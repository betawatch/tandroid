package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f30 extends org.telegram.ui.Components.tj0 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ x30 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = x30Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        x30 x30Var = this.g3;
        float f12 = Float.MAX_VALUE;
        boolean z11 = x30Var.P1.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.f3;
        longSparseIntArray.clear();
        for (int i3 = 0; i3 < x30Var.t4.size(); i3++) {
            longSparseIntArray.put(x30Var.t4.keyAt(i3), 1);
        }
        x30Var.t4.clear();
        int childCount = getChildCount();
        float f13 = Float.MAX_VALUE;
        int i10 = 0;
        boolean z12 = false;
        float f14 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            u4.d1 G = G(childAt);
            if (G != null) {
                f11 = f12;
                int i11 = G.f;
                if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                    z10 = z11;
                } else {
                    if (i11 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                            z10 = z11;
                            x30Var.t4.append(f4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(f4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                            } else {
                                longSparseIntArray.delete(f4Var.getPeerId());
                            }
                            if (z10) {
                                f14 = Math.max(f14, childAt.getY() + childAt.getMeasuredHeight());
                                f13 = Math.min(f13, Math.max(0.0f, childAt.getY()));
                                i10++;
                                f12 = f11;
                                z11 = z10;
                            } else if (!x30Var.P1.I.contains(G)) {
                                f13 = Math.min(f13, Math.max(0, childAt.getTop()));
                                f14 = Math.max(f14, childAt.getBottom());
                            }
                        }
                    }
                    z10 = z11;
                    if (z10) {
                    }
                }
            } else {
                z10 = z11;
                f11 = f12;
            }
            i10++;
            f12 = f11;
            z11 = z10;
        }
        boolean z13 = z11;
        float f15 = f12;
        if (longSparseIntArray.size() > 0) {
            z12 = true;
        }
        if (z12) {
            x30Var.R1();
        }
        if (z13) {
            l30 l30Var = x30Var.P1;
            float f16 = l30Var.K;
            float f17 = l30Var.F;
            f10 = (f13 * f17) + ((1.0f - f17) * f16);
            f14 = (f14 * f17) + ((1.0f - f17) * l30Var.J);
        } else {
            f10 = f13;
        }
        if (f13 != f15) {
            x30Var.n2.set((getMeasuredWidth() - (org.telegram.messenger.g0.Q1() ? Math.min(org.telegram.messenger.g0.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f14));
            canvas.drawRoundRect(x30Var.n2, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), x30Var.u2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.g3.P4) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        l30 l30Var = this.g3.P1;
        HashSet hashSet = l30Var.I;
        x30 x30Var = l30Var.L;
        HashSet hashSet2 = l30Var.H;
        if (l30Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(l30Var.q);
        hashSet.clear();
        hashSet.addAll(l30Var.p);
        l30Var.J = 0.0f;
        l30Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        f30 f30Var = x30Var.I1;
        int childCount = f30Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = f30Var.getChildAt(i14);
            u4.d1 G = f30Var.G(childAt);
            if (G != null && (i13 = G.f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                l30Var.J = Math.max(l30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                l30Var.K = Math.min(l30Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        l30Var.F = 0.0f;
        f30Var.invalidate();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.View
    public final void setVisibility(int i3) {
        if (getVisibility() != i3) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    x30.J0(this.g3, (org.telegram.ui.Components.voip.k) childAt, childAt.isAttachedToWindow() && i3 == 0);
                }
            }
        }
        super.setVisibility(i3);
    }
}
