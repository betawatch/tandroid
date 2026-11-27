// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mb0 extends de0 {
    public final /* synthetic */ byte H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(rv0 rv0Var, Context context) {
        super(context);
        this.H = (byte) 1;
        this.I = rv0Var;
        this.a = new nl(this, this, (byte) 1);
    }

    @Override // de0
    public final ImageReceiver c() {
        switch (this.H) {
            case 6:
                return new nl(this, this, (byte) 4);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 0:
                super.invalidate();
                ((nb0) obj).invalidate();
                break;
            case 1:
            case 6:
            default:
                super.invalidate();
                break;
            case 2:
                a81 a81Var = ((gi1) obj).h;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                super.invalidate();
                break;
            case 3:
                a81 a81Var2 = ((g92) obj).f;
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                super.invalidate();
                break;
            case 4:
                if (!ri5.b(this)) {
                    super.invalidate();
                    ((uy3) obj).f();
                    break;
                }
                break;
            case 5:
                a81 a81Var3 = ((xc5) obj).e;
                if (a81Var3 != null) {
                    a81Var3.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                a81 a81Var4 = ((cg6) obj).h;
                if (a81Var4 != null) {
                    a81Var4.invalidate();
                }
                super.invalidate();
                break;
        }
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 1:
                if (!((rv0) obj).w) {
                    if (this.a.t() != null) {
                        this.a.i0(0.0f, 0.0f, getWidth(), (getWidth() / r2.getIntrinsicWidth()) * r2.getIntrinsicHeight());
                        this.a.h(canvas, null);
                        break;
                    }
                } else {
                    super.onDraw(canvas);
                    break;
                }
                break;
            case 8:
                if (this.a.R0) {
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((l68) obj).a(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 9:
                zea zeaVar = (zea) obj;
                mb0 mb0Var = zeaVar.b;
                float f = mb0Var.getImageReceiver().B() ? 1.0f - mb0Var.getImageReceiver().i1 : 1.0f;
                zeaVar.d.setAlpha(f);
                zeaVar.a.setAlpha(f);
                super.onDraw(canvas);
                break;
            case 10:
                vac vacVar = (vac) obj;
                a82 a82Var = vacVar.U;
                if (!vacVar.G) {
                    super.onDraw(canvas);
                    break;
                } else {
                    a82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    t6b.h(vacVar.V, canvas, this.a, a82Var);
                    break;
                }
            case 11:
                super.onDraw(canvas);
                dvc dvcVar = (dvc) obj;
                evc evcVar = dvcVar.s;
                Object obj2 = dvcVar.h;
                if ((obj2 instanceof yvc) || (obj2 instanceof zvc)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, evcVar.n);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), evcVar.n);
                    canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), evcVar.n);
                    canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, evcVar.n);
                }
                if (dvcVar.e) {
                    evcVar.r.setColor(aob.b0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas.drawCircle(measuredWidth, measuredHeight, hl.L(20.0f), evcVar.r);
                    Drawable drawable = evcVar.w;
                    drawable.setBounds(bp1.A(2, measuredWidth, drawable), bp1.y(2, measuredHeight, evcVar.w), bp1.w(2, measuredWidth, evcVar.w), bp1.i(2, measuredHeight, evcVar.w));
                    evcVar.w.draw(canvas);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.H) {
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 10:
                if (!((vac) this.I).U.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // de0, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 6:
                return drawable == ((tc6) this.I).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb0(byte b, Context context, Object obj) {
        super(context);
        this.H = b;
        this.I = obj;
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                super.invalidate(rect);
                ((nb0) this.I).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 0:
                super.invalidate(i, i2, i3, i4);
                ((nb0) obj).invalidate();
                break;
            case 1:
            case 6:
            default:
                super.invalidate(i, i2, i3, i4);
                break;
            case 2:
                a81 a81Var = ((gi1) obj).h;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 3:
                a81 a81Var2 = ((g92) obj).f;
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 4:
                if (!ri5.b(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            case 5:
                a81 a81Var3 = ((xc5) obj).e;
                if (a81Var3 != null) {
                    a81Var3.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 7:
                a81 a81Var4 = ((cg6) obj).h;
                if (a81Var4 != null) {
                    a81Var4.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }
}
