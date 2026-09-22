package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.yv;
import org.telegram.ui.gj1;
import org.telegram.ui.hf0;
import org.telegram.ui.hj1;
import org.telegram.ui.l70;
import org.telegram.ui.ld;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class z5 extends org.telegram.ui.Components.u9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.u9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new l4(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((b6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.H;
                z5 z5Var = j7Var.b;
                float currentAlpha = z5Var.getImageReceiver().hasBitmapImage() ? 1.0f - z5Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                j7Var.d.setAlpha(currentAlpha);
                j7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) this.H;
                org.telegram.ui.Cells.m6 m6Var = abVar.T;
                if (!abVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(abVar.U, canvas, this.a, m6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.H;
                Object obj = ebVar.h;
                if ((obj instanceof gj1) || (obj instanceof hj1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, ebVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), ebVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), ebVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, ebVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (ebVar.e) {
                    ebVar.n.r.setColor(org.telegram.ui.ActionBar.i6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), ebVar.n.r);
                    Drawable drawable = ebVar.n.v;
                    drawable.setBounds(vl.x(2, measuredWidth, drawable), vl.e(2, measuredHeight, ebVar.n.v), vl.B(2, measuredWidth, ebVar.n.v), vl.z(2, measuredHeight, ebVar.n.v));
                    ebVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.d1) this.H).v) {
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
                if (!((org.telegram.ui.Cells.ab) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((hg.f1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(org.telegram.ui.web.d1 d1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = d1Var;
        this.a = new l4(this, this, 6);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.s6 s6Var = ((ld) this.H).f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                ci.s6 s6Var2 = ((wo) this.H).f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate();
                    ((yv) this.H).f();
                    break;
                }
                break;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                ci.s6 s6Var4 = ((hf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
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
                ci.s6 s6Var = ((ld) this.H).f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                ci.s6 s6Var2 = ((wo) this.H).f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.b9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                ci.s6 s6Var4 = ((hf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
