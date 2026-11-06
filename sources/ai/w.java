package ai;

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
import org.telegram.ui.c61;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w extends HorizontalScrollView {
    public ab.g a;
    public j0 b;
    public final c61 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ q0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q0 q0Var, Context context) {
        super(context);
        this.h = q0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        c61 c61Var = new c61(1, context, this);
        this.c = c61Var;
        c61Var.setOrientation(0);
        c61Var.setGravity(16);
        c61Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        addView(c61Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i7, boolean z9) {
        if (i7 == this.e || i7 < 0) {
            return;
        }
        c61 c61Var = this.c;
        if (i7 >= c61Var.getChildCount()) {
            return;
        }
        this.e = i7;
        if (!z9) {
            this.f = Float.NaN;
        }
        View childAt = c61Var.getChildAt(i7);
        int left = childAt.getLeft() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(30.0f) + childAt.getRight();
        if (left >= getScrollX()) {
            if (L > getWidth() + getScrollX()) {
                if (z9) {
                    smoothScrollTo(L - getWidth(), 0);
                } else {
                    scrollTo(L - getWidth(), 0);
                }
            }
        } else if (z9) {
            smoothScrollTo(left, 0);
        } else {
            scrollTo(left, 0);
        }
        c61Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        j0 j0Var;
        ab.g gVar = this.a;
        if (gVar != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            s0 s0Var = (s0) gVar.b;
            w wVar = (w) gVar.c;
            RectF rectF = s0Var.m0;
            int[] iArr = s0Var.k0;
            int[] iArr2 = s0Var.i0;
            Path path = s0Var.l0;
            RectF rectF2 = s0Var.h0;
            if (s0Var.Z != null && s0Var.d != null) {
                float f11 = s0Var.a0;
                f10 = 2.0f;
                rectF2.set(scrollX + f11, s0Var.b0 + 0.0f, width - f11, height - s0Var.c0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                wVar.getLocationOnScreen(iArr2);
                s0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, wVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f12 = 1.0f / max;
                canvas.scale(f12, f12);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                l1 l1Var = s0Var.d;
                int i7 = iArr2[0];
                int i10 = iArr[0];
                int i11 = iArr2[1];
                int i12 = iArr[1];
                Paint paint = l1Var.z1;
                paint.setColor(l1Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (s0Var.n0 == null) {
                    s0Var.n0 = new Paint(1);
                }
                Paint paint2 = s0Var.n0;
                j1 j1Var = s0Var.d.n;
                paint2.setColor(j1Var != null ? j1Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, s0Var.n0);
                super.draw(canvas);
                j0Var = this.b;
                if (j0Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    s0 s0Var2 = j0Var.a;
                    RectF rectF3 = s0Var2.p0;
                    float f13 = s0Var2.a0;
                    rectF3.set(scrollX2 + f13, 0.0f + s0Var2.b0, width2 - f13, height2 - s0Var2.c0);
                    s0Var2.o0.a(rectF3.height() / f10, 1.0f, 0, canvas, rectF3);
                    return;
                }
                return;
            }
        }
        f10 = 2.0f;
        super.draw(canvas);
        j0Var = this.b;
        if (j0Var == null) {
        }
    }

    public void setSections(ArrayList<t> arrayList) {
        c61 c61Var = this.c;
        c61Var.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            t tVar = arrayList.get(i7);
            Context context = getContext();
            int i10 = tVar.a;
            u uVar = new u(this.h, context, i10, i10 == 2 ? (TLRPC.Document) tVar.c.get(0) : null);
            uVar.setOnClickListener(new v(this, i7, 0));
            uVar.setContentDescription(tVar.b);
            c61Var.addView(uVar, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
