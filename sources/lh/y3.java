package lh;

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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.t9;
import org.telegram.ui.ai1;
import org.telegram.ui.hd;
import org.telegram.ui.ko;
import org.telegram.ui.pe0;
import org.telegram.ui.t60;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y3 extends t9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.t9
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new x2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.C) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((z3) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.D;
                y3 y3Var = g7Var.b;
                float currentAlpha = y3Var.getImageReceiver().hasBitmapImage() ? 1.0f - y3Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                g7Var.d.setAlpha(currentAlpha);
                g7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                sa saVar = (sa) this.D;
                org.telegram.ui.Cells.j6 j6Var = saVar.P;
                if (!saVar.B) {
                    super.onDraw(canvas);
                    break;
                } else {
                    j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(saVar.Q, canvas, this.a, j6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                va vaVar = (va) this.D;
                Object obj = vaVar.h;
                if ((obj instanceof zh1) || (obj instanceof ai1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, vaVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), vaVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), vaVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, vaVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (vaVar.e) {
                    vaVar.n.r.setColor(org.telegram.ui.ActionBar.g6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), vaVar.n.r);
                    Drawable drawable = vaVar.n.v;
                    drawable.setBounds(org.telegram.ui.b.v(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, vaVar.n.v), org.telegram.ui.b.A(2, measuredWidth, vaVar.n.v), org.telegram.ui.b.y(2, measuredHeight, vaVar.n.v));
                    vaVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.z0) this.D).v) {
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
        switch (this.C) {
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
        switch (this.C) {
            case 2:
                if (!((sa) this.D).P.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.C) {
            case 11:
                return drawable == ((sf.v0) this.D).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = z0Var;
        this.a = new x2(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.C) {
            case 4:
                cg.i0 i0Var = ((hd) this.D).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                cg.i0 i0Var2 = ((ko) this.D).f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                break;
            case 7:
                if (!kg.g0.b(this)) {
                    super.invalidate();
                    ((pv) this.D).f();
                    break;
                }
                break;
            case 8:
                cg.i0 i0Var3 = ((t60) this.D).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                cg.i0 i0Var4 = ((pe0) this.D).h;
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
        switch (this.C) {
            case 4:
                cg.i0 i0Var = ((hd) this.D).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                cg.i0 i0Var2 = ((ko) this.D).f;
                if (i0Var2 != null) {
                    i0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.a9) this.D).invalidate();
                break;
            case 7:
                if (!kg.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                cg.i0 i0Var3 = ((t60) this.D).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                cg.i0 i0Var4 = ((pe0) this.D).h;
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
