package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.s7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.fb;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hf0;
import org.telegram.ui.k70;
import org.telegram.ui.kj1;
import org.telegram.ui.lj1;
import org.telegram.ui.nd;
import org.telegram.ui.yo;
import zh.a6;
import zh.x2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i1 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new h1(this, this, 0);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 6:
                super.invalidate(rect);
                ((c9) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 1:
                l7 l7Var = (l7) this.H;
                i1 i1Var = l7Var.b;
                float currentAlpha = i1Var.getImageReceiver().hasBitmapImage() ? 1.0f - i1Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                l7Var.d.setAlpha(currentAlpha);
                l7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                bb bbVar = (bb) this.H;
                n6 n6Var = bbVar.T;
                if (!bbVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    a6.h(bbVar.U, canvas, this.a, n6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                fb fbVar = (fb) this.H;
                Object obj = fbVar.h;
                if ((obj instanceof kj1) || (obj instanceof lj1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, fbVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), fbVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), fbVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, fbVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (fbVar.e) {
                    fbVar.n.r.setColor(j6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), fbVar.n.r);
                    Drawable drawable = fbVar.n.v;
                    drawable.setBounds(em.w(2, measuredWidth, drawable), em.e(2, measuredHeight, fbVar.n.v), em.B(2, measuredWidth, fbVar.n.v), em.z(2, measuredHeight, fbVar.n.v));
                    fbVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.c1) this.H).v) {
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
            case 11:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((x2) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
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
            case 2:
                if (!((bb) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 0:
                return drawable == ((k1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(org.telegram.ui.web.c1 c1Var, Context context) {
        super(context);
        this.G = 10;
        this.H = c1Var;
        this.a = new h1(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 4:
                s7 s7Var = ((nd) this.H).f;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                s7 s7Var2 = ((yo) this.H).f;
                if (s7Var2 != null) {
                    s7Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((c9) this.H).invalidate();
                break;
            case 7:
                if (!yg.f0.b(this)) {
                    super.invalidate();
                    ((cw) this.H).f();
                    break;
                }
                break;
            case 8:
                s7 s7Var3 = ((k70) this.H).e;
                if (s7Var3 != null) {
                    s7Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                s7 s7Var4 = ((hf0) this.H).h;
                if (s7Var4 != null) {
                    s7Var4.invalidate();
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
            case 4:
                s7 s7Var = ((nd) this.H).f;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 5:
                s7 s7Var2 = ((yo) this.H).f;
                if (s7Var2 != null) {
                    s7Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((c9) this.H).invalidate();
                break;
            case 7:
                if (!yg.f0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 8:
                s7 s7Var3 = ((k70) this.H).e;
                if (s7Var3 != null) {
                    s7Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 9:
                s7 s7Var4 = ((hf0) this.H).h;
                if (s7Var4 != null) {
                    s7Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
