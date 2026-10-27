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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x extends HorizontalScrollView {
    public f0 a;
    public p0 b;
    public final za1 c;
    public final Paint d;
    public int e;
    public float f;
    public final /* synthetic */ x0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(x0 x0Var, Context context) {
        super(context);
        this.h = x0Var;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = -1;
        this.f = Float.NaN;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFillViewport(true);
        setWillNotDraw(false);
        za1 za1Var = new za1(this, context, 1);
        this.c = za1Var;
        za1Var.setOrientation(0);
        za1Var.setGravity(16);
        za1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(za1Var, new FrameLayout.LayoutParams(-2, -1));
        paint.setColor(1560281087);
    }

    public final void a(int i10, boolean z10) {
        if (i10 == this.e || i10 < 0) {
            return;
        }
        za1 za1Var = this.c;
        if (i10 >= za1Var.getChildCount()) {
            return;
        }
        this.e = i10;
        if (!z10) {
            this.f = Float.NaN;
        }
        View childAt = za1Var.getChildAt(i10);
        int left = childAt.getLeft() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(30.0f) + childAt.getRight();
        if (left >= getScrollX()) {
            if (dp > getWidth() + getScrollX()) {
                if (z10) {
                    smoothScrollTo(dp - getWidth(), 0);
                } else {
                    scrollTo(dp - getWidth(), 0);
                }
            }
        } else if (z10) {
            smoothScrollTo(left, 0);
        } else {
            scrollTo(left, 0);
        }
        za1Var.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        p0 p0Var;
        f0 f0Var = this.a;
        if (f0Var != null) {
            float scrollX = getScrollX();
            float width = getWidth() + getScrollX();
            float height = getHeight();
            z0 z0Var = (z0) f0Var.b;
            x xVar = (x) f0Var.c;
            RectF rectF = z0Var.m0;
            int[] iArr = z0Var.k0;
            int[] iArr2 = z0Var.i0;
            Path path = z0Var.l0;
            RectF rectF2 = z0Var.h0;
            if (z0Var.Z != null && z0Var.d != null) {
                float f10 = z0Var.a0;
                f7 = 2.0f;
                rectF2.set(scrollX + f10, z0Var.b0 + 0.0f, width - f10, height - z0Var.c0);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, Path.Direction.CW);
                canvas.clipPath(path);
                xVar.getLocationOnScreen(iArr2);
                z0Var.d.getLocationOnScreen(iArr);
                float max = Math.max(0.01f, xVar.getScaleX());
                canvas.translate(scrollX, 0.0f);
                float f11 = 1.0f / max;
                canvas.scale(f11, f11);
                rectF.set((rectF2.left - scrollX) * max, (rectF2.top - 0.0f) * max, (rectF2.right - scrollX) * max, (rectF2.bottom - 0.0f) * max);
                t1 t1Var = z0Var.d;
                int i10 = iArr2[0];
                int i11 = iArr[0];
                int i12 = iArr2[1];
                int i13 = iArr[1];
                Paint paint = t1Var.z1;
                paint.setColor(t1Var.t0());
                canvas.drawRect(rectF, paint);
                canvas.restore();
                if (z0Var.n0 == null) {
                    z0Var.n0 = new Paint(1);
                }
                Paint paint2 = z0Var.n0;
                r1 r1Var = z0Var.d.n;
                paint2.setColor(r1Var != null ? r1Var.h : 872415231);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, z0Var.n0);
                super.draw(canvas);
                p0Var = this.b;
                if (p0Var == null) {
                    float scrollX2 = getScrollX();
                    float width2 = getWidth() + getScrollX();
                    float height2 = getHeight();
                    z0 z0Var2 = p0Var.a;
                    RectF rectF3 = z0Var2.p0;
                    float f12 = z0Var2.a0;
                    rectF3.set(scrollX2 + f12, 0.0f + z0Var2.b0, width2 - f12, height2 - z0Var2.c0);
                    z0Var2.o0.a(canvas, rectF3, rectF3.height() / f7, 0, 1.0f);
                    return;
                }
                return;
            }
        }
        f7 = 2.0f;
        super.draw(canvas);
        p0Var = this.b;
        if (p0Var == null) {
        }
    }

    public void setSections(ArrayList<u> arrayList) {
        za1 za1Var = this.c;
        za1Var.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u uVar = arrayList.get(i10);
            Context context = getContext();
            int i11 = uVar.a;
            v vVar = new v(this.h, context, i11, i11 == 2 ? (TLRPC.Document) uVar.c.get(0) : null);
            vVar.setOnClickListener(new w(this, i10, 0));
            vVar.setContentDescription(uVar.b);
            za1Var.addView(vVar, new LinearLayout.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(30.0f)));
        }
        this.e = -1;
        this.f = Float.NaN;
    }
}
