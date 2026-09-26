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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zv;
import org.telegram.ui.bf0;
import org.telegram.ui.g70;
import org.telegram.ui.ld;
import org.telegram.ui.ro;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.H;
                y5 y5Var = k7Var.b;
                float currentAlpha = y5Var.getImageReceiver().hasBitmapImage() ? 1.0f - y5Var.getImageReceiver().getCurrentAlpha() : 1.0f;
                k7Var.d.setAlpha(currentAlpha);
                k7Var.a.setAlpha(currentAlpha);
                super.onDraw(canvas);
                break;
            case 3:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) this.H;
                org.telegram.ui.Cells.m6 m6Var = zaVar.T;
                if (!zaVar.F) {
                    super.onDraw(canvas);
                    break;
                } else {
                    m6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ia.h(zaVar.U, canvas, this.a, m6Var);
                    break;
                }
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.H;
                Object obj = dbVar.h;
                if ((obj instanceof yi1) || (obj instanceof zi1)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, dbVar.n.n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), dbVar.n.n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), dbVar.n.n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, dbVar.n.n);
                } else {
                    canvas2 = canvas;
                }
                if (dbVar.e) {
                    dbVar.n.r.setColor(org.telegram.ui.ActionBar.h6.c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(20.0f), dbVar.n.r);
                    Drawable drawable = dbVar.n.v;
                    drawable.setBounds(ok.z(2, measuredWidth, drawable), ok.d(2, measuredHeight, dbVar.n.v), org.telegram.ui.Cells.c1.t(2, measuredWidth, dbVar.n.v), org.telegram.ui.Cells.c1.d(2, measuredHeight, dbVar.n.v));
                    dbVar.n.v.draw(canvas2);
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
                if (!((org.telegram.ui.Cells.za) this.H).T.a(motionEvent, this)) {
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
                ci.r6 r6Var2 = ((ro) this.H).f;
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
                if (!zg.e0.b(this)) {
                    super.invalidate();
                    ((zv) this.H).f();
                    break;
                }
                break;
            case 9:
                ci.r6 r6Var3 = ((g70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate();
                break;
            case 10:
                ci.r6 r6Var4 = ((bf0) this.H).h;
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
                ci.r6 r6Var2 = ((ro) this.H).f;
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
                if (!zg.e0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 9:
                ci.r6 r6Var3 = ((g70) this.H).e;
                if (r6Var3 != null) {
                    r6Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                break;
            case 10:
                ci.r6 r6Var4 = ((bf0) this.H).h;
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
