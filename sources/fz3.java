// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz3 extends LinearLayout {
    public final vh6 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ mz3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz3(mz3 mz3Var, Context context, boolean z, boolean z2) {
        super(context);
        this.r = mz3Var;
        this.h = z;
        this.n = z2;
        this.a = new vh6();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i) {
        View childAt = getChildAt(pqe.b(i, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        mz3 mz3Var = this.r;
        boolean z = mz3Var.h;
        lz3 lz3Var = mz3Var.G;
        for (Map.Entry entry : mz3Var.H.entrySet()) {
            View view = (View) entry.getKey();
            if (view != null) {
                Rect rect = (Rect) entry.getValue();
                canvas.save();
                canvas.translate(rect.left, rect.top);
                canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                view.draw(canvas);
                canvas.restore();
            }
        }
        ln lnVar = mz3Var.r;
        if (lnVar == null) {
            lnVar = new ln(350L, this, d53.h);
            mz3Var.r = lnVar;
        }
        float e = lnVar.e(false, mz3Var.n ? 1.0f : 0.0f);
        int floor = (int) Math.floor(mz3Var.K);
        int ceil = (int) Math.ceil(mz3Var.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f2 = mz3Var.K - floor;
        RectF rectF3 = this.e;
        gm.X1(rectF, rectF2, f2, rectF3);
        float l = lz3Var != null ? 1.0f - Utilities.l(Math.abs(mz3Var.K - ((mz3Var.E != null ? 1 : 0) + 1))) : 0.0f;
        float f3 = mz3Var.L;
        float f4 = (1.0f - f3) * 4.0f * f3;
        float A = mlb.A(f4, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = mlb.B(f4, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float L = gm.L(gm.R1(8.0f, 16.0f, l));
        int k = mz3Var.k();
        Paint paint = this.b;
        paint.setColor(k);
        if (z) {
            paint.setAlpha((int) mlb.B(l, 0.5f, 1.0f, paint.getAlpha() * e));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e));
        }
        Path path = this.f;
        path.rewind();
        if (this.n) {
            float height = rectF3.height() / 2.0f;
            L = rectF3.height() / 2.0f;
            f = height;
        } else {
            f = L;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f, L, direction);
        canvas.drawPath(path, paint);
        if (z) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, gm.N(16.0f), gm.N(16.0f), direction);
            paint.setColor(mz3Var.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (lz3Var != null) {
            path.addCircle(gm.L(15.0f) + lz3Var.getLeft(), (lz3Var.getBottom() + lz3Var.getTop()) / 2.0f, gm.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.r.G) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vh6 vh6Var;
        TLRPC.StickerSet stickerSet;
        mz3 mz3Var = this.r;
        jz3 jz3Var = mz3Var.F;
        int i5 = (i4 - i2) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!mz3Var.W ? 1 : 0)) - (!mz3Var.b0 ? 1 : 0);
            int paddingLeft = (int) (((((i3 - i) - getPaddingLeft()) - getPaddingRight()) - (gm.L(30.0f) * childCount)) / Math.max(1, childCount - 1));
            int paddingLeft2 = getPaddingLeft();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt((!mz3Var.W ? 1 : 0) + (!mz3Var.b0 ? 1 : 0) + i6);
                if (childAt != null) {
                    childAt.layout(paddingLeft2, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft2, (childAt.getMeasuredHeight() / 2) + i5);
                    paddingLeft2 = childAt.getMeasuredWidth() + paddingLeft + paddingLeft2;
                }
            }
            return;
        }
        int paddingLeft3 = getPaddingLeft();
        int i7 = 0;
        while (true) {
            int childCount2 = getChildCount();
            vh6Var = this.a;
            if (i7 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i7);
            if (childAt2 != jz3Var && !mz3Var.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft3, i5 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft3, (childAt2.getMeasuredHeight() / 2) + i5);
                boolean z2 = childAt2 instanceof jz3;
                Long l = null;
                if (z2) {
                    jz3 jz3Var2 = (jz3) childAt2;
                    Long l2 = jz3Var2.a;
                    if (l2 == null) {
                        s14 s14Var = jz3Var2.w;
                        if (s14Var == null || (stickerSet = s14Var.b) == null) {
                            l2 = jz3Var2.r;
                            if (l2 == null) {
                                TLRPC.Document document = jz3Var2.s;
                                if (document != null) {
                                    l = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l = Long.valueOf(stickerSet.id);
                        }
                    }
                    l = l2;
                } else if (childAt2 instanceof lz3) {
                    l = Long.valueOf(((lz3) childAt2).h);
                }
                if (mz3Var.O && z2) {
                    jz3 jz3Var3 = (jz3) childAt2;
                    if (jz3Var3.b) {
                        jz3Var3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(oi5.d() ? 0L : 200L).setInterpolator(d53.h).start();
                    }
                }
                if (l != null) {
                    Integer num = (Integer) vh6Var.f(l.longValue());
                    if (num != null && num.intValue() != paddingLeft3 && Math.abs(num.intValue() - paddingLeft3) < gm.L(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft3);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(d53.h).start();
                    }
                    vh6Var.k(Integer.valueOf(paddingLeft3), l.longValue());
                }
                if ((childAt2 != mz3Var.y || mz3Var.W) && (childAt2 != mz3Var.E || mz3Var.b0)) {
                    paddingLeft3 = hg9.v(3.0f, childAt2.getMeasuredWidth(), paddingLeft3);
                }
            }
            i7++;
        }
        if (jz3Var != null) {
            Long l3 = jz3Var.a;
            if (getPaddingRight() + jz3Var.getMeasuredWidth() + paddingLeft3 <= mz3Var.getMeasuredWidth()) {
                int i8 = i3 - i;
                paddingLeft3 = (i8 - getPaddingRight()) - jz3Var.getMeasuredWidth();
                jz3Var.layout(paddingLeft3, i5 - (jz3Var.getMeasuredHeight() / 2), i8 - getPaddingRight(), (jz3Var.getMeasuredHeight() / 2) + i5);
            } else {
                jz3Var.layout(paddingLeft3, i5 - (jz3Var.getMeasuredHeight() / 2), jz3Var.getMeasuredWidth() + paddingLeft3, (jz3Var.getMeasuredHeight() / 2) + i5);
            }
            if (l3 != null) {
                if (vh6Var.f(l3.longValue()) != null && ((Integer) vh6Var.f(l3.longValue())).intValue() != paddingLeft3) {
                    jz3Var.setTranslationX(((Integer) vh6Var.f(l3.longValue())).intValue() - paddingLeft3);
                    jz3Var.animate().translationX(0.0f).setDuration(350L).start();
                }
                vh6Var.k(Integer.valueOf(paddingLeft3), l3.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        jz3 jz3Var;
        jz3 jz3Var2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        mz3 mz3Var = this.r;
        float f = 0.0f;
        int alpha = paddingRight - ((int) ((mz3Var.W || (jz3Var2 = mz3Var.y) == null) ? 0.0f : jz3Var2.getAlpha() * gm.L(33.0f)));
        if (!mz3Var.b0 && (jz3Var = mz3Var.E) != null) {
            f = jz3Var.getAlpha() * gm.L(33.0f);
        }
        int i3 = alpha - ((int) f);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                childAt.measure(-2047483649, i2);
                i3 = childAt.getMeasuredWidth() + (i4 + 1 < getChildCount() ? gm.L(3.0f) : 0) + i3;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }
}
