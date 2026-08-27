package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.iv;
import org.telegram.ui.id;
import org.telegram.ui.jo;
import org.telegram.ui.te0;
import org.telegram.ui.u60;
import org.telegram.ui.wh1;
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z3 extends org.telegram.ui.Components.n9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(Object obj, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.n9
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new y2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.C) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((a4) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.D;
                z3 z3Var = f7Var.b;
                float currentAlpha = z3Var.getImageReceiver().hasBitmapImage() ? 1.0f - z3Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                f7Var.d.setAlpha(currentAlpha);
                f7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                sa saVar = (sa) this.D;
                org.telegram.ui.Cells.i6 i6Var = saVar.P;
                if (!saVar.B) {
                    super.onDraw(canvas);
                    break;
                } else {
                    i6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(saVar.Q, canvas, this.a, i6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                va vaVar = (va) this.D;
                Object obj = vaVar.h;
                if ((obj instanceof wh1) || (obj instanceof xh1)) {
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
                    drawable.setBounds(rl.v(2, measuredWidth, drawable), rl.e(2, measuredHeight, vaVar.n.v), rl.A(2, measuredWidth, vaVar.n.v), rl.y(2, measuredHeight, vaVar.n.v));
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

    @Override // org.telegram.ui.Components.n9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.C) {
            case 11:
                return drawable == ((qf.w0) this.D).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = z0Var;
        this.a = new y2(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.C) {
            case 4:
                ag.t0 t0Var = ((id) this.D).f;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                ag.t0 t0Var2 = ((jo) this.D).f;
                if (t0Var2 != null) {
                    t0Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            case 7:
                if (!ig.g0.b(this)) {
                    super.invalidate();
                    ((iv) this.D).f();
                    break;
                }
                break;
            case 8:
                ag.t0 t0Var3 = ((u60) this.D).e;
                if (t0Var3 != null) {
                    t0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                ag.t0 t0Var4 = ((te0) this.D).h;
                if (t0Var4 != null) {
                    t0Var4.invalidate();
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
                ag.t0 t0Var = ((id) this.D).f;
                if (t0Var != null) {
                    t0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                ag.t0 t0Var2 = ((jo) this.D).f;
                if (t0Var2 != null) {
                    t0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.u8) this.D).invalidate();
                break;
            case 7:
                if (!ig.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                ag.t0 t0Var3 = ((u60) this.D).e;
                if (t0Var3 != null) {
                    t0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                ag.t0 t0Var4 = ((te0) this.D).h;
                if (t0Var4 != null) {
                    t0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
