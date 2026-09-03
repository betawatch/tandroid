package nh;

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
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.sv;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.pd;
import org.telegram.ui.ro;
import org.telegram.ui.ui1;
import org.telegram.ui.vi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y3 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.D) {
            case 11:
                return new y2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.D) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.D) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((z3) this.E).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.E;
                y3 y3Var = h7Var.b;
                float currentAlpha = y3Var.getImageReceiver().hasBitmapImage() ? 1.0f - y3Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                h7Var.d.setAlpha(currentAlpha);
                h7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                ua uaVar = (ua) this.E;
                org.telegram.ui.Cells.k6 k6Var = uaVar.Q;
                if (!uaVar.C) {
                    super.onDraw(canvas);
                    break;
                } else {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    m7.h(uaVar.R, canvas, this.a, k6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                xa xaVar = (xa) this.E;
                Object obj = xaVar.h;
                if ((obj instanceof ui1) || (obj instanceof vi1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, xaVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), xaVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), xaVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, xaVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (xaVar.e) {
                    xaVar.n.r.setColor(org.telegram.ui.ActionBar.j6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), xaVar.n.r);
                    Drawable drawable = xaVar.n.v;
                    drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, xaVar.n.v), org.telegram.ui.b.A(2, measuredWidth, xaVar.n.v), org.telegram.ui.b.y(2, measuredHeight, xaVar.n.v));
                    xaVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.c1) this.E).v) {
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
        switch (this.D) {
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.D) {
            case 2:
                if (!((ua) this.E).Q.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.D) {
            case 11:
                return drawable == ((uf.v0) this.E).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(org.telegram.ui.web.c1 c1Var, Context context) {
        super(context);
        this.D = 10;
        this.E = c1Var;
        this.a = new y2(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.D) {
            case 4:
                eg.i0 i0Var = ((pd) this.E).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                eg.i0 i0Var2 = ((ro) this.E).f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                break;
            case 7:
                if (!mg.g0.b(this)) {
                    super.invalidate();
                    ((sv) this.E).f();
                    break;
                }
                break;
            case 8:
                eg.i0 i0Var3 = ((g70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                eg.i0 i0Var4 = ((bf0) this.E).h;
                if (i0Var4 != null) {
                    i0Var4.invalidate();
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
        switch (this.D) {
            case 4:
                eg.i0 i0Var = ((pd) this.E).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                eg.i0 i0Var2 = ((ro) this.E).f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.v8) this.E).invalidate();
                break;
            case 7:
                if (!mg.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                eg.i0 i0Var3 = ((g70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                eg.i0 i0Var4 = ((bf0) this.E).h;
                if (i0Var4 != null) {
                    i0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
