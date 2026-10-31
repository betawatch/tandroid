package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hb extends qb {
    public final zg.i g0;
    public final /* synthetic */ sb h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(sb sbVar, Context context) {
        super(sbVar, context);
        this.h0 = sbVar;
        this.g0 = new zg.i();
    }

    @Override // org.telegram.ui.Components.uu0
    public final void T(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        zg.i iVar = this.g0;
        hi.a c10 = iVar.c(drawable);
        org.telegram.messenger.i0.B(iVar.a(c10));
        sb sbVar = this.h0;
        sbVar.a.a = c10;
        bh.i iVar2 = sbVar.W;
        if (iVar2 != null) {
            iVar2.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ac.a aVar = ac.a.e;
        if (aVar == null || !aVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        r4 r4Var = (r4) ac.a.n().d;
        if (r4Var == null) {
            return true;
        }
        r4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.jj jjVar = MediaController.B().u0;
        if (jjVar == null || !jjVar.h4() || jjVar.T == 0) {
            return;
        }
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        sb sbVar = this.h0;
        if (B0 == (-sbVar.f.id)) {
            MediaController.B().p0(sbVar.U0(false), sbVar.e0, sbVar.d0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i20;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        int childCount = getChildCount();
        int i21 = 0;
        while (true) {
            sb sbVar = this.h0;
            if (i21 >= childCount) {
                sbVar.g1();
                R();
                return;
            }
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.zs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                            lVar4 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                            if (childAt != lVar4) {
                                lVar5 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                                if (lVar5.getVisibility() == 0) {
                                    lVar6 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                                    i19 += lVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = (i13 - i11) - measuredHeight;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt == sbVar.H) {
                            int L = org.telegram.messenger.i0.L(24.0f);
                            lVar2 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                            if (lVar2.getVisibility() == 0) {
                                lVar3 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                                i20 = lVar3.getMeasuredHeight() / 2;
                            } else {
                                i20 = 0;
                            }
                            i19 -= L - i20;
                        } else {
                            lVar = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                            if (childAt == lVar) {
                                i19 -= getPaddingTop();
                            } else if (childAt == this.L || childAt == sbVar.W) {
                                i19 = 0;
                            } else if (childAt == sbVar.w) {
                                i19 = -sbVar.e;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt == sbVar.H) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = i12 - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 == 16) {
                }
                i19 = i17 - i18;
                if (childAt == sbVar.H) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
            i21++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sb sbVar = this.h0;
        hi.a aVar = sbVar.a.a;
        if (aVar instanceof hi.b) {
            ((hi.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt == sbVar.w || childAt == sbVar.n) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(10.0f), View.MeasureSpec.getSize(i11)) + (sbVar.e * 2), TLObject.FLAG_30));
                    } else if (childAt == sbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
            }
        }
    }
}
