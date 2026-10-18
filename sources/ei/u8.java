package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.im0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class u8 extends FrameLayout {
    public final /* synthetic */ int a = 2;
    public Object b;
    public float c;
    public Path d;
    public Object e;

    public /* synthetic */ u8(Context context) {
        super(context);
    }

    public void a(float f7, float f10) {
        float[] fArr = (float[]) this.e;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        View[] viewArr;
        boolean z10;
        float f7;
        float f10;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                Path path = this.d;
                r9 r9Var = (r9) this.e;
                View[] viewPages = r9Var.b.getViewPages();
                float f11 = 0.0f;
                this.c = 0.0f;
                int i14 = 0;
                while (i14 < viewPages.length) {
                    View view = viewPages[i14];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        k9 k9Var = (k9) view;
                        float clamp = Utilities.clamp(1.0f - Math.abs(k9Var.getTranslationX() / k9Var.getMeasuredWidth()), 1.0f, f11);
                        float f12 = this.c;
                        im0 im0Var = k9Var.f;
                        FrameLayout frameLayout = k9Var.e;
                        s4.b0 b0Var = k9Var.h;
                        float f13 = (b0Var.t || k9Var.a == 0) ? AndroidUtilities.displaySize.y : f11;
                        int i15 = 0;
                        while (i15 < im0Var.getChildCount()) {
                            View childAt = im0Var.getChildAt(i15);
                            if (b0Var.t) {
                                float y3 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y3 < f13) {
                                    f13 = AndroidUtilities.lerp(f13, y3, alpha);
                                }
                            } else {
                                if (k9Var.a != 0) {
                                    if (childAt.getTag() instanceof Integer) {
                                        viewArr = viewPages;
                                        if (((Integer) childAt.getTag()).intValue() == 33) {
                                            f10 = childAt.getBottom() + frameLayout.getPaddingTop();
                                            f7 = childAt.getTranslationY();
                                            f13 = f7 + f10;
                                            this.c = (f13 * clamp) + f12;
                                            z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                                            if (z10) {
                                                int i16 = k9Var.a;
                                            }
                                            if (k9Var.getVisibility() == 0) {
                                                k9Var.j();
                                            }
                                        }
                                    } else {
                                        viewArr = viewPages;
                                    }
                                    if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                        f10 = frameLayout.getPaddingTop();
                                        f7 = childAt.getY();
                                        f13 = f7 + f10;
                                        this.c = (f13 * clamp) + f12;
                                        z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                                        if (z10) {
                                        }
                                        if (k9Var.getVisibility() == 0) {
                                        }
                                    }
                                } else if (!(childAt instanceof j9)) {
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
                        z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                        if (z10) {
                        }
                        if (k9Var.getVisibility() == 0) {
                        }
                    }
                    i14++;
                    viewPages = viewArr;
                    f11 = 0.0f;
                }
                float d = ((org.telegram.ui.Components.f6) this.b).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
                float f14 = this.c;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.f3) r9Var).backgroundPaddingLeft;
                rectF.set(i10, f14, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF, lerp, lerp, r9Var.R);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 1:
                Path path2 = this.d;
                hi.k0 k0Var = (hi.k0) this.e;
                View[] viewPages2 = k0Var.d.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        hi.h0 h0Var = (hi.h0) view2;
                        this.c = (h0Var.b() * Utilities.clamp(1.0f - Math.abs(h0Var.getTranslationX() / h0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (h0Var.getVisibility() == 0) {
                            h0Var.c();
                        }
                    }
                }
                float d10 = ((org.telegram.ui.Components.f6) this.b).d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = (Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d10)) - (AndroidUtilities.dp(10.0f) * Math.max(k0Var.b.e, k0Var.c.e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                i12 = ((org.telegram.ui.ActionBar.f3) k0Var).backgroundPaddingLeft;
                float f15 = this.c;
                int width2 = getWidth();
                i13 = ((org.telegram.ui.ActionBar.f3) k0Var).backgroundPaddingLeft;
                rectF2.set(i12, f15, width2 - i13, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d10);
                canvas.drawRoundRect(rectF2, lerp2, lerp2, k0Var.P);
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
                ((r9) this.e).dismiss();
                return true;
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((hi.k0) this.e).dismiss();
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
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(hi.k0 k0Var, Context context) {
        super(context);
        this.e = k0Var;
        this.b = new org.telegram.ui.Components.f6(this, 250L, bs.h);
        this.d = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(r9 r9Var, Context context) {
        super(context);
        this.e = r9Var;
        this.b = new org.telegram.ui.Components.f6(this, 250L, bs.h);
        this.d = new Path();
    }
}
