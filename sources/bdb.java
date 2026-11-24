// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bdb extends FrameLayout {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdb(Context context) {
        super(context);
        this.a = (byte) 7;
        this.b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                ddb ddbVar = fdbVar.c;
                if (ddbVar != null && ddbVar.getEditField() != null) {
                    dw3 dw3Var = fdbVar.W;
                    if (dw3Var != null && dw3Var.h) {
                        float x = fdbVar.c.getEditField().getX() + fdbVar.c.getEditField().getPaddingLeft();
                        dw3 dw3Var2 = fdbVar.W;
                        fdbVar.d0 = x + dw3Var2.n;
                        fdbVar.a0 = dw3Var2.r;
                    } else if (fdbVar.b0 != null && fdbVar.c0 != null) {
                        fdbVar.d0 = fdbVar.c.getEditField().getX() + fdbVar.c.getEditField().getPaddingLeft() + gm.L(12.0f);
                    }
                }
                boolean z = (!fdbVar.s || fdbVar.w || (arrayList = fdbVar.x) == null || arrayList.isEmpty() || fdbVar.y) ? false : true;
                float e = fdbVar.S.e(false, z ? 1.0f : 0.0f);
                float e2 = fdbVar.T.e(false, z ? 1.0f : 0.0f);
                float e3 = fdbVar.e0.e(false, fdbVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    fdbVar.d.setVisibility(8);
                }
                fdbVar.P.rewind();
                float left = fdbVar.e.getLeft();
                int left2 = fdbVar.e.getLeft();
                ArrayList arrayList2 = fdbVar.x;
                float y = hg9.y(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                ln lnVar = fdbVar.g0;
                float f3 = lnVar.c;
                boolean z2 = f3 <= 0.0f;
                float f4 = y - left;
                if (f4 > 0.0f) {
                    f3 = lnVar.e(z2, f4);
                }
                float e4 = fdbVar.f0.e(z2, (left + y) / 2.0f);
                ddb ddbVar2 = fdbVar.c;
                if (ddbVar2 != null && ddbVar2.getEditField() != null) {
                    int i = fdbVar.h;
                    if (i == 0) {
                        fdbVar.d.setTranslationY(((((-fdbVar.c.getEditField().getHeight()) - fdbVar.c.getEditField().getScrollY()) + fdbVar.a0) + gm.L(5.0f)) - fdbVar.c.getEditFieldBottomOffset());
                    } else if (i == 1) {
                        fdbVar.d.setTranslationY((((((-fdbVar.getMeasuredHeight()) - fdbVar.c.getEditField().getScrollY()) + fdbVar.a0) + gm.L(20.0f)) + fdbVar.d.getHeight()) - fdbVar.c.getEditFieldBottomOffset());
                    }
                }
                float f5 = f3 / 4.0f;
                float f6 = f3 / 2.0f;
                int max = (int) Math.max((fdbVar.d0 - Math.max(f5, Math.min(f6, gm.L(66.0f)))) - fdbVar.e.getLeft(), 0.0f);
                if (fdbVar.e.getPaddingLeft() != max) {
                    int paddingLeft = fdbVar.e.getPaddingLeft() - max;
                    f = 1.0f;
                    fdbVar.e.setPadding(max, 0, 0, 0);
                    fdbVar.e.scrollBy(paddingLeft, 0);
                } else {
                    f = 1.0f;
                }
                fdbVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f5, Math.min(f6, gm.L(66.0f)))) - fdbVar.e.getLeft(), 0.0f)) - max);
                float translationX = fdbVar.e.getTranslationX() + (e4 - f6) + fdbVar.e.getPaddingLeft();
                float translationY = fdbVar.e.getTranslationY() + fdbVar.e.getTop() + fdbVar.e.getPaddingTop() + (fdbVar.h == 0 ? 0 : gm.L(6.66f));
                float min = Math.min(fdbVar.e.getTranslationX() + e4 + f6 + fdbVar.e.getPaddingLeft(), fdbVar.getWidth() - fdbVar.d.getPaddingRight());
                float translationY2 = (fdbVar.e.getTranslationY() + fdbVar.e.getBottom()) - (fdbVar.h == 0 ? gm.L(6.66f) : 0);
                float min2 = Math.min(gm.L(9.0f), f6) * 2.0f;
                int i2 = fdbVar.h;
                if (i2 == 0) {
                    RectF rectF = gm.P;
                    float f7 = translationY2 - min2;
                    float f8 = translationX + min2;
                    rectF.set(translationX, f7, f8, translationY2);
                    fdbVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f9 = translationY + min2;
                    rectF.set(translationX, translationY, f8, f9);
                    fdbVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f10 = min - min2;
                    rectF.set(f10, translationY, min, f9);
                    fdbVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f10, f7, min, translationY2);
                    fdbVar.P.arcTo(rectF, 0.0f, 90.0f);
                    fdbVar.P.lineTo(gm.L(8.66f) + e3, translationY2);
                    fdbVar.P.lineTo(e3, gm.L(6.66f) + translationY2);
                    fdbVar.P.lineTo(e3 - gm.L(8.66f), translationY2);
                } else if (i2 == 1) {
                    RectF rectF2 = gm.P;
                    float f11 = min - min2;
                    float f12 = translationY + min2;
                    rectF2.set(f11, translationY, min, f12);
                    fdbVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f13 = translationY2 - min2;
                    rectF2.set(f11, f13, min, translationY2);
                    fdbVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f14 = min2 + translationX;
                    rectF2.set(translationX, f13, f14, translationY2);
                    fdbVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f14, f12);
                    fdbVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    fdbVar.P.lineTo(e3 - gm.L(8.66f), translationY);
                    fdbVar.P.lineTo(e3, translationY - gm.L(6.66f));
                    fdbVar.P.lineTo(gm.L(8.66f) + e3, translationY);
                }
                fdbVar.P.close();
                if (fdbVar.R == null) {
                    Paint paint = new Paint(1);
                    fdbVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(gm.L(2.0f)));
                    fdbVar.R.setShadowLayer(gm.L(4.33f), 0.0f, gm.L(0.33333334f), 855638016);
                    fdbVar.R.setColor(cmb.v0(cmb.sf, fdbVar.b));
                }
                if (e < f) {
                    fdbVar.Q.rewind();
                    float L = fdbVar.h == 0 ? gm.L(6.66f) + translationY2 : translationY - gm.L(6.66f);
                    double d = e3 - translationX;
                    double d2 = L - translationY;
                    f2 = 255.0f;
                    double d3 = e3 - min;
                    double d4 = L - translationY2;
                    fdbVar.Q.addCircle(e3, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(fdbVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, fdbVar.getWidth(), fdbVar.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f2 = 255.0f;
                }
                canvas.drawPath(fdbVar.P, fdbVar.R);
                canvas.save();
                canvas.clipPath(fdbVar.P);
                super.dispatchDraw(canvas);
                float f15 = fdbVar.g0.c;
                float f16 = fdbVar.f0.c;
                float f17 = f15 / 2.0f;
                float translationX2 = fdbVar.e.getTranslationX() + (f16 - f17) + fdbVar.e.getPaddingLeft();
                float paddingTop = fdbVar.e.getPaddingTop() + fdbVar.e.getTop();
                float min3 = Math.min(fdbVar.e.getTranslationX() + f16 + f17 + fdbVar.e.getPaddingLeft(), fdbVar.getWidth() - fdbVar.d.getPaddingRight());
                float bottom = fdbVar.e.getBottom();
                float e5 = fdbVar.U.e(false, fdbVar.e.canScrollHorizontally(-1) ? f : 0.0f);
                if (e5 > 0.0f) {
                    int i3 = (int) translationX2;
                    cmb.E4.setBounds(i3, (int) paddingTop, gm.L(32.0f) + i3, (int) bottom);
                    cmb.E4.setAlpha((int) (e5 * f2));
                    cmb.E4.draw(canvas);
                }
                float e6 = fdbVar.V.e(false, fdbVar.e.canScrollHorizontally(1) ? f : 0.0f);
                if (e6 > 0.0f) {
                    int i4 = (int) min3;
                    cmb.D4.setBounds(i4 - gm.L(32.0f), (int) paddingTop, i4, (int) bottom);
                    cmb.D4.setAlpha((int) (e6 * f2));
                    cmb.D4.draw(canvas);
                }
                canvas.restore();
                if (fdbVar.S.c < f) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 7:
                int save = canvas.save();
                canvas.clipPath((Path) obj);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                float a = ((u51) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        tk5 tk5Var;
        tk5 tk5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                boolean drawChild = super.drawChild(canvas, view, j);
                rob robVar = (rob) obj;
                aVar = ((d) robVar).actionBar;
                if (view == aVar) {
                    tk5Var = ((d) robVar).parentLayout;
                    if (tk5Var != null) {
                        tk5Var2 = ((d) robVar).parentLayout;
                        aVar2 = ((d) robVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((d) robVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) tk5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 2:
                sxb sxbVar = (sxb) obj;
                if (view == sxbVar.b1 && sxbVar.isInPreviewMode()) {
                    ((ActionBarLayout) sxbVar.getParentLayout()).n(canvas, (int) (sxbVar.X * 255.0f), (int) (sxbVar.b1.getY() + sxbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 6:
                if (!((moc) obj).a || view.getTag() == moc.o0) {
                    return super.drawChild(canvas, view, j);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                k8c k8cVar = (k8c) this.b;
                int translationY = (int) ((k8cVar.q1 - k8cVar.t0) - getTranslationY());
                Drawable drawable = k8cVar.l1;
                drawable.setBounds(0, translationY, getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                k8c k8cVar = (k8c) obj;
                if (motionEvent.getAction() != 0 || k8cVar.q1 == 0 || motionEvent.getY() >= k8cVar.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                k8cVar.dismiss();
                return true;
            case 6:
                return ((moc) obj).a || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                setPadding(fdbVar.n, fdbVar.h == 0 ? gm.L(8.0f) : gm.L(6.66f), fdbVar.n, fdbVar.h == 0 ? gm.L(6.66f) : gm.L(8.0f));
                super.onMeasure(i, i2);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                rob robVar = (rob) obj;
                aVar = ((d) robVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((d) robVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((d) robVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) robVar.p0.getLayoutParams()).topMargin = measuredHeight;
                robVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                measureChildWithMargins(robVar.r0, i, 0, i2, 0);
                break;
            case 2:
            case 3:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((p5c) obj).M.getLayoutParams()).topMargin = gm.L(16.0f) + gm.m;
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 7:
                super.onSizeChanged(i, i2, i3, i4);
                Path path = (Path) this.b;
                float paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return !((k8c) this.b).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 8:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((asc) this.b).k0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        switch (this.a) {
            case 3:
                super.setPressed(z);
                ((u51) this.b).c(z);
                break;
            default:
                super.setPressed(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f);
                ((k8c) this.b).E0();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                fdb fdbVar = (fdb) this.b;
                boolean z = getVisibility() == i;
                super.setVisibility(i);
                if (!z) {
                    boolean z2 = i == 0;
                    if (fdbVar.e != null) {
                        for (int i2 = 0; i2 < fdbVar.e.getChildCount(); i2++) {
                            cdb cdbVar = fdbVar.e;
                            if (z2) {
                                edb edbVar = (edb) cdbVar.getChildAt(i2);
                                Drawable drawable = edbVar.b;
                                if (drawable instanceof vm) {
                                    ((vm) drawable).b(edbVar);
                                }
                                edbVar.c = true;
                            } else {
                                edb edbVar2 = (edb) cdbVar.getChildAt(i2);
                                Drawable drawable2 = edbVar2.b;
                                if (drawable2 instanceof vm) {
                                    ((vm) drawable2).o(edbVar2);
                                }
                                edbVar2.c = false;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdb(Activity activity) {
        super(activity);
        this.a = (byte) 3;
        this.b = new u51(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bdb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
