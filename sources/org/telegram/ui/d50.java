package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.Components.nm0 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ x50 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = x50Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        boolean z10;
        float f10;
        x50 x50Var = this.g3;
        float f11 = Float.MAX_VALUE;
        boolean z11 = x50Var.X.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.f3;
        longSparseIntArray.clear();
        for (int i10 = 0; i10 < x50Var.B2.size(); i10++) {
            longSparseIntArray.put(x50Var.B2.keyAt(i10), 1);
        }
        x50Var.B2.clear();
        int childCount = getChildCount();
        float f12 = Float.MAX_VALUE;
        int i11 = 0;
        boolean z12 = false;
        float f13 = 0.0f;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            s4.e1 G = G(childAt);
            if (G != null) {
                f10 = f11;
                int i12 = G.f;
                if (i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) {
                    z10 = z11;
                } else {
                    if (i12 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.i4) {
                            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                            z10 = z11;
                            x50Var.B2.append(i4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(i4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                            } else {
                                longSparseIntArray.delete(i4Var.getPeerId());
                            }
                            if (z10) {
                                f13 = Math.max(f13, childAt.getY() + childAt.getMeasuredHeight());
                                f12 = Math.min(f12, Math.max(0.0f, childAt.getY()));
                                i11++;
                                f11 = f10;
                                z11 = z10;
                            } else if (!x50Var.X.I.contains(G)) {
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
            x50Var.P1();
        }
        if (z13) {
            l50 l50Var = x50Var.X;
            float f15 = l50Var.K;
            float f16 = l50Var.F;
            f7 = (f12 * f16) + ((1.0f - f16) * f15);
            f13 = (f13 * f16) + ((1.0f - f16) * l50Var.J);
        } else {
            f7 = f12;
        }
        if (f12 != f14) {
            x50Var.v0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f7, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f13));
            canvas.drawRoundRect(x50Var.v0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), x50Var.C0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.g3.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        l50 l50Var = this.g3.X;
        HashSet hashSet = l50Var.I;
        x50 x50Var = l50Var.L;
        HashSet hashSet2 = l50Var.H;
        if (l50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(l50Var.q);
        hashSet.clear();
        hashSet.addAll(l50Var.p);
        l50Var.J = 0.0f;
        l50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        d50 d50Var = x50Var.Q;
        int childCount = d50Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = d50Var.getChildAt(i15);
            s4.e1 G = d50Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                l50Var.J = Math.max(l50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                l50Var.K = Math.min(l50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        l50Var.F = 0.0f;
        d50Var.invalidate();
    }

    @Override // org.telegram.ui.Components.nm0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    x50.N(this.g3, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
