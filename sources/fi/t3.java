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
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ad;
import org.telegram.ui.f50;
import org.telegram.ui.pc0;
import org.telegram.ui.rc1;
import org.telegram.ui.rn;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t3 extends q9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(int i7, Context context, Object obj) {
        super(context);
        this.H = i7;
        this.I = obj;
    }

    @Override // org.telegram.ui.Components.q9
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
                ((org.telegram.ui.Components.x8) this.I).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
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
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.I;
                t3 t3Var = i7Var.b;
                float f10 = t3Var.getImageReceiver().I() ? 1.0f - t3Var.getImageReceiver().i1 : 1.0f;
                i7Var.d.setAlpha(f10);
                i7Var.a.setAlpha(f10);
                super.onDraw(canvas);
                break;
            case 3:
                ra raVar = (ra) this.I;
                org.telegram.ui.Cells.l6 l6Var = raVar.U;
                if (!raVar.G) {
                    super.onDraw(canvas);
                    break;
                } else {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i7.h(raVar.V, canvas, this.a, l6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                ua uaVar = (ua) this.I;
                Object obj = uaVar.h;
                if ((obj instanceof rc1) || (obj instanceof sc1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, uaVar.s.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), uaVar.s.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), uaVar.s.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, uaVar.s.n);
                } else {
                    canvas2 = canvas;
                }
                if (uaVar.e) {
                    uaVar.s.r.setColor(org.telegram.ui.ActionBar.m6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), uaVar.s.r);
                    Drawable drawable = uaVar.s.w;
                    drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, uaVar.s.w), org.telegram.ui.Cells.c0.y(2, measuredWidth, uaVar.s.w), org.telegram.ui.Cells.c0.j(2, measuredHeight, uaVar.s.w));
                    uaVar.s.w.draw(canvas2);
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
                if (!((ra) this.I).U.a(this, motionEvent)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
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
                hi.l5 l5Var = ((ad) this.I).h;
                if (l5Var != null) {
                    l5Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                hi.l5 l5Var2 = ((rn) this.I).f;
                if (l5Var2 != null) {
                    l5Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.x8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate();
                    ((kv) this.I).f();
                    break;
                }
                break;
            case 9:
                hi.l5 l5Var3 = ((f50) this.I).e;
                if (l5Var3 != null) {
                    l5Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                hi.l5 l5Var4 = ((pc0) this.I).h;
                if (l5Var4 != null) {
                    l5Var4.invalidate();
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
                hi.l5 l5Var = ((ad) this.I).h;
                if (l5Var != null) {
                    l5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 6:
                hi.l5 l5Var2 = ((rn) this.I).f;
                if (l5Var2 != null) {
                    l5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.x8) this.I).invalidate();
                break;
            case 8:
                if (!ch.f0.b(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 9:
                hi.l5 l5Var3 = ((f50) this.I).e;
                if (l5Var3 != null) {
                    l5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            case 10:
                hi.l5 l5Var4 = ((pc0) this.I).h;
                if (l5Var4 != null) {
                    l5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                break;
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }
}
