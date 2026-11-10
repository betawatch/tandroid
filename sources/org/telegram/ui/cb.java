package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cb extends kb {
    public final jh.l g0;
    public final /* synthetic */ mb h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(mb mbVar, Context context) {
        super(mbVar, context);
        this.h0 = mbVar;
        this.g0 = new jh.l();
    }

    @Override // org.telegram.ui.Components.st0
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            ((org.telegram.ui.Components.qa0) drawable).p();
        }
        jh.l lVar = this.g0;
        ri.a c10 = lVar.c(drawable);
        org.telegram.messenger.g0.B(lVar.a(c10));
        mb mbVar = this.h0;
        mbVar.a.a = c10;
        lh.f fVar = mbVar.W;
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

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ij ijVar = MediaController.B().u0;
        if (ijVar == null || !ijVar.h4() || ijVar.T == 0) {
            return;
        }
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        mb mbVar = this.h0;
        if (B0 == (-mbVar.f.id)) {
            MediaController.B().p0(mbVar.V0(false), mbVar.e0, mbVar.d0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i19;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        int childCount = getChildCount();
        int i20 = 0;
        while (true) {
            mb mbVar = this.h0;
            if (i20 >= childCount) {
                mbVar.h1();
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
                int i22 = i21 & org.telegram.messenger.qs.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            lVar4 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                            if (childAt != lVar4) {
                                lVar5 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                                if (lVar5.getVisibility() == 0) {
                                    lVar6 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                                    i18 += lVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i12 - i10) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt == mbVar.H) {
                            int L = org.telegram.messenger.g0.L(24.0f);
                            lVar2 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                            if (lVar2.getVisibility() == 0) {
                                lVar3 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                                i19 = lVar3.getMeasuredHeight() / 2;
                            } else {
                                i19 = 0;
                            }
                            i18 -= L - i19;
                        } else {
                            lVar = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                            if (childAt == lVar) {
                                i18 -= getPaddingTop();
                            } else if (childAt == this.L || childAt == mbVar.W) {
                                i18 = 0;
                            } else if (childAt == mbVar.w) {
                                i18 = -mbVar.e;
                            }
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt == mbVar.H) {
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
                if (childAt == mbVar.H) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
            i20++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        mb mbVar = this.h0;
        ri.a aVar = mbVar.a.a;
        if (aVar instanceof ri.b) {
            ((ri.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        measureChildWithMargins(lVar, i7, 0, i10, 0);
        lVar2 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt == mbVar.w || childAt == mbVar.n) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), View.MeasureSpec.getSize(i10)) + (mbVar.e * 2), TLObject.FLAG_30));
                    } else if (childAt == mbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i7, 0, i10, 0);
                    }
                }
            }
        }
    }
}
