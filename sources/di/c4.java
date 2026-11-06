package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.wu;
import org.telegram.ui.bd;
import org.telegram.ui.d50;
import org.telegram.ui.oc1;
import org.telegram.ui.pc0;
import org.telegram.ui.pc1;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c4 extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(int i7, Context context, Object obj) {
        super(context);
        this.G = i7;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.l9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new z2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.s8) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.a.Q0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((e4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.H;
                c4 c4Var = h7Var.b;
                float f10 = c4Var.getImageReceiver().I() ? 1.0f - c4Var.getImageReceiver().h1 : 1.0f;
                h7Var.d.setAlpha(f10);
                h7Var.a.setAlpha(f10);
                super.onDraw(canvas);
                break;
            case 3:
                pa paVar = (pa) this.H;
                org.telegram.ui.Cells.k6 k6Var = paVar.T;
                if (!paVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    r7.h(paVar.U, canvas, this.a, k6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                ta taVar = (ta) this.H;
                Object obj = taVar.h;
                if ((obj instanceof oc1) || (obj instanceof pc1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, taVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), taVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), taVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, taVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (taVar.e) {
                    taVar.s.r.setColor(org.telegram.ui.ActionBar.k6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), taVar.s.r);
                    Drawable drawable = taVar.s.w;
                    drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, taVar.s.w), org.telegram.ui.Cells.f1.w(2, measuredWidth, taVar.s.w), org.telegram.ui.Cells.f1.f(2, measuredHeight, taVar.s.w));
                    taVar.s.w.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.x0) this.H).w) {
                    if (this.a.t() != null) {
                        this.a.y0(0.0f, 0.0f, getWidth(), (getWidth() / r0.getIntrinsicWidth()) * r0.getIntrinsicHeight());
                        this.a.h(canvas, null);
                        break;
                    }
                } else {
                    super.onDraw(canvas);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G) {
            case 3:
                if (!((pa) this.H).T.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((kg.a1) this.H).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(org.telegram.ui.web.x0 x0Var, Context context) {
        super(context);
        this.G = 11;
        this.H = x0Var;
        this.a = new z2(this, this, 7);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                fi.p5 p5Var = ((bd) this.H).h;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                fi.p5 p5Var2 = ((pn) this.H).f;
                if (p5Var2 != null) {
                    p5Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.s8) this.H).invalidate();
                break;
            case 8:
                if (!ch.e0.b(this)) {
                    super.invalidate();
                    ((wu) this.H).f();
                    break;
                }
                break;
            case 9:
                fi.p5 p5Var3 = ((d50) this.H).e;
                if (p5Var3 != null) {
                    p5Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                fi.p5 p5Var4 = ((pc0) this.H).h;
                if (p5Var4 != null) {
                    p5Var4.invalidate();
                }
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.G) {
            case 5:
                fi.p5 p5Var = ((bd) this.H).h;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 6:
                fi.p5 p5Var2 = ((pn) this.H).f;
                if (p5Var2 != null) {
                    p5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.s8) this.H).invalidate();
                break;
            case 8:
                if (!ch.e0.b(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 9:
                fi.p5 p5Var3 = ((d50) this.H).e;
                if (p5Var3 != null) {
                    p5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 10:
                fi.p5 p5Var4 = ((pc0) this.H).h;
                if (p5Var4 != null) {
                    p5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }
}
