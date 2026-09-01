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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g31 extends FrameLayout {
    public final org.telegram.ui.Components.z5 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ m31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g31(m31 m31Var, Context context) {
        super(context);
        this.e = m31Var;
        this.a = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        org.telegram.ui.Components.x51 x51Var;
        View[] viewArr;
        org.telegram.ui.Components.j51 G;
        m31 m31Var = this.e;
        View[] viewPages = m31Var.b.getViewPages();
        float f10 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                l31 l31Var = (l31) view;
                FrameLayout frameLayout = l31Var.e;
                org.telegram.ui.Components.i61 i61Var = l31Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(l31Var.getTranslationX() / l31Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = i61Var.getChildCount();
                    x51Var = i61Var.V2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = i61Var.getChildAt(i13);
                    i61Var.U2.getClass();
                    int H = f2.w0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < x51Var.x.size() && (G = x51Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f11;
                if (l31Var.getVisibility() == 0) {
                    eg.q1 q1Var = l31Var.h;
                    float f12 = -q1Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = i61Var.getChildAt(i14);
                        i61Var.U2.getClass();
                        if (x51Var.G(f2.w0.H(childAt2)).a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    q1Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        float d = this.a.d(this.b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.b = Math.max(f13, this.b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) m31Var).backgroundPaddingLeft;
        float f15 = this.b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) m31Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, m31Var.c);
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        boolean z4 = f14 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            boolean z10 = AndroidUtilities.computePerceivedBrightness(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
            boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(m31Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z4);
            if (!z4) {
                z10 = z11;
            }
            AndroidUtilities.setLightStatusBar(m31Var.getWindow(), z10);
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
