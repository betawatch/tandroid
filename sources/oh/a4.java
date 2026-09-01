package oh;

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
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.vv;
import org.telegram.ui.af0;
import org.telegram.ui.f70;
import org.telegram.ui.nd;
import org.telegram.ui.pi1;
import org.telegram.ui.po;
import org.telegram.ui.qi1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class a4 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(Object obj, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = obj;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.D) {
            case 11:
                return new z2(this, this, 6);
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
                    ((b4) this.E).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.E;
                a4 a4Var = i7Var.b;
                float currentAlpha = a4Var.getImageReceiver().hasBitmapImage() ? 1.0f - a4Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                i7Var.d.setAlpha(currentAlpha);
                i7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                va vaVar = (va) this.E;
                org.telegram.ui.Cells.l6 l6Var = vaVar.Q;
                if (!vaVar.C) {
                    super.onDraw(canvas);
                    break;
                } else {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    m7.h(vaVar.R, canvas, this.a, l6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                ya yaVar = (ya) this.E;
                Object obj = yaVar.h;
                if ((obj instanceof pi1) || (obj instanceof qi1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, yaVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), yaVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), yaVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, yaVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (yaVar.e) {
                    yaVar.n.r.setColor(org.telegram.ui.ActionBar.k6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), yaVar.n.r);
                    Drawable drawable = yaVar.n.v;
                    drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, yaVar.n.v), org.telegram.ui.b.A(2, measuredWidth, yaVar.n.v), org.telegram.ui.b.y(2, measuredHeight, yaVar.n.v));
                    yaVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.a1) this.E).v) {
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
                if (!((va) this.E).Q.a(motionEvent, this)) {
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
                return drawable == ((vf.v0) this.E).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.D = 10;
        this.E = a1Var;
        this.a = new z2(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.D) {
            case 4:
                fg.i0 i0Var = ((nd) this.E).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                fg.i0 i0Var2 = ((po) this.E).f;
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
                if (!ng.g0.b(this)) {
                    super.invalidate();
                    ((vv) this.E).f();
                    break;
                }
                break;
            case 8:
                fg.i0 i0Var3 = ((f70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                fg.i0 i0Var4 = ((af0) this.E).h;
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
                fg.i0 i0Var = ((nd) this.E).f;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                fg.i0 i0Var2 = ((po) this.E).f;
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
                if (!ng.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                fg.i0 i0Var3 = ((f70) this.E).e;
                if (i0Var3 != null) {
                    i0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                fg.i0 i0Var4 = ((af0) this.E).h;
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
