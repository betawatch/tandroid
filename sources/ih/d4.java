package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.jv;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.qe0;
import org.telegram.ui.r60;
import org.telegram.ui.xh1;
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Components.o9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4(Object obj, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = obj;
    }

    @Override // org.telegram.ui.Components.o9
    public ImageReceiver c() {
        switch (this.C) {
            case 11:
                return new z2(this, this, 6);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 6:
                super.invalidate(rect);
                ((org.telegram.ui.Components.v8) this.D).invalidate();
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.C) {
            case 0:
                if (this.a.getVisible()) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((e4) this.D).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                break;
            case 1:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.D;
                d4 d4Var = i7Var.b;
                float currentAlpha = d4Var.getImageReceiver().hasBitmapImage() ? 1.0f - d4Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                i7Var.d.setAlpha(currentAlpha);
                i7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 2:
                va vaVar = (va) this.D;
                org.telegram.ui.Cells.l6 l6Var = vaVar.P;
                if (!vaVar.B) {
                    super.onDraw(canvas);
                    break;
                } else {
                    l6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    p7.h(vaVar.Q, canvas, this.a, l6Var);
                    break;
                }
            case 3:
                super.onDraw(canvas);
                ya yaVar = (ya) this.D;
                Object obj = yaVar.h;
                if ((obj instanceof xh1) || (obj instanceof yh1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, yaVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), yaVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), yaVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, yaVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (yaVar.e) {
                    yaVar.n.r.setColor(org.telegram.ui.ActionBar.f6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), yaVar.n.r);
                    Drawable drawable = yaVar.n.v;
                    drawable.setBounds(ll.x(2, measuredWidth, drawable), ll.e(2, measuredHeight, yaVar.n.v), ll.B(2, measuredWidth, yaVar.n.v), ll.z(2, measuredHeight, yaVar.n.v));
                    yaVar.n.v.draw(canvas2);
                    break;
                }
                break;
            case 10:
                if (!((org.telegram.ui.web.y0) this.D).v) {
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
    public void onMeasure(int i9, int i10) {
        switch (this.C) {
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.C) {
            case 2:
                if (!((va) this.D).P.a(motionEvent, this)) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.C) {
            case 11:
                return drawable == ((pf.w0) this.D).r || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(org.telegram.ui.web.y0 y0Var, Context context) {
        super(context);
        this.C = 10;
        this.D = y0Var;
        this.a = new z2(this, this, 5);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.C) {
            case 4:
                kh.h6 h6Var = ((id) this.D).f;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
                super.invalidate();
                break;
            case 5:
                kh.h6 h6Var2 = ((ho) this.D).f;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                super.invalidate();
                break;
            case 6:
                super.invalidate();
                ((org.telegram.ui.Components.v8) this.D).invalidate();
                break;
            case 7:
                if (!hg.h0.b(this)) {
                    super.invalidate();
                    ((jv) this.D).f();
                    break;
                }
                break;
            case 8:
                kh.h6 h6Var3 = ((r60) this.D).e;
                if (h6Var3 != null) {
                    h6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 9:
                kh.h6 h6Var4 = ((qe0) this.D).h;
                if (h6Var4 != null) {
                    h6Var4.invalidate();
                }
                super.invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.C) {
            case 4:
                kh.h6 h6Var = ((id) this.D).f;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                break;
            case 5:
                kh.h6 h6Var2 = ((ho) this.D).f;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                break;
            case 6:
                super.invalidate(i9, i10, i11, i12);
                ((org.telegram.ui.Components.v8) this.D).invalidate();
                break;
            case 7:
                if (!hg.h0.b(this)) {
                    super.invalidate(i9, i10, i11, i12);
                    break;
                }
                break;
            case 8:
                kh.h6 h6Var3 = ((r60) this.D).e;
                if (h6Var3 != null) {
                    h6Var3.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                break;
            case 9:
                kh.h6 h6Var4 = ((qe0) this.D).h;
                if (h6Var4 != null) {
                    h6Var4.invalidate();
                }
                super.invalidate(i9, i10, i11, i12);
                break;
            default:
                super.invalidate(i9, i10, i11, i12);
                break;
        }
    }
}
