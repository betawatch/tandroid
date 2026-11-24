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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kb0 extends be0 {
    public final /* synthetic */ byte H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(hv0 hv0Var, Context context) {
        super(context);
        this.H = (byte) 1;
        this.I = hv0Var;
        this.a = new ml(this, this, (byte) 1);
    }

    @Override // be0
    public final ImageReceiver c() {
        switch (this.H) {
            case 6:
                return new ml(this, this, (byte) 4);
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
                ((lb0) obj).invalidate();
                break;
            case 1:
            case 6:
            default:
                super.invalidate();
                break;
            case 2:
                s71 s71Var = ((yh1) obj).h;
                if (s71Var != null) {
                    s71Var.invalidate();
                }
                super.invalidate();
                break;
            case 3:
                s71 s71Var2 = ((p82) obj).f;
                if (s71Var2 != null) {
                    s71Var2.invalidate();
                }
                super.invalidate();
                break;
            case 4:
                if (!pg5.b(this)) {
                    super.invalidate();
                    ((zx3) obj).f();
                    break;
                }
                break;
            case 5:
                s71 s71Var3 = ((wa5) obj).e;
                if (s71Var3 != null) {
                    s71Var3.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                s71 s71Var4 = ((ae6) obj).h;
                if (s71Var4 != null) {
                    s71Var4.invalidate();
                }
                super.invalidate();
                break;
        }
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 1:
                if (!((hv0) obj).w) {
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
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((v28) obj).a(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 9:
                iba ibaVar = (iba) obj;
                kb0 kb0Var = ibaVar.b;
                float f = kb0Var.getImageReceiver().B() ? 1.0f - kb0Var.getImageReceiver().i1 : 1.0f;
                ibaVar.d.setAlpha(f);
                ibaVar.a.setAlpha(f);
                super.onDraw(canvas);
                break;
            case 10:
                v6c v6cVar = (v6c) obj;
                j72 j72Var = v6cVar.U;
                if (!v6cVar.G) {
                    super.onDraw(canvas);
                    break;
                } else {
                    j72Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    x2b.h(v6cVar.V, canvas, this.a, j72Var);
                    break;
                }
            case 11:
                super.onDraw(canvas);
                pqc pqcVar = (pqc) obj;
                qqc qqcVar = pqcVar.s;
                Object obj2 = pqcVar.h;
                if ((obj2 instanceof krc) || (obj2 instanceof lrc)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, qqcVar.n);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), qqcVar.n);
                    canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), qqcVar.n);
                    canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, qqcVar.n);
                }
                if (pqcVar.e) {
                    qqcVar.r.setColor(bkb.b0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas.drawCircle(measuredWidth, measuredHeight, gl.L(20.0f), qqcVar.r);
                    Drawable drawable = qqcVar.w;
                    drawable.setBounds(oo1.A(2, measuredWidth, drawable), oo1.y(2, measuredHeight, qqcVar.w), oo1.w(2, measuredWidth, qqcVar.w), oo1.i(2, measuredHeight, qqcVar.w));
                    qqcVar.w.draw(canvas);
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(240.0f), TLObject.FLAG_30));
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
                if (!((v6c) this.I).U.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // be0, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 6:
                return drawable == ((pa6) this.I).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb0(byte b, Context context, Object obj) {
        super(context);
        this.H = b;
        this.I = obj;
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                super.invalidate(rect);
                ((lb0) this.I).invalidate();
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
                ((lb0) obj).invalidate();
                break;
            case 1:
            case 6:
            default:
                super.invalidate(i, i2, i3, i4);
                break;
            case 2:
                s71 s71Var = ((yh1) obj).h;
                if (s71Var != null) {
                    s71Var.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 3:
                s71 s71Var2 = ((p82) obj).f;
                if (s71Var2 != null) {
                    s71Var2.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 4:
                if (!pg5.b(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            case 5:
                s71 s71Var3 = ((wa5) obj).e;
                if (s71Var3 != null) {
                    s71Var3.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
            case 7:
                s71 s71Var4 = ((ae6) obj).h;
                if (s71Var4 != null) {
                    s71Var4.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }
}
