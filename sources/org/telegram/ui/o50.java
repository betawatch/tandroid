package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Components.zl0 {
    public final LongSparseIntArray e3;
    public final /* synthetic */ h60 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f3 = h60Var;
        this.e3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        boolean z11;
        h60 h60Var = this.f3;
        boolean z12 = h60Var.X.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.e3;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < h60Var.B2.size(); i11++) {
            longSparseIntArray.put(h60Var.B2.keyAt(i11), 1);
        }
        h60Var.B2.clear();
        int childCount = getChildCount();
        int i12 = 0;
        boolean z13 = false;
        float f10 = Float.MAX_VALUE;
        float f11 = 0.0f;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            s4.c1 G = G(childAt);
            if (G != null) {
                int i13 = G.f;
                if (i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
                    i10 = i12;
                    z10 = z13;
                } else {
                    if (i13 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.e4) {
                            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                            i10 = i12;
                            z11 = z13;
                            h60Var.B2.append(e4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(e4Var.getPeerId(), 0) == 0) {
                                z13 = true;
                                if (!z12) {
                                    f11 = Math.max(f11, childAt.getY() + childAt.getMeasuredHeight());
                                    f10 = Math.min(f10, Math.max(0.0f, childAt.getY()));
                                } else if (!h60Var.X.I.contains(G)) {
                                    f10 = Math.min(f10, Math.max(0, childAt.getTop()));
                                    f11 = Math.max(f11, childAt.getBottom());
                                }
                                i12 = i10 + 1;
                            } else {
                                longSparseIntArray.delete(e4Var.getPeerId());
                                z13 = z11;
                                if (!z12) {
                                }
                                i12 = i10 + 1;
                            }
                        }
                    }
                    i10 = i12;
                    z11 = z13;
                    z13 = z11;
                    if (!z12) {
                    }
                    i12 = i10 + 1;
                }
            } else {
                i10 = i12;
                z10 = z13;
            }
            z13 = z10;
            i12 = i10 + 1;
        }
        if (longSparseIntArray.size() > 0 ? true : z13) {
            h60Var.O1();
        }
        if (z12) {
            v50 v50Var = h60Var.X;
            float f12 = v50Var.K;
            float f13 = v50Var.F;
            f7 = (f10 * f13) + ((1.0f - f13) * f12);
            f11 = (f11 * f13) + ((1.0f - f13) * v50Var.J);
        } else {
            f7 = f10;
        }
        if (f10 != Float.MAX_VALUE) {
            h60Var.v0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f7, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f11));
            canvas.drawRoundRect(h60Var.v0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), h60Var.C0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        v50 v50Var = this.f3.X;
        HashSet hashSet = v50Var.I;
        h60 h60Var = v50Var.L;
        HashSet hashSet2 = v50Var.H;
        if (v50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(v50Var.q);
        hashSet.clear();
        hashSet.addAll(v50Var.p);
        v50Var.J = 0.0f;
        v50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        o50 o50Var = h60Var.Q;
        int childCount = o50Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = o50Var.getChildAt(i15);
            s4.c1 G = o50Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                v50Var.J = Math.max(v50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                v50Var.K = Math.min(v50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        v50Var.F = 0.0f;
        o50Var.invalidate();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    h60.L(this.f3, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
