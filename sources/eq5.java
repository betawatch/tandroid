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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eq5 extends FrameLayout {
    public final /* synthetic */ byte a = 1;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq5(gq5 gq5Var, Context context) {
        super(context);
        this.f = gq5Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        il0 c = gq5Var.getBaseSimpleGlass().c.c(this, null, false);
        c.p(nod.l(gq5Var.getResourceProvider()));
        c.q(gl.L(6.0f));
        this.d = c;
        setWillNotDraw(false);
        addView(gq5Var.e, nme.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        View[] viewArr;
        Object obj;
        c4c G;
        byte b = this.a;
        Object obj2 = this.d;
        float f2 = 0.0f;
        Object obj3 = this.f;
        float f3 = 1.0f;
        Path path = this.c;
        switch (b) {
            case 0:
                RectF rectF = (RectF) this.e;
                il0 il0Var = (il0) obj2;
                float f4 = ((gq5) obj3).a.f;
                if (f4 >= 1.0f) {
                    float min = Math.min(1.0f, f4 / gl.L(44.0f));
                    float L = (1.0f - min) * gl.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f4);
                    float min2 = Math.min(f4 / 2.0f, gl.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        il0Var.r(min2);
                    }
                    int L2 = gl.L(6.0f);
                    il0Var.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    il0Var.setAlpha((int) (min * 255.0f));
                    il0Var.draw(canvas);
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
                b89 b89Var = (b89) obj3;
                View[] viewPages = b89Var.l1.getViewPages();
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
                        a89 a89Var = (a89) view;
                        FrameLayout frameLayout = a89Var.e;
                        q5c q5cVar = a89Var.f;
                        float i2 = Utilities.i(f3 - Math.abs(a89Var.getTranslationX() / a89Var.getMeasuredWidth()), f3, f2);
                        float f5 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        f = f3;
                        int i3 = 0;
                        while (true) {
                            int childCount = q5cVar.getChildCount();
                            viewArr = viewPages;
                            l5c l5cVar = q5cVar.g3;
                            float f6 = i2;
                            if (i3 < childCount) {
                                View childAt = q5cVar.getChildAt(i3);
                                q5cVar.f3.getClass();
                                int G2 = d49.G(childAt);
                                Object obj4 = obj2;
                                if (G2 >= 0 && G2 < l5cVar.E.size() && (G = l5cVar.G(G2)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i3++;
                                viewPages = viewArr;
                                i2 = f6;
                                obj2 = obj4;
                            } else {
                                obj = obj2;
                                this.b = (paddingTop * f6) + f5;
                                if (a89Var.getVisibility() == 0) {
                                    jo0 jo0Var = a89Var.h;
                                    float f7 = -jo0Var.getHeight();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < q5cVar.getChildCount()) {
                                            View childAt2 = q5cVar.getChildAt(i4);
                                            q5cVar.f3.getClass();
                                            if (l5cVar.G(d49.G(childAt2)).a == 28) {
                                                f7 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    jo0Var.setTranslationY(Math.max(gl.m, f7));
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
                float e = ((lm) obj2).e(false, this.b <= ((float) gl.m) ? f3 : 0.0f);
                float f8 = gl.m;
                float f9 = f8 * e;
                float max = Math.max(f8, this.b) - (gl.m * e);
                this.b = max;
                RectF rectF2 = gl.P;
                rectF2.set(b89Var.u0, max, getWidth() - b89Var.u0, gl.L(8.0f) + getHeight());
                float U1 = gl.U1(e, gl.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U1, U1, b89Var.m1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z = f9 > ((float) gl.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = gl.B(bkb.v0(bkb.g5, b89Var.J0)) > 0.721f;
                    boolean z3 = gl.B(bkb.v(bkb.v0(bkb.r8, b89Var.J0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    gl.n3(b89Var.getWindow(), z2);
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
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((gq5) obj).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((b89) obj).dismiss();
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((gq5) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq5(b89 b89Var, Context context) {
        super(context);
        this.f = b89Var;
        this.d = new lm(250L, this, s33.h);
        this.c = new Path();
    }
}
