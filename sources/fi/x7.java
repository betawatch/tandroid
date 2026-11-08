package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.w5 b;
    public float c;
    public final Path d;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(ii.d0 d0Var, Context context) {
        super(context);
        this.e = d0Var;
        this.b = new org.telegram.ui.Components.w5(this, 250L, xq.h);
        this.d = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float paddingTop;
        float y10;
        switch (this.a) {
            case 0:
                s8 s8Var = (s8) this.e;
                View[] viewPages = s8Var.i1.getViewPages();
                float f10 = 0.0f;
                this.c = 0.0f;
                int i7 = 0;
                while (i7 < viewPages.length) {
                    View view = viewPages[i7];
                    if (view != null) {
                        n8 n8Var = (n8) view;
                        float i10 = Utilities.i(1.0f - Math.abs(n8Var.getTranslationX() / n8Var.getMeasuredWidth()), 1.0f, f10);
                        float f11 = this.c;
                        pj0 pj0Var = n8Var.f;
                        FrameLayout frameLayout = n8Var.e;
                        v4.b0 b0Var = n8Var.h;
                        float f12 = (b0Var.t || n8Var.a == 0) ? org.telegram.messenger.g0.q.y : f10;
                        for (int i11 = 0; i11 < pj0Var.getChildCount(); i11++) {
                            View childAt = pj0Var.getChildAt(i11);
                            if (b0Var.t) {
                                float y11 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y11 < f12) {
                                    f12 = org.telegram.messenger.g0.T1(f12, y11, alpha);
                                }
                            } else if (n8Var.a != 0) {
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                                    paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                    y10 = childAt.getTranslationY();
                                } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    paddingTop = frameLayout.getPaddingTop();
                                    y10 = childAt.getY();
                                }
                                f12 = y10 + paddingTop;
                                this.c = (f12 * i10) + f11;
                                if (s8Var.d) {
                                    int i12 = n8Var.a;
                                }
                                if (n8Var.getVisibility() != 0) {
                                    n8Var.k();
                                }
                            } else if (!(childAt instanceof m8)) {
                                f12 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f12);
                            }
                        }
                        this.c = (f12 * i10) + f11;
                        if (s8Var.d) {
                        }
                        if (n8Var.getVisibility() != 0) {
                        }
                    }
                    i7++;
                    f10 = 0.0f;
                }
                float e10 = this.b.e(false, this.c <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float max = Math.max(org.telegram.messenger.g0.m, this.c) - (org.telegram.messenger.g0.m * e10);
                this.c = max;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(s8Var.t0, max, getWidth() - s8Var.t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF, W1, W1, s8Var.I1);
                canvas.save();
                Path path = this.d;
                path.rewind();
                path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                ii.d0 d0Var = (ii.d0) this.e;
                View[] viewPages2 = d0Var.k1.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        ii.b0 b0Var2 = (ii.b0) view2;
                        this.c = (b0Var2.b() * Utilities.i(1.0f - Math.abs(b0Var2.getTranslationX() / b0Var2.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (b0Var2.getVisibility() == 0) {
                            b0Var2.c();
                        }
                    }
                }
                float e11 = this.b.e(false, this.c <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float max2 = (Math.max(org.telegram.messenger.g0.m, this.c) - (org.telegram.messenger.g0.m * e11)) - (org.telegram.messenger.g0.L(10.0f) * Math.max(d0Var.i1.e, d0Var.j1.e));
                this.c = max2;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(d0Var.t0, max2, getWidth() - d0Var.t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W12 = org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W12, W12, d0Var.G1);
                canvas.save();
                Path path2 = this.d;
                path2.rewind();
                path2.addRoundRect(rectF2, W12, W12, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((s8) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((ii.d0) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(s8 s8Var, Context context) {
        super(context);
        this.e = s8Var;
        this.b = new org.telegram.ui.Components.w5(this, 250L, xq.h);
        this.d = new Path();
    }
}
