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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fs5 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public float b;
    public final Path c;
    public final Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs5(hs5 hs5Var, Context context) {
        super(context);
        this.f = hs5Var;
        this.c = new Path();
        this.e = new RectF();
        this.b = -1.0f;
        jl0 c = hs5Var.getBaseSimpleGlass().c.c(this, null, false);
        c.p(dtd.l(hs5Var.getResourceProvider()));
        c.q(hl.L(6.0f));
        this.d = c;
        setWillNotDraw(false);
        addView(hs5Var.e, tre.c(-1.0f, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        View[] viewArr;
        Object obj;
        b8c G;
        byte b = this.a;
        Object obj2 = this.d;
        float f2 = 0.0f;
        Object obj3 = this.f;
        float f3 = 1.0f;
        Path path = this.c;
        switch (b) {
            case 0:
                RectF rectF = (RectF) this.e;
                jl0 jl0Var = (jl0) obj2;
                float f4 = ((hs5) obj3).a.f;
                if (f4 >= 1.0f) {
                    float min = Math.min(1.0f, f4 / hl.L(44.0f));
                    float L = (1.0f - min) * hl.L(24.0f);
                    rectF.set(L, 0.0f, getWidth() - L, f4);
                    float min2 = Math.min(f4 / 2.0f, hl.L(22.0f));
                    if (Math.abs(min2 - this.b) > 0.5f) {
                        this.b = min2;
                        jl0Var.r(min2);
                    }
                    int L2 = hl.L(6.0f);
                    jl0Var.setBounds(((int) rectF.left) - L2, ((int) rectF.top) - L2, ((int) rectF.right) + L2, ((int) rectF.bottom) + L2);
                    jl0Var.setAlpha((int) (min * 255.0f));
                    jl0Var.draw(canvas);
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
                nb9 nb9Var = (nb9) obj3;
                View[] viewPages = nb9Var.l1.getViewPages();
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
                        mb9 mb9Var = (mb9) view;
                        FrameLayout frameLayout = mb9Var.e;
                        q9c q9cVar = mb9Var.f;
                        float i2 = Utilities.i(f3 - Math.abs(mb9Var.getTranslationX() / mb9Var.getMeasuredWidth()), f3, f2);
                        float f5 = this.b;
                        float paddingTop = frameLayout.getPaddingTop();
                        f = f3;
                        int i3 = 0;
                        while (true) {
                            int childCount = q9cVar.getChildCount();
                            viewArr = viewPages;
                            l9c l9cVar = q9cVar.g3;
                            float f6 = i2;
                            if (i3 < childCount) {
                                View childAt = q9cVar.getChildAt(i3);
                                q9cVar.f3.getClass();
                                int G2 = q79.G(childAt);
                                Object obj4 = obj2;
                                if (G2 >= 0 && G2 < l9cVar.E.size() && (G = l9cVar.G(G2)) != null && G.a == 28) {
                                    paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                                }
                                i3++;
                                viewPages = viewArr;
                                i2 = f6;
                                obj2 = obj4;
                            } else {
                                obj = obj2;
                                this.b = (paddingTop * f6) + f5;
                                if (mb9Var.getVisibility() == 0) {
                                    jo0 jo0Var = mb9Var.h;
                                    float f7 = -jo0Var.getHeight();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < q9cVar.getChildCount()) {
                                            View childAt2 = q9cVar.getChildAt(i4);
                                            q9cVar.f3.getClass();
                                            if (l9cVar.G(q79.G(childAt2)).a == 28) {
                                                f7 = childAt2.getY() + frameLayout.getPaddingTop();
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    jo0Var.setTranslationY(Math.max(hl.m, f7));
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
                float e = ((mm) obj2).e(false, this.b <= ((float) hl.m) ? f3 : 0.0f);
                float f8 = hl.m;
                float f9 = f8 * e;
                float max = Math.max(f8, this.b) - (hl.m * e);
                this.b = max;
                RectF rectF2 = hl.P;
                rectF2.set(nb9Var.u0, max, getWidth() - nb9Var.u0, hl.L(8.0f) + getHeight());
                float U1 = hl.U1(e, hl.L(14.0f), 0);
                canvas.drawRoundRect(rectF2, U1, U1, nb9Var.m1);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, U1, U1, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                boolean z = f9 > ((float) hl.m) / 2.0f;
                Boolean bool = (Boolean) this.e;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = hl.B(aob.v0(aob.h5, nb9Var.J0)) > 0.721f;
                    boolean z3 = hl.B(aob.v(aob.v0(aob.s8, nb9Var.J0), 855638016)) > 0.721f;
                    this.e = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    hl.n3(nb9Var.getWindow(), z2);
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
                if (motionEvent.getAction() != 0 || motionEvent.getY() <= ((hs5) obj).a.f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.b) {
                    ((nb9) obj).dismiss();
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((hs5) this.f).x, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs5(nb9 nb9Var, Context context) {
        super(context);
        this.f = nb9Var;
        this.d = new mm(250L, this, k43.h);
        this.c = new Path();
    }
}
