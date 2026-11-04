package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.u5 b;
    public float c;
    public final Path d;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(ji.b0 b0Var, Context context) {
        super(context);
        this.e = b0Var;
        this.b = new org.telegram.ui.Components.u5(this, 250L, xq.h);
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
        float y9;
        switch (this.a) {
            case 0:
                t8 t8Var = (t8) this.e;
                View[] viewPages = t8Var.j1.getViewPages();
                float f10 = 0.0f;
                this.c = 0.0f;
                int i3 = 0;
                while (i3 < viewPages.length) {
                    View view = viewPages[i3];
                    if (view != null) {
                        o8 o8Var = (o8) view;
                        float i10 = Utilities.i(1.0f - Math.abs(o8Var.getTranslationX() / o8Var.getMeasuredWidth()), 1.0f, f10);
                        float f11 = this.c;
                        tj0 tj0Var = o8Var.f;
                        FrameLayout frameLayout = o8Var.e;
                        u4.b0 b0Var = o8Var.h;
                        float f12 = (b0Var.t || o8Var.a == 0) ? org.telegram.messenger.g0.q.y : f10;
                        for (int i11 = 0; i11 < tj0Var.getChildCount(); i11++) {
                            View childAt = tj0Var.getChildAt(i11);
                            if (b0Var.t) {
                                float y10 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y10 < f12) {
                                    f12 = org.telegram.messenger.g0.T1(f12, y10, alpha);
                                }
                            } else if (o8Var.a != 0) {
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                                    paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                    y9 = childAt.getTranslationY();
                                } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    paddingTop = frameLayout.getPaddingTop();
                                    y9 = childAt.getY();
                                }
                                f12 = y9 + paddingTop;
                                this.c = (f12 * i10) + f11;
                                if (t8Var.d) {
                                    int i12 = o8Var.a;
                                }
                                if (o8Var.getVisibility() != 0) {
                                    o8Var.k();
                                }
                            } else if (!(childAt instanceof n8)) {
                                f12 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f12);
                            }
                        }
                        this.c = (f12 * i10) + f11;
                        if (t8Var.d) {
                        }
                        if (o8Var.getVisibility() != 0) {
                        }
                    }
                    i3++;
                    f10 = 0.0f;
                }
                float e10 = this.b.e(false, this.c <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float max = Math.max(org.telegram.messenger.g0.m, this.c) - (org.telegram.messenger.g0.m * e10);
                this.c = max;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(t8Var.u0, max, getWidth() - t8Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF, W1, W1, t8Var.J1);
                canvas.save();
                Path path = this.d;
                path.rewind();
                path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                ji.b0 b0Var2 = (ji.b0) this.e;
                View[] viewPages2 = b0Var2.l1.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        ji.z zVar = (ji.z) view2;
                        this.c = (zVar.b() * Utilities.i(1.0f - Math.abs(zVar.getTranslationX() / zVar.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (zVar.getVisibility() == 0) {
                            zVar.c();
                        }
                    }
                }
                float e11 = this.b.e(false, this.c <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
                float max2 = (Math.max(org.telegram.messenger.g0.m, this.c) - (org.telegram.messenger.g0.m * e11)) - (org.telegram.messenger.g0.L(10.0f) * Math.max(b0Var2.j1.e, b0Var2.k1.e));
                this.c = max2;
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(b0Var2.u0, max2, getWidth() - b0Var2.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
                float W12 = org.telegram.messenger.g0.W1(e11, org.telegram.messenger.g0.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, W12, W12, b0Var2.H1);
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
                    ((t8) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((ji.b0) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(t8 t8Var, Context context) {
        super(context);
        this.e = t8Var;
        this.b = new org.telegram.ui.Components.u5(this, 250L, xq.h);
        this.d = new Path();
    }
}
