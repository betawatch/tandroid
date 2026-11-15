package ci;

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
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r extends HorizontalScrollView {
    public ab.g a;
    public b0 b;
    public final z51 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ g0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g0 g0Var, Context context) {
        super(context);
        this.h = g0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        z51 z51Var = new z51(2, context, this);
        this.c = z51Var;
        z51Var.setOrientation(0);
        z51Var.setGravity(16);
        z51Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(z51Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i7, boolean z10) {
        if (i7 == this.e || i7 < 0) {
            return;
        }
        z51 z51Var = this.c;
        if (i7 >= z51Var.getChildCount()) {
            return;
        }
        this.e = i7;
        if (!z10) {
            this.f = Float.NaN;
        }
        View childAt = z51Var.getChildAt(i7);
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
        z51Var.invalidate();
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
        ab.g gVar = this.a;
        if (gVar != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            i0 i0Var = (i0) gVar.b;
            r rVar = (r) gVar.c;
            RectF rectF = i0Var.n0;
            int[] iArr = i0Var.l0;
            int[] iArr2 = i0Var.j0;
            Path path = i0Var.m0;
            RectF rectF2 = i0Var.i0;
            if (i0Var.a0 != null && i0Var.d != null) {
                float f11 = i0Var.b0;
                f10 = 2.0f;
                rectF2.set(scrollX + f11, i0Var.c0 + 0.0f, width - f11, height - i0Var.d0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                rVar.getLocationOnScreen(iArr2);
                i0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, rVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f12 = 1.0f / max;
                canvas.scale(f12, f12);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                z0 z0Var = i0Var.d;
                int i7 = iArr2[0];
                int i10 = iArr[0];
                int i11 = iArr2[1];
                int i12 = iArr[1];
                Paint paint = z0Var.A1;
                paint.setColor(z0Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (i0Var.o0 == null) {
                    i0Var.o0 = new Paint(1);
                }
                Paint paint2 = i0Var.o0;
                x0 x0Var = i0Var.d.n;
                paint2.setColor(x0Var != null ? x0Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, i0Var.o0);
                super.draw(canvas);
                b0Var = this.b;
                if (b0Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    i0 i0Var2 = b0Var.a;
                    RectF rectF3 = i0Var2.q0;
                    float f13 = i0Var2.b0;
                    rectF3.set(scrollX2 + f13, 0.0f + i0Var2.c0, width2 - f13, height2 - i0Var2.d0);
                    i0Var2.p0.a(rectF3.height() / f10, 1.0f, 0, canvas, rectF3);
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
        z51 z51Var = this.c;
        z51Var.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            o oVar = arrayList.get(i7);
            Context context = getContext();
            int i10 = oVar.a;
            p pVar = new p(this.h, context, i10, i10 == 2 ? (TLRPC.Document) oVar.c.get(0) : null);
            pVar.setOnClickListener(new q(this, i7, 0));
            pVar.setContentDescription(oVar.b);
            z51Var.addView(pVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
