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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ad;
import org.telegram.ui.e50;
import org.telegram.ui.oc0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t3 extends p9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(int i7, Context context, Object obj) {
        super(context);
        this.H = i7;
        this.I = obj;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.H) {
            case 1:
                return new s2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.H) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.w8) this.I).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.H) {
            case 0:
                if (this.a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((v3) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.I;
                t3 t3Var = h7Var.b;
                float f10 = t3Var.getImageReceiver().J() ? 1.0f - t3Var.getImageReceiver().i1 : 1.0f;
                h7Var.d.setAlpha(f10);
                h7Var.a.setAlpha(f10);
                super.onDraw(canvas);
                break;
            case 3:
                sa saVar = (sa) this.I;
                org.telegram.ui.Cells.k6 k6Var = saVar.U;
                if (!saVar.G) {
                    super.onDraw(canvas);
                    break;
                } else {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i7.h(saVar.V, canvas, this.a, k6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                va vaVar = (va) this.I;
                Object obj = vaVar.h;
                if ((obj instanceof pc1) || (obj instanceof qc1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, vaVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), vaVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), vaVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, vaVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (vaVar.e) {
                    vaVar.s.r.setColor(org.telegram.ui.ActionBar.n6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), vaVar.s.r);
                    Drawable drawable = vaVar.s.w;
                    drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, vaVar.s.w), org.telegram.ui.Cells.c0.y(2, measuredWidth, vaVar.s.w), org.telegram.ui.Cells.c0.j(2, measuredHeight, vaVar.s.w));
                    vaVar.s.w.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.v0) this.I).w) {
                    if (this.a.t() != null) {
                        this.a.z0(0.0f, 0.0f, getWidth(), (getWidth() / r0.getIntrinsicWidth()) * r0.getIntrinsicHeight());
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
                if (!((sa) this.I).U.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 1:
                return drawable == ((kg.c1) this.I).n || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(org.telegram.ui.web.v0 v0Var, Context context) {
        super(context);
        this.H = 11;
        this.I = v0Var;
        this.a = new s2(this, this, 7);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.H) {
            case 5:
                hi.w5 w5Var = ((ad) this.I).h;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                hi.w5 w5Var2 = ((rn) this.I).f;
                if (w5Var2 != null) {
                    w5Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.w8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate();
                    ((hv) this.I).f();
                    break;
                }
                break;
            case 9:
                hi.w5 w5Var3 = ((e50) this.I).e;
                if (w5Var3 != null) {
                    w5Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                hi.w5 w5Var4 = ((oc0) this.I).h;
                if (w5Var4 != null) {
                    w5Var4.invalidate();
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
                hi.w5 w5Var = ((ad) this.I).h;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 6:
                hi.w5 w5Var2 = ((rn) this.I).f;
                if (w5Var2 != null) {
                    w5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.w8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 9:
                hi.w5 w5Var3 = ((e50) this.I).e;
                if (w5Var3 != null) {
                    w5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 10:
                hi.w5 w5Var4 = ((oc0) this.I).h;
                if (w5Var4 != null) {
                    w5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }
}
