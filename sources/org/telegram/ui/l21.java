package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l21 extends FrameLayout {
    public final org.telegram.ui.Components.f6 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ q21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(q21 q21Var, Context context) {
        super(context);
        this.e = q21Var;
        this.a = new org.telegram.ui.Components.f6(this, 250L, org.telegram.ui.Components.bs.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        org.telegram.ui.Components.s61 s61Var;
        View[] viewArr;
        org.telegram.ui.Components.f61 G;
        q21 q21Var = this.e;
        View[] viewPages = q21Var.b.getViewPages();
        float f7 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                p21 p21Var = (p21) view;
                FrameLayout frameLayout = p21Var.e;
                org.telegram.ui.Components.a71 a71Var = p21Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(p21Var.getTranslationX() / p21Var.getMeasuredWidth()), 1.0f, f7);
                float f10 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = a71Var.getChildCount();
                    s61Var = a71Var.W2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = a71Var.getChildAt(i13);
                    a71Var.V2.getClass();
                    int H = s4.n0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < s61Var.x.size() && (G = s61Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f10;
                if (p21Var.getVisibility() == 0) {
                    ai.n5 n5Var = p21Var.h;
                    float f11 = -n5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= a71Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = a71Var.getChildAt(i14);
                        a71Var.V2.getClass();
                        if (s61Var.G(s4.n0.H(childAt2)).a == 28) {
                            f11 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    n5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f11));
                }
            }
            i12++;
            viewPages = viewArr;
            f7 = 0.0f;
        }
        float d = this.a.d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f12 = AndroidUtilities.statusBarHeight;
        float f13 = f12 * d;
        this.b = Math.max(f12, this.b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) q21Var).backgroundPaddingLeft;
        float f14 = this.b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) q21Var).backgroundPaddingLeft;
        rectF.set(i10, f14, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, q21Var.c);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        boolean z10 = f13 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(q21Var.getWindow(), z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.dismiss();
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }
}
