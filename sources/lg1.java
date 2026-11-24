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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lg1 extends tg1 {
    public final psc n0;
    public final /* synthetic */ vg1 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg1(vg1 vg1Var, Context context) {
        super(vg1Var, context);
        this.o0 = vg1Var;
        this.n0 = new psc();
    }

    @Override // ela
    public final void T(Drawable drawable) {
        if (drawable instanceof ah7) {
            ((ah7) drawable).o();
        }
        psc pscVar = this.n0;
        iz4 c = pscVar.c(drawable);
        pscVar.a(c);
        Typeface typeface = gm.a;
        vg1 vg1Var = this.o0;
        vg1Var.a.a = c;
        e02 e02Var = vg1Var.X;
        if (e02Var != null) {
            e02Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yh4 yh4Var = yh4.f;
        if (yh4Var == null || !yh4Var.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        rc0 rc0Var = (rc0) yh4.t().d;
        if (rc0Var == null) {
            return true;
        }
        rc0Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null || !k47Var.g4() || k47Var.T == 0) {
            return;
        }
        long B0 = k47.B0(k47Var.k);
        vg1 vg1Var = this.o0;
        if (B0 == (-vg1Var.f.id)) {
            MediaController.w().o0(vg1Var.N0(false), vg1Var.f0, vg1Var.e0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
            vg1 vg1Var = this.o0;
            if (i12 >= childCount) {
                vg1Var.h1();
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
                int i14 = i13 & nm7.w1;
                int i15 = i13 & 7;
                if (i15 == 1) {
                    i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                            aVar4 = ((d) vg1Var).actionBar;
                            if (childAt != aVar4) {
                                aVar5 = ((d) vg1Var).actionBar;
                                if (aVar5.getVisibility() == 0) {
                                    aVar6 = ((d) vg1Var).actionBar;
                                    i10 += aVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i14 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = (i4 - i2) - measuredHeight;
                            i9 = layoutParams.bottomMargin;
                        }
                        if (childAt == vg1Var.I) {
                            int L = gm.L(24.0f);
                            aVar2 = ((d) vg1Var).actionBar;
                            if (aVar2.getVisibility() == 0) {
                                aVar3 = ((d) vg1Var).actionBar;
                                i11 = aVar3.getMeasuredHeight() / 2;
                            } else {
                                i11 = 0;
                            }
                            i10 -= L - i11;
                        } else {
                            aVar = ((d) vg1Var).actionBar;
                            if (childAt == aVar) {
                                i10 -= getPaddingTop();
                            } else if (childAt == this.M || childAt == vg1Var.X) {
                                i10 = 0;
                            } else if (childAt == vg1Var.w) {
                                i10 = -vg1Var.e;
                            }
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                    } else {
                        i8 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt == vg1Var.I) {
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
                if (childAt == vg1Var.I) {
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
        vg1 vg1Var = this.o0;
        iz4 iz4Var = vg1Var.a.a;
        if (iz4Var instanceof jz4) {
            ((jz4) iz4Var).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((d) vg1Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        aVar2 = ((d) vg1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((d) vg1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar4 = ((d) vg1Var).actionBar;
                if (childAt != aVar4) {
                    if (childAt == vg1Var.w || childAt == vg1Var.n) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), View.MeasureSpec.getSize(i2)) + (vg1Var.e << 1), TLObject.FLAG_30));
                    } else if (childAt == vg1Var.I) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
            }
        }
    }
}
