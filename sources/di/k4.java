package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Components.gw;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.mo;
import org.telegram.ui.nd;
import org.telegram.ui.re0;
import org.telegram.ui.x60;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k4 extends org.telegram.ui.Components.y9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.y9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new f3(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.f9) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.H;
                k4 k4Var = o7Var.b;
                float currentAlpha = k4Var.getImageReceiver().hasBitmapImage() ? 1.0f - k4Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                o7Var.d.setAlpha(currentAlpha);
                o7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                ab abVar = (ab) this.H;
                org.telegram.ui.Cells.q6 q6Var = abVar.T;
                if (!abVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    q6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    a8.h(abVar.U, canvas, this.a, q6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                eb ebVar = (eb) this.H;
                Object obj = ebVar.h;
                if ((obj instanceof bi1) || (obj instanceof ci1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, ebVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), ebVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), ebVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, ebVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (ebVar.e) {
                    ebVar.s.r.setColor(org.telegram.ui.ActionBar.y6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), ebVar.s.r);
                    Drawable drawable = ebVar.s.v;
                    drawable.setBounds(org.telegram.ui.d3.x(2, measuredWidth, drawable), org.telegram.ui.d3.i(2, measuredHeight, ebVar.s.v), org.telegram.ui.d3.C(2, measuredWidth, ebVar.s.v), org.telegram.ui.d3.B(2, measuredHeight, ebVar.s.v));
                    ebVar.s.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.a1) this.H).v) {
                    if (this.a.getDrawable() != null) {
                        this.a.setImageCoords(0.0f, 0.0f, getWidth(), (getWidth() / r0.getIntrinsicWidth()) * r0.getIntrinsicHeight());
                        this.a.draw(canvas);
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
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G) {
            case 3:
                if (!((ab) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((jg.d1) this.H).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = a1Var;
        this.a = new f3(this, this, 7);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                fi.f6 f6Var = ((nd) this.H).h;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                fi.f6 f6Var2 = ((mo) this.H).f;
                if (f6Var2 != null) {
                    f6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.f9) this.H).invalidate();
                break;
            case 8:
                if (!bh.m0.b(this)) {
                    super.invalidate();
                    ((gw) this.H).f();
                    break;
                }
                break;
            case 9:
                fi.f6 f6Var3 = ((x60) this.H).e;
                if (f6Var3 != null) {
                    f6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                fi.f6 f6Var4 = ((re0) this.H).h;
                if (f6Var4 != null) {
                    f6Var4.invalidate();
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
            case 5:
                fi.f6 f6Var = ((nd) this.H).h;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                fi.f6 f6Var2 = ((mo) this.H).f;
                if (f6Var2 != null) {
                    f6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.f9) this.H).invalidate();
                break;
            case 8:
                if (!bh.m0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                fi.f6 f6Var3 = ((x60) this.H).e;
                if (f6Var3 != null) {
                    f6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                fi.f6 f6Var4 = ((re0) this.H).h;
                if (f6Var4 != null) {
                    f6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
