// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cz8 extends HorizontalScrollView {
    public m88 a;
    public kz8 b;
    public final oob c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ pz8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz8(pz8 pz8Var, Activity activity) {
        super(activity);
        this.h = pz8Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        oob oobVar = new oob((byte) 12, activity, this);
        this.c = oobVar;
        oobVar.setOrientation(0);
        oobVar.setGravity(16);
        oobVar.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        addView(oobVar, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i, boolean z) {
        if (i == this.e || i < 0) {
            return;
        }
        oob oobVar = this.c;
        if (i < oobVar.getChildCount()) {
            this.e = i;
            if (!z) {
                this.f = Float.NaN;
            }
            View childAt = oobVar.getChildAt(i);
            int left = childAt.getLeft() - hl.L(30.0f);
            int L = hl.L(30.0f) + childAt.getRight();
            if (left >= getScrollX()) {
                if (L > getWidth() + getScrollX()) {
                    if (z) {
                        smoothScrollTo(L - getWidth(), 0);
                    } else {
                        scrollTo(L - getWidth(), 0);
                    }
                }
            } else if (z) {
                smoothScrollTo(left, 0);
            } else {
                scrollTo(left, 0);
            }
            oobVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        kz8 kz8Var;
        m88 m88Var = this.a;
        if (m88Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            rz8 rz8Var = (rz8) m88Var.b;
            cz8 cz8Var = (cz8) m88Var.c;
            RectF rectF = rz8Var.n0;
            int[] iArr = rz8Var.l0;
            int[] iArr2 = rz8Var.j0;
            Path path = rz8Var.m0;
            RectF rectF2 = rz8Var.i0;
            if (rz8Var.a0 != null && rz8Var.d != null) {
                float f2 = rz8Var.b0;
                f = 2.0f;
                rectF2.set(scrollX + f2, rz8Var.c0 + 0.0f, width - f2, height - rz8Var.d0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                cz8Var.getLocationOnScreen(iArr2);
                rz8Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, cz8Var.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f3 = 1.0f / max;
                canvas.scale(f3, f3);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                f09 f09Var = rz8Var.d;
                int i = iArr2[0];
                int i2 = iArr[0];
                int i3 = iArr2[1];
                int i4 = iArr[1];
                Paint paint = f09Var.A1;
                paint.setColor(f09Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                Paint paint2 = rz8Var.o0;
                if (paint2 == null) {
                    paint2 = new Paint(1);
                    rz8Var.o0 = paint2;
                }
                d09 d09Var = rz8Var.d.n;
                paint2.setColor(d09Var != null ? d09Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, rz8Var.o0);
                super.draw(canvas);
                kz8Var = this.b;
                if (kz8Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    rz8 rz8Var2 = kz8Var.a;
                    RectF rectF3 = rz8Var2.q0;
                    float f4 = rz8Var2.b0;
                    rectF3.set(scrollX2 + f4, 0.0f + rz8Var2.c0, width2 - f4, height2 - rz8Var2.d0);
                    rz8Var2.p0.a(rectF3.height() / f, 1.0f, 0, canvas, rectF3);
                    return;
                }
                return;
            }
        }
        f = 2.0f;
        super.draw(canvas);
        kz8Var = this.b;
        if (kz8Var == null) {
        }
    }

    public void setSections(ArrayList<az8> arrayList) {
        oob oobVar = this.c;
        oobVar.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            az8 az8Var = arrayList.get(i);
            Context context = getContext();
            byte b = az8Var.a;
            bz8 bz8Var = new bz8(this.h, context, b, b == 2 ? (TLRPC.Document) az8Var.c.get(0) : null);
            bz8Var.setOnClickListener(new w0(this, i, (byte) 20));
            bz8Var.setContentDescription(az8Var.b);
            oobVar.addView(bz8Var, new LinearLayout.LayoutParams(hl.L(34.0f), hl.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
