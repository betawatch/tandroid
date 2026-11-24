// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lp2 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public final ln b;
    public float c;
    public final Path d;
    public final /* synthetic */ my0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp2(pp2 pp2Var, Context context) {
        super(context);
        this.e = pp2Var;
        this.b = new ln(250L, this, d53.h);
        this.d = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        View[] viewArr;
        FrameLayout frameLayout;
        float f3;
        float f4;
        byte b = this.a;
        ln lnVar = this.b;
        float f5 = 0.0f;
        my0 my0Var = this.e;
        float f6 = 1.0f;
        Path path = this.d;
        switch (b) {
            case 0:
                float f7 = 1.0f;
                pp2 pp2Var = (pp2) my0Var;
                View[] viewPages = pp2Var.n1.getViewPages();
                this.c = 0.0f;
                int i = 0;
                while (i < viewPages.length) {
                    View view = viewPages[i];
                    if (view == null) {
                        f = f7;
                    } else {
                        np2 np2Var = (np2) view;
                        f = f7;
                        this.c = (np2Var.b() * Utilities.i(f7 - Math.abs(np2Var.getTranslationX() / np2Var.getMeasuredWidth()), f, 0.0f)) + this.c;
                        if (np2Var.getVisibility() == 0) {
                            np2Var.c();
                        }
                    }
                    i++;
                    f7 = f;
                }
                float f8 = f7;
                if (this.c > gm.m) {
                    f8 = 0.0f;
                }
                float e = lnVar.e(false, f8);
                float max = (Math.max(gm.m, this.c) - (gm.m * e)) - (gm.L(10.0f) * Math.max(pp2Var.l1.e, pp2Var.m1.e));
                this.c = max;
                RectF rectF = gm.P;
                rectF.set(pp2Var.u0, max, getWidth() - pp2Var.u0, gm.L(8.0f) + getHeight());
                float U1 = gm.U1(e, gm.L(14.0f), 0);
                canvas.drawRoundRect(rectF, U1, U1, pp2Var.J1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                a8b a8bVar = (a8b) my0Var;
                View[] viewPages2 = a8bVar.l1.getViewPages();
                this.c = 0.0f;
                int i2 = 0;
                while (i2 < viewPages2.length) {
                    View view2 = viewPages2[i2];
                    if (view2 == null) {
                        viewArr = viewPages2;
                        f2 = f6;
                    } else {
                        v7b v7bVar = (v7b) view2;
                        float i3 = Utilities.i(f6 - Math.abs(v7bVar.getTranslationX() / v7bVar.getMeasuredWidth()), f6, f5);
                        float f9 = this.c;
                        r59 r59Var = v7bVar.f;
                        FrameLayout frameLayout2 = v7bVar.e;
                        u46 u46Var = v7bVar.h;
                        f2 = f6;
                        float f10 = (u46Var.t || v7bVar.a == 0) ? gm.q.y : f5;
                        int i4 = 0;
                        while (i4 < r59Var.getChildCount()) {
                            View childAt = r59Var.getChildAt(i4);
                            viewArr = viewPages2;
                            if (u46Var.t) {
                                float y = childAt.getY() + frameLayout2.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y < f10) {
                                    f10 = gm.R1(f10, y, alpha);
                                }
                            } else if (v7bVar.a != 0) {
                                if (childAt.getTag() instanceof Integer) {
                                    frameLayout = frameLayout2;
                                    if (((Integer) childAt.getTag()).intValue() == 33) {
                                        f4 = childAt.getBottom() + frameLayout.getPaddingTop();
                                        f3 = childAt.getTranslationY();
                                        f10 = f3 + f4;
                                        this.c = (f10 * i3) + f9;
                                        if (v7bVar.getVisibility() == 0) {
                                            v7bVar.k();
                                        }
                                    }
                                } else {
                                    frameLayout = frameLayout2;
                                }
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    f4 = frameLayout.getPaddingTop();
                                    f3 = childAt.getY();
                                    f10 = f3 + f4;
                                    this.c = (f10 * i3) + f9;
                                    if (v7bVar.getVisibility() == 0) {
                                    }
                                }
                                i4++;
                                viewPages2 = viewArr;
                                frameLayout2 = frameLayout;
                            } else if (!(childAt instanceof u7b)) {
                                f10 = Math.min(childAt.getY() + frameLayout2.getPaddingTop(), f10);
                            }
                            frameLayout = frameLayout2;
                            i4++;
                            viewPages2 = viewArr;
                            frameLayout2 = frameLayout;
                        }
                        viewArr = viewPages2;
                        this.c = (f10 * i3) + f9;
                        if (v7bVar.getVisibility() == 0) {
                        }
                    }
                    i2++;
                    f6 = f2;
                    viewPages2 = viewArr;
                    f5 = 0.0f;
                }
                float e2 = lnVar.e(false, this.c <= ((float) gm.m) ? f6 : 0.0f);
                float max2 = Math.max(gm.m, this.c) - (gm.m * e2);
                this.c = max2;
                RectF rectF2 = gm.P;
                rectF2.set(a8bVar.u0, max2, getWidth() - a8bVar.u0, gm.L(8.0f) + getHeight());
                float U12 = gm.U1(e2, gm.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U12, U12, a8bVar.L1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U12, U12, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        my0 my0Var = this.e;
        switch (b) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((pp2) my0Var).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((a8b) my0Var).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp2(a8b a8bVar, Context context) {
        super(context);
        this.e = a8bVar;
        this.b = new ln(250L, this, d53.h);
        this.d = new Path();
    }
}
