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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zv;
import org.telegram.ui.cf0;
import org.telegram.ui.i70;
import org.telegram.ui.ld;
import org.telegram.ui.so;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class y5 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.w9
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
                    ((a6) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.H;
                y5 y5Var = j7Var.b;
                float currentAlpha = y5Var.getImageReceiver().hasBitmapImage() ? 1.0f - y5Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                j7Var.d.setAlpha(currentAlpha);
                j7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.H;
                org.telegram.ui.Cells.m6 m6Var = bbVar.T;
                if (!bbVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(bbVar.U, canvas, this.a, m6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) this.H;
                Object obj = fbVar.h;
                if ((obj instanceof yi1) || (obj instanceof zi1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, fbVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), fbVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), fbVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, fbVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (fbVar.e) {
                    fbVar.n.r.setColor(org.telegram.ui.ActionBar.h6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), fbVar.n.r);
                    Drawable drawable = fbVar.n.v;
                    drawable.setBounds(ul.x(2, measuredWidth, drawable), ul.e(2, measuredHeight, fbVar.n.v), ul.B(2, measuredWidth, fbVar.n.v), ul.z(2, measuredHeight, fbVar.n.v));
                    fbVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 11:
                if (!((org.telegram.ui.web.b1) this.H).v) {
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
                if (!((org.telegram.ui.Cells.bb) this.H).T.a(motionEvent, this)) {
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
                return drawable == ((hg.f1) this.H).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(org.telegram.ui.web.b1 b1Var, Context context) {
        super(context);
        this.G = 11;
        this.H = b1Var;
        this.a = new l4(this, this, 6);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 5:
                ci.r6 r6Var = ((ld) this.H).f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                ci.r6 r6Var2 = ((so) this.H).f;
                if (r6Var2 != null) {
                    r6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate();
                    ((zv) this.H).f();
                    break;
                }
                break;
            case 9:
                ci.r6 r6Var3 = ((i70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                ci.r6 r6Var4 = ((cf0) this.H).h;
                if (r6Var4 != null) {
                    r6Var4.invalidate();
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
                ci.r6 r6Var = ((ld) this.H).f;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 6:
                ci.r6 r6Var2 = ((so) this.H).f;
                if (r6Var2 != null) {
                    r6Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 7:
                super.invalidate(i10, i11, i12, i13);
                ((org.telegram.ui.Components.d9) this.H).invalidate();
                break;
            case 8:
                if (!zg.f0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                ci.r6 r6Var3 = ((i70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                ci.r6 r6Var4 = ((cf0) this.H).h;
                if (r6Var4 != null) {
                    r6Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
