package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zv;
import org.telegram.ui.fj1;
import org.telegram.ui.gj1;
import org.telegram.ui.jf0;
import org.telegram.ui.l70;
import org.telegram.ui.md;
import org.telegram.ui.uo;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class z5 extends org.telegram.ui.Components.v9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.v9
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new l4(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.c9) this.H).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((b6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.H;
                z5 z5Var = l7Var.b;
                float currentAlpha = z5Var.getImageReceiver().hasBitmapImage() ? 1.0f - z5Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                l7Var.d.setAlpha(currentAlpha);
                l7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) this.H;
                org.telegram.ui.Cells.n6 n6Var = abVar.T;
                if (!abVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    n6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(abVar.U, canvas, this.a, n6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.H;
                Object obj = ebVar.h;
                if ((obj instanceof fj1) || (obj instanceof gj1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, ebVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), ebVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), ebVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, ebVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (ebVar.e) {
                    ebVar.n.r.setColor(org.telegram.ui.ActionBar.j6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), ebVar.n.r);
                    Drawable drawable = ebVar.n.v;
                    drawable.setBounds(rk.y(2, measuredWidth, drawable), rk.d(2, measuredHeight, ebVar.n.v), org.telegram.ui.Cells.c1.d(2, measuredWidth, ebVar.n.v), rk.A(2, measuredHeight, ebVar.n.v));
                    ebVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.d1) this.H).v) {
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
                if (!((org.telegram.ui.Cells.ab) this.H).T.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 1:
                return drawable == ((hg.e1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(org.telegram.ui.web.d1 d1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = d1Var;
        this.a = new l4(this, this, 6);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.s6 s6Var = ((md) this.H).f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                ci.s6 s6Var2 = ((uo) this.H).f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.c9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate();
                    ((zv) this.H).f();
                    break;
                }
                break;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                ci.s6 s6Var4 = ((jf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
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
                ci.s6 s6Var = ((md) this.H).f;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                ci.s6 s6Var2 = ((uo) this.H).f;
                if (s6Var2 != null) {
                    s6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.c9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                ci.s6 s6Var3 = ((l70) this.H).e;
                if (s6Var3 != null) {
                    s6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                ci.s6 s6Var4 = ((jf0) this.H).h;
                if (s6Var4 != null) {
                    s6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
