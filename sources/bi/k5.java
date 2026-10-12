package bi;

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
import org.telegram.ui.Components.kw;
import org.telegram.ui.mf0;
import org.telegram.ui.p70;
import org.telegram.ui.pj1;
import org.telegram.ui.qj1;
import org.telegram.ui.sd;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class k5 extends org.telegram.ui.Components.z9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.z9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new b4(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.g9) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m5) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.H;
                k5 k5Var = k7Var.b;
                float currentAlpha = k5Var.getImageReceiver().hasBitmapImage() ? 1.0f - k5Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                k7Var.d.setAlpha(currentAlpha);
                k7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) this.H;
                org.telegram.ui.Cells.m6 m6Var = xaVar.T;
                if (!xaVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    s9.h(xaVar.U, canvas, this.a, m6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.H;
                Object obj = bbVar.h;
                if ((obj instanceof pj1) || (obj instanceof qj1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, bbVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), bbVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), bbVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, bbVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (bbVar.e) {
                    bbVar.n.r.setColor(org.telegram.ui.ActionBar.g6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), bbVar.n.r);
                    Drawable drawable = bbVar.n.v;
                    drawable.setBounds(org.telegram.ui.Cells.d0.u(2, measuredWidth, drawable), org.telegram.ui.Cells.d0.d(2, measuredHeight, bbVar.n.v), org.telegram.ui.Cells.d0.y(2, measuredWidth, bbVar.n.v), org.telegram.ui.Cells.d0.x(2, measuredHeight, bbVar.n.v));
                    bbVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.b1) this.H).v) {
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
                if (!((org.telegram.ui.Cells.xa) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.z9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((ig.e1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(org.telegram.ui.web.b1 b1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = b1Var;
        this.a = new b4(this, this, 6);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                di.p6 p6Var = ((sd) this.H).f;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                di.p6 p6Var2 = ((zo) this.H).f;
                if (p6Var2 != null) {
                    p6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.g9) this.H).invalidate();
                break;
            case 8:
                if (!ah.x0.b(this)) {
                    super.invalidate();
                    ((kw) this.H).f();
                    break;
                }
                break;
            case 9:
                di.p6 p6Var3 = ((p70) this.H).e;
                if (p6Var3 != null) {
                    p6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                di.p6 p6Var4 = ((mf0) this.H).h;
                if (p6Var4 != null) {
                    p6Var4.invalidate();
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
                di.p6 p6Var = ((sd) this.H).f;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                di.p6 p6Var2 = ((zo) this.H).f;
                if (p6Var2 != null) {
                    p6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.g9) this.H).invalidate();
                break;
            case 8:
                if (!ah.x0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                di.p6 p6Var3 = ((p70) this.H).e;
                if (p6Var3 != null) {
                    p6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                di.p6 p6Var4 = ((mf0) this.H).h;
                if (p6Var4 != null) {
                    p6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
