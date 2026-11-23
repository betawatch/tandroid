package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class bb extends jb {
    public final jh.l h0;
    public final /* synthetic */ lb i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(lb lbVar, Context context) {
        super(lbVar, context);
        this.i0 = lbVar;
        this.h0 = new jh.l();
    }

    @Override // org.telegram.ui.Components.du0
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.cb0) {
            ((org.telegram.ui.Components.cb0) drawable).p();
        }
        jh.l lVar = this.h0;
        ui.a c10 = lVar.c(drawable);
        org.telegram.messenger.g0.B(lVar.a(c10));
        lb lbVar = this.i0;
        lbVar.a.a = c10;
        lh.f fVar = lbVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab.q qVar = ab.q.e;
        if (qVar == null || !qVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        r4 r4Var = (r4) ab.q.o().d;
        if (r4Var == null) {
            return true;
        }
        r4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.gj gjVar = MediaController.B().v0;
        if (gjVar == null || !gjVar.h4() || gjVar.T == 0) {
            return;
        }
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        lb lbVar = this.i0;
        if (B0 == (-lbVar.f.id)) {
            MediaController.B().p0(lbVar.V0(false), lbVar.f0, lbVar.e0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.du0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i19;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int childCount = getChildCount();
        int i20 = 0;
        while (true) {
            lb lbVar = this.i0;
            if (i20 >= childCount) {
                lbVar.h1();
                R();
                return;
            }
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.ls.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar4 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                            if (childAt != kVar4) {
                                kVar5 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                                if (kVar5.getVisibility() == 0) {
                                    kVar6 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                                    i18 += kVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i12 - i10) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt == lbVar.I) {
                            int L = org.telegram.messenger.g0.L(24.0f);
                            kVar2 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                            if (kVar2.getVisibility() == 0) {
                                kVar3 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                                i19 = kVar3.getMeasuredHeight() / 2;
                            } else {
                                i19 = 0;
                            }
                            i18 -= L - i19;
                        } else {
                            kVar = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                            if (childAt == kVar) {
                                i18 -= getPaddingTop();
                            } else if (childAt == this.M || childAt == lbVar.X) {
                                i18 = 0;
                            } else if (childAt == lbVar.w) {
                                i18 = -lbVar.e;
                            }
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt == lbVar.I) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                } else {
                    i13 = i11 - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 == 16) {
                }
                i18 = i16 - i17;
                if (childAt == lbVar.I) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
            i20++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        lb lbVar = this.i0;
        ui.a aVar = lbVar.a.a;
        if (aVar instanceof ui.b) {
            ((ui.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt == lbVar.w || childAt == lbVar.n) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), View.MeasureSpec.getSize(i10)) + (lbVar.e * 2), TLObject.FLAG_30));
                    } else if (childAt == lbVar.I) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i7, 0, i10, 0);
                    }
                }
            }
        }
    }
}
