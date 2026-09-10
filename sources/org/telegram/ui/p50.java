package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p50 extends org.telegram.ui.Components.vl0 {
    public final LongSparseIntArray X2;
    public final /* synthetic */ j60 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.Y2 = j60Var;
        this.X2 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        boolean z11;
        j60 j60Var = this.Y2;
        boolean z12 = j60Var.X.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.X2;
        longSparseIntArray.clear();
        for (int i11 = 0; i11 < j60Var.B2.size(); i11++) {
            longSparseIntArray.put(j60Var.B2.keyAt(i11), 1);
        }
        j60Var.B2.clear();
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
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                            i10 = i12;
                            z11 = z13;
                            j60Var.B2.append(d4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(d4Var.getPeerId(), 0) == 0) {
                                z13 = true;
                                if (!z12) {
                                    f11 = Math.max(f11, childAt.getY() + childAt.getMeasuredHeight());
                                    f10 = Math.min(f10, Math.max(0.0f, childAt.getY()));
                                } else if (!j60Var.X.I.contains(G)) {
                                    f10 = Math.min(f10, Math.max(0, childAt.getTop()));
                                    f11 = Math.max(f11, childAt.getBottom());
                                }
                                i12 = i10 + 1;
                            } else {
                                longSparseIntArray.delete(d4Var.getPeerId());
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
            j60Var.O1();
        }
        if (z12) {
            x50 x50Var = j60Var.X;
            float f12 = x50Var.K;
            float f13 = x50Var.F;
            f7 = (f10 * f13) + ((1.0f - f13) * f12);
            f11 = (f11 * f13) + ((1.0f - f13) * x50Var.J);
        } else {
            f7 = f10;
        }
        if (f10 != Float.MAX_VALUE) {
            j60Var.v0.set((getMeasuredWidth() - (AndroidUtilities.isTablet() ? Math.min(AndroidUtilities.dp(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f7, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f11));
            canvas.drawRoundRect(j60Var.v0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), j60Var.C0);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Y2.X2) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        x50 x50Var = this.Y2.X;
        HashSet hashSet = x50Var.I;
        j60 j60Var = x50Var.L;
        HashSet hashSet2 = x50Var.H;
        if (x50Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(x50Var.q);
        hashSet.clear();
        hashSet.addAll(x50Var.p);
        x50Var.J = 0.0f;
        x50Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        p50 p50Var = j60Var.Q;
        int childCount = p50Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = p50Var.getChildAt(i15);
            s4.c1 G = p50Var.G(childAt);
            if (G != null && (i14 = G.f) != 3 && i14 != 4 && i14 != 5 && i14 != 7 && !hashSet2.contains(G)) {
                x50Var.J = Math.max(x50Var.J, childAt.getY() + childAt.getMeasuredHeight());
                x50Var.K = Math.min(x50Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        x50Var.F = 0.0f;
        p50Var.invalidate();
    }

    @Override // org.telegram.ui.Components.vl0, android.view.View
    public final void setVisibility(int i10) {
        if (getVisibility() != i10) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    j60.N(this.Y2, (org.telegram.ui.Components.voip.l) childAt, childAt.isAttachedToWindow() && i10 == 0);
                }
            }
        }
        super.setVisibility(i10);
    }
}
