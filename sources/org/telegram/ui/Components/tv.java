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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tv extends LinearLayout {
    public final a0.i a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ bw r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(bw bwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = bwVar;
        this.h = z10;
        this.n = z11;
        this.a = new a0.i();
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.p.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bw bwVar = this.r;
        boolean z10 = bwVar.n;
        zv zvVar = bwVar.G;
        for (Map.Entry entry : bwVar.H.entrySet()) {
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
        if (bwVar.s == null) {
            bwVar.s = new e6(this, 350L, pr.h);
        }
        float d = bwVar.s.d(bwVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(bwVar.K);
        int ceil = (int) Math.ceil(bwVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f7 = bwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float clamp01 = zvVar != null ? 1.0f - Utilities.clamp01(Math.abs(bwVar.K - ((bwVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = bwVar.L;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float B = com.google.android.gms.internal.vision.e2.B(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f11 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = bwVar.k();
        Paint paint = this.b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (clamp01 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f;
        path.rewind();
        boolean z11 = this.n;
        float height2 = z11 ? rectF3.height() / 2.0f : dp;
        if (z11) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, height2, dp, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(bwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (zvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + zvVar.getLeft(), (zvVar.getBottom() + zvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.r.G) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipPath(this.f);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.i iVar;
        TLRPC.StickerSet stickerSet;
        bw bwVar = this.r;
        xv xvVar = bwVar.F;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!bwVar.W ? 1 : 0)) - (!bwVar.b0 ? 1 : 0);
            int A = (int) (org.telegram.messenger.wl.A(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!bwVar.W ? 1 : 0) + (!bwVar.b0 ? 1 : 0) + i15);
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
            iVar = this.a;
            if (i16 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i16);
            if (childAt2 != xvVar && !bwVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof xv;
                Long l4 = null;
                if (z11) {
                    xv xvVar2 = (xv) childAt2;
                    Long l10 = xvVar2.a;
                    if (l10 == null) {
                        xx xxVar = xvVar2.v;
                        if (xxVar == null || (stickerSet = xxVar.b) == null) {
                            l10 = xvVar2.r;
                            if (l10 == null) {
                                TLRPC.Document document = xvVar2.s;
                                if (document != null) {
                                    l4 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l4 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l4 = l10;
                } else if (childAt2 instanceof zv) {
                    l4 = Long.valueOf(((zv) childAt2).h);
                }
                if (bwVar.O && z11) {
                    xv xvVar3 = (xv) childAt2;
                    if (xvVar3.b) {
                        xvVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(ah.y0.d() ? 0L : 200L).setInterpolator(pr.h).start();
                    }
                }
                if (l4 != null) {
                    Integer num = (Integer) iVar.f(l4.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(pr.h).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft2), l4.longValue());
                }
                if ((childAt2 != bwVar.y || bwVar.W) && (childAt2 != bwVar.E || bwVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.w1.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (xvVar != null) {
            Long l11 = xvVar.a;
            if (getPaddingRight() + xvVar.getMeasuredWidth() + paddingLeft2 <= bwVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - xvVar.getMeasuredWidth();
                xvVar.layout(paddingLeft2, i14 - (xvVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (xvVar.getMeasuredHeight() / 2) + i14);
            } else {
                xvVar.layout(paddingLeft2, i14 - (xvVar.getMeasuredHeight() / 2), xvVar.getMeasuredWidth() + paddingLeft2, (xvVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    xvVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft2);
                    xvVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                iVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        xv xvVar;
        xv xvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        bw bwVar = this.r;
        float f7 = 0.0f;
        int alpha = paddingRight - ((int) ((bwVar.W || (xvVar2 = bwVar.y) == null) ? 0.0f : xvVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!bwVar.b0 && (xvVar = bwVar.E) != null) {
            f7 = xvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i12 = alpha - ((int) f7);
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
