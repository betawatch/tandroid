package org.telegram.ui.Components;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ev extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ mv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(mv mvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = mvVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.u.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mv mvVar = this.r;
        boolean z10 = mvVar.n;
        kv kvVar = mvVar.G;
        for (Map.Entry entry : mvVar.H.entrySet()) {
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
        if (mvVar.s == null) {
            mvVar.s = new t5(this, 350L, gr.h);
        }
        float e = mvVar.s.e(false, mvVar.r ? 1.0f : 0.0f);
        int floor = (int) Math.floor(mvVar.K);
        int ceil = (int) Math.ceil(mvVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f7 = mvVar.K - floor;
        RectF rectF3 = this.e;
        org.telegram.messenger.i0.Z1(rectF, rectF2, f7, rectF3);
        float l4 = kvVar != null ? 1.0f - Utilities.l(Math.abs(mvVar.K - ((mvVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = mvVar.L;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float C = c3.i0.C(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float D = c3.i0.D(f11, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - C, rectF3.centerY() - D, rectF3.centerX() + C, rectF3.centerY() + D);
        float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(8.0f, 16.0f, l4));
        int k10 = mvVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) c3.i0.D(l4, 0.5f, 1.0f, paint.getAlpha() * e));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e));
        }
        Path path = this.f;
        path.rewind();
        boolean z11 = this.n;
        float height = z11 ? rectF3.height() / 2.0f : L;
        if (z11) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height, L, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.i0.N(16.0f), org.telegram.messenger.i0.N(16.0f), direction);
            paint.setColor(mvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (kvVar != null) {
            path.addCircle(org.telegram.messenger.i0.L(15.0f) + kvVar.getLeft(), (kvVar.getBottom() + kvVar.getTop()) / 2.0f, org.telegram.messenger.i0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.G) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        mv mvVar = this.r;
        iv ivVar = mvVar.F;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!mvVar.W ? 1 : 0)) - (!mvVar.b0 ? 1 : 0);
            int A = (int) (org.telegram.messenger.z20.A(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!mvVar.W ? 1 : 0) + (!mvVar.b0 ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + A + paddingLeft;
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i16 = 0;
        while (true) {
            int childCount2 = getChildCount();
            hVar = this.a;
            if (i16 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i16);
            if (childAt2 != ivVar && !mvVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof iv;
                Long l4 = null;
                if (z11) {
                    iv ivVar2 = (iv) childAt2;
                    Long l10 = ivVar2.a;
                    if (l10 == null) {
                        ix ixVar = ivVar2.w;
                        if (ixVar == null || (stickerSet = ixVar.b) == null) {
                            l10 = ivVar2.r;
                            if (l10 == null) {
                                TLRPC.Document document = ivVar2.s;
                                if (document != null) {
                                    l4 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l4 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l4 = l10;
                } else if (childAt2 instanceof kv) {
                    l4 = Long.valueOf(((kv) childAt2).h);
                }
                if (mvVar.O && z11) {
                    iv ivVar3 = (iv) childAt2;
                    if (ivVar3.b) {
                        ivVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(sg.e0.d() ? 0L : 200L).setInterpolator(gr.h).start();
                    }
                }
                if (l4 != null) {
                    Integer num = (Integer) hVar.f(l4.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < org.telegram.messenger.i0.L(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(gr.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l4.longValue());
                }
                if ((childAt2 != mvVar.D || mvVar.W) && (childAt2 != mvVar.E || mvVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.m5.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (ivVar != null) {
            Long l11 = ivVar.a;
            if (getPaddingRight() + ivVar.getMeasuredWidth() + paddingLeft2 <= mvVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - ivVar.getMeasuredWidth();
                ivVar.layout(paddingLeft2, i14 - (ivVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (ivVar.getMeasuredHeight() / 2) + i14);
            } else {
                ivVar.layout(paddingLeft2, i14 - (ivVar.getMeasuredHeight() / 2), ivVar.getMeasuredWidth() + paddingLeft2, (ivVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    ivVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft2);
                    ivVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        iv ivVar;
        iv ivVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        mv mvVar = this.r;
        float f7 = 0.0f;
        int alpha = paddingRight - ((int) ((mvVar.W || (ivVar2 = mvVar.D) == null) ? 0.0f : ivVar2.getAlpha() * org.telegram.messenger.i0.L(33.0f)));
        if (!mvVar.b0 && (ivVar = mvVar.E) != null) {
            f7 = ivVar.getAlpha() * org.telegram.messenger.i0.L(33.0f);
        }
        int i12 = alpha - ((int) f7);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i11);
                i12 = childAt.getMeasuredWidth() + (i13 + 1 < getChildCount() ? org.telegram.messenger.i0.L(3.0f) : 0) + i12;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getSize(i11));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }
}
