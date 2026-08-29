package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i8 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public Path b;
    public float c;
    public Object d;
    public Object e;

    public /* synthetic */ i8(Context context) {
        super(context);
    }

    public void a(float f9, float f10) {
        float[] fArr = (float[]) this.e;
        fArr[7] = f9;
        fArr[6] = f9;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewArr;
        boolean z10;
        float f9;
        float f10;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                Path path = this.b;
                e9 e9Var = (e9) this.e;
                View[] viewPages = e9Var.b.getViewPages();
                float f11 = 0.0f;
                this.c = 0.0f;
                int i14 = 0;
                while (i14 < viewPages.length) {
                    View view = viewPages[i14];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        y8 y8Var = (y8) view;
                        float clamp = Utilities.clamp(1.0f - Math.abs(y8Var.getTranslationX() / y8Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.c;
                        jl0 jl0Var = y8Var.f;
                        FrameLayout frameLayout = y8Var.e;
                        f2.j0 j0Var = y8Var.h;
                        float f13 = (j0Var.t || y8Var.a == 0) ? AndroidUtilities.displaySize.y : 0.0f;
                        int i15 = 0;
                        while (i15 < jl0Var.getChildCount()) {
                            View childAt = jl0Var.getChildAt(i15);
                            if (j0Var.t) {
                                float y8 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y8 < f13) {
                                    f13 = AndroidUtilities.lerp(f13, y8, alpha);
                                }
                            } else {
                                if (y8Var.a != 0) {
                                    if (childAt.getTag() instanceof Integer) {
                                        viewArr = viewPages;
                                        if (((Integer) childAt.getTag()).intValue() == 33) {
                                            f10 = childAt.getBottom() + frameLayout.getPaddingTop();
                                            f9 = childAt.getTranslationY();
                                            f13 = f9 + f10;
                                            this.c = (f13 * clamp) + f12;
                                            z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                                            if (z10) {
                                                int i16 = y8Var.a;
                                            }
                                            if (y8Var.getVisibility() == 0) {
                                                y8Var.j();
                                            }
                                        }
                                    } else {
                                        viewArr = viewPages;
                                    }
                                    if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                        f10 = frameLayout.getPaddingTop();
                                        f9 = childAt.getY();
                                        f13 = f9 + f10;
                                        this.c = (f13 * clamp) + f12;
                                        z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                                        if (z10) {
                                        }
                                        if (y8Var.getVisibility() == 0) {
                                        }
                                    }
                                } else if (!(childAt instanceof x8)) {
                                    viewArr = viewPages;
                                    f13 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f13);
                                }
                                i15++;
                                viewPages = viewArr;
                            }
                            viewArr = viewPages;
                            i15++;
                            viewPages = viewArr;
                        }
                        viewArr = viewPages;
                        this.c = (f13 * clamp) + f12;
                        z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                        if (z10) {
                        }
                        if (y8Var.getVisibility() == 0) {
                        }
                    }
                    i14++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                float d = ((org.telegram.ui.Components.d6) this.d).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
                float f14 = this.c;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.f3) e9Var).backgroundPaddingLeft;
                rectF.set(i10, f14, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF, lerp, lerp, e9Var.N);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 1:
            default:
                super.dispatchDraw(canvas);
                break;
            case 2:
                Path path2 = this.b;
                qh.i0 i0Var = (qh.i0) this.e;
                View[] viewPages2 = i0Var.d.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        qh.f0 f0Var = (qh.f0) view2;
                        this.c = (f0Var.b() * Utilities.clamp(1.0f - Math.abs(f0Var.getTranslationX() / f0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (f0Var.getVisibility() == 0) {
                            f0Var.c();
                        }
                    }
                }
                float d10 = ((org.telegram.ui.Components.d6) this.d).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = (Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d10)) - (AndroidUtilities.dp(10.0f) * Math.max(i0Var.b.e, i0Var.c.e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                i12 = ((org.telegram.ui.ActionBar.f3) i0Var).backgroundPaddingLeft;
                float f15 = this.c;
                int width2 = getWidth();
                i13 = ((org.telegram.ui.ActionBar.f3) i0Var).backgroundPaddingLeft;
                rectF2.set(i12, f15, width2 - i13, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d10);
                canvas.drawRoundRect(rectF2, lerp2, lerp2, i0Var.L);
                canvas.save();
                path2.rewind();
                path2.addRoundRect(rectF2, lerp2, lerp2, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((e9) this.e).dismiss();
                return true;
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((qh.i0) this.e).dismiss();
                return true;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.c), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.c));
                float[] fArr = (float[]) this.e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.d;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.c), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.c), AndroidUtilities.dp(8.0f));
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 1:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(qh.i0 i0Var, Context context) {
        super(context);
        this.e = i0Var;
        this.d = new org.telegram.ui.Components.d6(this, 250L, jr.h);
        this.b = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(e9 e9Var, Context context) {
        super(context);
        this.e = e9Var;
        this.d = new org.telegram.ui.Components.d6(this, 250L, jr.h);
        this.b = new Path();
    }
}
