// default package

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mf1 extends uf1 {
    public final bvc h0;
    public final /* synthetic */ wf1 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(wf1 wf1Var, Context context) {
        super(wf1Var, context);
        this.i0 = wf1Var;
        this.h0 = new bvc();
    }

    @Override // wma
    public final void T(Drawable drawable) {
        if (drawable instanceof hh7) {
            ((hh7) drawable).o();
        }
        bvc bvcVar = this.h0;
        mz4 c = bvcVar.c(drawable);
        bvcVar.a(c);
        Typeface typeface = hl.a;
        wf1 wf1Var = this.i0;
        wf1Var.a.a = c;
        jz1 jz1Var = wf1Var.X;
        if (jz1Var != null) {
            jz1Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vh4 vh4Var = vh4.f;
        if (vh4Var == null || !vh4Var.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        tb0 tb0Var = (tb0) vh4.r().d;
        if (tb0Var == null) {
            return true;
        }
        tb0Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null || !r47Var.g4() || r47Var.T == 0) {
            return;
        }
        long B0 = r47.B0(r47Var.k);
        wf1 wf1Var = this.i0;
        if (B0 == (-wf1Var.f.id)) {
            MediaController.z().s0(wf1Var.N0(false), wf1Var.f0, wf1Var.e0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        a aVar2;
        int i11;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            wf1 wf1Var = this.i0;
            if (i12 >= childCount) {
                wf1Var.h1();
                R();
                return;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 51;
                }
                int i14 = i13 & jn7.w1;
                int i15 = i13 & 7;
                if (i15 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                            aVar4 = ((e) wf1Var).actionBar;
                            if (childAt != aVar4) {
                                aVar5 = ((e) wf1Var).actionBar;
                                if (aVar5.getVisibility() == 0) {
                                    aVar6 = ((e) wf1Var).actionBar;
                                    i10 += aVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i14 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = (i4 - i2) - measuredHeight;
                            i9 = layoutParams.bottomMargin;
                        }
                        if (childAt == wf1Var.I) {
                            int L = hl.L(24.0f);
                            aVar2 = ((e) wf1Var).actionBar;
                            if (aVar2.getVisibility() == 0) {
                                aVar3 = ((e) wf1Var).actionBar;
                                i11 = aVar3.getMeasuredHeight() / 2;
                            } else {
                                i11 = 0;
                            }
                            i10 -= L - i11;
                        } else {
                            aVar = ((e) wf1Var).actionBar;
                            if (childAt == aVar) {
                                i10 -= getPaddingTop();
                            } else if (childAt == this.M || childAt == wf1Var.X) {
                                i10 = 0;
                            } else if (childAt == wf1Var.w) {
                                i10 = -wf1Var.e;
                            }
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                    } else {
                        i8 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt == wf1Var.I) {
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                } else {
                    i5 = i3 - measuredWidth;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i14 == 16) {
                }
                i10 = i8 - i9;
                if (childAt == wf1Var.I) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
            }
            i12++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        wf1 wf1Var = this.i0;
        mz4 mz4Var = wf1Var.a.a;
        if (mz4Var instanceof nz4) {
            ((nz4) mz4Var).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((e) wf1Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((e) wf1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((e) wf1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar4 = ((e) wf1Var).actionBar;
                if (childAt != aVar4) {
                    if (childAt == wf1Var.w || childAt == wf1Var.n) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), View.MeasureSpec.getSize(i2)) + (wf1Var.e << 1), TLObject.FLAG_30));
                    } else if (childAt == wf1Var.I) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
            }
        }
    }
}
