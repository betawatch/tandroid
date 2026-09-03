package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.Components.sl0 {
    public final LongSparseIntArray U2;
    public final /* synthetic */ d60 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = d60Var;
        this.U2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        boolean z4;
        boolean z10;
        d60 d60Var = this.V2;
        boolean z11 = d60Var.U.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.U2;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < d60Var.y2.size(); i11++) {
            longSparseIntArray.put(d60Var.y2.keyAt(i11), 1);
        }
        d60Var.y2.clear();
        int childCount = getChildCount();
        int i12 = 0;
        boolean z12 = false;
        float f11 = Float.MAX_VALUE;
        float f12 = 0.0f;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            f2.m1 G = G(childAt);
            if (G != null) {
                int i13 = G.f;
                if (i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
                    i10 = i12;
                    z4 = z12;
                } else {
                    if (i13 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                            i10 = i12;
                            z10 = z12;
                            d60Var.y2.append(e4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(e4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                                if (!z11) {
                                    f12 = Math.max(f12, childAt.getY() + childAt.getMeasuredHeight());
                                    f11 = Math.min(f11, Math.max(0.0f, childAt.getY()));
                                } else if (!d60Var.U.I.contains(G)) {
                                    f11 = Math.min(f11, Math.max(0, childAt.getTop()));
                                    f12 = Math.max(f12, childAt.getBottom());
                                }
                                i12 = i10 + 1;
                            } else {
                                longSparseIntArray.delete(e4Var.getPeerId());
                                z12 = z10;
                                if (!z11) {
                                }
                                i12 = i10 + 1;
                            }
                        }
                    }
                    i10 = i12;
                    z10 = z12;
                    z12 = z10;
                    if (!z11) {
                    }
                    i12 = i10 + 1;
                }
            } else {
                i10 = i12;
                z4 = z12;
            }
            z12 = z4;
            i12 = i10 + 1;
        }
        if (longSparseIntArray.size() > 0 ? true : z12) {
            d60Var.O1();
        }
        if (z11) {
            r50 r50Var = d60Var.U;
            float f13 = r50Var.K;
            float f14 = r50Var.F;
            f10 = (f11 * f14) + ((1.0f - f14) * f13);
            f12 = (f12 * f14) + ((1.0f - f14) * r50Var.J);
        } else {
            f10 = f11;
        }
        if (f11 != Float.MAX_VALUE) {
            d60Var.s0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f12));
            canvas.drawRoundRect(d60Var.s0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), d60Var.z0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.V2.U2) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        r50 r50Var = this.V2.U;
        HashSet hashSet = r50Var.I;
        d60 d60Var = r50Var.L;
        HashSet hashSet2 = r50Var.H;
        if (r50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(r50Var.q);
        hashSet.clear();
        hashSet.addAll(r50Var.p);
        r50Var.J = 0.0f;
        r50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        k50 k50Var = d60Var.N;
        int childCount = k50Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = k50Var.getChildAt(i15);
            f2.m1 G = k50Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                r50Var.J = Math.max(r50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                r50Var.K = Math.min(r50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        r50Var.F = 0.0f;
        k50Var.invalidate();
    }

    @Override // org.telegram.ui.Components.sl0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    d60.N(this.V2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
