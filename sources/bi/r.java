package bi;

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
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends HorizontalScrollView {
    public ai.n a;
    public b0 b;
    public final s51 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ h0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h0 h0Var, Context context) {
        super(context);
        this.h = h0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        s51 s51Var = new s51(2, context, this);
        this.c = s51Var;
        s51Var.setOrientation(0);
        s51Var.setGravity(16);
        s51Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(s51Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i3, boolean z10) {
        if (i3 == this.e || i3 < 0) {
            return;
        }
        s51 s51Var = this.c;
        if (i3 >= s51Var.getChildCount()) {
            return;
        }
        this.e = i3;
        if (!z10) {
            this.f = Float.NaN;
        }
        View childAt = s51Var.getChildAt(i3);
        int left = childAt.getLeft() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(30.0f) + childAt.getRight();
        if (left >= getScrollX()) {
            if (L > getWidth() + getScrollX()) {
                if (z10) {
                    smoothScrollTo(L - getWidth(), 0);
                } else {
                    scrollTo(L - getWidth(), 0);
                }
            }
        } else if (z10) {
            smoothScrollTo(left, 0);
        } else {
            scrollTo(left, 0);
        }
        s51Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        b0 b0Var;
        ai.n nVar = this.a;
        if (nVar != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            j0 j0Var = (j0) nVar.b;
            r rVar = (r) nVar.c;
            RectF rectF = j0Var.n0;
            int[] iArr = j0Var.l0;
            int[] iArr2 = j0Var.j0;
            Path path = j0Var.m0;
            RectF rectF2 = j0Var.i0;
            if (j0Var.a0 != null && j0Var.d != null) {
                float f11 = j0Var.b0;
                f10 = 2.0f;
                rectF2.set(scrollX + f11, j0Var.c0 + 0.0f, width - f11, height - j0Var.d0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                rVar.getLocationOnScreen(iArr2);
                j0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, rVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f12 = 1.0f / max;
                canvas.scale(f12, f12);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                a1 a1Var = j0Var.d;
                int i3 = iArr2[0];
                int i10 = iArr[0];
                int i11 = iArr2[1];
                int i12 = iArr[1];
                Paint paint = a1Var.A1;
                paint.setColor(a1Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (j0Var.o0 == null) {
                    j0Var.o0 = new Paint(1);
                }
                Paint paint2 = j0Var.o0;
                y0 y0Var = j0Var.d.n;
                paint2.setColor(y0Var != null ? y0Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, j0Var.o0);
                super.draw(canvas);
                b0Var = this.b;
                if (b0Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    j0 j0Var2 = b0Var.a;
                    RectF rectF3 = j0Var2.q0;
                    float f13 = j0Var2.b0;
                    rectF3.set(scrollX2 + f13, 0.0f + j0Var2.c0, width2 - f13, height2 - j0Var2.d0);
                    j0Var2.p0.a(rectF3.height() / f10, 1.0f, 0, canvas, rectF3);
                    return;
                }
                return;
            }
        }
        f10 = 2.0f;
        super.draw(canvas);
        b0Var = this.b;
        if (b0Var == null) {
        }
    }

    public void setSections(ArrayList<o> arrayList) {
        s51 s51Var = this.c;
        s51Var.removeAllViews();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            o oVar = arrayList.get(i3);
            Context context = getContext();
            int i10 = oVar.a;
            p pVar = new p(this.h, context, i10, i10 == 2 ? (TLRPC.Document) oVar.c.get(0) : null);
            pVar.setOnClickListener(new q(this, i3, 0));
            pVar.setContentDescription(oVar.b);
            s51Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
