// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h8b extends FrameLayout {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8b(Context context) {
        super(context);
        this.a = (byte) 9;
        this.b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k8b k8bVar = (k8b) obj;
                if (k8bVar.E > 0.0f && k8bVar.s != null) {
                    k8bVar.w.reset();
                    float width = getWidth() / k8bVar.n.getWidth();
                    k8bVar.w.postScale(width, width);
                    k8bVar.r.setLocalMatrix(k8bVar.w);
                    k8bVar.s.setAlpha((int) (k8bVar.E * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k8bVar.s);
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                zeb zebVar = (zeb) obj;
                xeb xebVar = zebVar.c;
                if (xebVar != null && xebVar.getEditField() != null) {
                    mv3 mv3Var = zebVar.W;
                    if (mv3Var != null && mv3Var.h) {
                        float x = zebVar.c.getEditField().getX() + zebVar.c.getEditField().getPaddingLeft();
                        mv3 mv3Var2 = zebVar.W;
                        zebVar.d0 = x + mv3Var2.n;
                        zebVar.a0 = mv3Var2.r;
                    } else if (zebVar.b0 != null && zebVar.c0 != null) {
                        zebVar.d0 = zebVar.c.getEditField().getX() + zebVar.c.getEditField().getPaddingLeft() + hl.L(12.0f);
                    }
                }
                boolean z = (!zebVar.s || zebVar.w || (arrayList = zebVar.x) == null || arrayList.isEmpty() || zebVar.y) ? false : true;
                float e = zebVar.S.e(false, z ? 1.0f : 0.0f);
                float e2 = zebVar.T.e(false, z ? 1.0f : 0.0f);
                float e3 = zebVar.e0.e(false, zebVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    zebVar.d.setVisibility(8);
                }
                zebVar.P.rewind();
                float left = zebVar.e.getLeft();
                int left2 = zebVar.e.getLeft();
                ArrayList arrayList2 = zebVar.x;
                float y = uh9.y(44.0f, arrayList2 == null ? 0 : arrayList2.size(), left2);
                mm mmVar = zebVar.g0;
                float f2 = mmVar.c;
                boolean z2 = f2 <= 0.0f;
                float f3 = y - left;
                if (f3 > 0.0f) {
                    f2 = mmVar.e(z2, f3);
                }
                float e4 = zebVar.f0.e(z2, (left + y) / 2.0f);
                xeb xebVar2 = zebVar.c;
                if (xebVar2 != null && xebVar2.getEditField() != null) {
                    int i = zebVar.h;
                    if (i == 0) {
                        zebVar.d.setTranslationY(((((-zebVar.c.getEditField().getHeight()) - zebVar.c.getEditField().getScrollY()) + zebVar.a0) + hl.L(5.0f)) - zebVar.c.getEditFieldBottomOffset());
                    } else if (i == 1) {
                        zebVar.d.setTranslationY((((((-zebVar.getMeasuredHeight()) - zebVar.c.getEditField().getScrollY()) + zebVar.a0) + hl.L(20.0f)) + zebVar.d.getHeight()) - zebVar.c.getEditFieldBottomOffset());
                    }
                }
                float f4 = f2 / 4.0f;
                float f5 = f2 / 2.0f;
                int max = (int) Math.max((zebVar.d0 - Math.max(f4, Math.min(f5, hl.L(66.0f)))) - zebVar.e.getLeft(), 0.0f);
                if (zebVar.e.getPaddingLeft() != max) {
                    int paddingLeft = zebVar.e.getPaddingLeft() - max;
                    f = 1.0f;
                    zebVar.e.setPadding(max, 0, 0, 0);
                    zebVar.e.scrollBy(paddingLeft, 0);
                } else {
                    f = 1.0f;
                }
                zebVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f4, Math.min(f5, hl.L(66.0f)))) - zebVar.e.getLeft(), 0.0f)) - max);
                float translationX = zebVar.e.getTranslationX() + (e4 - f5) + zebVar.e.getPaddingLeft();
                float translationY = zebVar.e.getTranslationY() + zebVar.e.getTop() + zebVar.e.getPaddingTop() + (zebVar.h == 0 ? 0 : hl.L(6.66f));
                float min = Math.min(zebVar.e.getTranslationX() + e4 + f5 + zebVar.e.getPaddingLeft(), zebVar.getWidth() - zebVar.d.getPaddingRight());
                float translationY2 = (zebVar.e.getTranslationY() + zebVar.e.getBottom()) - (zebVar.h == 0 ? hl.L(6.66f) : 0);
                float min2 = Math.min(hl.L(9.0f), f5) * 2.0f;
                int i2 = zebVar.h;
                if (i2 == 0) {
                    RectF rectF = hl.P;
                    float f6 = translationY2 - min2;
                    float f7 = translationX + min2;
                    rectF.set(translationX, f6, f7, translationY2);
                    zebVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f8 = translationY + min2;
                    rectF.set(translationX, translationY, f7, f8);
                    zebVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f9 = min - min2;
                    rectF.set(f9, translationY, min, f8);
                    zebVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f9, f6, min, translationY2);
                    zebVar.P.arcTo(rectF, 0.0f, 90.0f);
                    zebVar.P.lineTo(hl.L(8.66f) + e3, translationY2);
                    zebVar.P.lineTo(e3, hl.L(6.66f) + translationY2);
                    zebVar.P.lineTo(e3 - hl.L(8.66f), translationY2);
                } else if (i2 == 1) {
                    RectF rectF2 = hl.P;
                    float f10 = min - min2;
                    float f11 = translationY + min2;
                    rectF2.set(f10, translationY, min, f11);
                    zebVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f12 = translationY2 - min2;
                    rectF2.set(f10, f12, min, translationY2);
                    zebVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f13 = min2 + translationX;
                    rectF2.set(translationX, f12, f13, translationY2);
                    zebVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, translationY, f13, f11);
                    zebVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    zebVar.P.lineTo(e3 - hl.L(8.66f), translationY);
                    zebVar.P.lineTo(e3, translationY - hl.L(6.66f));
                    zebVar.P.lineTo(hl.L(8.66f) + e3, translationY);
                }
                zebVar.P.close();
                if (zebVar.R == null) {
                    Paint paint = new Paint(1);
                    zebVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(hl.L(2.0f)));
                    zebVar.R.setShadowLayer(hl.L(4.33f), 0.0f, hl.L(0.33333334f), 855638016);
                    zebVar.R.setColor(aob.v0(aob.tf, zebVar.b));
                }
                if (e < f) {
                    zebVar.Q.rewind();
                    float L = zebVar.h == 0 ? hl.L(6.66f) + translationY2 : translationY - hl.L(6.66f);
                    double d = e3 - translationX;
                    double d2 = L - translationY;
                    double d3 = e3 - min;
                    double d4 = L - translationY2;
                    zebVar.Q.addCircle(e3, L, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(zebVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, zebVar.getWidth(), zebVar.getHeight(), (int) (e * 255.0f), 31);
                }
                canvas.drawPath(zebVar.P, zebVar.R);
                canvas.save();
                canvas.clipPath(zebVar.P);
                super.dispatchDraw(canvas);
                float f14 = zebVar.g0.c;
                float f15 = zebVar.f0.c;
                float f16 = f14 / 2.0f;
                float translationX2 = zebVar.e.getTranslationX() + (f15 - f16) + zebVar.e.getPaddingLeft();
                float paddingTop = zebVar.e.getPaddingTop() + zebVar.e.getTop();
                float min3 = Math.min(zebVar.e.getTranslationX() + f15 + f16 + zebVar.e.getPaddingLeft(), zebVar.getWidth() - zebVar.d.getPaddingRight());
                float bottom = zebVar.e.getBottom();
                float e5 = zebVar.U.e(false, zebVar.e.canScrollHorizontally(-1) ? f : 0.0f);
                if (e5 > 0.0f) {
                    int i3 = (int) translationX2;
                    aob.F4.setBounds(i3, (int) paddingTop, hl.L(32.0f) + i3, (int) bottom);
                    aob.F4.setAlpha((int) (e5 * 255.0f));
                    aob.F4.draw(canvas);
                }
                float e6 = zebVar.V.e(false, zebVar.e.canScrollHorizontally(1) ? f : 0.0f);
                if (e6 > 0.0f) {
                    int i4 = (int) min3;
                    aob.E4.setBounds(i4 - hl.L(32.0f), (int) paddingTop, i4, (int) bottom);
                    aob.E4.setAlpha((int) (e6 * 255.0f));
                    aob.E4.draw(canvas);
                }
                canvas.restore();
                if (zebVar.S.c < f) {
                    canvas.restore();
                    canvas.restore();
                    break;
                }
                break;
            case 9:
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

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((k8b) this.b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 5:
                float a = ((v41) this.b).a(0.03f);
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
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                pqb pqbVar = (pqb) obj;
                aVar = ((e) pqbVar).actionBar;
                if (view == aVar) {
                    wk5Var = ((e) pqbVar).parentLayout;
                    if (wk5Var != null) {
                        wk5Var2 = ((e) pqbVar).parentLayout;
                        aVar2 = ((e) pqbVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((e) pqbVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) wk5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 4:
                tzb tzbVar = (tzb) obj;
                if (view == tzbVar.b1 && tzbVar.isInPreviewMode()) {
                    ((ActionBarLayout) tzbVar.getParentLayout()).n(canvas, (int) (tzbVar.X * 255.0f), (int) (tzbVar.b1.getY() + tzbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 8:
                if (!((zqc) obj).a || view.getTag() == zqc.o0) {
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
            case 7:
                jac jacVar = (jac) this.b;
                int translationY = (int) ((jacVar.q1 - jacVar.t0) - getTranslationY());
                Drawable drawable = jacVar.l1;
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
            case 7:
                jac jacVar = (jac) obj;
                if (motionEvent.getAction() != 0 || jacVar.q1 == 0 || motionEvent.getY() >= jacVar.q1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                jacVar.dismiss();
                return true;
            case 8:
                return ((zqc) obj).a || super.onInterceptTouchEvent(motionEvent);
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
            case 2:
                zeb zebVar = (zeb) obj;
                setPadding(zebVar.n, zebVar.h == 0 ? hl.L(8.0f) : hl.L(6.66f), zebVar.n, zebVar.h == 0 ? hl.L(6.66f) : hl.L(8.0f));
                super.onMeasure(i, i2);
                break;
            case 3:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                pqb pqbVar = (pqb) obj;
                aVar = ((e) pqbVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((e) pqbVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((e) pqbVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) pqbVar.p0.getLayoutParams()).topMargin = measuredHeight;
                pqbVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                measureChildWithMargins(pqbVar.r0, i, 0, i2, 0);
                break;
            case 4:
            case 5:
            default:
                super.onMeasure(i, i2);
                break;
            case 6:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((o7c) obj).M.getLayoutParams()).topMargin = hl.L(16.0f) + hl.m;
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 9:
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
            case 7:
                return !((jac) this.b).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 10:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((muc) this.b).j0(true);
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
            case 5:
                super.setPressed(z);
                ((v41) this.b).c(z);
                break;
            default:
                super.setPressed(z);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                sbb sbbVar = (sbb) obj;
                if (getTranslationY() != f && sbbVar.d1 != null) {
                    super.setTranslationY(f);
                    sbbVar.d1.y();
                    break;
                }
                break;
            case 7:
                super.setTranslationY(f);
                ((jac) obj).F0();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                zeb zebVar = (zeb) this.b;
                boolean z = getVisibility() == i;
                super.setVisibility(i);
                if (!z) {
                    boolean z2 = i == 0;
                    if (zebVar.e != null) {
                        for (int i2 = 0; i2 < zebVar.e.getChildCount(); i2++) {
                            web webVar = zebVar.e;
                            if (z2) {
                                yeb yebVar = (yeb) webVar.getChildAt(i2);
                                Drawable drawable = yebVar.b;
                                if (drawable instanceof wl) {
                                    ((wl) drawable).b(yebVar);
                                }
                                yebVar.c = true;
                            } else {
                                yeb yebVar2 = (yeb) webVar.getChildAt(i2);
                                Drawable drawable2 = yebVar2.b;
                                if (drawable2 instanceof wl) {
                                    ((wl) drawable2).o(yebVar2);
                                }
                                yebVar2.c = false;
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
    public h8b(Activity activity) {
        super(activity);
        this.a = (byte) 5;
        this.b = new v41(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8b(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
