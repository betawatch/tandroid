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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e31 extends FrameLayout {
    public final org.telegram.ui.Components.z5 a;
    public float b;
    public final Path c;
    public Boolean d;
    public final /* synthetic */ k31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e31(k31 k31Var, Context context) {
        super(context);
        this.e = k31Var;
        this.a = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.nr.h);
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        org.telegram.ui.Components.w51 w51Var;
        View[] viewArr;
        org.telegram.ui.Components.i51 G;
        k31 k31Var = this.e;
        View[] viewPages = k31Var.b.getViewPages();
        float f10 = 0.0f;
        this.b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                j31 j31Var = (j31) view;
                FrameLayout frameLayout = j31Var.e;
                org.telegram.ui.Components.g61 g61Var = j31Var.f;
                float clamp = Utilities.clamp(1.0f - Math.abs(j31Var.getTranslationX() / j31Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = g61Var.getChildCount();
                    w51Var = g61Var.V2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = g61Var.getChildAt(i13);
                    g61Var.U2.getClass();
                    int H = f2.v0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < w51Var.x.size() && (G = w51Var.G(H)) != null && G.a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.b = (paddingTop * clamp) + f11;
                if (j31Var.getVisibility() == 0) {
                    dg.s1 s1Var = j31Var.h;
                    float f12 = -s1Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= g61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = g61Var.getChildAt(i14);
                        g61Var.U2.getClass();
                        if (w51Var.G(f2.v0.H(childAt2)).a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    s1Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
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
        i10 = ((org.telegram.ui.ActionBar.g3) k31Var).backgroundPaddingLeft;
        float f15 = this.b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) k31Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, k31Var.c);
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
            boolean z10 = AndroidUtilities.computePerceivedBrightness(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
            boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z4);
            if (!z4) {
                z10 = z11;
            }
            AndroidUtilities.setLightStatusBar(k31Var.getWindow(), z10);
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
