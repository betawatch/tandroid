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
/* loaded from: classes2.dex */
public final class cs5 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs5(es5 es5Var, Context context) {
        super(context);
        this.f = es5Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        im0 c = es5Var.getBaseSimpleGlass().c.c(this, null, false);
        c.p(qqd.l(es5Var.getResourceProvider()));
        c.q(gm.L(6.0f));
        this.d = c;
        setWillNotDraw(false);
        addView(es5Var.e, qoe.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        View[] viewArr;
        Object obj;
        c6c G;
        byte b = this.a;
        Object obj2 = this.d;
        float f2 = 0.0f;
        Object obj3 = this.f;
        float f3 = 1.0f;
        Path path = this.c;
        switch (b) {
            case 0:
                RectF rectF = (RectF) this.e;
                im0 im0Var = (im0) obj2;
                float f4 = ((es5) obj3).a.f;
                if (f4 >= 1.0f) {
                    float min = Math.min(1.0f, f4 / gm.L(44.0f));
                    float L = (1.0f - min) * gm.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f4);
                    float min2 = Math.min(f4 / 2.0f, gm.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        im0Var.r(min2);
                    }
                    int L2 = gm.L(6.0f);
                    im0Var.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    im0Var.setAlpha((int) (min * 255.0f));
                    im0Var.draw(canvas);
                    canvas.save();
                    path.rewind();
                    path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                da9 da9Var = (da9) obj3;
                View[] viewPages = da9Var.l1.getViewPages();
                this.b = 0.0f;
                int length = viewPages.length;
                int i = 0;
                while (i < length) {
                    View view = viewPages[i];
                    if (view == null) {
                        viewArr = viewPages;
                        obj = obj2;
                        f = f3;
                    } else {
                        ca9 ca9Var = (ca9) view;
                        FrameLayout frameLayout = ca9Var.e;
                        q7c q7cVar = ca9Var.f;
                        float i2 = Utilities.i(f3 - Math.abs(ca9Var.getTranslationX() / ca9Var.getMeasuredWidth()), f3, f2);
                        float f5 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        f = f3;
                        int i3 = 0;
                        while (true) {
                            int childCount = q7cVar.getChildCount();
                            viewArr = viewPages;
                            l7c l7cVar = q7cVar.g3;
                            float f6 = i2;
                            if (i3 < childCount) {
                                View childAt = q7cVar.getChildAt(i3);
                                q7cVar.f3.getClass();
                                int G2 = f69.G(childAt);
                                Object obj4 = obj2;
                                if (G2 >= 0 && G2 < l7cVar.E.size() && (G = l7cVar.G(G2)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i3++;
                                viewPages = viewArr;
                                i2 = f6;
                                obj2 = obj4;
                            } else {
                                obj = obj2;
                                this.b = (paddingTop * f6) + f5;
                                if (ca9Var.getVisibility() == 0) {
                                    jp0 jp0Var = ca9Var.h;
                                    float f7 = -jp0Var.getHeight();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < q7cVar.getChildCount()) {
                                            View childAt2 = q7cVar.getChildAt(i4);
                                            q7cVar.f3.getClass();
                                            if (l7cVar.G(f69.G(childAt2)).a == 28) {
                                                f7 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    jp0Var.setTranslationY(Math.max(gm.m, f7));
                                }
                            }
                        }
                    }
                    i++;
                    f3 = f;
                    viewPages = viewArr;
                    obj2 = obj;
                    f2 = 0.0f;
                }
                float e = ((ln) obj2).e(false, this.b <= ((float) gm.m) ? f3 : 0.0f);
                float f8 = gm.m;
                float f9 = f8 * e;
                float max = Math.max(f8, this.b) - (gm.m * e);
                this.b = max;
                RectF rectF2 = gm.P;
                rectF2.set(da9Var.u0, max, getWidth() - da9Var.u0, gm.L(8.0f) + getHeight());
                float U1 = gm.U1(e, gm.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U1, U1, da9Var.m1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z = f9 > ((float) gm.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = gm.B(cmb.v0(cmb.g5, da9Var.J0)) > 0.721f;
                    boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, da9Var.J0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    gm.n3(da9Var.getWindow(), z2);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((es5) obj).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((da9) obj).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((es5) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs5(da9 da9Var, Context context) {
        super(context);
        this.f = da9Var;
        this.d = new ln(250L, this, d53.h);
        this.c = new Path();
    }
}
