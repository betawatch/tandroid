package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.cv;
import org.telegram.ui.ad;
import org.telegram.ui.c50;
import org.telegram.ui.oc0;
import org.telegram.ui.oc1;
import org.telegram.ui.pc1;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v3 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(int i7, Context context, Object obj) {
        super(context);
        this.H = i7;
        this.I = obj;
    }

    @Override // org.telegram.ui.Components.i9
    public ImageReceiver c() {
        switch (this.H) {
            case 1:
                return new u2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.H) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.p8) this.I).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.H) {
            case 0:
                if (this.a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((x3) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.I;
                v3 v3Var = g7Var.b;
                float f10 = v3Var.getImageReceiver().I() ? 1.0f - v3Var.getImageReceiver().i1 : 1.0f;
                g7Var.d.setAlpha(f10);
                g7Var.a.setAlpha(f10);
                super.onDraw(canvas);
                break;
            case 3:
                pa paVar = (pa) this.I;
                org.telegram.ui.Cells.j6 j6Var = paVar.U;
                if (!paVar.G) {
                    super.onDraw(canvas);
                    break;
                } else {
                    j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(paVar.V, canvas, this.a, j6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                sa saVar = (sa) this.I;
                Object obj = saVar.h;
                if ((obj instanceof oc1) || (obj instanceof pc1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, saVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), saVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), saVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, saVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (saVar.e) {
                    saVar.s.r.setColor(org.telegram.ui.ActionBar.j6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), saVar.s.r);
                    Drawable drawable = saVar.s.w;
                    drawable.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, measuredHeight, saVar.s.w), org.telegram.ui.Cells.y0.w(2, measuredWidth, saVar.s.w), org.telegram.ui.Cells.y0.h(2, measuredHeight, saVar.s.w));
                    saVar.s.w.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.v0) this.I).w) {
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
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 3:
                if (!((pa) this.I).U.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 1:
                return drawable == ((kg.a1) this.I).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(org.telegram.ui.web.v0 v0Var, Context context) {
        super(context);
        this.H = 11;
        this.I = v0Var;
        this.a = new u2(this, this, 7);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.H) {
            case 5:
                hi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                hi.n5 n5Var2 = ((qn) this.I).f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.p8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate();
                    ((cv) this.I).f();
                    break;
                }
                break;
            case 9:
                hi.n5 n5Var3 = ((c50) this.I).e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                hi.n5 n5Var4 = ((oc0) this.I).h;
                if (n5Var4 != null) {
                    n5Var4.invalidate();
                }
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.H) {
            case 5:
                hi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 6:
                hi.n5 n5Var2 = ((qn) this.I).f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.p8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 9:
                hi.n5 n5Var3 = ((c50) this.I).e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 10:
                hi.n5 n5Var4 = ((oc0) this.I).h;
                if (n5Var4 != null) {
                    n5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }
}
