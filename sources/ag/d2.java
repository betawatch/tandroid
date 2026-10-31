package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.n8;
import org.telegram.ui.c60;
import org.telegram.ui.kd;
import org.telegram.ui.me1;
import org.telegram.ui.ne1;
import org.telegram.ui.oo;
import org.telegram.ui.wd0;
import th.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends g9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.g9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new c2(0, this, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 6:
                super.invalidate(rect);
                ((n8) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 1:
                l7 l7Var = (l7) this.H;
                d2 d2Var = l7Var.b;
                float f7 = d2Var.getImageReceiver().I() ? 1.0f - d2Var.getImageReceiver().h1 : 1.0f;
                l7Var.d.setAlpha(f7);
                l7Var.a.setAlpha(f7);
                super.onDraw(canvas);
                break;
            case 2:
                pa paVar = (pa) this.H;
                o6 o6Var = paVar.T;
                if (!paVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    w5.h(paVar.U, canvas, this.a, o6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                ta taVar = (ta) this.H;
                Object obj = taVar.h;
                if ((obj instanceof me1) || (obj instanceof ne1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, taVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), taVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), taVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, taVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (taVar.e) {
                    taVar.s.r.setColor(t6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(20.0f), taVar.s.r);
                    Drawable drawable = taVar.s.w;
                    drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, taVar.s.w), org.telegram.ui.Cells.f1.w(2, measuredWidth, taVar.s.w), org.telegram.ui.Cells.f1.f(2, measuredHeight, taVar.s.w));
                    taVar.s.w.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.z0) this.H).w) {
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
            case 11:
                if (this.a.Q0) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((th.w2) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G) {
            case 2:
                if (!((pa) this.H).T.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 0:
                return drawable == ((f2) this.H).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.G = 10;
        this.H = z0Var;
        this.a = new c2(6, this, this);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 4:
                kg.f0 f0Var = ((kd) this.H).h;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                kg.f0 f0Var2 = ((oo) this.H).f;
                if (f0Var2 != null) {
                    f0Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((n8) this.H).invalidate();
                break;
            case 7:
                if (!sg.e0.b(this)) {
                    super.invalidate();
                    ((iv) this.H).f();
                    break;
                }
                break;
            case 8:
                kg.f0 f0Var3 = ((c60) this.H).e;
                if (f0Var3 != null) {
                    f0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                kg.f0 f0Var4 = ((wd0) this.H).h;
                if (f0Var4 != null) {
                    f0Var4.invalidate();
                }
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.G) {
            case 4:
                kg.f0 f0Var = ((kd) this.H).h;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                kg.f0 f0Var2 = ((oo) this.H).f;
                if (f0Var2 != null) {
                    f0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((n8) this.H).invalidate();
                break;
            case 7:
                if (!sg.e0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                kg.f0 f0Var3 = ((c60) this.H).e;
                if (f0Var3 != null) {
                    f0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                kg.f0 f0Var4 = ((wd0) this.H).h;
                if (f0Var4 != null) {
                    f0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
