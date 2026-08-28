package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v8 extends FrameLayout {
    public final /* synthetic */ int a = 2;
    public Object b;
    public float c;
    public Path d;
    public Object e;

    public /* synthetic */ v8(Context context) {
        super(context);
    }

    public void a(float f10, float f11) {
        float[] fArr = (float[]) this.e;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        int i9;
        int i10;
        View[] viewArr;
        boolean z10;
        float f10;
        float f11;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                Path path = this.d;
                t9 t9Var = (t9) this.e;
                View[] viewPages = t9Var.b.getViewPages();
                float f12 = 0.0f;
                this.c = 0.0f;
                int i13 = 0;
                while (i13 < viewPages.length) {
                    View view = viewPages[i13];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        n9 n9Var = (n9) view;
                        float clamp = Utilities.clamp(1.0f - Math.abs(n9Var.getTranslationX() / n9Var.getMeasuredWidth()), 1.0f, f12);
                        float f13 = this.c;
                        wk0 wk0Var = n9Var.f;
                        FrameLayout frameLayout = n9Var.e;
                        f2.m0 m0Var = n9Var.h;
                        float f14 = (m0Var.t || n9Var.a == 0) ? AndroidUtilities.displaySize.y : 0.0f;
                        int i14 = 0;
                        while (i14 < wk0Var.getChildCount()) {
                            View childAt = wk0Var.getChildAt(i14);
                            if (m0Var.t) {
                                float y10 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y10 < f14) {
                                    f14 = AndroidUtilities.lerp(f14, y10, alpha);
                                }
                            } else {
                                if (n9Var.a != 0) {
                                    if (childAt.getTag() instanceof Integer) {
                                        viewArr = viewPages;
                                        if (((Integer) childAt.getTag()).intValue() == 33) {
                                            f11 = childAt.getBottom() + frameLayout.getPaddingTop();
                                            f10 = childAt.getTranslationY();
                                            f14 = f10 + f11;
                                            this.c = (f14 * clamp) + f13;
                                            z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                                            if (z10) {
                                                int i15 = n9Var.a;
                                            }
                                            if (n9Var.getVisibility() == 0) {
                                                n9Var.j();
                                            }
                                        }
                                    } else {
                                        viewArr = viewPages;
                                    }
                                    if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                        f11 = frameLayout.getPaddingTop();
                                        f10 = childAt.getY();
                                        f14 = f10 + f11;
                                        this.c = (f14 * clamp) + f13;
                                        z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                                        if (z10) {
                                        }
                                        if (n9Var.getVisibility() == 0) {
                                        }
                                    }
                                } else if (!(childAt instanceof m9)) {
                                    viewArr = viewPages;
                                    f14 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f14);
                                }
                                i14++;
                                viewPages = viewArr;
                            }
                            viewArr = viewPages;
                            i14++;
                            viewPages = viewArr;
                        }
                        viewArr = viewPages;
                        this.c = (f14 * clamp) + f13;
                        z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                        if (z10) {
                        }
                        if (n9Var.getVisibility() == 0) {
                        }
                    }
                    i13++;
                    viewPages = viewArr;
                    f12 = 0.0f;
                }
                float d = ((org.telegram.ui.Components.y5) this.b).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF = AndroidUtilities.rectTmp;
                i9 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
                float f15 = this.c;
                int width = getWidth();
                i10 = ((org.telegram.ui.ActionBar.f3) t9Var).backgroundPaddingLeft;
                rectF.set(i9, f15, width - i10, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF, lerp, lerp, t9Var.N);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 1:
                Path path2 = this.d;
                nh.j0 j0Var = (nh.j0) this.e;
                View[] viewPages2 = j0Var.d.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        nh.g0 g0Var = (nh.g0) view2;
                        this.c = (g0Var.b() * Utilities.clamp(1.0f - Math.abs(g0Var.getTranslationX() / g0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (g0Var.getVisibility() == 0) {
                            g0Var.c();
                        }
                    }
                }
                float d9 = ((org.telegram.ui.Components.y5) this.b).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = (Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d9)) - (AndroidUtilities.dp(10.0f) * Math.max(j0Var.b.e, j0Var.c.e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                i11 = ((org.telegram.ui.ActionBar.f3) j0Var).backgroundPaddingLeft;
                float f16 = this.c;
                int width2 = getWidth();
                i12 = ((org.telegram.ui.ActionBar.f3) j0Var).backgroundPaddingLeft;
                rectF2.set(i11, f16, width2 - i12, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d9);
                canvas.drawRoundRect(rectF2, lerp2, lerp2, j0Var.L);
                canvas.save();
                path2.rewind();
                path2.addRoundRect(rectF2, lerp2, lerp2, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
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
                ((t9) this.e).dismiss();
                return true;
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((nh.j0) this.e).dismiss();
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.d;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.c), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.c));
                float[] fArr = (float[]) this.e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.b;
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
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(nh.j0 j0Var, Context context) {
        super(context);
        this.e = j0Var;
        this.b = new org.telegram.ui.Components.y5(this, 250L, gr.h);
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(t9 t9Var, Context context) {
        super(context);
        this.e = t9Var;
        this.b = new org.telegram.ui.Components.y5(this, 250L, gr.h);
        this.d = new Path();
    }
}
