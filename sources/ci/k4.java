package ci;

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
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.gw;
import org.telegram.ui.io;
import org.telegram.ui.md;
import org.telegram.ui.ne0;
import org.telegram.ui.s60;
import org.telegram.ui.sh1;
import org.telegram.ui.th1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class k4 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new g3(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
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
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((m4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.H;
                k4 k4Var = i7Var.b;
                float currentAlpha = k4Var.getImageReceiver().hasBitmapImage() ? 1.0f - k4Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                i7Var.d.setAlpha(currentAlpha);
                i7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                va vaVar = (va) this.H;
                org.telegram.ui.Cells.l6 l6Var = vaVar.T;
                if (!vaVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    d8.h(vaVar.U, canvas, this.a, l6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                za zaVar = (za) this.H;
                Object obj = zaVar.h;
                if ((obj instanceof sh1) || (obj instanceof th1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, zaVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), zaVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), zaVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, zaVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (zaVar.e) {
                    zaVar.n.r.setColor(org.telegram.ui.ActionBar.h6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), zaVar.n.r);
                    Drawable drawable = zaVar.n.v;
                    drawable.setBounds(org.telegram.ui.Cells.c1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.f(2, measuredHeight, zaVar.n.v), org.telegram.ui.Cells.c1.B(2, measuredWidth, zaVar.n.v), org.telegram.ui.Cells.c1.A(2, measuredHeight, zaVar.n.v));
                    zaVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.a1) this.H).v) {
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
                if (!((va) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((ig.d1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(org.telegram.ui.web.a1 a1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = a1Var;
        this.a = new g3(this, this, 7);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                ei.g6 g6Var = ((md) this.H).f;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                ei.g6 g6Var2 = ((io) this.H).f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                break;
            case 8:
                if (!ah.x0.b(this)) {
                    super.invalidate();
                    ((gw) this.H).f();
                    break;
                }
                break;
            case 9:
                ei.g6 g6Var3 = ((s60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                ei.g6 g6Var4 = ((ne0) this.H).h;
                if (g6Var4 != null) {
                    g6Var4.invalidate();
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
                ei.g6 g6Var = ((md) this.H).f;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                ei.g6 g6Var2 = ((io) this.H).f;
                if (g6Var2 != null) {
                    g6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                break;
            case 8:
                if (!ah.x0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                ei.g6 g6Var3 = ((s60) this.H).e;
                if (g6Var3 != null) {
                    g6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                ei.g6 g6Var4 = ((ne0) this.H).h;
                if (g6Var4 != null) {
                    g6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
