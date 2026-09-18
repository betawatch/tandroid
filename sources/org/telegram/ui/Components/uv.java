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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class uv extends LinearLayout {
    public final a0.i a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final Path f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ cw r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(cw cwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.r = cwVar;
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
        View childAt = getChildAt(w7.q.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cw cwVar = this.r;
        boolean z10 = cwVar.n;
        aw awVar = cwVar.G;
        for (Map.Entry entry : cwVar.H.entrySet()) {
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
        if (cwVar.s == null) {
            cwVar.s = new e6(this, 350L, qr.h);
        }
        float d = cwVar.s.d(cwVar.r ? 1.0f : 0.0f, false);
        int floor = (int) Math.floor(cwVar.K);
        int ceil = (int) Math.ceil(cwVar.K);
        RectF rectF = this.c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, ceil);
        float f7 = cwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f7, rectF3);
        float clamp01 = awVar != null ? 1.0f - Utilities.clamp01(Math.abs(cwVar.K - ((cwVar.E != null ? 1 : 0) + 1))) : 0.0f;
        float f10 = cwVar.L;
        float f11 = (1.0f - f10) * 4.0f * f10;
        float B = com.google.android.gms.internal.vision.e2.B(f11, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f11 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, clamp01));
        int k10 = cwVar.k();
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
            paint.setColor(cwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (awVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + awVar.getLeft(), (awVar.getBottom() + awVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
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
        cw cwVar = this.r;
        yv yvVar = cwVar.F;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!cwVar.W ? 1 : 0)) - (!cwVar.b0 ? 1 : 0);
            int B = (int) (org.telegram.messenger.wh.B(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!cwVar.W ? 1 : 0) + (!cwVar.b0 ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + B + paddingLeft;
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
            if (childAt2 != yvVar && !cwVar.H.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof yv;
                Long l4 = null;
                if (z11) {
                    yv yvVar2 = (yv) childAt2;
                    Long l10 = yvVar2.a;
                    if (l10 == null) {
                        xx xxVar = yvVar2.v;
                        if (xxVar == null || (stickerSet = xxVar.b) == null) {
                            l10 = yvVar2.r;
                            if (l10 == null) {
                                TLRPC.Document document = yvVar2.s;
                                if (document != null) {
                                    l4 = Long.valueOf(document.id);
                                }
                            }
                        } else {
                            l4 = Long.valueOf(stickerSet.id);
                        }
                    }
                    l4 = l10;
                } else if (childAt2 instanceof aw) {
                    l4 = Long.valueOf(((aw) childAt2).h);
                }
                if (cwVar.O && z11) {
                    yv yvVar3 = (yv) childAt2;
                    if (yvVar3.b) {
                        yvVar3.b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(zg.e0.d() ? 0L : 200L).setInterpolator(qr.h).start();
                    }
                }
                if (l4 != null) {
                    Integer num = (Integer) iVar.f(l4.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(qr.h).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft2), l4.longValue());
                }
                if ((childAt2 != cwVar.y || cwVar.W) && (childAt2 != cwVar.E || cwVar.b0)) {
                    paddingLeft2 = org.telegram.messenger.q.D(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (yvVar != null) {
            Long l11 = yvVar.a;
            if (getPaddingRight() + yvVar.getMeasuredWidth() + paddingLeft2 <= cwVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - yvVar.getMeasuredWidth();
                yvVar.layout(paddingLeft2, i14 - (yvVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (yvVar.getMeasuredHeight() / 2) + i14);
            } else {
                yvVar.layout(paddingLeft2, i14 - (yvVar.getMeasuredHeight() / 2), yvVar.getMeasuredWidth() + paddingLeft2, (yvVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    yvVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft2);
                    yvVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                iVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        yv yvVar;
        yv yvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, TLObject.FLAG_31);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        cw cwVar = this.r;
        float f7 = 0.0f;
        int alpha = paddingRight - ((int) ((cwVar.W || (yvVar2 = cwVar.y) == null) ? 0.0f : yvVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!cwVar.b0 && (yvVar = cwVar.E) != null) {
            f7 = yvVar.getAlpha() * AndroidUtilities.dp(33.0f);
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
