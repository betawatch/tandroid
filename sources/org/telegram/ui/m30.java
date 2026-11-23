package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m30 extends org.telegram.ui.Components.ek0 {
    public final LongSparseIntArray f3;
    public final /* synthetic */ e40 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.g3 = e40Var;
        this.f3 = new LongSparseIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        e40 e40Var = this.g3;
        float f12 = Float.MAX_VALUE;
        boolean z11 = e40Var.S1.K != Float.MAX_VALUE;
        LongSparseIntArray longSparseIntArray = this.f3;
        longSparseIntArray.clear();
        for (int i7 = 0; i7 < e40Var.A4.size(); i7++) {
            longSparseIntArray.put(e40Var.A4.keyAt(i7), 1);
        }
        e40Var.A4.clear();
        int childCount = getChildCount();
        float f13 = Float.MAX_VALUE;
        int i10 = 0;
        boolean z12 = false;
        float f14 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            v4.f1 G = G(childAt);
            if (G != null) {
                f11 = f12;
                int i11 = G.f;
                if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                    z10 = z11;
                } else {
                    if (i11 == 1) {
                        View view = G.a;
                        if (view instanceof org.telegram.ui.Cells.g4) {
                            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                            z10 = z11;
                            e40Var.A4.append(g4Var.getPeerId(), 1);
                            if (longSparseIntArray.get(g4Var.getPeerId(), 0) == 0) {
                                z12 = true;
                            } else {
                                longSparseIntArray.delete(g4Var.getPeerId());
                            }
                            if (z10) {
                                f14 = Math.max(f14, childAt.getY() + childAt.getMeasuredHeight());
                                f13 = Math.min(f13, Math.max(0.0f, childAt.getY()));
                                i10++;
                                f12 = f11;
                                z11 = z10;
                            } else if (!e40Var.S1.I.contains(G)) {
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
            e40Var.W1();
        }
        if (z13) {
            s30 s30Var = e40Var.S1;
            float f16 = s30Var.K;
            float f17 = s30Var.F;
            f10 = (f13 * f17) + ((1.0f - f17) * f16);
            f14 = (f14 * f17) + ((1.0f - f17) * s30Var.J);
        } else {
            f10 = f13;
        }
        if (f13 != f15) {
            e40Var.q2.set((getMeasuredWidth() - (org.telegram.messenger.g0.Q1() ? Math.min(org.telegram.messenger.g0.L(420.0f), getMeasuredWidth()) : getMeasuredWidth())) >> 1, f10, getMeasuredWidth() - r3, Math.min(getMeasuredHeight() - getTranslationY(), f14));
            canvas.drawRoundRect(e40Var.q2, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), e40Var.x2);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.g3.W4) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        s30 s30Var = this.g3.S1;
        HashSet hashSet = s30Var.I;
        e40 e40Var = s30Var.L;
        HashSet hashSet2 = s30Var.H;
        if (s30Var.G != null) {
            return;
        }
        hashSet2.clear();
        hashSet2.addAll(s30Var.q);
        hashSet.clear();
        hashSet.addAll(s30Var.p);
        s30Var.J = 0.0f;
        s30Var.K = Float.MAX_VALUE;
        if (hashSet2.isEmpty() && hashSet.isEmpty()) {
            return;
        }
        m30 m30Var = e40Var.L1;
        int childCount = m30Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = m30Var.getChildAt(i14);
            v4.f1 G = m30Var.G(childAt);
            if (G != null && (i13 = G.f) != 3 && i13 != 4 && i13 != 5 && i13 != 7 && !hashSet2.contains(G)) {
                s30Var.J = Math.max(s30Var.J, childAt.getY() + childAt.getMeasuredHeight());
                s30Var.K = Math.min(s30Var.K, Math.max(0.0f, childAt.getY()));
            }
        }
        s30Var.F = 0.0f;
        m30Var.invalidate();
    }

    @Override // org.telegram.ui.Components.ek0, android.view.View
    public final void setVisibility(int i7) {
        if (getVisibility() != i7) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.s) {
                    e40.K0(this.g3, (org.telegram.ui.Components.voip.s) childAt, childAt.isAttachedToWindow() && i7 == 0);
                }
            }
        }
        super.setVisibility(i7);
    }
}
