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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pv extends LinearLayout {
    public final a0.h a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ xv r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(xv xvVar, Context context, boolean z4, boolean z10) {
        super(context);
        this.r = xvVar;
        this.h = z4;
        this.n = z10;
        this.a = new a0.h();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(k7.n.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xv xvVar = this.r;
        boolean z4 = xvVar.n;
        vv vvVar = xvVar.D;
        for (Map.Entry entry : xvVar.E.entrySet()) {
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
        if (xvVar.s == null) {
            xvVar.s = new z5(this, 350L, nr.h);
        }
        float d = xvVar.s.d(xvVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(xvVar.H);
        int ceil = (int) Math.ceil(xvVar.H);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f10 = xvVar.H - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float clamp01 = vvVar != null ? 1.0f - Utilities.clamp01(Math.abs(xvVar.H - ((xvVar.B != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = xvVar.I;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float y10 = e2.c.y(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f12 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - y10, rectF3.centerY() - height, rectF3.centerX() + y10, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = xvVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z4) {
            paint.setAlpha((int) ((1.0f - (clamp01 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f;
        path.rewind();
        boolean z10 = this.n;
        float height2 = z10 ? rectF3.height() / 2.0f : dp;
        if (z10) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height2, dp, direction);
        canvas.drawPath(path, paint);
        if (z4) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(xvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (vvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + vvVar.getLeft(), (vvVar.getBottom() + vvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.r.D) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        xv xvVar = this.r;
        tv tvVar = xvVar.C;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!xvVar.T ? 1 : 0)) - (!xvVar.V ? 1 : 0);
            int z10 = (int) (org.telegram.ui.b.z(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!xvVar.T ? 1 : 0) + (!xvVar.V ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + z10 + paddingLeft;
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
            if (childAt2 != tvVar && !xvVar.E.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof tv;
                Long l10 = null;
                if (z11) {
                    tv tvVar2 = (tv) childAt2;
                    Long l11 = tvVar2.a;
                    if (l11 == null) {
                        vx vxVar = tvVar2.v;
                        if (vxVar == null || (stickerSet = vxVar.b) == null) {
                            l11 = tvVar2.r;
                            if (l11 == null) {
                                TLRPC.Document document = tvVar2.s;
                                if (document != null) {
                                    l10 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l10 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l10 = l11;
                } else if (childAt2 instanceof vv) {
                    l10 = Long.valueOf(((vv) childAt2).h);
                }
                if (xvVar.L && z11) {
                    tv tvVar3 = (tv) childAt2;
                    if (tvVar3.b) {
                        tvVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(mg.g0.d() ? 0L : 200L).setInterpolator(nr.h).start();
                    }
                }
                if (l10 != null) {
                    Integer num = (Integer) hVar.f(l10.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(nr.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), l10.longValue());
                }
                if ((childAt2 != xvVar.y || xvVar.T) && (childAt2 != xvVar.B || xvVar.V)) {
                    paddingLeft2 = org.telegram.messenger.y3.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (tvVar != null) {
            Long l12 = tvVar.a;
            if (getPaddingRight() + tvVar.getMeasuredWidth() + paddingLeft2 <= xvVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - tvVar.getMeasuredWidth();
                tvVar.layout(paddingLeft2, i14 - (tvVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (tvVar.getMeasuredHeight() / 2) + i14);
            } else {
                tvVar.layout(paddingLeft2, i14 - (tvVar.getMeasuredHeight() / 2), tvVar.getMeasuredWidth() + paddingLeft2, (tvVar.getMeasuredHeight() / 2) + i14);
            }
            if (l12 != null) {
                if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft2) {
                    tvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft2);
                    tvVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l12.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        tv tvVar;
        tv tvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        xv xvVar = this.r;
        float f10 = 0.0f;
        int alpha = paddingRight - ((int) ((xvVar.T || (tvVar2 = xvVar.y) == null) ? 0.0f : tvVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!xvVar.V && (tvVar = xvVar.B) != null) {
            f10 = tvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i12 = alpha - ((int) f10);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i11);
                i12 = childAt.getMeasuredWidth() + (i13 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + i12;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getSize(i11));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }
}
